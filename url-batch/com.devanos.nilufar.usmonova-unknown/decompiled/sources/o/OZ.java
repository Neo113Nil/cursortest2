package o;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* loaded from: classes.dex */
public final class OZ extends View {
    public static final LZ r = new LZ(0);
    public final AbstractC0989ej h;
    public final C1178ha i;
    public final C1112ga j;
    public boolean k;
    public Outline l;
    public boolean m;
    public InterfaceC1119gh n;

    /* renamed from: o, reason: collision with root package name */
    public EnumC2057uy f77o;
    public AbstractC1596ny p;
    public C0512Tq q;

    public OZ(AbstractC0989ej abstractC0989ej, C1178ha c1178ha, C1112ga c1112ga) {
        super(abstractC0989ej.getContext());
        this.h = abstractC0989ej;
        this.i = c1178ha;
        this.j = c1112ga;
        setOutlineProvider(r);
        this.m = true;
        this.n = EB.g;
        this.f77o = EnumC2057uy.h;
        InterfaceC0538Uq.a.getClass();
        this.p = I2.K;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [o.ny, o.vp] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1178ha c1178ha = this.i;
        C2262y2 c2262y2 = c1178ha.a;
        Canvas canvas2 = c2262y2.a;
        c2262y2.a = canvas;
        InterfaceC1119gh interfaceC1119gh = this.n;
        EnumC2057uy enumC2057uy = this.f77o;
        long a = AbstractC1035fP.a(getWidth(), getHeight());
        C0512Tq c0512Tq = this.q;
        ?? r9 = this.p;
        C1112ga c1112ga = this.j;
        C2002u5 c2002u5 = c1112ga.c;
        C1046fa c1046fa = ((C1112ga) c2002u5.j).b;
        InterfaceC1119gh interfaceC1119gh2 = c1046fa.a;
        EnumC2057uy enumC2057uy2 = c1046fa.b;
        InterfaceC0980ea Q = c2002u5.Q();
        C2002u5 c2002u52 = c1112ga.c;
        long j = ((C1112ga) c2002u52.j).b.d;
        C0512Tq c0512Tq2 = (C0512Tq) c2002u52.i;
        c2002u52.Z(interfaceC1119gh);
        c2002u52.b0(enumC2057uy);
        c2002u52.Y(c2262y2);
        c2002u52.c0(a);
        c2002u52.i = c0512Tq;
        c2262y2.f();
        try {
            r9.invoke(c1112ga);
            c2262y2.d();
            c2002u52.Z(interfaceC1119gh2);
            c2002u52.b0(enumC2057uy2);
            c2002u52.Y(Q);
            c2002u52.c0(j);
            c2002u52.i = c0512Tq2;
            c1178ha.a.a = canvas2;
            this.k = false;
        } catch (Throwable th) {
            c2262y2.d();
            c2002u52.Z(interfaceC1119gh2);
            c2002u52.b0(enumC2057uy2);
            c2002u52.Y(Q);
            c2002u52.c0(j);
            c2002u52.i = c0512Tq2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.m;
    }

    public final C1178ha getCanvasHolder() {
        return this.i;
    }

    public final View getOwnerView() {
        return this.h;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.m;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.k) {
            return;
        }
        this.k = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.m != z) {
            this.m = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.k = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
