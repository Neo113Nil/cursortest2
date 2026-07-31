package com.smaato.sdk.ng.api;

import com.smaato.sdk.ng.models.AdRequestFactory;
import com.smaato.sdk.ng.models.AdSize;

/* loaded from: classes3.dex */
public class BannerRequestManager extends RequestManager {
    public BannerRequestManager() {
    }

    @Override // com.smaato.sdk.ng.api.RequestManager
    public AdSize getAdSize() {
        return AdSize.SIZE_320x50;
    }

    public BannerRequestManager(ApiClient apiClient, AdRequestFactory adRequestFactory) {
        super(apiClient, adRequestFactory);
    }
}
