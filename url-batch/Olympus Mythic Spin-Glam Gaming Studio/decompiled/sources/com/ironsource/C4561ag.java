package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.ag, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4561ag implements LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Nd.a().a(new C4684hd(0, adInfo.getPlacementName(), false, "", 0, null), C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Nd.a().b(C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(@NotNull LevelPlayAdError error, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Nd a = Nd.a();
        C4597cg c4597cg = C4597cg.a;
        a.a(c4597cg.a(error), c4597cg.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Nd.a().c(C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Nd.a().a(C4597cg.a.a(error));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Nd.a().d(C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(@NotNull LevelPlayReward reward, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Nd.a().b(new C4684hd(0, adInfo.getPlacementName(), false, reward.getName(), reward.getAmount(), null), C4597cg.a.a(adInfo));
    }
}
