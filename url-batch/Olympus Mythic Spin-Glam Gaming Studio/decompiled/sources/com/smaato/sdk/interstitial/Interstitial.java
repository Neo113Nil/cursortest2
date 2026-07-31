package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.ad.AdRequestParams;

/* loaded from: classes4.dex */
public final class Interstitial extends InterstitialBase {
    private Interstitial() {
    }

    public static void loadAd(String str, EventListener eventListener) {
        loadAd(str, eventListener, null);
    }

    public static void loadAd(String str, EventListener eventListener, AdRequestParams adRequestParams) {
        loadAd(str, eventListener, adRequestParams, false);
    }

    static void loadAd(String str, EventListener eventListener, AdRequestParams adRequestParams, boolean z) {
        InterstitialAd interstitialAd = new InterstitialAd(str, adRequestParams, eventListener);
        interstitialAd.setMediation(InterstitialBase.isMediation);
        interstitialAd.loadAd();
    }
}
