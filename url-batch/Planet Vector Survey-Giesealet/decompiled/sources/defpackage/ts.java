package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ts extends t50 implements di, pa0, w50 {
    public final mu r;
    public boolean s;
    public boolean t;
    public final int u;

    public ts(ss ssVar, int i) {
        int i2 = (i & 1) != 0 ? 1 : 2;
        this.r = (i & 4) != 0 ? null : ssVar;
        this.u = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [t50] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [t50] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.x50
    public final Object A(ji0 ji0Var) {
        ca0 ca0Var;
        if (!this.d.q) {
            cy.a("ModifierLocal accessed from an unattached node");
        }
        if (!this.d.q) {
            cy.b("visitAncestors called on an unattached node");
        }
        t50 t50Var = this.d.h;
        p10 a0 = nz.a0(this);
        while (a0 != null) {
            if ((((t50) a0.F.j).g & 32) != 0) {
                while (t50Var != null) {
                    if ((t50Var.f & 32) != 0) {
                        ol olVar = t50Var;
                        ?? r3 = 0;
                        while (olVar != 0) {
                            if (olVar instanceof w50) {
                                w50 w50Var = (w50) olVar;
                                if (w50Var.f().o(ji0Var)) {
                                    return w50Var.f().s(ji0Var);
                                }
                            } else if ((olVar.f & 32) != 0 && (olVar instanceof ol)) {
                                t50 t50Var2 = olVar.s;
                                int i = 0;
                                olVar = olVar;
                                r3 = r3;
                                while (t50Var2 != null) {
                                    if ((t50Var2.f & 32) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            olVar = t50Var2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new l70(new t50[16]);
                                            }
                                            if (olVar != 0) {
                                                r3.b(olVar);
                                                olVar = 0;
                                            }
                                            r3.b(t50Var2);
                                        }
                                    }
                                    t50Var2 = t50Var2.i;
                                    olVar = olVar;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            olVar = nz.j(r3);
                        }
                    }
                    t50Var = t50Var.h;
                }
            }
            a0 = a0.n();
            t50Var = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
        }
        return ji0Var.a.a();
    }

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    @Override // defpackage.t50
    public final void b0() {
        int ordinal = l0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                g8.c();
                return;
            }
        }
        ks ksVar = (ks) ((f3) nz.b0(this)).getFocusOwner();
        ksVar.b(8, true, false);
        ksVar.d.a();
    }

    @Override // defpackage.t50
    public final void d0() {
        if (l0().a()) {
            ((ks) ((f3) nz.b0(this)).getFocusOwner()).b(8, true, true);
        }
    }

    @Override // defpackage.w50
    public final /* synthetic */ d31 f() {
        return yp.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [t50] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [t50] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [l70] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [l70] */
    public final void j0(rs rsVar, rs rsVar2) {
        ca0 ca0Var;
        js focusOwner = ((f3) nz.b0(this)).getFocusOwner();
        ts tsVar = ((ks) focusOwner).h;
        rsVar.equals(rsVar2);
        t50 t50Var = this.d;
        if (!t50Var.q) {
            cy.b("visitAncestors called on an unattached node");
        }
        t50 t50Var2 = this.d;
        p10 a0 = nz.a0(this);
        loop0: while (a0 != null) {
            if ((((t50) a0.F.j).g & 5120) != 0) {
                while (t50Var2 != null) {
                    int i = t50Var2.f;
                    if ((i & 5120) != 0) {
                        if (t50Var2 != t50Var && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 4096) != 0) {
                            ol olVar = t50Var2;
                            ?? r6 = 0;
                            while (olVar != 0) {
                                if (olVar instanceof cs) {
                                    cs csVar = (cs) olVar;
                                    if (tsVar == ((ks) focusOwner).h) {
                                        csVar.C(rsVar2);
                                    }
                                } else if ((olVar.f & 4096) != 0 && (olVar instanceof ol)) {
                                    t50 t50Var3 = olVar.s;
                                    int i2 = 0;
                                    olVar = olVar;
                                    r6 = r6;
                                    while (t50Var3 != null) {
                                        if ((t50Var3.f & 4096) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                olVar = t50Var3;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new l70(new t50[16]);
                                                }
                                                if (olVar != 0) {
                                                    r6.b(olVar);
                                                    olVar = 0;
                                                }
                                                r6.b(t50Var3);
                                            }
                                        }
                                        t50Var3 = t50Var3.i;
                                        olVar = olVar;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                olVar = nz.j(r6);
                            }
                        }
                    }
                    t50Var2 = t50Var2.h;
                }
            }
            a0 = a0.n();
            t50Var2 = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
        }
        mu muVar = this.r;
        if (muVar != null) {
            muVar.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [t50] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [t50] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [l70] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [l70] */
    public final ms k0() {
        boolean z;
        ca0 ca0Var;
        ms msVar = new ms();
        msVar.a = true;
        os osVar = os.b;
        msVar.b = osVar;
        msVar.c = osVar;
        msVar.d = osVar;
        msVar.e = osVar;
        msVar.f = osVar;
        msVar.g = osVar;
        msVar.h = osVar;
        msVar.i = osVar;
        msVar.j = o1.y;
        msVar.k = o1.z;
        int i = this.u;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((ly) ((ny) ((my) mz.A(this, hi.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                g8.s("Unknown Focusability");
                return null;
            }
            z = false;
        }
        msVar.a = z;
        t50 t50Var = this.d;
        if (!t50Var.q) {
            cy.b("visitAncestors called on an unattached node");
        }
        t50 t50Var2 = this.d;
        p10 a0 = nz.a0(this);
        loop0: while (a0 != null) {
            if ((((t50) a0.F.j).g & 3072) != 0) {
                while (t50Var2 != null) {
                    int i2 = t50Var2.f;
                    if ((i2 & 3072) != 0) {
                        if (t50Var2 != t50Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? r7 = 0;
                            ol olVar = t50Var2;
                            while (olVar != 0) {
                                if (olVar instanceof ns) {
                                    ((ns) olVar).z(msVar);
                                } else if ((olVar.f & 2048) != 0 && (olVar instanceof ol)) {
                                    t50 t50Var3 = olVar.s;
                                    int i3 = 0;
                                    olVar = olVar;
                                    r7 = r7;
                                    while (t50Var3 != null) {
                                        if ((t50Var3.f & 2048) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                olVar = t50Var3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new l70(new t50[16]);
                                                }
                                                if (olVar != 0) {
                                                    r7.b(olVar);
                                                    olVar = 0;
                                                }
                                                r7.b(t50Var3);
                                            }
                                        }
                                        t50Var3 = t50Var3.i;
                                        olVar = olVar;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                olVar = nz.j(r7);
                            }
                        }
                    }
                    t50Var2 = t50Var2.h;
                }
            }
            a0 = a0.n();
            t50Var2 = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
        }
        return msVar;
    }

    public final rs l0() {
        ca0 ca0Var;
        boolean z = this.q;
        rs rsVar = rs.g;
        if (!z) {
            return rsVar;
        }
        ts tsVar = ((ks) ((f3) nz.b0(this)).getFocusOwner()).h;
        if (tsVar == null) {
            return rsVar;
        }
        if (this == tsVar) {
            return rs.d;
        }
        if (tsVar.q) {
            if (!tsVar.d.q) {
                cy.b("visitAncestors called on an unattached node");
            }
            t50 t50Var = tsVar.d.h;
            p10 a0 = nz.a0(tsVar);
            while (a0 != null) {
                if ((((t50) a0.F.j).g & 1024) != 0) {
                    while (t50Var != null) {
                        if ((t50Var.f & 1024) != 0) {
                            t50 t50Var2 = t50Var;
                            l70 l70Var = null;
                            while (t50Var2 != null) {
                                if (t50Var2 instanceof ts) {
                                    if (this == ((ts) t50Var2)) {
                                        return rs.e;
                                    }
                                } else if ((t50Var2.f & 1024) != 0 && (t50Var2 instanceof ol)) {
                                    int i = 0;
                                    for (t50 t50Var3 = ((ol) t50Var2).s; t50Var3 != null; t50Var3 = t50Var3.i) {
                                        if ((t50Var3.f & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                t50Var2 = t50Var3;
                                            } else {
                                                if (l70Var == null) {
                                                    l70Var = new l70(new t50[16]);
                                                }
                                                if (t50Var2 != null) {
                                                    l70Var.b(t50Var2);
                                                    t50Var2 = null;
                                                }
                                                l70Var.b(t50Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                t50Var2 = nz.j(l70Var);
                            }
                        }
                        t50Var = t50Var.h;
                    }
                }
                a0 = a0.n();
                t50Var = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
            }
        }
        return rsVar;
    }

    public final void m0() {
        int ordinal = l0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                g8.c();
                return;
            }
        }
        gj0 gj0Var = new gj0();
        nk.H(this, new a3(4, gj0Var, this));
        Object obj = gj0Var.d;
        if (obj == null) {
            nz.f0("focusProperties");
            throw null;
        }
        if (((ls) obj).a()) {
            return;
        }
        ((ks) ((f3) nz.b0(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean n0() {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z = false;
            if (!k0().a) {
                return false;
            }
            int ordinal = mz.O(this).ordinal();
            if (ordinal == 0) {
                z = mz.P(this);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    z = true;
                } else if (ordinal != 3) {
                    throw new kf();
                }
            }
            return z;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.pa0
    public final void u() {
        m0();
    }
}
