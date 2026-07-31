package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3221gl extends AbstractRunnableC2705Wc {
    public final /* synthetic */ CallableC2619Ss A00;
    public final /* synthetic */ C2620St A01;
    public final /* synthetic */ C2624Sx A02;

    public C3221gl(CallableC2619Ss callableC2619Ss, C2624Sx c2624Sx, C2620St c2620St) {
        this.A00 = callableC2619Ss;
        this.A02 = c2624Sx;
        this.A01 = c2620St;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        this.A00.A03(this.A01);
    }
}
