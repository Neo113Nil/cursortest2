package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class ZD extends KG {
    public final /* synthetic */ ZA A00;
    public final /* synthetic */ C0495Jb A01;

    public ZD(ZA za, C0495Jb c0495Jb) {
        this.A00 = za;
        this.A01 = c0495Jb;
    }

    @Override // com.meta.analytics.dsp.uinode.KG
    public final void A01() {
        C01785m c01785m;
        C01785m c01785m2;
        c01785m = this.A00.A00;
        if (c01785m.A00() != null) {
            c01785m2 = this.A00.A00;
            c01785m2.A00().onAdError(L1.A00(this.A01));
        }
    }
}
