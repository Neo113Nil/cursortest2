package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* renamed from: o.hN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165hN implements InterfaceC1712pi {
    public final RenderNode a = BI.c();

    @Override // o.InterfaceC1712pi
    public final void A(int i) {
        this.a.offsetTopAndBottom(i);
    }

    @Override // o.InterfaceC1712pi
    public final void B(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // o.InterfaceC1712pi
    public final void C(C1178ha c1178ha, DH dh, C2084vL c2084vL) {
        RecordingCanvas beginRecording;
        beginRecording = this.a.beginRecording();
        C2262y2 c2262y2 = c1178ha.a;
        Canvas canvas = c2262y2.a;
        c2262y2.a = beginRecording;
        if (dh != null) {
            c2262y2.f();
            c2262y2.e(dh);
        }
        c2084vL.invoke(c2262y2);
        if (dh != null) {
            c2262y2.d();
        }
        c1178ha.a.a = canvas;
        this.a.endRecording();
    }

    @Override // o.InterfaceC1712pi
    public final void D(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // o.InterfaceC1712pi
    public final void E(int i) {
        this.a.setSpotShadowColor(i);
    }

    @Override // o.InterfaceC1712pi
    public final boolean F() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // o.InterfaceC1712pi
    public final void G(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // o.InterfaceC1712pi
    public final float H() {
        float elevation;
        elevation = this.a.getElevation();
        return elevation;
    }

    @Override // o.InterfaceC1712pi
    public final float a() {
        float alpha;
        alpha = this.a.getAlpha();
        return alpha;
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
        this.a.discardDisplayList();
    }

    @Override // o.InterfaceC1712pi
    public final void g() {
        this.a.setTranslationX(0.0f);
    }

    @Override // o.InterfaceC1712pi
    public final int getHeight() {
        int height;
        height = this.a.getHeight();
        return height;
    }

    @Override // o.InterfaceC1712pi
    public final int getLeft() {
        int left;
        left = this.a.getLeft();
        return left;
    }

    @Override // o.InterfaceC1712pi
    public final int getRight() {
        int right;
        right = this.a.getRight();
        return right;
    }

    @Override // o.InterfaceC1712pi
    public final int getWidth() {
        int width;
        width = this.a.getWidth();
        return width;
    }

    @Override // o.InterfaceC1712pi
    public final void h() {
        this.a.setRotationZ(0.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void i() {
        this.a.setScaleX(1.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void j(float f) {
        this.a.setCameraDistance(f);
    }

    @Override // o.InterfaceC1712pi
    public final boolean k() {
        boolean hasDisplayList;
        hasDisplayList = this.a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // o.InterfaceC1712pi
    public final void l() {
        this.a.setScaleY(1.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void m(int i) {
        this.a.offsetLeftAndRight(i);
    }

    @Override // o.InterfaceC1712pi
    public final int n() {
        int bottom;
        bottom = this.a.getBottom();
        return bottom;
    }

    @Override // o.InterfaceC1712pi
    public final boolean o() {
        boolean clipToBounds;
        clipToBounds = this.a.getClipToBounds();
        return clipToBounds;
    }

    @Override // o.InterfaceC1712pi
    public final void p() {
        if (Build.VERSION.SDK_INT >= 31) {
            C1231iN.a.a(this.a, null);
        }
    }

    @Override // o.InterfaceC1712pi
    public final void q(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // o.InterfaceC1712pi
    public final int r() {
        int top;
        top = this.a.getTop();
        return top;
    }

    @Override // o.InterfaceC1712pi
    public final void s(float f) {
        this.a.setPivotX(f);
    }

    @Override // o.InterfaceC1712pi
    public final void t(boolean z) {
        this.a.setClipToBounds(z);
    }

    @Override // o.InterfaceC1712pi
    public final boolean u(int i, int i2, int i3, int i4) {
        boolean position;
        position = this.a.setPosition(i, i2, i3, i4);
        return position;
    }

    @Override // o.InterfaceC1712pi
    public final void v() {
        this.a.setElevation(0.0f);
    }

    @Override // o.InterfaceC1712pi
    public final void w() {
        RenderNode renderNode = this.a;
        renderNode.setUseCompositingLayer(false, null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // o.InterfaceC1712pi
    public final void x(int i) {
        this.a.setAmbientShadowColor(i);
    }

    @Override // o.InterfaceC1712pi
    public final void y(float f) {
        this.a.setPivotY(f);
    }

    @Override // o.InterfaceC1712pi
    public final boolean z() {
        boolean clipToOutline;
        clipToOutline = this.a.getClipToOutline();
        return clipToOutline;
    }
}
