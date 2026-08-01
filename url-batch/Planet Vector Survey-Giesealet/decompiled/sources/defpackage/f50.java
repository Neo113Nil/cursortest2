package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f50 extends yf0 implements b50, g2, g60 {
    public boolean C;
    public float G;
    public boolean H;
    public mu I;
    public float K;
    public boolean M;
    public final s10 i;
    public boolean j;
    public boolean m;
    public boolean n;
    public mu q;
    public float r;
    public Object t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int k = Integer.MAX_VALUE;
    public int l = Integer.MAX_VALUE;
    public n10 o = n10.f;
    public long p = 0;
    public boolean s = true;
    public final q10 z = new q10(this, 0);
    public final l70 A = new l70(new f50[16]);
    public boolean B = true;
    public long D = vi.b(0, 0, 15);
    public final e50 E = new e50(this, 1);
    public final e50 F = new e50(this, 0);
    public long J = 0;
    public final e50 L = new e50(this, 2);

    public f50(s10 s10Var) {
        this.i = s10Var;
    }

    @Override // defpackage.g2
    public final q10 B() {
        return this.z;
    }

    @Override // defpackage.g2
    public final void C() {
        p10.M(this.i.a, false, 7);
    }

    @Override // defpackage.yf0
    public final int E() {
        return this.i.a().E();
    }

    @Override // defpackage.yf0
    public final int H() {
        return this.i.a().H();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x002b, B:10:0x002f, B:14:0x0047, B:16:0x004f, B:18:0x005d, B:20:0x0068, B:21:0x006c, B:22:0x0053, B:23:0x003b, B:25:0x0041, B:26:0x0043, B:27:0x0080, B:29:0x0084, B:33:0x008c, B:34:0x0091, B:39:0x0018, B:41:0x001c, B:43:0x0020, B:45:0x0028, B:46:0x0024), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x002b, B:10:0x002f, B:14:0x0047, B:16:0x004f, B:18:0x005d, B:20:0x0068, B:21:0x006c, B:22:0x0053, B:23:0x003b, B:25:0x0041, B:26:0x0043, B:27:0x0080, B:29:0x0084, B:33:0x008c, B:34:0x0091, B:39:0x0018, B:41:0x001c, B:43:0x0020, B:45:0x0028, B:46:0x0024), top: B:2:0x0005 }] */
    @Override // defpackage.yf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(long j, float f, mu muVar) {
        m40 m40Var;
        m40 m40Var2;
        boolean z;
        xf0 placementScope;
        s10 s10Var = this.i;
        p10 p10Var = s10Var.a;
        boolean z2 = true;
        try {
            this.v = true;
            if (bz.a(j, this.p)) {
                if (this.M) {
                }
                m40Var = s10Var.p;
                if (m40Var != null) {
                    s10 s10Var2 = m40Var.i;
                    if (px0.G(s10Var2.a)) {
                        z = true;
                    } else {
                        if (m40Var.s == j40.f) {
                            s10Var2.b = true;
                        }
                        z = s10Var2.b;
                    }
                    if (z) {
                        ea0 ea0Var = s10Var.a().t;
                        if (ea0Var == null || (placementScope = ea0Var.o) == null) {
                            placementScope = ((f3) mz.Q(p10Var)).getPlacementScope();
                        }
                        m40 m40Var3 = s10Var.p;
                        m40Var3.getClass();
                        p10 n = p10Var.n();
                        if (n != null) {
                            n.G.g = 0;
                        }
                        m40Var3.l = Integer.MAX_VALUE;
                        xf0.g(placementScope, m40Var3, (int) (j >> 32), (int) (4294967295L & j));
                    }
                }
                m40Var2 = s10Var.p;
                if (m40Var2 != null || m40Var2.n) {
                    z2 = false;
                }
                if (z2) {
                    cy.b("Error: Placement happened before lookahead.");
                }
                W(j, f, muVar);
            }
            if (s10Var.j || s10Var.i || this.M) {
                this.x = true;
                this.M = false;
            }
            S();
            m40Var = s10Var.p;
            if (m40Var != null) {
            }
            m40Var2 = s10Var.p;
            if (m40Var2 != null) {
            }
            z2 = false;
            if (z2) {
            }
            W(j, f, muVar);
        } catch (Throwable th) {
            p10Var.P(th);
            throw null;
        }
    }

    public final void Q() {
        boolean z = this.u;
        this.u = true;
        p10 p10Var = this.i.a;
        ca0 ca0Var = p10Var.F;
        if (!z) {
            ((iy) ca0Var.g).I0();
            if (p10Var.k()) {
                p10.M(p10Var, true, 6);
            } else if (p10Var.G.d) {
                p10.K(p10Var, true, 6);
            }
        }
        ea0 ea0Var = ((iy) ca0Var.g).s;
        for (ea0 ea0Var2 = (ea0) ca0Var.h; !nz.l(ea0Var2, ea0Var) && ea0Var2 != null; ea0Var2 = ea0Var2.s) {
            if (ea0Var2.K) {
                ea0Var2.C0();
            }
        }
        l70 s = p10Var.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var2 = (p10) objArr[i2];
            if (p10Var2.o() != Integer.MAX_VALUE) {
                p10Var2.G.o.Q();
                p10.N(p10Var2);
            }
        }
    }

    public final void R() {
        if (this.u) {
            this.u = false;
            s10 s10Var = this.i;
            ca0 ca0Var = s10Var.a.F;
            ea0 ea0Var = ((iy) ca0Var.g).s;
            for (ea0 ea0Var2 = (ea0) ca0Var.h; !nz.l(ea0Var2, ea0Var) && ea0Var2 != null; ea0Var2 = ea0Var2.s) {
                t50 x0 = ea0Var2.x0(fa0.g(1048576));
                if (x0 != null && (x0.d.g & 1048576) != 0) {
                    boolean g = fa0.g(1048576);
                    t50 v0 = ea0Var2.v0();
                    if (g || (v0 = v0.h) != null) {
                        for (t50 x02 = ea0Var2.x0(g); x02 != null && (x02.g & 1048576) != 0; x02 = x02.i) {
                            if ((x02.f & 1048576) != 0) {
                                t50 t50Var = x02;
                                l70 l70Var = null;
                                while (t50Var != null) {
                                    if ((t50Var.f & 1048576) != 0 && (t50Var instanceof ol)) {
                                        int i = 0;
                                        for (t50 t50Var2 = ((ol) t50Var).s; t50Var2 != null; t50Var2 = t50Var2.i) {
                                            if ((t50Var2.f & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    t50Var = t50Var2;
                                                } else {
                                                    if (l70Var == null) {
                                                        l70Var = new l70(new t50[16]);
                                                    }
                                                    if (t50Var != null) {
                                                        l70Var.b(t50Var);
                                                        t50Var = null;
                                                    }
                                                    l70Var.b(t50Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    t50Var = nz.j(l70Var);
                                }
                            }
                            if (x02 != v0) {
                            }
                        }
                    }
                }
                ea0Var2.O0();
            }
            l70 s = s10Var.a.s();
            Object[] objArr = s.d;
            int i2 = s.f;
            for (int i3 = 0; i3 < i2; i3++) {
                ((p10) objArr[i3]).G.o.R();
            }
        }
    }

    public final void S() {
        s10 s10Var = this.i;
        if (s10Var.k > 0) {
            l70 s = s10Var.a.s();
            Object[] objArr = s.d;
            int i = s.f;
            for (int i2 = 0; i2 < i; i2++) {
                p10 p10Var = (p10) objArr[i2];
                s10 s10Var2 = p10Var.G;
                boolean z = s10Var2.i;
                f50 f50Var = s10Var2.o;
                if ((z || s10Var2.j) && !f50Var.x) {
                    p10Var.L(false);
                }
                f50Var.S();
            }
        }
    }

    public final void T() {
        this.H = true;
        s10 s10Var = this.i;
        p10 n = s10Var.a.n();
        float f = l().D;
        p10 p10Var = s10Var.a;
        ca0 ca0Var = p10Var.F;
        ea0 ea0Var = (ea0) ca0Var.h;
        iy iyVar = (iy) ca0Var.g;
        while (ea0Var != iyVar) {
            ea0Var.getClass();
            k10 k10Var = (k10) ea0Var;
            f += k10Var.D;
            ea0Var = k10Var.s;
        }
        if (f != this.G) {
            this.G = f;
            if (n != null) {
                n.H();
            }
            if (n != null) {
                n.v();
            }
        }
        if (this.u) {
            ((iy) p10Var.F.g).I0();
        } else {
            if (n != null) {
                n.v();
            }
            Q();
            if (this.j && n != null) {
                n.L(false);
            }
        }
        if (n != null) {
            s10 s10Var2 = n.G;
            if (!this.j && s10Var2.c == m10.f) {
                if (this.l != Integer.MAX_VALUE) {
                    cy.b("Place was called on a node which was placed already");
                }
                int i = s10Var2.h;
                this.l = i;
                s10Var2.h = i + 1;
            }
        } else {
            this.l = 0;
        }
        n();
    }

    public final void V(long j) {
        s10 s10Var = this.i;
        m10 m10Var = s10Var.c;
        p10 p10Var = s10Var.a;
        m10 m10Var2 = m10.h;
        if (m10Var != m10Var2) {
            cy.b("layout state is not idle before measure starts");
        }
        this.D = j;
        m10 m10Var3 = m10.d;
        s10Var.c = m10Var3;
        this.w = false;
        fd0 snapshotObserver = ((f3) mz.Q(p10Var)).getSnapshotObserver();
        snapshotObserver.getClass();
        snapshotObserver.a(p10Var, snapshotObserver.c, this.E);
        if (s10Var.c == m10Var3) {
            this.x = true;
            this.y = true;
            s10Var.c = m10Var2;
        }
    }

    public final void W(long j, float f, mu muVar) {
        s10 s10Var = this.i;
        p10 p10Var = s10Var.a;
        p10 p10Var2 = s10Var.a;
        if (p10Var.N) {
            cy.a("place is called on a deactivated node");
        }
        s10Var.c = m10.f;
        this.p = j;
        this.r = f;
        this.q = muVar;
        this.H = false;
        dd0 Q = mz.Q(p10Var2);
        if (this.x || !this.u) {
            this.z.e = false;
            s10Var.f(false);
            this.I = muVar;
            this.J = j;
            this.K = f;
            fd0 snapshotObserver = ((f3) Q).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(p10Var2, snapshotObserver.f, this.L);
        } else {
            ea0 a = s10Var.a();
            a.M0(bz.c(j, a.h), f, muVar);
            T();
        }
        s10Var.c = m10.h;
        this.n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0064, B:27:0x007e, B:29:0x0088, B:33:0x0094), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(long j) {
        boolean z;
        int i;
        int i2;
        long j2;
        s10 s10Var = this.i;
        p10 p10Var = s10Var.a;
        p10 p10Var2 = s10Var.a;
        try {
            if (p10Var.N) {
                cy.a("measure is called on a deactivated node");
            }
            dd0 Q = mz.Q(p10Var2);
            p10 n = p10Var2.n();
            boolean z2 = true;
            if (!p10Var2.E && (n == null || !n.E)) {
                z = false;
                p10Var2.E = z;
                if (!p10Var2.k() && ui.b(this.g, j)) {
                    ((f3) Q).n(p10Var2, false);
                    p10Var2.O();
                    return false;
                }
                this.z.d = false;
                l70 s = p10Var2.s();
                Object[] objArr = s.d;
                i = s.f;
                for (i2 = 0; i2 < i; i2++) {
                    ((p10) objArr[i2]).G.o.z.getClass();
                }
                this.m = true;
                j2 = s10Var.a().f;
                O(j);
                V(j);
                if (iz.a(s10Var.a().f, j2) && s10Var.a().d == this.d && s10Var.a().e == this.e) {
                    z2 = false;
                }
                N((s10Var.a().e & 4294967295L) | (s10Var.a().d << 32));
                return z2;
            }
            z = true;
            p10Var2.E = z;
            if (!p10Var2.k()) {
                ((f3) Q).n(p10Var2, false);
                p10Var2.O();
                return false;
            }
            this.z.d = false;
            l70 s2 = p10Var2.s();
            Object[] objArr2 = s2.d;
            i = s2.f;
            while (i2 < i) {
            }
            this.m = true;
            j2 = s10Var.a().f;
            O(j);
            V(j);
            if (iz.a(s10Var.a().f, j2)) {
                z2 = false;
            }
            N((s10Var.a().e & 4294967295L) | (s10Var.a().d << 32));
            return z2;
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
        n10 n10Var2 = p10Var.C;
        n10 n10Var3 = n10.f;
        if (n10Var2 == n10Var3) {
            p10Var.c();
        }
        if (px0.G(p10Var2)) {
            m40 m40Var = s10Var.p;
            m40Var.getClass();
            m40Var.m = n10Var3;
            m40Var.d(j);
        }
        p10 n = p10Var2.n();
        if (n != null) {
            s10 s10Var2 = n.G;
            if (this.o != n10Var3 && !p10Var2.E) {
                cy.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = s10Var2.c.ordinal();
            if (ordinal == 0) {
                n10Var = n10.d;
            } else {
                if (ordinal != 2) {
                    g8.l(s10Var2.c, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                n10Var = n10.e;
            }
            this.o = n10Var;
        } else {
            this.o = n10Var3;
        }
        X(j);
        return this;
    }

    @Override // defpackage.yf0, defpackage.b50
    public final Object f() {
        return this.t;
    }

    @Override // defpackage.g2
    public final void i(f2 f2Var) {
        l70 s = this.i.a.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            f2Var.c(((p10) objArr[i2]).G.o);
        }
    }

    @Override // defpackage.g60
    public final void j(boolean z) {
        s10 s10Var = this.i;
        if (z != s10Var.a().l) {
            s10Var.a().l = z;
            this.M = true;
        }
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
        return s10Var.o;
    }

    @Override // defpackage.g2
    public final void n() {
        this.C = true;
        q10 q10Var = this.z;
        q10Var.h();
        boolean z = this.x;
        s10 s10Var = this.i;
        if (z) {
            l70 s = s10Var.a.s();
            Object[] objArr = s.d;
            int i = s.f;
            for (int i2 = 0; i2 < i; i2++) {
                p10 p10Var = (p10) objArr[i2];
                if (p10Var.k() && p10Var.l() == n10.d && p10.I(p10Var)) {
                    p10.M(s10Var.a, false, 7);
                }
            }
        }
        if (this.y || (!l().n && this.x)) {
            this.x = false;
            m10 m10Var = s10Var.c;
            s10Var.c = m10.f;
            s10Var.g(false);
            p10 p10Var2 = s10Var.a;
            fd0 snapshotObserver = ((f3) mz.Q(p10Var2)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(p10Var2, snapshotObserver.e, this.F);
            s10Var.c = m10Var;
            if (l().n && s10Var.i) {
                requestLayout();
            }
            this.y = false;
        }
        if (q10Var.b && q10Var.e()) {
            q10Var.g();
        }
        this.C = false;
    }

    @Override // defpackage.g2
    public final void requestLayout() {
        this.i.a.L(false);
    }

    @Override // defpackage.g2
    public final boolean s() {
        return this.u;
    }
}
