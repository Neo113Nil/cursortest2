package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class gm extends tc {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public ec t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public gm() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.tc
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.tc
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.tc
    public final void Q(vp vpVar, boolean z) {
        if (this.T == null) {
            return;
        }
        ec ecVar = this.t0;
        vpVar.getClass();
        int n = vp.n(ecVar);
        if (this.u0 == 1) {
            this.Y = n;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        ec[] ecVarArr = this.Q;
        int length = ecVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ecVarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.tc
    public final void b(vp vpVar, boolean z) {
        uc ucVar = (uc) this.T;
        if (ucVar == null) {
            return;
        }
        Object i = ucVar.i(2);
        Object i2 = ucVar.i(4);
        tc tcVar = this.T;
        boolean z2 = tcVar != null && tcVar.p0[0] == 2;
        if (this.u0 == 0) {
            i = ucVar.i(3);
            i2 = ucVar.i(5);
            tc tcVar2 = this.T;
            z2 = tcVar2 != null && tcVar2.p0[1] == 2;
        }
        if (this.v0) {
            ec ecVar = this.t0;
            if (ecVar.c) {
                o20 k = vpVar.k(ecVar);
                vpVar.d(k, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        vpVar.f(vpVar.k(i2), k, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    o20 k2 = vpVar.k(i2);
                    vpVar.f(k, vpVar.k(i), 0, 5);
                    vpVar.f(k2, k, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            o20 k3 = vpVar.k(this.t0);
            vpVar.e(k3, vpVar.k(i), this.r0, 8);
            if (z2) {
                vpVar.f(vpVar.k(i2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            o20 k4 = vpVar.k(this.t0);
            o20 k5 = vpVar.k(i2);
            vpVar.e(k4, k5, -this.s0, 8);
            if (z2) {
                vpVar.f(k4, vpVar.k(i), 0, 5);
                vpVar.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            o20 k6 = vpVar.k(this.t0);
            o20 k7 = vpVar.k(i2);
            float f = this.q0;
            m6 l = vpVar.l();
            l.d.g(k6, -1.0f);
            l.d.g(k7, f);
            vpVar.c(l);
        }
    }

    @Override // defpackage.tc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.tc
    public final ec i(int i) {
        int h = n20.h(i);
        if (h != 1) {
            if (h != 2) {
                if (h != 3) {
                    if (h != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
