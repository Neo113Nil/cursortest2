package com.five_corp.ad;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface FiveAdNativeEventListener {
    default void onClick(@NonNull FiveAdNative fiveAdNative) {
    }

    default void onImpression(@NonNull FiveAdNative fiveAdNative) {
    }

    default void onPause(@NonNull FiveAdNative fiveAdNative) {
    }

    default void onPlay(@NonNull FiveAdNative fiveAdNative) {
    }

    default void onRemove(@NonNull FiveAdNative fiveAdNative) {
    }

    void onViewError(@NonNull FiveAdNative fiveAdNative, @NonNull FiveAdErrorCode fiveAdErrorCode);

    default void onViewThrough(@NonNull FiveAdNative fiveAdNative) {
    }
}
