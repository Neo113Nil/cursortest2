package com.google.unity.ads;

import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes12.dex */
public interface UnityAppOpenAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onAppOpenAdFailedToLoad(LoadAdError loadAdError);

    void onAppOpenAdLoaded();
}
