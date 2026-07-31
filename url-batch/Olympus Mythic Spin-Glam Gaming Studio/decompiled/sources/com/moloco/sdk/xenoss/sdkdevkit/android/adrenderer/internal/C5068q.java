package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5068q {
    public static final int e = 8;

    @Nullable
    public final Integer a;

    @Nullable
    public final C5063l b;

    @Nullable
    public final C5061j c;

    @Nullable
    public final C5067p d;

    public C5068q(@Nullable Integer num, @Nullable C5063l c5063l, @Nullable C5061j c5061j, @Nullable C5067p c5067p) {
        this.a = num;
        this.b = c5063l;
        this.c = c5061j;
        this.d = c5067p;
    }

    @Nullable
    public final Integer a() {
        return this.a;
    }

    @Nullable
    public final C5063l b() {
        return this.b;
    }

    @Nullable
    public final C5061j c() {
        return this.c;
    }

    @Nullable
    public final C5067p d() {
        return this.d;
    }

    @Nullable
    public final Integer e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5068q)) {
            return false;
        }
        C5068q c5068q = (C5068q) obj;
        return Intrinsics.areEqual(this.a, c5068q.a) && Intrinsics.areEqual(this.b, c5068q.b) && Intrinsics.areEqual(this.c, c5068q.c) && Intrinsics.areEqual(this.d, c5068q.d);
    }

    @Nullable
    public final C5061j f() {
        return this.c;
    }

    @Nullable
    public final C5063l g() {
        return this.b;
    }

    @Nullable
    public final C5067p h() {
        return this.d;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        C5063l c5063l = this.b;
        int hashCode2 = (hashCode + (c5063l == null ? 0 : c5063l.hashCode())) * 31;
        C5061j c5061j = this.c;
        int hashCode3 = (hashCode2 + (c5061j == null ? 0 : c5061j.hashCode())) * 31;
        C5067p c5067p = this.d;
        return hashCode3 + (c5067p != null ? c5067p.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECRenderingData(appNameFontSize=" + this.a + ", decCTA=" + this.b + ", decAppIcon=" + this.c + ", decRating=" + this.d + ')';
    }

    @NotNull
    public final C5068q a(@Nullable Integer num, @Nullable C5063l c5063l, @Nullable C5061j c5061j, @Nullable C5067p c5067p) {
        return new C5068q(num, c5063l, c5061j, c5067p);
    }

    public static /* synthetic */ C5068q a(C5068q c5068q, Integer num, C5063l c5063l, C5061j c5061j, C5067p c5067p, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c5068q.a;
        }
        if ((i & 2) != 0) {
            c5063l = c5068q.b;
        }
        if ((i & 4) != 0) {
            c5061j = c5068q.c;
        }
        if ((i & 8) != 0) {
            c5067p = c5068q.d;
        }
        return c5068q.a(num, c5063l, c5061j, c5067p);
    }
}
