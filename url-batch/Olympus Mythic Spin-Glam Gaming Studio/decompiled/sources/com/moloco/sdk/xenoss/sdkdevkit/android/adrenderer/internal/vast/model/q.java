package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class q {
    public static final int m = 0;

    @NotNull
    public final String a;

    @Nullable
    public final String b;
    public final boolean c;

    @NotNull
    public final String d;

    @Nullable
    public final Integer e;

    @Nullable
    public final Integer f;

    @Nullable
    public final String g;

    @Nullable
    public final Integer h;

    @Nullable
    public final Integer i;

    @Nullable
    public final Integer j;

    @Nullable
    public final Boolean k;

    @Nullable
    public final String l;

    public q(@NotNull String mediaFileUrl, @Nullable String str, boolean z, @NotNull String type, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(mediaFileUrl, "mediaFileUrl");
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = mediaFileUrl;
        this.b = str;
        this.c = z;
        this.d = type;
        this.e = num;
        this.f = num2;
        this.g = str2;
        this.h = num3;
        this.i = num4;
        this.j = num5;
        this.k = bool;
        this.l = str3;
    }

    @Nullable
    public final String a() {
        return this.l;
    }

    @Nullable
    public final Integer b() {
        return this.h;
    }

    @Nullable
    public final String c() {
        return this.g;
    }

    @Nullable
    public final Integer d() {
        return this.f;
    }

    @Nullable
    public final String e() {
        return this.b;
    }

    @Nullable
    public final Integer f() {
        return this.j;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @Nullable
    public final Integer h() {
        return this.i;
    }

    @NotNull
    public final String i() {
        return this.d;
    }

    @Nullable
    public final Integer j() {
        return this.e;
    }

    public final boolean k() {
        return this.c;
    }

    @Nullable
    public final Boolean l() {
        return this.k;
    }
}
