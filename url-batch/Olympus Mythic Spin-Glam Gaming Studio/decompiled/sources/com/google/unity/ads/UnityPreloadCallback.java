package com.google.unity.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;

/* loaded from: classes6.dex */
public interface UnityPreloadCallback {
    void onAdFailedToPreload(String str, AdError adError);

    void onAdPreloaded(String str, @Nullable ResponseInfo responseInfo);

    void onAdsExhausted(String str);
}
