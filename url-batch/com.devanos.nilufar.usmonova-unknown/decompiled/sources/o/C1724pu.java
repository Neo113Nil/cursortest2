package o;

/* renamed from: o.pu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1724pu extends AbstractC0485Sp implements InterfaceC2114vp {
    public static final C1724pu j = new C1724pu(1);

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        return UM.a.c(AbstractC1000eu.class, "compiler.common.jvm");
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        C2245xo c2245xo = (C2245xo) obj;
        AbstractC0048Bt.n(c2245xo, "p0");
        C2245xo c2245xo2 = AbstractC1000eu.a;
        InterfaceC2012uF.d.getClass();
        C0208Hx c0208Hx = C1946tF.b;
        C1464ly c1464ly = new C1464ly(1, 7, 20);
        AbstractC0048Bt.n(c0208Hx, "configuredReportLevels");
        DN dn = (DN) ((TA) c0208Hx.j).invoke(c2245xo);
        if (dn != null) {
            return dn;
        }
        C0208Hx c0208Hx2 = AbstractC1000eu.c;
        c0208Hx2.getClass();
        C1066fu c1066fu = (C1066fu) ((TA) c0208Hx2.j).invoke(c2245xo);
        if (c1066fu == null) {
            return DN.i;
        }
        C1464ly c1464ly2 = c1066fu.b;
        return (c1464ly2 == null || c1464ly2.k - c1464ly.k > 0) ? c1066fu.a : c1066fu.c;
    }
}
