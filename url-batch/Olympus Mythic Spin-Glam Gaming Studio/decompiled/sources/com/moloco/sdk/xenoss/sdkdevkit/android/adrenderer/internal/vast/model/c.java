package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class c {
    public static final int c = 0;

    @NotNull
    public final String a;

    @Nullable
    public final Boolean b;

    public c(@NotNull String value, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a = value;
        this.b = bool;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final Boolean b() {
        return this.b;
    }
}
