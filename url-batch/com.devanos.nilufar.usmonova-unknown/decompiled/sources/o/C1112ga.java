package o;

import android.graphics.Paint;

/* renamed from: o.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1112ga implements InterfaceC1121gj {
    public final C1046fa b;
    public final C2002u5 c;
    public C1143h2 d;
    public C1143h2 e;

    public C1112ga() {
        C1185hh c1185hh = EB.g;
        C1056fk c1056fk = new C1056fk();
        C1046fa c1046fa = new C1046fa();
        c1046fa.a = c1185hh;
        c1046fa.b = EnumC2057uy.h;
        c1046fa.c = c1056fk;
        c1046fa.d = 0L;
        this.b = c1046fa;
        this.c = new C2002u5(this);
    }

    public static C1143h2 a(C1112ga c1112ga, long j, AbstractC1807r8 abstractC1807r8) {
        C1143h2 c1143h2;
        int i = 0;
        if (AbstractC0048Bt.h(abstractC1807r8, C0559Vl.i)) {
            c1143h2 = c1112ga.d;
            if (c1143h2 == null) {
                c1143h2 = AbstractC0946e20.b();
                c1143h2.m(0);
                c1112ga.d = c1143h2;
            }
        } else {
            if (!(abstractC1807r8 instanceof C0843cU)) {
                throw new C0057Cc();
            }
            C1143h2 c1143h22 = c1112ga.e;
            if (c1143h22 == null) {
                c1143h22 = AbstractC0946e20.b();
                c1143h22.m(1);
                c1112ga.e = c1143h22;
            }
            Paint paint = (Paint) c1143h22.i;
            float strokeWidth = paint.getStrokeWidth();
            C0843cU c0843cU = (C0843cU) abstractC1807r8;
            float f = c0843cU.i;
            if (strokeWidth != f) {
                ((Paint) c1143h22.i).setStrokeWidth(f);
            }
            Paint.Cap strokeCap = paint.getStrokeCap();
            int i2 = strokeCap == null ? -1 : D3.a[strokeCap.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 1;
                } else if (i2 == 3) {
                    i = 2;
                }
            }
            int i3 = c0843cU.j;
            if (i != i3) {
                paint.setStrokeCap(i3 == 2 ? Paint.Cap.SQUARE : i3 == 1 ? Paint.Cap.ROUND : i3 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
            }
            if (paint.getStrokeMiter() != 4.0f) {
                paint.setStrokeMiter(4.0f);
            }
            Paint.Join strokeJoin = paint.getStrokeJoin();
            int i4 = strokeJoin != null ? D3.b[strokeJoin.ordinal()] : -1;
            if (i4 != 1 && (i4 == 2 || i4 == 3)) {
                paint.setStrokeJoin(Paint.Join.MITER);
            }
            c1143h2 = c1143h22;
        }
        if (!C1114gc.b(AbstractC0022At.b(((Paint) c1143h2.i).getColor()), j)) {
            ((Paint) c1143h2.i).setColor(AbstractC0022At.L(j));
        }
        if (c1143h2.h != 3) {
            c1143h2.l(3);
        }
        if (((Paint) c1143h2.i).isFilterBitmap()) {
            return c1143h2;
        }
        ((Paint) c1143h2.i).setFilterBitmap(true);
        return c1143h2;
    }

    @Override // o.InterfaceC1119gh
    public final float c() {
        return this.b.a.c();
    }

    @Override // o.InterfaceC1119gh
    public final float f() {
        return this.b.a.f();
    }

    @Override // o.InterfaceC1121gj
    public final void k(long j, long j2, long j3, AbstractC1807r8 abstractC1807r8) {
        this.b.c.h(BF.b(j2), BF.c(j2), ZR.b(j3) + BF.b(j2), ZR.a(j3) + BF.c(j2), a(this, j, abstractC1807r8));
    }

    @Override // o.InterfaceC1121gj
    public final C2002u5 l() {
        return this.c;
    }

    @Override // o.InterfaceC1121gj
    public final void v(long j, float f, float f2, long j2, long j3, AbstractC1807r8 abstractC1807r8) {
        this.b.c.a(BF.b(j2), BF.c(j2), ZR.b(j3) + BF.b(j2), ZR.a(j3) + BF.c(j2), f, f2, a(this, j, abstractC1807r8));
    }
}
