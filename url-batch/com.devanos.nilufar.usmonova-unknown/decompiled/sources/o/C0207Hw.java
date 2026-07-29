package o;

/* renamed from: o.Hw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207Hw extends AbstractC1200hw {
    public static final /* synthetic */ InterfaceC0937dx[] g;
    public final RM c;
    public final RM d;
    public final SM e;
    public final SM f;

    static {
        VM vm = UM.a;
        g = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0207Hw.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), vm.g(new UJ(vm.b(C0207Hw.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), vm.g(new UJ(vm.b(C0207Hw.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), vm.g(new UJ(vm.b(C0207Hw.class), "metadata", "getMetadata()Lkotlin/Triple;")), vm.g(new UJ(vm.b(C0207Hw.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public C0207Hw(C0259Jw c0259Jw) {
        super(c0259Jw);
        this.c = TM.u(null, new C0129Ew(c0259Jw, 0));
        this.d = TM.u(null, new C0181Gw(this, 1));
        this.e = new SM(new C0155Fw(this, c0259Jw));
        this.f = new SM(new C0181Gw(this, 0));
        TM.u(null, new C0155Fw(c0259Jw, this));
    }
}
