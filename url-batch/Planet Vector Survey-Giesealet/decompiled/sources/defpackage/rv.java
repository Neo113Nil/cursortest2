package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rv implements ov {
    public static final AtomicBoolean w = new AtomicBoolean(true);
    public final oc b;
    public final nc c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;

    public rv(f3 f3Var, oc ocVar, nc ncVar) {
        this.b = ocVar;
        this.c = ncVar;
        RenderNode create = RenderNode.create("Compose", f3Var);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (w.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                kk0.c(create, kk0.a(create));
                kk0.d(create, kk0.b(create));
            }
            if (i >= 24) {
                jk0.a(create);
            } else {
                ik0.a(create);
            }
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        O(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = ge.b;
        this.q = j;
        this.r = j;
        this.s = 8.0f;
    }

    @Override // defpackage.ov
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            kk0.d(this.d, d31.I(j));
        }
    }

    @Override // defpackage.ov
    public final void B(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.ov
    public final Matrix C() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.ov
    public final void D(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (iz.a(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.ov
    public final float E() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final void F(float f) {
        this.s = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.ov
    public final float G() {
        return this.p;
    }

    @Override // defpackage.ov
    public final boolean H() {
        return this.d.isValid();
    }

    @Override // defpackage.ov
    public final float I() {
        return this.o;
    }

    @Override // defpackage.ov
    public final float J() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final int K() {
        return this.k;
    }

    @Override // defpackage.ov
    public final void L(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.ov
    public final long M() {
        return this.q;
    }

    public final void N() {
        boolean z = this.t;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.u) {
            this.u = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.v) {
            this.v = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void O(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            O(i);
        } else {
            O(1);
        }
    }

    @Override // defpackage.ov
    public final float a() {
        return this.l;
    }

    @Override // defpackage.ov
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.ov
    public final void c(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.ov
    public final float d() {
        return this.n;
    }

    @Override // defpackage.ov
    public final void e(float f) {
        this.p = f;
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
        return this.r;
    }

    @Override // defpackage.ov
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            kk0.c(this.d, d31.I(j));
        }
    }

    @Override // defpackage.ov
    public final void k(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        N();
    }

    @Override // defpackage.ov
    public final void l() {
        P();
    }

    @Override // defpackage.ov
    public final void m(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.ov
    public final void n(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(x40.T(i)));
        P();
    }

    @Override // defpackage.ov
    public final float o() {
        return this.s;
    }

    @Override // defpackage.ov
    public final void p() {
        int i = Build.VERSION.SDK_INT;
        RenderNode renderNode = this.d;
        if (i >= 24) {
            jk0.a(renderNode);
        } else {
            ik0.a(renderNode);
        }
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
        Canvas canvas = p2.a;
        DisplayListCanvas displayListCanvas = ((o2) kcVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.ov
    public final void t(boolean z) {
        this.t = z;
        N();
    }

    @Override // defpackage.ov
    public final int u() {
        return this.j;
    }

    @Override // defpackage.ov
    public final float v() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final void w(sl slVar, c10 c10Var, nv nvVar, f2 f2Var) {
        Canvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (4294967295L & this.i)));
        try {
            o2 o2Var = this.b.a;
            Canvas canvas = o2Var.a;
            o2Var.a = start;
            nc ncVar = this.c;
            t7 t7Var = ncVar.e;
            long W = px0.W(this.e);
            mc mcVar = ((nc) t7Var.g).d;
            sl slVar2 = mcVar.a;
            c10 c10Var2 = mcVar.b;
            kc p = t7Var.p();
            long r = t7Var.r();
            nv nvVar2 = (nv) t7Var.f;
            t7Var.z(slVar);
            t7Var.A(c10Var);
            t7Var.y(o2Var);
            t7Var.B(W);
            t7Var.f = nvVar;
            o2Var.i();
            try {
                f2Var.c(ncVar);
                o2Var.g();
                t7Var.z(slVar2);
                t7Var.A(c10Var2);
                t7Var.y(p);
                t7Var.B(r);
                t7Var.f = nvVar2;
                o2Var.a = canvas;
            } catch (Throwable th) {
                o2Var.g();
                t7 t7Var2 = ncVar.e;
                t7Var2.z(slVar2);
                t7Var2.A(c10Var2);
                t7Var2.y(p);
                t7Var2.B(r);
                t7Var2.f = nvVar2;
                throw th;
            }
        } finally {
            this.d.end(start);
        }
    }

    @Override // defpackage.ov
    public final q9 x() {
        return null;
    }

    @Override // defpackage.ov
    public final void y(int i) {
        this.j = i;
        P();
    }

    @Override // defpackage.ov
    public final void z() {
        this.d.setRotation(0.0f);
    }
}
