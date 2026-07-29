package o;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.br, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801br implements InterfaceC0538Uq {
    public static final C0735ar u = new C0735ar();
    public final AbstractC0989ej b;
    public final C1178ha c;
    public final OZ d;
    public final Resources e;
    public final Rect f;
    public int g;
    public int h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public float f142o;
    public boolean p;
    public float q;
    public float r;
    public long s;
    public long t;

    public C0801br(AbstractC0989ej abstractC0989ej) {
        C1178ha c1178ha = new C1178ha();
        C1112ga c1112ga = new C1112ga();
        this.b = abstractC0989ej;
        this.c = c1178ha;
        OZ oz = new OZ(abstractC0989ej, c1178ha, c1112ga);
        this.d = oz;
        this.e = abstractC0989ej.getResources();
        this.f = new Rect();
        abstractC0989ej.addView(oz);
        oz.setClipBounds(null);
        this.i = 0L;
        View.generateViewId();
        this.m = 3;
        this.n = 0;
        this.f142o = 1.0f;
        this.q = 1.0f;
        this.r = 1.0f;
        long j = C1114gc.b;
        this.s = j;
        this.t = j;
    }

    @Override // o.InterfaceC0538Uq
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            this.d.setOutlineSpotShadowColor(AbstractC0022At.L(j));
        }
    }

    @Override // o.InterfaceC0538Uq
    public final void B(InterfaceC0980ea interfaceC0980ea) {
        Rect rect;
        boolean z = this.j;
        OZ oz = this.d;
        if (z) {
            if ((this.l || oz.getClipToOutline()) && !this.k) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = oz.getWidth();
                rect.bottom = oz.getHeight();
            } else {
                rect = null;
            }
            oz.setClipBounds(rect);
        }
        if (AbstractC2328z2.a(interfaceC0980ea).isHardwareAccelerated()) {
            this.b.a(interfaceC0980ea, oz, oz.getDrawingTime());
        }
    }

    @Override // o.InterfaceC0538Uq
    public final Matrix C() {
        return this.d.getMatrix();
    }

    @Override // o.InterfaceC0538Uq
    public final float D() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final float E() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final float F() {
        return this.r;
    }

    @Override // o.InterfaceC0538Uq
    public final float G() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final int H() {
        return this.m;
    }

    @Override // o.InterfaceC0538Uq
    public final void I(long j) {
        boolean t0 = PX.t0(j);
        OZ oz = this.d;
        if (!t0) {
            this.p = false;
            oz.setPivotX(BF.b(j));
            oz.setPivotY(BF.c(j));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                oz.resetPivot();
                return;
            }
            this.p = true;
            oz.setPivotX(((int) (this.i >> 32)) / 2.0f);
            oz.setPivotY(((int) (this.i & 4294967295L)) / 2.0f);
        }
    }

    @Override // o.InterfaceC0538Uq
    public final long J() {
        return this.s;
    }

    @Override // o.InterfaceC0538Uq
    public final float a() {
        return this.f142o;
    }

    @Override // o.InterfaceC0538Uq
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void c() {
        this.d.setTranslationY(0.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void d() {
        this.d.setRotationY(0.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void e() {
        this.f142o = 1.0f;
        this.d.setAlpha(1.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void f() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // o.InterfaceC0538Uq
    public final void g() {
        this.d.setTranslationX(0.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void h() {
        this.d.setRotation(0.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void i() {
        this.q = 1.0f;
        this.d.setScaleX(1.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void j(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // o.InterfaceC0538Uq
    public final void l() {
        this.r = 1.0f;
        this.d.setScaleY(1.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void m(InterfaceC1119gh interfaceC1119gh, EnumC2057uy enumC2057uy, C0512Tq c0512Tq, C1400l c1400l) {
        OZ oz = this.d;
        ViewParent parent = oz.getParent();
        AbstractC0989ej abstractC0989ej = this.b;
        if (parent == null) {
            abstractC0989ej.addView(oz);
        }
        oz.n = interfaceC1119gh;
        oz.f77o = enumC2057uy;
        oz.p = c1400l;
        oz.q = c0512Tq;
        if (oz.isAttachedToWindow()) {
            oz.setVisibility(4);
            oz.setVisibility(0);
            try {
                C1178ha c1178ha = this.c;
                C0735ar c0735ar = u;
                C2262y2 c2262y2 = c1178ha.a;
                Canvas canvas = c2262y2.a;
                c2262y2.a = c0735ar;
                abstractC0989ej.a(c2262y2, oz, oz.getDrawingTime());
                c1178ha.a.a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // o.InterfaceC0538Uq
    public final float n() {
        return this.q;
    }

    @Override // o.InterfaceC0538Uq
    public final float o() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final long p() {
        return this.t;
    }

    @Override // o.InterfaceC0538Uq
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.s = j;
            this.d.setOutlineAmbientShadowColor(AbstractC0022At.L(j));
        }
    }

    @Override // o.InterfaceC0538Uq
    public final void r(Outline outline, long j) {
        OZ oz = this.d;
        oz.l = outline;
        oz.invalidateOutline();
        if ((this.l || oz.getClipToOutline()) && outline != null) {
            oz.setClipToOutline(true);
            if (this.l) {
                this.l = false;
                this.j = true;
            }
        }
        this.k = outline != null;
    }

    @Override // o.InterfaceC0538Uq
    public final float s() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // o.InterfaceC0538Uq
    public final void t() {
        this.l = false;
        this.j = true;
        this.d.setClipToOutline(false);
    }

    @Override // o.InterfaceC0538Uq
    public final void u() {
        this.d.setElevation(0.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void v(long j, int i, int i2) {
        boolean G = PX.G(this.i, j);
        OZ oz = this.d;
        if (G) {
            int i3 = this.g;
            if (i3 != i) {
                oz.offsetLeftAndRight(i - i3);
            }
            int i4 = this.h;
            if (i4 != i2) {
                oz.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.l || oz.getClipToOutline()) {
                this.j = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            oz.layout(i, i2, i + i5, i2 + i6);
            this.i = j;
            if (this.p) {
                oz.setPivotX(i5 / 2.0f);
                oz.setPivotY(i6 / 2.0f);
            }
        }
        this.g = i;
        this.h = i2;
    }

    @Override // o.InterfaceC0538Uq
    public final float w() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final int x() {
        return this.n;
    }

    @Override // o.InterfaceC0538Uq
    public final float y() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final void z(int i) {
        this.n = i;
        OZ oz = this.d;
        boolean z = true;
        if (i == 1 || this.m != 3) {
            oz.setLayerType(2, null);
            oz.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i == 1) {
            oz.setLayerType(2, null);
        } else if (i == 2) {
            oz.setLayerType(0, null);
            z = false;
        } else {
            oz.setLayerType(0, null);
        }
        oz.setCanUseCompositingLayer$ui_graphics_release(z);
    }
}
