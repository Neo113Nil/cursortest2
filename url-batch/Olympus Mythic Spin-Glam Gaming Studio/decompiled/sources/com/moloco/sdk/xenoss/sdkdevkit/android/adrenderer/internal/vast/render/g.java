package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes14.dex */
public final class g {
    public static final int c = 0;

    @NotNull
    public final String a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r b;

    public g(@NotNull String url, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r offset) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.a = url;
        this.b = offset;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r a() {
        return this.b;
    }

    @NotNull
    public final String b() {
        return this.a;
    }
}
