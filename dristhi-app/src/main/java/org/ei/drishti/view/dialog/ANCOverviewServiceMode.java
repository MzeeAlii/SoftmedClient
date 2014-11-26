package org.ei.drishti.view.dialog;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.ei.drishti.Context;
import org.ei.drishti.R;
import org.ei.drishti.domain.ANCServiceType;
import org.ei.drishti.provider.SmartRegisterClientsProvider;
import org.ei.drishti.view.contract.*;
import org.ei.drishti.view.viewHolder.*;

import static android.view.View.VISIBLE;
import static org.ei.drishti.AllConstants.FormNames.ANC_VISIT;
import static org.ei.drishti.AllConstants.FormNames.IFA;
import static org.ei.drishti.AllConstants.FormNames.TT;
import static org.ei.drishti.view.activity.SecuredNativeSmartRegisterActivity.ClientsHeaderProvider;
import static org.ei.drishti.view.contract.AlertDTO.emptyAlert;

public class ANCOverviewServiceMode extends ServiceModeOption {

    private Drawable iconPencilDrawable;


    public ANCOverviewServiceMode(SmartRegisterClientsProvider provider) {
        super(provider);
    }

    @Override
    public String name() {
        return Context.getInstance().getStringResource(R.string.anc_service_mode_overview);
    }

    @Override
    public ClientsHeaderProvider getHeaderProvider() {
        return new ClientsHeaderProvider() {
            @Override
            public int count() {
                return 7;
            }

            @Override
            public int weightSum() {
                return 100;
            }

            @Override
            public int[] weights() {
                return new int[]{21, 9, 12, 12, 12, 12, 22};
            }

            @Override
            public int[] headerTextResourceIds() {
                return new int[]{
                        R.string.header_name, R.string.header_id, R.string.header_anc_status,
                        R.string.header_risk_factors, R.string.header_visits, R.string.header_tt, R.string.header_ifa};
            }
        };
    }

    @Override
    public void setupListView(ChildSmartRegisterClient client, NativeChildSmartRegisterViewHolder viewHolder, View.OnClickListener clientSectionClickListener) {

    }

    @Override
    public void setupListView(ANCSmartRegisterClient client,
                              NativeANCSmartRegisterViewHolder viewHolder,
                              View.OnClickListener clientSectionClickListener) {
        viewHolder.serviceModeOverviewView().setVisibility(VISIBLE);

        setupRiskFactorsView(client, viewHolder);
        setupANCVisitLayout(client, viewHolder);
        setupTTLayout(client, viewHolder);
        setupIFALayout(client, viewHolder);
        setupEditView(client, viewHolder, clientSectionClickListener);
    }

    private void setupRiskFactorsView(ANCSmartRegisterClient client, NativeANCSmartRegisterViewHolder viewHolder) {
        viewHolder.txtRiskFactors().setText(client.riskFactors());
    }

    @Override
    public void setupListView(FPSmartRegisterClient client, NativeFPSmartRegisterViewHolder viewHolder, View.OnClickListener clientSectionClickListener) {

    }

    @Override
    public void setupListView(PNCSmartRegisterClient client, NativePNCSmartRegisterViewHolder viewHolder, View.OnClickListener clientSectionClickListener) {

    }

    public void setupANCVisitLayout(ANCSmartRegisterClient client,
                                    NativeANCSmartRegisterViewHolder viewHolder) {
        if (client.isVisitsDone()) {
            viewHolder.txtANCVisitDoneOn().setVisibility(VISIBLE);
            viewHolder.txtANCVisitDoneOn().setText(client.visitDoneDateWithVisitName());
        } else {
            viewHolder.txtANCVisitDoneOn().setVisibility(View.INVISIBLE);
        }

        AlertDTO ancVisitAlert = client.getAlert(ANCServiceType.ANC_1);
        if (ancVisitAlert != emptyAlert) {
            viewHolder.btnAncVisitView().setVisibility(View.INVISIBLE);
            viewHolder.layoutANCVisitAlert().setVisibility(VISIBLE);
            viewHolder.layoutANCVisitAlert().setOnClickListener(launchForm(client, ancVisitAlert, ANC_VISIT));
            setAlertLayout(viewHolder.layoutANCVisitAlert(),
                    viewHolder.txtANCVisitDueType(),
                    viewHolder.txtANCVisitAlertDueOn(),
                    ancVisitAlert);
        } else {
            viewHolder.layoutANCVisitAlert().setVisibility(View.INVISIBLE);
            viewHolder.btnAncVisitView().setVisibility(View.INVISIBLE);
            viewHolder.btnAncVisitView().setOnClickListener(launchForm(client, ancVisitAlert, ANC_VISIT));
        }
    }

