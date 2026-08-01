package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ry0 extends t50 implements i10 {
    public float r;
    public float s;

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        int j2;
        int i = 0;
        if (jn.a(this.r, Float.NaN) || ui.j(j) != 0) {
            j2 = ui.j(j);
        } else {
            j2 = y6.c(this.r, f40Var);
            int h = ui.h(j);
            if (j2 > h) {
                j2 = h;
            }
            if (j2 < 0) {
                j2 = 0;
            }
        }
        int h2 = ui.h(j);
        if (jn.a(this.s, Float.NaN) || ui.i(j) != 0) {
            i = ui.i(j);
        } else {
            int c = y6.c(this.s, f40Var);
            int g = ui.g(j);
            if (c > g) {
                c = g;
            }
            if (c >= 0) {
                i = c;
            }
        }
        yf0 d = b50Var.d(vi.a(j2, h2, i, ui.g(j)));
        return f40Var.h0(d.d, d.e, xp.d, new hq(d, 8));
    }
}
