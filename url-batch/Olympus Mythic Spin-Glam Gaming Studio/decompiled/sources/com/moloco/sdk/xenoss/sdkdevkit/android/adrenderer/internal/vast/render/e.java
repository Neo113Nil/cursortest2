package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class e {
    public static final int i = 8;

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

    @Nullable
    public final Long g;

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r h;

    public e(@NotNull y resource, int i2, int i3, @Nullable String str, @NotNull List<String> clickTracking, @NotNull List<String> viewTracking, @Nullable Long l, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(viewTracking, "viewTracking");
        this.a = resource;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = clickTracking;
        this.f = viewTracking;
        this.g = l;
        this.h = rVar;
    }

    @Nullable
    public final String a() {
        return this.d;
    }

    @NotNull
    public final List<String> b() {
        return this.e;
    }

    @Nullable
    public final Long c() {
        return this.g;
    }

    public final int d() {
        return this.c;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r e() {
        return this.h;
    }

    @NotNull
    public final y f() {
        return this.a;
    }

    @NotNull
    public final List<String> g() {
        return this.f;
    }

    public final int h() {
        return this.b;
    }
}
