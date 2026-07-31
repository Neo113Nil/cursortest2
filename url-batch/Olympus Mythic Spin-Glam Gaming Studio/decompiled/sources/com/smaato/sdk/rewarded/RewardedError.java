package com.smaato.sdk.rewarded;

import java.util.Objects;

/* loaded from: classes11.dex */
public enum RewardedError {
    NO_AD_AVAILABLE("No ad is currently available matching the requested parameters."),
    INVALID_REQUEST("Invalid ad request (e.g. PublisherId or AdSpaceId is incorrect)."),
    NETWORK_ERROR("The ad request has not been completed due to a network connectivity issue."),
    CACHE_LIMIT_REACHED("Cache is full. Please use the one of previously loaded ADs."),
    INTERNAL_ERROR("An internal error happened (e.g. the ad server responded with an invalid response)."),
    CREATIVE_RESOURCE_EXPIRED("A creative resource's TTL expired."),
    SDK_INITIALISATION_ERROR("Smaato SDK is not initialised"),
    AGE_RESTRICTED("Age restricted user.");

    private final String description;

    RewardedError(String str) {
        Objects.requireNonNull(str);
        this.description = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format("[%s]: %s", name(), this.description);
    }
}
