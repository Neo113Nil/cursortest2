package o;

/* renamed from: o.Cy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079Cy implements InterfaceC1121gj {
    public final C1112ga b = new C1112ga();
    public InterfaceC1055fj c;

    public final void a() {
        C1112ga c1112ga = this.b;
        InterfaceC0980ea Q = c1112ga.c.Q();
        InterfaceC0725ah interfaceC0725ah = this.c;
        AbstractC0048Bt.k(interfaceC0725ah);
        TC tc = ((TC) interfaceC0725ah).b;
        TC tc2 = tc.f;
        if (tc2 != null && (tc2.d & 4) != 0) {
            while (tc2 != null) {
                int i = tc2.c;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    tc2 = tc2.f;
                }
            }
        }
        tc2 = null;
        if (tc2 == null) {
            ME I = AbstractC0946e20.I(interfaceC0725ah, 4);
            if (I.h0() == tc) {
                I = I.m;
                AbstractC0048Bt.k(I);
            }
            I.u0(Q, (C0512Tq) c1112ga.c.i);
            return;
        }
        while (tc2 != null) {
            if (tc2 instanceof InterfaceC1055fj) {
                InterfaceC1055fj interfaceC1055fj = (InterfaceC1055fj) tc2;
                C0512Tq c0512Tq = (C0512Tq) c1112ga.c.i;
                ME I2 = AbstractC0946e20.I(interfaceC1055fj, 4);
                long T = AbstractC0946e20.T(I2.d);
                C0027Ay c0027Ay = I2.l;
                c0027Ay.getClass();
                ((S2) PX.J0(c0027Ay)).getSharedDrawScope().b(Q, T, I2, interfaceC1055fj, c0512Tq);
            }
            tc2 = null;
        }
    }

    public final void b(InterfaceC0980ea interfaceC0980ea, long j, ME me, InterfaceC1055fj interfaceC1055fj, C0512Tq c0512Tq) {
        InterfaceC1055fj interfaceC1055fj2 = this.c;
        this.c = interfaceC1055fj;
        EnumC2057uy enumC2057uy = me.l.r;
        C1112ga c1112ga = this.b;
        C2002u5 c2002u5 = c1112ga.c;
        C1046fa c1046fa = ((C1112ga) c2002u5.j).b;
        InterfaceC1119gh interfaceC1119gh = c1046fa.a;
        EnumC2057uy enumC2057uy2 = c1046fa.b;
        InterfaceC0980ea Q = c2002u5.Q();
        C2002u5 c2002u52 = c1112ga.c;
        long j2 = ((C1112ga) c2002u52.j).b.d;
        C0512Tq c0512Tq2 = (C0512Tq) c2002u52.i;
        c2002u52.Z(me);
        c2002u52.b0(enumC2057uy);
        c2002u52.Y(interfaceC0980ea);
        c2002u52.c0(j);
        c2002u52.i = c0512Tq;
        interfaceC0980ea.f();
        try {
            interfaceC1055fj.b(this);
            interfaceC0980ea.d();
            c2002u52.Z(interfaceC1119gh);
            c2002u52.b0(enumC2057uy2);
            c2002u52.Y(Q);
            c2002u52.c0(j2);
            c2002u52.i = c0512Tq2;
            this.c = interfaceC1055fj2;
        } catch (Throwable th) {
            interfaceC0980ea.d();
            c2002u52.Z(interfaceC1119gh);
            c2002u52.b0(enumC2057uy2);
            c2002u52.Y(Q);
            c2002u52.c0(j2);
            c2002u52.i = c0512Tq2;
            throw th;
        }
    }

    @Override // o.InterfaceC1119gh
    public final float c() {
        return this.b.c();
    }

    @Override // o.InterfaceC1119gh
    public final float f() {
        return this.b.f();
    }

    @Override // o.InterfaceC1119gh
    public final float i(float f) {
        return this.b.f() * f;
    }

    @Override // o.InterfaceC1121gj
    public final void k(long j, long j2, long j3, AbstractC1807r8 abstractC1807r8) {
        this.b.k(j, j2, j3, abstractC1807r8);
    }

    @Override // o.InterfaceC1121gj
    public final C2002u5 l() {
        return this.b.c;
    }

    @Override // o.InterfaceC1121gj
    public final long m() {
        return this.b.m();
    }

    @Override // o.InterfaceC1119gh
    public final float o(long j) {
        return this.b.o(j);
    }

    @Override // o.InterfaceC1119gh
    public final int p(float f) {
        return this.b.p(f);
    }

    @Override // o.InterfaceC1121gj
    public final void v(long j, float f, float f2, long j2, long j3, AbstractC1807r8 abstractC1807r8) {
        this.b.v(j, f, f2, j2, j3, abstractC1807r8);
    }

    @Override // o.InterfaceC1119gh
    public final long w(long j) {
        return this.b.w(j);
    }

    @Override // o.InterfaceC1119gh
    public final float x(long j) {
        return this.b.x(j);
    }
}
