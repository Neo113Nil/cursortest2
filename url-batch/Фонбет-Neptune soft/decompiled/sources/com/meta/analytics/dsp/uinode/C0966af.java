package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0966af extends KT {
    public final /* synthetic */ FY A00;
    public final /* synthetic */ C00851v A01;
    public final /* synthetic */ FG A02;

    public C0966af(FG fg, C00851v c00851v, FY fy) {
        this.A02 = fg;
        this.A01 = c00851v;
        this.A00 = fy;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0E().A4t(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new C0495Jb(adErrorType, ""));
    }
}
