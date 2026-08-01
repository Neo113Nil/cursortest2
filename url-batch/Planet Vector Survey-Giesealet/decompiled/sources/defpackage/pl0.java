package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class pl0 extends t50 implements di, no, z00 {
    public final r60 r;
    public final boolean s;
    public final float t;
    public final p01 u;
    public final pl v;
    public w4 w;
    public float x;
    public boolean z;
    public long y = 0;
    public final x60 A = new x60();

    public pl0(r60 r60Var, boolean z, float f, p01 p01Var, pl plVar) {
        this.r = r60Var;
        this.s = z;
        this.t = f;
        this.u = p01Var;
        this.v = plVar;
    }

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    @Override // defpackage.t50
    public final void Z() {
        d31.E(V(), null, new c(this, null, 11), 3);
    }

    @Override // defpackage.no
    public final void b(r10 r10Var) {
        r10Var.b();
        w4 w4Var = this.w;
        if (w4Var != null) {
            w4Var.c(r10Var, this.x, this.u.o());
        }
        k0(r10Var);
    }

    public abstract void j0(qh0 qh0Var, long j, float f);

    public abstract void k0(r10 r10Var);

    public final void l0(sh0 sh0Var) {
        if (sh0Var instanceof qh0) {
            j0((qh0) sh0Var, this.y, this.x);
        } else if (sh0Var instanceof rh0) {
            m0(((rh0) sh0Var).a);
        } else if (sh0Var instanceof ph0) {
            m0(((ph0) sh0Var).a);
        }
    }

    @Override // defpackage.z00
    public final void m(long j) {
        this.z = true;
        sl slVar = nz.a0(this).y;
        this.y = px0.W(j);
        float f = this.t;
        this.x = Float.isNaN(f) ? yc0.f(slVar, this.s, this.y) : slVar.o(f);
        x60 x60Var = this.A;
        Object[] objArr = x60Var.a;
        int i = x60Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            l0((sh0) objArr[i2]);
        }
        x60Var.c();
    }

    public abstract void m0(qh0 qh0Var);

    @Override // defpackage.no
    public final /* synthetic */ void R() {
    }

    @Override // defpackage.z00
    public final /* synthetic */ void i(b10 b10Var) {
    }
}
