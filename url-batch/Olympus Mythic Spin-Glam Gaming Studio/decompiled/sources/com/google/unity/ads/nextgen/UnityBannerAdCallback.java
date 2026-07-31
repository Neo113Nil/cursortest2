package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;

/* loaded from: classes5.dex */
public interface UnityBannerAdCallback extends UnityPaidEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(LoadAdError loadAdError);

    void onAdImpression();

    void onAdLoaded();

    void onAdOpened();
}
