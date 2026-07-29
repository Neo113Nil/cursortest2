package o;

/* renamed from: o.Fy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157Fy extends AbstractC0700aI implements IB, InterfaceC1405l2, InterfaceC1351kD {
    public boolean A;
    public final /* synthetic */ C0209Hy B;
    public boolean g;
    public boolean j;
    public boolean k;
    public InterfaceC2114vp n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f42o;
    public boolean p;
    public boolean t;
    public float v;
    public boolean w;
    public InterfaceC2114vp x;
    public final K2 z;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int l = 3;
    public long m = 0;
    public final C0053By q = new C0053By(this, 0);
    public final YD r = new YD(new C0157Fy[16]);
    public boolean s = true;
    public final C1139h0 u = new C1139h0(25, this);
    public long y = 0;

    public C0157Fy(C0209Hy c0209Hy) {
        this.B = c0209Hy;
        this.z = new K2(c0209Hy, 14, this);
    }

    @Override // o.InterfaceC1351kD
    public final void A() {
        this.B.a().getClass();
    }

    @Override // o.InterfaceC1405l2
    public final void B() {
        C0027Ay.E(this.B.a, false, 7);
    }

    @Override // o.AbstractC0700aI
    public final void E(long j, float f, InterfaceC2114vp interfaceC2114vp) {
        ZH placementScope;
        C0209Hy c0209Hy = this.B;
        C0027Ay c0027Ay = c0209Hy.a;
        this.p = true;
        if (j != this.m || this.A) {
            if (c0209Hy.l || c0209Hy.k || this.A) {
                c0209Hy.d = true;
                this.A = false;
            }
            J();
        }
        if (AbstractC0868ct.F(c0027Ay)) {
            ME me = c0209Hy.a().n;
            if (me == null || (placementScope = me.i) == null) {
                placementScope = ((S2) PX.J0(c0027Ay)).getPlacementScope();
            }
            C0131Ey c0131Ey = c0209Hy.r;
            AbstractC0048Bt.k(c0131Ey);
            C0027Ay l = c0027Ay.l();
            if (l != null) {
                l.v.i = 0;
            }
            c0131Ey.i = Integer.MAX_VALUE;
            placementScope.getClass();
            long c = AbstractC1305jX.c((int) (j >> 32), (int) (4294967295L & j));
            ZH.a(placementScope, c0131Ey);
            c0131Ey.E(EB.L(c, c0131Ey.f), 0.0f, null);
        }
        C0131Ey c0131Ey2 = c0209Hy.r;
        if (c0131Ey2 == null || c0131Ey2.k) {
            L(j, interfaceC2114vp);
        } else {
            AbstractC0868ct.W("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    public final void H() {
        boolean z = this.f42o;
        this.f42o = true;
        C0027Ay c0027Ay = this.B.a;
        if (!z) {
            C0209Hy c0209Hy = c0027Ay.v;
            if (c0209Hy.c) {
                C0027Ay.E(c0027Ay, true, 6);
            } else if (c0209Hy.f) {
                C0027Ay.C(c0027Ay, true, 6);
            }
        }
        C1970td c1970td = c0027Ay.u;
        ME me = ((C0384Os) c1970td.c).m;
        for (ME me2 = (ME) c1970td.d; !AbstractC0048Bt.h(me2, me) && me2 != null; me2 = me2.m) {
            if (me2.B) {
                me2.n0();
            }
        }
        YD o2 = c0027Ay.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay2 = (C0027Ay) objArr[i2];
                if (c0027Ay2.m() != Integer.MAX_VALUE) {
                    c0027Ay2.v.q.H();
                    C0027Ay.F(c0027Ay2);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void I() {
        C0027Ay c0027Ay = this.B.a;
        if (this.f42o) {
            int i = 0;
            this.f42o = false;
            C1970td c1970td = c0027Ay.u;
            ME me = ((C0384Os) c1970td.c).m;
            for (ME me2 = (ME) c1970td.d; !AbstractC0048Bt.h(me2, me) && me2 != null; me2 = me2.m) {
                if (me2.C != null) {
                    me2.A0(null, false);
                    me2.l.D(false);
                }
            }
            YD o2 = c0027Ay.o();
            int i2 = o2.j;
            if (i2 > 0) {
                Object[] objArr = o2.h;
                do {
                    ((C0027Ay) objArr[i]).v.q.I();
                    i++;
                } while (i < i2);
            }
        }
    }

    public final void J() {
        YD o2;
        int i;
        C0209Hy c0209Hy = this.B;
        if (c0209Hy.m <= 0 || (i = (o2 = c0209Hy.a.o()).j) <= 0) {
            return;
        }
        Object[] objArr = o2.h;
        int i2 = 0;
        do {
            C0027Ay c0027Ay = (C0027Ay) objArr[i2];
            C0209Hy c0209Hy2 = c0027Ay.v;
            if ((c0209Hy2.k || c0209Hy2.l) && !c0209Hy2.d) {
                c0027Ay.D(false);
            }
            c0209Hy2.q.J();
            i2++;
        } while (i2 < i);
    }

    public final void K() {
        this.w = true;
        C0027Ay c0027Ay = this.B.a;
        C0027Ay l = c0027Ay.l();
        float f = n().w;
        C1970td c1970td = c0027Ay.u;
        ME me = (ME) c1970td.d;
        C0384Os c0384Os = (C0384Os) c1970td.c;
        while (me != c0384Os) {
            AbstractC0048Bt.l(me, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C2255xy c2255xy = (C2255xy) me;
            f += c2255xy.w;
            me = c2255xy.m;
        }
        if (f != this.v) {
            this.v = f;
            if (l != null) {
                l.z();
            }
            if (l != null) {
                l.q();
            }
        }
        if (!this.f42o) {
            if (l != null) {
                l.q();
            }
            H();
            if (this.g && l != null) {
                l.D(false);
            }
        }
        if (l == null) {
            this.i = 0;
        } else if (!this.g) {
            C0209Hy c0209Hy = l.v;
            if (c0209Hy.b == 3) {
                if (this.i != Integer.MAX_VALUE) {
                    AbstractC0868ct.W("Place was called on a node which was placed already");
                    throw null;
                }
                int i = c0209Hy.j;
                this.i = i;
                c0209Hy.j = i + 1;
            }
        }
        r();
    }

    public final void L(long j, InterfaceC2114vp interfaceC2114vp) {
        C0209Hy c0209Hy = this.B;
        C0027Ay c0027Ay = c0209Hy.a;
        if (c0027Ay.B) {
            AbstractC0868ct.V("place is called on a deactivated node");
            throw null;
        }
        c0209Hy.b = 3;
        this.m = j;
        this.n = interfaceC2114vp;
        this.k = true;
        this.w = false;
        ZG J0 = PX.J0(c0027Ay);
        if (c0209Hy.d || !this.f42o) {
            this.q.e = false;
            c0209Hy.d(false);
            this.x = interfaceC2114vp;
            this.y = j;
            C0765bH snapshotObserver = ((S2) J0).getSnapshotObserver();
            snapshotObserver.a(c0027Ay, snapshotObserver.f, this.z);
        } else {
            ME a = c0209Hy.a();
            a.v0(EB.L(j, a.f), 0.0f, interfaceC2114vp);
            K();
        }
        c0209Hy.b = 5;
    }

    public final boolean M(long j) {
        C0209Hy c0209Hy = this.B;
        C0027Ay c0027Ay = c0209Hy.a;
        if (c0027Ay.B) {
            AbstractC0868ct.V("measure is called on a deactivated node");
            throw null;
        }
        ZG J0 = PX.J0(c0027Ay);
        C0027Ay l = c0027Ay.l();
        boolean z = true;
        c0027Ay.t = c0027Ay.t || (l != null && l.t);
        if (!c0027Ay.v.c && this.e == j) {
            ((S2) J0).i(c0027Ay, false);
            c0027Ay.H();
            return false;
        }
        this.q.d = false;
        YD o2 = c0027Ay.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                ((C0027Ay) objArr[i2]).v.q.q.getClass();
                i2++;
            } while (i2 < i);
        }
        this.j = true;
        long j2 = c0209Hy.a().d;
        G(j);
        if (c0209Hy.b != 5) {
            AbstractC0868ct.W("layout state is not idle before measure starts");
            throw null;
        }
        c0209Hy.b = 1;
        c0209Hy.c = false;
        c0209Hy.s = j;
        C0765bH snapshotObserver = ((S2) PX.J0(c0027Ay)).getSnapshotObserver();
        snapshotObserver.a(c0027Ay, snapshotObserver.c, c0209Hy.t);
        if (c0209Hy.b == 1) {
            c0209Hy.d = true;
            c0209Hy.e = true;
            c0209Hy.b = 5;
        }
        if (PX.G(c0209Hy.a().d, j2) && c0209Hy.a().b == this.b && c0209Hy.a().c == this.c) {
            z = false;
        }
        F(AbstractC0946e20.a(c0209Hy.a().b, c0209Hy.a().c));
        return z;
    }

    @Override // o.IB
    public final AbstractC0700aI a(long j) {
        int i;
        C0209Hy c0209Hy = this.B;
        C0027Ay c0027Ay = c0209Hy.a;
        if (c0027Ay.C == 3) {
            c0027Ay.c();
        }
        if (AbstractC0868ct.F(c0027Ay)) {
            C0131Ey c0131Ey = c0209Hy.r;
            AbstractC0048Bt.k(c0131Ey);
            c0131Ey.j = 3;
            c0131Ey.a(j);
        }
        C0027Ay l = c0027Ay.l();
        if (l != null) {
            C0209Hy c0209Hy2 = l.v;
            if (this.l != 3 && !c0027Ay.t) {
                AbstractC0868ct.W("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            int v = AbstractC1888sN.v(c0209Hy2.b);
            if (v != 0) {
                i = 2;
                if (v != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC2188wx.n(c0209Hy2.b)));
                }
            } else {
                i = 1;
            }
            this.l = i;
        } else {
            this.l = 3;
        }
        M(j);
        return this;
    }

    @Override // o.InterfaceC1405l2
    public final void b(C1400l c1400l) {
        YD o2 = this.B.a.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                c1400l.invoke(((C0027Ay) objArr[i2]).v.q);
                i2++;
            } while (i2 < i);
        }
    }

    @Override // o.IB
    public final Object g() {
        return null;
    }

    @Override // o.InterfaceC1405l2
    public final C0384Os n() {
        return (C0384Os) this.B.a.u.c;
    }

    @Override // o.InterfaceC1405l2
    public final InterfaceC1405l2 q() {
        C0209Hy c0209Hy;
        C0027Ay l = this.B.a.l();
        if (l == null || (c0209Hy = l.v) == null) {
            return null;
        }
        return c0209Hy.q;
    }

    @Override // o.InterfaceC1405l2
    public final void r() {
        YD o2;
        int i;
        this.t = true;
        C0053By c0053By = this.q;
        c0053By.h();
        C0209Hy c0209Hy = this.B;
        C0027Ay c0027Ay = c0209Hy.a;
        if (c0209Hy.d && (i = (o2 = c0027Ay.o()).j) > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay2 = (C0027Ay) objArr[i2];
                C0209Hy c0209Hy2 = c0027Ay2.v;
                if (c0209Hy2.c && c0209Hy2.q.l == 1 && C0027Ay.A(c0027Ay2)) {
                    C0027Ay.E(c0027Ay, false, 7);
                }
                i2++;
            } while (i2 < i);
        }
        if (c0209Hy.e || (!n().h && c0209Hy.d)) {
            c0209Hy.d = false;
            int i3 = c0209Hy.b;
            c0209Hy.b = 3;
            c0209Hy.e(false);
            C0765bH snapshotObserver = ((S2) PX.J0(c0027Ay)).getSnapshotObserver();
            snapshotObserver.a(c0027Ay, snapshotObserver.e, this.u);
            c0209Hy.b = i3;
            if (n().h && c0209Hy.k) {
                requestLayout();
            }
            c0209Hy.e = false;
        }
        if (c0053By.b && c0053By.e()) {
            c0053By.g();
        }
        this.t = false;
    }

    @Override // o.InterfaceC1405l2
    public final void requestLayout() {
        this.B.a.D(false);
    }

    @Override // o.InterfaceC1405l2
    public final boolean s() {
        return this.f42o;
    }

    @Override // o.InterfaceC1405l2
    public final C0053By z() {
        return this.q;
    }
}
