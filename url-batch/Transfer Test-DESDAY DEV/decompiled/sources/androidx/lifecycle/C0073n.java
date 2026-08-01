package androidx.lifecycle;

import o1.AbstractC0302t;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073n extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0074o f1523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073n(C0074o c0074o, X0.d dVar) {
        super(dVar);
        this.f1523f = c0074o;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        C0073n c0073n = new C0073n(this.f1523f, dVar);
        c0073n.f1522e = obj;
        return c0073n;
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        C0073n c0073n = (C0073n) a((o1.r) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f870a;
        c0073n.i(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        T.e.W(obj);
        o1.r rVar = (o1.r) this.f1522e;
        C0074o c0074o = this.f1523f;
        v vVar = c0074o.f1524a;
        if (vVar.d.compareTo(EnumC0072m.f1518b) >= 0) {
            vVar.a(c0074o);
        } else {
            AbstractC0302t.a(rVar.c(), null);
        }
        return U0.i.f870a;
    }
}
