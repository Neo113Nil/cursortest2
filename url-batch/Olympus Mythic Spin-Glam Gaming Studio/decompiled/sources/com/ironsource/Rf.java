package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Rf implements LevelPlayInterstitialAdListener {
    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4607d8.a().b(C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClosed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4607d8.a().c(C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayFailed(@NotNull LevelPlayAdError error, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4607d8 a = C4607d8.a();
        C4597cg c4597cg = C4597cg.a;
        a.a(c4597cg.a(error), c4597cg.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4607d8.a().f(C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C4607d8.a().a(C4597cg.a.a(error));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4607d8.a().e(C4597cg.a.a(adInfo));
    }
}
