package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes15.dex */
public final class j {
    public static final int b = 0;

    @NotNull
    public final String a;

    public j(@NotNull String resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.a = resource;
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
