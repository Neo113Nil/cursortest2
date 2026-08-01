package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rp0 {
    public final t50 a;
    public final boolean b;
    public final p10 c;
    public final np0 d;
    public boolean e;
    public rp0 f;
    public final int g;

    public rp0(t50 t50Var, boolean z, p10 p10Var, np0 np0Var) {
        this.a = t50Var;
        this.b = z;
        this.c = p10Var;
        this.d = np0Var;
        this.g = p10Var.e;
    }

    public static /* synthetic */ List j(int i, rp0 rp0Var) {
        return rp0Var.i((i & 1) != 0 ? !rp0Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [t50] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [t50] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final zi0 a(ea0 ea0Var) {
        ol olVar;
        rp0 l = l();
        if (l == null) {
            return zi0.e;
        }
        t50 t50Var = (t50) l.c.F.j;
        if ((t50Var.g & 8) != 0) {
            loop0: while (t50Var != null) {
                if ((t50Var.f & 8) != 0) {
                    olVar = t50Var;
                    ?? r5 = 0;
                    while (olVar != 0) {
                        if (olVar instanceof pp0) {
                            if (olVar.e()) {
                                break loop0;
                            }
                        } else if ((olVar.f & 8) != 0 && (olVar instanceof ol)) {
                            t50 t50Var2 = olVar.s;
                            int i = 0;
                            olVar = olVar;
                            r5 = r5;
                            while (t50Var2 != null) {
                                if ((t50Var2.f & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        olVar = t50Var2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new l70(new t50[16]);
                                        }
                                        if (olVar != 0) {
                                            r5.b(olVar);
                                            olVar = 0;
                                        }
                                        r5.b(t50Var2);
                                    }
                                }
                                t50Var2 = t50Var2.i;
                                olVar = olVar;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        olVar = nz.j(r5);
                    }
                }
                if ((t50Var.g & 8) == 0) {
                    break;
                }
                t50Var = t50Var.i;
            }
        }
        olVar = 0;
        pp0 pp0Var = (pp0) olVar;
        ea0 Y = pp0Var != null ? nz.Y(pp0Var, 8) : null;
        return Y == null ? l.a(ea0Var) : Y.z(ea0Var, true);
    }

    public final rp0 b(tl0 tl0Var, mu muVar) {
        np0 np0Var = new np0();
        np0Var.f = false;
        np0Var.g = false;
        muVar.c(np0Var);
        rp0 rp0Var = new rp0(new qp0(muVar), false, new p10(this.g + (tl0Var != null ? 1000000000 : 2000000000), true), np0Var);
        rp0Var.e = true;
        rp0Var.f = this;
        return rp0Var;
    }

    public final void c(p10 p10Var, ArrayList arrayList) {
        l70 r = p10Var.r();
        Object[] objArr = r.d;
        int i = r.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var2 = (p10) objArr[i2];
            if (p10Var2.B() && !p10Var2.N) {
                if (p10Var2.F.h(8)) {
                    arrayList.add(yc0.a(p10Var2, this.b));
                } else {
                    c(p10Var2, arrayList);
                }
            }
        }
    }

    public final ea0 d() {
        if (!this.e) {
            pp0 f = f();
            return f != null ? nz.Y(f, 8) : (iy) this.c.F.g;
        }
        rp0 l = l();
        if (l != null) {
            return l.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            rp0 rp0Var = (rp0) arrayList.get(size2);
            if (rp0Var.n()) {
                arrayList2.add(rp0Var);
            } else if (!rp0Var.d.g) {
                rp0Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [t50] */
    /* JADX WARN: Type inference failed for: r5v14, types: [pp0] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [t50] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [l70] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [l70] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    public final pp0 f() {
        t50 t50Var;
        boolean z = this.d.f;
        Object obj = null;
        p10 p10Var = this.c;
        if (!z) {
            t50 t50Var2 = (t50) p10Var.F.j;
            if ((t50Var2.g & 8) != 0) {
                loop3: while (t50Var2 != null) {
                    if ((t50Var2.f & 8) != 0) {
                        t50Var = t50Var2;
                        l70 l70Var = null;
                        while (t50Var != null) {
                            if (t50Var instanceof pp0) {
                                if (((pp0) t50Var).e()) {
                                    obj = t50Var;
                                }
                            } else if ((t50Var.f & 8) != 0 && (t50Var instanceof ol)) {
                                int i = 0;
                                for (t50 t50Var3 = ((ol) t50Var).s; t50Var3 != null; t50Var3 = t50Var3.i) {
                                    if ((t50Var3.f & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            t50Var = t50Var3;
                                        } else {
                                            if (l70Var == null) {
                                                l70Var = new l70(new t50[16]);
                                            }
                                            if (t50Var != null) {
                                                l70Var.b(t50Var);
                                                t50Var = null;
                                            }
                                            l70Var.b(t50Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            t50Var = nz.j(l70Var);
                        }
                    }
                    if ((t50Var2.g & 8) == 0) {
                        break;
                    }
                    t50Var2 = t50Var2.i;
                }
            }
            return (pp0) obj;
        }
        t50 t50Var4 = (t50) p10Var.F.j;
        if ((t50Var4.g & 8) != 0) {
            t50Var = null;
            while (t50Var4 != null) {
                if ((t50Var4.f & 8) != 0) {
                    ol olVar = t50Var4;
                    ?? r6 = 0;
                    while (olVar != 0) {
                        if (olVar instanceof pp0) {
                            ?? r5 = (pp0) olVar;
                            if (r5.e()) {
                                if (r5.O()) {
                                    return r5;
                                }
                                if (t50Var == null) {
                                    t50Var = r5;
                                }
                            }
                        } else if ((olVar.f & 8) != 0 && (olVar instanceof ol)) {
                            t50 t50Var5 = olVar.s;
                            int i2 = 0;
                            olVar = olVar;
                            r6 = r6;
                            while (t50Var5 != null) {
                                if ((t50Var5.f & 8) != 0) {
                                    i2++;
                                    r6 = r6;
                                    if (i2 == 1) {
                                        olVar = t50Var5;
                                    } else {
                                        if (r6 == 0) {
                                            r6 = new l70(new t50[16]);
                                        }
                                        if (olVar != 0) {
                                            r6.b(olVar);
                                            olVar = 0;
                                        }
                                        r6.b(t50Var5);
                                    }
                                }
                                t50Var5 = t50Var5.i;
                                olVar = olVar;
                                r6 = r6;
                            }
                            if (i2 == 1) {
                            }
                        }
                        olVar = nz.j(r6);
                    }
                }
                if ((t50Var4.g & 8) == 0) {
                    break;
                }
                t50Var4 = t50Var4.i;
            }
            obj = t50Var;
        }
        return (pp0) obj;
    }

    public final zi0 g() {
        ea0 d = d();
        if (d != null) {
            if (!d.v0().q) {
                d = null;
            }
            if (d != null) {
                return mz.C(d).z(d, true);
            }
        }
        return zi0.e;
    }

    public final zi0 h() {
        ea0 d = d();
        if (d != null) {
            if (!d.v0().q) {
                d = null;
            }
            if (d != null) {
                return mz.t(d);
            }
        }
        return zi0.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.g) {
            return wp.d;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final np0 k() {
        boolean n = n();
        np0 np0Var = this.d;
        if (!n) {
            return np0Var;
        }
        np0 a = np0Var.a();
        p(new ArrayList(), a);
        return a;
    }

    public final rp0 l() {
        p10 p10Var;
        rp0 rp0Var = this.f;
        if (rp0Var != null) {
            return rp0Var;
        }
        p10 p10Var2 = this.c;
        boolean z = this.b;
        if (z) {
            p10Var = p10Var2.n();
            while (p10Var != null) {
                np0 p = p10Var.p();
                if (p != null && p.f) {
                    break;
                }
                p10Var = p10Var.n();
            }
        }
        p10Var = null;
        if (p10Var == null) {
            p10 n = p10Var2.n();
            while (true) {
                if (n == null) {
                    p10Var = null;
                    break;
                }
                if (n.F.h(8)) {
                    p10Var = n;
                    break;
                }
                n = n.n();
            }
        }
        if (p10Var == null) {
            return null;
        }
        return yc0.a(p10Var, z);
    }

    public final np0 m() {
        return this.d;
    }

    public final boolean n() {
        return this.b && this.d.f;
    }

    public final boolean o() {
        if (this.e || !j(4, this).isEmpty()) {
            return false;
        }
        p10 n = this.c.n();
        while (true) {
            if (n == null) {
                n = null;
                break;
            }
            np0 p = n.p();
            if (p != null && p.f) {
                break;
            }
            n = n.n();
        }
        return n == null;
    }

    public final void p(ArrayList arrayList, np0 np0Var) {
        if (this.d.g) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            rp0 rp0Var = (rp0) arrayList.get(size2);
            if (!rp0Var.n()) {
                np0Var.c(rp0Var.d);
                rp0Var.p(arrayList, np0Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (this.e) {
            return wp.d;
        }
        c(this.c, arrayList);
        if (z) {
            np0 np0Var = this.d;
            a70 a70Var = np0Var.d;
            Object g = a70Var.g(vp0.w);
            if (g == null) {
                g = null;
            }
            tl0 tl0Var = (tl0) g;
            if (tl0Var != null && np0Var.f && !arrayList.isEmpty()) {
                arrayList.add(b(tl0Var, new f2(22, tl0Var)));
            }
            yp0 yp0Var = vp0.a;
            if (a70Var.c(yp0Var) && !arrayList.isEmpty() && np0Var.f) {
                Object g2 = a70Var.g(yp0Var);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                String str = list != null ? (String) zd.d0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new xw(str, 1)));
                }
            }
        }
        return arrayList;
    }
}
