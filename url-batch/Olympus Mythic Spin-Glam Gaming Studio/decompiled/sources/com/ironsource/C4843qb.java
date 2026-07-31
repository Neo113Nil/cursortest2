package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.qb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4843qb {

    /* renamed from: com.ironsource.qb$a */
    public static final class a implements Za {
        final /* synthetic */ LevelPlayRewardedAdListener a;

        a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.Za
        public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + adInfo);
            this.a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdClosed(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + adInfo);
            this.a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayFailed(@NotNull LevelPlayAdError error, @NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + error);
            this.a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.Za
        public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + adInfo);
            this.a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdRewarded(@NotNull LevelPlayReward reward, @NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + reward + " adInfo: " + adInfo);
            this.a.onAdRewarded(reward, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Za b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
