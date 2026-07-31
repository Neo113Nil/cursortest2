package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class l {
    public static final int j = 8;

    @Nullable
    public final String a;

    @Nullable
    public final Integer b;

    @Nullable
    public final Integer c;

    @Nullable
    public final String d;

    @Nullable
    public final r e;

    @Nullable
    public final Long f;

    @Nullable
    public final m g;

    @NotNull
    public final List<String> h;

    @NotNull
    public final y i;

    public l(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable r rVar, @Nullable Long l, @Nullable m mVar, @NotNull List<String> viewTrackingUrlList, @NotNull y resource) {
        Intrinsics.checkNotNullParameter(viewTrackingUrlList, "viewTrackingUrlList");
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = rVar;
        this.f = l;
        this.g = mVar;
        this.h = viewTrackingUrlList;
        this.i = resource;
    }

    @Nullable
    public final String a() {
        return this.d;
    }

    @Nullable
    public final m b() {
        return this.g;
    }

    @Nullable
    public final Long c() {
        return this.f;
    }

    @Nullable
    public final Integer d() {
        return this.c;
    }

    @Nullable
    public final r e() {
        return this.e;
    }

    @Nullable
    public final String f() {
        return this.a;
    }

    @NotNull
    public final y g() {
        return this.i;
    }

    @NotNull
    public final List<String> h() {
        return this.h;
    }

    @Nullable
    public final Integer i() {
        return this.b;
    }
}
