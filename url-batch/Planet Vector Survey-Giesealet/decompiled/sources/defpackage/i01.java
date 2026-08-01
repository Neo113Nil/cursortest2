package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i01 extends View {
    public static final nm n = new nm(1);
    public final ko d;
    public final oc e;
    public final nc f;
    public boolean g;
    public Outline h;
    public boolean i;
    public sl j;
    public c10 k;
    public mu l;
    public nv m;

    public i01(ko koVar, oc ocVar, nc ncVar) {
        super(koVar.getContext());
        this.d = koVar;
        this.e = ocVar;
        this.f = ncVar;
        setOutlineProvider(n);
        this.i = true;
        this.j = nk.f;
        this.k = c10.d;
        ov.a.getClass();
        this.l = o1.C;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        oc ocVar = this.e;
        o2 o2Var = ocVar.a;
        Canvas canvas2 = o2Var.a;
        o2Var.a = canvas;
        sl slVar = this.j;
        c10 c10Var = this.k;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        nv nvVar = this.m;
        mu muVar = this.l;
        nc ncVar = this.f;
        t7 t7Var = ncVar.e;
        mc mcVar = ((nc) t7Var.g).d;
        sl slVar2 = mcVar.a;
        c10 c10Var2 = mcVar.b;
        kc p = t7Var.p();
        t7 t7Var2 = ncVar.e;
        long r = t7Var2.r();
        nv nvVar2 = (nv) t7Var2.f;
        t7Var2.z(slVar);
        t7Var2.A(c10Var);
        t7Var2.y(o2Var);
        t7Var2.B(floatToRawIntBits);
        t7Var2.f = nvVar;
        o2Var.i();
        try {
            muVar.c(ncVar);
            o2Var.g();
            t7Var2.z(slVar2);
            t7Var2.A(c10Var2);
            t7Var2.y(p);
            t7Var2.B(r);
            t7Var2.f = nvVar2;
            ocVar.a.a = canvas2;
            this.g = false;
        } catch (Throwable th) {
            o2Var.g();
            t7Var2.z(slVar2);
            t7Var2.A(c10Var2);
            t7Var2.y(p);
            t7Var2.B(r);
            t7Var2.f = nvVar2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.i;
    }

    public final oc getCanvasHolder() {
        return this.e;
    }

    public final View getOwnerView() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.i;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.g) {
            return;
        }
        this.g = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.i != z) {
            this.i = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.g = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
