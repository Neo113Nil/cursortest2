package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y00 {
    public final s02 a;
    public final String b;
    public final int c;
    public final int d;

    public y00(s02 s02Var, String str, int i, int i2) {
        this.a = s02Var;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return Intrinsics.areEqual(this.a, y00Var.a) && Intrinsics.areEqual(this.b, y00Var.b) && this.c == y00Var.c && this.d == y00Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + yd3.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "CoreNativeAdImage(getDrawable=" + this.a + ", sizeType=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
