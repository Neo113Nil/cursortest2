package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class z {
    public static final int c = 0;

    @Nullable
    public final String a;

    @NotNull
    public final String b;

    public z(@Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = str;
        this.b = url;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }
}
