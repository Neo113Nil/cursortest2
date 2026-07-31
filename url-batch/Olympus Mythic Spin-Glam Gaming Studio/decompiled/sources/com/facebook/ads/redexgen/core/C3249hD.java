package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3249hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3248hC A01;

    public C3249hD(C3248hC c3248hC, int i) {
        this.A01 = c3248hC;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        C3218gi c3218gi;
        c3218gi = this.A01.A0C;
        c3218gi.A0F().ABa();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        C2899bX c2899bX;
        C2899bX c2899bX2;
        float f2 = 1.0f - (f / this.A00);
        c2899bX = this.A01.A0G;
        if (c2899bX != null) {
            c2899bX2 = this.A01.A0G;
            c2899bX2.setProgressWithAnimation(100.0f * f2);
        }
    }
}
