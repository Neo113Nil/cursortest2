package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rk extends t50 implements no {
    public final r60 r;
    public boolean s;
    public boolean t;
    public boolean u;

    public rk(r60 r60Var) {
        this.r = r60Var;
    }

    @Override // defpackage.t50
    public final void Z() {
        d31.E(V(), null, new qk(this, null, 0), 3);
    }

    @Override // defpackage.no
    public final void b(r10 r10Var) {
        r10Var.b();
        nc ncVar = r10Var.d;
        if (this.s) {
            y6.q(r10Var, ge.b(ge.b, 0.3f), ncVar.e.r(), 122);
        } else if (this.t || this.u) {
            y6.q(r10Var, ge.b(ge.b, 0.1f), ncVar.e.r(), 122);
        }
    }

    @Override // defpackage.no
    public final /* synthetic */ void R() {
    }
}
