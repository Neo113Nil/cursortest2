package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class k10 extends ea0 {
    public static final y4 S;
    public i10 Q;
    public j10 R;

    static {
        y4 d = a50.d();
        d.e(ge.e);
        d.a.setStrokeWidth(1.0f);
        d.j(1);
        S = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k10(p10 p10Var, i10 i10Var) {
        super(p10Var);
        this.Q = i10Var;
        this.R = p10Var.j != null ? new j10(this) : null;
        if ((((t50) i10Var).d.f & 512) == 0) {
            return;
        }
        g8.q();
        throw null;
    }

    @Override // defpackage.ea0
    public final void L0(kc kcVar, nv nvVar) {
        ea0 ea0Var;
        ea0 ea0Var2 = this.s;
        ea0Var2.getClass();
        ea0Var2.o0(kcVar, nvVar);
        if (!((f3) mz.Q(this.r)).getShowLayoutBounds() || (ea0Var = this.s) == null) {
            return;
        }
        if (iz.a(this.f, ea0Var.f) && bz.a(ea0Var.C, 0L)) {
            return;
        }
        long j = this.f;
        kcVar.n(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, S);
    }

    @Override // defpackage.yf0
    public final void M(long j, float f, mu muVar) {
        M0(j, f, muVar);
        if (this.m) {
            return;
        }
        I0();
        a0().e();
        this.s.getClass();
    }

    @Override // defpackage.f40
    public final int R(lw lwVar) {
        j10 j10Var = this.R;
        if (j10Var == null) {
            return nz.i(this, lwVar);
        }
        w60 w60Var = j10Var.w;
        int d = w60Var.d(lwVar);
        if (d >= 0) {
            return w60Var.c[d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0(i10 i10Var) {
        if (i10Var.equals(this.Q) || (((t50) i10Var).d.f & 512) == 0) {
            this.Q = i10Var;
        } else {
            g8.q();
        }
    }

    @Override // defpackage.b50
    public final yf0 d(long j) {
        O(j);
        i10 i10Var = this.Q;
        ea0 ea0Var = this.s;
        ea0Var.getClass();
        P0(i10Var.d(this, ea0Var, j));
        H0();
        return this;
    }

    @Override // defpackage.ea0
    public final void q0() {
        if (this.R == null) {
            this.R = new j10(this);
        }
    }

    @Override // defpackage.ea0
    public final h40 t0() {
        return this.R;
    }

    @Override // defpackage.ea0
    public final t50 v0() {
        return ((t50) this.Q).d;
    }
}
