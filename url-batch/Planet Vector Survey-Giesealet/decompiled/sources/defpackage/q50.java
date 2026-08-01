package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q50 extends t50 implements di, i10 {
    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        float f = ((jn) mz.A(this, lz.a)).d;
        if (f < 0.0f) {
            f = 0.0f;
        }
        yf0 d = b50Var.d(j);
        boolean z = this.q && !Float.isNaN(f) && Float.compare(f, 0.0f) > 0;
        int c = Float.isNaN(f) ? 0 : y6.c(f, f40Var);
        int i = d.d;
        if (z) {
            i = Math.max(i, c);
        }
        int i2 = d.e;
        if (z) {
            i2 = Math.max(i2, c);
        }
        return f40Var.h0(i, i2, xp.d, new ry(i, d, i2));
    }
}
