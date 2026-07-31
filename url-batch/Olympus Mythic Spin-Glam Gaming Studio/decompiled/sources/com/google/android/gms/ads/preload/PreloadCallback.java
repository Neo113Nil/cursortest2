package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@Deprecated
/* loaded from: classes5.dex */
public interface PreloadCallback {
    void onAdsAvailable(@NonNull PreloadConfiguration preloadConfiguration);

    void onAdsExhausted(@NonNull PreloadConfiguration preloadConfiguration);
}
