package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5063l {
    public static final int h = 8;

    @Nullable
    public final Integer a;

    @Nullable
    public final String b;

    @Nullable
    public final Integer c;

    @Nullable
    public final Integer d;

    @Nullable
    public final C5062k e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    public C5063l(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable C5062k c5062k, @Nullable String str2, @Nullable String str3) {
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = num3;
        this.e = c5062k;
        this.f = str2;
        this.g = str3;
    }

    @Nullable
    public final Integer a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final Integer c() {
        return this.c;
    }

    @Nullable
    public final Integer d() {
        return this.d;
    }

    @Nullable
    public final C5062k e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5063l)) {
            return false;
        }
        C5063l c5063l = (C5063l) obj;
        return Intrinsics.areEqual(this.a, c5063l.a) && Intrinsics.areEqual(this.b, c5063l.b) && Intrinsics.areEqual(this.c, c5063l.c) && Intrinsics.areEqual(this.d, c5063l.d) && Intrinsics.areEqual(this.e, c5063l.e) && Intrinsics.areEqual(this.f, c5063l.f) && Intrinsics.areEqual(this.g, c5063l.g);
    }

    @Nullable
    public final String f() {
        return this.f;
    }

    @Nullable
    public final String g() {
        return this.g;
    }

    @Nullable
    public final String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        C5062k c5062k = this.e;
        int hashCode5 = (hashCode4 + (c5062k == null ? 0 : c5062k.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Nullable
    public final C5062k i() {
        return this.e;
    }

    @Nullable
    public final Integer j() {
        return this.c;
    }

    @Nullable
    public final String k() {
        return this.b;
    }

    @Nullable
    public final Integer l() {
        return this.d;
    }

    @Nullable
    public final String m() {
        return this.f;
    }

    @Nullable
    public final Integer n() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "DECCta(verticalSpacing=" + this.a + ", ctaText=" + this.b + ", buttonWidth=" + this.c + ", fontSize=" + this.d + ", border=" + this.e + ", foregroundColor=" + this.f + ", backgroundColor=" + this.g + ')';
    }

    @NotNull
    public final C5063l a(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable C5062k c5062k, @Nullable String str2, @Nullable String str3) {
        return new C5063l(num, str, num2, num3, c5062k, str2, str3);
    }

    public static /* synthetic */ C5063l a(C5063l c5063l, Integer num, String str, Integer num2, Integer num3, C5062k c5062k, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c5063l.a;
        }
        if ((i & 2) != 0) {
            str = c5063l.b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            num2 = c5063l.c;
        }
        Integer num4 = num2;
        if ((i & 8) != 0) {
            num3 = c5063l.d;
        }
        Integer num5 = num3;
        if ((i & 16) != 0) {
            c5062k = c5063l.e;
        }
        C5062k c5062k2 = c5062k;
        if ((i & 32) != 0) {
            str2 = c5063l.f;
        }
        String str5 = str2;
        if ((i & 64) != 0) {
            str3 = c5063l.g;
        }
        return c5063l.a(num, str4, num4, num5, c5062k2, str5, str3);
    }
}
