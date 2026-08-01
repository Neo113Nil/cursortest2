package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.HashSet;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class g9 extends t50 implements i10, no, pp0, zg0, w50, x50, de0, z00, fv, cs, ns, ps, ed0, hb {
    public s50 r;
    public e9 s;
    public HashSet t;

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
        this.t.add(ji0Var);
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

    @Override // defpackage.cs
    public final void C(rs rsVar) {
        s50 s50Var = this.r;
        cy.b("onFocusEvent called on wrong node");
        s50Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.zg0
    public final boolean E() {
        this.r.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.zg0
    public final void H() {
        L();
        throw null;
    }

    @Override // defpackage.zg0
    public final void L() {
        this.r.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean M() {
        return false;
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // defpackage.de0
    public final Object Q(Object obj) {
        s50 s50Var = this.r;
        s50Var.getClass();
        return (m6) s50Var;
    }

    @Override // defpackage.no
    public final void R() {
        mz.H(this);
    }

    @Override // defpackage.zg0
    public final boolean S() {
        this.r.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.t50
    public final void Z() {
        j0(true);
    }

    @Override // defpackage.hb
    public final sl a() {
        return nz.a0(this).y;
    }

    @Override // defpackage.no
    public final void b(r10 r10Var) {
        s50 s50Var = this.r;
        s50Var.getClass();
        ((mo) s50Var).b(r10Var);
    }

    @Override // defpackage.t50
    public final void b0() {
        k0();
    }

    @Override // defpackage.hb
    public final long c() {
        return px0.W(nz.Y(this, 128).f);
    }

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        s50 s50Var = this.r;
        s50Var.getClass();
        return ((g10) s50Var).d(f40Var, b50Var, j);
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.w50
    public final d31 f() {
        e9 e9Var = this.s;
        return e9Var != null ? e9Var : yp.h;
    }

    @Override // defpackage.hb
    public final c10 getLayoutDirection() {
        return nz.a0(this).z;
    }

    public final void j0(boolean z) {
        if (!this.q) {
            cy.b("initializeModifier called on unattached node");
        }
        s50 s50Var = this.r;
        if ((this.f & 32) != 0) {
            boolean z2 = s50Var instanceof sy;
            if (z2) {
                f9 f9Var = new f9(this, 0);
                x60 x60Var = ((f3) nz.b0(this)).w0;
                if (x60Var.f(f9Var) < 0) {
                    x60Var.a(f9Var);
                }
            }
            if (z2) {
                sy syVar = (sy) s50Var;
                e9 e9Var = this.s;
                if (e9Var != null) {
                    ji0 ji0Var = j21.a;
                    if (e9Var.o(ji0Var)) {
                        e9Var.h = syVar;
                        v50 modifierLocalManager = ((f3) nz.b0(this)).getModifierLocalManager();
                        modifierLocalManager.b.b(this);
                        modifierLocalManager.c.b(ji0Var);
                        modifierLocalManager.a();
                    }
                }
                e9 e9Var2 = new e9();
                e9Var2.h = syVar;
                this.s = e9Var2;
                su0 su0Var = (su0) nz.a0(this).F.i;
                su0Var.getClass();
                if (su0Var.r) {
                    v50 modifierLocalManager2 = ((f3) nz.b0(this)).getModifierLocalManager();
                    ji0 ji0Var2 = j21.a;
                    modifierLocalManager2.b.b(this);
                    modifierLocalManager2.c.b(ji0Var2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f & 4) != 0 && !z) {
            nz.Y(this, 2).C0();
        }
        if ((this.f & 2) != 0) {
            su0 su0Var2 = (su0) nz.a0(this).F.i;
            su0Var2.getClass();
            if (su0Var2.r) {
                ea0 ea0Var = this.k;
                ea0Var.getClass();
                ((k10) ea0Var).V0(this);
                cd0 cd0Var = ea0Var.L;
                if (cd0Var != null) {
                    ((pv) cd0Var).c();
                }
            }
            if (!z) {
                nz.Y(this, 2).C0();
                nz.a0(this).x();
            }
        }
        if ((this.f & 8) != 0) {
            ((f3) nz.b0(this)).A();
        }
    }

    public final void k0() {
        if (!this.q) {
            cy.b("unInitializeModifier called on unattached node");
        }
        s50 s50Var = this.r;
        if ((this.f & 32) != 0) {
            boolean z = s50Var instanceof sy;
            if (z) {
                v50 modifierLocalManager = ((f3) nz.b0(this)).getModifierLocalManager();
                ji0 ji0Var = j21.a;
                modifierLocalManager.d.b(nz.a0(this));
                modifierLocalManager.e.b(ji0Var);
                modifierLocalManager.a();
            }
            if (z) {
                sy syVar = (sy) s50Var;
                b11 b11Var = (b11) j21.a.a.a();
                b11 b11Var2 = syVar.a;
                syVar.b.setValue(new uq(b11Var2, b11Var));
                syVar.c.setValue(new jy0(b11Var, b11Var2));
            }
        }
        if ((this.f & 8) != 0) {
            ((f3) nz.b0(this)).A();
        }
    }

    @Override // defpackage.zg0
    public final long l() {
        return nz.m;
    }

    public final void l0() {
        if (this.q) {
            this.t.clear();
            ((f3) nz.b0(this)).getSnapshotObserver().a(this, o1.l, new f9(this, 1));
        }
    }

    @Override // defpackage.fv
    public final void n(ea0 ea0Var) {
        this.r.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ed0
    public final boolean q() {
        return this.q;
    }

    @Override // defpackage.zg0
    public final void s(qg0 qg0Var, sg0 sg0Var, long j) {
        this.r.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.r.toString();
    }

    @Override // defpackage.pp0
    public final void v(np0 np0Var) {
        s50 s50Var = this.r;
        s50Var.getClass();
        np0 np0Var2 = new np0();
        int i = 0;
        np0Var2.f = false;
        ((AppendedSemanticsElement) s50Var).a.c(np0Var2);
        np0Var.getClass();
        a70 a70Var = np0Var.d;
        if (np0Var2.f) {
            np0Var.f = true;
        }
        if (np0Var2.g) {
            np0Var.g = true;
        }
        a70 a70Var2 = np0Var2.d;
        Object[] objArr = a70Var2.b;
        Object[] objArr2 = a70Var2.c;
        long[] jArr = a70Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = i; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        yp0 yp0Var = (yp0) obj;
                        if (!a70Var.b(yp0Var)) {
                            a70Var.m(yp0Var, obj2);
                        } else if (obj2 instanceof h0) {
                            Object g = a70Var.g(yp0Var);
                            g.getClass();
                            h0 h0Var = (h0) g;
                            String str = h0Var.a;
                            if (str == null) {
                                str = ((h0) obj2).a;
                            }
                            yu yuVar = h0Var.b;
                            if (yuVar == null) {
                                yuVar = ((h0) obj2).b;
                            }
                            a70Var.m(yp0Var, new h0(str, yuVar));
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            }
            i2++;
            i = 0;
        }
    }

    @Override // defpackage.ns
    public final void z(ls lsVar) {
        s50 s50Var = this.r;
        cy.b("applyFocusProperties called on wrong node");
        s50Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.t50
    public final void a0() {
    }

    @Override // defpackage.z00
    public final void i(b10 b10Var) {
    }

    @Override // defpackage.z00
    public final void m(long j) {
    }
}
