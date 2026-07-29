package o;

/* renamed from: o.iE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222iE extends AbstractC1696pS {
    public final InterfaceC2114vp e;
    public final AbstractC1696pS f;

    public C1222iE(int i, C1959tS c1959tS, InterfaceC2114vp interfaceC2114vp, AbstractC1696pS abstractC1696pS) {
        super(i, c1959tS);
        this.e = interfaceC2114vp;
        this.f = abstractC1696pS;
        abstractC1696pS.k();
    }

    @Override // o.AbstractC1696pS
    public final void c() {
        AbstractC1696pS abstractC1696pS = this.f;
        if (this.c) {
            return;
        }
        if (this.b != abstractC1696pS.d()) {
            a();
        }
        abstractC1696pS.l();
        this.c = true;
        synchronized (AbstractC2025uS.b) {
            int i = this.d;
            if (i >= 0) {
                AbstractC2025uS.s(i);
                this.d = -1;
            }
        }
    }

    @Override // o.AbstractC1696pS
    public final InterfaceC2114vp f() {
        return this.e;
    }

    @Override // o.AbstractC1696pS
    public final boolean g() {
        return true;
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
    public final void n(GT gt) {
        C0950e6 c0950e6 = AbstractC2025uS.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // o.AbstractC1696pS
    public final AbstractC1696pS t(InterfaceC2114vp interfaceC2114vp) {
        return new C1222iE(this.b, this.a, AbstractC2025uS.l(interfaceC2114vp, this.e, true), this.f);
    }

    @Override // o.AbstractC1696pS
    public final void m() {
    }
}
