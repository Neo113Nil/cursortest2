package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hz0 extends md0 {
    public final ce0 e = ud0.o(new fr0(0));
    public final ce0 f = ud0.o(Boolean.FALSE);
    public final bz0 g;
    public final zd0 h;
    public float i;
    public q9 j;
    public int k;

    public hz0(wv wvVar) {
        bz0 bz0Var = new bz0(wvVar);
        bz0Var.f = new b(21, this);
        this.g = bz0Var;
        this.h = new zd0(0);
        this.i = 1.0f;
        this.k = -1;
    }

    @Override // defpackage.md0
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.md0
    public final void b(q9 q9Var) {
        this.j = q9Var;
    }

    @Override // defpackage.md0
    public final long d() {
        return ((fr0) this.e.getValue()).a;
    }

    @Override // defpackage.md0
    public final void e(r10 r10Var) {
        nc ncVar = r10Var.d;
        q9 q9Var = this.j;
        bz0 bz0Var = this.g;
        if (q9Var == null) {
            q9Var = (q9) bz0Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && r10Var.getLayoutDirection() == c10.e) {
            long D = ncVar.D();
            t7 t7Var = ncVar.e;
            long r = t7Var.r();
            t7Var.p().i();
            try {
                ((p01) t7Var.e).u(-1.0f, 1.0f, D);
                bz0Var.e(r10Var, this.i, q9Var);
            } finally {
                t7Var.p().g();
                t7Var.B(r);
            }
        } else {
            bz0Var.e(r10Var, this.i, q9Var);
        }
        this.k = this.h.g();
    }
}
