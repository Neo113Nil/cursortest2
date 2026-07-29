package o;

/* renamed from: o.qu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1790qu {
    public static final C1790qu c;
    public final C0386Ou a;
    public final boolean b;

    static {
        C2245xo c2245xo = AbstractC1000eu.a;
        C1464ly c1464ly = C1464ly.l;
        AbstractC0048Bt.n(c1464ly, "configuredKotlinVersion");
        C1066fu c1066fu = AbstractC1000eu.d;
        C1464ly c1464ly2 = c1066fu.b;
        DN dn = (c1464ly2 == null || c1464ly2.k - c1464ly.k > 0) ? c1066fu.a : c1066fu.c;
        AbstractC0048Bt.n(dn, "globalReportLevel");
        C0386Ou c0386Ou = new C0386Ou(dn, dn == DN.j ? null : dn);
        C1724pu c1724pu = C1724pu.j;
        c = new C1790qu(c0386Ou);
    }

    public C1790qu(C0386Ou c0386Ou) {
        C1724pu c1724pu = C1724pu.j;
        this.a = c0386Ou;
        this.b = c0386Ou.d || c1724pu.invoke(AbstractC1000eu.a) == DN.i;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + C1724pu.j + ')';
    }
}
