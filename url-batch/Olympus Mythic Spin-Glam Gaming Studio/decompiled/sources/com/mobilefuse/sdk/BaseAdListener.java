package com.mobilefuse.sdk;

/* loaded from: classes5.dex */
public interface BaseAdListener {
    void onAdClicked();

    void onAdError(AdError adError);

    void onAdExpired();

    void onAdLoaded();

    void onAdNotFilled();

    void onAdRendered();
}
