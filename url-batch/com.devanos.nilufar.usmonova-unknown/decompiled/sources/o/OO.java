package o;

/* loaded from: classes.dex */
public final class OO {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        long j = AbstractC0111Ee.a;
        float b = AbstractC0111Ee.b(j);
        float c = AbstractC0111Ee.c(j);
        Float.floatToRawIntBits(b);
        Float.floatToRawIntBits(c);
    }

    public OO(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OO)) {
            return false;
        }
        OO oo = (OO) obj;
        return Float.compare(this.a, oo.a) == 0 && Float.compare(this.b, oo.b) == 0 && Float.compare(this.c, oo.c) == 0 && Float.compare(this.d, oo.d) == 0 && AbstractC0111Ee.a(this.e, oo.e) && AbstractC0111Ee.a(this.f, oo.f) && AbstractC0111Ee.a(this.g, oo.g) && AbstractC0111Ee.a(this.h, oo.h);
    }

    public final int hashCode() {
        int e = AbstractC1888sN.e(this.d, AbstractC1888sN.e(this.c, AbstractC1888sN.e(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        int i = AbstractC0111Ee.b;
        return Long.hashCode(this.h) + ((Long.hashCode(this.g) + ((Long.hashCode(this.f) + ((Long.hashCode(this.e) + e) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = AbstractC1052fg.X(this.a) + ", " + AbstractC1052fg.X(this.b) + ", " + AbstractC1052fg.X(this.c) + ", " + AbstractC1052fg.X(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean a = AbstractC0111Ee.a(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!a || !AbstractC0111Ee.a(j2, j3) || !AbstractC0111Ee.a(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC0111Ee.d(j)) + ", topRight=" + ((Object) AbstractC0111Ee.d(j2)) + ", bottomRight=" + ((Object) AbstractC0111Ee.d(j3)) + ", bottomLeft=" + ((Object) AbstractC0111Ee.d(j4)) + ')';
        }
        if (AbstractC0111Ee.b(j) == AbstractC0111Ee.c(j)) {
            return "RoundRect(rect=" + str + ", radius=" + AbstractC1052fg.X(AbstractC0111Ee.b(j)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + AbstractC1052fg.X(AbstractC0111Ee.b(j)) + ", y=" + AbstractC1052fg.X(AbstractC0111Ee.c(j)) + ')';
    }
}
