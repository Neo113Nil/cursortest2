package o;

/* renamed from: o.Gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0166Gh extends AbstractC0485Sp implements InterfaceC2114vp {
    public static final C0166Gh j = new C0166Gh(1);

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        return UM.a.b(RY.class);
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        RY ry = (RY) obj;
        AbstractC0048Bt.n(ry, "p0");
        return Boolean.valueOf(ry.I0());
    }
}
