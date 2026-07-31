package com.smaato.sdk.interstitial;

import java.util.Objects;

/* loaded from: classes4.dex */
public class InterstitialRequestError {
    private final String adSpaceId;
    private final InterstitialError interstitialError;
    private final String publisherId;

    public InterstitialRequestError(InterstitialError interstitialError, String str, String str2) {
        Objects.requireNonNull(interstitialError);
        this.interstitialError = interstitialError;
        this.publisherId = str;
        this.adSpaceId = str2;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public String getAdSpaceId() {
        return this.adSpaceId;
    }

    public InterstitialError getInterstitialError() {
        return this.interstitialError;
    }
}
