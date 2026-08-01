package androidx.lifecycle;

import q1.AbstractC0352s;
import q1.InterfaceC0351q;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082o implements r, InterfaceC0351q {

    /* renamed from: a, reason: collision with root package name */
    public final v f1903a;

    /* renamed from: b, reason: collision with root package name */
    public final Z0.i f1904b;

    public C0082o(v vVar, Z0.i iVar) {
        i1.f.e(iVar, "coroutineContext");
        this.f1903a = vVar;
        this.f1904b = iVar;
        if (vVar.d == EnumC0080m.f1896a) {
            AbstractC0352s.a(iVar, null);
        }
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0079l enumC0079l) {
        v vVar = this.f1903a;
        if (vVar.d.compareTo(EnumC0080m.f1896a) <= 0) {
            vVar.f(this);
            AbstractC0352s.a(this.f1904b, null);
        }
    }

    @Override // q1.InterfaceC0351q
    public final Z0.i b() {
        return this.f1904b;
    }
}
