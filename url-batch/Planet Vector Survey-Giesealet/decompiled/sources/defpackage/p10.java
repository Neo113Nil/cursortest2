package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p10 implements ed0, eh {
    public static final wl0 O = new wl0(1);
    public static final l10 P = new l10();
    public static final rh Q = new rh(5);
    public e01 A;
    public fi B;
    public n10 C;
    public n10 D;
    public boolean E;
    public final ca0 F;
    public final s10 G;
    public ea0 H;
    public boolean I;
    public u50 J;
    public u50 K;
    public boolean L;
    public int M;
    public boolean N;
    public final boolean d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public p10 j;
    public int k;
    public final j3 l;
    public l70 m;
    public boolean n;
    public p10 o;
    public dd0 p;
    public int q;
    public boolean r;
    public boolean s;
    public np0 t;
    public boolean u;
    public final l70 v;
    public boolean w;
    public g50 x;
    public sl y;
    public c10 z;

    public p10(int i, boolean z) {
        this.d = z;
        this.e = i;
        this.f = 9223372034707292159L;
        this.g = 0L;
        this.h = 9223372034707292159L;
        this.i = true;
        this.l = new j3(5, new l70(new p10[16]), new b(7, this));
        this.v = new l70(new p10[16]);
        this.w = true;
        this.x = O;
        this.y = mz.k;
        this.z = c10.d;
        this.A = P;
        fi.c.getClass();
        this.B = ei.b;
        n10 n10Var = n10.f;
        this.C = n10Var;
        this.D = n10Var;
        this.F = new ca0(this);
        this.G = new s10(this);
        this.I = true;
        this.J = r50.a;
    }

    public static boolean I(p10 p10Var) {
        f50 f50Var = p10Var.G.o;
        ui uiVar = f50Var.m ? new ui(f50Var.g) : null;
        if (uiVar == null) {
            p10Var.getClass();
            return false;
        }
        if (p10Var.C == n10.f) {
            p10Var.c();
        }
        return p10Var.G.o.X(uiVar.a);
    }

    public static void K(p10 p10Var, boolean z, int i) {
        p10 n;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        if (p10Var.j == null) {
            cy.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        dd0 dd0Var = p10Var.p;
        if (dd0Var == null || p10Var.r || p10Var.d) {
            return;
        }
        ((f3) dd0Var).y(p10Var, true, z);
        if (z2) {
            m40 m40Var = p10Var.G.p;
            m40Var.getClass();
            s10 s10Var = m40Var.i;
            p10 n2 = s10Var.a.n();
            n10 n10Var = s10Var.a.C;
            if (n2 == null || n10Var == n10.f) {
                return;
            }
            while (n2.C == n10Var && (n = n2.n()) != null) {
                n2 = n;
            }
            int ordinal = n10Var.ordinal();
            if (ordinal == 0) {
                if (n2.j != null) {
                    K(n2, z, 6);
                    return;
                } else {
                    M(n2, z, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                g8.s("Intrinsics isn't used by the parent");
            } else if (n2.j != null) {
                n2.J(z);
            } else {
                n2.L(z);
            }
        }
    }

    public static void M(p10 p10Var, boolean z, int i) {
        dd0 dd0Var;
        p10 n;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        if (p10Var.r || p10Var.d || (dd0Var = p10Var.p) == null) {
            return;
        }
        ((f3) dd0Var).y(p10Var, false, z);
        if (z2) {
            s10 s10Var = p10Var.G.o.i;
            p10 n2 = s10Var.a.n();
            n10 n10Var = s10Var.a.C;
            if (n2 == null || n10Var == n10.f) {
                return;
            }
            while (n2.C == n10Var && (n = n2.n()) != null) {
                n2 = n;
            }
            int ordinal = n10Var.ordinal();
            if (ordinal == 0) {
                M(n2, z, 6);
            } else if (ordinal == 1) {
                n2.L(z);
            } else {
                g8.s("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void N(p10 p10Var) {
        int i = o10.a[p10Var.G.c.ordinal()];
        s10 s10Var = p10Var.G;
        if (i != 1) {
            g8.l(s10Var.c, "Unexpected state ");
            return;
        }
        if (s10Var.d) {
            K(p10Var, true, 6);
            return;
        }
        if (s10Var.e) {
            p10Var.J(true);
        }
        if (p10Var.k()) {
            M(p10Var, true, 6);
        } else if (p10Var.j()) {
            p10Var.L(true);
        }
    }

    private final String h(p10 p10Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(p10Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(e(0));
        sb.append(" Other tree: ");
        p10 p10Var2 = p10Var.o;
        sb.append(p10Var2 != null ? p10Var2.e(0) : null);
        return sb.toString();
    }

    public final void A() {
        p10 p10Var;
        if (this.k > 0) {
            this.n = true;
        }
        if (!this.d || (p10Var = this.o) == null) {
            return;
        }
        p10Var.A();
    }

    public final boolean B() {
        return this.p != null;
    }

    public final boolean C() {
        return this.G.o.u;
    }

    public final Boolean D() {
        m40 m40Var = this.G.p;
        if (m40Var != null) {
            return Boolean.valueOf(m40Var.s());
        }
        return null;
    }

    public final void E(p10 p10Var) {
        if (p10Var.G.k > 0) {
            this.G.d(r0.k - 1);
        }
        if (this.p != null) {
            p10Var.f();
        }
        p10Var.o = null;
        if (p10Var.M > 0) {
            R(this.M - 1);
        }
        ((ea0) p10Var.F.h).t = null;
        if (p10Var.d) {
            this.k--;
            l70 l70Var = (l70) p10Var.l.e;
            Object[] objArr = l70Var.d;
            int i = l70Var.f;
            for (int i2 = 0; i2 < i; i2++) {
                ((ea0) ((p10) objArr[i2]).F.h).t = null;
            }
        }
        A();
        H();
    }

    public final void F() {
        this.i = true;
        l70 s = s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((p10) objArr[i2]).y();
        }
    }

    public final void G() {
        m2 m2Var;
        this.N = true;
        t50 t50Var = (su0) this.F.i;
        for (t50 t50Var2 = t50Var; t50Var2 != null; t50Var2 = t50Var2.h) {
            if (t50Var2.q) {
                t50Var2.e0();
            }
        }
        for (t50 t50Var3 = t50Var; t50Var3 != null; t50Var3 = t50Var3.h) {
            if (t50Var3.q) {
                t50Var3.g0();
            }
        }
        while (t50Var != null) {
            if (t50Var.q) {
                t50Var.Y();
            }
            t50Var = t50Var.h;
        }
        if (B()) {
            this.t = null;
            this.s = false;
        }
        dd0 dd0Var = this.p;
        if (dd0Var != null) {
            f3 f3Var = (f3) dd0Var;
            f3Var.getRectManager().j(this);
            if (f3.j() && (m2Var = f3Var.H) != null && m2Var.g.e(this.e)) {
                m2Var.a.p(m2Var.c, this.e, false);
            }
        }
    }

    public final void H() {
        if (!this.d) {
            this.w = true;
            return;
        }
        p10 n = n();
        if (n != null) {
            n.H();
        }
    }

    public final void J(boolean z) {
        dd0 dd0Var;
        if (this.d || (dd0Var = this.p) == null) {
            return;
        }
        ((f3) dd0Var).z(this, true, z);
    }

    public final void L(boolean z) {
        dd0 dd0Var;
        if (this.d || (dd0Var = this.p) == null) {
            return;
        }
        ((f3) dd0Var).z(this, false, z);
    }

    public final void O() {
        l70 s = s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var = (p10) objArr[i2];
            n10 n10Var = p10Var.D;
            p10Var.C = n10Var;
            if (n10Var != n10.f) {
                p10Var.O();
            }
        }
    }

    public final void P(Throwable th) {
        fi fiVar = this.B;
        lt0 lt0Var = ai.a;
        gf0 gf0Var = (gf0) fiVar;
        gf0Var.getClass();
        yh yhVar = (yh) a50.D(gf0Var, lt0Var);
        if (yhVar == null) {
            throw th;
        }
        x40.W(th, new f8(1, yhVar, this));
        throw th;
    }

    public final void Q(sl slVar) {
        if (nz.l(this.y, slVar)) {
            return;
        }
        this.y = slVar;
        x();
        p10 n = n();
        if (n != null) {
            n.v();
        }
        w();
        for (t50 t50Var = (t50) this.F.j; t50Var != null; t50Var = t50Var.i) {
            t50Var.a0();
        }
    }

    public final void R(int i) {
        p10 n;
        p10 n2;
        int i2 = this.M;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (n2 = n()) != null) {
                n2.R(n2.M + 1);
            }
            if (i == 0 && this.M > 0 && (n = n()) != null) {
                n.R(n.M - 1);
            }
            this.M = i;
        }
    }

    public final void S(p10 p10Var) {
        if (nz.l(p10Var, this.j)) {
            return;
        }
        this.j = p10Var;
        s10 s10Var = this.G;
        if (p10Var != null) {
            if (s10Var.p == null) {
                s10Var.p = new m40(s10Var);
            }
            ca0 ca0Var = this.F;
            ea0 ea0Var = ((iy) ca0Var.g).s;
            for (ea0 ea0Var2 = (ea0) ca0Var.h; !nz.l(ea0Var2, ea0Var) && ea0Var2 != null; ea0Var2 = ea0Var2.s) {
                ea0Var2.q0();
            }
        } else {
            s10Var.p = null;
            s10Var.e = false;
            s10Var.d = false;
        }
        x();
    }

    public final void T(u50 u50Var) {
        if (this.d && this.J != r50.a) {
            cy.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.N) {
            cy.a("modifier is updated when deactivated");
        }
        if (!B()) {
            this.K = u50Var;
            return;
        }
        a(u50Var);
        if (this.s) {
            z();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [t50] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void U(e01 e01Var) {
        if (nz.l(this.A, e01Var)) {
            return;
        }
        this.A = e01Var;
        t50 t50Var = (t50) this.F.j;
        if ((t50Var.g & 16) != 0) {
            while (t50Var != null) {
                if ((t50Var.f & 16) != 0) {
                    ol olVar = t50Var;
                    ?? r2 = 0;
                    while (olVar != 0) {
                        if (olVar instanceof zg0) {
                            ((zg0) olVar).H();
                        } else if ((olVar.f & 16) != 0 && (olVar instanceof ol)) {
                            t50 t50Var2 = olVar.s;
                            int i = 0;
                            olVar = olVar;
                            r2 = r2;
                            while (t50Var2 != null) {
                                if ((t50Var2.f & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        olVar = t50Var2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new l70(new t50[16]);
                                        }
                                        if (olVar != 0) {
                                            r2.b(olVar);
                                            olVar = 0;
                                        }
                                        r2.b(t50Var2);
                                    }
                                }
                                t50Var2 = t50Var2.i;
                                olVar = olVar;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        olVar = nz.j(r2);
                    }
                }
                if ((t50Var.g & 16) == 0) {
                    return;
                } else {
                    t50Var = t50Var.i;
                }
            }
        }
    }

    public final void V() {
        if (this.k <= 0 || !this.n) {
            return;
        }
        this.n = false;
        l70 l70Var = this.m;
        if (l70Var == null) {
            l70Var = new l70(new p10[16]);
            this.m = l70Var;
        }
        l70Var.g();
        l70 l70Var2 = (l70) this.l.e;
        Object[] objArr = l70Var2.d;
        int i = l70Var2.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var = (p10) objArr[i2];
            if (p10Var.d) {
                l70Var.c(l70Var.f, p10Var.s());
            } else {
                l70Var.b(p10Var);
            }
        }
        s10 s10Var = this.G;
        s10Var.o.B = true;
        m40 m40Var = s10Var.p;
        if (m40Var != null) {
            m40Var.v = true;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [ea0, t50] */
    public final void a(u50 u50Var) {
        ?? r7;
        ca0 ca0Var;
        ba0 ba0Var;
        l70 l70Var;
        boolean z;
        boolean z2;
        boolean z3;
        l70 l70Var2;
        boolean z4;
        f2 f2Var;
        ca0 ca0Var2 = this.F;
        boolean h = ca0Var2.h(16);
        t50 t50Var = (su0) ca0Var2.i;
        boolean h2 = ca0Var2.h(1024);
        this.J = u50Var;
        iy iyVar = (iy) ca0Var2.g;
        p10 p10Var = (p10) ca0Var2.e;
        t50 t50Var2 = (t50) ca0Var2.j;
        ba0 ba0Var2 = (ba0) ca0Var2.f;
        if (t50Var2 == ba0Var2) {
            cy.b("padChain called on already padded chain");
        }
        t50 t50Var3 = (t50) ca0Var2.j;
        t50Var3.h = ba0Var2;
        ba0Var2.i = t50Var3;
        l70 l70Var3 = ca0Var2.b;
        int i = l70Var3 != null ? l70Var3.f : 0;
        l70 l70Var4 = ca0Var2.c;
        if (l70Var4 == null) {
            l70Var4 = new l70(new s50[16]);
        }
        l70 l70Var5 = ca0Var2.d;
        l70Var5.b(u50Var);
        f2 f2Var2 = null;
        while (true) {
            int i2 = l70Var5.f;
            if (i2 == 0) {
                break;
            }
            u50 u50Var2 = (u50) l70Var5.j(i2 - 1);
            if (u50Var2 instanceof bf) {
                bf bfVar = (bf) u50Var2;
                l70Var5.b(bfVar.b);
                l70Var5.b(bfVar.a);
            } else if (u50Var2 instanceof s50) {
                l70Var4.b(u50Var2);
            } else {
                if (f2Var2 == null) {
                    f2Var = new f2(18, l70Var4);
                    f2Var2 = f2Var;
                } else {
                    f2Var = f2Var2;
                }
                u50Var2.e(f2Var);
            }
        }
        int i3 = l70Var4.f;
        if (i3 == i) {
            t50 t50Var4 = ba0Var2.i;
            int i4 = 0;
            while (t50Var4 != null && i4 < i) {
                if (l70Var3 == null) {
                    throw y6.u("expected prior modifier list to be non-empty");
                }
                s50 s50Var = (s50) l70Var3.d[i4];
                s50 s50Var2 = (s50) l70Var4.d[i4];
                if (nz.l(s50Var, s50Var2)) {
                    l70Var2 = l70Var3;
                    z4 = 2;
                } else {
                    l70Var2 = l70Var3;
                    z4 = s50Var.getClass() == s50Var2.getClass();
                }
                if (!z4) {
                    t50Var4 = t50Var4.h;
                    break;
                }
                if (z4) {
                    ca0.m(s50Var, s50Var2, t50Var4);
                }
                t50Var4 = t50Var4.i;
                i4++;
                l70Var3 = l70Var2;
            }
            l70Var2 = l70Var3;
            if (i4 >= i) {
                ca0Var2 = ca0Var2;
                l70Var3 = l70Var2;
                z2 = false;
                ca0Var = ca0Var2;
                ba0Var = ba0Var2;
                l70Var = l70Var4;
                z = false;
                r7 = z2;
            } else {
                if (l70Var2 == null) {
                    throw y6.u("expected prior modifier list to be non-empty");
                }
                if (t50Var4 == null) {
                    throw y6.u("structuralUpdate requires a non-null tail");
                }
                boolean z5 = p10Var.K != null;
                t50 t50Var5 = t50Var4;
                ca0Var = ca0Var2;
                l70Var = l70Var4;
                l70Var3 = l70Var2;
                z3 = false;
                ca0Var.k(i4, l70Var3, l70Var, t50Var5, !z5);
                ba0Var = ba0Var2;
                z = true;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            u50 u50Var3 = p10Var.K;
            if (u50Var3 != null && i == 0) {
                t50 t50Var6 = ba0Var2;
                for (int i5 = 0; i5 < l70Var4.f; i5++) {
                    t50Var6 = ca0.c((s50) l70Var4.d[i5], t50Var6);
                }
                int i6 = 0;
                for (t50 t50Var7 = t50Var.h; t50Var7 != null && t50Var7 != ba0Var2; t50Var7 = t50Var7.h) {
                    i6 |= t50Var7.f;
                    t50Var7.g = i6;
                }
                ca0Var = ca0Var2;
                ba0Var = ba0Var2;
                l70Var = l70Var4;
                z = true;
                r7 = z3;
            } else if (i3 != 0) {
                if (l70Var3 == null) {
                    l70Var3 = new l70(new s50[16]);
                }
                ca0Var = ca0Var2;
                ba0Var = ba0Var2;
                l70Var = l70Var4;
                ca0Var.k(0, l70Var3, l70Var, ba0Var, !(u50Var3 != null));
                z = true;
            } else {
                if (l70Var3 == null) {
                    throw y6.u("expected prior modifier list to be non-empty");
                }
                t50 t50Var8 = ba0Var2.i;
                for (int i7 = 0; t50Var8 != null && i7 < l70Var3.f; i7++) {
                    t50Var8 = ca0.d(t50Var8).i;
                }
                p10 n = p10Var.n();
                iyVar.t = n != null ? (iy) n.F.g : null;
                ca0Var2.h = iyVar;
                ca0Var = ca0Var2;
                ba0Var = ba0Var2;
                l70Var = l70Var4;
                z = false;
                r7 = z2;
            }
        }
        ca0Var.b = l70Var;
        if (l70Var3 != null) {
            l70Var3.g();
        } else {
            l70Var3 = r7;
        }
        ca0Var.c = l70Var3;
        t50 t50Var9 = ba0Var.i;
        if (t50Var9 != null) {
            t50Var = t50Var9;
        }
        t50Var.h = r7;
        ba0Var.i = r7;
        ba0Var.g = -1;
        ba0Var.k = r7;
        if (t50Var == ba0Var) {
            cy.b("trimChain did not update the head");
        }
        ca0Var.j = t50Var;
        if (z) {
            ca0Var.l();
        }
        boolean h3 = ca0Var.h(16);
        boolean h4 = ca0Var.h(1024);
        this.G.j();
        if (this.j == null && ca0Var.h(512)) {
            S(this);
        }
        if (h == h3 && h2 == h4) {
            return;
        }
        bj0 rectManager = ((f3) mz.Q(this)).getRectManager();
        rectManager.getClass();
        if (B()) {
            aj0 aj0Var = rectManager.a;
            int i8 = this.e & 67108863;
            long[] jArr = (long[]) aj0Var.b;
            int i9 = aj0Var.a;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                int i11 = i10 + 2;
                long j = jArr[i11];
                if ((((int) j) & 67108863) == i8) {
                    jArr[i11] = (4611686018427387903L & j) | ((h4 ? 1L : 0L) * 4611686018427387904L) | ((h3 ? 1L : 0L) * Long.MIN_VALUE);
                    return;
                }
            }
        }
    }

    public final void b(dd0 dd0Var) {
        p10 p10Var;
        m2 m2Var;
        np0 p;
        if (this.p != null) {
            cy.b("Cannot attach " + this + " as it already is attached.  Tree: " + e(0));
        }
        p10 p10Var2 = this.o;
        if (p10Var2 != null && !nz.l(p10Var2.p, dd0Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(dd0Var);
            sb.append(") than the parent's owner(");
            p10 n = n();
            sb.append(n != null ? n.p : null);
            sb.append("). This tree: ");
            sb.append(e(0));
            sb.append(" Parent tree: ");
            p10 p10Var3 = this.o;
            sb.append(p10Var3 != null ? p10Var3.e(0) : null);
            cy.b(sb.toString());
        }
        p10 n2 = n();
        s10 s10Var = this.G;
        if (n2 == null) {
            s10Var.o.u = true;
            m40 m40Var = s10Var.p;
            if (m40Var != null) {
                m40Var.s = j40.d;
            }
        }
        ca0 ca0Var = this.F;
        ((ea0) ca0Var.h).t = n2 != null ? (iy) n2.F.g : null;
        this.p = dd0Var;
        this.q = (n2 != null ? n2.q : -1) + 1;
        u50 u50Var = this.K;
        if (u50Var != null) {
            a(u50Var);
        }
        this.K = null;
        ((f3) dd0Var).m15getLayoutNodes().h(this.e, this);
        p10 p10Var4 = this.o;
        if (p10Var4 == null || (p10Var = p10Var4.j) == null) {
            p10Var = this.j;
        }
        S(p10Var);
        if (this.j == null && ca0Var.h(512)) {
            S(this);
        }
        if (!this.N) {
            for (t50 t50Var = (t50) ca0Var.j; t50Var != null; t50Var = t50Var.i) {
                t50Var.X();
            }
        }
        l70 l70Var = (l70) this.l.e;
        Object[] objArr = l70Var.d;
        int i = l70Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((p10) objArr[i2]).b(dd0Var);
        }
        if (!this.N) {
            ca0Var.j();
        }
        x();
        if (n2 != null) {
            n2.x();
        }
        s10Var.j();
        if (!this.N && ca0Var.h(8)) {
            z();
        }
        f3 f3Var = (f3) dd0Var;
        if (!f3.j() || (m2Var = f3Var.H) == null || (p = p()) == null || !p.d.b(vp0.q)) {
            return;
        }
        m2Var.g.a(this.e);
        m2Var.a.p(m2Var.c, this.e, true);
    }

    public final void c() {
        this.D = this.C;
        n10 n10Var = n10.f;
        this.C = n10Var;
        l70 s = s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var = (p10) objArr[i2];
            if (p10Var.C != n10Var) {
                p10Var.c();
            }
        }
    }

    public final void d() {
        this.D = this.C;
        this.C = n10.f;
        l70 s = s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var = (p10) objArr[i2];
            if (p10Var.C == n10.e) {
                p10Var.d();
            }
        }
    }

    public final String e(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        l70 s = s();
        Object[] objArr = s.d;
        int i3 = s.f;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((p10) objArr[i4]).e(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    public final void f() {
        m2 m2Var;
        q10 q10Var;
        dd0 dd0Var = this.p;
        if (dd0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            p10 n = n();
            sb.append(n != null ? n.e(0) : null);
            cy.c(sb.toString());
            throw new kf();
        }
        p10 n2 = n();
        s10 s10Var = this.G;
        if (n2 != null) {
            n2.v();
            n2.x();
            f50 f50Var = s10Var.o;
            n10 n10Var = n10.f;
            f50Var.o = n10Var;
            m40 m40Var = s10Var.p;
            if (m40Var != null) {
                m40Var.m = n10Var;
            }
        }
        q10 q10Var2 = s10Var.o.z;
        q10Var2.b = true;
        q10Var2.c = false;
        q10Var2.d = false;
        q10Var2.e = false;
        q10Var2.f = null;
        m40 m40Var2 = s10Var.p;
        if (m40Var2 != null && (q10Var = m40Var2.t) != null) {
            q10Var.b = true;
            q10Var.c = false;
            q10Var.d = false;
            q10Var.e = false;
            q10Var.f = null;
        }
        ca0 ca0Var = this.F;
        t50 t50Var = (su0) ca0Var.i;
        ea0 ea0Var = ((iy) ca0Var.g).s;
        for (ea0 ea0Var2 = (ea0) ca0Var.h; !nz.l(ea0Var2, ea0Var) && ea0Var2 != null; ea0Var2 = ea0Var2.s) {
            ea0Var2.O0();
        }
        for (t50 t50Var2 = t50Var; t50Var2 != null; t50Var2 = t50Var2.h) {
            if (t50Var2.q) {
                t50Var2.g0();
            }
        }
        this.r = true;
        l70 l70Var = (l70) this.l.e;
        Object[] objArr = l70Var.d;
        int i = l70Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((p10) objArr[i2]).f();
        }
        this.r = false;
        while (t50Var != null) {
            if (t50Var.q) {
                t50Var.Y();
            }
            t50Var = t50Var.h;
        }
        f3 f3Var = (f3) dd0Var;
        f3Var.m15getLayoutNodes().g(this.e);
        d50 d50Var = f3Var.Q;
        t7 t7Var = d50Var.b;
        ((p01) t7Var.e).s(this);
        ((p01) t7Var.f).s(this);
        ((p01) t7Var.g).s(this);
        ((l70) d50Var.e.e).i(this);
        f3Var.I = true;
        f3Var.getRectManager().j(this);
        if (f3.j() && (m2Var = f3Var.H) != null && m2Var.g.e(this.e)) {
            m2Var.a.p(m2Var.c, this.e, false);
        }
        this.p = null;
        this.f = 9223372034707292159L;
        S(null);
        this.q = 0;
        f50 f50Var2 = s10Var.o;
        f50Var2.l = Integer.MAX_VALUE;
        f50Var2.k = Integer.MAX_VALUE;
        f50Var2.u = false;
        m40 m40Var3 = s10Var.p;
        if (m40Var3 != null) {
            m40Var3.l = Integer.MAX_VALUE;
            m40Var3.k = Integer.MAX_VALUE;
            m40Var3.s = j40.f;
        }
        if (ca0Var.h(8)) {
            np0 np0Var = this.t;
            this.t = null;
            this.s = false;
            f3Var.getSemanticsOwner().b(this, np0Var);
            f3Var.A();
        }
    }

    public final void g(kc kcVar, nv nvVar) {
        try {
            ((ea0) this.F.h).o0(kcVar, nvVar);
        } catch (Throwable th) {
            P(th);
            throw null;
        }
    }

    public final List i() {
        return s().f();
    }

    public final boolean j() {
        return this.G.o.x;
    }

    public final boolean k() {
        return this.G.o.w;
    }

    public final n10 l() {
        return this.G.o.o;
    }

    public final n10 m() {
        n10 n10Var;
        m40 m40Var = this.G.p;
        return (m40Var == null || (n10Var = m40Var.m) == null) ? n10.f : n10Var;
    }

    public final p10 n() {
        p10 p10Var = this.o;
        while (p10Var != null && p10Var.d) {
            p10Var = p10Var.o;
        }
        return p10Var;
    }

    public final int o() {
        return this.G.o.l;
    }

    public final np0 p() {
        if (B() && !this.N && this.F.h(8)) {
            return this.t;
        }
        return null;
    }

    @Override // defpackage.ed0
    public final boolean q() {
        return B();
    }

    public final l70 r() {
        boolean z = this.w;
        l70 l70Var = this.v;
        if (z) {
            l70Var.g();
            l70Var.c(l70Var.f, s());
            Arrays.sort(l70Var.d, 0, l70Var.f, Q);
            this.w = false;
        }
        return l70Var;
    }

    public final l70 s() {
        V();
        if (this.k == 0) {
            return (l70) this.l.e;
        }
        l70 l70Var = this.m;
        l70Var.getClass();
        return l70Var;
    }

    public final void t(long j, kw kwVar, int i, boolean z) {
        ca0 ca0Var = this.F;
        ea0 ea0Var = (ea0) ca0Var.h;
        wk0 wk0Var = ea0.M;
        ((ea0) ca0Var.h).A0(ea0.O, ea0Var.s0(j), kwVar, i, z);
    }

    public final String toString() {
        return mz.T(this) + " children: " + ((i70) i()).d.f + " measurePolicy: " + this.x + " deactivated: " + this.N;
    }

    public final void u(int i, p10 p10Var) {
        if (p10Var.o != null && p10Var.p != null) {
            cy.b(h(p10Var));
        }
        p10Var.o = this;
        j3 j3Var = this.l;
        ((l70) j3Var.e).a(i, p10Var);
        ((b) j3Var.f).a();
        H();
        if (p10Var.d) {
            this.k++;
        }
        A();
        dd0 dd0Var = this.p;
        if (dd0Var != null) {
            p10Var.b(dd0Var);
        }
        if (p10Var.G.k > 0) {
            s10 s10Var = this.G;
            s10Var.d(s10Var.k + 1);
        }
        if (p10Var.M > 0) {
            R(this.M + 1);
        }
    }

    public final void v() {
        if (this.I) {
            ca0 ca0Var = this.F;
            ea0 ea0Var = (iy) ca0Var.g;
            ea0 ea0Var2 = ((ea0) ca0Var.h).t;
            this.H = null;
            while (true) {
                if (nz.l(ea0Var, ea0Var2)) {
                    break;
                }
                if ((ea0Var != null ? ea0Var.L : null) != null) {
                    this.H = ea0Var;
                    break;
                }
                ea0Var = ea0Var != null ? ea0Var.t : null;
            }
        }
        ea0 ea0Var3 = this.H;
        if (ea0Var3 != null && ea0Var3.L == null) {
            throw y6.u("layer was not set");
        }
        if (ea0Var3 != null) {
            ea0Var3.C0();
            return;
        }
        p10 n = n();
        if (n != null) {
            n.v();
        }
    }

    public final void w() {
        ca0 ca0Var = this.F;
        ea0 ea0Var = (ea0) ca0Var.h;
        iy iyVar = (iy) ca0Var.g;
        while (ea0Var != iyVar) {
            ea0Var.getClass();
            k10 k10Var = (k10) ea0Var;
            cd0 cd0Var = k10Var.L;
            if (cd0Var != null) {
                ((pv) cd0Var).c();
            }
            ea0Var = k10Var.s;
        }
        cd0 cd0Var2 = ((iy) ca0Var.g).L;
        if (cd0Var2 != null) {
            ((pv) cd0Var2).c();
        }
    }

    public final void x() {
        if (this.d) {
            p10 n = n();
            if (n != null) {
                n.x();
                return;
            }
            return;
        }
        if (this.j != null) {
            K(this, false, 7);
        } else {
            M(this, false, 7);
        }
    }

    public final void y() {
        if (bz.a(this.f, 9223372034707292159L)) {
            return;
        }
        this.f = 9223372034707292159L;
        l70 s = s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((p10) objArr[i2]).y();
        }
    }

    public final void z() {
        if (this.u) {
            return;
        }
        if (((ba0) this.F.f).i != null || this.K != null) {
            this.s = true;
            return;
        }
        np0 np0Var = this.t;
        this.u = true;
        gj0 gj0Var = new gj0();
        gj0Var.d = new np0();
        fd0 snapshotObserver = ((f3) mz.Q(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.d, new a3(7, this, gj0Var));
        this.u = false;
        this.t = (np0) gj0Var.d;
        this.s = false;
        f3 f3Var = (f3) mz.Q(this);
        f3Var.getSemanticsOwner().b(this, np0Var);
        f3Var.A();
    }

    public p10(int i) {
        this(op0.a.addAndGet(1), (i & 1) == 0);
    }
}
