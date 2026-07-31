package com.smaato.sdk.rewarded;

import java.util.Objects;

/* loaded from: classes13.dex */
public final class RewardedRequestError {
    private final String adSpaceId;
    private final String publisherId;
    private final RewardedError rewardedError;

    public RewardedRequestError(RewardedError rewardedError, String str, String str2) {
        Objects.requireNonNull(rewardedError);
        this.rewardedError = rewardedError;
        this.publisherId = str;
        this.adSpaceId = str2;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public String getAdSpaceId() {
        return this.adSpaceId;
    }

    public RewardedError getRewardedError() {
        return this.rewardedError;
    }
}