    public void setupTTLayout(ANCSmartRegisterClient client,
                                    NativeANCSmartRegisterViewHolder viewHolder) {
        if (client.isTTDone()) {
            viewHolder.txtTTDoneOn().setVisibility(VISIBLE);
            viewHolder.txtTTDoneOn().setText(client.ttDoneDate());
        } else {
            viewHolder.txtTTDoneOn().setVisibility(View.INVISIBLE);
        }

        AlertDTO ttAlert = client.getAlert(ANCServiceType.TT_1);
        if (ttAlert != emptyAlert) {
            viewHolder.btnTTView().setVisibility(View.INVISIBLE);
            viewHolder.layoutTTAlert().setVisibility(VISIBLE);
            viewHolder.layoutTTAlert().setOnClickListener(launchForm(client, ttAlert, TT));
            setAlertLayout(viewHolder.layoutTTAlert(),
                    viewHolder.txtTTDueType(),
                    viewHolder.txtTTDueOn(),
                    ttAlert);
        } else {
            viewHolder.layoutTTAlert().setVisibility(View.INVISIBLE);
            viewHolder.btnTTView().setVisibility(View.INVISIBLE);
            viewHolder.btnTTView().setOnClickListener(launchForm(client, ttAlert, TT));
        }
    }

    public void setupIFALayout(ANCSmartRegisterClient client,
                                    NativeANCSmartRegisterViewHolder viewHolder) {
        if (client.isIFADone()) {
            viewHolder.txtIFADoneOn().setVisibility(VISIBLE);
            viewHolder.txtIFADoneOn().setText(client.ifaDoneDate());
        } else {
            viewHolder.txtIFADoneOn().setVisibility(View.INVISIBLE);
        }

        AlertDTO ifaAlert = client.getAlert(ANCServiceType.IFA);
        if (ifaAlert != emptyAlert) {
            viewHolder.btnIFAView().setVisibility(View.INVISIBLE);
            viewHolder.layoutIFAAlert().setVisibility(VISIBLE);
            viewHolder.layoutIFAAlert().setOnClickListener(launchForm(client, ifaAlert, IFA));
            setAlertLayout(viewHolder.layoutIFAAlert(),
                    viewHolder.txtIFADueType(),
                    viewHolder.txtIFADueOn(),
                    ifaAlert);
            viewHolder.txtIFADueType().setText(ifaAlert.name());
        } else {
            viewHolder.layoutIFAAlert().setVisibility(View.INVISIBLE);
            viewHolder.btnIFAView().setVisibility(View.INVISIBLE);
            viewHolder.btnIFAView().setOnClickListener(launchForm(client, ifaAlert, IFA));
        }
    }

    private void setupEditView(ANCSmartRegisterClient client, NativeANCSmartRegisterViewHolder viewHolder, View.OnClickListener onClickListener) {
        if (iconPencilDrawable == null) {
            iconPencilDrawable = Context.getInstance().getDrawableResource(R.drawable.ic_pencil);
        }
        viewHolder.btnEditView().setImageDrawable(iconPencilDrawable);
        viewHolder.btnEditView().setOnClickListener(onClickListener);
        viewHolder.btnEditView().setTag(client);
    }

    private OnClickFormLauncher launchForm(ANCSmartRegisterClient client, AlertDTO alert, String formName) {
        return provider().newFormLauncher(formName, client.entityId(), "{\"entityId\":\"" + client.entityId() + "\",\"alertName\":\"" + alert.name() + "\"}");
    }

    private void setAlertLayout(View layout, TextView typeView,
                                TextView dateView, AlertDTO alert) {
        typeView.setText(alert.ancServiceType().shortName());
        dateView.setText("due " + alert.shortDate());
        final AlertStatus alertStatus = alert.alertStatus();
        layout.setBackgroundResource(alertStatus.backgroundColorResourceId());
        typeView.setTextColor(alertStatus.fontColor());
        dateView.setTextColor(alertStatus.fontColor());
    }
}
