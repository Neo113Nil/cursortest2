package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;

/* loaded from: classes.dex */
public interface UnityRewardedInterstitialAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onRewardedInterstitialAdFailedToLoad(LoadAdError loadAdError);

    void onRewardedInterstitialAdLoaded();

    void onUserEarnedReward(String str, float f);
}
