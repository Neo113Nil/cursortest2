package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jd0 extends t50 implements i10 {
    public id0 r;

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        id0 id0Var = this.r;
        c10 layoutDirection = f40Var.getLayoutDirection();
        c10 c10Var = c10.d;
        if (Float.compare(layoutDirection == c10Var ? id0Var.a : id0Var.c, 0.0f) >= 0 && Float.compare(this.r.b, 0.0f) >= 0) {
            id0 id0Var2 = this.r;
            if (Float.compare(f40Var.getLayoutDirection() == c10Var ? id0Var2.c : id0Var2.a, 0.0f) >= 0 && Float.compare(this.r.d, 0.0f) >= 0) {
                id0 id0Var3 = this.r;
                int c = y6.c(f40Var.getLayoutDirection() == c10Var ? id0Var3.a : id0Var3.c, f40Var);
                id0 id0Var4 = this.r;
                int c2 = y6.c(f40Var.getLayoutDirection() == c10Var ? id0Var4.c : id0Var4.a, f40Var) + c;
                int c3 = y6.c(this.r.d, f40Var) + y6.c(this.r.b, f40Var);
                yf0 d = b50Var.d(vi.h(-c2, -c3, j));
                return f40Var.h0(vi.f(j, d.d + c2), vi.e(j, d.e + c3), xp.d, new y5(d, f40Var, this, 9));
            }
        }
        g8.r("Padding must be non-negative");
        return null;
    }
}
