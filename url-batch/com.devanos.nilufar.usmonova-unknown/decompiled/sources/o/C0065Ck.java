package o;

import java.util.Collection;

/* renamed from: o.Ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065Ck extends HR {
    @Override // o.AbstractC0433Qp, o.InterfaceC2072v9
    public final Object C(C0633Yh c0633Yh) {
        return null;
    }

    @Override // o.AbstractC0433Qp
    /* renamed from: I0 */
    public final HR y(InterfaceC1118gg interfaceC1118gg, int i, C0244Jh c0244Jh) {
        AbstractC0048Bt.n(interfaceC1118gg, "newOwner");
        AbstractC1888sN.p(i, "modality");
        AbstractC0048Bt.n(c0244Jh, "visibility");
        AbstractC1888sN.p(2, "kind");
        return this;
    }

    @Override // o.HR, o.AbstractC0433Qp
    public final AbstractC0433Qp J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        AbstractC0048Bt.n(interfaceC1118gg, "newOwner");
        AbstractC1888sN.p(i, "kind");
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        return this;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC2204x9
    public final void c0(Collection collection) {
        AbstractC0048Bt.n(collection, "overriddenDescriptors");
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC0381Op
    public final boolean isSuspend() {
        return false;
    }

    @Override // o.HR, o.AbstractC0433Qp, o.InterfaceC0381Op
    public final InterfaceC0355Np m0() {
        return new Y1(27, this);
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC2204x9
    public final /* bridge */ /* synthetic */ InterfaceC2204x9 y(InterfaceC1245ib interfaceC1245ib, int i, C0244Jh c0244Jh) {
        y(interfaceC1245ib, i, c0244Jh);
        return this;
    }
}
