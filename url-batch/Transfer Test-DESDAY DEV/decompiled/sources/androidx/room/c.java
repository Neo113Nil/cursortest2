package androidx.room;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callable f1672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Callable callable, X0.d dVar) {
        super(dVar);
        this.f1672e = callable;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new c(this.f1672e, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((c) a((o1.r) obj, (X0.d) obj2)).i(U0.i.f870a);
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        T.e.W(obj);
        return this.f1672e.call();
    }
}
