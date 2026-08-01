package Y0;

import T.e;
import X0.d;
import X0.i;
import f1.p;
import g1.f;
import g1.l;

/* loaded from: classes.dex */
public final class c extends Z0.c {
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f1166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1167f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, i iVar, p pVar, d dVar2) {
        super(dVar, iVar);
        this.f1166e = pVar;
        this.f1167f = dVar2;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.d = 2;
            e.W(obj);
            return obj;
        }
        this.d = 1;
        e.W(obj);
        p pVar = this.f1166e;
        f.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        l.a(pVar);
        return pVar.d(this.f1167f, this);
    }
}
