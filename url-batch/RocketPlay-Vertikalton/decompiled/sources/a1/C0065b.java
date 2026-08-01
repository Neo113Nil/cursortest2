package a1;

import F1.l;
import b1.AbstractC0098g;
import h1.p;
import i1.f;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065b extends AbstractC0098g {

    /* renamed from: a, reason: collision with root package name */
    public int f1632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z0.d f1634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0065b(Z0.d dVar, Z0.d dVar2, p pVar) {
        super(dVar);
        this.f1633b = pVar;
        this.f1634c = dVar2;
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1632a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f1632a = 2;
            l.n0(obj);
            return obj;
        }
        this.f1632a = 1;
        l.n0(obj);
        p pVar = this.f1633b;
        f.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        i1.l.a(pVar);
        return pVar.d(this.f1634c, this);
    }
}
