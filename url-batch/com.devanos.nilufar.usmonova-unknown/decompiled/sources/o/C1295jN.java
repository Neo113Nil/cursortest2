package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;

/* renamed from: o.jN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295jN implements YG {
    public final S2 h;
    public InterfaceC2312yp i;
    public InterfaceC1455lp j;
    public boolean k;
    public boolean m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public C1143h2 f182o;
    public final InterfaceC1712pi s;
    public int t;
    public final SG l = new SG();
    public final C1859ry p = new C1859ry(C1268j.u);
    public final C1178ha q = new C1178ha();
    public long r = AbstractC1700pW.a;

    public C1295jN(S2 s2, InterfaceC2312yp interfaceC2312yp, InterfaceC1455lp interfaceC1455lp) {
        this.h = s2;
        this.i = interfaceC2312yp;
        this.j = interfaceC1455lp;
        InterfaceC1712pi c1165hN = Build.VERSION.SDK_INT >= 29 ? new C1165hN() : new C1033fN(s2);
        c1165hN.F();
        c1165hN.t(false);
        this.s = c1165hN;
    }

    @Override // o.YG
    public final long a(long j, boolean z) {
        InterfaceC1712pi interfaceC1712pi = this.s;
        C1859ry c1859ry = this.p;
        if (!z) {
            return AbstractC1473m3.Q(c1859ry.b(interfaceC1712pi), j);
        }
        float[] a = c1859ry.a(interfaceC1712pi);
        if (a != null) {
            return AbstractC1473m3.Q(a, j);
        }
        return 9187343241974906880L;
    }

    @Override // o.YG
    public final void b(InterfaceC0980ea interfaceC0980ea, C0512Tq c0512Tq) {
        Canvas a = AbstractC2328z2.a(interfaceC0980ea);
        boolean isHardwareAccelerated = a.isHardwareAccelerated();
        InterfaceC1712pi interfaceC1712pi = this.s;
        if (isHardwareAccelerated) {
            f();
            boolean z = interfaceC1712pi.H() > 0.0f;
            this.n = z;
            if (z) {
                interfaceC0980ea.k();
            }
            interfaceC1712pi.q(a);
            if (this.n) {
                interfaceC0980ea.g();
                return;
            }
            return;
        }
        float left = interfaceC1712pi.getLeft();
        float r = interfaceC1712pi.r();
        float right = interfaceC1712pi.getRight();
        float n = interfaceC1712pi.n();
        if (interfaceC1712pi.a() < 1.0f) {
            C1143h2 c1143h2 = this.f182o;
            if (c1143h2 == null) {
                c1143h2 = AbstractC0946e20.b();
                this.f182o = c1143h2;
            }
            c1143h2.k(interfaceC1712pi.a());
            a.saveLayer(left, r, right, n, (Paint) c1143h2.i);
        } else {
            interfaceC0980ea.f();
        }
        interfaceC0980ea.b(left, r);
        interfaceC0980ea.j(this.p.b(interfaceC1712pi));
        if (interfaceC1712pi.z() || interfaceC1712pi.o()) {
            this.l.a(interfaceC0980ea);
        }
        InterfaceC2312yp interfaceC2312yp = this.i;
        if (interfaceC2312yp != null) {
            interfaceC2312yp.invoke(interfaceC0980ea, null);
        }
        interfaceC0980ea.d();
        i(false);
    }

    @Override // o.YG
    public final void c(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float a = AbstractC1700pW.a(this.r) * i;
        InterfaceC1712pi interfaceC1712pi = this.s;
        interfaceC1712pi.s(a);
        interfaceC1712pi.y(AbstractC1700pW.b(this.r) * i2);
        if (interfaceC1712pi.u(interfaceC1712pi.getLeft(), interfaceC1712pi.r(), interfaceC1712pi.getLeft() + i, interfaceC1712pi.r() + i2)) {
            interfaceC1712pi.D(this.l.b());
            if (!this.k && !this.m) {
                this.h.invalidate();
                i(true);
            }
            this.p.c();
        }
    }

    @Override // o.YG
    public final void d(LD ld, boolean z) {
        InterfaceC1712pi interfaceC1712pi = this.s;
        C1859ry c1859ry = this.p;
        if (!z) {
            AbstractC1473m3.R(c1859ry.b(interfaceC1712pi), ld);
            return;
        }
        float[] a = c1859ry.a(interfaceC1712pi);
        if (a != null) {
            AbstractC1473m3.R(a, ld);
            return;
        }
        ld.a = 0.0f;
        ld.b = 0.0f;
        ld.c = 0.0f;
        ld.d = 0.0f;
    }

    @Override // o.YG
    public final void destroy() {
        InterfaceC1712pi interfaceC1712pi = this.s;
        if (interfaceC1712pi.k()) {
            interfaceC1712pi.f();
        }
        this.i = null;
        this.j = null;
        this.m = true;
        i(false);
        S2 s2 = this.h;
        s2.F = true;
        s2.B(this);
    }

    @Override // o.YG
    public final void e(long j) {
        InterfaceC1712pi interfaceC1712pi = this.s;
        int left = interfaceC1712pi.getLeft();
        int r = interfaceC1712pi.r();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (left == i && r == i2) {
            return;
        }
        if (left != i) {
            interfaceC1712pi.m(i - left);
        }
        if (r != i2) {
            interfaceC1712pi.A(i2 - r);
        }
        int i3 = Build.VERSION.SDK_INT;
        S2 s2 = this.h;
        if (i3 >= 26) {
            W10.a.a(s2);
        } else {
            s2.invalidate();
        }
        this.p.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // o.YG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        DH dh;
        InterfaceC2312yp interfaceC2312yp;
        boolean z = this.k;
        InterfaceC1712pi interfaceC1712pi = this.s;
        if (z || !interfaceC1712pi.k()) {
            if (interfaceC1712pi.z()) {
                SG sg = this.l;
                if (sg.g) {
                    sg.d();
                    dh = sg.e;
                    interfaceC2312yp = this.i;
                    if (interfaceC2312yp != null) {
                        interfaceC1712pi.C(this.q, dh, new C2084vL(4, interfaceC2312yp));
                    }
                    i(false);
                }
            }
            dh = null;
            interfaceC2312yp = this.i;
            if (interfaceC2312yp != null) {
            }
            i(false);
        }
    }

    @Override // o.YG
    public final void g(InterfaceC2312yp interfaceC2312yp, InterfaceC1455lp interfaceC1455lp) {
        i(false);
        this.m = false;
        this.n = false;
        int i = AbstractC1700pW.b;
        this.r = AbstractC1700pW.a;
        this.i = interfaceC2312yp;
        this.j = interfaceC1455lp;
    }

    @Override // o.YG
    public final void h(C1823rO c1823rO) {
        InterfaceC1455lp interfaceC1455lp;
        int i = c1823rO.b | this.t;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.r = c1823rO.f;
        }
        InterfaceC1712pi interfaceC1712pi = this.s;
        boolean z = interfaceC1712pi.z();
        SG sg = this.l;
        boolean z2 = z && sg.g;
        if ((i & 1) != 0) {
            interfaceC1712pi.i();
        }
        if ((i & 2) != 0) {
            interfaceC1712pi.l();
        }
        if ((i & 4) != 0) {
            interfaceC1712pi.e();
        }
        if ((i & 8) != 0) {
            interfaceC1712pi.g();
        }
        if ((i & 16) != 0) {
            interfaceC1712pi.c();
        }
        if ((i & 32) != 0) {
            interfaceC1712pi.v();
        }
        if ((i & 64) != 0) {
            interfaceC1712pi.x(AbstractC0022At.L(c1823rO.c));
        }
        if ((i & 128) != 0) {
            interfaceC1712pi.E(AbstractC0022At.L(c1823rO.d));
        }
        if ((i & 1024) != 0) {
            interfaceC1712pi.h();
        }
        if ((i & 256) != 0) {
            interfaceC1712pi.b();
        }
        if ((i & 512) != 0) {
            interfaceC1712pi.d();
        }
        if ((i & 2048) != 0) {
            interfaceC1712pi.j(c1823rO.e);
        }
        if (i2 != 0) {
            interfaceC1712pi.s(AbstractC1700pW.a(this.r) * interfaceC1712pi.getWidth());
            interfaceC1712pi.y(AbstractC1700pW.b(this.r) * interfaceC1712pi.getHeight());
        }
        if ((i & 24576) != 0) {
            interfaceC1712pi.B(false);
            interfaceC1712pi.t(false);
        }
        if ((131072 & i) != 0) {
            interfaceC1712pi.p();
        }
        if ((32768 & i) != 0) {
            interfaceC1712pi.w();
        }
        sg.c(c1823rO.k, false, c1823rO.h);
        if (sg.f) {
            interfaceC1712pi.D(sg.b());
        }
        S2 s2 = this.h;
        if (z2) {
            if (!this.k && !this.m) {
                s2.invalidate();
                i(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            W10.a.a(s2);
        } else {
            s2.invalidate();
        }
        if (!this.n && interfaceC1712pi.H() > 0.0f && (interfaceC1455lp = this.j) != null) {
            interfaceC1455lp.invoke();
        }
        if ((i & 7963) != 0) {
            this.p.c();
        }
        this.t = c1823rO.b;
    }

    public final void i(boolean z) {
        if (z != this.k) {
            this.k = z;
            this.h.t(this, z);
        }
    }

    @Override // o.YG
    public final void invalidate() {
        if (this.k || this.m) {
            return;
        }
        this.h.invalidate();
        i(true);
    }
}
