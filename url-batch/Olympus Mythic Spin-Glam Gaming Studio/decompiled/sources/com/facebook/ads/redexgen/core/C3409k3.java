package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3409k3 extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C3408k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C3409k3(C3408k2 c3408k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c3408k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C3163fp c3163fp;
        C3163fp c3163fp2;
        C3163fp c3163fp3;
        this.A00.A00.A0A();
        c3163fp = this.A00.A00.A0B;
        if (c3163fp != null) {
            AnonymousClass62 anonymousClass62 = this.A01;
            c3163fp2 = this.A00.A00.A0B;
            anonymousClass62.setAdViewabilityChecker(c3163fp2);
            c3163fp3 = this.A00.A00.A0B;
            c3163fp3.A0U();
        }
    }
}
