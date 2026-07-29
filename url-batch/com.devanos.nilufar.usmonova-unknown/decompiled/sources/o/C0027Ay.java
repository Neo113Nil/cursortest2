package o;

import java.util.List;

/* renamed from: o.Ay, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027Ay implements InterfaceC0699aH, InterfaceC1181hd {
    public static final GO E = new GO(1);
    public static final C2321yy F = new C2321yy();
    public static final T2 G = new T2(3);
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public final boolean b;
    public final int c;
    public C0027Ay d;
    public int e;
    public final C0208Hx f;
    public YD g;
    public boolean h;
    public C0027Ay i;
    public ZG j;
    public int k;
    public boolean l;
    public C2023uQ m;
    public final YD n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16o;
    public LB p;
    public InterfaceC1119gh q;
    public EnumC2057uy r;
    public FZ s;
    public boolean t;
    public final C1970td u;
    public final C0209Hy v;
    public ME w;
    public boolean x;
    public UC y;
    public UC z;

    public C0027Ay(int i) {
        this(AbstractC2089vQ.a.addAndGet(1), (i & 1) == 0);
    }

    public static boolean A(C0027Ay c0027Ay) {
        C0157Fy c0157Fy = c0027Ay.v.q;
        C0603Xd c0603Xd = c0157Fy.j ? new C0603Xd(c0157Fy.e) : null;
        if (c0603Xd == null) {
            c0027Ay.getClass();
            return false;
        }
        if (c0027Ay.C == 3) {
            c0027Ay.c();
        }
        return c0027Ay.v.q.M(c0603Xd.a);
    }

    public static void C(C0027Ay c0027Ay, boolean z, int i) {
        C0027Ay l;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        if (c0027Ay.d == null) {
            AbstractC0868ct.W("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        ZG zg = c0027Ay.j;
        if (zg == null || c0027Ay.l || c0027Ay.b) {
            return;
        }
        ((S2) zg).x(c0027Ay, true, z);
        if (z2) {
            C0131Ey c0131Ey = c0027Ay.v.r;
            AbstractC0048Bt.k(c0131Ey);
            C0209Hy c0209Hy = c0131Ey.v;
            C0027Ay l2 = c0209Hy.a.l();
            int i2 = c0209Hy.a.C;
            if (l2 == null || i2 == 3) {
                return;
            }
            while (l2.C == i2 && (l = l2.l()) != null) {
                l2 = l;
            }
            int v = AbstractC1888sN.v(i2);
            if (v == 0) {
                if (l2.d != null) {
                    C(l2, z, 6);
                    return;
                } else {
                    E(l2, z, 6);
                    return;
                }
            }
            if (v != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (l2.d != null) {
                l2.B(z);
            } else {
                l2.D(z);
            }
        }
    }

    public static void E(C0027Ay c0027Ay, boolean z, int i) {
        ZG zg;
        C0027Ay l;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        if (c0027Ay.l || c0027Ay.b || (zg = c0027Ay.j) == null) {
            return;
        }
        ((S2) zg).x(c0027Ay, false, z);
        if (z2) {
            C0027Ay c0027Ay2 = c0027Ay.v.q.B.a;
            C0027Ay l2 = c0027Ay2.l();
            int i2 = c0027Ay2.C;
            if (l2 == null || i2 == 3) {
                return;
            }
            while (l2.C == i2 && (l = l2.l()) != null) {
                l2 = l;
            }
            int v = AbstractC1888sN.v(i2);
            if (v == 0) {
                E(l2, z, 6);
            } else {
                if (v != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                l2.D(z);
            }
        }
    }

    public static void F(C0027Ay c0027Ay) {
        C0209Hy c0209Hy = c0027Ay.v;
        if (AbstractC2387zy.a[AbstractC1888sN.v(c0209Hy.b)] != 1) {
            throw new IllegalStateException("Unexpected state ".concat(AbstractC2188wx.n(c0209Hy.b)));
        }
        if (c0209Hy.f) {
            C(c0027Ay, true, 6);
            return;
        }
        if (c0209Hy.g) {
            c0027Ay.B(true);
        }
        if (c0209Hy.c) {
            E(c0027Ay, true, 6);
        } else if (c0209Hy.d) {
            c0027Ay.D(true);
        }
    }

    public final void B(boolean z) {
        ZG zg;
        if (this.b || (zg = this.j) == null) {
            return;
        }
        ((S2) zg).y(this, true, z);
    }

    public final void D(boolean z) {
        ZG zg;
        if (this.b || (zg = this.j) == null) {
            return;
        }
        ((S2) zg).y(this, false, z);
    }

    public final void G() {
        C1970td c1970td = this.u;
        TC tc = (IU) c1970td.e;
        for (TC tc2 = (IU) c1970td.e; tc2 != null; tc2 = tc2.e) {
            boolean z = tc2.m;
            if (z && !z) {
                AbstractC0868ct.W("reset() called on an unattached node");
                throw null;
            }
        }
        for (TC tc3 = tc; tc3 != null; tc3 = tc3.e) {
            if (tc3.m) {
                tc3.p();
            }
        }
        while (tc != null) {
            if (tc.m) {
                tc.l();
            }
            tc = tc.e;
        }
    }

    public final void H() {
        YD o2 = o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay = (C0027Ay) objArr[i2];
                int i3 = c0027Ay.D;
                c0027Ay.C = i3;
                if (i3 != 3) {
                    c0027Ay.H();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void I(InterfaceC1119gh interfaceC1119gh) {
        if (AbstractC0048Bt.h(this.q, interfaceC1119gh)) {
            return;
        }
        this.q = interfaceC1119gh;
        s();
        C0027Ay l = l();
        if (l != null) {
            l.q();
        }
        r();
        for (TC tc = (TC) this.u.f; tc != null; tc = tc.f) {
            if ((tc.c & 16) != 0) {
                AbstractC0048Bt.l(((X7) tc).n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                throw new ClassCastException();
            }
        }
    }

    public final void J(C0027Ay c0027Ay) {
        if (AbstractC0048Bt.h(c0027Ay, this.d)) {
            return;
        }
        this.d = c0027Ay;
        if (c0027Ay != null) {
            C0209Hy c0209Hy = this.v;
            if (c0209Hy.r == null) {
                c0209Hy.r = new C0131Ey(c0209Hy);
            }
            C1970td c1970td = this.u;
            ME me = ((C0384Os) c1970td.c).m;
            for (ME me2 = (ME) c1970td.d; !AbstractC0048Bt.h(me2, me) && me2 != null; me2 = me2.m) {
                me2.c0();
            }
        }
        s();
    }

    public final void K(UC uc) {
        if (this.b && this.y != RC.a) {
            AbstractC0868ct.V("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.B) {
            AbstractC0868ct.V("modifier is updated when deactivated");
            throw null;
        }
        if (v()) {
            a(uc);
        } else {
            this.z = uc;
        }
    }

    public final void L() {
        if (this.e <= 0 || !this.h) {
            return;
        }
        int i = 0;
        this.h = false;
        YD yd = this.g;
        if (yd == null) {
            yd = new YD(new C0027Ay[16]);
            this.g = yd;
        }
        yd.h();
        YD yd2 = (YD) this.f.i;
        int i2 = yd2.j;
        if (i2 > 0) {
            Object[] objArr = yd2.h;
            do {
                C0027Ay c0027Ay = (C0027Ay) objArr[i];
                if (c0027Ay.b) {
                    yd.e(yd.j, c0027Ay.o());
                } else {
                    yd.b(c0027Ay);
                }
                i++;
            } while (i < i2);
        }
        C0209Hy c0209Hy = this.v;
        c0209Hy.q.s = true;
        C0131Ey c0131Ey = c0209Hy.r;
        if (c0131Ey != null) {
            c0131Ey.s = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.ME, o.TC] */
    public final void a(UC uc) {
        boolean z;
        YD yd;
        YD yd2;
        C1970td c1970td;
        YD yd3;
        C2255xy c2255xy;
        ?? r17;
        boolean z2;
        char c;
        this.y = uc;
        C1970td c1970td2 = this.u;
        IU iu = (IU) c1970td2.e;
        ME me = (C0384Os) c1970td2.c;
        C0027Ay c0027Ay = (C0027Ay) c1970td2.b;
        TC tc = (TC) c1970td2.f;
        TC tc2 = HE.a;
        if (tc == tc2) {
            AbstractC0868ct.W("padChain called on already padded chain");
            throw null;
        }
        tc.e = tc2;
        tc2.f = tc;
        YD yd4 = (YD) c1970td2.g;
        int i = yd4 != null ? yd4.j : 0;
        YD yd5 = (YD) c1970td2.h;
        if (yd5 == null) {
            yd5 = new YD(new SC[16]);
        }
        int i2 = yd5.j;
        if (i2 < 16) {
            i2 = 16;
        }
        YD yd6 = new YD(new UC[i2]);
        yd6.b(uc);
        C1400l c1400l = null;
        while (true) {
            z = true;
            if (!yd6.l()) {
                break;
            }
            UC uc2 = (UC) yd6.n(yd6.j - 1);
            if (uc2 instanceof C2035uc) {
                C2035uc c2035uc = (C2035uc) uc2;
                yd6.b(c2035uc.b);
                yd6.b(c2035uc.a);
            } else if (uc2 instanceof SC) {
                yd5.b(uc2);
            } else {
                if (c1400l == null) {
                    c1400l = new C1400l(26, yd5);
                }
                uc2.a(c1400l);
                c1400l = c1400l;
            }
        }
        int i3 = yd5.j;
        if (i3 == i) {
            TC tc3 = tc2.f;
            int i4 = 0;
            while (tc3 != null && i4 < i) {
                if (yd4 == null) {
                    AbstractC0868ct.X("expected prior modifier list to be non-empty");
                    throw null;
                }
                SC sc = (SC) yd4.h[i4];
                SC sc2 = (SC) yd5.h[i4];
                if (AbstractC0048Bt.h(sc, sc2)) {
                    c = 2;
                    z2 = false;
                } else {
                    z2 = false;
                    z2 = false;
                    c = sc.getClass() == sc2.getClass() ? (char) 1 : (char) 0;
                }
                if (c == 0) {
                    tc3 = tc3.e;
                    r17 = z2;
                    break;
                } else {
                    if (c == 1) {
                        C1970td.j(sc, sc2, tc3);
                    }
                    tc3 = tc3.f;
                    i4++;
                }
            }
            r17 = 0;
            if (i4 >= i) {
                c1970td2 = c1970td2;
                yd = yd5;
                yd3 = r17;
                c1970td = c1970td2;
                z = false;
                yd2 = yd3;
            } else {
                if (yd4 == null) {
                    AbstractC0868ct.X("expected prior modifier list to be non-empty");
                    throw r17;
                }
                if (tc3 == null) {
                    AbstractC0868ct.X("structuralUpdate requires a non-null tail");
                    throw r17;
                }
                TC tc4 = tc3;
                c1970td = c1970td2;
                yd = yd5;
                c1970td.i(i4, yd4, yd, tc4, !(c0027Ay.z != null));
                yd2 = r17;
            }
        } else {
            yd = yd5;
            yd2 = null;
            yd2 = null;
            yd3 = null;
            UC uc3 = c0027Ay.z;
            if (uc3 != null && i == 0) {
                for (int i5 = 0; i5 < yd.j; i5++) {
                    tc2 = C1970td.b((SC) yd.h[i5], tc2);
                }
                TC tc5 = ((IU) c1970td2.e).e;
                int i6 = 0;
                while (tc5 != null && tc5 != HE.a) {
                    int i7 = i6 | tc5.c;
                    tc5.d = i7;
                    tc5 = tc5.e;
                    i6 = i7;
                }
                c1970td = c1970td2;
            } else if (i3 != 0) {
                if (yd4 == null) {
                    yd4 = new YD(new SC[16]);
                }
                c1970td = c1970td2;
                c1970td.i(0, yd4, yd, tc2, !(uc3 != null));
            } else {
                if (yd4 == null) {
                    AbstractC0868ct.X("expected prior modifier list to be non-empty");
                    throw null;
                }
                TC tc6 = tc2.f;
                for (int i8 = 0; tc6 != null && i8 < yd4.j; i8++) {
                    tc6 = C1970td.c(tc6).f;
                }
                C0027Ay l = c0027Ay.l();
                me.n = l != null ? (C0384Os) l.u.c : null;
                c1970td2.d = me;
                c1970td = c1970td2;
                z = false;
                yd2 = yd3;
            }
        }
        c1970td.g = yd;
        if (yd4 != null) {
            yd4.h();
        } else {
            yd4 = yd2;
        }
        c1970td.h = yd4;
        GE ge = HE.a;
        TC tc7 = ge.f;
        if (tc7 == null) {
            tc7 = iu;
        }
        ?? r4 = yd2;
        tc7.e = r4;
        ge.f = r4;
        ge.d = -1;
        ge.h = r4;
        if (tc7 == ge) {
            AbstractC0868ct.W("trimChain did not update the head");
            throw null;
        }
        c1970td.f = tc7;
        if (z) {
            for (TC tc8 = iu.e; tc8 != null; tc8 = tc8.e) {
                InterfaceC2123vy interfaceC2123vy = ((tc8.c & 2) == 0 || !(tc8 instanceof InterfaceC2123vy)) ? null : (InterfaceC2123vy) tc8;
                if (interfaceC2123vy != null) {
                    ME me2 = tc8.h;
                    if (me2 != null) {
                        C2255xy c2255xy2 = (C2255xy) me2;
                        InterfaceC2123vy interfaceC2123vy2 = c2255xy2.H;
                        c2255xy2.D0(interfaceC2123vy);
                        c2255xy = c2255xy2;
                        if (interfaceC2123vy2 != tc8) {
                            YG yg = c2255xy2.C;
                            c2255xy = c2255xy2;
                            if (yg != null) {
                                yg.invalidate();
                                c2255xy = c2255xy2;
                            }
                        }
                    } else {
                        C2255xy c2255xy3 = new C2255xy(c0027Ay, interfaceC2123vy);
                        tc8.h = c2255xy3;
                        c2255xy = c2255xy3;
                    }
                    me.n = c2255xy;
                    c2255xy.m = me;
                    me = c2255xy;
                } else {
                    tc8.h = me;
                }
            }
            C0027Ay l2 = c0027Ay.l();
            me.n = l2 != null ? (C0384Os) l2.u.c : null;
            c1970td.d = me;
        }
        this.v.h();
        if (this.d == null && c1970td.f(512)) {
            J(this);
        }
    }

    public final void b(ZG zg) {
        C0027Ay c0027Ay;
        if (this.j != null) {
            AbstractC0868ct.W("Cannot attach " + this + " as it already is attached.  Tree: " + e(0));
            throw null;
        }
        C0027Ay c0027Ay2 = this.i;
        if (c0027Ay2 != null && !AbstractC0048Bt.h(c0027Ay2.j, zg)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(zg);
            sb.append(") than the parent's owner(");
            C0027Ay l = l();
            sb.append(l != null ? l.j : null);
            sb.append("). This tree: ");
            sb.append(e(0));
            sb.append(" Parent tree: ");
            C0027Ay c0027Ay3 = this.i;
            sb.append(c0027Ay3 != null ? c0027Ay3.e(0) : null);
            AbstractC0868ct.W(sb.toString());
            throw null;
        }
        C0027Ay l2 = l();
        C0209Hy c0209Hy = this.v;
        if (l2 == null) {
            c0209Hy.q.f42o = true;
            C0131Ey c0131Ey = c0209Hy.r;
            if (c0131Ey != null) {
                c0131Ey.p = true;
            }
        }
        C1970td c1970td = this.u;
        ((ME) c1970td.d).n = l2 != null ? (C0384Os) l2.u.c : null;
        this.j = zg;
        this.k = (l2 != null ? l2.k : -1) + 1;
        UC uc = this.z;
        if (uc != null) {
            a(uc);
        }
        this.z = null;
        if (c1970td.f(8)) {
            t();
        }
        zg.getClass();
        C0027Ay c0027Ay4 = this.i;
        if (c0027Ay4 == null || (c0027Ay = c0027Ay4.d) == null) {
            c0027Ay = this.d;
        }
        J(c0027Ay);
        if (this.d == null && c1970td.f(512)) {
            J(this);
        }
        if (!this.B) {
            for (TC tc = (TC) c1970td.f; tc != null; tc = tc.f) {
                tc.k();
            }
        }
        YD yd = (YD) this.f.i;
        int i = yd.j;
        if (i > 0) {
            Object[] objArr = yd.h;
            int i2 = 0;
            do {
                ((C0027Ay) objArr[i2]).b(zg);
                i2++;
            } while (i2 < i);
        }
        if (!this.B) {
            for (TC tc2 = (TC) c1970td.f; tc2 != null; tc2 = tc2.f) {
                tc2.o();
                if (tc2.i) {
                    NE.a(tc2);
                }
                if (tc2.j) {
                    NE.c(tc2);
                }
                tc2.i = false;
                tc2.j = false;
            }
        }
        s();
        if (l2 != null) {
            l2.s();
        }
        ME me = ((C0384Os) c1970td.c).m;
        for (ME me2 = (ME) c1970td.d; !AbstractC0048Bt.h(me2, me) && me2 != null; me2 = me2.m) {
            me2.A0(me2.p, true);
            YG yg = me2.C;
            if (yg != null) {
                yg.invalidate();
            }
        }
        c0209Hy.h();
        if (this.B) {
            return;
        }
        TC tc3 = (TC) c1970td.f;
        if ((tc3.d & 7168) != 0) {
            while (tc3 != null) {
                int i3 = tc3.c;
                if (((i3 & 4096) != 0) | ((i3 & 1024) != 0) | ((i3 & 2048) != 0)) {
                    NE.a(tc3);
                }
                tc3 = tc3.f;
            }
        }
    }

    public final void c() {
        this.D = this.C;
        this.C = 3;
        YD o2 = o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay = (C0027Ay) objArr[i2];
                if (c0027Ay.C != 3) {
                    c0027Ay.c();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void d() {
        this.D = this.C;
        this.C = 3;
        YD o2 = o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay = (C0027Ay) objArr[i2];
                if (c0027Ay.C == 2) {
                    c0027Ay.d();
                }
                i2++;
            } while (i2 < i);
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
        YD o2 = o();
        int i3 = o2.j;
        if (i3 > 0) {
            Object[] objArr = o2.h;
            int i4 = 0;
            do {
                sb.append(((C0027Ay) objArr[i4]).e(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String sb2 = sb.toString();
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void f() {
        C0053By c0053By;
        ZG zg = this.j;
        if (zg == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            C0027Ay l = l();
            sb.append(l != null ? l.e(0) : null);
            AbstractC0868ct.X(sb.toString());
            throw null;
        }
        C0027Ay l2 = l();
        C0209Hy c0209Hy = this.v;
        if (l2 != null) {
            l2.q();
            l2.s();
            c0209Hy.q.l = 3;
            C0131Ey c0131Ey = c0209Hy.r;
            if (c0131Ey != null) {
                c0131Ey.j = 3;
            }
        }
        C0053By c0053By2 = c0209Hy.q.q;
        c0053By2.b = true;
        c0053By2.c = false;
        c0053By2.d = false;
        c0053By2.e = false;
        c0053By2.f = null;
        C0131Ey c0131Ey2 = c0209Hy.r;
        if (c0131Ey2 != null && (c0053By = c0131Ey2.q) != null) {
            c0053By.b = true;
            c0053By.c = false;
            c0053By.d = false;
            c0053By.e = false;
            c0053By.f = null;
        }
        C1970td c1970td = this.u;
        boolean f = c1970td.f(8);
        TC tc = (IU) c1970td.e;
        if (f) {
            t();
        }
        for (TC tc2 = tc; tc2 != null; tc2 = tc2.e) {
            if (tc2.m) {
                tc2.p();
            }
        }
        this.l = true;
        YD yd = (YD) this.f.i;
        int i = yd.j;
        if (i > 0) {
            Object[] objArr = yd.h;
            int i2 = 0;
            do {
                ((C0027Ay) objArr[i2]).f();
                i2++;
            } while (i2 < i);
        }
        this.l = false;
        while (tc != null) {
            if (tc.m) {
                tc.l();
            }
            tc = tc.e;
        }
        S2 s2 = (S2) zg;
        KB kb = s2.N;
        C2002u5 c2002u5 = kb.b;
        ((C2002u5) c2002u5.i).W(this);
        ((C2002u5) c2002u5.j).W(this);
        ((YD) kb.e.i).m(this);
        s2.F = true;
        this.j = null;
        J(null);
        this.k = 0;
        C0157Fy c0157Fy = c0209Hy.q;
        c0157Fy.i = Integer.MAX_VALUE;
        c0157Fy.h = Integer.MAX_VALUE;
        c0157Fy.f42o = false;
        C0131Ey c0131Ey3 = c0209Hy.r;
        if (c0131Ey3 != null) {
            c0131Ey3.i = Integer.MAX_VALUE;
            c0131Ey3.h = Integer.MAX_VALUE;
            c0131Ey3.p = false;
        }
    }

    public final void g(InterfaceC0980ea interfaceC0980ea, C0512Tq c0512Tq) {
        ((ME) this.u.d).Z(interfaceC0980ea, c0512Tq);
    }

    public final List h() {
        return o().g();
    }

    public final C2023uQ i() {
        if (!v() || this.B) {
            return null;
        }
        if (!this.u.f(8) || this.m != null) {
            return this.m;
        }
        C1360kM c1360kM = new C1360kM();
        c1360kM.h = new C2023uQ();
        C0765bH snapshotObserver = ((S2) PX.J0(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.d, new K2(this, 13, c1360kM));
        C2023uQ c2023uQ = (C2023uQ) c1360kM.h;
        this.m = c2023uQ;
        return c2023uQ;
    }

    @Override // o.InterfaceC0699aH
    public final boolean j() {
        return v();
    }

    public final int k() {
        int i;
        C0131Ey c0131Ey = this.v.r;
        if (c0131Ey == null || (i = c0131Ey.j) == 0) {
            return 3;
        }
        return i;
    }

    public final C0027Ay l() {
        C0027Ay c0027Ay = this.i;
        while (c0027Ay != null && c0027Ay.b) {
            c0027Ay = c0027Ay.i;
        }
        return c0027Ay;
    }

    public final int m() {
        return this.v.q.i;
    }

    public final YD n() {
        boolean z = this.f16o;
        YD yd = this.n;
        if (z) {
            yd.h();
            yd.e(yd.j, o());
            yd.p(G);
            this.f16o = false;
        }
        return yd;
    }

    public final YD o() {
        L();
        if (this.e == 0) {
            return (YD) this.f.i;
        }
        YD yd = this.g;
        AbstractC0048Bt.k(yd);
        return yd;
    }

    public final void p(long j, C2182wr c2182wr, boolean z, boolean z2) {
        C1970td c1970td = this.u;
        ME me = (ME) c1970td.d;
        C1823rO c1823rO = ME.D;
        ((ME) c1970td.d).l0(ME.F, me.e0(j), c2182wr, z, z2);
    }

    public final void q() {
        if (this.x) {
            C1970td c1970td = this.u;
            ME me = (C0384Os) c1970td.c;
            ME me2 = ((ME) c1970td.d).n;
            this.w = null;
            while (true) {
                if (AbstractC0048Bt.h(me, me2)) {
                    break;
                }
                if ((me != null ? me.C : null) != null) {
                    this.w = me;
                    break;
                }
                me = me != null ? me.n : null;
            }
        }
        ME me3 = this.w;
        if (me3 != null && me3.C == null) {
            AbstractC0868ct.X("layer was not set");
            throw null;
        }
        if (me3 != null) {
            me3.n0();
            return;
        }
        C0027Ay l = l();
        if (l != null) {
            l.q();
        }
    }

    public final void r() {
        C1970td c1970td = this.u;
        ME me = (ME) c1970td.d;
        C0384Os c0384Os = (C0384Os) c1970td.c;
        while (me != c0384Os) {
            AbstractC0048Bt.l(me, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C2255xy c2255xy = (C2255xy) me;
            YG yg = c2255xy.C;
            if (yg != null) {
                yg.invalidate();
            }
            me = c2255xy.m;
        }
        YG yg2 = ((C0384Os) c1970td.c).C;
        if (yg2 != null) {
            yg2.invalidate();
        }
    }

    public final void s() {
        if (this.d != null) {
            C(this, false, 7);
        } else {
            E(this, false, 7);
        }
    }

    public final void t() {
        this.m = null;
        ((S2) PX.J0(this)).z();
    }

    public final String toString() {
        return AbstractC0946e20.O(this) + " children: " + ((VD) h()).h.j + " measurePolicy: " + this.p;
    }

    public final void u() {
        C0027Ay c0027Ay;
        if (this.e > 0) {
            this.h = true;
        }
        if (!this.b || (c0027Ay = this.i) == null) {
            return;
        }
        c0027Ay.u();
    }

    public final boolean v() {
        return this.j != null;
    }

    public final boolean w() {
        return this.v.q.f42o;
    }

    public final Boolean x() {
        C0131Ey c0131Ey = this.v.r;
        if (c0131Ey != null) {
            return Boolean.valueOf(c0131Ey.p);
        }
        return null;
    }

    public final void y(C0027Ay c0027Ay) {
        if (c0027Ay.v.m > 0) {
            this.v.b(r0.m - 1);
        }
        if (this.j != null) {
            c0027Ay.f();
        }
        c0027Ay.i = null;
        ((ME) c0027Ay.u.d).n = null;
        if (c0027Ay.b) {
            this.e--;
            YD yd = (YD) c0027Ay.f.i;
            int i = yd.j;
            if (i > 0) {
                Object[] objArr = yd.h;
                int i2 = 0;
                do {
                    ((ME) ((C0027Ay) objArr[i2]).u.d).n = null;
                    i2++;
                } while (i2 < i);
            }
        }
        u();
        z();
    }

    public final void z() {
        if (!this.b) {
            this.f16o = true;
            return;
        }
        C0027Ay l = l();
        if (l != null) {
            l.z();
        }
    }

    public C0027Ay(int i, boolean z) {
        this.b = z;
        this.c = i;
        this.f = new C0208Hx(new YD(new C0027Ay[16]), 9, new C1139h0(24, this));
        this.n = new YD(new C0027Ay[16]);
        this.f16o = true;
        this.p = E;
        this.q = PX.j;
        this.r = EnumC2057uy.h;
        this.s = F;
        InterfaceC2168wd.b.getClass();
        this.C = 3;
        this.D = 3;
        this.u = new C1970td(this);
        this.v = new C0209Hy(this);
        this.x = true;
        this.y = RC.a;
    }
}
