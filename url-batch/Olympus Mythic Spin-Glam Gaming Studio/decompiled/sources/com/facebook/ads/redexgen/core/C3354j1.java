package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3354j1 extends AbstractRunnableC2705Wc {
    public final /* synthetic */ AbstractC3353j0 A00;
    public final /* synthetic */ C2690Vm A01;

    public C3354j1(AbstractC3353j0 abstractC3353j0, C2690Vm c2690Vm) {
        this.A00 = abstractC3353j0;
        this.A01 = c2690Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
