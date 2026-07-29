package o;

/* renamed from: o.h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150h8 {
    public final float a;
    public final float b;

    public C1150h8(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final long a(long j, long j2, EnumC2057uy enumC2057uy) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        EnumC2057uy enumC2057uy2 = EnumC2057uy.h;
        float f3 = this.a;
        if (enumC2057uy != enumC2057uy2) {
            f3 *= -1;
        }
        float f4 = 1;
        return AbstractC1305jX.c(Math.round((f3 + f4) * f), Math.round((f4 + this.b) * f2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1150h8)) {
            return false;
        }
        C1150h8 c1150h8 = (C1150h8) obj;
        return Float.compare(this.a, c1150h8.a) == 0 && Float.compare(this.b, c1150h8.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ')';
    }
}
