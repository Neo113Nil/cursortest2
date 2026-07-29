package o;

import java.util.LinkedHashMap;

/* renamed from: o.nB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1547nB extends AbstractC1415lB implements IB {
    public final ME l;
    public LinkedHashMap n;
    public M5 p;
    public long m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final C1613oB f201o = new C1613oB(this);
    public final LinkedHashMap q = new LinkedHashMap();

    public AbstractC1547nB(ME me) {
        this.l = me;
    }

    public static final void V(AbstractC1547nB abstractC1547nB, M5 m5) {
        C0782bY c0782bY;
        LinkedHashMap linkedHashMap;
        if (m5 != null) {
            abstractC1547nB.F(AbstractC0946e20.a(m5.n(), m5.l()));
            c0782bY = C0782bY.a;
        } else {
            c0782bY = null;
        }
        if (c0782bY == null) {
            abstractC1547nB.F(0L);
        }
        if (!AbstractC0048Bt.h(abstractC1547nB.p, m5) && m5 != null && ((((linkedHashMap = abstractC1547nB.n) != null && !linkedHashMap.isEmpty()) || !m5.k().isEmpty()) && !AbstractC0048Bt.h(m5.k(), abstractC1547nB.n))) {
            C0131Ey c0131Ey = abstractC1547nB.l.l.v.r;
            AbstractC0048Bt.k(c0131Ey);
            c0131Ey.q.f();
            LinkedHashMap linkedHashMap2 = abstractC1547nB.n;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC1547nB.n = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(m5.k());
        }
        abstractC1547nB.p = m5;
    }

    @Override // o.AbstractC0700aI
    public final void E(long j, float f, InterfaceC2114vp interfaceC2114vp) {
        X(j);
        if (this.g) {
            return;
        }
        W();
    }

    @Override // o.AbstractC1415lB
    public final AbstractC1415lB K() {
        ME me = this.l.m;
        if (me != null) {
            return me.f0();
        }
        return null;
    }

    @Override // o.AbstractC1415lB
    public final InterfaceC1991ty L() {
        return this.f201o;
    }

    @Override // o.AbstractC1415lB
    public final boolean M() {
        return this.p != null;
    }

    @Override // o.AbstractC1415lB
    public final EnumC2057uy N() {
        return this.l.l.r;
    }

    @Override // o.AbstractC1415lB
    public final C0027Ay O() {
        return this.l.l;
    }

    @Override // o.AbstractC1415lB
    public final M5 P() {
        M5 m5 = this.p;
        if (m5 != null) {
            return m5;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // o.AbstractC1415lB
    public final AbstractC1415lB Q() {
        ME me = this.l.n;
        if (me != null) {
            return me.f0();
        }
        return null;
    }

    @Override // o.AbstractC1415lB
    public final long R() {
        return this.m;
    }

    @Override // o.AbstractC1415lB
    public final void U() {
        E(this.m, 0.0f, null);
    }

    public void W() {
        P().r();
    }

    public final void X(long j) {
        if (this.m != j) {
            this.m = j;
            ME me = this.l;
            C0131Ey c0131Ey = me.l.v.r;
            if (c0131Ey != null) {
                c0131Ey.J();
            }
            AbstractC1415lB.S(me);
        }
        if (this.h) {
            return;
        }
        I(new C0831cI(P(), this));
    }

    public final long Y(AbstractC1547nB abstractC1547nB, boolean z) {
        long j = 0;
        AbstractC1547nB abstractC1547nB2 = this;
        while (!abstractC1547nB2.equals(abstractC1547nB)) {
            j = EB.L(j, abstractC1547nB2.m);
            ME me = abstractC1547nB2.l.n;
            AbstractC0048Bt.k(me);
            abstractC1547nB2 = me.f0();
            AbstractC0048Bt.k(abstractC1547nB2);
        }
        return j;
    }

    @Override // o.InterfaceC1119gh
    public final float c() {
        return this.l.c();
    }

    @Override // o.InterfaceC1119gh
    public final float f() {
        return this.l.f();
    }

    @Override // o.IB
    public final Object g() {
        this.l.g();
        return null;
    }
}
