package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;

/* loaded from: classes15.dex */
public interface UnityRewardedAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onRewardedAdFailedToLoad(LoadAdError loadAdError);

    void onRewardedAdLoaded();

    void onUserEarnedReward(String str, float f);
}
