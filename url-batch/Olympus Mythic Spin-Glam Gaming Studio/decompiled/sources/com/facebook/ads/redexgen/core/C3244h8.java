package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3244h8 extends WP {
    public final /* synthetic */ C3241h5 A00;
    public final /* synthetic */ C2690Vm A01;

    public C3244h8(C3241h5 c3241h5, C2690Vm c2690Vm) {
        this.A00 = c3241h5;
        this.A01 = c2690Vm;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        S6 s6;
        S6 s62;
        s6 = this.A00.A01;
        if (s6.A00() != null) {
            s62 = this.A00.A01;
            s62.A00().onAdError(XE.A00(this.A01));
        }
    }
}
