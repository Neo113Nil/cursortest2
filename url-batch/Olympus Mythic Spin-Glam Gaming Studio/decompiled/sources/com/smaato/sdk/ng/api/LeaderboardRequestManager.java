package com.smaato.sdk.ng.api;

import com.smaato.sdk.ng.models.AdRequestFactory;
import com.smaato.sdk.ng.models.AdSize;

/* loaded from: classes6.dex */
public class LeaderboardRequestManager extends RequestManager {
    public LeaderboardRequestManager() {
    }

    @Override // com.smaato.sdk.ng.api.RequestManager
    public AdSize getAdSize() {
        return AdSize.SIZE_728x90;
    }

    public LeaderboardRequestManager(ApiClient apiClient, AdRequestFactory adRequestFactory) {
        super(apiClient, adRequestFactory);
    }
}
