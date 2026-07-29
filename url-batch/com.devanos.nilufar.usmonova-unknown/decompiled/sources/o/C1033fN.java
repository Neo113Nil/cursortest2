package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* renamed from: o.fN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033fN implements InterfaceC1712pi {
    public static boolean g = true;
    public final RenderNode a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public C1033fN(S2 s2) {
        RenderNode create = RenderNode.create("Compose", s2);
        this.a = create;
        if (g) {
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
                C1493mN c1493mN = C1493mN.a;
                c1493mN.c(create, c1493mN.a(create));
                c1493mN.d(create, c1493mN.b(create));
            }
            C1361kN.a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            g = false;
        }
    }

    @Override // o.InterfaceC1712pi
    public final void A(int i) {
        this.c += i;
        this.e += i;
        this.a.offsetTopAndBottom(i);
    }

    @Override // o.InterfaceC1712pi
    public final void B(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // o.InterfaceC1712pi
    public final void C(C1178ha c1178ha, DH dh, C2084vL c2084vL) {
        Canvas start = this.a.start(getWidth(), getHeight());
        C2262y2 c2262y2 = c1178ha.a;
        Canvas canvas = c2262y2.a;
        c2262y2.a = start;
        if (dh != null) {
            c2262y2.f();
            c2262y2.e(dh);
        }
        c2084vL.invoke(c2262y2);
        if (dh != null) {
            c2262y2.d();
        }
        c1178ha.a.a = canvas;
        this.a.end(start);
    }

    @Override // o.InterfaceC1712pi
    public final void D(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // o.InterfaceC1712pi
    public final void E(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1493mN.a.d(this.a, i);
        }
    }

    @Override // o.InterfaceC1712pi
    public final boolean F() {
        return this.a.setHasOverlappingRendering(true);
    }

    @Override // o.InterfaceC1712pi
    public final void G(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // o.InterfaceC1712pi
    public final float H() {
        return this.a.getElevation();
    }

    @Override // o.InterfaceC1712pi
    public final float a() {
        return this.a.getAlpha();
    }

    @Override // o.InterfaceC1712pi
    public final void b() {
        this.a.setRotationX(0.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void c() {
        this.a.setTranslationY(0.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void d() {
        this.a.setRotationY(0.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void e() {
        this.a.setAlpha(1.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void f() {
        C1361kN.a.a(this.a);
    }

    @Override // o.InterfaceC1712pi
    public final void g() {
        this.a.setTranslationX(0.0f);
    }

    @Override // o.InterfaceC1712pi
    public final int getHeight() {
        return this.e - this.c;
    }

    @Override // o.InterfaceC1712pi
    public final int getLeft() {
        return this.b;
    }

    @Override // o.InterfaceC1712pi
    public final int getRight() {
        return this.d;
    }

    @Override // o.InterfaceC1712pi
    public final int getWidth() {
        return this.d - this.b;
    }

    @Override // o.InterfaceC1712pi
    public final void h() {
        this.a.setRotation(0.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void i() {
        this.a.setScaleX(1.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void j(float f) {
        this.a.setCameraDistance(-f);
    }

    @Override // o.InterfaceC1712pi
    public final boolean k() {
        return this.a.isValid();
    }

    @Override // o.InterfaceC1712pi
    public final void l() {
        this.a.setScaleY(1.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void m(int i) {
        this.b += i;
        this.d += i;
        this.a.offsetLeftAndRight(i);
    }

    @Override // o.InterfaceC1712pi
    public final int n() {
        return this.e;
    }

    @Override // o.InterfaceC1712pi
    public final boolean o() {
        return this.f;
    }

    @Override // o.InterfaceC1712pi
    public final void q(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.a);
    }

    @Override // o.InterfaceC1712pi
    public final int r() {
        return this.c;
    }

    @Override // o.InterfaceC1712pi
    public final void s(float f) {
        this.a.setPivotX(f);
    }

    @Override // o.InterfaceC1712pi
    public final void t(boolean z) {
        this.f = z;
        this.a.setClipToBounds(z);
    }

    @Override // o.InterfaceC1712pi
    public final boolean u(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        return this.a.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o.InterfaceC1712pi
    public final void v() {
        this.a.setElevation(0.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void w() {
        this.a.setLayerType(0);
        this.a.setHasOverlappingRendering(true);
    }

    @Override // o.InterfaceC1712pi
    public final void x(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1493mN.a.c(this.a, i);
        }
    }

    @Override // o.InterfaceC1712pi
    public final void y(float f) {
        this.a.setPivotY(f);
    }

    @Override // o.InterfaceC1712pi
    public final boolean z() {
        return this.a.getClipToOutline();
    }

    @Override // o.InterfaceC1712pi
    public final void p() {
    }
}
