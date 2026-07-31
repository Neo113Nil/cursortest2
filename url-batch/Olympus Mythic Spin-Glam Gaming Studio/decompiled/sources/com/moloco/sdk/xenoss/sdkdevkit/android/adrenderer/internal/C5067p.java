package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5067p {
    public static final int f = 0;

    @Nullable
    public final Float a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;
    public final int d;
    public final int e;

    public C5067p(@Nullable Float f2, @NotNull String foregroundColor, @NotNull String backgroundColor, int i, int i2) {
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.a = f2;
        this.b = foregroundColor;
        this.c = backgroundColor;
        this.d = i;
        this.e = i2;
    }

    @Nullable
    public final Float a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5067p)) {
            return false;
        }
        C5067p c5067p = (C5067p) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) c5067p.a) && Intrinsics.areEqual(this.b, c5067p.b) && Intrinsics.areEqual(this.c, c5067p.c) && this.d == c5067p.d && this.e == c5067p.e;
    }

    @NotNull
    public final String f() {
        return this.c;
    }

    public final int g() {
        return this.e;
    }

    @NotNull
    public final String h() {
        return this.b;
    }

    public int hashCode() {
        Float f2 = this.a;
        return ((((((((f2 == null ? 0 : f2.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e);
    }

    public final int i() {
        return this.d;
    }

    @Nullable
    public final Float j() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "DECRating(value=" + this.a + ", foregroundColor=" + this.b + ", backgroundColor=" + this.c + ", size=" + this.d + ", fontSize=" + this.e + ')';
    }

    @NotNull
    public final C5067p a(@Nullable Float f2, @NotNull String foregroundColor, @NotNull String backgroundColor, int i, int i2) {
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new C5067p(f2, foregroundColor, backgroundColor, i, i2);
    }

    public static /* synthetic */ C5067p a(C5067p c5067p, Float f2, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f2 = c5067p.a;
        }
        if ((i3 & 2) != 0) {
            str = c5067p.b;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = c5067p.c;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            i = c5067p.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = c5067p.e;
        }
        return c5067p.a(f2, str3, str4, i4, i2);
    }
}
