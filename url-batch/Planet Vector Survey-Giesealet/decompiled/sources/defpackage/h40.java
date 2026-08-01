package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class h40 extends f40 implements b50 {
    public final ea0 r;
    public LinkedHashMap t;
    public e40 v;
    public final w60 w;
    public long s = 0;
    public final i40 u = new i40(this);

    public h40(ea0 ea0Var) {
        this.r = ea0Var;
        w60 w60Var = ma0.a;
        this.w = new w60();
    }

    public static final void k0(h40 h40Var, e40 e40Var) {
        LinkedHashMap linkedHashMap;
        if (e40Var != null) {
            h40Var.N((e40Var.b() & 4294967295L) | (e40Var.d() << 32));
        } else {
            h40Var.N(0L);
        }
        if (!nz.l(h40Var.v, e40Var) && e40Var != null && ((((linkedHashMap = h40Var.t) != null && !linkedHashMap.isEmpty()) || !e40Var.a().isEmpty()) && !nz.l(e40Var.a(), h40Var.t))) {
            m40 m40Var = h40Var.r.r.G.p;
            m40Var.getClass();
            m40Var.t.f();
            LinkedHashMap linkedHashMap2 = h40Var.t;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                h40Var.t = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(e40Var.a());
        }
        h40Var.v = e40Var;
    }

    @Override // defpackage.yf0
    public final void M(long j, float f, mu muVar) {
        m0(j);
        if (this.m) {
            return;
        }
        l0();
    }

    @Override // defpackage.f40
    public final f40 W() {
        ea0 ea0Var = this.r.s;
        if (ea0Var != null) {
            return ea0Var.t0();
        }
        return null;
    }

    @Override // defpackage.f40
    public final b10 X() {
        return this.u;
    }

    @Override // defpackage.f40
    public final boolean Y() {
        return this.v != null;
    }

    @Override // defpackage.f40
    public final p10 Z() {
        return this.r.r;
    }

    @Override // defpackage.sl
    public final float a() {
        return this.r.a();
    }

    @Override // defpackage.f40
    public final e40 a0() {
        e40 e40Var = this.v;
        if (e40Var != null) {
            return e40Var;
        }
        throw y6.u("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.f40
    public final f40 b0() {
        ea0 ea0Var = this.r.t;
        if (ea0Var != null) {
            return ea0Var.t0();
        }
        return null;
    }

    @Override // defpackage.f40
    public final long c0() {
        return this.s;
    }

    @Override // defpackage.yf0, defpackage.b50
    public final Object f() {
        return this.r.f();
    }

    @Override // defpackage.f40
    public final boolean f0() {
        return true;
    }

    @Override // defpackage.f40
    public final c10 getLayoutDirection() {
        return this.r.r.z;
    }

    @Override // defpackage.sl
    public final float h() {
        return this.r.h();
    }

    @Override // defpackage.f40
    public final void j0() {
        M(this.s, 0.0f, null);
    }

    public void l0() {
        a0().e();
    }

    public final void m0(long j) {
        if (!bz.a(this.s, j)) {
            this.s = j;
            ea0 ea0Var = this.r;
            m40 m40Var = ea0Var.r.G.p;
            if (m40Var != null) {
                m40Var.S();
            }
            f40.e0(ea0Var);
        }
        if (this.n) {
            return;
        }
        T(a0());
    }

    public final long n0(h40 h40Var, boolean z) {
        long j = 0;
        while (!this.equals(h40Var)) {
            if (!this.l || !z) {
                j = bz.c(j, this.s);
            }
            ea0 ea0Var = this.r.t;
            ea0Var.getClass();
            this = ea0Var.t0();
            this.getClass();
        }
        return j;
    }
}
