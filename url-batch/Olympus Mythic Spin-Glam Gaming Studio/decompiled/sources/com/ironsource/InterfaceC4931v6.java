package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.v6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC4931v6 {
    void a();

    void a(@Nullable IronSourceError ironSourceError);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@Nullable IronSourceError ironSourceError);

    default void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
