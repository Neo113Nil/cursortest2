package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class q31 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final y13 e;
    public final boolean f;
    public final String g;

    public /* synthetic */ q31(int i, int i2, String str, String str2, int i3) {
        this(i, i2, str, (i3 & 8) != 0 ? null : str2, null, true, null);
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q31)) {
            return false;
        }
        q31 q31Var = (q31) obj;
        return this.a == q31Var.a && this.b == q31Var.b && Intrinsics.areEqual(this.c, q31Var.c) && Intrinsics.areEqual(this.d, q31Var.d) && Intrinsics.areEqual(this.e, q31Var.e) && this.f == q31Var.f && Intrinsics.areEqual(this.g, q31Var.g);
    }

    public final int hashCode() {
        int a = c4.a(yd3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        y13 y13Var = this.e;
        int hashCode2 = (Boolean.hashCode(this.f) + ((hashCode + (y13Var == null ? 0 : y13Var.hashCode())) * 31)) * 31;
        String str2 = this.g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ImageValue(width=" + this.a + ", height=" + this.b + ", url=" + this.c + ", sizeType=" + this.d + ", smartCenterSettings=" + this.e + ", preload=" + this.f + ", preview=" + this.g + ")";
    }

    public q31(int i, int i2, String str, String str2, y13 y13Var, boolean z, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = y13Var;
        this.f = z;
        this.g = str3;
    }
}
