package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class fa0 {
    public static final w60 a;

    static {
        w60 w60Var = ma0.a;
        a = new w60();
    }

    public static final void a(t50 t50Var, int i, int i2) {
        if (!(t50Var instanceof ol)) {
            b(t50Var, i & t50Var.f, i2);
            return;
        }
        ol olVar = (ol) t50Var;
        int i3 = olVar.r;
        b(t50Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (t50 t50Var2 = olVar.s; t50Var2 != null; t50Var2 = t50Var2.i) {
            a(t50Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(t50 t50Var, int i, int i2) {
        if (i2 != 0 || t50Var.W()) {
            if ((i & 2) != 0 && (t50Var instanceof i10)) {
                a50.z((i10) t50Var);
                if (i2 == 2) {
                    nz.Y(t50Var, 2).J0();
                }
            }
            if ((i & 128) != 0 && (t50Var instanceof z00) && i2 != 2) {
                nz.a0(t50Var).x();
            }
            if ((i & 256) != 0 && (t50Var instanceof fv)) {
                if (i2 == 1) {
                    p10 a0 = nz.a0(t50Var);
                    a0.R(a0.M + 1);
                } else if (i2 == 2) {
                    nz.a0(t50Var).R(r0.M - 1);
                }
                if (i2 != 2) {
                    p10 a02 = nz.a0(t50Var);
                    if (a02.M != 0 && !a02.j() && !a02.k() && !a02.L) {
                        f3 f3Var = (f3) mz.Q(a02);
                        j3 j3Var = f3Var.Q.e;
                        j3Var.getClass();
                        if (a02.M > 0) {
                            ((l70) j3Var.e).b(a02);
                            a02.L = true;
                        }
                        f3Var.E(null);
                    }
                }
            }
            if ((i & 4) != 0 && (t50Var instanceof no)) {
                mz.H((no) t50Var);
            }
            if ((i & 8) != 0 && (t50Var instanceof pp0)) {
                nz.a0(t50Var).s = true;
            }
            if ((i & 64) != 0 && (t50Var instanceof de0)) {
                s10 s10Var = nz.a0((de0) t50Var).G;
                s10Var.o.s = true;
                m40 m40Var = s10Var.p;
                if (m40Var != null) {
                    m40Var.x = true;
                }
            }
            if ((i & 2048) != 0 && (t50Var instanceof ns)) {
                ns nsVar = (ns) t50Var;
                cc.b = null;
                nsVar.z(cc.a);
                if (cc.b != null) {
                    t50 t50Var2 = (t50) nsVar;
                    if (!t50Var2.d.q) {
                        cy.b("visitChildren called on an unattached node");
                    }
                    l70 l70Var = new l70(new t50[16]);
                    t50 t50Var3 = t50Var2.d;
                    t50 t50Var4 = t50Var3.i;
                    if (t50Var4 == null) {
                        nz.h(l70Var, t50Var3);
                    } else {
                        l70Var.b(t50Var4);
                    }
                    while (true) {
                        int i3 = l70Var.f;
                        if (i3 == 0) {
                            break;
                        }
                        t50 t50Var5 = (t50) l70Var.j(i3 - 1);
                        if ((t50Var5.g & 1024) == 0) {
                            nz.h(l70Var, t50Var5);
                        } else {
                            while (true) {
                                if (t50Var5 == null) {
                                    break;
                                }
                                if ((t50Var5.f & 1024) != 0) {
                                    l70 l70Var2 = null;
                                    while (t50Var5 != null) {
                                        if (t50Var5 instanceof ts) {
                                            ts tsVar = (ts) t50Var5;
                                            is isVar = ((ks) ((f3) nz.b0(tsVar)).getFocusOwner()).d;
                                            if (isVar.c.a(tsVar)) {
                                                isVar.a();
                                            }
                                        } else if ((t50Var5.f & 1024) != 0 && (t50Var5 instanceof ol)) {
                                            int i4 = 0;
                                            for (t50 t50Var6 = ((ol) t50Var5).s; t50Var6 != null; t50Var6 = t50Var6.i) {
                                                if ((t50Var6.f & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        t50Var5 = t50Var6;
                                                    } else {
                                                        if (l70Var2 == null) {
                                                            l70Var2 = new l70(new t50[16]);
                                                        }
                                                        if (t50Var5 != null) {
                                                            l70Var2.b(t50Var5);
                                                            t50Var5 = null;
                                                        }
                                                        l70Var2.b(t50Var6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        t50Var5 = nz.j(l70Var2);
                                    }
                                } else {
                                    t50Var5 = t50Var5.i;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(t50Var instanceof cs)) {
                return;
            }
            cs csVar = (cs) t50Var;
            is isVar2 = ((ks) ((f3) nz.b0(csVar)).getFocusOwner()).d;
            if (isVar2.d.a(csVar)) {
                isVar2.a();
            }
        }
    }

    public static final void c(t50 t50Var) {
        if (!t50Var.q) {
            cy.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(t50Var, -1, 0);
    }

    public static final int d(s50 s50Var) {
        int i = s50Var instanceof g10 ? 3 : 1;
        if (s50Var instanceof mo) {
            i |= 4;
        }
        if (s50Var instanceof AppendedSemanticsElement) {
            i |= 8;
        }
        boolean z = s50Var instanceof sy;
        if (z || z) {
            i |= 32;
        }
        if (s50Var instanceof m6) {
            i |= 64;
        }
        return s50Var instanceof la ? 524288 | i : i;
    }

    public static final int e(t50 t50Var) {
        int i = t50Var.f;
        if (i != 0) {
            return i;
        }
        Class<?> cls = t50Var.getClass();
        w60 w60Var = a;
        int d = w60Var.d(cls);
        if (d >= 0) {
            return w60Var.c[d];
        }
        int i2 = t50Var instanceof i10 ? 3 : 1;
        if (t50Var instanceof no) {
            i2 |= 4;
        }
        if (t50Var instanceof pp0) {
            i2 |= 8;
        }
        if (t50Var instanceof zg0) {
            i2 |= 16;
        }
        if (t50Var instanceof w50) {
            i2 |= 32;
        }
        if (t50Var instanceof de0) {
            i2 |= 64;
        }
        if (t50Var instanceof z00) {
            i2 |= 128;
        }
        if (t50Var instanceof fv) {
            i2 |= 256;
        }
        if (t50Var instanceof ts) {
            i2 |= 1024;
        }
        if (t50Var instanceof ns) {
            i2 |= 2048;
        }
        if (t50Var instanceof cs) {
            i2 |= 4096;
        }
        if (t50Var instanceof s00) {
            i2 |= 8192;
        }
        if (t50Var instanceof xl0) {
            i2 |= 16384;
        }
        if (t50Var instanceof di) {
            i2 |= 32768;
        }
        if (t50Var instanceof ix0) {
            i2 |= 262144;
        }
        if (t50Var instanceof la) {
            i2 |= 524288;
        }
        w60Var.h(i2, cls);
        return i2;
    }

    public static final int f(t50 t50Var) {
        if (!(t50Var instanceof ol)) {
            return e(t50Var);
        }
        ol olVar = (ol) t50Var;
        int i = olVar.r;
        for (t50 t50Var2 = olVar.s; t50Var2 != null; t50Var2 = t50Var2.i) {
            i |= f(t50Var2);
        }
        return i;
    }

    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
