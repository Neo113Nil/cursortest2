package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w00 {
    public final i10 a;
    public final y00 b;
    public final y00 c;
    public final y00 d;
    public final n10 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Float k;
    public final String l;
    public final String m;
    public final String n;
    public final k10 o;
    public final boolean p;

    public w00(i10 i10Var, y00 y00Var, y00 y00Var2, y00 y00Var3, n10 n10Var, String str, String str2, String str3, String str4, String str5, Float f, String str6, String str7, String str8, k10 k10Var, boolean z) {
        this.a = i10Var;
        this.b = y00Var;
        this.c = y00Var2;
        this.d = y00Var3;
        this.e = n10Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = f;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = k10Var;
        this.p = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w00)) {
            return false;
        }
        w00 w00Var = (w00) obj;
        return Intrinsics.areEqual(this.a, w00Var.a) && Intrinsics.areEqual(this.b, w00Var.b) && Intrinsics.areEqual(this.c, w00Var.c) && Intrinsics.areEqual(this.d, w00Var.d) && Intrinsics.areEqual(this.e, w00Var.e) && Intrinsics.areEqual(this.f, w00Var.f) && Intrinsics.areEqual(this.g, w00Var.g) && Intrinsics.areEqual(this.h, w00Var.h) && Intrinsics.areEqual(this.i, w00Var.i) && Intrinsics.areEqual(this.j, w00Var.j) && Intrinsics.areEqual((Object) this.k, (Object) w00Var.k) && Intrinsics.areEqual(this.l, w00Var.l) && Intrinsics.areEqual(this.m, w00Var.m) && Intrinsics.areEqual(this.n, w00Var.n) && Intrinsics.areEqual(this.o, w00Var.o) && this.p == w00Var.p;
    }

    public final int hashCode() {
        i10 i10Var = this.a;
        int hashCode = (i10Var == null ? 0 : i10Var.hashCode()) * 31;
        y00 y00Var = this.b;
        int hashCode2 = (hashCode + (y00Var == null ? 0 : y00Var.hashCode())) * 31;
        y00 y00Var2 = this.c;
        int hashCode3 = (hashCode2 + (y00Var2 == null ? 0 : y00Var2.hashCode())) * 31;
        y00 y00Var3 = this.d;
        int hashCode4 = (hashCode3 + (y00Var3 == null ? 0 : y00Var3.hashCode())) * 31;
        n10 n10Var = this.e;
        int hashCode5 = (hashCode4 + (n10Var == null ? 0 : n10Var.hashCode())) * 31;
        String str = this.f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.k;
        int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        String str6 = this.l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        k10 k10Var = this.o;
        return Boolean.hashCode(this.p) + ((hashCode14 + (k10Var != null ? k10Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreNativeAdAssets(media=" + this.a + ", favicon=" + this.b + ", icon=" + this.c + ", image=" + this.d + ", closeButton=" + this.e + ", age=" + this.f + ", body=" + this.g + ", callToAction=" + this.h + ", domain=" + this.i + ", price=" + this.j + ", rating=" + this.k + ", reviewCount=" + this.l + ", sponsored=" + this.m + ", title=" + this.n + ", warning=" + this.o + ", feedbackAvailable=" + this.p + ")";
    }
}
