package com.google.unity.ads.nextgen;

import androidx.annotation.Nullable;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;

/* loaded from: classes3.dex */
public interface UnityPreloadCallback {
    void onAdFailedToPreload(String str, LoadAdError loadAdError);

    void onAdPreloaded(String str, @Nullable ResponseInfo responseInfo);

    void onAdsExhausted(String str);
}
