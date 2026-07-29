package o;

/* renamed from: o.oB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1613oB implements InterfaceC1991ty {
    public final AbstractC1547nB b;

    public C1613oB(AbstractC1547nB abstractC1547nB) {
        this.b = abstractC1547nB;
    }

    public final long a(InterfaceC1991ty interfaceC1991ty, long j) {
        boolean z = interfaceC1991ty instanceof C1613oB;
        AbstractC1547nB abstractC1547nB = this.b;
        if (!z) {
            AbstractC1547nB t = AbstractC0022At.t(abstractC1547nB);
            long a = a(t.f201o, j);
            ME me = t.l;
            me.getClass();
            return BF.f(a, me.p0(interfaceC1991ty, 0L));
        }
        AbstractC1547nB abstractC1547nB2 = ((C1613oB) interfaceC1991ty).b;
        ME me2 = abstractC1547nB2.l;
        me2.r0();
        AbstractC1547nB f0 = abstractC1547nB.l.d0(me2).f0();
        if (f0 != null) {
            long I = EB.I(EB.L(abstractC1547nB2.Y(f0, false), (Math.round(BF.c(j)) & 4294967295L) | (Math.round(BF.b(j)) << 32)), abstractC1547nB.Y(f0, false));
            return PX.h((int) (I >> 32), (int) (I & 4294967295L));
        }
        AbstractC1547nB t2 = AbstractC0022At.t(abstractC1547nB2);
        long L = EB.L(EB.L(abstractC1547nB2.Y(t2, false), t2.m), (Math.round(BF.c(j)) & 4294967295L) | (Math.round(BF.b(j)) << 32));
        AbstractC1547nB t3 = AbstractC0022At.t(abstractC1547nB);
        long I2 = EB.I(L, EB.L(abstractC1547nB.Y(t3, false), t3.m));
        long h = PX.h((int) (I2 >> 32), (int) (I2 & 4294967295L));
        ME me3 = t3.l.n;
        AbstractC0048Bt.k(me3);
        ME me4 = t2.l.n;
        AbstractC0048Bt.k(me4);
        return me3.p0(me4, h);
    }

    @Override // o.InterfaceC1991ty
    public final C1032fM d(InterfaceC1991ty interfaceC1991ty, boolean z) {
        return this.b.l.d(interfaceC1991ty, z);
    }

    @Override // o.InterfaceC1991ty
    public final long e(long j) {
        AbstractC1547nB abstractC1547nB = this.b;
        ME me = abstractC1547nB.l;
        AbstractC1547nB t = AbstractC0022At.t(abstractC1547nB);
        return me.e(BF.f(j, BF.e(a(t.f201o, 0L), abstractC1547nB.l.p0(t.l, 0L))));
    }

    @Override // o.InterfaceC1991ty
    public final InterfaceC1991ty h() {
        AbstractC1547nB f0;
        if (!u()) {
            AbstractC0868ct.W("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        ME me = ((ME) this.b.l.l.u.d).n;
        if (me == null || (f0 = me.f0()) == null) {
            return null;
        }
        return f0.f201o;
    }

    @Override // o.InterfaceC1991ty
    public final boolean u() {
        return this.b.l.h0().m;
    }

    @Override // o.InterfaceC1991ty
    public final long y() {
        AbstractC1547nB abstractC1547nB = this.b;
        return AbstractC0946e20.a(abstractC1547nB.b, abstractC1547nB.c);
    }
}
