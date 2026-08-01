package o1;

/* loaded from: classes.dex */
public final class g0 extends s1.q {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f3316e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(X0.d dVar, X0.i iVar) {
        super(dVar, iVar.j(r0) == null ? iVar.m(r0) : iVar);
        h0 h0Var = h0.f3317a;
        this.f3316e = new ThreadLocal();
        if (dVar.h().j(X0.e.f935a) instanceof AbstractC0299p) {
            return;
        }
        Object g2 = s1.a.g(iVar, null);
        s1.a.b(iVar, g2);
        K(iVar, g2);
    }

    public final boolean J() {
        boolean z2 = this.threadLocalIsSet && this.f3316e.get() == null;
        this.f3316e.remove();
        return !z2;
    }

    public final void K(X0.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f3316e.set(new U0.d(iVar, obj));
    }

    @Override // s1.q, o1.W
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            U0.d dVar = (U0.d) this.f3316e.get();
            if (dVar != null) {
                s1.a.b((X0.i) dVar.f863a, dVar.f864b);
            }
            this.f3316e.remove();
        }
        Object j2 = AbstractC0302t.j(obj);
        X0.d dVar2 = this.d;
        X0.i h = dVar2.h();
        Object g2 = s1.a.g(h, null);
        g0 m2 = g2 != s1.a.f3690e ? AbstractC0302t.m(dVar2, h, g2) : null;
        try {
            this.d.b(j2);
        } finally {
            if (m2 == null || m2.J()) {
                s1.a.b(h, g2);
            }
        }
    }
}
