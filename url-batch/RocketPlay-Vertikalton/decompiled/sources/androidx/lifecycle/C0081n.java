package androidx.lifecycle;

import b1.AbstractC0099h;
import q1.AbstractC0352s;
import q1.InterfaceC0351q;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081n extends AbstractC0099h implements h1.p {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0082o f1902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081n(C0082o c0082o, Z0.d dVar) {
        super(dVar);
        this.f1902c = c0082o;
    }

    @Override // b1.AbstractC0092a
    public final Z0.d create(Object obj, Z0.d dVar) {
        C0081n c0081n = new C0081n(this.f1902c, dVar);
        c0081n.f1901b = obj;
        return c0081n;
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        C0081n c0081n = (C0081n) create((InterfaceC0351q) obj, (Z0.d) obj2);
        V0.i iVar = V0.i.f1250a;
        c0081n.invokeSuspend(iVar);
        return iVar;
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        F1.l.n0(obj);
        InterfaceC0351q interfaceC0351q = (InterfaceC0351q) this.f1901b;
        C0082o c0082o = this.f1902c;
        v vVar = c0082o.f1903a;
        if (vVar.d.compareTo(EnumC0080m.f1897b) >= 0) {
            vVar.a(c0082o);
        } else {
            AbstractC0352s.a(interfaceC0351q.b(), null);
        }
        return V0.i.f1250a;
    }
}
