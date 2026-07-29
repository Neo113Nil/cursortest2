package o;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* renamed from: o.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983ed extends View.DragShadowBuilder {
    public final C1185hh a;
    public final long b;
    public final InterfaceC2114vp c;

    public C0983ed(C1185hh c1185hh, long j, InterfaceC2114vp interfaceC2114vp) {
        this.a = c1185hh;
        this.b = j;
        this.c = interfaceC2114vp;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C1112ga c1112ga = new C1112ga();
        Canvas canvas2 = AbstractC2328z2.a;
        C2262y2 c2262y2 = new C2262y2();
        c2262y2.a = canvas;
        C1046fa c1046fa = c1112ga.b;
        InterfaceC1119gh interfaceC1119gh = c1046fa.a;
        EnumC2057uy enumC2057uy = c1046fa.b;
        InterfaceC0980ea interfaceC0980ea = c1046fa.c;
        long j = c1046fa.d;
        c1046fa.a = this.a;
        c1046fa.b = EnumC2057uy.h;
        c1046fa.c = c2262y2;
        c1046fa.d = this.b;
        c2262y2.f();
        this.c.invoke(c1112ga);
        c2262y2.d();
        c1046fa.a = interfaceC1119gh;
        c1046fa.b = enumC2057uy;
        c1046fa.c = interfaceC0980ea;
        c1046fa.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float b = ZR.b(j);
        C1185hh c1185hh = this.a;
        point.set(c1185hh.p(b / c1185hh.f()), c1185hh.p(ZR.a(j) / c1185hh.f()));
        point2.set(point.x / 2, point.y / 2);
    }
}
