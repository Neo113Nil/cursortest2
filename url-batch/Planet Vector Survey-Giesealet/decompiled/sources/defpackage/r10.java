package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class r10 implements oo {
    public final nc d = new nc();
    public no e;

    @Override // defpackage.oo
    public final long D() {
        return this.d.D();
    }

    @Override // defpackage.oo
    public final void F(e5 e5Var, px0 px0Var, float f, nz nzVar, int i) {
        this.d.F(e5Var, px0Var, f, nzVar, i);
    }

    @Override // defpackage.sl
    public final long G(long j) {
        nc ncVar = this.d;
        ncVar.getClass();
        return y6.g(j, ncVar);
    }

    @Override // defpackage.sl
    public final float I(long j) {
        nc ncVar = this.d;
        ncVar.getClass();
        return y6.f(j, ncVar);
    }

    @Override // defpackage.oo
    public final void J(px0 px0Var, long j, long j2, long j3, float f, nz nzVar) {
        this.d.J(px0Var, j, j2, j3, f, nzVar);
    }

    @Override // defpackage.oo
    public final void K(long j, long j2, long j3, float f) {
        this.d.K(j, j2, j3, f);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return this.d.P(f);
    }

    @Override // defpackage.oo
    public final void U(long j, long j2, long j3, long j4, nz nzVar) {
        this.d.U(j, j2, j3, j4, nzVar);
    }

    @Override // defpackage.sl
    public final float a() {
        return this.d.a();
    }

    public final void b() {
        nc ncVar = this.d;
        kc p = ncVar.e.p();
        nl nlVar = this.e;
        if (nlVar == null) {
            throw y6.u("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        t50 t50Var = (t50) nlVar;
        t50 t50Var2 = t50Var.d.i;
        if (t50Var2 != null && (t50Var2.g & 4) != 0) {
            while (t50Var2 != null) {
                int i = t50Var2.f;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    t50Var2 = t50Var2.i;
                }
            }
        }
        t50Var2 = null;
        if (t50Var2 == null) {
            ea0 Y = nz.Y(nlVar, 4);
            if (Y.v0() == t50Var.d) {
                Y = Y.s;
                Y.getClass();
            }
            Y.L0(p, (nv) ncVar.e.f);
            return;
        }
        l70 l70Var = null;
        while (t50Var2 != null) {
            if (t50Var2 instanceof no) {
                no noVar = (no) t50Var2;
                nv nvVar = (nv) ncVar.e.f;
                ea0 Y2 = nz.Y(noVar, 4);
                long W = px0.W(Y2.f);
                p10 p10Var = Y2.r;
                p10Var.getClass();
                ((f3) mz.Q(p10Var)).getSharedDrawScope().d(p, W, Y2, noVar, nvVar);
            } else if ((t50Var2.f & 4) != 0 && (t50Var2 instanceof ol)) {
                int i2 = 0;
                for (t50 t50Var3 = ((ol) t50Var2).s; t50Var3 != null; t50Var3 = t50Var3.i) {
                    if ((t50Var3.f & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
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
                if (i2 == 1) {
                }
            }
            t50Var2 = nz.j(l70Var);
        }
    }

    @Override // defpackage.oo
    public final long c() {
        return this.d.e.r();
    }

    public final void d(kc kcVar, long j, ea0 ea0Var, no noVar, nv nvVar) {
        no noVar2 = this.e;
        this.e = noVar;
        c10 c10Var = ea0Var.r.z;
        nc ncVar = this.d;
        t7 t7Var = ncVar.e;
        mc mcVar = ((nc) t7Var.g).d;
        sl slVar = mcVar.a;
        c10 c10Var2 = mcVar.b;
        kc p = t7Var.p();
        t7 t7Var2 = ncVar.e;
        long r = t7Var2.r();
        nv nvVar2 = (nv) t7Var2.f;
        t7Var2.z(ea0Var);
        t7Var2.A(c10Var);
        t7Var2.y(kcVar);
        t7Var2.B(j);
        t7Var2.f = nvVar;
        kcVar.i();
        try {
            noVar.b(this);
            kcVar.g();
            t7Var2.z(slVar);
            t7Var2.A(c10Var2);
            t7Var2.y(p);
            t7Var2.B(r);
            t7Var2.f = nvVar2;
            this.e = noVar2;
        } catch (Throwable th) {
            kcVar.g();
            t7Var2.z(slVar);
            t7Var2.A(c10Var2);
            t7Var2.y(p);
            t7Var2.B(r);
            t7Var2.f = nvVar2;
            throw th;
        }
    }

    public final void e(e5 e5Var, long j, nz nzVar) {
        nc ncVar = this.d;
        ncVar.d.c.f(e5Var, nc.b(ncVar, j, nzVar, 3));
    }

    public final void f(px0 px0Var, long j, long j2, float f, nz nzVar) {
        nc ncVar = this.d;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ncVar.d.c.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), ncVar.d(px0Var, nzVar, f, null, 3, 1));
    }

    @Override // defpackage.oo
    public final c10 getLayoutDirection() {
        return this.d.d.b;
    }

    @Override // defpackage.sl
    public final float h() {
        return this.d.h();
    }

    @Override // defpackage.oo
    public final void k(float f, long j, long j2) {
        this.d.k(f, j, j2);
    }

    @Override // defpackage.sl
    public final float o(float f) {
        return this.d.a() * f;
    }

    @Override // defpackage.oo
    public final void p(long j, long j2, long j3, nz nzVar, int i) {
        this.d.p(j, j2, j3, nzVar, i);
    }

    @Override // defpackage.oo
    public final t7 r() {
        return this.d.e;
    }

    @Override // defpackage.sl
    public final float t(long j) {
        nc ncVar = this.d;
        ncVar.getClass();
        return y6.e(j, ncVar);
    }

    @Override // defpackage.oo
    public final void w(mi0 mi0Var, float f, long j, nz nzVar) {
        this.d.w(mi0Var, f, j, nzVar);
    }

    @Override // defpackage.oo
    public final void x(x4 x4Var, long j, long j2, long j3, float f, q9 q9Var, int i) {
        this.d.x(x4Var, j, j2, j3, f, q9Var, i);
    }

    @Override // defpackage.sl
    public final int y(float f) {
        nc ncVar = this.d;
        ncVar.getClass();
        return y6.c(f, ncVar);
    }
}
