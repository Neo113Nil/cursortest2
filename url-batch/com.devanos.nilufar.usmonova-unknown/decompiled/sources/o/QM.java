package o;

/* loaded from: classes.dex */
public final /* synthetic */ class QM extends AbstractC0485Sp implements InterfaceC2312yp {
    public static final QM j = new QM(2);

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        return "loadFunction";
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        return UM.a.b(SB.class);
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        SB sb = (SB) obj;
        C2017uK c2017uK = (C2017uK) obj2;
        AbstractC0048Bt.n(sb, "p0");
        AbstractC0048Bt.n(c2017uK, "p1");
        return sb.e(c2017uK);
    }
}
