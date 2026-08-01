package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zi0 {
    public static final zi0 e = new zi0(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public zi0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final long a() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long b() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final zi0 c(zi0 zi0Var) {
        return new zi0(Math.max(this.a, zi0Var.a), Math.max(this.b, zi0Var.b), Math.min(this.c, zi0Var.c), Math.min(this.d, zi0Var.d));
    }

    public final zi0 d(float f, float f2) {
        return new zi0(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final zi0 e(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new zi0(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi0)) {
            return false;
        }
        zi0 zi0Var = (zi0) obj;
        return Float.compare(this.a, zi0Var.a) == 0 && Float.compare(this.b, zi0Var.b) == 0 && Float.compare(this.c, zi0Var.c) == 0 && Float.compare(this.d, zi0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + y6.t(this.c, y6.t(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + x40.V(this.a) + ", " + x40.V(this.b) + ", " + x40.V(this.c) + ", " + x40.V(this.d) + ')';
    }
}
