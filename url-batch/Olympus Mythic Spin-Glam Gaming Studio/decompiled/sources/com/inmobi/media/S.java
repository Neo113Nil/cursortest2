package com.inmobi.media;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
public final class S extends SuspendLambda implements Function1 {
    public final /* synthetic */ U a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u, Continuation continuation) {
        super(1, continuation);
        this.a = u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new S(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new S(this.a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a = P3.a(new Q(this.a));
        U u = this.a;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
        if (m8026exceptionOrNullimpl != null) {
            u.a(m8026exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
