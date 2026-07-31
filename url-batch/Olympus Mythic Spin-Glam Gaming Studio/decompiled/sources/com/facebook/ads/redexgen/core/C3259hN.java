package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3259hN extends WP {
    public final /* synthetic */ C3258hM A00;

    public C3259hN(C3258hM c3258hM) {
        this.A00 = c3258hM;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        C2579Rd c2579Rd;
        C2579Rd c2579Rd2;
        C2579Rd c2579Rd3;
        c2579Rd = this.A00.A01;
        if (c2579Rd.A06() != null) {
            c2579Rd2 = this.A00.A01;
            AdListener A06 = c2579Rd2.A06();
            c2579Rd3 = this.A00.A01;
            A06.onLoggingImpression(c2579Rd3.A07());
        }
    }
}
