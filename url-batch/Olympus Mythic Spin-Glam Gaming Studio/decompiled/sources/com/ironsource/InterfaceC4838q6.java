package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.q6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC4838q6 {
    void a();

    void a(@NotNull Activity activity, @Nullable String str);

    void a(@NotNull LevelPlayAdError levelPlayAdError);

    @NotNull
    LevelPlayAdInfo b();

    @NotNull
    InterfaceC4724k0 c();

    void loadAd();

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
