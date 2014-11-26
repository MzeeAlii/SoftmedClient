package org.ei.drishti.view.viewHolder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import org.ei.drishti.R;
import org.ei.drishti.view.customControls.ANCClientIdDetailsView;
import org.ei.drishti.view.customControls.ANCStatusView;
import org.ei.drishti.view.customControls.ClientProfileView;

public class NativeANCSmartRegisterViewHolder {
    private final ClientProfileView profileInfoLayout;
    private final ANCClientIdDetailsView ancClientIdDetailsView;
    private final ANCStatusView ancStatusView;

    private final TextView btnAncVisitView;
    private final View layoutANCVisitAlert;
    private final TextView txtANCVisitDoneOn;
    private final TextView txtANCVisitDueType;
    private final TextView txtANCVisitAlertDueOn;
    private final ViewGroup serviceModeViewsHolder;
    private final ViewGroup serviceModeOverviewView;
    private final TextView txtRiskFactors;
    private final TextView btnTTView;
    private final View layoutTTAlert;
    private final TextView txtTTDoneOn;
    private final TextView txtTTDueType;
    private final TextView txtTTDueOn;
    private final TextView btnIFAView;
    private final View layoutIFAAlert;
    private final TextView txtIFADoneOn;
    private final TextView txtIFADueType;
    private final TextView txtIFADueOn;
    private final ImageButton btnEditView;
    private final ViewGroup serviceModeANCVisitsView;
    private final View layoutANCVisit1Alert;
    private final View layoutANCVisit1ServiceProvided;
    private final TextView txtANCVisit1DueType;
    private final TextView txtANCVisit1DueOn;
    private final TextView txtANCVisit1DoneDate;
    private final TextView lblANCVisit1Bp;
    private final TextView lblANCVisit1Weight;
    private final TextView txtANCVisit1BpValue;
    private final TextView txtANCVisit1WeightValue;
    private final View layoutANCVisit2Alert;
    private final View layoutANCVisit2ServiceProvided;
    private final TextView txtANCVisit2DueType;
    private final TextView txtANCVisit2DueOn;
    private final TextView txtANCVisit2DoneDate;
    private final TextView lblANCVisit2Bp;
    private final TextView lblANCVisit2Weight;
    private final TextView txtANCVisit2BpValue;
    private final TextView txtANCVisit2WeightValue;
    private final View layoutANCVisit3Alert;
    private final View layoutANCVisit3ServiceProvided;
    private final TextView txtANCVisit3DueType;
    private final TextView txtANCVisit3DueOn;
    private final TextView txtANCVisit3DoneDate;
    private final TextView lblANCVisit3Bp;
    private final TextView lblANCVisit3Weight;
    private final TextView txtANCVisit3BpValue;
    private final TextView txtANCVisit3WeightValue;
    private final TextView btnOtherANCVisit;
    private final View layoutANCVisit4Alert;
    private final View layoutANCVisit4ServiceProvided;
    private final TextView txtANCVisit4DueType;
    private final TextView txtANCVisit4DueOn;
    private final TextView txtANCVisit4DoneDate;
    private final TextView lblANCVisit4Bp;
    private final TextView lblANCVisit4Weight;
    private final TextView txtANCVisit4BpValue;
    private final TextView txtANCVisit4WeightValue;

