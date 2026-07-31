package com.smaato.sdk.ng.api;

import com.smaato.sdk.ng.models.AdRequestFactory;
import com.smaato.sdk.ng.models.AdSize;

/* loaded from: classes4.dex */
public class MRectRequestManager extends RequestManager {
    public MRectRequestManager() {
    }

    @Override // com.smaato.sdk.ng.api.RequestManager
    public AdSize getAdSize() {
        return AdSize.SIZE_300x250;
    }

    public MRectRequestManager(ApiClient apiClient, AdRequestFactory adRequestFactory) {
        super(apiClient, adRequestFactory);
    }
}
