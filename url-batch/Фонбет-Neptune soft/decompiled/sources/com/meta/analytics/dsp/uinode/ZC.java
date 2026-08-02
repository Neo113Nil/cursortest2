package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class ZC extends KG {
    public final /* synthetic */ ZB A00;

    public ZC(ZB zb) {
        this.A00 = zb;
    }

    @Override // com.meta.analytics.dsp.uinode.KG
    public final void A01() {
        C01785m c01785m;
        C01785m c01785m2;
        c01785m = this.A00.A01.A00;
        if (c01785m.A00() != null) {
            c01785m2 = this.A00.A01.A00;
            c01785m2.A00().onAdsLoaded();
        }
    }
}
