package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GE implements InterfaceC3048dx {
    public final /* synthetic */ C4V A00;

    public GE(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3048dx
    public final void A9l() {
        AbstractC2931c3 abstractC2931c3;
        AbstractC2931c3 abstractC2931c32;
        abstractC2931c3 = this.A00.A02;
        if (abstractC2931c3 instanceof C6H) {
            abstractC2931c32 = this.A00.A02;
            ((C6H) abstractC2931c32).A1X();
            VI.A02(VH.A0e, null, ((AbstractC2305Gj) this.A00).A03.A2E(), ((AbstractC2305Gj) this.A00).A05.A0A());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3048dx
    public final void AJz() {
        AbstractC2931c3 abstractC2931c3;
        AbstractC2931c3 abstractC2931c32;
        C4L c4l;
        abstractC2931c3 = this.A00.A02;
        if (abstractC2931c3 instanceof C6H) {
            abstractC2931c32 = this.A00.A02;
            c4l = this.A00.A0N;
            ((C6H) abstractC2931c32).A1b(c4l);
            VI.A02(VH.A0e, null, ((AbstractC2305Gj) this.A00).A03.A2E(), ((AbstractC2305Gj) this.A00).A05.A0A());
        }
        this.A00.A0n();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3048dx
    public final void AKE() {
        AbstractC2931c3 abstractC2931c3;
        AbstractC2931c3 abstractC2931c32;
        this.A00.A0e();
        abstractC2931c3 = this.A00.A02;
        if (abstractC2931c3 instanceof C6H) {
            abstractC2931c32 = this.A00.A02;
            ((C6H) abstractC2931c32).getAdDetailsView().setVisibility(8);
        }
    }
}
