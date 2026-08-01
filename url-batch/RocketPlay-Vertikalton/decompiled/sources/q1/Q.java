package q1;

/* loaded from: classes.dex */
public final class Q extends P {

    /* renamed from: e, reason: collision with root package name */
    public final U f3873e;

    /* renamed from: f, reason: collision with root package name */
    public final S f3874f;

    /* renamed from: g, reason: collision with root package name */
    public final C0342h f3875g;
    public final Object h;

    public Q(U u2, S s2, C0342h c0342h, Object obj) {
        this.f3873e = u2;
        this.f3874f = s2;
        this.f3875g = c0342h;
        this.h = obj;
    }

    @Override // h1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return V0.i.f1250a;
    }

    @Override // q1.P
    public final void o(Throwable th) {
        C0342h c0342h = this.f3875g;
        U u2 = this.f3873e;
        u2.getClass();
        C0342h A2 = U.A(c0342h);
        S s2 = this.f3874f;
        Object obj = this.h;
        if (A2 != null) {
            while (AbstractC0352s.e(A2.f3897e, false, new Q(u2, s2, A2, obj), 1) == W.f3884a) {
                A2 = U.A(A2);
                if (A2 == null) {
                }
            }
            return;
        }
        u2.d(u2.p(s2, obj));
    }
}
