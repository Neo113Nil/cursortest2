package o1;

/* loaded from: classes.dex */
public final class T extends S {

    /* renamed from: e, reason: collision with root package name */
    public final W f3292e;

    /* renamed from: f, reason: collision with root package name */
    public final U f3293f;

    /* renamed from: g, reason: collision with root package name */
    public final C0292i f3294g;
    public final Object h;

    public T(W w2, U u2, C0292i c0292i, Object obj) {
        this.f3292e = w2;
        this.f3293f = u2;
        this.f3294g = c0292i;
        this.h = obj;
    }

    @Override // f1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return U0.i.f870a;
    }

    @Override // o1.S
    public final void o(Throwable th) {
        C0292i c0292i = this.f3294g;
        W w2 = this.f3292e;
        w2.getClass();
        C0292i C2 = W.C(c0292i);
        U u2 = this.f3293f;
        Object obj = this.h;
        if (C2 != null) {
            while (AbstractC0302t.g(C2.f3318e, false, new T(w2, u2, C2, obj), 1) == Y.f3303a) {
                C2 = W.C(C2);
                if (C2 == null) {
                }
            }
            return;
        }
        w2.f(w2.r(u2, obj));
    }
}
