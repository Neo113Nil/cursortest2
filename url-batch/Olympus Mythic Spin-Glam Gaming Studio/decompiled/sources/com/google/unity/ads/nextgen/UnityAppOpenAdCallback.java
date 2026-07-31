package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;

/* loaded from: classes12.dex */
public interface UnityAppOpenAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onAppOpenAdFailedToLoad(LoadAdError loadAdError);

    void onAppOpenAdLoaded();
}
