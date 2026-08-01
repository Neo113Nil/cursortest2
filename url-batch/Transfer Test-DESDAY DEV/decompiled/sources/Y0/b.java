package Y0;

import T.e;
import X0.d;
import Z0.g;
import f1.p;
import g1.f;
import g1.l;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public int f1164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f1165c;
    public final /* synthetic */ d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, d dVar2, p pVar) {
        super(dVar);
        this.f1165c = pVar;
        this.d = dVar2;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        int i = this.f1164b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f1164b = 2;
            e.W(obj);
            return obj;
        }
        this.f1164b = 1;
        e.W(obj);
        p pVar = this.f1165c;
        f.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        l.a(pVar);
        return pVar.d(this.d, this);
    }
}
