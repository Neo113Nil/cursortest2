package o;

/* renamed from: o.bL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769bL extends AbstractC0900dL {
    public final C1030fK d;
    public final C0769bL e;
    public final C1639ob f;
    public final EnumC0964eK g;
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0769bL(C1030fK c1030fK, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, IS is, C0769bL c0769bL) {
        super(interfaceC0893dE, c0695aD, is);
        AbstractC0048Bt.n(c1030fK, "classProto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        this.d = c1030fK;
        this.e = c0769bL;
        this.f = AbstractC1052fg.x(interfaceC0893dE, c1030fK.l);
        EnumC0964eK enumC0964eK = (EnumC0964eK) AbstractC1650om.f.c(c1030fK.k);
        this.g = enumC0964eK == null ? EnumC0964eK.CLASS : enumC0964eK;
        this.h = AbstractC1650om.g.c(c1030fK.k).booleanValue();
    }

    @Override // o.AbstractC0900dL
    public final C2245xo a() {
        return this.f.b();
    }
}
