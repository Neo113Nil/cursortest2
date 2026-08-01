package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nr implements lr {
    public final int a;
    public final int b;
    public final ro c;
    public final long d;
    public final long e;

    public nr(int i, int i2, ro roVar) {
        this.a = i;
        this.b = i2;
        this.c = roVar;
        this.d = i * 1000000;
        this.e = i2 * 1000000;
    }

    @Override // defpackage.c7
    public final jz0 a(j3 j3Var) {
        return new k2((lr) this);
    }

    @Override // defpackage.lr
    public final long b(float f, float f2, float f3) {
        return (this.b + this.a) * 1000000;
    }

    @Override // defpackage.lr
    public final float c(float f, float f2, float f3, long j) {
        long j2 = j - this.e;
        long j3 = this.d;
        if (0 > j3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum 0.");
        }
        if (j2 < 0) {
            j2 = 0;
        } else if (j2 > j3) {
            j2 = j3;
        }
        float f4 = this.a == 0 ? 1.0f : j2 / j3;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        float a = this.c.a(f4);
        j3 j3Var = dz0.a;
        return (f2 * a) + ((1.0f - a) * f);
    }

    @Override // defpackage.lr
    public final float d(float f, float f2, float f3, long j) {
        long j2 = j - this.e;
        long j3 = this.d;
        if (0 > j3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum 0.");
        }
        long j4 = j2 < 0 ? 0L : j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return 0.0f;
        }
        if (j4 == 0) {
            return f3;
        }
        return (c(f, f2, f3, j4) - c(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }

    @Override // defpackage.lr
    public final float e(float f, float f2, float f3) {
        return d(f, f2, f3, b(f, f2, f3));
    }
}
