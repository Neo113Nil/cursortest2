package androidx.lifecycle;

import o1.AbstractC0302t;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074o implements r, o1.r {

    /* renamed from: a, reason: collision with root package name */
    public final v f1524a;

    /* renamed from: b, reason: collision with root package name */
    public final X0.i f1525b;

    public C0074o(v vVar, X0.i iVar) {
        g1.f.e(iVar, "coroutineContext");
        this.f1524a = vVar;
        this.f1525b = iVar;
        if (vVar.d == EnumC0072m.f1517a) {
            AbstractC0302t.a(iVar, null);
        }
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0071l enumC0071l) {
        v vVar = this.f1524a;
        if (vVar.d.compareTo(EnumC0072m.f1517a) <= 0) {
            vVar.f(this);
            AbstractC0302t.a(this.f1525b, null);
        }
    }

    @Override // o1.r
    public final X0.i c() {
        return this.f1525b;
    }
}
