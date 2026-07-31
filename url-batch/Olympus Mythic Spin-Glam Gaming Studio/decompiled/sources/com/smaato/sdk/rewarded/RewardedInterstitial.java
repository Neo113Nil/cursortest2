package com.smaato.sdk.rewarded;

import com.smaato.sdk.core.ad.AdRequestParams;
import com.smaato.sdk.interstitial.InterstitialBase;

/* loaded from: classes5.dex */
public final class RewardedInterstitial extends InterstitialBase {
    private RewardedInterstitial() {
    }

    public static void loadAd(String str, EventListener eventListener) {
        loadAd(str, eventListener, null);
    }

    public static void loadAd(String str, EventListener eventListener, AdRequestParams adRequestParams) {
        new RewardedInterstitialAd(str, adRequestParams, eventListener).loadAd();
    }
}
