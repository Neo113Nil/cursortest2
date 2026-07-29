package o;

/* renamed from: o.lz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465lz extends AbstractC1184hg implements InterfaceC1289jH {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0937dx[] f196o;
    public final C0826cD j;
    public final C2245xo k;
    public final SA l;
    public final SA m;
    public final C1531mz n;

    static {
        VM vm = UM.a;
        f196o = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C1465lz.class), "fragments", "getFragments()Ljava/util/List;")), vm.g(new UJ(vm.b(C1465lz.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1465lz(C0826cD c0826cD, C2245xo c2245xo, VA va) {
        super(C0460Rq.t, c2245xo.g());
        AbstractC0048Bt.n(c2245xo, "fqName");
        AbstractC0048Bt.n(va, "storageManager");
        this.j = c0826cD;
        this.k = c2245xo;
        this.l = new SA(va, new C1399kz(this, 1));
        this.m = new SA(va, new C1399kz(this, 0));
        this.n = new C1531mz(va, new C1399kz(this, 2));
    }

    public final boolean equals(Object obj) {
        InterfaceC1289jH interfaceC1289jH = obj instanceof InterfaceC1289jH ? (InterfaceC1289jH) obj : null;
        if (interfaceC1289jH == null) {
            return false;
        }
        C1465lz c1465lz = (C1465lz) interfaceC1289jH;
        return AbstractC0048Bt.h(this.k, c1465lz.k) && AbstractC0048Bt.h(this.j, c1465lz.j);
    }

    public final int hashCode() {
        return this.k.hashCode() + (this.j.hashCode() * 31);
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        C2245xo c2245xo = this.k;
        if (c2245xo.d()) {
            return null;
        }
        return this.j.S(c2245xo.e());
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.G(this, obj);
    }
}
