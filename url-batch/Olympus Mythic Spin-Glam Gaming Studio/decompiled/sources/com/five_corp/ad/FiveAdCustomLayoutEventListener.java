package com.five_corp.ad;

import androidx.annotation.NonNull;

/* loaded from: classes14.dex */
public interface FiveAdCustomLayoutEventListener {
    default void onClick(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onImpression(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onPause(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onPlay(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onRemove(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    void onViewError(@NonNull FiveAdCustomLayout fiveAdCustomLayout, @NonNull FiveAdErrorCode fiveAdErrorCode);

    default void onViewThrough(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }
}
