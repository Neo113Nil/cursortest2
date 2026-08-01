package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d50 {
    public final p10 a;
    public boolean c;
    public boolean d;
    public ui i;
    public final t7 b = new t7(3);
    public final j3 e = new j3(7);
    public final l70 f = new l70(new p10[16]);
    public final long g = 1;
    public final l70 h = new l70(new c50[16]);

    public d50(p10 p10Var) {
        this.a = p10Var;
    }

    public static boolean b(p10 p10Var, ui uiVar) {
        boolean W;
        p10 p10Var2 = p10Var.j;
        s10 s10Var = p10Var.G;
        if (p10Var2 == null) {
            return false;
        }
        if (uiVar != null) {
            if (p10Var2 != null) {
                m40 m40Var = s10Var.p;
                m40Var.getClass();
                W = m40Var.W(uiVar.a);
            }
            W = false;
        } else {
            m40 m40Var2 = s10Var.p;
            ui uiVar2 = m40Var2 != null ? m40Var2.p : null;
            if (uiVar2 != null && p10Var2 != null) {
                m40Var2.getClass();
                W = m40Var2.W(uiVar2.a);
            }
            W = false;
        }
        p10 n = p10Var.n();
        if (W && n != null) {
            if (n.j == null) {
                p10.M(n, false, 3);
                return W;
            }
            if (p10Var.m() == n10.d) {
                p10.K(n, false, 3);
                return W;
            }
            if (p10Var.m() == n10.e) {
                n.J(false);
            }
        }
        return W;
    }

    public static boolean c(p10 p10Var, ui uiVar) {
        boolean I;
        if (uiVar != null) {
            if (p10Var.C == n10.f) {
                p10Var.c();
            }
            I = p10Var.G.o.X(uiVar.a);
        } else {
            I = p10.I(p10Var);
        }
        p10 n = p10Var.n();
        if (I && n != null) {
            if (p10Var.l() == n10.d) {
                p10.M(n, false, 3);
                return I;
            }
            if (p10Var.l() == n10.e) {
                n.L(false);
            }
        }
        return I;
    }

    public static boolean f(p10 p10Var) {
        m40 m40Var;
        q10 q10Var;
        if (p10Var.G.d) {
            return (p10Var.m() == n10.f && ((m40Var = p10Var.G.p) == null || (q10Var = m40Var.t) == null || !q10Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean g(p10 p10Var) {
        if (!p10Var.k()) {
            return false;
        }
        do {
            if (p10Var.l() == n10.f && !p10Var.G.o.z.e()) {
                p10 n = p10Var.n();
                if ((n != null ? n.G.c : null) != m10.d) {
                    return false;
                }
            }
            p10Var = p10Var.n();
            if (p10Var == null) {
                return false;
            }
        } while (!p10Var.C());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3 < r7) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        Object[] objArr;
        j3 j3Var = this.e;
        if (z) {
            l70 l70Var = (l70) j3Var.e;
            p10 p10Var = this.a;
            if (p10Var.M > 0) {
                l70Var.g();
                l70Var.b(p10Var);
                p10Var.L = true;
            }
        }
        l70 l70Var2 = (l70) j3Var.e;
        int i = l70Var2.f;
        if (i != 0) {
            Arrays.sort(l70Var2.d, 0, i, us.d);
            int i2 = l70Var2.f;
            p10[] p10VarArr = (p10[]) j3Var.f;
            if (p10VarArr != null) {
                int length = p10VarArr.length;
                objArr = p10VarArr;
            }
            objArr = new p10[Math.max(16, i2)];
            j3Var.f = null;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = l70Var2.d[i3];
            }
            l70Var2.g();
            for (int i4 = i2 - 1; -1 < i4; i4--) {
                p10 p10Var2 = objArr[i4];
                p10Var2.getClass();
                if (p10Var2.L) {
                    j3.g(p10Var2);
                }
                objArr[i4] = 0;
            }
            j3Var.f = objArr;
        }
    }

    public final void d(p10 p10Var, boolean z) {
        if (!this.c) {
            cy.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? p10Var.G.d : p10Var.k()) {
            cy.a("node not yet measured");
        }
        e(p10Var, z);
    }

    public final void e(p10 p10Var, boolean z) {
        m40 m40Var;
        q10 q10Var;
        l70 s = p10Var.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var2 = (p10) objArr[i2];
            n10 n10Var = n10.d;
            if ((!z && (p10Var2.l() == n10Var || p10Var2.G.o.z.e())) || (z && (p10Var2.m() == n10Var || ((m40Var = p10Var2.G.p) != null && (q10Var = m40Var.t) != null && q10Var.e())))) {
                boolean G = px0.G(p10Var2);
                s10 s10Var = p10Var2.G;
                if (G && !z) {
                    if (s10Var.d) {
                        t7 t7Var = this.b;
                        t7Var.getClass();
                        boolean z2 = p10Var2.j == null;
                        boolean z3 = ((ls0) ((p01) t7Var.e).e).contains(p10Var2) || ((ls0) ((p01) t7Var.f).e).contains(p10Var2);
                        if (!z2 && z3) {
                            j(p10Var2, true, false);
                        }
                    }
                    d(p10Var2, true);
                }
                if (z ? s10Var.d : p10Var2.k()) {
                    j(p10Var2, z, false);
                }
                if (!(z ? s10Var.d : p10Var2.k())) {
                    e(p10Var2, z);
                }
            }
        }
        if (z ? p10Var.G.d : p10Var.k()) {
            j(p10Var, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [t50] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean h(d3 d3Var) {
        boolean z;
        t50 t50Var;
        t50 t50Var2;
        boolean z2;
        p10 p10Var;
        boolean z3;
        t7 t7Var = this.b;
        p10 p10Var2 = this.a;
        if (!p10Var2.B()) {
            cy.a("performMeasureAndLayout called with unattached root");
        }
        if (!p10Var2.C()) {
            cy.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            cy.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean t = t7Var.t();
                p01 p01Var = (p01) t7Var.e;
                if (t) {
                    z = false;
                    while (true) {
                        p01 p01Var2 = (p01) t7Var.g;
                        p01 p01Var3 = (p01) t7Var.f;
                        if (!((ls0) p01Var.e).isEmpty()) {
                            p10Var = (p10) ((ls0) p01Var.e).first();
                            p01Var.s(p10Var);
                            z3 = p10Var.j != null;
                            z2 = false;
                        } else if (!((ls0) p01Var3.e).isEmpty()) {
                            p10Var = (p10) ((ls0) p01Var3.e).first();
                            p01Var3.s(p10Var);
                            z3 = p10Var.j != null;
                            z2 = true;
                        } else {
                            if (((ls0) p01Var2.e).isEmpty()) {
                                break;
                            }
                            p10 p10Var3 = (p10) ((ls0) p01Var2.e).first();
                            p01Var2.s(p10Var3);
                            z2 = true;
                            p10Var = p10Var3;
                            z3 = false;
                        }
                        boolean j = j(p10Var, z3, z2);
                        if (!z2) {
                            if (p10Var.G.e) {
                                t7Var.a(p10Var, tz.e);
                            }
                            if (p10Var.j()) {
                                t7Var.a(p10Var, tz.g);
                            }
                        }
                        if (p10Var == p10Var2 && j) {
                            z = true;
                        }
                    }
                    if (d3Var != null) {
                        d3Var.a();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        l70 l70Var = this.f;
        Object[] objArr = l70Var.d;
        int i = l70Var.f;
        int i2 = 0;
        while (i2 < i) {
            ca0 ca0Var = ((p10) objArr[i2]).F;
            iy iyVar = (iy) ca0Var.g;
            boolean g = fa0.g(128);
            if (g) {
                t50Var = iyVar.Q;
            } else {
                t50Var = iyVar.Q.h;
                if (t50Var == null) {
                    i2++;
                    z4 = false;
                }
            }
            wk0 wk0Var = ea0.M;
            t50 x0 = iyVar.x0(g);
            while (x0 != null && (x0.g & 128) != 0) {
                if ((x0.f & 128) != 0) {
                    ol olVar = x0;
                    l70 l70Var2 = null;
                    while (olVar != 0) {
                        if (olVar instanceof z00) {
                            ((z00) olVar).i((iy) ca0Var.g);
                        } else if ((olVar.f & 128) != 0 && (olVar instanceof ol)) {
                            t50 t50Var3 = olVar.s;
                            ?? r15 = z4;
                            t50Var2 = olVar;
                            l70Var2 = l70Var2;
                            while (t50Var3 != null) {
                                if ((t50Var3.f & 128) != 0) {
                                    r15++;
                                    l70Var2 = l70Var2;
                                    if (r15 == 1) {
                                        t50Var2 = t50Var3;
                                    } else {
                                        if (l70Var2 == null) {
                                            l70Var2 = new l70(new t50[16]);
                                        }
                                        if (t50Var2 != null) {
                                            l70Var2.b(t50Var2);
                                            t50Var2 = null;
                                        }
                                        l70Var2.b(t50Var3);
                                    }
                                }
                                t50Var3 = t50Var3.i;
                                t50Var2 = t50Var2;
                                l70Var2 = l70Var2;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z4 = false;
                                olVar = t50Var2;
                                l70Var2 = l70Var2;
                            }
                        }
                        t50Var2 = nz.j(l70Var2);
                        z4 = false;
                        olVar = t50Var2;
                        l70Var2 = l70Var2;
                    }
                }
                if (x0 != t50Var) {
                    x0 = x0.i;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        l70Var.g();
        return z;
    }

    public final void i() {
        t7 t7Var = this.b;
        if (t7Var.t()) {
            p10 p10Var = this.a;
            if (!p10Var.B()) {
                cy.a("performMeasureAndLayout called with unattached root");
            }
            if (!p10Var.C()) {
                cy.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                cy.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((ls0) ((p01) t7Var.g).e).isEmpty() && !((ls0) ((p01) t7Var.e).e).isEmpty()) {
                        if (p10Var.j != null) {
                            l(p10Var, true);
                        } else {
                            k(p10Var);
                        }
                    }
                    l(p10Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(p10 p10Var, boolean z, boolean z2) {
        ui uiVar;
        boolean c;
        p10 n;
        xf0 placementScope;
        iy iyVar;
        p10 n2;
        p10 n3;
        m40 m40Var;
        q10 q10Var;
        boolean z3 = p10Var.N;
        s10 s10Var = p10Var.G;
        boolean z4 = false;
        Object[] objArr = 0;
        if (z3 || (!p10Var.C() && !s10Var.o.v && !g(p10Var) && !nz.l(p10Var.D(), Boolean.TRUE) && !f(p10Var) && !s10Var.o.z.e() && ((m40Var = s10Var.p) == null || (q10Var = m40Var.t) == null || !q10Var.e()))) {
            return false;
        }
        p10 p10Var2 = this.a;
        if (p10Var == p10Var2) {
            uiVar = this.i;
            uiVar.getClass();
        } else {
            uiVar = null;
        }
        n10 n10Var = n10.f;
        if (z) {
            c = s10Var.d ? b(p10Var, uiVar) : false;
            if (z2 && ((c || s10Var.e) && nz.l(p10Var.D(), Boolean.TRUE))) {
                if (p10Var.C == n10Var) {
                    p10Var.d();
                }
                m40 m40Var2 = s10Var.p;
                m40Var2.getClass();
                try {
                    m40Var2.j = true;
                    if (!m40Var2.n) {
                        cy.b("replace() called on item that was not placed");
                    }
                    m40Var2.z = false;
                    boolean s = m40Var2.s();
                    m40Var2.V(m40Var2.q, m40Var2.r);
                    if (s && !m40Var2.z && (n3 = m40Var2.i.a.n()) != null) {
                        n3.J(false);
                    }
                    m40Var2.j = false;
                } catch (Throwable th) {
                    m40Var2.j = false;
                    throw th;
                }
            }
        } else {
            c = p10Var.k() ? c(p10Var, uiVar) : false;
            if (z2 && p10Var.j() && (p10Var == p10Var2 || ((n2 = p10Var.n()) != null && n2.C() && s10Var.o.v))) {
                n10 n10Var2 = p10Var.C;
                if (p10Var == p10Var2) {
                    if (n10Var2 == n10Var) {
                        p10Var.d();
                    }
                    p10 n4 = p10Var.n();
                    if (n4 == null || (iyVar = (iy) n4.F.g) == null || (placementScope = iyVar.o) == null) {
                        placementScope = ((f3) mz.Q(p10Var)).getPlacementScope();
                    }
                    xf0.j(placementScope, s10Var.o, 0, 0);
                } else {
                    if (n10Var2 == n10Var) {
                        p10Var.d();
                    }
                    f50 f50Var = s10Var.o;
                    s10 s10Var2 = f50Var.i;
                    try {
                        f50Var.j = true;
                        if (!f50Var.n) {
                            cy.b("replace called on unplaced item");
                        }
                        boolean z5 = f50Var.u;
                        f50Var.W(f50Var.p, f50Var.r, f50Var.q);
                        if (z5 && !f50Var.H && (n = s10Var2.a.n()) != null) {
                            n.L(false);
                        }
                    } finally {
                    }
                }
                j3 j3Var = this.e;
                j3Var.getClass();
                if (p10Var.M > 0) {
                    ((l70) j3Var.e).b(p10Var);
                    p10Var.L = true;
                }
                ((f3) mz.Q(p10Var)).getRectManager().e(p10Var);
            }
        }
        l70 l70Var = this.h;
        int i = l70Var.f;
        if (i != 0) {
            Object[] objArr2 = l70Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                c50 c50Var = (c50) objArr2[i2];
                if (c50Var.a.B()) {
                    boolean z6 = c50Var.b;
                    p10 p10Var3 = c50Var.a;
                    boolean z7 = c50Var.c;
                    if (z6) {
                        p10.K(p10Var3, z7, 2);
                    } else {
                        p10.M(p10Var3, z7, 2);
                    }
                }
            }
            l70Var.g();
        }
        return c;
    }

    public final void k(p10 p10Var) {
        l70 s = p10Var.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var2 = (p10) objArr[i2];
            if (p10Var2.l() == n10.d || p10Var2.G.o.z.e()) {
                if (px0.G(p10Var2)) {
                    l(p10Var2, true);
                } else {
                    k(p10Var2);
                }
            }
        }
    }

    public final void l(p10 p10Var, boolean z) {
        ui uiVar;
        if (p10Var.N) {
            return;
        }
        if (p10Var == this.a) {
            uiVar = this.i;
            uiVar.getClass();
        } else {
            uiVar = null;
        }
        if (z) {
            b(p10Var, uiVar);
        } else {
            c(p10Var, uiVar);
        }
    }

    public final boolean m(p10 p10Var, boolean z) {
        int ordinal = p10Var.G.c.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.h.b(new c50(p10Var, false, z));
            } else {
                if (ordinal != 4) {
                    g8.c();
                    return false;
                }
                if (!p10Var.k() || z) {
                    p10Var.G.o.w = true;
                    if (!p10Var.N && (p10Var.C() || g(p10Var))) {
                        p10 n = p10Var.n();
                        if (n == null || !n.k()) {
                            this.b.a(p10Var, tz.f);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void n(long j) {
        ui uiVar = this.i;
        if (uiVar == null ? false : ui.b(uiVar.a, j)) {
            return;
        }
        if (this.c) {
            cy.a("updateRootConstraints called while measuring");
        }
        this.i = new ui(j);
        p10 p10Var = this.a;
        p10 p10Var2 = p10Var.j;
        s10 s10Var = p10Var.G;
        if (p10Var2 != null) {
            s10Var.d = true;
        }
        s10Var.o.w = true;
        this.b.a(p10Var, p10Var2 != null ? tz.d : tz.f);
    }
}
