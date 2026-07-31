package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class g {
    public static final int f = 0;

    @Nullable
    public final String a;

    @Nullable
    public final Integer b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @NotNull
    public final h e;

    public g(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @NotNull h child) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = child;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
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

    @NotNull
    public final h e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.a, gVar.a) && Intrinsics.areEqual(this.b, gVar.b) && Intrinsics.areEqual(this.c, gVar.c) && Intrinsics.areEqual(this.d, gVar.d) && Intrinsics.areEqual(this.e, gVar.e);
    }

    @Nullable
    public final String f() {
        return this.c;
    }

    @Nullable
    public final String g() {
        return this.d;
    }

    @NotNull
    public final h h() {
        return this.e;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    @Nullable
    public final String i() {
        return this.a;
    }

    @Nullable
    public final Integer j() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "Creative(id=" + this.a + ", sequence=" + this.b + ", adId=" + this.c + ", apiFramework=" + this.d + ", child=" + this.e + ')';
    }

    @NotNull
    public final g a(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @NotNull h child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return new g(str, num, str2, str3, child);
    }

    public static /* synthetic */ g a(g gVar, String str, Integer num, String str2, String str3, h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gVar.a;
        }
        if ((i & 2) != 0) {
            num = gVar.b;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = gVar.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = gVar.d;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            hVar = gVar.e;
        }
        return gVar.a(str, num2, str4, str5, hVar);
    }
}
