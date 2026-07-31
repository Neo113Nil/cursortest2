package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface K {
    default void a(@NotNull B2 bannerAdInstance) {
        Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
    }

    default void a(@NotNull C4712j6 fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
    }

    default void a(@NotNull Xb nativeAdInstance) {
        Intrinsics.checkNotNullParameter(nativeAdInstance, "nativeAdInstance");
    }
}
