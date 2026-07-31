package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes12.dex */
public final class Ij extends SuspendLambda implements Function2 {
    public C3897bk a;
    public int b;
    public final /* synthetic */ Mj c;
    public final /* synthetic */ Qi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ij(Mj mj, Qi qi, Continuation continuation) {
        super(2, continuation);
        this.c = mj;
        this.d = qi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ij(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ij(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C3897bk c3897bk = this.a;
            ResultKt.throwOnFailure(obj);
            return c3897bk;
        }
        ResultKt.throwOnFailure(obj);
        C3897bk c3897bk2 = new C3897bk(this.c.a);
        Mj mj = this.c;
        String str = this.d.a;
        this.a = c3897bk2;
        this.b = 1;
        return Mj.a(mj, str, c3897bk2, this) == coroutine_suspended ? coroutine_suspended : c3897bk2;
    }
}
