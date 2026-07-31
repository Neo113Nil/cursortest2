package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3346it extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C21047w A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C20827a A02;

    public C3346it(C20827a c20827a, O8 o8, C21047w c21047w) {
        this.A02 = c20827a;
        this.A01 = o8;
        this.A00 = c21047w;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C2690Vm(adErrorType, ""));
    }
}
