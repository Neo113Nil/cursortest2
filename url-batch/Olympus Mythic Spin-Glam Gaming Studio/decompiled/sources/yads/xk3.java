package yads;

/* loaded from: classes14.dex */
public final class xk3 {
    public final int a;
    public final int b;

    public xk3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk3)) {
            return false;
        }
        xk3 xk3Var = (xk3) obj;
        return this.a == xk3Var.a && this.b == xk3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.a + ", height=" + this.b + ")";
    }
}
