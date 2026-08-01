package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class s10 {
    public final p10 a;
    public boolean b;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public m40 p;
    public m10 c = m10.h;
    public final f50 o = new f50(this);

    public s10(p10 p10Var) {
        this.a = p10Var;
    }

    public final ea0 a() {
        return (ea0) this.a.F.h;
    }

    public final void b() {
        m10 m10Var = this.a.G.c;
        m10 m10Var2 = m10.f;
        m10 m10Var3 = m10.g;
        if (m10Var == m10Var2 || m10Var == m10Var3) {
            if (this.o.C) {
                g(true);
            } else {
                f(true);
            }
        }
        if (m10Var == m10Var3) {
            m40 m40Var = this.p;
            if (m40Var == null || !m40Var.w) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        m40 m40Var = this.p;
        if (m40Var != null) {
            s10 s10Var = m40Var.i;
            s10Var.c = m10.e;
            p10 p10Var = s10Var.a;
            s10Var.d = false;
            fd0 snapshotObserver = ((f3) mz.Q(p10Var)).getSnapshotObserver();
            k40 k40Var = new k40(m40Var, j);
            snapshotObserver.getClass();
            if (p10Var.j != null) {
                snapshotObserver.a(p10Var, snapshotObserver.b, k40Var);
            } else {
                snapshotObserver.a(p10Var, snapshotObserver.c, k40Var);
            }
            s10Var.e = true;
            s10Var.f = true;
            boolean G = px0.G(p10Var);
            f50 f50Var = s10Var.o;
            if (G) {
                f50Var.x = true;
                f50Var.y = true;
            } else {
                f50Var.w = true;
            }
            s10Var.c = m10.h;
        }
    }

    public final void d(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            p10 n = this.a.n();
            s10 s10Var = n != null ? n.G : null;
            if (s10Var != null) {
                int i3 = s10Var.k;
                if (i == 0) {
                    s10Var.d(i3 - 1);
                } else {
                    s10Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            p10 n = this.a.n();
            s10 s10Var = n != null ? n.G : null;
            if (s10Var != null) {
                int i3 = s10Var.n;
                if (i == 0) {
                    s10Var.e(i3 - 1);
                } else {
                    s10Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.i) {
                d(this.k + 1);
            } else {
                if (z || this.i) {
                    return;
                }
                d(this.k - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (z && !this.j) {
                d(this.k + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.k - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.l) {
                e(this.n + 1);
            } else {
                if (z || this.l) {
                    return;
                }
                e(this.n - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z && !this.m) {
                e(this.n + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.n - 1);
            }
        }
    }

    public final void j() {
        f50 f50Var = this.o;
        s10 s10Var = f50Var.i;
        Object obj = f50Var.t;
        p10 p10Var = this.a;
        if ((obj != null || s10Var.a().f() != null) && f50Var.s) {
            f50Var.s = false;
            f50Var.t = s10Var.a().f();
            p10 n = p10Var.n();
            if (n != null) {
                p10.M(n, false, 7);
            }
        }
        m40 m40Var = this.p;
        if (m40Var != null) {
            s10 s10Var2 = m40Var.i;
            if (m40Var.y == null) {
                h40 t0 = s10Var2.a().t0();
                t0.getClass();
                if (t0.r.f() == null) {
                    return;
                }
            }
            if (m40Var.x) {
                m40Var.x = false;
                h40 t02 = s10Var2.a().t0();
                t02.getClass();
                m40Var.y = t02.r.f();
                if (px0.G(p10Var)) {
                    p10 n2 = p10Var.n();
                    if (n2 != null) {
                        p10.M(n2, false, 7);
                        return;
                    }
                    return;
                }
                p10 n3 = p10Var.n();
                if (n3 != null) {
                    p10.K(n3, false, 7);
                }
            }
        }
    }
}
