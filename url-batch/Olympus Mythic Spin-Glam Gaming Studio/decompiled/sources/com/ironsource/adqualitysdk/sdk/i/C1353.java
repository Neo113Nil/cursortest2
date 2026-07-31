package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾝ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1353 implements ISAdQualityAdListener {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1336 f3710;

    public C1353(C1336 c1336) {
        this.f3710 = c1336;
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
        ISAdQualityAdListener iSAdQualityAdListener = this.f3710.f3683.f3191;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adClosed(str, iSAdQualityAdType);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
        ISAdQualityAdListener iSAdQualityAdListener = this.f3710.f3683.f3191;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adDisplayed(str, iSAdQualityAdType);
        }
    }
}
