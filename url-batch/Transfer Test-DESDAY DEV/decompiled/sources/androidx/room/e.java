package androidx.room;

import java.util.concurrent.Callable;
import o1.C0288e;

/* loaded from: classes.dex */
public final class e extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callable f1675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0288e f1676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Callable callable, C0288e c0288e, X0.d dVar) {
        super(dVar);
        this.f1675e = callable;
        this.f1676f = c0288e;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new e(this.f1675e, this.f1676f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        e eVar = (e) a((o1.r) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f870a;
        eVar.i(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        C0288e c0288e = this.f1676f;
        T.e.W(obj);
        try {
            c0288e.b(this.f1675e.call());
        } catch (Throwable th) {
            c0288e.b(T.e.s(th));
        }
        return U0.i.f870a;
    }
}
