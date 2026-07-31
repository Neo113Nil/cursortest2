package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3255hJ extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C3254hI A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C3255hJ(C3254hI c3254hI, AnonymousClass62 anonymousClass62) {
        this.A00 = c3254hI;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}
