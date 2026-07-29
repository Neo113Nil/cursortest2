package o;

/* renamed from: o.Ey, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131Ey extends AbstractC0700aI implements IB, InterfaceC1405l2, InterfaceC1351kD {
    public boolean g;
    public boolean k;
    public boolean l;
    public C0603Xd m;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC2114vp f39o;
    public boolean p;
    public boolean t;
    public boolean u;
    public final /* synthetic */ C0209Hy v;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = 3;
    public long n = 0;
    public final C0053By q = new C0053By(this, 1);
    public final YD r = new YD(new C0131Ey[16]);
    public boolean s = true;

    public C0131Ey(C0209Hy c0209Hy) {
        this.v = c0209Hy;
        c0209Hy.q.getClass();
    }

    @Override // o.InterfaceC1351kD
    public final void A() {
        C0209Hy c0209Hy = this.v;
        if (Boolean.FALSE.equals(c0209Hy.a().f0() != null ? Boolean.FALSE : null)) {
            return;
        }
        c0209Hy.a().f0();
    }

    @Override // o.InterfaceC1405l2
    public final void B() {
        C0027Ay.C(this.v.a, false, 7);
    }

    @Override // o.AbstractC0700aI
    public final void E(long j, float f, InterfaceC2114vp interfaceC2114vp) {
        L(j, interfaceC2114vp);
    }

    public final void H() {
        boolean z = this.p;
        this.p = true;
        C0209Hy c0209Hy = this.v;
        if (!z && c0209Hy.f) {
            C0027Ay.C(c0209Hy.a, true, 6);
        }
        YD o2 = c0209Hy.a.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay = (C0027Ay) objArr[i2];
                C0131Ey c0131Ey = c0027Ay.v.r;
                if (c0131Ey == null) {
                    throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                }
                if (c0131Ey.i != Integer.MAX_VALUE) {
                    c0131Ey.H();
                    C0027Ay.F(c0027Ay);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void I() {
        if (this.p) {
            int i = 0;
            this.p = false;
            YD o2 = this.v.a.o();
            int i2 = o2.j;
            if (i2 > 0) {
                Object[] objArr = o2.h;
                do {
                    C0131Ey c0131Ey = ((C0027Ay) objArr[i]).v.r;
                    AbstractC0048Bt.k(c0131Ey);
                    c0131Ey.I();
                    i++;
                } while (i < i2);
            }
        }
    }

    public final void J() {
        YD o2;
        int i;
        C0209Hy c0209Hy = this.v;
        if (c0209Hy.p <= 0 || (i = (o2 = c0209Hy.a.o()).j) <= 0) {
            return;
        }
        Object[] objArr = o2.h;
        int i2 = 0;
        do {
            C0027Ay c0027Ay = (C0027Ay) objArr[i2];
            C0209Hy c0209Hy2 = c0027Ay.v;
            if ((c0209Hy2.n || c0209Hy2.f46o) && !c0209Hy2.g) {
                c0027Ay.B(false);
            }
            C0131Ey c0131Ey = c0209Hy2.r;
            if (c0131Ey != null) {
                c0131Ey.J();
            }
            i2++;
        } while (i2 < i);
    }

    public final void K() {
        C0209Hy c0209Hy;
        int i;
        this.u = true;
        C0027Ay l = this.v.a.l();
        if (!this.p) {
            H();
            if (this.g && l != null) {
                l.B(false);
            }
        }
        if (l == null) {
            this.i = 0;
        } else if (!this.g && ((i = (c0209Hy = l.v).b) == 3 || i == 4)) {
            if (this.i != Integer.MAX_VALUE) {
                AbstractC0868ct.W("Place was called on a node which was placed already");
                throw null;
            }
            int i2 = c0209Hy.i;
            this.i = i2;
            c0209Hy.i = i2 + 1;
        }
        r();
    }

    public final void L(long j, InterfaceC2114vp interfaceC2114vp) {
        C0209Hy c0209Hy = this.v;
        C0027Ay c0027Ay = c0209Hy.a;
        C0027Ay c0027Ay2 = c0209Hy.a;
        if (c0027Ay.B) {
            AbstractC0868ct.V("place is called on a deactivated node");
            throw null;
        }
        c0209Hy.b = 4;
        this.k = true;
        this.u = false;
        if (j != this.n) {
            if (c0209Hy.f46o || c0209Hy.n) {
                c0209Hy.g = true;
            }
            J();
        }
        ZG J0 = PX.J0(c0027Ay2);
        if (c0209Hy.g || !this.p) {
            c0209Hy.f(false);
            this.q.e = false;
            C0765bH snapshotObserver = ((S2) J0).getSnapshotObserver();
            C0105Dy c0105Dy = new C0105Dy(c0209Hy, J0, j);
            snapshotObserver.getClass();
            if (c0027Ay2.d != null) {
                snapshotObserver.a(c0027Ay2, snapshotObserver.g, c0105Dy);
            } else {
                snapshotObserver.a(c0027Ay2, snapshotObserver.f, c0105Dy);
            }
        } else {
            AbstractC1547nB f0 = c0209Hy.a().f0();
            AbstractC0048Bt.k(f0);
            f0.X(EB.L(j, f0.f));
            K();
        }
        this.n = j;
        this.f39o = interfaceC2114vp;
        c0209Hy.b = 5;
    }

    public final boolean M(long j) {
        C0603Xd c0603Xd;
        C0209Hy c0209Hy = this.v;
        C0027Ay c0027Ay = c0209Hy.a;
        C0027Ay c0027Ay2 = c0209Hy.a;
        if (c0027Ay.B) {
            AbstractC0868ct.V("measure is called on a deactivated node");
            throw null;
        }
        C0027Ay l = c0027Ay.l();
        c0027Ay2.t = c0027Ay2.t || (l != null && l.t);
        if (!c0027Ay2.v.f && (c0603Xd = this.m) != null && c0603Xd.a == j) {
            ZG zg = c0027Ay2.j;
            if (zg != null) {
                ((S2) zg).i(c0027Ay2, true);
            }
            c0027Ay2.H();
            return false;
        }
        this.m = new C0603Xd(j);
        G(j);
        this.q.d = false;
        YD o2 = c0027Ay2.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0131Ey c0131Ey = ((C0027Ay) objArr[i2]).v.r;
                AbstractC0048Bt.k(c0131Ey);
                c0131Ey.q.getClass();
                i2++;
            } while (i2 < i);
        }
        long a = this.l ? this.d : AbstractC0946e20.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.l = true;
        AbstractC1547nB f0 = c0209Hy.a().f0();
        if (f0 == null) {
            AbstractC0868ct.W("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        c0209Hy.b = 2;
        c0209Hy.f = false;
        C0765bH snapshotObserver = ((S2) PX.J0(c0027Ay2)).getSnapshotObserver();
        C0183Gy c0183Gy = new C0183Gy(c0209Hy, j);
        snapshotObserver.getClass();
        if (c0027Ay2.d != null) {
            snapshotObserver.a(c0027Ay2, snapshotObserver.b, c0183Gy);
        } else {
            snapshotObserver.a(c0027Ay2, snapshotObserver.c, c0183Gy);
        }
        c0209Hy.g = true;
        c0209Hy.h = true;
        if (AbstractC0868ct.F(c0027Ay2)) {
            c0209Hy.d = true;
            c0209Hy.e = true;
        } else {
            c0209Hy.c = true;
        }
        c0209Hy.b = 5;
        F(AbstractC0946e20.a(f0.b, f0.c));
        return (((int) (a >> 32)) == f0.b && ((int) (4294967295L & a)) == f0.c) ? false : true;
    }

    @Override // o.IB
    public final AbstractC0700aI a(long j) {
        C0209Hy c0209Hy = this.v;
        C0027Ay c0027Ay = c0209Hy.a;
        C0027Ay c0027Ay2 = c0209Hy.a;
        C0027Ay l = c0027Ay.l();
        int i = 2;
        if ((l != null ? l.v.b : 0) != 2) {
            C0027Ay l2 = c0027Ay2.l();
            if (l2 != null) {
                int i2 = l2.v.b;
            }
        }
        C0027Ay l3 = c0027Ay2.l();
        if (l3 != null) {
            C0209Hy c0209Hy2 = l3.v;
            if (this.j != 3 && !c0027Ay2.t) {
                AbstractC0868ct.W("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            int v = AbstractC1888sN.v(c0209Hy2.b);
            if (v == 0 || v == 1) {
                i = 1;
            } else if (v != 2 && v != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC2188wx.n(c0209Hy2.b)));
            }
            this.j = i;
        } else {
            this.j = 3;
        }
        if (c0027Ay2.C == 3) {
            c0027Ay2.c();
        }
        M(j);
        return this;
    }

    @Override // o.InterfaceC1405l2
    public final void b(C1400l c1400l) {
        YD o2 = this.v.a.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0131Ey c0131Ey = ((C0027Ay) objArr[i2]).v.r;
                AbstractC0048Bt.k(c0131Ey);
                c1400l.invoke(c0131Ey);
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
        return (C0384Os) this.v.a.u.c;
    }

    @Override // o.InterfaceC1405l2
    public final InterfaceC1405l2 q() {
        C0209Hy c0209Hy;
        C0027Ay l = this.v.a.l();
        if (l == null || (c0209Hy = l.v) == null) {
            return null;
        }
        return c0209Hy.r;
    }

    @Override // o.InterfaceC1405l2
    public final void r() {
        YD o2;
        int i;
        this.t = true;
        C0053By c0053By = this.q;
        c0053By.h();
        C0209Hy c0209Hy = this.v;
        boolean z = c0209Hy.g;
        C0027Ay c0027Ay = c0209Hy.a;
        if (z && (i = (o2 = c0027Ay.o()).j) > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay2 = (C0027Ay) objArr[i2];
                C0209Hy c0209Hy2 = c0027Ay2.v;
                if (c0209Hy2.f && c0027Ay2.k() == 1) {
                    C0131Ey c0131Ey = c0209Hy2.r;
                    AbstractC0048Bt.k(c0131Ey);
                    C0131Ey c0131Ey2 = c0209Hy2.r;
                    C0603Xd c0603Xd = c0131Ey2 != null ? c0131Ey2.m : null;
                    AbstractC0048Bt.k(c0603Xd);
                    if (c0131Ey.M(c0603Xd.a)) {
                        C0027Ay.C(c0027Ay, false, 7);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        C0358Ns c0358Ns = n().I;
        AbstractC0048Bt.k(c0358Ns);
        if (c0209Hy.h || (!c0358Ns.h && c0209Hy.g)) {
            c0209Hy.g = false;
            int i3 = c0209Hy.b;
            c0209Hy.b = 4;
            ZG J0 = PX.J0(c0027Ay);
            c0209Hy.g(false);
            C0765bH snapshotObserver = ((S2) J0).getSnapshotObserver();
            V7 v7 = new V7(this, c0358Ns, c0209Hy, 4);
            snapshotObserver.getClass();
            if (c0027Ay.d != null) {
                snapshotObserver.a(c0027Ay, snapshotObserver.h, v7);
            } else {
                snapshotObserver.a(c0027Ay, snapshotObserver.e, v7);
            }
            c0209Hy.b = i3;
            if (c0209Hy.n && c0358Ns.h) {
                requestLayout();
            }
            c0209Hy.h = false;
        }
        if (c0053By.b && c0053By.e()) {
            c0053By.g();
        }
        this.t = false;
    }

    @Override // o.InterfaceC1405l2
    public final void requestLayout() {
        this.v.a.B(false);
    }

    @Override // o.InterfaceC1405l2
    public final boolean s() {
        return this.p;
    }

    @Override // o.InterfaceC1405l2
    public final C0053By z() {
        return this.q;
    }
}
