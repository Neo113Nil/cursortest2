package o;

/* renamed from: o.us, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2051us implements UL {
    public final InterfaceC1245ib h;

    public C2051us(InterfaceC1245ib interfaceC1245ib) {
        this.h = interfaceC1245ib;
    }

    @Override // o.UL
    public final AbstractC1004ey c() {
        JR i = this.h.i();
        AbstractC0048Bt.m(i, "classDescriptor.defaultType");
        return i;
    }

    public final boolean equals(Object obj) {
        C2051us c2051us = obj instanceof C2051us ? (C2051us) obj : null;
        return AbstractC0048Bt.h(this.h, c2051us != null ? c2051us.h : null);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        JR i = this.h.i();
        AbstractC0048Bt.m(i, "classDescriptor.defaultType");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
