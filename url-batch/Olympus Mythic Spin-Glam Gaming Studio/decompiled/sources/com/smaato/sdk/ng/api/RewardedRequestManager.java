package com.smaato.sdk.ng.api;

import com.smaato.sdk.ng.models.AdSize;

/* loaded from: classes5.dex */
public class RewardedRequestManager extends RequestManager {
    @Override // com.smaato.sdk.ng.api.RequestManager
    public AdSize getAdSize() {
        return AdSize.SIZE_INTERSTITIAL;
    }

    @Override // com.smaato.sdk.ng.api.RequestManager
    public boolean isRewarded() {
        return true;
    }
}
