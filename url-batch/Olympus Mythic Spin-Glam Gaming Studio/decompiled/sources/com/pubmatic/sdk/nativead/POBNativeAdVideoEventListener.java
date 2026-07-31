package com.pubmatic.sdk.nativead;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/pubmatic/sdk/nativead/POBNativeAdVideoEventListener;", "", "onAudioStateChanged", "", "nativeAd", "Lcom/pubmatic/sdk/nativead/POBNativeAd;", "isMuted", "", "onVideoCompleted", "onVideoPaused", "onVideoResumed", "onVideoStarted", "nativead_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public interface POBNativeAdVideoEventListener {
    void onAudioStateChanged(@NotNull POBNativeAd nativeAd, boolean isMuted);

    void onVideoCompleted(@NotNull POBNativeAd nativeAd);

    void onVideoPaused(@NotNull POBNativeAd nativeAd);

    void onVideoResumed(@NotNull POBNativeAd nativeAd);

    void onVideoStarted(@NotNull POBNativeAd nativeAd);
}
