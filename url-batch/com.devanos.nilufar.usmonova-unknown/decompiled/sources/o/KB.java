package o;

/* loaded from: classes.dex */
public final class KB {
    public final C0027Ay a;
    public boolean c;
    public boolean d;
    public C0603Xd i;
    public final C2002u5 b = new C2002u5(18);
    public final C0208Hx e = new C0208Hx(13);
    public final YD f = new YD(new C0027Ay[16]);
    public final long g = 1;
    public final YD h = new YD(new JB[16]);

    public KB(C0027Ay c0027Ay) {
        this.a = c0027Ay;
    }

    public static boolean b(C0027Ay c0027Ay, C0603Xd c0603Xd) {
        boolean M;
        C0027Ay c0027Ay2 = c0027Ay.d;
        C0209Hy c0209Hy = c0027Ay.v;
        if (c0027Ay2 == null) {
            return false;
        }
        if (c0603Xd != null) {
            if (c0027Ay2 != null) {
                C0131Ey c0131Ey = c0209Hy.r;
                AbstractC0048Bt.k(c0131Ey);
                M = c0131Ey.M(c0603Xd.a);
            }
            M = false;
        } else {
            C0131Ey c0131Ey2 = c0209Hy.r;
            C0603Xd c0603Xd2 = c0131Ey2 != null ? c0131Ey2.m : null;
            if (c0603Xd2 != null && c0027Ay2 != null) {
                AbstractC0048Bt.k(c0131Ey2);
                M = c0131Ey2.M(c0603Xd2.a);
            }
            M = false;
        }
        C0027Ay l = c0027Ay.l();
        if (M && l != null) {
            if (l.d == null) {
                C0027Ay.E(l, false, 3);
                return M;
            }
            if (c0027Ay.k() == 1) {
                C0027Ay.C(l, false, 3);
                return M;
            }
            if (c0027Ay.k() == 2) {
                l.B(false);
            }
        }
        return M;
    }

    public static boolean c(C0027Ay c0027Ay, C0603Xd c0603Xd) {
        boolean A;
        if (c0603Xd != null) {
            if (c0027Ay.C == 3) {
                c0027Ay.c();
            }
            A = c0027Ay.v.q.M(c0603Xd.a);
        } else {
            A = C0027Ay.A(c0027Ay);
        }
        C0027Ay l = c0027Ay.l();
        if (A && l != null) {
            int i = c0027Ay.v.q.l;
            if (i == 1) {
                C0027Ay.E(l, false, 3);
                return A;
            }
            if (i == 2) {
                l.D(false);
            }
        }
        return A;
    }

