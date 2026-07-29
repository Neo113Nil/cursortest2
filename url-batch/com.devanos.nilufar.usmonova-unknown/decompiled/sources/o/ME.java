package o;

import android.os.Build;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class ME extends AbstractC1415lB implements IB, InterfaceC1991ty, InterfaceC0699aH {
    public static final C1823rO D;
    public static final C1925sy E;
    public static final C0140Fh F;
    public static final C0218Ih G;
    public boolean B;
    public YG C;
    public final C0027Ay l;
    public ME m;
    public ME n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f66o;
    public InterfaceC2114vp p;
    public InterfaceC1119gh q;
    public EnumC2057uy r;
    public M5 t;
    public LinkedHashMap u;
    public float w;
    public LD x;
    public C1925sy y;
    public float s = 0.8f;
    public long v = 0;
    public final C1861s z = new C1861s(3, this);
    public final C1139h0 A = new C1139h0(29, this);

    static {
        C1823rO c1823rO = new C1823rO();
        long j = AbstractC0590Wq.a;
        c1823rO.c = j;
        c1823rO.d = j;
        c1823rO.e = 8.0f;
        c1823rO.f = AbstractC1700pW.a;
        c1823rO.g = AbstractC1305jX.k;
        c1823rO.h = 9205357640488583168L;
        c1823rO.i = new C1185hh(1.0f, 1.0f);
        c1823rO.j = EnumC2057uy.h;
        D = c1823rO;
        E = new C1925sy();
        int i = 12;
        F = new C0140Fh(i);
        G = new C0218Ih(i);
    }

    public ME(C0027Ay c0027Ay) {
        this.l = c0027Ay;
        this.q = c0027Ay.q;
        this.r = c0027Ay.r;
    }

    public final void A0(InterfaceC2114vp interfaceC2114vp, boolean z) {
        ZG zg;
        Reference poll;
        Object obj;
        C0027Ay c0027Ay = this.l;
        boolean z2 = (!z && this.p == interfaceC2114vp && AbstractC0048Bt.h(this.q, c0027Ay.q) && this.r == c0027Ay.r) ? false : true;
        this.q = c0027Ay.q;
        this.r = c0027Ay.r;
        boolean v = c0027Ay.v();
        C1139h0 c1139h0 = this.A;
        if (!v || interfaceC2114vp == null) {
            this.p = null;
            YG yg = this.C;
            if (yg != null) {
                yg.destroy();
                c0027Ay.x = true;
                c1139h0.invoke();
                if (h0().m && (zg = c0027Ay.j) != null) {
                    ((S2) zg).w(c0027Ay);
                }
            }
            this.C = null;
            this.B = false;
            return;
        }
        this.p = interfaceC2114vp;
        if (this.C != null) {
            if (z2) {
                B0(true);
                return;
            }
            return;
        }
        S2 s2 = (S2) PX.J0(c0027Ay);
        KX kx = s2.u0;
        YD yd = (YD) kx.h;
        do {
            poll = ((ReferenceQueue) kx.i).poll();
            if (poll != null) {
                ((YD) kx.h).m(poll);
            }
        } while (poll != null);
        while (true) {
            if (!yd.l()) {
                obj = null;
                break;
            } else {
                obj = ((Reference) yd.n(yd.j - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        YG yg2 = (YG) obj;
        C1861s c1861s = this.z;
        if (yg2 != null) {
            yg2.g(c1861s, c1139h0);
        } else if (!s2.isHardwareAccelerated() || Build.VERSION.SDK_INT == 28) {
            if (s2.isHardwareAccelerated() && s2.W) {
                try {
                    yg2 = new C1295jN(s2, c1861s, c1139h0);
                } catch (Throwable unused) {
                    s2.W = false;
                }
            }
            if (s2.K == null) {
                if (!NZ.z) {
                    DY.v(new View(s2.getContext()));
                }
                C0924dj c0924dj = NZ.A ? new C0924dj(s2.getContext()) : new PZ(s2.getContext());
                s2.K = c0924dj;
                s2.addView(c0924dj, -1);
            }
            C0924dj c0924dj2 = s2.K;
            AbstractC0048Bt.k(c0924dj2);
            yg2 = new NZ(s2, c0924dj2, c1861s, c1139h0);
        } else {
            yg2 = new C0564Vq(((C0950e6) s2.getGraphicsContext()).o(), s2.getGraphicsContext(), s2, c1861s, c1139h0);
        }
        yg2.c(this.d);
        yg2.e(this.v);
        this.C = yg2;
        B0(true);
        c0027Ay.x = true;
        c1139h0.invoke();
    }

    public final void B0(boolean z) {
        ZG zg;
        YG yg = this.C;
        if (yg == null) {
            if (this.p == null) {
                return;
            }
            AbstractC0868ct.W("null layer with a non-null layerBlock");
            throw null;
        }
        InterfaceC2114vp interfaceC2114vp = this.p;
        if (interfaceC2114vp == null) {
            AbstractC0868ct.X("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        C1823rO c1823rO = D;
        c1823rO.getClass();
        long j = AbstractC0590Wq.a;
        if (!C1114gc.b(c1823rO.c, j)) {
            c1823rO.b |= 64;
            c1823rO.c = j;
        }
        if (!C1114gc.b(c1823rO.d, j)) {
            c1823rO.b |= 128;
            c1823rO.d = j;
        }
        if (c1823rO.e != 8.0f) {
            c1823rO.b |= 2048;
            c1823rO.e = 8.0f;
        }
        long j2 = AbstractC1700pW.a;
        if (c1823rO.f != j2) {
            c1823rO.b |= 4096;
            c1823rO.f = j2;
        }
        C0140Fh c0140Fh = AbstractC1305jX.k;
        if (!AbstractC0048Bt.h(c1823rO.g, c0140Fh)) {
            c1823rO.b |= 8192;
            c1823rO.g = c0140Fh;
        }
        c1823rO.h = 9205357640488583168L;
        c1823rO.k = null;
        c1823rO.b = 0;
        C0027Ay c0027Ay = this.l;
        c1823rO.i = c0027Ay.q;
        c1823rO.j = c0027Ay.r;
        c1823rO.h = AbstractC0946e20.T(this.d);
        ((S2) PX.J0(c0027Ay)).getSnapshotObserver().a(this, C2316yt.y, new LE(0, interfaceC2114vp));
        C1925sy c1925sy = this.y;
        if (c1925sy == null) {
            c1925sy = new C1925sy();
            this.y = c1925sy;
        }
        c1925sy.a = c1823rO.e;
        c1925sy.b = c1823rO.f;
        yg.h(c1823rO);
        this.s = 1.0f;
        if (!z || (zg = c0027Ay.j) == null) {
            return;
        }
        ((S2) zg).w(c0027Ay);
    }

    public final boolean C0(long j) {
        long j2 = (j & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j2) & (j2 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    @Override // o.AbstractC1415lB
    public final AbstractC1415lB K() {
        return this.m;
    }

    @Override // o.AbstractC1415lB
    public final boolean M() {
        return this.t != null;
    }

    @Override // o.AbstractC1415lB
    public final EnumC2057uy N() {
        return this.l.r;
    }

    @Override // o.AbstractC1415lB
    public final C0027Ay O() {
        return this.l;
    }

    @Override // o.AbstractC1415lB
    public final M5 P() {
        M5 m5 = this.t;
        if (m5 != null) {
            return m5;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // o.AbstractC1415lB
    public final AbstractC1415lB Q() {
        return this.n;
    }

    @Override // o.AbstractC1415lB
    public final long R() {
        return this.v;
    }

    @Override // o.AbstractC1415lB
    public final void U() {
        E(this.v, this.w, this.p);
    }

    public final void V(ME me, LD ld, boolean z) {
        if (me == this) {
            return;
        }
        ME me2 = this.n;
        if (me2 != null) {
            me2.V(me, ld, z);
        }
        long j = this.v;
        float f = (int) (j >> 32);
        ld.a -= f;
        ld.c -= f;
        float f2 = (int) (j & 4294967295L);
        ld.b -= f2;
        ld.d -= f2;
        YG yg = this.C;
        if (yg != null) {
            yg.d(ld, true);
        }
    }

    public final long W(ME me, long j) {
        if (me == this) {
            return j;
        }
        ME me2 = this.n;
        return (me2 == null || AbstractC0048Bt.h(me, me2)) ? e0(j) : e0(me2.W(me, j));
    }

    public final long X(long j) {
        return AbstractC1035fP.a(Math.max(0.0f, (ZR.b(j) - C()) / 2.0f), Math.max(0.0f, (ZR.a(j) - ((int) (this.d & 4294967295L))) / 2.0f));
    }

    public final float Y(long j, long j2) {
        if (C() >= ZR.b(j2) && ((int) (this.d & 4294967295L)) >= ZR.a(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long X = X(j2);
        float b = ZR.b(X);
        float a = ZR.a(X);
        float b2 = BF.b(j);
        float max = Math.max(0.0f, b2 < 0.0f ? -b2 : b2 - C());
        float c = BF.c(j);
        long h = PX.h(max, Math.max(0.0f, c < 0.0f ? -c : c - ((int) (this.d & 4294967295L))));
        if ((b <= 0.0f && a <= 0.0f) || BF.b(h) > b || BF.c(h) > a) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    public final void Z(InterfaceC0980ea interfaceC0980ea, C0512Tq c0512Tq) {
        YG yg = this.C;
        if (yg != null) {
            yg.b(interfaceC0980ea, c0512Tq);
            return;
        }
        long j = this.v;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        interfaceC0980ea.b(f, f2);
        b0(interfaceC0980ea, c0512Tq);
        interfaceC0980ea.b(-f, -f2);
    }

    public final void a0(InterfaceC0980ea interfaceC0980ea, C1143h2 c1143h2) {
        long j = this.d;
        interfaceC0980ea.getClass();
        interfaceC0980ea.h(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, c1143h2);
    }

    public final void b0(InterfaceC0980ea interfaceC0980ea, C0512Tq c0512Tq) {
        InterfaceC0980ea interfaceC0980ea2;
        C0512Tq c0512Tq2;
        TC i0 = i0(4);
        if (i0 == null) {
            u0(interfaceC0980ea, c0512Tq);
            return;
        }
        C0027Ay c0027Ay = this.l;
        c0027Ay.getClass();
        C0079Cy sharedDrawScope = ((S2) PX.J0(c0027Ay)).getSharedDrawScope();
        long T = AbstractC0946e20.T(this.d);
        sharedDrawScope.getClass();
        while (i0 != null) {
            if (i0 instanceof InterfaceC1055fj) {
                interfaceC0980ea2 = interfaceC0980ea;
                c0512Tq2 = c0512Tq;
                sharedDrawScope.b(interfaceC0980ea2, T, this, (InterfaceC1055fj) i0, c0512Tq2);
            } else {
                interfaceC0980ea2 = interfaceC0980ea;
                c0512Tq2 = c0512Tq;
            }
            i0 = null;
            interfaceC0980ea = interfaceC0980ea2;
            c0512Tq = c0512Tq2;
        }
    }

    @Override // o.InterfaceC1119gh
    public final float c() {
        return this.l.q.c();
    }

    public abstract void c0();

    @Override // o.InterfaceC1991ty
    public final C1032fM d(InterfaceC1991ty interfaceC1991ty, boolean z) {
        ME me;
        if (!h0().m) {
            AbstractC0868ct.W("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!interfaceC1991ty.u()) {
            AbstractC0868ct.W("LayoutCoordinates " + interfaceC1991ty + " is not attached!");
            throw null;
        }
        C1613oB c1613oB = interfaceC1991ty instanceof C1613oB ? (C1613oB) interfaceC1991ty : null;
        if (c1613oB == null || (me = c1613oB.b.l) == null) {
            me = (ME) interfaceC1991ty;
        }
        me.r0();
        ME d0 = d0(me);
        LD ld = this.x;
        if (ld == null) {
            ld = new LD();
            ld.a = 0.0f;
            ld.b = 0.0f;
            ld.c = 0.0f;
            ld.d = 0.0f;
            this.x = ld;
        }
        ld.a = 0.0f;
        ld.b = 0.0f;
        ld.c = (int) (interfaceC1991ty.y() >> 32);
        ld.d = (int) (interfaceC1991ty.y() & 4294967295L);
        while (me != d0) {
            me.w0(ld, z, false);
            if (ld.a()) {
                return C1032fM.e;
            }
            me = me.n;
            AbstractC0048Bt.k(me);
        }
        V(d0, ld, z);
        return new C1032fM(ld.a, ld.b, ld.c, ld.d);
    }

    public final ME d0(ME me) {
        C0027Ay c0027Ay = me.l;
        C0027Ay c0027Ay2 = this.l;
        if (c0027Ay == c0027Ay2) {
            TC h0 = me.h0();
            TC tc = h0().b;
            if (!tc.m) {
                AbstractC0868ct.W("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (TC tc2 = tc.e; tc2 != null; tc2 = tc2.e) {
                if ((tc2.c & 2) != 0 && tc2 == h0) {
                    return me;
                }
            }
            return this;
        }
        while (c0027Ay.k > c0027Ay2.k) {
            c0027Ay = c0027Ay.l();
            AbstractC0048Bt.k(c0027Ay);
        }
        C0027Ay c0027Ay3 = c0027Ay2;
        while (c0027Ay3.k > c0027Ay.k) {
            c0027Ay3 = c0027Ay3.l();
            AbstractC0048Bt.k(c0027Ay3);
        }
        while (c0027Ay != c0027Ay3) {
            c0027Ay = c0027Ay.l();
            c0027Ay3 = c0027Ay3.l();
            if (c0027Ay == null || c0027Ay3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (c0027Ay3 != c0027Ay2) {
            if (c0027Ay != me.l) {
                return (C0384Os) c0027Ay.u.c;
            }
            return me;
        }
        return this;
    }

    @Override // o.InterfaceC1991ty
    public final long e(long j) {
        long q0 = q0(j);
        S2 s2 = (S2) PX.J0(this.l);
        s2.A();
        return AbstractC1473m3.Q(s2.R, q0);
    }

    public final long e0(long j) {
        long j2 = this.v;
        long h = PX.h(BF.b(j) - ((int) (j2 >> 32)), BF.c(j) - ((int) (j2 & 4294967295L)));
        YG yg = this.C;
        return yg != null ? yg.a(h, true) : h;
    }

    @Override // o.InterfaceC1119gh
    public final float f() {
        return this.l.q.f();
    }

    public abstract AbstractC1547nB f0();

    @Override // o.IB
    public final Object g() {
        C0027Ay c0027Ay = this.l;
        if (c0027Ay.u.f(64)) {
            h0();
            for (TC tc = (IU) c0027Ay.u.e; tc != null; tc = tc.e) {
                if ((tc.c & 64) != 0) {
                    for (TC tc2 = tc; tc2 != null; tc2 = null) {
                        if (tc2 instanceof X7) {
                            AbstractC0048Bt.l(((X7) tc2).n, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
                            throw new ClassCastException();
                        }
                    }
                }
            }
        }
        return null;
    }

    public final long g0() {
        return this.q.w(this.l.s.a());
    }

    @Override // o.InterfaceC1991ty
    public final InterfaceC1991ty h() {
        if (h0().m) {
            r0();
            return ((ME) this.l.u.d).n;
        }
        AbstractC0868ct.W("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public abstract TC h0();

    public final TC i0(int i) {
        boolean d = NE.d(i);
        TC h0 = h0();
        if (!d && (h0 = h0.e) == null) {
            return null;
        }
        for (TC j0 = j0(d); j0 != null && (j0.d & i) != 0; j0 = j0.f) {
            if ((j0.c & i) != 0) {
                return j0;
            }
            if (j0 == h0) {
                return null;
            }
        }
        return null;
    }

    @Override // o.InterfaceC0699aH
    public final boolean j() {
        return (this.C == null || this.f66o || !this.l.v()) ? false : true;
    }

    public final TC j0(boolean z) {
        TC h0;
        C1970td c1970td = this.l.u;
        if (((ME) c1970td.d) == this) {
            return (TC) c1970td.f;
        }
        if (!z) {
            ME me = this.n;
            if (me != null) {
                return me.h0();
            }
            return null;
        }
        ME me2 = this.n;
        if (me2 == null || (h0 = me2.h0()) == null) {
            return null;
        }
        return h0.f;
    }

    public final void k0(TC tc, IE ie, long j, C2182wr c2182wr, boolean z, boolean z2) {
        if (tc == null) {
            m0(ie, j, c2182wr, z, z2);
            return;
        }
        c2182wr.k(tc, -1.0f, z2, new JE(this, tc, ie, j, c2182wr, z, z2));
        ME me = tc.h;
        if (me != null) {
            TC j0 = me.j0(NE.d(16));
            if (j0 != null && j0.m) {
                TC tc2 = j0.b;
                if (!tc2.m) {
                    AbstractC0868ct.W("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((tc2.d & 16) != 0) {
                    while (tc2 != null) {
                        if ((tc2.c & 16) != 0) {
                            for (TC tc3 = tc2; tc3 != null; tc3 = null) {
                                if (tc3 instanceof X7) {
                                    AbstractC0048Bt.l(((X7) tc3).n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                                    throw new ClassCastException();
                                }
                            }
                        }
                        tc2 = tc2.f;
                    }
                }
            }
            c2182wr.l = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        if (o.PX.w(r18.j(), o.EB.b(r9, r20)) > 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(IE ie, long j, C2182wr c2182wr, boolean z, boolean z2) {
        TC i0 = i0(ie.b());
        if (!C0(j)) {
            if (z) {
                float Y = Y(j, g0());
                if (Float.isInfinite(Y) || Float.isNaN(Y)) {
                    return;
                }
                if (c2182wr.j != AbstractC0868ct.w(c2182wr)) {
                    if (PX.w(c2182wr.j(), EB.b(Y, false)) <= 0) {
                        return;
                    }
                }
                if (i0 == null) {
                    m0(ie, j, c2182wr, z, false);
                    return;
                } else {
                    c2182wr.k(i0, Y, false, new KE(this, i0, ie, j, c2182wr, z, false, Y));
                    return;
                }
            }
            return;
        }
        if (i0 == null) {
            m0(ie, j, c2182wr, z, z2);
            return;
        }
        float b = BF.b(j);
        float c = BF.c(j);
        if (b >= 0.0f && c >= 0.0f && b < C() && c < ((int) (this.d & 4294967295L))) {
            k0(i0, ie, j, c2182wr, z, z2);
            return;
        }
        float Y2 = !z ? Float.POSITIVE_INFINITY : Y(j, g0());
        if (!Float.isInfinite(Y2) && !Float.isNaN(Y2)) {
            if (c2182wr.j != AbstractC0868ct.w(c2182wr)) {
            }
            c2182wr.k(i0, Y2, z2, new KE(this, i0, ie, j, c2182wr, z, z2, Y2));
            return;
        }
        y0(i0, ie, j, c2182wr, z, z2, Y2);
    }

    public void m0(IE ie, long j, C2182wr c2182wr, boolean z, boolean z2) {
        ME me = this.m;
        if (me != null) {
            me.l0(ie, me.e0(j), c2182wr, z, z2);
        }
    }

    public final void n0() {
        YG yg = this.C;
        if (yg != null) {
            yg.invalidate();
            return;
        }
        ME me = this.n;
        if (me != null) {
            me.n0();
        }
    }

    public final boolean o0() {
        if (this.C != null && this.s <= 0.0f) {
            return true;
        }
        ME me = this.n;
        if (me != null) {
            return me.o0();
        }
        return false;
    }

    public final long p0(InterfaceC1991ty interfaceC1991ty, long j) {
        ME me;
        boolean z = interfaceC1991ty instanceof C1613oB;
        if (z) {
            ((C1613oB) interfaceC1991ty).b.l.r0();
            return ((C1613oB) interfaceC1991ty).a(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        C1613oB c1613oB = z ? (C1613oB) interfaceC1991ty : null;
        if (c1613oB == null || (me = c1613oB.b.l) == null) {
            AbstractC0048Bt.l(interfaceC1991ty, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            me = (ME) interfaceC1991ty;
        }
        me.r0();
        ME d0 = d0(me);
        while (me != d0) {
            j = me.z0(j);
            me = me.n;
            AbstractC0048Bt.k(me);
        }
        return W(d0, j);
    }

    public final long q0(long j) {
        if (!h0().m) {
            AbstractC0868ct.W("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        r0();
        for (ME me = this; me != null; me = me.n) {
            j = me.z0(j);
        }
        return j;
    }

    public final void r0() {
        C0209Hy c0209Hy = this.l.v;
        int i = c0209Hy.a.v.b;
        if (i == 3 || i == 4) {
            if (c0209Hy.q.t) {
                c0209Hy.e(true);
            } else {
                c0209Hy.d(true);
            }
        }
        if (i == 4) {
            C0131Ey c0131Ey = c0209Hy.r;
            if (c0131Ey == null || !c0131Ey.t) {
                c0209Hy.f(true);
            } else {
                c0209Hy.g(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {all -> 0x005c, blocks: (B:16:0x0057, B:17:0x0067, B:19:0x006d, B:21:0x0072, B:25:0x007a, B:27:0x007e, B:33:0x0084, B:41:0x005e), top: B:14:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:16:0x0057, B:17:0x0067, B:19:0x006d, B:21:0x0072, B:25:0x007a, B:27:0x007e, B:33:0x0084, B:41:0x005e), top: B:14:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:16:0x0057, B:17:0x0067, B:19:0x006d, B:21:0x0072, B:25:0x007a, B:27:0x007e, B:33:0x0084, B:41:0x005e), top: B:14:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0() {
        AbstractC1696pS h;
        TC tc;
        TC j0;
        boolean d = NE.d(128);
        TC j02 = j0(d);
        if (j02 == null || (j02.b.d & 128) == 0) {
            return;
        }
        AbstractC1696pS abstractC1696pS = (AbstractC1696pS) AbstractC2025uS.a.get();
        InterfaceC2114vp f = abstractC1696pS != null ? abstractC1696pS.f() : null;
        try {
            if (abstractC1696pS instanceof C1963tW) {
                C1963tW c1963tW = (C1963tW) abstractC1696pS;
                if (c1963tW.t == AbstractC0868ct.p()) {
                    c1963tW.r = null;
                    h = abstractC1696pS;
                    if (d) {
                        tc = h0();
                    } else {
                        tc = h0().e;
                        if (tc == null) {
                            return;
                        }
                    }
                    for (j0 = j0(d); j0 != null; j0 = j0.f) {
                        if ((j0.d & 128) == 0) {
                            break;
                        }
                        if ((j0.c & 128) != 0) {
                            for (TC tc2 = j0; tc2 != null; tc2 = null) {
                                if (tc2 instanceof X7) {
                                }
                            }
                        }
                        if (j0 == tc) {
                            break;
                        }
                    }
                    return;
                }
            }
            if (abstractC1696pS instanceof C2029uW) {
                C2029uW c2029uW = (C2029uW) abstractC1696pS;
                if (c2029uW.h == AbstractC0868ct.p()) {
                    c2029uW.g = null;
                    h = abstractC1696pS;
                    if (d) {
                    }
                    while (j0 != null) {
                    }
                    return;
                }
            }
            if (d) {
            }
            while (j0 != null) {
            }
            return;
        } finally {
            ON.p(abstractC1696pS, h, f);
        }
        h = AbstractC2025uS.h(abstractC1696pS, null, false);
        h.j();
    }

    public final void t0() {
        boolean d = NE.d(128);
        TC h0 = h0();
        if (!d && (h0 = h0.e) == null) {
            return;
        }
        for (TC j0 = j0(d); j0 != null && (j0.d & 128) != 0; j0 = j0.f) {
            if ((j0.c & 128) != 0) {
                for (TC tc = j0; tc != null; tc = null) {
                    if (tc instanceof X7) {
                    }
                }
            }
            if (j0 == h0) {
                return;
            }
        }
    }

    @Override // o.InterfaceC1991ty
    public final boolean u() {
        return h0().m;
    }

    public abstract void u0(InterfaceC0980ea interfaceC0980ea, C0512Tq c0512Tq);

    public final void v0(long j, float f, InterfaceC2114vp interfaceC2114vp) {
        A0(interfaceC2114vp, false);
        if (this.v != j) {
            this.v = j;
            C0027Ay c0027Ay = this.l;
            c0027Ay.v.q.J();
            YG yg = this.C;
            if (yg != null) {
                yg.e(j);
            } else {
                ME me = this.n;
                if (me != null) {
                    me.n0();
                }
            }
            AbstractC1415lB.S(this);
            ZG zg = c0027Ay.j;
            if (zg != null) {
                ((S2) zg).w(c0027Ay);
            }
        }
        this.w = f;
        if (this.h) {
            return;
        }
        I(new C0831cI(P(), this));
    }

    public final void w0(LD ld, boolean z, boolean z2) {
        YG yg = this.C;
        if (yg != null) {
            yg.d(ld, false);
        }
        long j = this.v;
        float f = (int) (j >> 32);
        ld.a += f;
        ld.c += f;
        float f2 = (int) (j & 4294967295L);
        ld.b += f2;
        ld.d += f2;
    }

    public final void x0(M5 m5) {
        ME me;
        M5 m52 = this.t;
        if (m5 != m52) {
            this.t = m5;
            C0027Ay c0027Ay = this.l;
            if (m52 == null || m5.n() != m52.n() || m5.l() != m52.l()) {
                int n = m5.n();
                int l = m5.l();
                YG yg = this.C;
                if (yg != null) {
                    yg.c(AbstractC0946e20.a(n, l));
                } else if (c0027Ay.w() && (me = this.n) != null) {
                    me.n0();
                }
                F(AbstractC0946e20.a(n, l));
                if (this.p != null) {
                    B0(false);
                }
                boolean d = NE.d(4);
                TC h0 = h0();
                if (d || (h0 = h0.e) != null) {
                    for (TC j0 = j0(d); j0 != null && (j0.d & 4) != 0; j0 = j0.f) {
                        if ((j0.c & 4) != 0) {
                            for (Object obj = j0; obj != null; obj = null) {
                                if (obj instanceof InterfaceC1055fj) {
                                    ((InterfaceC1055fj) obj).i();
                                }
                            }
                        }
                        if (j0 == h0) {
                            break;
                        }
                    }
                }
                ZG zg = c0027Ay.j;
                if (zg != null) {
                    ((S2) zg).w(c0027Ay);
                }
            }
            LinkedHashMap linkedHashMap = this.u;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && m5.k().isEmpty()) || AbstractC0048Bt.h(m5.k(), this.u)) {
                return;
            }
            c0027Ay.v.q.q.f();
            LinkedHashMap linkedHashMap2 = this.u;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.u = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(m5.k());
        }
    }

    @Override // o.InterfaceC1991ty
    public final long y() {
        return this.d;
    }

    public final void y0(TC tc, IE ie, long j, C2182wr c2182wr, boolean z, boolean z2, float f) {
        if (tc == null) {
            m0(ie, j, c2182wr, z, z2);
        } else {
            ie.a(tc);
            y0(AbstractC0022At.f(tc, ie.b()), ie, j, c2182wr, z, z2, f);
        }
    }

    public final long z0(long j) {
        YG yg = this.C;
        if (yg != null) {
            j = yg.a(j, false);
        }
        long j2 = this.v;
        return PX.h(BF.b(j) + ((int) (j2 >> 32)), BF.c(j) + ((int) (j2 & 4294967295L)));
    }

    @Override // o.AbstractC1415lB
    public final InterfaceC1991ty L() {
        return this;
    }
}
