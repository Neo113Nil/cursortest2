package com.google.unity.ads.admanager;

import com.google.unity.ads.UnityFullScreenContentCallback;
import com.google.unity.ads.UnityInterstitialAdCallback;
import com.google.unity.ads.UnityPaidEventListener;

/* loaded from: classes15.dex */
public interface UnityAdManagerInterstitialAdCallback extends UnityInterstitialAdCallback, UnityPaidEventListener, UnityFullScreenContentCallback {
    void onAppEvent(String str, String str2);
}
