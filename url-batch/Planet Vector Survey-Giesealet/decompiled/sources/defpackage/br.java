package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class br extends t50 implements i10 {
    public int r;
    public float s;

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        int j2;
        int h;
        int i;
        int g;
        if (!ui.d(j) || this.r == 1) {
            j2 = ui.j(j);
            h = ui.h(j);
        } else {
            j2 = rg0.g(Math.round(ui.h(j) * this.s), ui.j(j), ui.h(j));
            h = j2;
        }
        if (!ui.c(j) || this.r == 2) {
            i = ui.i(j);
            g = ui.g(j);
        } else {
            i = rg0.g(Math.round(ui.g(j) * this.s), ui.i(j), ui.g(j));
            g = i;
        }
        yf0 d = b50Var.d(vi.a(j2, h, i, g));
        return f40Var.h0(d.d, d.e, xp.d, new hq(d, 2));
    }
}
