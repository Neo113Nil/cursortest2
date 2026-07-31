package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5060i {
    public static final int j = 8;

    @Nullable
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final Integer f;

    @Nullable
    public final C5063l g;

    @Nullable
    public final C5061j h;

    @Nullable
    public final C5067p i;

    public C5060i(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable C5063l c5063l, @Nullable C5061j c5061j, @Nullable C5067p c5067p) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = c5063l;
        this.h = c5061j;
        this.i = c5067p;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.d;
    }

    @Nullable
    public final String e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5060i)) {
            return false;
        }
        C5060i c5060i = (C5060i) obj;
        return Intrinsics.areEqual(this.a, c5060i.a) && Intrinsics.areEqual(this.b, c5060i.b) && Intrinsics.areEqual(this.c, c5060i.c) && Intrinsics.areEqual(this.d, c5060i.d) && Intrinsics.areEqual(this.e, c5060i.e) && Intrinsics.areEqual(this.f, c5060i.f) && Intrinsics.areEqual(this.g, c5060i.g) && Intrinsics.areEqual(this.h, c5060i.h) && Intrinsics.areEqual(this.i, c5060i.i);
    }

    @Nullable
    public final Integer f() {
        return this.f;
    }

    @Nullable
    public final C5063l g() {
        return this.g;
    }

    @Nullable
    public final C5061j h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        C5063l c5063l = this.g;
        int hashCode7 = (hashCode6 + (c5063l == null ? 0 : c5063l.hashCode())) * 31;
        C5061j c5061j = this.h;
        int hashCode8 = (hashCode7 + (c5061j == null ? 0 : c5061j.hashCode())) * 31;
        C5067p c5067p = this.i;
        return hashCode8 + (c5067p != null ? c5067p.hashCode() : 0);
    }

    @Nullable
    public final C5067p i() {
        return this.i;
    }

    @Nullable
    public final String j() {
        return this.a;
    }

    @Nullable
    public final Integer k() {
        return this.f;
    }

    @Nullable
    public final String l() {
        return this.c;
    }

    @Nullable
    public final String m() {
        return this.b;
    }

    @Nullable
    public final C5061j n() {
        return this.h;
    }

    @Nullable
    public final C5063l o() {
        return this.g;
    }

    @Nullable
    public final C5067p p() {
        return this.i;
    }

    @Nullable
    public final String q() {
        return this.d;
    }

    @Nullable
    public final String r() {
        return this.e;
    }

    @NotNull
    public String toString() {
        return "DEC(appName=" + this.a + ", ctaUrl=" + this.b + ", ctaTrackingUrl=" + this.c + ", impressionTrackingUrl=" + this.d + ", skipToDECTrackingUrl=" + this.e + ", appNameFontSize=" + this.f + ", decCta=" + this.g + ", decAppIcon=" + this.h + ", decRating=" + this.i + ')';
    }

    @NotNull
    public final C5060i a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable C5063l c5063l, @Nullable C5061j c5061j, @Nullable C5067p c5067p) {
        return new C5060i(str, str2, str3, str4, str5, num, c5063l, c5061j, c5067p);
    }
}
