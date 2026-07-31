package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public interface C6 {
    void a(@NotNull Activity activity);

    void a(@NotNull C4855r6 c4855r6);

    void a(@NotNull C4855r6 c4855r6, @Nullable IronSourceError ironSourceError);

    void a(@NotNull C4855r6 c4855r6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@NotNull C4855r6 c4855r6, @Nullable IronSourceError ironSourceError);

    void b(@NotNull C4855r6 c4855r6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@NotNull C4855r6 c4855r6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
