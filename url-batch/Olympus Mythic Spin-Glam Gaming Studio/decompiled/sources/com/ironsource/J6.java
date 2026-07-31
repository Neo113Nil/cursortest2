package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public interface J6 {
    void a();

    void a(@NotNull Activity activity);

    void a(@Nullable IronSourceError ironSourceError);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@Nullable IronSourceError ironSourceError);

    void c(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
