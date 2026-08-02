package k0;

/* loaded from: classes.dex */
public final class P extends O {

    /* renamed from: f, reason: collision with root package name */
    public final T f838f;

    /* renamed from: g, reason: collision with root package name */
    public final Q f839g;

    /* renamed from: h, reason: collision with root package name */
    public final C0050i f840h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f841i;

    public P(T t2, Q q2, C0050i c0050i, Object obj) {
        this.f838f = t2;
        this.f839g = q2;
        this.f840h = c0050i;
        this.f841i = obj;
    }

    @Override // d0.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return U.g.f378a;
    }

    @Override // k0.O
    public final void o(Throwable th) {
        C0050i c0050i = this.f840h;
        T t2 = this.f838f;
        t2.getClass();
        C0050i D2 = T.D(c0050i);
        Q q2 = this.f839g;
        Object obj = this.f841i;
        if (D2 != null) {
            while (AbstractC0060t.d(D2.f866f, false, new P(t2, q2, D2, obj), 1) == V.f852b) {
                D2 = T.D(D2);
                if (D2 == null) {
                }
            }
            return;
        }
        t2.m(t2.u(q2, obj));
    }
}
