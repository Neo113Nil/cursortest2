package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes15.dex */
public final class t {
    public static final int c = 0;

    @NotNull
    public final String a;

    @NotNull
    public final i b;

    public t(@NotNull String resource, @NotNull i creativeType) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        this.a = resource;
        this.b = creativeType;
    }

    @NotNull
    public final i a() {
        return this.b;
    }

    @NotNull
    public final String b() {
        return this.a;
    }
}
