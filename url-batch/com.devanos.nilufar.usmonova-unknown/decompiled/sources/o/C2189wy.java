package o;

/* renamed from: o.wy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2189wy extends AbstractC1547nB {
    public final /* synthetic */ C2255xy r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2189wy(C2255xy c2255xy) {
        super(c2255xy);
        this.r = c2255xy;
    }

    @Override // o.AbstractC1415lB
    public final int H(AbstractC2248xr abstractC2248xr) {
        int d = AbstractC1052fg.d(this, abstractC2248xr);
        this.q.put(abstractC2248xr, Integer.valueOf(d));
        return d;
    }

    @Override // o.IB
    public final AbstractC0700aI a(long j) {
        G(j);
        new C0603Xd(j);
        C2255xy c2255xy = this.r;
        InterfaceC2123vy interfaceC2123vy = c2255xy.H;
        ME me = c2255xy.m;
        AbstractC0048Bt.k(me);
        AbstractC1547nB f0 = me.f0();
        AbstractC0048Bt.k(f0);
        AbstractC1547nB.V(this, interfaceC2123vy.d(this, f0, j));
        return this;
    }
}
