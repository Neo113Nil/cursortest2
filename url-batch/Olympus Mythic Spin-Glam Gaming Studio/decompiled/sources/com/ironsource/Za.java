package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public interface Za {
    void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    default void onAdRewarded(@NotNull LevelPlayReward reward, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
