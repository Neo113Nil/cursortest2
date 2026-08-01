package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qb extends t50 implements pa0, hb, no {
    public final rb r;
    public boolean s;
    public final f2 t;

    public qb(rb rbVar, f2 f2Var) {
        this.r = rbVar;
        this.t = f2Var;
        rbVar.d = this;
    }

    @Override // defpackage.no
    public final void R() {
        j0();
    }

    @Override // defpackage.hb
    public final sl a() {
        return nz.a0(this).y;
    }

    @Override // defpackage.t50
    public final void a0() {
        j0();
    }

    @Override // defpackage.no
    public final void b(r10 r10Var) {
        boolean z = this.s;
        rb rbVar = this.r;
        if (!z) {
            rbVar.e = null;
            nk.H(this, new a3(2, this, rbVar));
            if (rbVar.e == null) {
                throw y6.u("DrawResult not defined, did you forget to call onDraw?");
            }
            this.s = true;
        }
        p01 p01Var = rbVar.e;
        p01Var.getClass();
        ((mu) p01Var.e).c(r10Var);
    }

    @Override // defpackage.hb
    public final long c() {
        return px0.W(nz.Y(this, 128).f);
    }

    @Override // defpackage.t50
    public final void c0() {
        j0();
    }

    @Override // defpackage.t50
    public final void d0() {
        j0();
    }

    @Override // defpackage.hb
    public final c10 getLayoutDirection() {
        return nz.a0(this).z;
    }

    public final void j0() {
        this.s = false;
        this.r.e = null;
        mz.H(this);
    }

    @Override // defpackage.pa0
    public final void u() {
        j0();
    }

    @Override // defpackage.t50
    public final void b0() {
    }
}
