package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0972al extends KT {
    public final /* synthetic */ C1009bM A00;
    public final /* synthetic */ C00851v A01;
    public final /* synthetic */ FQ A02;

    public C0972al(FQ fq, C00851v c00851v, C1009bM c1009bM) {
        this.A02 = fq;
        this.A01 = c00851v;
        this.A00 = c1009bM;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        C0495Jb A00 = C0495Jb.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4t(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
