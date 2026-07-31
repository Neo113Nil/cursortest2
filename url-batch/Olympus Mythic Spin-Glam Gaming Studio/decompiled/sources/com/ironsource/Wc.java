package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public interface Wc {
    default void a(@NotNull B instance, @Nullable String str, @NotNull C4770ma publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    default void a(@NotNull List<? extends B> waterfallInstances, @NotNull B winnerInstance) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
    }
}
