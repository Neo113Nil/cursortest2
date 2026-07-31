package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class Nf implements LevelPlayBannerAdViewListener {
    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4963x2.a().b(C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4963x2.a().f(C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLeftApplication(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4963x2.a().c(C4597cg.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C4963x2.a().a(C4597cg.a.a(error));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4963x2.a().d(C4597cg.a.a(adInfo));
    }
}
