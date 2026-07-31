package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class B {
    public static final int g = 8;

    @NotNull
    public final String a;

    @Nullable
    public final Boolean b;

    @Nullable
    public final d c;

    @NotNull
    public final List<n> d;

    @NotNull
    public final List<String> e;

    @NotNull
    public final List<g> f;

    public B(@NotNull String vastAdTagUrl, @Nullable Boolean bool, @Nullable d dVar, @NotNull List<n> impressions, @NotNull List<String> errorUrls, @NotNull List<g> creatives) {
        Intrinsics.checkNotNullParameter(vastAdTagUrl, "vastAdTagUrl");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        this.a = vastAdTagUrl;
        this.b = bool;
        this.c = dVar;
        this.d = impressions;
        this.e = errorUrls;
        this.f = creatives;
    }

    @Nullable
    public final d a() {
        return this.c;
    }

    @NotNull
    public final List<g> b() {
        return this.f;
    }

    @NotNull
    public final List<String> c() {
        return this.e;
    }

    @Nullable
    public final Boolean d() {
        return this.b;
    }

    @NotNull
    public final List<n> e() {
        return this.d;
    }

    @NotNull
    public final String f() {
        return this.a;
    }
}
