package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;

/* loaded from: classes6.dex */
public interface UnityInterstitialAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onInterstitialAdFailedToLoad(LoadAdError loadAdError);

    void onInterstitialAdLoaded();
}
