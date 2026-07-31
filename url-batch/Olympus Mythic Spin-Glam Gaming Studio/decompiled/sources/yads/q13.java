package yads;

/* loaded from: classes13.dex */
public final class q13 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public q13(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i3 * i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q13)) {
            return false;
        }
        q13 q13Var = (q13) obj;
        return this.a == q13Var.a && this.b == q13Var.b && this.c == q13Var.c && this.d == q13Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + yd3.a(this.c, yd3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "SmartCenter(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
