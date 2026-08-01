package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class x21 extends t50 implements i10 {
    public int r;
    public qu s;

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        yf0 d = b50Var.d(vi.a(this.r != 1 ? 0 : ui.j(j), ui.h(j), this.r == 2 ? ui.i(j) : 0, ui.g(j)));
        int g = rg0.g(d.d, ui.j(j), ui.h(j));
        int g2 = rg0.g(d.e, ui.i(j), ui.g(j));
        return f40Var.h0(g, g2, xp.d, new w21(this, g, d, g2, f40Var));
    }
}
