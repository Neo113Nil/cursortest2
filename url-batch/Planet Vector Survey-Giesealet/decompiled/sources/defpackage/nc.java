package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nc implements oo {
    public final mc d;
    public final t7 e;
    public y4 f;
    public y4 g;

    public nc() {
        tl tlVar = nk.f;
        mc mcVar = new mc();
        mcVar.a = tlVar;
        mcVar.b = c10.d;
        mcVar.c = tp.a;
        mcVar.d = 0L;
        this.d = mcVar;
        this.e = new t7(this);
    }

    public static y4 b(nc ncVar, long j, nz nzVar, int i) {
        y4 e = ncVar.e(nzVar);
        Paint paint = e.a;
        if (!ge.c(d31.c(paint.getColor()), j)) {
            e.e(j);
        }
        if (e.c != null) {
            e.g(null);
        }
        if (!nz.l(e.d, null)) {
            e.f(null);
        }
        if (e.b != i) {
            e.d(i);
        }
        if (paint.isFilterBitmap()) {
            return e;
        }
        paint.setFilterBitmap(true);
        return e;
    }

    @Override // defpackage.oo
    public final long D() {
        return rg0.l(this.e.r());
    }

    @Override // defpackage.oo
    public final void F(e5 e5Var, px0 px0Var, float f, nz nzVar, int i) {
        this.d.c.f(e5Var, d(px0Var, nzVar, f, null, i, 1));
    }

    @Override // defpackage.sl
    public final /* synthetic */ long G(long j) {
        return y6.g(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ float I(long j) {
        return y6.f(j, this);
    }

    @Override // defpackage.oo
    public final void J(px0 px0Var, long j, long j2, long j3, float f, nz nzVar) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.d.c.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), d(px0Var, nzVar, f, null, 3, 1));
    }

    @Override // defpackage.oo
    public final void K(long j, long j2, long j3, float f) {
        kc kcVar = this.d.c;
        y4 y4Var = this.g;
        if (y4Var == null) {
            y4Var = a50.d();
            y4Var.j(1);
            this.g = y4Var;
        }
        Paint paint = y4Var.a;
        if (!ge.c(d31.c(paint.getColor()), j)) {
            y4Var.e(j);
        }
        if (y4Var.c != null) {
            y4Var.g(null);
        }
        if (!nz.l(y4Var.d, null)) {
            y4Var.f(null);
        }
        if (y4Var.b != 3) {
            y4Var.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            paint.setStrokeWidth(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (y4Var.a() != 1) {
            y4Var.h(1);
        }
        if (y4Var.b() != 0) {
            y4Var.i(0);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        kcVar.j(j2, j3, y4Var);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return y6.h(f / a(), this);
    }

    @Override // defpackage.oo
    public final void U(long j, long j2, long j3, long j4, nz nzVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.d.c.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), b(this, j, nzVar, 3));
    }

    @Override // defpackage.sl
    public final float a() {
        return this.d.a.a();
    }

    @Override // defpackage.oo
    public final long c() {
        return this.e.r();
    }

    public final y4 d(px0 px0Var, nz nzVar, float f, q9 q9Var, int i, int i2) {
        y4 e = e(nzVar);
        if (px0Var != null) {
            px0Var.g(f, this.e.r(), e);
        } else {
            Paint paint = e.a;
            if (e.c != null) {
                e.g(null);
            }
            long c = d31.c(paint.getColor());
            long j = ge.b;
            if (!ge.c(c, j)) {
                e.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                e.c(f);
            }
        }
        Paint paint2 = e.a;
        if (!nz.l(e.d, q9Var)) {
            e.f(q9Var);
        }
        if (e.b != i) {
            e.d(i);
        }
        if (paint2.isFilterBitmap() == i2) {
            return e;
        }
        paint2.setFilterBitmap(true ^ (i2 == 0));
        return e;
    }

    public final y4 e(nz nzVar) {
        if (nz.l(nzVar, ar.o)) {
            y4 y4Var = this.f;
            if (y4Var != null) {
                return y4Var;
            }
            y4 d = a50.d();
            d.j(0);
            this.f = d;
            return d;
        }
        if (!(nzVar instanceof ut0)) {
            g8.c();
            return null;
        }
        y4 y4Var2 = this.g;
        if (y4Var2 == null) {
            y4Var2 = a50.d();
            y4Var2.j(1);
            this.g = y4Var2;
        }
        Paint paint = y4Var2.a;
        float strokeWidth = paint.getStrokeWidth();
        ut0 ut0Var = (ut0) nzVar;
        float f = ut0Var.o;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
        }
        int a = y4Var2.a();
        int i = ut0Var.q;
        if (a != i) {
            y4Var2.h(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = ut0Var.p;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int b = y4Var2.b();
        int i2 = ut0Var.r;
        if (b == i2) {
            return y4Var2;
        }
        y4Var2.i(i2);
        return y4Var2;
    }

    @Override // defpackage.oo
    public final c10 getLayoutDirection() {
        return this.d.b;
    }

    @Override // defpackage.sl
    public final float h() {
        return this.d.a.h();
    }

    @Override // defpackage.oo
    public final void k(float f, long j, long j2) {
        this.d.c.b(f, j2, b(this, j, ar.o, 3));
    }

    @Override // defpackage.sl
    public final float o(float f) {
        return a() * f;
    }

    @Override // defpackage.oo
    public final void p(long j, long j2, long j3, nz nzVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.d.c.n(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), b(this, j, nzVar, i));
    }

    @Override // defpackage.oo
    public final t7 r() {
        return this.e;
    }

    @Override // defpackage.sl
    public final /* synthetic */ float t(long j) {
        return y6.e(j, this);
    }

    @Override // defpackage.oo
    public final void w(mi0 mi0Var, float f, long j, nz nzVar) {
        this.d.c.b(f, j, d(mi0Var, nzVar, 1.0f, null, 3, 1));
    }

    @Override // defpackage.oo
    public final void x(x4 x4Var, long j, long j2, long j3, float f, q9 q9Var, int i) {
        this.d.c.c(x4Var, j, j2, j3, d(null, ar.o, f, q9Var, 3, i));
    }

    @Override // defpackage.sl
    public final /* synthetic */ int y(float f) {
        return y6.c(f, this);
    }
}
