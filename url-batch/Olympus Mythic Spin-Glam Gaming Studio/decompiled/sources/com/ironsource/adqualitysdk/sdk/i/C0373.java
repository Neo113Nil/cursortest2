package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ĵ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0373 implements ISAdQualityInitListener {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1336 f190;

    public C0373(C1336 c1336) {
        this.f190 = c1336;
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
        C1213.m4458(this.f190.f3683.f3186, iSAdQualityInitError, str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
    public final void adQualitySdkInitSuccess() {
        C1213 c1213 = this.f190.f3683;
        String str = C1213.f3183;
        c1213.getClass();
        AbstractC1026.m4312(new C1234(c1213));
    }
}
