package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zl0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        ld0.a(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public zl0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl0)) {
            return false;
        }
        zl0 zl0Var = (zl0) obj;
        return Float.compare(this.a, zl0Var.a) == 0 && Float.compare(this.b, zl0Var.b) == 0 && Float.compare(this.c, zl0Var.c) == 0 && Float.compare(this.d, zl0Var.d) == 0 && nk.p(this.e, zl0Var.e) && nk.p(this.f, zl0Var.f) && nk.p(this.g, zl0Var.g) && nk.p(this.h, zl0Var.h);
    }

    public final int hashCode() {
        int t = y6.t(this.d, y6.t(this.c, y6.t(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
        long j = this.e;
        long j2 = this.f;
        int i = (((int) (j2 ^ (j2 >>> 32))) + ((((int) (j ^ (j >>> 32))) + t) * 31)) * 31;
        long j3 = this.g;
        int i2 = (((int) (j3 ^ (j3 >>> 32))) + i) * 31;
        long j4 = this.h;
        return ((int) (j4 ^ (j4 >>> 32))) + i2;
    }

    public final String toString() {
        String str = x40.V(this.a) + ", " + x40.V(this.b) + ", " + x40.V(this.c) + ", " + x40.V(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean p = nk.p(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!p || !nk.p(j2, j3) || !nk.p(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) nk.O(j)) + ", topRight=" + ((Object) nk.O(j2)) + ", bottomRight=" + ((Object) nk.O(j3)) + ", bottomLeft=" + ((Object) nk.O(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + x40.V(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + x40.V(Float.intBitsToFloat(i)) + ", y=" + x40.V(Float.intBitsToFloat(i2)) + ')';
    }
}
