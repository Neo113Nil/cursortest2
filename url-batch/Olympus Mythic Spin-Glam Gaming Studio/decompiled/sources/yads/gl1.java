package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gl1 {
    public final String a;
    public final String b;
    public final fl1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final boolean k;

    public gl1(String str, String str2, fl1 fl1Var, String str3, String str4, Float f, int i, int i2, int i3, String str5) {
        this.a = str;
        this.b = str2;
        this.c = fl1Var;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = str5;
        this.k = Intrinsics.areEqual(str5, "VPAID");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl1)) {
            return false;
        }
        gl1 gl1Var = (gl1) obj;
        return Intrinsics.areEqual(this.a, gl1Var.a) && Intrinsics.areEqual(this.b, gl1Var.b) && this.c == gl1Var.c && Intrinsics.areEqual(this.d, gl1Var.d) && Intrinsics.areEqual(this.e, gl1Var.e) && Intrinsics.areEqual((Object) this.f, (Object) gl1Var.f) && this.g == gl1Var.g && this.h == gl1Var.h && this.i == gl1Var.i && Intrinsics.areEqual(this.j, gl1Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        fl1 fl1Var = this.c;
        int hashCode3 = (hashCode2 + (fl1Var == null ? 0 : fl1Var.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f;
        int a = yd3.a(this.i, yd3.a(this.h, yd3.a(this.g, (hashCode5 + (f == null ? 0 : f.hashCode())) * 31, 31), 31), 31);
        String str4 = this.j;
        return a + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "MediaFile(uri=" + this.a + ", id=" + this.b + ", deliveryMethod=" + this.c + ", mimeType=" + this.d + ", codec=" + this.e + ", vmafMetric=" + this.f + ", height=" + this.g + ", width=" + this.h + ", bitrate=" + this.i + ", apiFramework=" + this.j + ")";
    }
}
