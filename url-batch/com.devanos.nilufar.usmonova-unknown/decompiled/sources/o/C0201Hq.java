package o;

/* renamed from: o.Hq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201Hq extends SD {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0201Hq(int i, C1959tS c1959tS) {
        super(i, c1959tS, null, r2);
        InterfaceC2114vp interfaceC2114vp;
        synchronized (AbstractC2025uS.b) {
            ?? r1 = AbstractC2025uS.h;
            interfaceC2114vp = (InterfaceC2114vp) AbstractC0720ac.F0(r1);
            interfaceC2114vp = interfaceC2114vp == null ? new C1400l(17, r1) : interfaceC2114vp;
        }
    }

    @Override // o.SD
    public final SD B(InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2) {
        return (SD) ((AbstractC1696pS) AbstractC2025uS.f(new C2084vL(new C0149Fq(interfaceC2114vp, interfaceC2114vp2, 0))));
    }

    @Override // o.SD, o.AbstractC1696pS
    public final void c() {
        synchronized (AbstractC2025uS.b) {
            int i = this.d;
            if (i >= 0) {
                AbstractC2025uS.s(i);
                this.d = -1;
            }
        }
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
        AbstractC2025uS.a();
    }

    @Override // o.SD, o.AbstractC1696pS
    public final AbstractC1696pS t(InterfaceC2114vp interfaceC2114vp) {
        return (AbstractC1696pS) AbstractC2025uS.f(new C2084vL(new C0175Gq(interfaceC2114vp, 0)));
    }

    @Override // o.SD
    public final AbstractC0772bO v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
