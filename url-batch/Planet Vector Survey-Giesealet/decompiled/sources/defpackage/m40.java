package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class m40 extends yf0 implements b50, g2, g60 {
    public final s10 i;
    public boolean j;
    public boolean n;
    public boolean o;
    public ui p;
    public mu r;
    public boolean w;
    public Object y;
    public boolean z;
    public int k = Integer.MAX_VALUE;
    public int l = Integer.MAX_VALUE;
    public n10 m = n10.f;
    public long q = 0;
    public j40 s = j40.f;
    public final q10 t = new q10(this, 1);
    public final l70 u = new l70(new m40[16]);
    public boolean v = true;
    public boolean x = true;

    public m40(s10 s10Var) {
        this.i = s10Var;
        this.y = s10Var.o.t;
    }

    @Override // defpackage.g2
    public final q10 B() {
        return this.t;
    }

    @Override // defpackage.g2
    public final void C() {
        p10.K(this.i.a, false, 7);
    }

    @Override // defpackage.yf0
    public final void M(long j, float f, mu muVar) {
        V(j, muVar);
    }

    public final void Q(boolean z) {
        s10 s10Var = this.i;
        if (z && s10Var.b) {
            return;
        }
        if (z || s10Var.b) {
            this.s = j40.f;
            l70 s = s10Var.a.s();
            Object[] objArr = s.d;
            int i = s.f;
            for (int i2 = 0; i2 < i; i2++) {
                m40 m40Var = ((p10) objArr[i2]).G.p;
                m40Var.getClass();
                m40Var.Q(true);
            }
        }
    }

    public final void R() {
        j40 j40Var = this.s;
        s10 s10Var = this.i;
        boolean z = s10Var.b;
        p10 p10Var = s10Var.a;
        j40 j40Var2 = j40.d;
        if (z) {
            this.s = j40.e;
        } else {
            this.s = j40Var2;
        }
        if (j40Var != j40Var2 && s10Var.d) {
            p10.K(p10Var, true, 6);
        }
        l70 s = p10Var.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var2 = (p10) objArr[i2];
            m40 m40Var = p10Var2.G.p;
            if (m40Var == null) {
                g8.r("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (m40Var.l != Integer.MAX_VALUE) {
                m40Var.R();
                p10.N(p10Var2);
            }
        }
    }

    public final void S() {
        s10 s10Var = this.i;
        if (s10Var.n > 0) {
            l70 s = s10Var.a.s();
            Object[] objArr = s.d;
            int i = s.f;
            for (int i2 = 0; i2 < i; i2++) {
                p10 p10Var = (p10) objArr[i2];
                s10 s10Var2 = p10Var.G;
                if ((s10Var2.l || s10Var2.m) && !s10Var2.e) {
                    p10Var.J(false);
                }
                m40 m40Var = s10Var2.p;
                if (m40Var != null) {
                    m40Var.S();
                }
            }
        }
    }

    public final void T() {
        m10 m10Var;
        this.z = true;
        s10 s10Var = this.i;
        p10 n = s10Var.a.n();
        j40 j40Var = this.s;
        if ((j40Var != j40.d && !s10Var.b) || (j40Var != j40.e && s10Var.b)) {
            R();
            if (this.j && n != null) {
                n.J(false);
            }
        }
        if (n != null) {
            s10 s10Var2 = n.G;
            if (!this.j && ((m10Var = s10Var2.c) == m10.f || m10Var == m10.g)) {
                if (this.l != Integer.MAX_VALUE) {
                    cy.b("Place was called on a node which was placed already");
                }
                int i = s10Var2.g;
                this.l = i;
                s10Var2.g = i + 1;
            }
        } else {
            this.l = 0;
        }
        n();
    }

    public final void V(long j, mu muVar) {
        s10 s10Var = this.i;
        p10 p10Var = s10Var.a;
        p10 p10Var2 = s10Var.a;
        try {
            p10 n = p10Var.n();
            m10 m10Var = n != null ? n.G.c : null;
            m10 m10Var2 = m10.g;
            if (m10Var == m10Var2) {
                s10Var.b = false;
            }
            if (p10Var2.N) {
                cy.a("place is called on a deactivated node");
            }
            s10Var.c = m10Var2;
            this.n = true;
            this.z = false;
            if (!bz.a(j, this.q)) {
                if (s10Var.m || s10Var.l) {
                    s10Var.e = true;
                }
                S();
            }
            dd0 Q = mz.Q(p10Var2);
            if (s10Var.e || !s()) {
                s10Var.h(false);
                this.t.e = false;
                fd0 snapshotObserver = ((f3) Q).getSnapshotObserver();
                l40 l40Var = new l40(this, Q, j);
                snapshotObserver.getClass();
                if (p10Var2.j != null) {
                    snapshotObserver.a(p10Var2, snapshotObserver.g, l40Var);
                } else {
                    snapshotObserver.a(p10Var2, snapshotObserver.f, l40Var);
                }
            } else {
                h40 t0 = s10Var.a().t0();
                t0.getClass();
                t0.m0(bz.c(j, t0.h));
                T();
            }
            this.q = j;
            this.r = muVar;
            s10Var.c = m10.h;
        } catch (Throwable th) {
            p10Var.P(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x007b, B:34:0x0083, B:38:0x0094, B:39:0x0099, B:41:0x00b6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x007b, B:34:0x0083, B:38:0x0094, B:39:0x0099, B:41:0x00b6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x007b, B:34:0x0083, B:38:0x0094, B:39:0x0099, B:41:0x00b6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x007b, B:34:0x0083, B:38:0x0094, B:39:0x0099, B:41:0x00b6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W(long j) {
        boolean z;
        int i;
        int i2;
        h40 t0;
        s10 s10Var = this.i;
        p10 p10Var = s10Var.a;
        p10 p10Var2 = s10Var.a;
        try {
            if (p10Var.N) {
                cy.a("measure is called on a deactivated node");
            }
            p10 n = p10Var2.n();
            if (!p10Var2.E && (n == null || !n.E)) {
                z = false;
                p10Var2.E = z;
                if (!p10Var2.G.d) {
                    ui uiVar = this.p;
                    if (uiVar == null ? false : ui.b(uiVar.a, j)) {
                        dd0 dd0Var = p10Var2.p;
                        if (dd0Var != null) {
                            ((f3) dd0Var).n(p10Var2, true);
                        }
                        p10Var2.O();
                        return false;
                    }
                }
                this.p = new ui(j);
                O(j);
                this.t.d = false;
                l70 s = p10Var2.s();
                Object[] objArr = s.d;
                i = s.f;
                for (i2 = 0; i2 < i; i2++) {
                    m40 m40Var = ((p10) objArr[i2]).G.p;
                    m40Var.getClass();
                    m40Var.t.getClass();
                }
                long j2 = !this.o ? this.f : -9223372034707292160L;
                this.o = true;
                t0 = s10Var.a().t0();
                if (!(t0 == null)) {
                    cy.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                s10Var.c(j);
                N((t0.d << 32) | (t0.e & 4294967295L));
                return ((int) (j2 >> 32)) == t0.d || ((int) (j2 & 4294967295L)) != t0.e;
            }
            z = true;
            p10Var2.E = z;
            if (!p10Var2.G.d) {
            }
            this.p = new ui(j);
            O(j);
            this.t.d = false;
            l70 s2 = p10Var2.s();
            Object[] objArr2 = s2.d;
            i = s2.f;
            while (i2 < i) {
            }
            if (!this.o) {
            }
            this.o = true;
            t0 = s10Var.a().t0();
            if (!(t0 == null)) {
            }
            s10Var.c(j);
            N((t0.d << 32) | (t0.e & 4294967295L));
            if (((int) (j2 >> 32)) == t0.d) {
            }
        } catch (Throwable th) {
            p10Var.P(th);
            throw null;
        }
    }

    @Override // defpackage.b50
    public final yf0 d(long j) {
        n10 n10Var;
        s10 s10Var = this.i;
        p10 p10Var = s10Var.a;
        p10 p10Var2 = s10Var.a;
        p10 n = p10Var.n();
        if ((n != null ? n.G.c : null) != m10.e) {
            p10 n2 = p10Var2.n();
            if (n2 != null) {
                m10 m10Var = n2.G.c;
            }
            m10 m10Var2 = m10.g;
        }
        p10 n3 = p10Var2.n();
        n10 n10Var2 = n10.f;
        if (n3 != null) {
            s10 s10Var2 = n3.G;
            if (this.m != n10Var2 && !p10Var2.E) {
                cy.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = s10Var2.c.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                n10Var = n10.d;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    g8.l(s10Var2.c, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                n10Var = n10.e;
            }
            this.m = n10Var;
        } else {
            this.m = n10Var2;
        }
        if (p10Var2.C == n10Var2) {
            p10Var2.c();
        }
        W(j);
        return this;
    }

    @Override // defpackage.yf0, defpackage.b50
    public final Object f() {
        return this.y;
    }

    @Override // defpackage.g2
    public final void i(f2 f2Var) {
        l70 s = this.i.a.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            m40 m40Var = ((p10) objArr[i2]).G.p;
            m40Var.getClass();
            f2Var.c(m40Var);
        }
    }

    @Override // defpackage.g60
    public final void j(boolean z) {
        h40 t0;
        s10 s10Var = this.i;
        h40 t02 = s10Var.a().t0();
        if (Boolean.valueOf(z).equals(t02 != null ? Boolean.valueOf(t02.l) : null) || (t0 = s10Var.a().t0()) == null) {
            return;
        }
        t0.l = z;
    }

    @Override // defpackage.g2
    public final iy l() {
        return (iy) this.i.a.F.g;
    }

    @Override // defpackage.g2
    public final g2 m() {
        s10 s10Var;
        p10 n = this.i.a.n();
        if (n == null || (s10Var = n.G) == null) {
            return null;
        }
        return s10Var.p;
    }

    @Override // defpackage.g2
    public final void n() {
        this.w = true;
        q10 q10Var = this.t;
        q10Var.h();
        s10 s10Var = this.i;
        boolean z = s10Var.e;
        p10 p10Var = s10Var.a;
        if (z) {
            l70 s = p10Var.s();
            Object[] objArr = s.d;
            int i = s.f;
            for (int i2 = 0; i2 < i; i2++) {
                p10 p10Var2 = (p10) objArr[i2];
                s10 s10Var2 = p10Var2.G;
                if (s10Var2.d && p10Var2.m() == n10.d) {
                    m40 m40Var = s10Var2.p;
                    m40Var.getClass();
                    m40 m40Var2 = s10Var2.p;
                    ui uiVar = m40Var2 != null ? m40Var2.p : null;
                    uiVar.getClass();
                    if (m40Var.W(uiVar.a)) {
                        p10.K(p10Var, false, 7);
                    }
                }
            }
        }
        hy hyVar = l().R;
        hyVar.getClass();
        if (s10Var.f || (!hyVar.n && s10Var.e)) {
            s10Var.e = false;
            m10 m10Var = s10Var.c;
            s10Var.c = m10.g;
            dd0 Q = mz.Q(p10Var);
            s10Var.i(false);
            fd0 snapshotObserver = ((f3) Q).getSnapshotObserver();
            a3 a3Var = new a3(8, this, hyVar);
            snapshotObserver.getClass();
            if (p10Var.j != null) {
                snapshotObserver.a(p10Var, snapshotObserver.h, a3Var);
            } else {
                snapshotObserver.a(p10Var, snapshotObserver.e, a3Var);
            }
            s10Var.c = m10Var;
            if (s10Var.l && hyVar.n) {
                requestLayout();
            }
            s10Var.f = false;
        }
        if (q10Var.b && q10Var.e()) {
            q10Var.g();
        }
        this.w = false;
    }

    @Override // defpackage.g2
    public final void requestLayout() {
        this.i.a.J(false);
    }

    @Override // defpackage.g2
    public final boolean s() {
        return this.s != j40.f;
    }
}
