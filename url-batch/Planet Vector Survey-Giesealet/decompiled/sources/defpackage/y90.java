package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class y90 extends t50 implements ix0 {
    public final p01 r;
    public final k2 s;
    public y90 t;
    public final String u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public y90(p01 p01Var, k2 k2Var) {
        this.r = p01Var;
        this.s = k2Var;
    }

    @Override // defpackage.t50
    public final void Z() {
        k2 k2Var = this.s;
        k2Var.d = this;
        k2Var.e = null;
        this.t = null;
        k2Var.f = new b(14, this);
        k2Var.g = V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [t50] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [t50] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.t50
    public final void b0() {
        ca0 ca0Var;
        gj0 gj0Var = new gj0();
        b3 b3Var = new b3(gj0Var, 2);
        y90 y90Var = this;
        if (!y90Var.d.q) {
            cy.b("visitAncestors called on an unattached node");
        }
        t50 t50Var = y90Var.d.h;
        p10 a0 = nz.a0(this);
        loop0: while (a0 != null) {
            if ((((t50) a0.F.j).g & 262144) != 0) {
                while (t50Var != null) {
                    if ((t50Var.f & 262144) != 0) {
                        ol olVar = t50Var;
                        ?? r7 = 0;
                        while (olVar != 0) {
                            boolean z = true;
                            if (olVar instanceof ix0) {
                                ix0 ix0Var = (ix0) olVar;
                                if (nz.l(j(), ix0Var.j()) && getClass() == ix0Var.getClass()) {
                                    z = ((Boolean) b3Var.c(ix0Var)).booleanValue();
                                }
                                if (!z) {
                                    break loop0;
                                }
                            } else {
                                if (((olVar.f & 262144) != 0) && (olVar instanceof ol)) {
                                    t50 t50Var2 = olVar.s;
                                    int i = 0;
                                    olVar = olVar;
                                    r7 = r7;
                                    while (t50Var2 != null) {
                                        if ((t50Var2.f & 262144) != 0) {
                                            i++;
                                            r7 = r7;
                                            if (i == 1) {
                                                olVar = t50Var2;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new l70(new t50[16]);
                                                }
                                                if (olVar != 0) {
                                                    r7.b(olVar);
                                                    olVar = 0;
                                                }
                                                r7.b(t50Var2);
                                            }
                                        }
                                        t50Var2 = t50Var2.i;
                                        olVar = olVar;
                                        r7 = r7;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            olVar = nz.j(r7);
                        }
                    }
                    t50Var = t50Var.h;
                }
            }
            a0 = a0.n();
            t50Var = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
        }
        y90 y90Var2 = (y90) ((ix0) gj0Var.d);
        this.t = y90Var2;
        k2 k2Var = this.s;
        k2Var.e = y90Var2;
        if (((y90) k2Var.d) == this) {
            k2Var.d = null;
        }
    }

    @Override // defpackage.ix0
    public final Object j() {
        return this.u;
    }

    public final bk j0() {
        y90 y90Var = this.q ? (y90) yc0.d(this) : null;
        bk j0 = y90Var != null ? y90Var.j0() : null;
        if (j0 != null && x40.G(j0)) {
            return j0;
        }
        bk bkVar = (bk) this.s.g;
        if (bkVar != null) {
            return bkVar;
        }
        g8.s("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k0(long j, long j2, lj ljVar) {
        w90 w90Var;
        int i;
        y90 y90Var;
        long j3;
        long j4;
        long j5;
        boolean z;
        long j6;
        long j7;
        if (ljVar instanceof w90) {
            w90Var = (w90) ljVar;
            int i2 = w90Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w90Var.h = i2 - Integer.MIN_VALUE;
                w90 w90Var2 = w90Var;
                Object obj = w90Var2.f;
                i = w90Var2.h;
                y90Var = null;
                ck ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj);
                    w90Var2.d = j;
                    w90Var2.e = j2;
                    w90Var2.h = 1;
                    obj = this.r.q(j, j2, w90Var2);
                    if (obj != ckVar) {
                        j3 = j;
                        j4 = j2;
                    }
                    return ckVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j7 = w90Var2.d;
                    rg0.u(obj);
                    j6 = ((mz0) obj).a;
                    j5 = j7;
                    return new mz0(mz0.e(j5, j6));
                }
                j4 = w90Var2.e;
                j3 = w90Var2.d;
                rg0.u(obj);
                j5 = ((mz0) obj).a;
                z = this.q;
                if (z) {
                    y90Var = this.t;
                } else if (z && z) {
                    y90Var = (y90) yc0.d(this);
                }
                if (y90Var != null) {
                    j6 = 0;
                    return new mz0(mz0.e(j5, j6));
                }
                long e = mz0.e(j3, j5);
                long d = mz0.d(j4, j5);
                w90Var2.d = j5;
                w90Var2.h = 2;
                obj = y90Var.k0(e, d, w90Var2);
                if (obj != ckVar) {
                    j7 = j5;
                    j6 = ((mz0) obj).a;
                    j5 = j7;
                    return new mz0(mz0.e(j5, j6));
                }
                return ckVar;
            }
        }
        w90Var = new w90(this, ljVar);
        w90 w90Var22 = w90Var;
        Object obj2 = w90Var22.f;
        i = w90Var22.h;
        y90Var = null;
        ck ckVar2 = ck.d;
        if (i != 0) {
        }
        j5 = ((mz0) obj2).a;
        z = this.q;
        if (z) {
        }
        if (y90Var != null) {
        }
    }

    public final long l0(long j, long j2, int i) {
        zo0 zo0Var = (zo0) this.r.e;
        long g = zo0Var.a.c() ? 0L : zo0Var.g(zo0Var.c(zo0Var.a.e(zo0Var.c(zo0Var.f(j2)))));
        boolean z = this.q;
        y90 y90Var = null;
        if (z && z) {
            y90Var = (y90) yc0.d(this);
        }
        y90 y90Var2 = y90Var;
        return ra0.h(g, y90Var2 != null ? y90Var2.l0(ra0.h(j, g), ra0.g(j2, g), i) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r11 == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r11 == r7) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(long j, kj kjVar) {
        x90 x90Var;
        int i;
        long j2;
        long j3;
        if (kjVar instanceof x90) {
            x90Var = (x90) kjVar;
            int i2 = x90Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x90Var.g = i2 - Integer.MIN_VALUE;
                Object obj = x90Var.e;
                i = x90Var.g;
                y90 y90Var = null;
                ck ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj);
                    boolean z = this.q;
                    if (z && z) {
                        y90Var = (y90) yc0.d(this);
                    }
                    if (y90Var != null) {
                        x90Var.d = j;
                        x90Var.g = 1;
                        obj = y90Var.m0(j, x90Var);
                    } else {
                        j2 = j;
                        j3 = 0;
                        mz0.d(j2, j3);
                        x90Var.d = j3;
                        x90Var.g = 2;
                        obj = new mz0(0L);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = x90Var.d;
                        rg0.u(obj);
                        return new mz0(mz0.e(j3, ((mz0) obj).a));
                    }
                    j = x90Var.d;
                    rg0.u(obj);
                }
                j2 = j;
                j3 = ((mz0) obj).a;
                mz0.d(j2, j3);
                x90Var.d = j3;
                x90Var.g = 2;
                obj = new mz0(0L);
            }
        }
        x90Var = new x90(this, (lj) kjVar);
        Object obj2 = x90Var.e;
        i = x90Var.g;
        y90 y90Var2 = null;
        ck ckVar2 = ck.d;
        if (i != 0) {
        }
        j2 = j;
        j3 = ((mz0) obj2).a;
        mz0.d(j2, j3);
        x90Var.d = j3;
        x90Var.g = 2;
        obj2 = new mz0(0L);
    }

    public final long n0(long j, int i) {
        boolean z = this.q;
        y90 y90Var = null;
        if (z && z) {
            y90Var = (y90) yc0.d(this);
        }
        long n0 = y90Var != null ? y90Var.n0(j, i) : 0L;
        ra0.g(j, n0);
        return ra0.h(n0, 0L);
    }
}
