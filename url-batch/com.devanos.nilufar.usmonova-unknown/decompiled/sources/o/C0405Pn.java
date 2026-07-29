package o;

/* renamed from: o.Pn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405Pn extends TC implements InterfaceC2342zF, WC, InterfaceC0725ah {
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f85o;
    public EnumC0379On p;

    public static final boolean t(C0405Pn c0405Pn) {
        TC tc = c0405Pn.b;
        if (!tc.m) {
            AbstractC0868ct.W("visitSubtreeIf called on an unattached node");
            throw null;
        }
        YD yd = new YD(new TC[16]);
        TC tc2 = tc.f;
        if (tc2 == null) {
            AbstractC0946e20.c(yd, tc);
        } else {
            yd.b(tc2);
        }
        while (yd.l()) {
            TC tc3 = (TC) yd.n(yd.j - 1);
            if ((tc3.d & 1024) != 0) {
                for (TC tc4 = tc3; tc4 != null; tc4 = tc4.f) {
                    if ((tc4.c & 1024) != 0) {
                        for (TC tc5 = tc4; tc5 != null; tc5 = null) {
                            if (tc5 instanceof C0405Pn) {
                                C0405Pn c0405Pn2 = (C0405Pn) tc5;
                                if (c0405Pn2.p != null) {
                                    int ordinal = c0405Pn2.s().ordinal();
                                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                        return true;
                                    }
                                    if (ordinal == 3) {
                                        return false;
                                    }
                                    throw new C0057Cc();
                                }
                            }
                        }
                    }
                }
            }
            AbstractC0946e20.c(yd, tc3);
        }
        return false;
    }

    public static final boolean u(C0405Pn c0405Pn) {
        C1970td c1970td;
        TC tc = c0405Pn.b;
        if (!tc.m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        TC tc2 = tc.e;
        C0027Ay J = AbstractC0946e20.J(c0405Pn);
        while (J != null) {
            if ((((TC) J.u.f).d & 1024) != 0) {
                while (tc2 != null) {
                    if ((tc2.c & 1024) != 0) {
                        for (TC tc3 = tc2; tc3 != null; tc3 = null) {
                            if (tc3 instanceof C0405Pn) {
                                C0405Pn c0405Pn2 = (C0405Pn) tc3;
                                if (c0405Pn2.p != null) {
                                    int ordinal = c0405Pn2.s().ordinal();
                                    if (ordinal == 0) {
                                        return false;
                                    }
                                    if (ordinal == 1) {
                                        return true;
                                    }
                                    if (ordinal == 2 || ordinal == 3) {
                                        return false;
                                    }
                                    throw new C0057Cc();
                                }
                            }
                        }
                    }
                    tc2 = tc2.e;
                }
            }
            J = J.l();
            tc2 = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
        }
        return false;
    }

    @Override // o.InterfaceC2342zF
    public final void c() {
        EnumC0379On s = s();
        v();
        if (s != s()) {
            PX.I0(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 != 2) goto L19;
     */
    @Override // o.TC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        int ordinal = s().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C1711ph W = AbstractC1473m3.W(this);
                try {
                    if (W.h) {
                        C1711ph.a(W);
                    }
                    W.h = true;
                    w(EnumC0379On.j);
                    C1711ph.b(W);
                } catch (Throwable th) {
                    C1711ph.b(W);
                    throw th;
                }
            }
            this.p = null;
        }
        ((androidx.compose.ui.focus.a) ((S2) AbstractC0946e20.K(this)).getFocusOwner()).a(8, true, false);
        AbstractC1473m3.N(this);
        this.p = null;
    }

    public final C0250Jn q() {
        C1970td c1970td;
        C0250Jn c0250Jn = new C0250Jn();
        c0250Jn.a = true;
        C0353Nn c0353Nn = C0353Nn.b;
        c0250Jn.b = c0353Nn;
        c0250Jn.c = c0353Nn;
        c0250Jn.d = c0353Nn;
        c0250Jn.e = c0353Nn;
        c0250Jn.f = c0353Nn;
        c0250Jn.g = c0353Nn;
        c0250Jn.h = c0353Nn;
        c0250Jn.i = c0353Nn;
        c0250Jn.j = I2.G;
        c0250Jn.k = I2.H;
        TC tc = this.b;
        if (!tc.m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C0027Ay J = AbstractC0946e20.J(this);
        TC tc2 = tc;
        loop0: while (J != null) {
            if ((((TC) J.u.f).d & 3072) != 0) {
                while (tc2 != null) {
                    int i = tc2.c;
                    if ((i & 3072) != 0) {
                        if (tc2 != tc && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 2048) != 0) {
                            for (Object obj = tc2; obj != null; obj = null) {
                                if (obj instanceof InterfaceC0302Ln) {
                                    ((InterfaceC0302Ln) obj).e(c0250Jn);
                                }
                            }
                        }
                    }
                    tc2 = tc2.e;
                }
            }
            J = J.l();
            tc2 = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
        }
        return c0250Jn;
    }

    public final void r() {
        C1970td c1970td;
        TC tc = this.b;
        boolean z = tc.m;
        if (!z) {
            AbstractC0868ct.V("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        TC tc2 = tc.e;
        C0027Ay J = AbstractC0946e20.J(this);
        while (J != null) {
            if ((((TC) J.u.f).d & 32) != 0) {
                while (tc2 != null) {
                    if ((tc2.c & 32) != 0) {
                        for (Object obj = tc2; obj != null; obj = null) {
                            if (obj instanceof WC) {
                                ((WC) obj).a().getClass();
                            }
                        }
                    }
                    tc2 = tc2.e;
                }
            }
            J = J.l();
            tc2 = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
        }
    }

    public final EnumC0379On s() {
        EnumC0379On enumC0379On;
        C0027Ay c0027Ay;
        ZG zg;
        InterfaceC0198Hn focusOwner;
        ME me = this.b.h;
        C1711ph c1711ph = (me == null || (c0027Ay = me.l) == null || (zg = c0027Ay.j) == null || (focusOwner = ((S2) zg).getFocusOwner()) == null) ? null : ((androidx.compose.ui.focus.a) focusOwner).f;
        if (c1711ph != null && (enumC0379On = (EnumC0379On) ((MD) c1711ph.i).e(this)) != null) {
            return enumC0379On;
        }
        EnumC0379On enumC0379On2 = this.p;
        return enumC0379On2 == null ? EnumC0379On.j : enumC0379On2;
    }

    public final void v() {
        EnumC0379On enumC0379On = this.p;
        if (enumC0379On == null) {
            if (enumC0379On != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            C1711ph W = AbstractC1473m3.W(this);
            try {
                if (W.h) {
                    C1711ph.a(W);
                }
                W.h = true;
                w((u(this) && t(this)) ? EnumC0379On.i : EnumC0379On.j);
                C1711ph.b(W);
            } catch (Throwable th) {
                C1711ph.b(W);
                throw th;
            }
        }
        int ordinal = s().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            C1360kM c1360kM = new C1360kM();
            AbstractC1305jX.B(this, new K2(c1360kM, 5, this));
            Object obj = c1360kM.h;
            if (obj == null) {
                AbstractC0048Bt.i0("focusProperties");
                throw null;
            }
            if (((InterfaceC0224In) obj).b()) {
                return;
            }
            ((androidx.compose.ui.focus.a) ((S2) AbstractC0946e20.K(this)).getFocusOwner()).a(8, true, true);
        }
    }

    public final void w(EnumC0379On enumC0379On) {
        ((MD) AbstractC1473m3.W(this).i).i(this, enumC0379On);
    }
}
