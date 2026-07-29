package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.Xq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616Xq implements InterfaceC0538Uq {
    public static final AtomicBoolean s = new AtomicBoolean(true);
    public final C1178ha b;
    public final C1112ga c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public long g;
    public int h;
    public final int i;
    public float j;
    public boolean k;
    public float l;
    public float m;
    public long n;

    /* renamed from: o, reason: collision with root package name */
    public long f131o;
    public float p;
    public boolean q;
    public boolean r;

    public C0616Xq(S2 s2, C1178ha c1178ha, C1112ga c1112ga) {
        this.b = c1178ha;
        this.c = c1112ga;
        RenderNode create = RenderNode.create("Compose", s2);
        this.d = create;
        this.e = 0L;
        this.g = 0L;
        if (s.getAndSet(false)) {
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
            if (Build.VERSION.SDK_INT >= 28) {
                C1559nN c1559nN = C1559nN.a;
                c1559nN.c(create, c1559nN.a(create));
                c1559nN.d(create, c1559nN.b(create));
            }
            C1427lN.a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        L(0);
        this.h = 0;
        this.i = 3;
        this.j = 1.0f;
        this.l = 1.0f;
        this.m = 1.0f;
        long j = C1114gc.b;
        this.n = j;
        this.f131o = j;
        this.p = 8.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f131o = j;
            C1559nN.a.d(this.d, AbstractC0022At.L(j));
        }
    }

    @Override // o.InterfaceC0538Uq
    public final void B(InterfaceC0980ea interfaceC0980ea) {
        DisplayListCanvas a = AbstractC2328z2.a(interfaceC0980ea);
        AbstractC0048Bt.l(a, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a.drawRenderNode(this.d);
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
        return this.m;
    }

    @Override // o.InterfaceC0538Uq
    public final float G() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final int H() {
        return this.i;
    }

    @Override // o.InterfaceC0538Uq
    public final void I(long j) {
        if (PX.t0(j)) {
            this.k = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (this.e & 4294967295L)) / 2.0f);
        } else {
            this.k = false;
            this.d.setPivotX(BF.b(j));
            this.d.setPivotY(BF.c(j));
        }
    }

    @Override // o.InterfaceC0538Uq
    public final long J() {
        return this.n;
    }

    public final void K() {
        if (this.q) {
            this.q = false;
            this.d.setClipToBounds(false);
        }
        if (this.r) {
            this.r = false;
            this.d.setClipToOutline(false);
        }
    }

    public final void L(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // o.InterfaceC0538Uq
    public final float a() {
        return this.j;
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
        this.j = 1.0f;
        this.d.setAlpha(1.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void f() {
        C1427lN.a.a(this.d);
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
        this.l = 1.0f;
        this.d.setScaleX(1.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void j(float f) {
        this.p = f;
        this.d.setCameraDistance(-f);
    }

    @Override // o.InterfaceC0538Uq
    public final boolean k() {
        return this.d.isValid();
    }

    @Override // o.InterfaceC0538Uq
    public final void l() {
        this.m = 1.0f;
        this.d.setScaleY(1.0f);
    }

    @Override // o.InterfaceC0538Uq
    public final void m(InterfaceC1119gh interfaceC1119gh, EnumC2057uy enumC2057uy, C0512Tq c0512Tq, C1400l c1400l) {
        Canvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.g >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.g & 4294967295L)));
        try {
            C2262y2 c2262y2 = this.b.a;
            Canvas canvas = c2262y2.a;
            c2262y2.a = start;
            C1112ga c1112ga = this.c;
            C2002u5 c2002u5 = c1112ga.c;
            long T = AbstractC0946e20.T(this.e);
            C1046fa c1046fa = ((C1112ga) c2002u5.j).b;
            InterfaceC1119gh interfaceC1119gh2 = c1046fa.a;
            EnumC2057uy enumC2057uy2 = c1046fa.b;
            InterfaceC0980ea Q = c2002u5.Q();
            long j = ((C1112ga) c2002u5.j).b.d;
            C0512Tq c0512Tq2 = (C0512Tq) c2002u5.i;
            c2002u5.Z(interfaceC1119gh);
            c2002u5.b0(enumC2057uy);
            c2002u5.Y(c2262y2);
            c2002u5.c0(T);
            c2002u5.i = c0512Tq;
            c2262y2.f();
            try {
                c1400l.invoke(c1112ga);
                c2262y2.d();
                c2002u5.Z(interfaceC1119gh2);
                c2002u5.b0(enumC2057uy2);
                c2002u5.Y(Q);
                c2002u5.c0(j);
                c2002u5.i = c0512Tq2;
                c2262y2.a = canvas;
                this.d.end(start);
            } catch (Throwable th) {
                c2262y2.d();
                C2002u5 c2002u52 = c1112ga.c;
                c2002u52.Z(interfaceC1119gh2);
                c2002u52.b0(enumC2057uy2);
                c2002u52.Y(Q);
                c2002u52.c0(j);
                c2002u52.i = c0512Tq2;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(start);
            throw th2;
        }
    }

    @Override // o.InterfaceC0538Uq
    public final float n() {
        return this.l;
    }

    @Override // o.InterfaceC0538Uq
    public final float o() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final long p() {
        return this.f131o;
    }

    @Override // o.InterfaceC0538Uq
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.n = j;
            C1559nN.a.c(this.d, AbstractC0022At.L(j));
        }
    }

    @Override // o.InterfaceC0538Uq
    public final void r(Outline outline, long j) {
        this.g = j;
        this.d.setOutline(outline);
        K();
    }

    @Override // o.InterfaceC0538Uq
    public final float s() {
        return this.p;
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
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (PX.G(this.e, j)) {
            return;
        }
        if (this.k) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // o.InterfaceC0538Uq
    public final float w() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final int x() {
        return this.h;
    }

    @Override // o.InterfaceC0538Uq
    public final float y() {
        return 0.0f;
    }

    @Override // o.InterfaceC0538Uq
    public final void z(int i) {
        this.h = i;
        if (i != 1 && this.i == 3) {
            L(i);
        } else {
            L(1);
        }
    }
}