    public NativeANCSmartRegisterViewHolder(ViewGroup itemView) {
        profileInfoLayout = (ClientProfileView) itemView.findViewById(R.id.profile_info_layout);
        profileInfoLayout.initialize();

        ancClientIdDetailsView = (ANCClientIdDetailsView) itemView.findViewById(R.id.client_id_details_layout);
        ancClientIdDetailsView.initialize();

        ancStatusView = (ANCStatusView) itemView.findViewById(R.id.client_status_layout);
        ancStatusView.initialize();

        serviceModeViewsHolder = (ViewGroup) itemView.findViewById(R.id.anc_register_service_mode_options_view);
        serviceModeOverviewView = (ViewGroup) serviceModeViewsHolder.findViewById(R.id.overview_service_mode_views);
        serviceModeANCVisitsView = (ViewGroup) serviceModeViewsHolder.findViewById(R.id.anc_visit_service_mode_views);

        txtRiskFactors = (TextView) serviceModeOverviewView.findViewById(R.id.txt_risk_factors);

        btnAncVisitView = (TextView) serviceModeOverviewView.findViewById(R.id.btn_anc_visit);
        layoutANCVisitAlert = serviceModeOverviewView.findViewById(R.id.layout_anc_visit_alert);
        txtANCVisitDoneOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_anc_visit_on);
        txtANCVisitDueType = (TextView) serviceModeOverviewView.findViewById(R.id.txt_anc_visit_due_type);
        txtANCVisitAlertDueOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_anc_visit_due_on);

        btnTTView = (TextView) serviceModeOverviewView.findViewById(R.id.btn_tt);
        layoutTTAlert = serviceModeOverviewView.findViewById(R.id.layout_tt_alert);
        txtTTDoneOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_tt_on);
        txtTTDueType = (TextView) serviceModeOverviewView.findViewById(R.id.txt_tt_due_type);
        txtTTDueOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_tt_due_on);

        btnIFAView = (TextView) serviceModeOverviewView.findViewById(R.id.btn_ifa);
        layoutIFAAlert = serviceModeOverviewView.findViewById(R.id.layout_ifa_alert);
        txtIFADoneOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_ifa_on);
        txtIFADueType = (TextView) serviceModeOverviewView.findViewById(R.id.txt_ifa_due_type);
        txtIFADueOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_ifa_due_on);

        btnEditView = (ImageButton) serviceModeOverviewView.findViewById(R.id.btn_edit);

        layoutANCVisit1Alert = serviceModeANCVisitsView.findViewById(R.id.layout_anc_visit_1_alert);
        layoutANCVisit1ServiceProvided = serviceModeANCVisitsView.findViewById(R.id.layout_anc_visit_1_service_provided);
        txtANCVisit1DueType = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_1_due_type);
        txtANCVisit1DueOn = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_1_due_on);
        txtANCVisit1DoneDate = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_1_done_date);
        lblANCVisit1Bp = (TextView) serviceModeANCVisitsView.findViewById(R.id.lbl_anc_visit_1_bp);
        lblANCVisit1Weight = (TextView) serviceModeANCVisitsView.findViewById(R.id.lbl_anc_visit_1_weight);
        txtANCVisit1BpValue = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_1_bp_value);
        txtANCVisit1WeightValue = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_1_weight_value);

        layoutANCVisit2Alert = serviceModeANCVisitsView.findViewById(R.id.layout_anc_visit_2_alert);
        layoutANCVisit2ServiceProvided = serviceModeANCVisitsView.findViewById(R.id.layout_anc_visit_2_service_provided);
        txtANCVisit2DueType = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_2_due_type);
        txtANCVisit2DueOn = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_2_due_on);
        txtANCVisit2DoneDate = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_2_done_date);
        lblANCVisit2Bp = (TextView) serviceModeANCVisitsView.findViewById(R.id.lbl_anc_visit_2_bp);
        lblANCVisit2Weight = (TextView) serviceModeANCVisitsView.findViewById(R.id.lbl_anc_visit_2_weight);
        txtANCVisit2BpValue = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_2_bp_value);
        txtANCVisit2WeightValue = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_2_weight_value);

        layoutANCVisit3Alert = serviceModeANCVisitsView.findViewById(R.id.layout_anc_visit_3_alert);
        layoutANCVisit3ServiceProvided = serviceModeANCVisitsView.findViewById(R.id.layout_anc_visit_3_service_provided);
        txtANCVisit3DueType = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_3_due_type);
        txtANCVisit3DueOn = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_3_due_on);
        txtANCVisit3DoneDate = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_3_done_date);
        lblANCVisit3Bp = (TextView) serviceModeANCVisitsView.findViewById(R.id.lbl_anc_visit_3_bp);
        lblANCVisit3Weight = (TextView) serviceModeANCVisitsView.findViewById(R.id.lbl_anc_visit_3_weight);
        txtANCVisit3BpValue = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_3_bp_value);
        txtANCVisit3WeightValue = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_3_weight_value);

        layoutANCVisit4Alert = serviceModeANCVisitsView.findViewById(R.id.layout_anc_visit_4_alert);
        layoutANCVisit4ServiceProvided = serviceModeANCVisitsView.findViewById(R.id.layout_anc_visit_4_service_provided);
        txtANCVisit4DueType = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_4_due_type);
        txtANCVisit4DueOn = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_4_due_on);
        txtANCVisit4DoneDate = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_4_done_date);
        lblANCVisit4Bp = (TextView) serviceModeANCVisitsView.findViewById(R.id.lbl_anc_visit_4_bp);
        lblANCVisit4Weight = (TextView) serviceModeANCVisitsView.findViewById(R.id.lbl_anc_visit_4_weight);
        txtANCVisit4BpValue = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_4_bp_value);
        txtANCVisit4WeightValue = (TextView) serviceModeANCVisitsView.findViewById(R.id.txt_anc_visit_4_weight_value);

        btnOtherANCVisit = (TextView) serviceModeANCVisitsView.findViewById(R.id.btn_other_anc_visit);
    }

    public ClientProfileView profileInfoLayout() {
        return profileInfoLayout;
    }

    public ANCClientIdDetailsView ancClientIdDetailsView() {
        return ancClientIdDetailsView;
    }

    public ANCStatusView ancStatusView() {
        return ancStatusView;
    }

    public TextView btnAncVisitView() {
        return btnAncVisitView;
    }

    public View layoutANCVisitAlert() {
        return layoutANCVisitAlert;
    }

    public TextView txtANCVisitDoneOn() {
        return txtANCVisitDoneOn;
    }

    public TextView txtANCVisitDueType() {
        return txtANCVisitDueType;
    }

    public TextView txtANCVisitAlertDueOn() {
        return txtANCVisitAlertDueOn;
    }

    public TextView txtRiskFactors() {
        return txtRiskFactors;
    }

    public ViewGroup serviceModeOverviewView() {
        return serviceModeOverviewView;
    }

    public TextView btnTTView() {
        return btnTTView;
    }

    public View layoutTTAlert() {
        return layoutTTAlert;
    }

    public TextView txtTTDoneOn() {
        return txtTTDoneOn;
    }

    public TextView txtTTDueType() {
        return txtTTDueType;
    }

    public TextView txtTTDueOn() {
        return txtTTDueOn;
    }

    public TextView btnIFAView() {
        return btnIFAView;
    }

    public View layoutIFAAlert() {
        return layoutIFAAlert;
    }

    public TextView txtIFADoneOn() {
        return txtIFADoneOn;
    }

    public TextView txtIFADueType() {
        return txtIFADueType;
    }

    public TextView txtIFADueOn() {
        return txtIFADueOn;
    }

    public ImageButton btnEditView() {
        return btnEditView;
    }

    public ViewGroup serviceModeANCVisitsView() {
        return serviceModeANCVisitsView;
    }

    public View layoutANCVisit1Alert() {
        return layoutANCVisit1Alert;
    }

    public TextView txtANCVisit1DueType() {
        return txtANCVisit1DueType;
    }

    public TextView txtANCVisit1DueOn() {
        return txtANCVisit1DueOn;
    }

    public TextView txtANCVisit1DoneDate() {
        return txtANCVisit1DoneDate;
    }

    public TextView lblANCVisit1Bp() {
        return lblANCVisit1Bp;
    }

    public TextView lblANCVisit1Weight() {
        return lblANCVisit1Weight;
    }

    public TextView txtANCVisit1BpValue() {
        return txtANCVisit1BpValue;
    }

    public TextView txtANCVisit1WeightValue() {
        return txtANCVisit1WeightValue;
    }

    public void hideAllServiceModeOptions() {
        serviceModeOverviewView().setVisibility(View.GONE);
        serviceModeANCVisitsView().setVisibility(View.GONE);
    }

    public View layoutANCVisit2Alert() {
        return layoutANCVisit2Alert;
    }

    public TextView txtANCVisit2DueType() {
        return txtANCVisit2DueType;
    }

    public TextView txtANCVisit2DueOn() {
        return txtANCVisit2DueOn;
    }

    public TextView txtANCVisit2DoneDate() {
        return txtANCVisit2DoneDate;
    }

    public TextView lblANCVisit2Bp() {
        return lblANCVisit2Bp;
    }

    public TextView lblANCVisit2Weight() {
        return lblANCVisit2Weight;
    }

    public TextView txtANCVisit2BpValue() {
        return txtANCVisit2BpValue;
    }

    public TextView txtANCVisit2WeightValue() {
        return txtANCVisit2WeightValue;
    }

    public View layoutANCVisit3Alert() {
        return layoutANCVisit3Alert;
    }

    public TextView txtANCVisit3DueType() {
        return txtANCVisit3DueType;
    }

    public TextView txtANCVisit3DueOn() {
        return txtANCVisit3DueOn;
    }

    public TextView txtANCVisit3DoneDate() {
        return txtANCVisit3DoneDate;
    }

    public TextView lblANCVisit3Bp() {
        return lblANCVisit3Bp;
    }

    public TextView lblANCVisit3Weight() {
        return lblANCVisit3Weight;
    }

    public TextView txtANCVisit3BpValue() {
        return txtANCVisit3BpValue;
    }

    public TextView txtANCVisit3WeightValue() {
        return txtANCVisit3WeightValue;
    }

    public TextView btnOtherANCVisit() {
        return btnOtherANCVisit;
    }

    public View layoutANCVisit4Alert() {
        return layoutANCVisit4Alert;
    }

    public TextView txtANCVisit4DueType() {
        return txtANCVisit4DueType;
    }

    public TextView txtANCVisit4DueOn() {
        return txtANCVisit4DueOn;
    }

    public TextView txtANCVisit4DoneDate() {
        return txtANCVisit4DoneDate;
    }

    public TextView lblANCVisit4Bp() {
        return lblANCVisit4Bp;
    }

    public TextView lblANCVisit4Weight() {
        return lblANCVisit4Weight;
    }

    public TextView txtANCVisit4BpValue() {
        return txtANCVisit4BpValue;
    }

    public TextView txtANCVisit4WeightValue() {
        return txtANCVisit4WeightValue;
    }

    public void hideViewsInANCVisit1Layout() {
        layoutANCVisit1Alert().setVisibility(View.GONE);
        layoutANCVisit1ServiceProvided().setVisibility(View.GONE);
        txtANCVisit1DueType().setVisibility(View.GONE);
        txtANCVisit1DueOn().setVisibility(View.GONE);
        txtANCVisit1DoneDate().setVisibility(View.GONE);
        lblANCVisit1Bp().setVisibility(View.GONE);
        lblANCVisit1Weight().setVisibility(View.GONE);
        txtANCVisit1BpValue().setVisibility(View.GONE);
        txtANCVisit1WeightValue().setVisibility(View.GONE);
    }

    public void hideViewsInANCVisit2Layout() {
        layoutANCVisit2Alert().setVisibility(View.GONE);
        layoutANCVisit2ServiceProvided().setVisibility(View.GONE);
        txtANCVisit2DueType().setVisibility(View.GONE);
        txtANCVisit2DueOn().setVisibility(View.GONE );
        txtANCVisit2DoneDate().setVisibility(View.GONE);
        lblANCVisit2Bp().setVisibility(View.GONE);
        lblANCVisit2Weight().setVisibility(View.GONE);
        txtANCVisit2BpValue().setVisibility(View.GONE);
        txtANCVisit2WeightValue().setVisibility(View.GONE);
    }

    public void hideViewsInANCVisit3Layout() {
        layoutANCVisit3Alert().setVisibility(View.GONE);
        layoutANCVisit3ServiceProvided().setVisibility(View.GONE);
        txtANCVisit3DueType().setVisibility(View.GONE);
        txtANCVisit3DueOn().setVisibility(View.GONE);
        txtANCVisit3DoneDate().setVisibility(View.GONE);
        lblANCVisit3Bp().setVisibility(View.GONE);
        lblANCVisit3Weight().setVisibility(View.GONE);
        txtANCVisit3BpValue().setVisibility(View.GONE);
        txtANCVisit3WeightValue().setVisibility(View.GONE);
    }

    public void hideViewsInANCVisit4Layout() {
        layoutANCVisit4Alert().setVisibility(View.GONE);
        layoutANCVisit4ServiceProvided().setVisibility(View.GONE);
        txtANCVisit4DueType().setVisibility(View.GONE);
        txtANCVisit4DueOn().setVisibility(View.GONE);
        txtANCVisit4DoneDate().setVisibility(View.GONE);
        lblANCVisit4Bp().setVisibility(View.GONE);
        lblANCVisit4Weight().setVisibility(View.GONE);
        txtANCVisit4BpValue().setVisibility(View.GONE);
        txtANCVisit4WeightValue().setVisibility(View.GONE);
    }


    public View layoutANCVisit1ServiceProvided() {
        return layoutANCVisit1ServiceProvided;
    }

    public View layoutANCVisit2ServiceProvided() {
        return layoutANCVisit2ServiceProvided;
    }

    public View layoutANCVisit3ServiceProvided() {
        return layoutANCVisit3ServiceProvided;
    }

    public View layoutANCVisit4ServiceProvided() {
        return layoutANCVisit4ServiceProvided;
    }
}