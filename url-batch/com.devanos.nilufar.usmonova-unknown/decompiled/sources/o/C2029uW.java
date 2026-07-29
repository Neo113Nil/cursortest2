package o;

/* renamed from: o.uW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2029uW extends AbstractC1696pS {
    public final AbstractC1696pS e;
    public final boolean f;
    public InterfaceC2114vp g;
    public final long h;

    public C2029uW(AbstractC1696pS abstractC1696pS, InterfaceC2114vp interfaceC2114vp, boolean z) {
        super(0, C1959tS.l);
        InterfaceC2114vp f;
        this.e = abstractC1696pS;
        this.f = z;
        this.g = AbstractC2025uS.l(interfaceC2114vp, (abstractC1696pS == null || (f = abstractC1696pS.f()) == null) ? ((C0201Hq) AbstractC2025uS.i.get()).e : f, false);
        this.h = AbstractC0868ct.p();
    }

    @Override // o.AbstractC1696pS
    public final void c() {
        AbstractC1696pS abstractC1696pS;
        this.c = true;
        if (!this.f || (abstractC1696pS = this.e) == null) {
            return;
        }
        abstractC1696pS.c();
    }

    @Override // o.AbstractC1696pS
    public final int d() {
        return u().d();
    }

    @Override // o.AbstractC1696pS
    public final C1959tS e() {
        return u().e();
    }

    @Override // o.AbstractC1696pS
    public final InterfaceC2114vp f() {
        return this.g;
    }

    @Override // o.AbstractC1696pS
    public final boolean g() {
        return u().g();
    }

    @Override // o.AbstractC1696pS
    public final InterfaceC2114vp i() {
        return null;
    }

    @Override // o.AbstractC1696pS
    public final void k() {
        PO.q();
        throw null;
    }

    @Override // o.AbstractC1696pS
    public final void l() {
        PO.q();
        throw null;
    }

    @Override // o.AbstractC1696pS
    public final void m() {
        u().m();
    }

    @Override // o.AbstractC1696pS
    public final void n(GT gt) {
        u().n(gt);
    }

    @Override // o.AbstractC1696pS
    public final AbstractC1696pS t(InterfaceC2114vp interfaceC2114vp) {
        return AbstractC2025uS.h(u().t(null), AbstractC2025uS.l(interfaceC2114vp, this.g, true), true);
    }

    public final AbstractC1696pS u() {
        AbstractC1696pS abstractC1696pS = this.e;
        return abstractC1696pS == null ? (AbstractC1696pS) AbstractC2025uS.i.get() : abstractC1696pS;
    }
}
