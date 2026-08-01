package o1;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0284a extends W implements X0.d, r {

    /* renamed from: c, reason: collision with root package name */
    public final X0.i f3304c;

    public AbstractC0284a(X0.i iVar, boolean z2) {
        super(z2);
        z((O) iVar.j(C0300q.f3334b));
        this.f3304c = iVar.m(this);
    }

    @Override // o1.W
    public final void E(Object obj) {
        if (obj instanceof C0294k) {
            C0294k c0294k = (C0294k) obj;
            Throwable th = c0294k.f3324a;
            c0294k.getClass();
            C0294k.f3323b.get(c0294k);
        }
    }

    @Override // X0.d
    public final void b(Object obj) {
        Throwable a2 = U0.f.a(obj);
        if (a2 != null) {
            obj = new C0294k(a2, false);
        }
        Object B2 = B(obj);
        if (B2 == AbstractC0302t.d) {
            return;
        }
        g(B2);
    }

    @Override // o1.r
    public final X0.i c() {
        return this.f3304c;
    }

    @Override // X0.d
    public final X0.i h() {
        return this.f3304c;
    }

    @Override // o1.W
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // o1.W
    public final void y(U0.c cVar) {
        AbstractC0302t.f(this.f3304c, cVar);
    }
}
