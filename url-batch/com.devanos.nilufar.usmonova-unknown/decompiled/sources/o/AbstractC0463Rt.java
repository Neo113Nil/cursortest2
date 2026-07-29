package o;

/* renamed from: o.Rt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0463Rt {
    public static final C0827cE a = C0827cE.e("message");
    public static final C0827cE b = C0827cE.e("allowedTargets");
    public static final C0827cE c = C0827cE.e("value");
    public static final Object d = EB.G(new C1619oH(AbstractC1433lT.t, AbstractC0438Qu.c), new C1619oH(AbstractC1433lT.w, AbstractC0438Qu.d), new C1619oH(AbstractC1433lT.x, AbstractC0438Qu.f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static NI a(C2245xo c2245xo, InterfaceC0489St interfaceC0489St, C1216i8 c1216i8) {
        C1558nM a2;
        AbstractC0048Bt.n(c2245xo, "kotlinName");
        AbstractC0048Bt.n(interfaceC0489St, "annotationOwner");
        AbstractC0048Bt.n(c1216i8, "c");
        if (c2245xo.equals(AbstractC1433lT.m)) {
            C2245xo c2245xo2 = AbstractC0438Qu.e;
            AbstractC0048Bt.m(c2245xo2, "DEPRECATED_ANNOTATION");
            C1558nM a3 = interfaceC0489St.a(c2245xo2);
            if (a3 != null) {
                return new C0645Yt(a3, c1216i8);
            }
        }
        C2245xo c2245xo3 = (C2245xo) d.get(c2245xo);
        if (c2245xo3 == null || (a2 = interfaceC0489St.a(c2245xo3)) == null) {
            return null;
        }
        return b(c1216i8, a2, false);
    }

    public static NI b(C1216i8 c1216i8, C1558nM c1558nM, boolean z) {
        AbstractC0048Bt.n(c1558nM, "annotation");
        AbstractC0048Bt.n(c1216i8, "c");
        C1639ob a2 = AbstractC1492mM.a(AbstractC1473m3.D(AbstractC1473m3.B(c1558nM.a)));
        if (a2.equals(C1639ob.j(AbstractC0438Qu.c))) {
            return new C1328ju(c1558nM, c1216i8);
        }
        if (a2.equals(C1639ob.j(AbstractC0438Qu.d))) {
            return new C1262iu(c1558nM, c1216i8);
        }
        if (a2.equals(C1639ob.j(AbstractC0438Qu.f))) {
            return new C0437Qt(c1216i8, c1558nM, AbstractC1433lT.x);
        }
        if (a2.equals(C1639ob.j(AbstractC0438Qu.e))) {
            return null;
        }
        return new C0312Ly(c1216i8, c1558nM, z);
    }
}
