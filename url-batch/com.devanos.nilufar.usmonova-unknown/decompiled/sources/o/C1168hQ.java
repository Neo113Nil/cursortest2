package o;

/* renamed from: o.hQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168hQ {
    public static final C0140Fh d;
    public static final /* synthetic */ InterfaceC0937dx[] e;
    public final AbstractC1598o a;
    public final Object b;
    public final SA c;

    static {
        VM vm = UM.a;
        e = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C1168hQ.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
        d = new C0140Fh(26);
    }

    public C1168hQ(AbstractC1598o abstractC1598o, OT ot, InterfaceC2114vp interfaceC2114vp) {
        this.a = abstractC1598o;
        this.b = interfaceC2114vp;
        LE le = new LE(8, this);
        VA va = (VA) ot;
        va.getClass();
        this.c = new SA(va, le);
    }
}
