package o;

/* loaded from: classes.dex */
public final /* synthetic */ class OX extends AbstractC0511Tp implements InterfaceC2114vp {
    public static final OX j = new OX(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        Class cls = (Class) obj;
        AbstractC0048Bt.n(cls, "p0");
        return cls.getComponentType();
    }
}
