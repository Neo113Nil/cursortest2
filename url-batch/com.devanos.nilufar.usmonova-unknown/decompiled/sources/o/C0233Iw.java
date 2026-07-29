package o;

/* renamed from: o.Iw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0233Iw extends AbstractC0485Sp implements InterfaceC2312yp {
    public static final C0233Iw j = new C0233Iw(2);

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        return "loadProperty";
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        return UM.a.b(SB.class);
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        SB sb = (SB) obj;
        CK ck = (CK) obj2;
        AbstractC0048Bt.n(sb, "p0");
        AbstractC0048Bt.n(ck, "p1");
        return sb.f(ck);
    }
}
