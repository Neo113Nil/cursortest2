package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C2265Eu A00;

    public F1(C2265Eu c2265Eu) {
        this.A00 = c2265Eu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C3092eg c3092eg;
        C2255Ek c2255Ek;
        E4 e4;
        EA ea;
        c3092eg = this.A00.A03;
        c3092eg.A07();
        c2255Ek = this.A00.A04;
        UM<UN, UL> eventBus = c2255Ek.getEventBus();
        e4 = this.A00.A06;
        ea = this.A00.A05;
        eventBus.A04(e4, ea);
    }
}
