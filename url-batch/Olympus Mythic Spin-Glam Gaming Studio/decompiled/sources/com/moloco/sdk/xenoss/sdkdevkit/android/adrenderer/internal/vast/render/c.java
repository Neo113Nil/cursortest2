package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class c {
    public static final int g = 8;

    @NotNull
    public final y a;
    public final int b;
    public final int c;

    @Nullable
    public final String d;

    @NotNull
    public final List<String> e;

    @NotNull
    public final List<String> f;

    public c(@NotNull y resource, int i, int i2, @Nullable String str, @NotNull List<String> clickTracking, @NotNull List<String> creativeViewTracking) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(creativeViewTracking, "creativeViewTracking");
        this.a = resource;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = clickTracking;
        this.f = creativeViewTracking;
    }

    @Nullable
    public final String a() {
        return this.d;
    }

    @NotNull
    public final List<String> b() {
        return this.e;
    }

    @NotNull
    public final List<String> c() {
        return this.f;
    }

    public final int d() {
        return this.c;
    }

    @NotNull
    public final y e() {
        return this.a;
    }

    public final int f() {
        return this.b;
    }
}
