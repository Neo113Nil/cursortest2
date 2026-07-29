package o;

/* loaded from: classes.dex */
public final /* synthetic */ class WW extends AbstractC0485Sp implements InterfaceC2114vp {
    public static final WW j = new WW(1);

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        return UM.a.b(C1639ob.class);
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        C1639ob c1639ob = (C1639ob) obj;
        AbstractC0048Bt.n(c1639ob, "p0");
        return c1639ob.f();
    }
}
