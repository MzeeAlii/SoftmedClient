describe("ANC E2E", function(){
    beforeEach(function(){
        browser().navigateTo('../assets/www/smart_registry/anc_register.html');
    });

    describe("Status Flags", function(){
        it("should show the fp flag only if client is high priority", function(){
            expect(element("div.client-details:nth(0) .flag-hp:visible").count()).toEqual(1);
            expect(element("div.client-details:nth(2) .flag-hp:hidden").count()).toEqual(1);
        });

        it("should show the hrp flag only if client is high priority pregnancy", function(){
            expect(element("div.client-details:nth(0) .flag-hrp:visible").count()).toEqual(1);
            expect(element("div.client-details:nth(1) .flag-hrp:hidden").count()).toEqual(1);
        });

        it("should show the bpl flag only if client economicStatus is bpl", function(){
            expect(element("div.client-details:nth(0) .flag-bpl:visible").count()).toEqual(0);
            expect(element("div.client-details:nth(2) .flag-bpl:hidden").count()).toEqual(1);
        });

        it("should include the sc flag element only if caste is sc", function(){
            expect(element("div.client-details:nth(0) .flag-sc").count()).toEqual(1);
            expect(element("div.client-details:nth(0) .flag-st").count()).toEqual(0);
        });

        it("should include the st flag element only if caste is st", function(){
            expect(element("div.client-details:nth(1) .flag-sc").count()).toEqual(0);
            expect(element("div.client-details:nth(1) .flag-st").count()).toEqual(1);
        });
    });

    describe("Button CSS Classes", function(){
        describe("Overview", function(){
            /// the logic is within a repeat so testing one column (i.e. .visits:nth(0) == anc) is testing all
            it("should show the done button only when ANC status is done", function(){
                expect(element("div.client:nth(0) .visits:nth(0) .btn-done").count()).toEqual(0);
                expect(element("div.client:nth(2) .visits:nth(0) .btn-done").count()).toEqual(1);
            });

            it("should set the appropriate button class when ANC status is not done", function(){
                expect(element("div.client:nth(0) .visits:nth(0) .btn-past-due").count()).toEqual(1);
                expect(element("div.client:nth(1) .visits:nth(0) .btn-due").count()).toEqual(1);
                expect(element("div.client:nth(3) .visits:nth(0) .btn-upcoming").count()).toEqual(1);
            });

            it("should show the previous button only when we have a previous status", function(){
                expect(element("div.client:nth(0) .visits:nth(0) .previous-alert:hidden").count()).toEqual(1);
                expect(element("div.client:nth(1) .visits:nth(0) .previous-alert:visible").count()).toEqual(1);
            });
        });
    });
});