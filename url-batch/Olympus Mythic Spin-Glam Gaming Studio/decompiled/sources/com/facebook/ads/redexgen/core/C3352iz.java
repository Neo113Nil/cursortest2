package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3352iz extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C3405jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C20917j A02;

    public C3352iz(C20917j c20917j, O8 o8, C3405jz c3405jz) {
        this.A02 = c20917j;
        this.A01 = o8;
        this.A00 = c3405jz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C2690Vm A00 = C2690Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
