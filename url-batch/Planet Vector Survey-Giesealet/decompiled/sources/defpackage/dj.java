package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dj extends t50 implements z00, di {
    public sc0 r;
    public final zo0 s;
    public boolean t;
    public b10 v;
    public zi0 w;
    public boolean x;
    public boolean z;
    public final p01 u = new p01(1);
    public long y = 0;

    public dj(sc0 sc0Var, zo0 zo0Var, boolean z) {
        this.r = sc0Var;
        this.s = zo0Var;
        this.t = z;
    }

    public static final float j0(dj djVar, ta taVar) {
        zi0 zi0Var;
        int compare;
        if (!iz.a(djVar.y, 0L)) {
            l70 l70Var = (l70) djVar.u.e;
            int i = l70Var.f;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = l70Var.d;
                zi0Var = null;
                while (true) {
                    zi0 zi0Var2 = (zi0) ((bj) objArr[i2]).a.a();
                    if (zi0Var2 != null) {
                        long b = zi0Var2.b();
                        long W = px0.W(djVar.y);
                        int ordinal = djVar.r.ordinal();
                        if (ordinal == 0) {
                            compare = Float.compare(fr0.c(b), fr0.c(W));
                        } else {
                            if (ordinal != 1) {
                                g8.c();
                                return 0.0f;
                            }
                            compare = Float.compare(fr0.e(b), fr0.e(W));
                        }
                        if (compare <= 0) {
                            zi0Var = zi0Var2;
                        } else if (zi0Var == null) {
                            zi0Var = zi0Var2;
                        }
                    }
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                }
            } else {
                zi0Var = null;
            }
            if (zi0Var == null) {
                zi0 k0 = djVar.x ? djVar.k0() : null;
                if (k0 != null) {
                    zi0Var = k0;
                }
            }
            long W2 = px0.W(djVar.y);
            int ordinal2 = djVar.r.ordinal();
            if (ordinal2 == 0) {
                float f = zi0Var.b;
                return taVar.a(f, zi0Var.d - f, fr0.c(W2));
            }
            if (ordinal2 == 1) {
                float f2 = zi0Var.a;
                return taVar.a(f2, zi0Var.c - f2, fr0.e(W2));
            }
            g8.c();
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    public final zi0 k0() {
        if (this.q) {
            ea0 Z = nz.Z(this);
            b10 b10Var = this.v;
            if (b10Var != null) {
                if (!b10Var.v()) {
                    b10Var = null;
                }
                if (b10Var != null) {
                    return Z.z(b10Var, false);
                }
            }
        }
        return null;
    }

    public final boolean l0(zi0 zi0Var, long j) {
        long n0 = n0(zi0Var, j);
        return Math.abs(ra0.d(n0)) <= 0.5f && Math.abs(ra0.e(n0)) <= 0.5f;
    }

    @Override // defpackage.z00
    public final void m(long j) {
        int s;
        zi0 k0;
        long j2 = this.y;
        this.y = j;
        int ordinal = this.r.ordinal();
        if (ordinal == 0) {
            s = nz.s((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (ordinal != 1) {
                g8.c();
                return;
            }
            s = nz.s((int) (j >> 32), (int) (j2 >> 32));
        }
        if (s < 0 && (k0 = k0()) != null) {
            zi0 zi0Var = this.w;
            if (zi0Var == null) {
                zi0Var = k0;
            }
            if (!this.z && !this.x && l0(zi0Var, j2) && !l0(k0, j)) {
                this.x = true;
                m0();
            }
            this.w = k0;
        }
    }

    public final void m0() {
        ta taVar = (ta) mz.A(this, va.a);
        if (this.z) {
            g8.s("launchAnimation called when previous animation was running");
            return;
        }
        d31.E(V(), null, new wg(this, new uy0(taVar.b()), taVar, null, 1), 1);
    }

    public final long n0(zi0 zi0Var, long j) {
        long W = px0.W(j);
        int ordinal = this.r.ordinal();
        if (ordinal == 0) {
            ta taVar = (ta) mz.A(this, va.a);
            float f = zi0Var.b;
            return mz.o(0.0f, taVar.a(f, zi0Var.d - f, fr0.c(W)));
        }
        if (ordinal != 1) {
            g8.c();
            return 0L;
        }
        ta taVar2 = (ta) mz.A(this, va.a);
        float f2 = zi0Var.a;
        return mz.o(taVar2.a(f2, zi0Var.c - f2, fr0.e(W)), 0.0f);
    }

    @Override // defpackage.z00
    public final /* synthetic */ void i(b10 b10Var) {
    }
}
