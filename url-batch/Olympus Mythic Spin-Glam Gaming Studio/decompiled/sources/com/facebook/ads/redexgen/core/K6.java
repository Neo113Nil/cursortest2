package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C2381Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C2381Ji c2381Ji, boolean z) {
        this.A00 = c2381Ji;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C2935c7 c2935c7;
        c2935c7 = this.A00.A0b;
        AbstractC2753Yb A0B = c2935c7.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A01 || A0B.A0E()) ? false : true);
        A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
