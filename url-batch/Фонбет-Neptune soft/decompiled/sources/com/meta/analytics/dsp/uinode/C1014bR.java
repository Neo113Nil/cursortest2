package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1014bR extends KT {
    public final /* synthetic */ C1013bQ A00;
    public final /* synthetic */ B0 A01;

    public C1014bR(C1013bQ c1013bQ, B0 b0) {
        this.A00 = c1013bQ;
        this.A01 = b0;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        RE re;
        RE re2;
        RE re3;
        this.A00.A00.A0A();
        re = this.A00.A00.A0B;
        if (re != null) {
            B0 b0 = this.A01;
            re2 = this.A00.A00.A0B;
            b0.setAdViewabilityChecker(re2);
            re3 = this.A00.A00.A0B;
            re3.A0U();
        }
    }
}
