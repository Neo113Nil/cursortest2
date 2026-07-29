package o;

/* loaded from: classes.dex */
public final class LW extends AbstractC0433Qp implements KW {
    public static final GU N;
    public final OT K;
    public final C1316ji L;
    public C0981eb M;

    static {
        VM vm = UM.a;
        vm.g(new UJ(vm.b(LW.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        N = new GU(1);
    }

    public LW(OT ot, C1316ji c1316ji, C0981eb c0981eb, KW kw, InterfaceC1738q4 interfaceC1738q4, int i, IS is) {
        super(i, interfaceC1738q4, c1316ji, kw, YS.e, is);
        this.K = ot;
        this.L = c1316ji;
        K2 k2 = new K2(this, 21, c0981eb);
        VA va = (VA) ot;
        va.getClass();
        new RA(va, k2);
        this.M = c0981eb;
    }

    @Override // o.InterfaceC0629Yd
    public final boolean H() {
        return this.M.K;
    }

    @Override // o.InterfaceC0629Yd
    public final InterfaceC1245ib I() {
        InterfaceC1245ib I = this.M.I();
        AbstractC0048Bt.m(I, "underlyingConstructorDescriptor.constructedClass");
        return I;
    }

    @Override // o.AbstractC0433Qp
    public final AbstractC0433Qp J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        AbstractC0048Bt.n(interfaceC1118gg, "newOwner");
        AbstractC1888sN.p(i, "kind");
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        if (i != 1) {
        }
        return new LW(this.K, this.L, this.M, this, interfaceC1738q4, 1, is);
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final KW a() {
        InterfaceC0381Op a = super.a();
        AbstractC0048Bt.l(a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (KW) a;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC1106gU
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final LW e(C2096vX c2096vX) {
        AbstractC0048Bt.n(c2096vX, "substitutor");
        InterfaceC0381Op e = super.e(c2096vX);
        AbstractC0048Bt.l(e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        LW lw = (LW) e;
        AbstractC1004ey abstractC1004ey = lw.n;
        AbstractC0048Bt.k(abstractC1004ey);
        C0981eb e2 = this.M.G0().e(C2096vX.d(abstractC1004ey));
        if (e2 == null) {
            return null;
        }
        lw.M = e2;
        return lw;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC2072v9
    public final AbstractC1004ey getReturnType() {
        AbstractC1004ey abstractC1004ey = this.n;
        AbstractC0048Bt.k(abstractC1004ey);
        return abstractC1004ey;
    }

    @Override // o.AbstractC1314jg, o.InterfaceC1118gg
    public final InterfaceC0004Ab n() {
        return this.L;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC2204x9
    public final InterfaceC2204x9 y(InterfaceC1245ib interfaceC1245ib, int i, C0244Jh c0244Jh) {
        AbstractC0048Bt.n(interfaceC1245ib, "newOwner");
        AbstractC1888sN.p(i, "modality");
        AbstractC0048Bt.n(c0244Jh, "visibility");
        AbstractC1888sN.p(2, "kind");
        C0407Pp N0 = N0(C2096vX.b);
        N0.i = interfaceC1245ib;
        N0.j = i;
        N0.k = c0244Jh;
        N0.m = 2;
        N0.t = false;
        OB K0 = N0.E.K0(N0);
        AbstractC0048Bt.l(K0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (KW) K0;
    }

    @Override // o.AbstractC1314jg, o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        return this.L;
    }
}
