package o;

import java.io.Serializable;

/* renamed from: o.hk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188hk implements InterfaceC0189He, Serializable {
    public static final C1188hk h = new C1188hk();

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He D(InterfaceC0189He interfaceC0189He) {
        AbstractC0048Bt.n(interfaceC0189He, "context");
        return interfaceC0189He;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He j(InterfaceC0163Ge interfaceC0163Ge) {
        AbstractC0048Bt.n(interfaceC0163Ge, "key");
        return this;
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0137Fe k(InterfaceC0163Ge interfaceC0163Ge) {
        AbstractC0048Bt.n(interfaceC0163Ge, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // o.InterfaceC0189He
    public final Object I(Object obj, InterfaceC2312yp interfaceC2312yp) {
        return obj;
    }
}
