package o;

import java.util.List;

/* renamed from: o.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1704pa implements InterfaceC1437lX {
    public final InterfaceC1437lX h;
    public final InterfaceC0004Ab i;
    public final int j;

    public C1704pa(InterfaceC1437lX interfaceC1437lX, InterfaceC0004Ab interfaceC0004Ab, int i) {
        this.h = interfaceC1437lX;
        this.i = interfaceC0004Ab;
        this.j = i;
    }

    @Override // o.InterfaceC1437lX
    public final OT A() {
        return this.h.A();
    }

    @Override // o.InterfaceC1437lX
    public final boolean O() {
        return true;
    }

    @Override // o.InterfaceC1437lX
    public final boolean P() {
        return this.h.P();
    }

    @Override // o.InterfaceC1437lX
    public final int Y() {
        return this.h.Y();
    }

    @Override // o.InterfaceC2364zb, o.InterfaceC1118gg
    public final InterfaceC2364zb a() {
        return this.h.a();
    }

    @Override // o.InterfaceC1249ig
    public final IS d() {
        return this.h.d();
    }

    @Override // o.W3
    public final InterfaceC1738q4 getAnnotations() {
        return this.h.getAnnotations();
    }

    @Override // o.InterfaceC1437lX
    public final int getIndex() {
        return this.h.getIndex() + this.j;
    }

    @Override // o.InterfaceC1118gg
    public final C0827cE getName() {
        return this.h.getName();
    }

    @Override // o.InterfaceC1437lX
    public final List getUpperBounds() {
        return this.h.getUpperBounds();
    }

    @Override // o.InterfaceC2364zb
    public final JR i() {
        return this.h.i();
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        return this.i;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return this.h.t(interfaceC1380kg, obj);
    }

    public final String toString() {
        return this.h + "[inner-copy]";
    }

    @Override // o.InterfaceC2364zb
    public final SW z() {
        return this.h.z();
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg a() {
        return this.h.a();
    }

    @Override // o.InterfaceC1437lX, o.InterfaceC2364zb, o.InterfaceC1118gg
    public final InterfaceC1437lX a() {
        return this.h.a();
    }
}
