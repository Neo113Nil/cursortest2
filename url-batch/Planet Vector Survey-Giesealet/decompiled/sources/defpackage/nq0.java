package defpackage;

import android.graphics.Shader;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class nq0 extends px0 {
    public p01 k;
    public long l = 9205357640488583168L;

    public abstract Shader Y(long j);

    @Override // defpackage.px0
    public final void g(float f, long j, y4 y4Var) {
        p01 p01Var = this.k;
        if (p01Var == null || !fr0.b(this.l, j)) {
            if (fr0.f(j)) {
                this.k = null;
                this.l = 9205357640488583168L;
                p01Var = null;
            } else {
                p01Var = this.k;
                if (p01Var == null) {
                    p01Var = new p01(22, false);
                    this.k = p01Var;
                }
                p01Var.e = Y(j);
                this.k = p01Var;
                this.l = j;
            }
        }
        long c = d31.c(y4Var.a.getColor());
        long j2 = ge.b;
        if (!ge.c(c, j2)) {
            y4Var.e(j2);
        }
        if (!nz.l(y4Var.c, p01Var != null ? (Shader) p01Var.e : null)) {
            y4Var.g(p01Var != null ? (Shader) p01Var.e : null);
        }
        if (r4.getAlpha() / 255.0f == f) {
            return;
        }
        y4Var.c(f);
    }
}
