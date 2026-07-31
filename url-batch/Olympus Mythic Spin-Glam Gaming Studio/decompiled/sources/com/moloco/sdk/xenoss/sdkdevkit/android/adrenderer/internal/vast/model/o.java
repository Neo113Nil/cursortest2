package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class o {
    public static final int i = 8;

    @Nullable
    public final d a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final s e;

    @NotNull
    public final List<n> f;

    @NotNull
    public final List<String> g;

    @NotNull
    public final List<g> h;

    public o(@Nullable d dVar, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable s sVar, @NotNull List<n> impressions, @NotNull List<String> errorUrls, @NotNull List<g> creatives) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        this.a = dVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = sVar;
        this.f = impressions;
        this.g = errorUrls;
        this.h = creatives;
    }

    @Nullable
    public final d a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.d;
    }

    @NotNull
    public final List<g> d() {
        return this.h;
    }

    @Nullable
    public final String e() {
        return this.c;
    }

    @NotNull
    public final List<String> f() {
        return this.g;
    }

    @NotNull
    public final List<n> g() {
        return this.f;
    }

    @Nullable
    public final s h() {
        return this.e;
    }
}
