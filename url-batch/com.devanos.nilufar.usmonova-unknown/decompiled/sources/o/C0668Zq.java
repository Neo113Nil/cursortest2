package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* renamed from: o.Zq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668Zq implements InterfaceC0538Uq {
    public final C1178ha b;
    public final C1112ga c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public float g;
    public final int h;
    public float i;
    public float j;
    public long k;
    public long l;
    public float m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f137o;
    public int p;

    public C0668Zq() {
        C1178ha c1178ha = new C1178ha();
        C1112ga c1112ga = new C1112ga();
        this.b = c1178ha;
        this.c = c1112ga;
        RenderNode d = AbstractC0642Yq.d();
        this.d = d;
        this.e = 0L;
        d.setClipToBounds(false);
        L(d, 0);
        this.g = 1.0f;
        this.h = 3;
        this.i = 1.0f;
        this.j = 1.0f;
        long j = C1114gc.b;
        this.k = j;
        this.l = j;
        this.m = 8.0f;
        this.p = 0;
    }

    public static void L(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // o.InterfaceC0538Uq
    public final void A(long j) {
        this.l = j;
        this.d.setSpotShadowColor(AbstractC0022At.L(j));
    }

    @Override // o.InterfaceC0538Uq
    public final void B(InterfaceC0980ea interfaceC0980ea) {
        AbstractC2328z2.a(interfaceC0980ea).drawRenderNode(this.d);
    }

    @Override // o.InterfaceC0538Uq
    public final Matrix C() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
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
        return this.j;
    }

    @Override // o.InterfaceC0538Uq
    public final float G() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final int H() {
        return this.h;
    }

    @Override // o.InterfaceC0538Uq
    public final void I(long j) {
        if (PX.t0(j)) {
            this.d.resetPivot();
        } else {
            this.d.setPivotX(BF.b(j));
            this.d.setPivotY(BF.c(j));
        }
    }

    @Override // o.InterfaceC0538Uq
    public final long J() {
        return this.k;
    }

    public final void K() {
        if (this.n) {
            this.n = false;
            this.d.setClipToBounds(false);
        }
        if (this.f137o) {
            this.f137o = false;
            this.d.setClipToOutline(false);
        }
    }

    @Override // o.InterfaceC0538Uq
    public final float a() {
        return this.g;
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
        this.g = 1.0f;
        this.d.setAlpha(1.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void f() {
        this.d.discardDisplayList();
    }

    @Override // o.InterfaceC0538Uq
    public final void g() {
        this.d.setTranslationX(0.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void h() {
        this.d.setRotationZ(0.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void i() {
        this.i = 1.0f;
        this.d.setScaleX(1.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void j(float f) {
        this.m = f;
        this.d.setCameraDistance(f);
    }

    @Override // o.InterfaceC0538Uq
    public final boolean k() {
        boolean hasDisplayList;
        hasDisplayList = this.d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // o.InterfaceC0538Uq
    public final void l() {
        this.j = 1.0f;
        this.d.setScaleY(1.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void m(InterfaceC1119gh interfaceC1119gh, EnumC2057uy enumC2057uy, C0512Tq c0512Tq, C1400l c1400l) {
        RecordingCanvas beginRecording;
        C1112ga c1112ga = this.c;
        beginRecording = this.d.beginRecording();
        try {
            C1178ha c1178ha = this.b;
            C2262y2 c2262y2 = c1178ha.a;
            Canvas canvas = c2262y2.a;
            c2262y2.a = beginRecording;
            C2002u5 c2002u5 = c1112ga.c;
            c2002u5.Z(interfaceC1119gh);
            c2002u5.b0(enumC2057uy);
            c2002u5.i = c0512Tq;
            c2002u5.c0(this.e);
            c2002u5.Y(c2262y2);
            c1400l.invoke(c1112ga);
            c1178ha.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // o.InterfaceC0538Uq
    public final float n() {
        return this.i;
    }

    @Override // o.InterfaceC0538Uq
    public final float o() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final long p() {
        return this.l;
    }

    @Override // o.InterfaceC0538Uq
    public final void q(long j) {
        this.k = j;
        this.d.setAmbientShadowColor(AbstractC0022At.L(j));
    }

    @Override // o.InterfaceC0538Uq
    public final void r(Outline outline, long j) {
        this.d.setOutline(outline);
        K();
    }

    @Override // o.InterfaceC0538Uq
    public final float s() {
        return this.m;
    }

    @Override // o.InterfaceC0538Uq
    public final void t() {
        K();
    }

    @Override // o.InterfaceC0538Uq
    public final void u() {
        this.d.setElevation(0.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void v(long j, int i, int i2) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = AbstractC0946e20.T(j);
    }

    @Override // o.InterfaceC0538Uq
    public final float w() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final int x() {
        return this.p;
    }

    @Override // o.InterfaceC0538Uq
    public final float y() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final void z(int i) {
        this.p = i;
        if (i != 1 && this.h == 3) {
            L(this.d, i);
        } else {
            L(this.d, 1);
        }
    }
}
