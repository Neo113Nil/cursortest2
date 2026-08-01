package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hd0 extends t50 implements i10 {
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        int c = y6.c(this.t, f40Var) + y6.c(this.r, f40Var);
        int c2 = y6.c(this.u, f40Var) + y6.c(this.s, f40Var);
        yf0 d = b50Var.d(vi.h(-c, -c2, j));
        return f40Var.h0(vi.f(j, d.d + c), vi.e(j, d.e + c2), xp.d, new y5(this, d, f40Var, 8));
    }
}
