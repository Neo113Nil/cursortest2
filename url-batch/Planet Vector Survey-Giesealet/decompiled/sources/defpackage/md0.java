package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class md0 {
    public y4 a;
    public q9 b;
    public float c = 1.0f;
    public c10 d = c10.d;

    public abstract void a(float f);

    public abstract void b(q9 q9Var);

    public final void c(r10 r10Var, long j, float f, q9 q9Var) {
        nc ncVar = r10Var.d;
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!nz.l(this.b, q9Var)) {
            b(q9Var);
            this.b = q9Var;
        }
        c10 layoutDirection = r10Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (r10Var.c() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (r10Var.c() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((p01) ncVar.e.e).n(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(r10Var);
                }
            } finally {
                ((p01) ncVar.e.e).n(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(r10 r10Var);
}
