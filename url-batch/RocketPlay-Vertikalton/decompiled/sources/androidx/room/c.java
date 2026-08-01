package androidx.room;

import b1.AbstractC0099h;
import java.util.concurrent.Callable;
import q1.InterfaceC0351q;

/* loaded from: classes.dex */
public final class c extends AbstractC0099h implements h1.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f2051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Callable callable, Z0.d dVar) {
        super(dVar);
        this.f2051b = callable;
    }

    @Override // b1.AbstractC0092a
    public final Z0.d create(Object obj, Z0.d dVar) {
        return new c(this.f2051b, dVar);
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        return ((c) create((InterfaceC0351q) obj, (Z0.d) obj2)).invokeSuspend(V0.i.f1250a);
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        F1.l.n0(obj);
        return this.f2051b.call();
    }
}
