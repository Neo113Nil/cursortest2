package a1;

import F1.l;
import Z0.i;
import b1.AbstractC0094c;
import h1.p;
import i1.f;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066c extends AbstractC0094c {

    /* renamed from: a, reason: collision with root package name */
    public int f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z0.d f1637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0066c(Z0.d dVar, i iVar, p pVar, Z0.d dVar2) {
        super(dVar, iVar);
        this.f1636b = pVar;
        this.f1637c = dVar2;
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1635a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f1635a = 2;
            l.n0(obj);
            return obj;
        }
        this.f1635a = 1;
        l.n0(obj);
        p pVar = this.f1636b;
        f.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        i1.l.a(pVar);
        return pVar.d(this.f1637c, this);
    }
}
