package o;

/* renamed from: o.cL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834cL extends AbstractC0900dL {
    public final C2245xo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0834cL(C2245xo c2245xo, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, IS is) {
        super(interfaceC0893dE, c0695aD, is);
        AbstractC0048Bt.n(c2245xo, "fqName");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        this.d = c2245xo;
    }

    @Override // o.AbstractC0900dL
    public final C2245xo a() {
        return this.d;
    }
}
