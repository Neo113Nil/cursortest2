package o;

/* renamed from: o.a9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691a9 extends WS {
    public static final /* synthetic */ int l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0381Op a(InterfaceC0381Op interfaceC0381Op) {
        AbstractC0048Bt.n(interfaceC0381Op, "functionDescriptor");
        C0827cE name = ((AbstractC1184hg) interfaceC0381Op).getName();
        AbstractC0048Bt.m(name, "functionDescriptor.name");
        if (b(name)) {
            return (InterfaceC0381Op) AbstractC0192Hh.b(interfaceC0381Op, I2.n);
        }
        return null;
    }

    public static boolean b(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "<this>");
        return WS.e.contains(c0827cE);
    }
}
