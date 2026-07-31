package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;

/* loaded from: classes4.dex */
public interface UnityFullScreenContentCallback {
    void onAdClicked();

    void onAdDismissedFullScreenContent();

    void onAdFailedToShowFullScreenContent(FullScreenContentError fullScreenContentError);

    void onAdImpression();

    void onAdShowedFullScreenContent();
}
