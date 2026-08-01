package q1;

/* loaded from: classes.dex */
public final class e0 extends u1.q {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f3894e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(Z0.d dVar, Z0.i iVar) {
        super(dVar, iVar.f(r0) == null ? iVar.h(r0) : iVar);
        f0 f0Var = f0.f3896a;
        this.f3894e = new ThreadLocal();
        if (dVar.getContext().f(Z0.e.f1557a) instanceof AbstractC0349o) {
            return;
        }
        Object g2 = u1.a.g(iVar, null);
        u1.a.b(iVar, g2);
        I(iVar, g2);
    }

    public final boolean H() {
        boolean z2 = this.threadLocalIsSet && this.f3894e.get() == null;
        this.f3894e.remove();
        return !z2;
    }

    public final void I(Z0.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f3894e.set(new V0.d(iVar, obj));
    }

    @Override // u1.q, q1.U
    public final void e(Object obj) {
        if (this.threadLocalIsSet) {
            V0.d dVar = (V0.d) this.f3894e.get();
            if (dVar != null) {
                u1.a.b((Z0.i) dVar.f1243a, dVar.f1244b);
            }
            this.f3894e.remove();
        }
        Object h = AbstractC0352s.h(obj);
        Z0.d dVar2 = this.d;
        Z0.i context = dVar2.getContext();
        Object g2 = u1.a.g(context, null);
        e0 k2 = g2 != u1.a.f4177e ? AbstractC0352s.k(dVar2, context, g2) : null;
        try {
            this.d.resumeWith(h);
        } finally {
            if (k2 == null || k2.H()) {
                u1.a.b(context, g2);
            }
        }
    }
}
