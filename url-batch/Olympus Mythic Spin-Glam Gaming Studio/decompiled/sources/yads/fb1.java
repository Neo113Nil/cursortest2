package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class fb1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public fb1(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb1)) {
            return false;
        }
        fb1 fb1Var = (fb1) obj;
        return Intrinsics.areEqual(this.a, fb1Var.a) && Intrinsics.areEqual(this.b, fb1Var.b) && this.c == fb1Var.c && this.d == fb1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + yd3.a(this.c, c4.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "InteractiveCreativeFile(html=" + this.a + ", mimeType=" + this.b + ", height=" + this.c + ", width=" + this.d + ")";
    }
}
