package o;

/* renamed from: o.tW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1963tW extends SD {

    /* renamed from: o, reason: collision with root package name */
    public final SD f226o;
    public final boolean p;
    public final boolean q;
    public InterfaceC2114vp r;
    public InterfaceC2114vp s;
    public final long t;

    public C1963tW(SD sd, InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2, boolean z, boolean z2) {
        super(0, C1959tS.l, AbstractC2025uS.l(interfaceC2114vp, (sd == null || (r0 = sd.f()) == null) ? ((C0201Hq) AbstractC2025uS.i.get()).e : r0, z), AbstractC2025uS.b(interfaceC2114vp2, (sd == null || (r0 = sd.i()) == null) ? ((C0201Hq) AbstractC2025uS.i.get()).f : r0));
        InterfaceC2114vp i;
        InterfaceC2114vp f;
        this.f226o = sd;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = AbstractC0868ct.p();
    }

    @Override // o.SD
    public final void A(QD qd) {
        PO.q();
        throw null;
    }

    @Override // o.SD
    public final SD B(InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2) {
        InterfaceC2114vp l = AbstractC2025uS.l(interfaceC2114vp, this.r, true);
        InterfaceC2114vp b = AbstractC2025uS.b(interfaceC2114vp2, this.s);
        return !this.p ? new C1963tW(C().B(null, b), l, b, false, true) : C().B(l, b);
    }

    public final SD C() {
        SD sd = this.f226o;
        return sd == null ? (SD) AbstractC2025uS.i.get() : sd;
    }

    @Override // o.SD, o.AbstractC1696pS
    public final void c() {
        SD sd;
        this.c = true;
        if (!this.q || (sd = this.f226o) == null) {
            return;
        }
        sd.c();
    }

    @Override // o.AbstractC1696pS
    public final int d() {
        return C().d();
    }

    @Override // o.AbstractC1696pS
    public final C1959tS e() {
        return C().e();
    }

    @Override // o.SD, o.AbstractC1696pS
    public final InterfaceC2114vp f() {
        return this.r;
    }

    @Override // o.SD, o.AbstractC1696pS
    public final boolean g() {
        return C().g();
    }

    @Override // o.SD, o.AbstractC1696pS
    public final int h() {
        return C().h();
    }

    @Override // o.SD, o.AbstractC1696pS
    public final InterfaceC2114vp i() {
        return this.s;
    }

    @Override // o.SD, o.AbstractC1696pS
    public final void k() {
        PO.q();
        throw null;
    }

    @Override // o.SD, o.AbstractC1696pS
    public final void l() {
        PO.q();
        throw null;
    }

    @Override // o.SD, o.AbstractC1696pS
    public final void m() {
        C().m();
    }

    @Override // o.SD, o.AbstractC1696pS
    public final void n(GT gt) {
        C().n(gt);
    }

    @Override // o.AbstractC1696pS
    public final void q(int i) {
        PO.q();
        throw null;
    }

    @Override // o.AbstractC1696pS
    public final void r(C1959tS c1959tS) {
        PO.q();
        throw null;
    }

    @Override // o.SD, o.AbstractC1696pS
    public final void s(int i) {
        C().s(i);
    }

    @Override // o.SD, o.AbstractC1696pS
    public final AbstractC1696pS t(InterfaceC2114vp interfaceC2114vp) {
        InterfaceC2114vp l = AbstractC2025uS.l(interfaceC2114vp, this.r, true);
        return !this.p ? AbstractC2025uS.h(C().t(null), l, true) : C().t(l);
    }

    @Override // o.SD
    public final AbstractC0772bO v() {
        return C().v();
    }

    @Override // o.SD
    public final QD w() {
        return C().w();
    }

    @Override // o.SD
    /* renamed from: x */
    public final InterfaceC2114vp f() {
        return this.r;
    }
}
