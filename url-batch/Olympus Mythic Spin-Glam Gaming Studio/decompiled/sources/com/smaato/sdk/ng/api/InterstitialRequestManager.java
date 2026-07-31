package com.smaato.sdk.ng.api;

import com.smaato.sdk.ng.models.AdSize;

/* loaded from: classes15.dex */
public class InterstitialRequestManager extends RequestManager {
    @Override // com.smaato.sdk.ng.api.RequestManager
    public AdSize getAdSize() {
        return AdSize.SIZE_INTERSTITIAL;
    }
}
