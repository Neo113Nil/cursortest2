package o;

/* loaded from: classes.dex */
public final class FL extends AbstractC1696pS {
    public final InterfaceC2114vp e;
    public int f;

    public FL(int i, C1959tS c1959tS, InterfaceC2114vp interfaceC2114vp) {
        super(i, c1959tS);
        this.e = interfaceC2114vp;
        this.f = 1;
    }

    @Override // o.AbstractC1696pS
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // o.AbstractC1696pS
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // o.AbstractC1696pS
    public final void n(GT gt) {
        C0950e6 c0950e6 = AbstractC2025uS.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // o.AbstractC1696pS
    public final AbstractC1696pS t(InterfaceC2114vp interfaceC2114vp) {
        AbstractC2025uS.d(this);
        return new C1222iE(this.b, this.a, AbstractC2025uS.l(interfaceC2114vp, this.e, true), this);
    }

    @Override // o.AbstractC1696pS
    public final void m() {
    }
}
