package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fd0 {
    public final is0 a;
    public final j80 b = j80.r;
    public final j80 c = j80.s;
    public final j80 d = j80.t;
    public final j80 e = j80.n;
    public final j80 f = j80.o;
    public final j80 g = j80.p;
    public final j80 h = j80.q;

    public fd0(c3 c3Var) {
        this.a = new is0(c3Var);
    }

    public final void a(ed0 ed0Var, mu muVar, bu buVar) {
        this.a.b(ed0Var, muVar, buVar);
    }

    public final void b() {
        bb0 bb0Var = this.a.h;
        if (bb0Var != null) {
            bb0Var.b();
        }
        is0 is0Var = this.a;
        synchronized (is0Var.g) {
            l70 l70Var = is0Var.f;
            Object[] objArr = l70Var.d;
            int i = l70Var.f;
            for (int i2 = 0; i2 < i; i2++) {
                hs0 hs0Var = (hs0) objArr[i2];
                hs0Var.e.a();
                hs0Var.f.a();
                hs0Var.k.a();
                hs0Var.l.clear();
            }
        }
    }
}
