package androidx.room;

import b1.AbstractC0099h;
import java.util.concurrent.Callable;
import q1.C0338d;
import q1.InterfaceC0351q;

/* loaded from: classes.dex */
public final class e extends AbstractC0099h implements h1.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f2054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0338d f2055c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Callable callable, C0338d c0338d, Z0.d dVar) {
        super(dVar);
        this.f2054b = callable;
        this.f2055c = c0338d;
    }

    @Override // b1.AbstractC0092a
    public final Z0.d create(Object obj, Z0.d dVar) {
        return new e(this.f2054b, this.f2055c, dVar);
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        e eVar = (e) create((InterfaceC0351q) obj, (Z0.d) obj2);
        V0.i iVar = V0.i.f1250a;
        eVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        C0338d c0338d = this.f2055c;
        F1.l.n0(obj);
        try {
            c0338d.resumeWith(this.f2054b.call());
        } catch (Throwable th) {
            c0338d.resumeWith(F1.l.t(th));
        }
        return V0.i.f1250a;
    }
}
