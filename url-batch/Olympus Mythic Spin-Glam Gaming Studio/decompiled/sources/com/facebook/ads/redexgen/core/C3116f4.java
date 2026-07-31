package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3116f4 extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C3214ge A00;

    public C3116f4(C3214ge c3214ge) {
        this.A00 = c3214ge;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        for (TY ty : TX.A02()) {
            TX.A0A(this.A00, ty.A02(), ty.A00(), ty.A01(), false);
        }
        TX.A02().clear();
    }
}
