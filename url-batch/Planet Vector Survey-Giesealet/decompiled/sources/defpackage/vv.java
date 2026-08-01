package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vv implements ov {
    public static final uv w = new uv();
    public final ko b;
    public final oc c;
    public final i01 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;

    public vv(ko koVar) {
        oc ocVar = new oc();
        nc ncVar = new nc();
        this.b = koVar;
        this.c = ocVar;
        i01 i01Var = new i01(koVar, ocVar, ncVar);
        this.d = i01Var;
        this.e = koVar.getResources();
        this.f = new Rect();
        koVar.addView(i01Var);
        i01Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = ge.b;
        this.u = j;
        this.v = j;
    }

    @Override // defpackage.ov
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            this.d.setOutlineSpotShadowColor(d31.I(j));
        }
    }

    @Override // defpackage.ov
    public final void B(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.ov
    public final Matrix C() {
        return this.d.getMatrix();
    }

    @Override // defpackage.ov
    public final void D(int i, int i2, long j) {
        boolean a = iz.a(this.j, j);
        i01 i01Var = this.d;
        if (a) {
            int i3 = this.h;
            if (i3 != i) {
                i01Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                i01Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || i01Var.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            i01Var.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                i01Var.setPivotX(i5 / 2.0f);
                i01Var.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.ov
    public final float E() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final void F(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.ov
    public final float G() {
        return this.t;
    }

    @Override // defpackage.ov
    public final /* synthetic */ boolean H() {
        return true;
    }

    @Override // defpackage.ov
    public final float I() {
        return this.s;
    }

    @Override // defpackage.ov
    public final float J() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final int K() {
        return this.n;
    }

    @Override // defpackage.ov
    public final void L(long j) {
        long j2 = 9223372034707292159L & j;
        i01 i01Var = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            i01Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            i01Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                i01Var.resetPivot();
                return;
            }
            this.q = true;
            i01Var.setPivotX(((int) (this.j >> 32)) / 2.0f);
            i01Var.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.ov
    public final long M() {
        return this.u;
    }

    public final void N(int i) {
        i01 i01Var = this.d;
        boolean z = true;
        if (i == 1) {
            i01Var.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                i01Var.setLayerType(0, paint);
                z = false;
            } else {
                i01Var.setLayerType(0, paint);
            }
        }
        i01Var.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    public final void O() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            N(i);
        } else {
            N(1);
        }
    }

    @Override // defpackage.ov
    public final float a() {
        return this.p;
    }

    @Override // defpackage.ov
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.ov
    public final void c(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.ov
    public final float d() {
        return this.r;
    }

    @Override // defpackage.ov
    public final void e(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.ov
    public final float f() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final void g() {
        this.d.setTranslationY(0.0f);
    }

    @Override // defpackage.ov
    public final void h() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.ov
    public final long i() {
        return this.v;
    }

    @Override // defpackage.ov
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            this.d.setOutlineAmbientShadowColor(d31.I(j));
        }
    }

    @Override // defpackage.ov
    public final void k(Outline outline, long j) {
        i01 i01Var = this.d;
        i01Var.h = outline;
        i01Var.invalidateOutline();
        if ((this.m || i01Var.getClipToOutline()) && outline != null) {
            i01Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.ov
    public final void l() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // defpackage.ov
    public final void m(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.ov
    public final void n(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(x40.T(i)));
        O();
    }

    @Override // defpackage.ov
    public final float o() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.ov
    public final void p() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.ov
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final void r() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.ov
    public final void s(kc kcVar) {
        Rect rect;
        boolean z = this.k;
        i01 i01Var = this.d;
        if (z) {
            if ((this.m || i01Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = i01Var.getWidth();
                rect.bottom = i01Var.getHeight();
            } else {
                rect = null;
            }
            i01Var.setClipBounds(rect);
        }
        Canvas canvas = p2.a;
        if (((o2) kcVar).a.isHardwareAccelerated()) {
            this.b.a(kcVar, i01Var, i01Var.getDrawingTime());
        }
    }

    @Override // defpackage.ov
    public final void t(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.ov
    public final int u() {
        return this.o;
    }

    @Override // defpackage.ov
    public final float v() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final void w(sl slVar, c10 c10Var, nv nvVar, f2 f2Var) {
        i01 i01Var = this.d;
        ViewParent parent = i01Var.getParent();
        ko koVar = this.b;
        if (parent == null) {
            koVar.addView(i01Var);
        }
        i01Var.j = slVar;
        i01Var.k = c10Var;
        i01Var.l = f2Var;
        i01Var.m = nvVar;
        if (i01Var.isAttachedToWindow()) {
            i01Var.setVisibility(4);
            i01Var.setVisibility(0);
            try {
                oc ocVar = this.c;
                uv uvVar = w;
                o2 o2Var = ocVar.a;
                Canvas canvas = o2Var.a;
                o2Var.a = uvVar;
                koVar.a(o2Var, i01Var, i01Var.getDrawingTime());
                ocVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.ov
    public final q9 x() {
        return null;
    }

    @Override // defpackage.ov
    public final void y(int i) {
        this.o = i;
        O();
    }

    @Override // defpackage.ov
    public final void z() {
        this.d.setRotation(0.0f);
    }
}
