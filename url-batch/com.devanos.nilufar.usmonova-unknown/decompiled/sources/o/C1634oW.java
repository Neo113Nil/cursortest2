package o;

/* renamed from: o.oW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1634oW {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public C1634oW(double d, double d2, double d3, double d4, double d5) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(0.0d) || Double.isNaN(0.0d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1634oW)) {
            return false;
        }
        C1634oW c1634oW = (C1634oW) obj;
        return Double.compare(this.a, c1634oW.a) == 0 && Double.compare(this.b, c1634oW.b) == 0 && Double.compare(this.c, c1634oW.c) == 0 && Double.compare(this.d, c1634oW.d) == 0 && Double.compare(this.e, c1634oW.e) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(0.0d) + ((Double.hashCode(0.0d) + ((Double.hashCode(this.e) + ((Double.hashCode(this.d) + ((Double.hashCode(this.c) + ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=0.0, f=0.0)";
    }
}
