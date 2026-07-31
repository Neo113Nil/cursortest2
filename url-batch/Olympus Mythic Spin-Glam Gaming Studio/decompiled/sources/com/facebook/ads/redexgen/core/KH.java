package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC2705Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke) {
        this.A00 = ke;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        boolean z;
        C2967cd c2967cd;
        z = this.A00.A0Y;
        if (!z) {
            c2967cd = this.A00.A0K;
            YB.A0F(1000, c2967cd);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
