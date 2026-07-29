package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;

/* renamed from: o.Vq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564Vq implements YG {
    public C0512Tq h;
    public final InterfaceC0486Sq i;
    public final S2 j;
    public InterfaceC2312yp k;
    public InterfaceC1455lp l;
    public boolean n;
    public float[] p;
    public boolean q;
    public int u;
    public RG w;
    public C1143h2 x;
    public long m = AbstractC0946e20.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public final float[] f120o = AbstractC1473m3.r();
    public InterfaceC1119gh r = new C1185hh(1.0f, 1.0f);
    public EnumC2057uy s = EnumC2057uy.h;
    public final C1112ga t = new C1112ga();
    public long v = AbstractC1700pW.a;
    public final C1400l y = new C1400l(20, this);

    public C0564Vq(C0512Tq c0512Tq, InterfaceC0486Sq interfaceC0486Sq, S2 s2, InterfaceC2312yp interfaceC2312yp, InterfaceC1455lp interfaceC1455lp) {
        this.h = c0512Tq;
        this.i = interfaceC0486Sq;
        this.j = s2;
        this.k = interfaceC2312yp;
        this.l = interfaceC1455lp;
    }

    @Override // o.YG
    public final long a(long j, boolean z) {
        if (!z) {
            return AbstractC1473m3.Q(i(), j);
        }
        float[] i = i();
        float[] fArr = this.p;
        if (fArr == null) {
            fArr = AbstractC1473m3.r();
            this.p = fArr;
        }
        if (!AbstractC1807r8.K(i, fArr)) {
            fArr = null;
        }
        if (fArr != null) {
            return AbstractC1473m3.Q(fArr, j);
        }
        return 9187343241974906880L;
    }

    @Override // o.YG
    public final void b(InterfaceC0980ea interfaceC0980ea, C0512Tq c0512Tq) {
        float f;
        boolean z;
        float f2;
        Canvas a = AbstractC2328z2.a(interfaceC0980ea);
        if (!a.isHardwareAccelerated()) {
            C0512Tq c0512Tq2 = this.h;
            long j = c0512Tq2.p;
            float f3 = (int) (j >> 32);
            float f4 = (int) (j & 4294967295L);
            long j2 = this.m;
            float f5 = ((int) (j2 >> 32)) + f3;
            float f6 = ((int) (j2 & 4294967295L)) + f4;
            if (c0512Tq2.a.a() < 1.0f) {
                C1143h2 c1143h2 = this.x;
                if (c1143h2 == null) {
                    c1143h2 = AbstractC0946e20.b();
                    this.x = c1143h2;
                }
                c1143h2.k(this.h.a.a());
                Paint paint = (Paint) c1143h2.i;
                f = f3;
                a.saveLayer(f, f4, f5, f6, paint);
            } else {
                f = f3;
                interfaceC0980ea.f();
            }
            interfaceC0980ea.b(f, f4);
            interfaceC0980ea.j(i());
            this.h.getClass();
            InterfaceC2312yp interfaceC2312yp = this.k;
            if (interfaceC2312yp != null) {
                interfaceC2312yp.invoke(interfaceC0980ea, null);
            }
            interfaceC0980ea.d();
            return;
        }
        f();
        this.h.a.E();
        C1112ga c1112ga = this.t;
        C2002u5 c2002u5 = c1112ga.c;
        C2002u5 c2002u52 = c1112ga.c;
        c2002u5.Y(interfaceC0980ea);
        c2002u5.i = c0512Tq;
        C0512Tq c0512Tq3 = this.h;
        InterfaceC0980ea Q = c2002u52.Q();
        C0512Tq c0512Tq4 = (C0512Tq) c2002u52.i;
        InterfaceC0538Uq interfaceC0538Uq = c0512Tq3.a;
        if (c0512Tq3.f112o) {
            return;
        }
        c0512Tq3.a();
        if (!interfaceC0538Uq.k()) {
            try {
                c0512Tq3.d();
            } catch (Throwable unused) {
            }
        }
        boolean z2 = interfaceC0538Uq.E() > 0.0f;
        if (z2) {
            Q.k();
        }
        Canvas a2 = AbstractC2328z2.a(Q);
        boolean isHardwareAccelerated = a2.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            a2.save();
            long j3 = c0512Tq3.p;
            float f7 = (int) (j3 >> 32);
            float f8 = (int) (j3 & 4294967295L);
            long j4 = c0512Tq3.q;
            float f9 = ((int) (j4 >> 32)) + f7;
            float f10 = f8 + ((int) (j4 & 4294967295L));
            float a3 = interfaceC0538Uq.a();
            int H = interfaceC0538Uq.H();
            if (a3 < 1.0f || H != 3 || interfaceC0538Uq.x() == 1) {
                C1143h2 c1143h22 = c0512Tq3.l;
                if (c1143h22 == null) {
                    c1143h22 = AbstractC0946e20.b();
                    c0512Tq3.l = c1143h22;
                }
                c1143h22.k(a3);
                c1143h22.l(H);
                ((Paint) c1143h22.i).setColorFilter(null);
                a2 = a2;
                f2 = f7;
                a2.saveLayer(f2, f8, f9, f10, (Paint) c1143h22.i);
            } else {
                a2.save();
                a2 = a2;
                f2 = f7;
            }
            a2.translate(f2, f8);
            a2.concat(interfaceC0538Uq.C());
        }
        if (c0512Tq4 != null) {
            C0785bb c0785bb = c0512Tq4.n;
            if (!c0785bb.a) {
                throw new IllegalArgumentException("Only add dependencies during a tracking");
            }
            QD qd = (QD) c0785bb.d;
            if (qd != null) {
                qd.a(c0512Tq3);
            } else if (((C0512Tq) c0785bb.b) != null) {
                int i = WP.a;
                QD qd2 = new QD();
                C0512Tq c0512Tq5 = (C0512Tq) c0785bb.b;
                AbstractC0048Bt.k(c0512Tq5);
                qd2.a(c0512Tq5);
                qd2.a(c0512Tq3);
                c0785bb.d = qd2;
                c0785bb.b = null;
            } else {
                c0785bb.b = c0512Tq3;
            }
            QD qd3 = (QD) c0785bb.e;
            if (qd3 != null) {
                z = !qd3.j(c0512Tq3);
            } else if (((C0512Tq) c0785bb.c) != c0512Tq3) {
                z = true;
            } else {
                c0785bb.c = null;
                z = false;
            }
            if (z) {
                c0512Tq3.m++;
            }
        }
        interfaceC0538Uq.B(Q);
        if (z2) {
            Q.g();
        }
        if (isHardwareAccelerated) {
            return;
        }
        a2.restore();
    }

    @Override // o.YG
    public final void c(long j) {
        if (PX.G(j, this.m)) {
            return;
        }
        this.m = j;
        if (this.q || this.n) {
            return;
        }
        S2 s2 = this.j;
        s2.invalidate();
        if (true != this.q) {
            this.q = true;
            s2.t(this, true);
        }
    }

    @Override // o.YG
    public final void d(LD ld, boolean z) {
        if (!z) {
            AbstractC1473m3.R(i(), ld);
            return;
        }
        float[] i = i();
        float[] fArr = this.p;
        if (fArr == null) {
            fArr = AbstractC1473m3.r();
            this.p = fArr;
        }
        if (!AbstractC1807r8.K(i, fArr)) {
            fArr = null;
        }
        if (fArr != null) {
            AbstractC1473m3.R(fArr, ld);
            return;
        }
        ld.a = 0.0f;
        ld.b = 0.0f;
        ld.c = 0.0f;
        ld.d = 0.0f;
    }

    @Override // o.YG
    public final void destroy() {
        this.k = null;
        this.l = null;
        this.n = true;
        if (this.q) {
            this.q = false;
            this.j.t(this, false);
        }
        InterfaceC0486Sq interfaceC0486Sq = this.i;
        if (interfaceC0486Sq != null) {
            C0512Tq c0512Tq = this.h;
            synchronized (((C0950e6) interfaceC0486Sq).j) {
                if (!c0512Tq.f112o) {
                    c0512Tq.f112o = true;
                    c0512Tq.b();
                }
            }
            this.j.B(this);
        }
    }

    @Override // o.YG
    public final void e(long j) {
        C0512Tq c0512Tq = this.h;
        if (c0512Tq.p != j) {
            c0512Tq.p = j;
            c0512Tq.a.v(c0512Tq.q, (int) (j >> 32), (int) (j & 4294967295L));
        }
        int i = Build.VERSION.SDK_INT;
        S2 s2 = this.j;
        if (i >= 26) {
            W10.a.a(s2);
        } else {
            s2.invalidate();
        }
    }

    @Override // o.YG
    public final void f() {
        if (this.q) {
            if (this.v != AbstractC1700pW.a && !PX.G(this.h.q, this.m)) {
                C0512Tq c0512Tq = this.h;
                long h = PX.h(AbstractC1700pW.a(this.v) * ((int) (this.m >> 32)), AbstractC1700pW.b(this.v) * ((int) (this.m & 4294967295L)));
                if (!BF.a(c0512Tq.r, h)) {
                    c0512Tq.r = h;
                    c0512Tq.a.I(h);
                }
            }
            C0512Tq c0512Tq2 = this.h;
            InterfaceC1119gh interfaceC1119gh = this.r;
            EnumC2057uy enumC2057uy = this.s;
            long j = this.m;
            if (!PX.G(c0512Tq2.q, j)) {
                c0512Tq2.q = j;
                long j2 = c0512Tq2.p;
                c0512Tq2.a.v(j, (int) (j2 >> 32), (int) (4294967295L & j2));
                if (c0512Tq2.i == 9205357640488583168L) {
                    c0512Tq2.g = true;
                    c0512Tq2.a();
                }
            }
            c0512Tq2.b = interfaceC1119gh;
            c0512Tq2.c = enumC2057uy;
            c0512Tq2.d = this.y;
            c0512Tq2.d();
            if (this.q) {
                this.q = false;
                this.j.t(this, false);
            }
        }
    }

    @Override // o.YG
    public final void g(InterfaceC2312yp interfaceC2312yp, InterfaceC1455lp interfaceC1455lp) {
        InterfaceC0486Sq interfaceC0486Sq = this.i;
        if (interfaceC0486Sq == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.h.f112o) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.h = ((C0950e6) interfaceC0486Sq).o();
        this.n = false;
        this.k = interfaceC2312yp;
        this.l = interfaceC1455lp;
        this.v = AbstractC1700pW.a;
        this.m = AbstractC0946e20.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.w = null;
        this.u = 0;
    }

    @Override // o.YG
    public final void h(C1823rO c1823rO) {
        InterfaceC1455lp interfaceC1455lp;
        int i = c1823rO.b | this.u;
        this.s = c1823rO.j;
        this.r = c1823rO.i;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.v = c1823rO.f;
        }
        if ((i & 1) != 0) {
            InterfaceC0538Uq interfaceC0538Uq = this.h.a;
            if (interfaceC0538Uq.n() != 1.0f) {
                interfaceC0538Uq.i();
            }
        }
        if ((i & 2) != 0) {
            InterfaceC0538Uq interfaceC0538Uq2 = this.h.a;
            if (interfaceC0538Uq2.F() != 1.0f) {
                interfaceC0538Uq2.l();
            }
        }
        if ((i & 4) != 0) {
            InterfaceC0538Uq interfaceC0538Uq3 = this.h.a;
            if (interfaceC0538Uq3.a() != 1.0f) {
                interfaceC0538Uq3.e();
            }
        }
        if ((i & 8) != 0) {
            InterfaceC0538Uq interfaceC0538Uq4 = this.h.a;
            if (interfaceC0538Uq4.w() != 0.0f) {
                interfaceC0538Uq4.g();
            }
        }
        if ((i & 16) != 0) {
            InterfaceC0538Uq interfaceC0538Uq5 = this.h.a;
            if (interfaceC0538Uq5.o() != 0.0f) {
                interfaceC0538Uq5.c();
            }
        }
        boolean z = true;
        if ((i & 32) != 0) {
            C0512Tq c0512Tq = this.h;
            InterfaceC0538Uq interfaceC0538Uq6 = c0512Tq.a;
            if (interfaceC0538Uq6.E() != 0.0f) {
                interfaceC0538Uq6.u();
                c0512Tq.g = true;
                c0512Tq.a();
            }
        }
        if ((i & 64) != 0) {
            C0512Tq c0512Tq2 = this.h;
            long j = c1823rO.c;
            InterfaceC0538Uq interfaceC0538Uq7 = c0512Tq2.a;
            if (!C1114gc.b(j, interfaceC0538Uq7.J())) {
                interfaceC0538Uq7.q(j);
            }
        }
        if ((i & 128) != 0) {
            C0512Tq c0512Tq3 = this.h;
            long j2 = c1823rO.d;
            InterfaceC0538Uq interfaceC0538Uq8 = c0512Tq3.a;
            if (!C1114gc.b(j2, interfaceC0538Uq8.p())) {
                interfaceC0538Uq8.A(j2);
            }
        }
        if ((i & 1024) != 0) {
            InterfaceC0538Uq interfaceC0538Uq9 = this.h.a;
            if (interfaceC0538Uq9.G() != 0.0f) {
                interfaceC0538Uq9.h();
            }
        }
        if ((i & 256) != 0) {
            InterfaceC0538Uq interfaceC0538Uq10 = this.h.a;
            if (interfaceC0538Uq10.y() != 0.0f) {
                interfaceC0538Uq10.b();
            }
        }
        if ((i & 512) != 0) {
            InterfaceC0538Uq interfaceC0538Uq11 = this.h.a;
            if (interfaceC0538Uq11.D() != 0.0f) {
                interfaceC0538Uq11.d();
            }
        }
        if ((i & 2048) != 0) {
            C0512Tq c0512Tq4 = this.h;
            float f = c1823rO.e;
            InterfaceC0538Uq interfaceC0538Uq12 = c0512Tq4.a;
            if (interfaceC0538Uq12.s() != f) {
                interfaceC0538Uq12.j(f);
            }
        }
        if (i2 != 0) {
            long j3 = this.v;
            if (j3 == AbstractC1700pW.a) {
                C0512Tq c0512Tq5 = this.h;
                if (!BF.a(c0512Tq5.r, 9205357640488583168L)) {
                    c0512Tq5.r = 9205357640488583168L;
                    c0512Tq5.a.I(9205357640488583168L);
                }
            } else {
                C0512Tq c0512Tq6 = this.h;
                long h = PX.h(AbstractC1700pW.a(j3) * ((int) (this.m >> 32)), AbstractC1700pW.b(this.v) * ((int) (this.m & 4294967295L)));
                if (!BF.a(c0512Tq6.r, h)) {
                    c0512Tq6.r = h;
                    c0512Tq6.a.I(h);
                }
            }
        }
        if ((i & 16384) != 0) {
            this.h.getClass();
        }
        if ((131072 & i) != 0) {
            InterfaceC0538Uq interfaceC0538Uq13 = this.h.a;
        }
        if ((32768 & i) != 0) {
            InterfaceC0538Uq interfaceC0538Uq14 = this.h.a;
            if (interfaceC0538Uq14.x() != 0) {
                interfaceC0538Uq14.z(0);
            }
        }
        if (AbstractC0048Bt.h(this.w, c1823rO.k)) {
            z = false;
        } else {
            RG rg = c1823rO.k;
            this.w = rg;
            if (rg != null) {
                C0512Tq c0512Tq7 = this.h;
                if (rg instanceof PG) {
                    C1032fM c1032fM = ((PG) rg).a;
                    long h2 = PX.h(c1032fM.a, c1032fM.b);
                    long a = AbstractC1035fP.a(c1032fM.c(), c1032fM.b());
                    if (!BF.a(c0512Tq7.h, h2) || c0512Tq7.i != a || c0512Tq7.j != 0.0f || c0512Tq7.k != null) {
                        c0512Tq7.k = null;
                        c0512Tq7.g = true;
                        c0512Tq7.h = h2;
                        c0512Tq7.i = a;
                        c0512Tq7.j = 0.0f;
                        c0512Tq7.a();
                    }
                } else if (rg instanceof OG) {
                    c0512Tq7.getClass();
                    c0512Tq7.i = 9205357640488583168L;
                    c0512Tq7.h = 0L;
                    c0512Tq7.j = 0.0f;
                    c0512Tq7.g = true;
                    c0512Tq7.k = null;
                    c0512Tq7.a();
                } else if (rg instanceof QG) {
                    Object obj = null;
                    obj.getClass();
                    c0512Tq7.getClass();
                    c0512Tq7.i = 9205357640488583168L;
                    c0512Tq7.h = 0L;
                    c0512Tq7.j = 0.0f;
                    c0512Tq7.g = true;
                    c0512Tq7.k = null;
                    c0512Tq7.a();
                }
                if ((rg instanceof OG) && Build.VERSION.SDK_INT < 33 && (interfaceC1455lp = this.l) != null) {
                    interfaceC1455lp.invoke();
                }
            }
        }
        this.u = c1823rO.b;
        if (i != 0 || z) {
            int i3 = Build.VERSION.SDK_INT;
            S2 s2 = this.j;
            if (i3 >= 26) {
                W10.a.a(s2);
            } else {
                s2.invalidate();
            }
        }
    }

    public final float[] i() {
        long j;
        C0512Tq c0512Tq = this.h;
        long j2 = c0512Tq.r;
        InterfaceC0538Uq interfaceC0538Uq = c0512Tq.a;
        if (PX.t0(j2)) {
            long T = AbstractC0946e20.T(this.m);
            if (T == 9205357640488583168L) {
                throw new IllegalStateException("Size is unspecified");
            }
            j = PX.h(Float.intBitsToFloat((int) (T >> 32)) / 2.0f, Float.intBitsToFloat((int) (T & 4294967295L)) / 2.0f);
        } else {
            j = c0512Tq.r;
        }
        float[] fArr = this.f120o;
        AbstractC1473m3.X(fArr);
        float[] r = AbstractC1473m3.r();
        AbstractC1473m3.c0(r, -BF.b(j), -BF.c(j));
        AbstractC1473m3.a0(fArr, r);
        float[] r2 = AbstractC1473m3.r();
        AbstractC1473m3.c0(r2, interfaceC0538Uq.w(), interfaceC0538Uq.o());
        double y = (interfaceC0538Uq.y() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(y);
        float sin = (float) Math.sin(y);
        float f = r2[1];
        float f2 = r2[2];
        float f3 = r2[5];
        float f4 = r2[6];
        float f5 = r2[9];
        float f6 = r2[10];
        float f7 = r2[13];
        float f8 = r2[14];
        r2[1] = (f * cos) - (f2 * sin);
        r2[2] = (f2 * cos) + (f * sin);
        r2[5] = (f3 * cos) - (f4 * sin);
        r2[6] = (f4 * cos) + (f3 * sin);
        r2[9] = (f5 * cos) - (f6 * sin);
        r2[10] = (f6 * cos) + (f5 * sin);
        r2[13] = (f7 * cos) - (f8 * sin);
        r2[14] = (f8 * cos) + (f7 * sin);
        double D = (interfaceC0538Uq.D() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(D);
        float sin2 = (float) Math.sin(D);
        float f9 = r2[0];
        float f10 = r2[2];
        float f11 = r2[4];
        float f12 = r2[6];
        float f13 = r2[8];
        float f14 = r2[10];
        float f15 = (f14 * sin2) + (f13 * cos2);
        float f16 = (f14 * cos2) + ((-f13) * sin2);
        float f17 = r2[12];
        float f18 = r2[14];
        r2[0] = (f10 * sin2) + (f9 * cos2);
        r2[2] = (f10 * cos2) + ((-f9) * sin2);
        r2[4] = (f12 * sin2) + (f11 * cos2);
        r2[6] = (f12 * cos2) + ((-f11) * sin2);
        r2[8] = f15;
        r2[10] = f16;
        r2[12] = (f18 * sin2) + (f17 * cos2);
        r2[14] = (f18 * cos2) + ((-f17) * sin2);
        double G = (interfaceC0538Uq.G() * 3.141592653589793d) / 180.0d;
        float cos3 = (float) Math.cos(G);
        float sin3 = (float) Math.sin(G);
        float f19 = r2[0];
        float f20 = r2[4];
        float f21 = (sin3 * f20) + (cos3 * f19);
        float f22 = -sin3;
        float f23 = (f20 * cos3) + (f19 * f22);
        float f24 = r2[1];
        float f25 = r2[5];
        float f26 = (sin3 * f25) + (cos3 * f24);
        float f27 = (f25 * cos3) + (f24 * f22);
        float f28 = r2[2];
        float f29 = r2[6];
        float f30 = (sin3 * f29) + (cos3 * f28);
        float f31 = r2[3];
        float f32 = r2[7];
        r2[0] = f21;
        r2[1] = f26;
        r2[2] = f30;
        r2[3] = (sin3 * f32) + (cos3 * f31);
        r2[4] = f23;
        r2[5] = f27;
        r2[6] = (f29 * cos3) + (f28 * f22);
        r2[7] = (cos3 * f32) + (f22 * f31);
        float n = interfaceC0538Uq.n();
        float F = interfaceC0538Uq.F();
        r2[0] = r2[0] * n;
        r2[1] = r2[1] * n;
        r2[2] = r2[2] * n;
        r2[3] = r2[3] * n;
        r2[4] = r2[4] * F;
        r2[5] = r2[5] * F;
        r2[6] = r2[6] * F;
        r2[7] = r2[7] * F;
        r2[8] = r2[8] * 1.0f;
        r2[9] = r2[9] * 1.0f;
        r2[10] = r2[10] * 1.0f;
        r2[11] = r2[11] * 1.0f;
        AbstractC1473m3.a0(fArr, r2);
        float[] r3 = AbstractC1473m3.r();
        AbstractC1473m3.c0(r3, BF.b(j), BF.c(j));
        AbstractC1473m3.a0(fArr, r3);
        return fArr;
    }

    @Override // o.YG
    public final void invalidate() {
        if (this.q || this.n) {
            return;
        }
        S2 s2 = this.j;
        s2.invalidate();
        if (true != this.q) {
            this.q = true;
            s2.t(this, true);
        }
    }
}
