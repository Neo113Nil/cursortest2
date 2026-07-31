package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface Lc extends Ic {
    void onInterstitialAdRewarded(String str, int i);

    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject);

    void onInterstitialInitFailed(String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(String str);

    void onInterstitialLoadSuccess(K9 k9);

    void onInterstitialOpen();

    void onInterstitialShowFailed(String str);

    void onInterstitialShowSuccess();
}
