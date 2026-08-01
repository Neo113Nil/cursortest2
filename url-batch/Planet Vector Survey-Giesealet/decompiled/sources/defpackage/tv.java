package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tv implements ov {
    public final oc b;
    public final nc c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;

    public tv() {
        oc ocVar = new oc();
        nc ncVar = new nc();
        this.b = ocVar;
        this.c = ncVar;
        RenderNode c = sv.c();
        this.d = c;
        this.e = 0L;
        c.setClipToBounds(false);
        O(c, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = ge.b;
        this.n = j;
        this.o = j;
        this.p = 8.0f;
        this.t = 0;
    }

    @Override // defpackage.ov
    public final void A(long j) {
        this.o = j;
        this.d.setSpotShadowColor(d31.I(j));
    }

    @Override // defpackage.ov
    public final void B(float f) {
        this.l = f;
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
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = px0.W(j);
    }

    @Override // defpackage.ov
    public final float E() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final void F(float f) {
        this.p = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.ov
    public final float G() {
        return this.m;
    }

    @Override // defpackage.ov
    public final boolean H() {
        boolean hasDisplayList;
        hasDisplayList = this.d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.ov
    public final float I() {
        return this.l;
    }

    @Override // defpackage.ov
    public final float J() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final int K() {
        return this.j;
    }

    @Override // defpackage.ov
    public final void L(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.ov
    public final long M() {
        return this.n;
    }

    public final void N() {
        boolean z = this.q;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.r) {
            this.r = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.s) {
            this.s = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void O(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.t;
        if (i != 1 && this.j == 3) {
            O(this.d, i);
        } else {
            O(this.d, 1);
        }
    }

    @Override // defpackage.ov
    public final float a() {
        return this.i;
    }

    @Override // defpackage.ov
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.ov
    public final void c(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.ov
    public final float d() {
        return this.k;
    }

    @Override // defpackage.ov
    public final void e(float f) {
        this.m = f;
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
        return this.o;
    }

    @Override // defpackage.ov
    public final void j(long j) {
        this.n = j;
        this.d.setAmbientShadowColor(d31.I(j));
    }

    @Override // defpackage.ov
    public final void k(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        N();
    }

    @Override // defpackage.ov
    public final void l() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // defpackage.ov
    public final void m(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.ov
    public final void n(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(x40.O(i));
        P();
    }

    @Override // defpackage.ov
    public final float o() {
        return this.p;
    }

    @Override // defpackage.ov
    public final void p() {
        this.d.discardDisplayList();
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
        ((o2) kcVar).a.drawRenderNode(this.d);
    }

    @Override // defpackage.ov
    public final void t(boolean z) {
        this.q = z;
        N();
    }

    @Override // defpackage.ov
    public final int u() {
        return this.t;
    }

    @Override // defpackage.ov
    public final float v() {
        return 0.0f;
    }

    @Override // defpackage.ov
    public final void w(sl slVar, c10 c10Var, nv nvVar, f2 f2Var) {
        RecordingCanvas beginRecording;
        nc ncVar = this.c;
        beginRecording = this.d.beginRecording();
        try {
            oc ocVar = this.b;
            o2 o2Var = ocVar.a;
            Canvas canvas = o2Var.a;
            o2Var.a = beginRecording;
            t7 t7Var = ncVar.e;
            t7Var.z(slVar);
            t7Var.A(c10Var);
            t7Var.f = nvVar;
            t7Var.B(this.e);
            t7Var.y(o2Var);
            f2Var.c(ncVar);
            ocVar.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.ov
    public final q9 x() {
        return null;
    }

    @Override // defpackage.ov
    public final void y(int i) {
        this.t = i;
        P();
    }

    @Override // defpackage.ov
    public final void z() {
        this.d.setRotationZ(0.0f);
    }
}
