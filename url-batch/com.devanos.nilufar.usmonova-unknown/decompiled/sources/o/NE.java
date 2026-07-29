package o;

/* loaded from: classes.dex */
public abstract class NE {
    public static final GD a;

    static {
        GD gd = AbstractC2210xF.a;
        a = new GD();
    }

    public static final void a(TC tc) {
        if (tc.m) {
            b(tc, tc.c, 1);
        } else {
            AbstractC0868ct.W("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(TC tc, int i, int i2) {
        if (i2 == 0) {
            tc.getClass();
            if (tc instanceof C0405Pn) {
                return;
            }
        }
        if ((i & 2) != 0 && (tc instanceof InterfaceC2123vy)) {
            AbstractC0946e20.J((InterfaceC2123vy) tc).s();
            if (i2 == 2) {
                ME I = AbstractC0946e20.I(tc, 2);
                I.f66o = true;
                I.A.invoke();
                if (I.C != null) {
                    I.A0(null, false);
                    I.l.D(false);
                }
            }
        }
        if ((i & 128) != 0 && (tc instanceof X7) && i2 != 2) {
            AbstractC0946e20.J(tc).s();
        }
        if ((i & 256) != 0 && (tc instanceof X7) && i2 != 2) {
            C0027Ay J = AbstractC0946e20.J(tc);
            C0209Hy c0209Hy = J.v;
            if (!c0209Hy.d && !c0209Hy.c && !J.A) {
                S2 s2 = (S2) PX.J0(J);
                ((YD) s2.N.e.i).b(J);
                J.A = true;
                s2.C(null);
            }
        }
        if ((i & 4) != 0 && (tc instanceof InterfaceC1055fj)) {
            AbstractC1473m3.M((InterfaceC1055fj) tc);
        }
        if ((i & 8) != 0 && (tc instanceof InterfaceC2155wQ)) {
            AbstractC0946e20.J((InterfaceC2155wQ) tc).t();
        }
        if ((i & 64) != 0 && (tc instanceof X7)) {
            AbstractC0946e20.J((X7) tc).v.q.getClass();
        }
        if ((i & 1024) != 0 && (tc instanceof C0405Pn) && i2 != 2) {
            AbstractC1473m3.N((C0405Pn) tc);
        }
        if ((i & 2048) != 0 && (tc instanceof InterfaceC0302Ln)) {
            InterfaceC0302Ln interfaceC0302Ln = (InterfaceC0302Ln) tc;
            X9.b = null;
            interfaceC0302Ln.e(X9.a);
            if (X9.b != null) {
                if (i2 == 2) {
                    TC tc2 = ((TC) interfaceC0302Ln).b;
                    if (!tc2.m) {
                        throw new IllegalStateException("visitChildren called on an unattached node");
                    }
                    YD yd = new YD(new TC[16]);
                    TC tc3 = tc2.f;
                    if (tc3 == null) {
                        AbstractC0946e20.c(yd, tc2);
                    } else {
                        yd.b(tc3);
                    }
                    while (yd.l()) {
                        TC tc4 = (TC) yd.n(yd.j - 1);
                        if ((tc4.d & 1024) == 0) {
                            AbstractC0946e20.c(yd, tc4);
                        } else {
                            while (true) {
                                if (tc4 == null) {
                                    break;
                                }
                                if ((tc4.c & 1024) != 0) {
                                    while (tc4 != null) {
                                        if (tc4 instanceof C0405Pn) {
                                            AbstractC1473m3.N((C0405Pn) tc4);
                                        }
                                        tc4 = null;
                                    }
                                } else {
                                    tc4 = tc4.f;
                                }
                            }
                        }
                    }
                } else {
                    C0172Gn c0172Gn = ((androidx.compose.ui.focus.a) ((S2) AbstractC0946e20.K(interfaceC0302Ln)).getFocusOwner()).e;
                    c0172Gn.b(c0172Gn.e, interfaceC0302Ln);
                }
            }
        }
        if ((i & 4096) == 0 || !(tc instanceof X7)) {
            return;
        }
        X7 x7 = (X7) tc;
        C0172Gn c0172Gn2 = ((androidx.compose.ui.focus.a) ((S2) AbstractC0946e20.K(x7)).getFocusOwner()).e;
        c0172Gn2.b(c0172Gn2.d, x7);
    }

    public static final void c(TC tc) {
        if (tc.m) {
            b(tc, tc.c, 0);
        } else {
            AbstractC0868ct.W("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final boolean d(int i) {
        return (i & 128) != 0;
    }
}
