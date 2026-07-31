package com.five_corp.ad;

import androidx.annotation.NonNull;

/* loaded from: classes12.dex */
public interface FiveAdVideoRewardEventListener {
    default void onClick(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onFullScreenClose(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onFullScreenOpen(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onImpression(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onPause(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onPlay(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    void onReward(@NonNull FiveAdVideoReward fiveAdVideoReward);

    void onViewError(@NonNull FiveAdVideoReward fiveAdVideoReward, @NonNull FiveAdErrorCode fiveAdErrorCode);

    default void onViewThrough(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }
}
