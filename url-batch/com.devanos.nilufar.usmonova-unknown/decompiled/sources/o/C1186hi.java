package o;

/* renamed from: o.hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1186hi extends RJ implements InterfaceC0373Oh {
    public final CK H;
    public final InterfaceC0893dE I;
    public final C0695aD J;
    public final C1097gL K;
    public final InterfaceC0607Xh L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1186hi(InterfaceC1118gg interfaceC1118gg, PJ pj, InterfaceC1738q4 interfaceC1738q4, int i, C0244Jh c0244Jh, boolean z, C0827cE c0827cE, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CK ck, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, C1097gL c1097gL, InterfaceC0607Xh interfaceC0607Xh) {
        super(interfaceC1118gg, pj, interfaceC1738q4, i, c0244Jh, z, c0827cE, i2, IS.e, z2, z3, z6, z4, z5);
        AbstractC0048Bt.n(interfaceC1118gg, "containingDeclaration");
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        AbstractC1888sN.p(i, "modality");
        AbstractC0048Bt.n(c0244Jh, "visibility");
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC1888sN.p(i2, "kind");
        AbstractC0048Bt.n(ck, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(c0695aD, "typeTable");
        AbstractC0048Bt.n(c1097gL, "versionRequirementTable");
        this.H = ck;
        this.I = interfaceC0893dE;
        this.J = c0695aD;
        this.K = c1097gL;
        this.L = interfaceC0607Xh;
    }

    @Override // o.RJ
    public final RJ J0(InterfaceC1118gg interfaceC1118gg, int i, C0244Jh c0244Jh, PJ pj, int i2, C0827cE c0827cE) {
        AbstractC0048Bt.n(interfaceC1118gg, "newOwner");
        AbstractC1888sN.p(i, "newModality");
        AbstractC0048Bt.n(c0244Jh, "newVisibility");
        AbstractC1888sN.p(i2, "kind");
        AbstractC0048Bt.n(c0827cE, "newName");
        return new C1186hi(interfaceC1118gg, pj, getAnnotations(), i, c0244Jh, this.m, c0827cE, i2, this.u, this.v, w(), this.y, this.w, this.H, this.I, this.J, this.K, this.L);
    }

    @Override // o.InterfaceC0726ai
    public final E N() {
        return this.H;
    }

    @Override // o.InterfaceC0726ai
    public final C0695aD k0() {
        return this.J;
    }

    @Override // o.InterfaceC0726ai
    public final InterfaceC0607Xh s() {
        return this.L;
    }

    @Override // o.InterfaceC0726ai
    public final InterfaceC0893dE v0() {
        return this.I;
    }

    @Override // o.RJ, o.OB
    public final boolean w() {
        return AbstractC1650om.D.c(this.H.k).booleanValue();
    }
}
