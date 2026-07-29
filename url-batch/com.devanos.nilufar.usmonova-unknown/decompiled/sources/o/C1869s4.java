package o;

/* renamed from: o.s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1869s4 {
    public final InterfaceC1738q4 a;

    public C1869s4(InterfaceC1738q4 interfaceC1738q4) {
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        this.a = interfaceC1738q4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1869s4) {
            return AbstractC0048Bt.h(((C1869s4) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