    public static boolean f(C0027Ay c0027Ay) {
        C0157Fy c0157Fy = c0027Ay.v.q;
        return c0157Fy.l == 1 || c0157Fy.q.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 < r2) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        Object[] objArr;
        C0208Hx c0208Hx = this.e;
        if (z) {
            YD yd = (YD) c0208Hx.i;
            yd.h();
            C0027Ay c0027Ay = this.a;
            yd.b(c0027Ay);
            c0027Ay.A = true;
        }
        YD yd2 = (YD) c0208Hx.i;
        yd2.p(C0685a3.g);
        int i = yd2.j;
        C0027Ay[] c0027AyArr = (C0027Ay[]) c0208Hx.j;
        if (c0027AyArr != null) {
            int length = c0027AyArr.length;
            objArr = c0027AyArr;
        }
        objArr = new C0027Ay[Math.max(16, i)];
        c0208Hx.j = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = yd2.h[i2];
        }
        yd2.h();
        for (int i3 = i - 1; -1 < i3; i3--) {
            C0027Ay c0027Ay2 = objArr[i3];
            AbstractC0048Bt.k(c0027Ay2);
            if (c0027Ay2.A) {
                C0208Hx.K0(c0027Ay2);
            }
        }
        c0208Hx.j = objArr;
    }

    public final void d(C0027Ay c0027Ay, boolean z) {
        C2002u5 c2002u5 = this.b;
        if (((AW) ((C2002u5) (z ? c2002u5.i : c2002u5.j)).j).isEmpty()) {
            return;
        }
        if (!this.c) {
            AbstractC0868ct.W("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        C0209Hy c0209Hy = c0027Ay.v;
        if (z ? c0209Hy.f : c0209Hy.c) {
            AbstractC0868ct.V("node not yet measured");
            throw null;
        }
        e(c0027Ay, z);
    }

    public final void e(C0027Ay c0027Ay, boolean z) {
        C0131Ey c0131Ey;
        C0053By c0053By;
        YD o2 = c0027Ay.o();
        int i = o2.j;
        C2002u5 c2002u5 = this.b;
        boolean z2 = true;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay2 = (C0027Ay) objArr[i2];
                if ((!z && f(c0027Ay2)) || (z && (c0027Ay2.k() == 1 || ((c0131Ey = c0027Ay2.v.r) != null && (c0053By = c0131Ey.q) != null && c0053By.e())))) {
                    boolean F = AbstractC0868ct.F(c0027Ay2);
                    C0209Hy c0209Hy = c0027Ay2.v;
                    if (F && !z) {
                        if (c0209Hy.f && ((AW) ((C2002u5) c2002u5.i).j).contains(c0027Ay2)) {
                            i(c0027Ay2, true, false);
                        } else {
                            d(c0027Ay2, true);
                        }
                    }
                    if (z ? c0209Hy.f : c0209Hy.c) {
                        boolean contains = ((AW) ((C2002u5) c2002u5.i).j).contains(c0027Ay2);
                        if (!z) {
                            contains = contains || ((AW) ((C2002u5) c2002u5.j).j).contains(c0027Ay2);
                        }
                        if (contains) {
                            i(c0027Ay2, z, false);
                        }
                    }
                    if (!(z ? c0209Hy.f : c0209Hy.c)) {
                        e(c0027Ay2, z);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        C0209Hy c0209Hy2 = c0027Ay.v;
        if (z ? c0209Hy2.f : c0209Hy2.c) {
            boolean contains2 = ((AW) ((C2002u5) c2002u5.i).j).contains(c0027Ay);
            if (z) {
                z2 = contains2;
            } else if (!contains2 && !((AW) ((C2002u5) c2002u5.j).j).contains(c0027Ay)) {
                z2 = false;
            }
            if (z2) {
                i(c0027Ay, z, false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 o.TC, still in use, count: 2, list:
          (r8v1 o.TC) from 0x009b: IF  (r8v1 o.TC) == (null o.TC)  -> B:60:0x00c0 A[HIDDEN] (LINE:156)
          (r8v1 o.TC) from 0x009e: PHI (r8v2 o.TC) = (r8v1 o.TC) binds: [B:67:0x009b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final boolean g(o.InterfaceC1455lp r11) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KB.g(o.lp):boolean");
    }

    public final void h() {
        C2002u5 c2002u5 = this.b;
        if (c2002u5.S()) {
            C0027Ay c0027Ay = this.a;
            if (!c0027Ay.v()) {
                AbstractC0868ct.V("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!c0027Ay.w()) {
                AbstractC0868ct.V("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.c) {
                AbstractC0868ct.V("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((AW) ((C2002u5) c2002u5.i).j).isEmpty()) {
                        if (c0027Ay.d != null) {
                            k(c0027Ay, true);
                        } else {
                            j(c0027Ay);
                        }
                    }
                    k(c0027Ay, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    this.c = false;
                    this.d = false;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i(C0027Ay c0027Ay, boolean z, boolean z2) {
        C0603Xd c0603Xd;
        boolean c;
        C0027Ay l;
        ZH placementScope;
        C0384Os c0384Os;
        C0027Ay l2;
        C0027Ay l3;
        C0131Ey c0131Ey;
        C0053By c0053By;
        C0131Ey c0131Ey2;
        C0053By c0053By2;
        boolean z3 = c0027Ay.B;
        C0209Hy c0209Hy = c0027Ay.v;
        boolean z4 = false;
        Object[] objArr = 0;
        int i = 0;
        if (z3 || (!c0027Ay.w() && !c0209Hy.q.p && ((!c0209Hy.c || !f(c0027Ay)) && !AbstractC0048Bt.h(c0027Ay.x(), Boolean.TRUE) && ((!c0209Hy.f || (c0027Ay.k() != 1 && ((c0131Ey2 = c0209Hy.r) == null || (c0053By2 = c0131Ey2.q) == null || !c0053By2.e()))) && !c0209Hy.q.q.e() && ((c0131Ey = c0209Hy.r) == null || (c0053By = c0131Ey.q) == null || !c0053By.e()))))) {
            return false;
        }
        C0027Ay c0027Ay2 = this.a;
        if (c0027Ay == c0027Ay2) {
            c0603Xd = this.i;
            AbstractC0048Bt.k(c0603Xd);
        } else {
            c0603Xd = null;
        }
        if (z) {
            c = c0209Hy.f ? b(c0027Ay, c0603Xd) : false;
            if (z2 && ((c || c0209Hy.g) && AbstractC0048Bt.h(c0027Ay.x(), Boolean.TRUE))) {
                if (c0027Ay.C == 3) {
                    c0027Ay.d();
                }
                C0131Ey c0131Ey3 = c0209Hy.r;
                AbstractC0048Bt.k(c0131Ey3);
                try {
                    c0131Ey3.g = true;
                    if (!c0131Ey3.k) {
                        AbstractC0868ct.W("replace() called on item that was not placed");
                        throw null;
                    }
                    c0131Ey3.u = false;
                    boolean z5 = c0131Ey3.p;
                    c0131Ey3.L(c0131Ey3.n, c0131Ey3.f39o);
                    if (z5 && !c0131Ey3.u && (l3 = c0131Ey3.v.a.l()) != null) {
                        l3.B(false);
                    }
                } finally {
                    c0131Ey3.g = false;
                }
            }
        } else {
            boolean z6 = c0209Hy.c;
            C0157Fy c0157Fy = c0209Hy.q;
            c = z6 ? c(c0027Ay, c0603Xd) : false;
            if (z2 && c0209Hy.d && (c0027Ay == c0027Ay2 || ((l2 = c0027Ay.l()) != null && l2.w() && c0209Hy.q.p))) {
                if (c0027Ay == c0027Ay2) {
                    if (c0027Ay.C == 3) {
                        c0027Ay.d();
                    }
                    C0027Ay l4 = c0027Ay.l();
                    if (l4 == null || (c0384Os = (C0384Os) l4.u.c) == null || (placementScope = c0384Os.i) == null) {
                        placementScope = ((S2) PX.J0(c0027Ay)).getPlacementScope();
                    }
                    ZH.e(placementScope, c0157Fy, 0, 0);
                } else {
                    if (c0027Ay.C == 3) {
                        c0027Ay.d();
                    }
                    c0157Fy.getClass();
                    try {
                        c0157Fy.g = true;
                        if (!c0157Fy.k) {
                            AbstractC0868ct.W("replace called on unplaced item");
                            throw null;
                        }
                        boolean z7 = c0157Fy.f42o;
                        c0157Fy.L(c0157Fy.m, c0157Fy.n);
                        if (z7 && !c0157Fy.w && (l = c0157Fy.B.a.l()) != null) {
                            l.D(false);
                        }
                    } finally {
                        c0157Fy.g = false;
                    }
                }
                ((YD) this.e.i).b(c0027Ay);
                c0027Ay.A = true;
            }
        }
        YD yd = this.h;
        if (yd.l()) {
            int i2 = yd.j;
            if (i2 > 0) {
                Object[] objArr2 = yd.h;
                do {
                    JB jb = (JB) objArr2[i];
                    C0027Ay c0027Ay3 = jb.a;
                    boolean z8 = jb.c;
                    C0027Ay c0027Ay4 = jb.a;
                    if (c0027Ay3.v()) {
                        if (jb.b) {
                            C0027Ay.C(c0027Ay4, z8, 2);
                        } else {
                            C0027Ay.E(c0027Ay4, z8, 2);
                        }
                    }
                    i++;
                } while (i < i2);
            }
            yd.h();
        }
        return c;
    }

    public final void j(C0027Ay c0027Ay) {
        YD o2 = c0027Ay.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay2 = (C0027Ay) objArr[i2];
                if (f(c0027Ay2)) {
                    if (AbstractC0868ct.F(c0027Ay2)) {
                        k(c0027Ay2, true);
                    } else {
                        j(c0027Ay2);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void k(C0027Ay c0027Ay, boolean z) {
        C0603Xd c0603Xd;
        if (c0027Ay.B) {
            return;
        }
        if (c0027Ay == this.a) {
            c0603Xd = this.i;
            AbstractC0048Bt.k(c0603Xd);
        } else {
            c0603Xd = null;
        }
        if (z) {
            b(c0027Ay, c0603Xd);
        } else {
            c(c0027Ay, c0603Xd);
        }
    }

    public final boolean l(C0027Ay c0027Ay, boolean z) {
        C0209Hy c0209Hy = c0027Ay.v;
        C0209Hy c0209Hy2 = c0027Ay.v;
        int v = AbstractC1888sN.v(c0209Hy.b);
        if (v != 0 && v != 1) {
            if (v == 2 || v == 3) {
                this.h.b(new JB(c0027Ay, false, z));
            } else {
                if (v != 4) {
                    throw new C0057Cc();
                }
                if (!c0209Hy2.c || z) {
                    c0209Hy2.c = true;
                    if (c0027Ay.B || (!c0027Ay.w() && (!c0209Hy2.c || !f(c0027Ay)))) {
                        return false;
                    }
                    C0027Ay l = c0027Ay.l();
                    if (l == null || !l.v.c) {
                        this.b.A(c0027Ay, false);
                    }
                    if (!this.d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void m(long j) {
        C0603Xd c0603Xd = this.i;
        if (c0603Xd != null && c0603Xd.a == j) {
            return;
        }
        if (this.c) {
            AbstractC0868ct.V("updateRootConstraints called while measuring");
            throw null;
        }
        this.i = new C0603Xd(j);
        C0027Ay c0027Ay = this.a;
        C0027Ay c0027Ay2 = c0027Ay.d;
        C0209Hy c0209Hy = c0027Ay.v;
        if (c0027Ay2 != null) {
            c0209Hy.f = true;
        }
        c0209Hy.c = true;
        this.b.A(c0027Ay, c0027Ay2 != null);
    }
}
