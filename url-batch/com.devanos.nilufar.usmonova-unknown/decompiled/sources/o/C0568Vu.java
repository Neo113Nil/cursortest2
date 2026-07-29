package o;

/* renamed from: o.Vu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568Vu extends AbstractC0545Ux {
    public static final /* synthetic */ InterfaceC0937dx[] h;
    public C0542Uu f;
    public final SA g;

    static {
        VM vm = UM.a;
        h = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0568Vu.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0568Vu(VA va) {
        super(va);
        AbstractC1888sN.p(1, "kind");
        this.g = new SA(va, new K2(this, 8, va));
        int v = AbstractC1888sN.v(1);
        if (v == 1) {
            c();
        } else {
            if (v != 2) {
                return;
            }
            c();
        }
    }

    public final C0672Zu J() {
        return (C0672Zu) AbstractC0772bO.o(this.g, h[0]);
    }

    @Override // o.AbstractC0545Ux
    public final Z1 d() {
        return J();
    }

    @Override // o.AbstractC0545Ux
    public final Iterable l() {
        Iterable l = super.l();
        C0826cD k = k();
        AbstractC0048Bt.m(k, "builtInsModule");
        return AbstractC0720ac.z0(l, new C0490Su(this.d, k));
    }

    @Override // o.AbstractC0545Ux
    public final InterfaceC1160hI p() {
        return J();
    }
}
