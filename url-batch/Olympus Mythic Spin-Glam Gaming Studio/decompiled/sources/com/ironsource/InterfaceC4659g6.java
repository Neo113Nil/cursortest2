package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.g6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4659g6 {
    void a();

    void a(@NotNull LevelPlayAdError levelPlayAdError);

    void a(@NotNull LevelPlayReward levelPlayReward);

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
