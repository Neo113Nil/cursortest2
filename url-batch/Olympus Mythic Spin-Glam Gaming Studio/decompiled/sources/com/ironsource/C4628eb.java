package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.eb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4628eb {

    /* renamed from: com.ironsource.eb$a */
    public static final class a implements Za {
        final /* synthetic */ LevelPlayInterstitialAdListener a;

        a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.Za
        public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + adInfo);
            this.a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdClosed(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + adInfo);
            this.a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayFailed(@NotNull LevelPlayAdError error, @NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + error);
            this.a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.Za
        public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + adInfo);
            this.a.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Za b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}
