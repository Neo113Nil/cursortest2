package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C20274x A00;

    public GZ(C20274x c20274x) {
        this.A00 = c20274x;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        AbstractC2931c3 abstractC2931c3;
        AbstractC2931c3 abstractC2931c32;
        abstractC2931c3 = this.A00.A00;
        if (abstractC2931c3 != null) {
            abstractC2931c32 = this.A00.A00;
            if (abstractC2931c32.A1N()) {
                ((AbstractC2305Gj) this.A00).A02 = true;
                this.A00.A09.setToolbarActionMode(8);
            }
        }
    }
}
