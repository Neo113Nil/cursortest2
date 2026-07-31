package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
public final class Th extends SuspendLambda implements Function1 {
    public final /* synthetic */ Xh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Th(Xh xh, Continuation continuation) {
        super(1, continuation);
        this.a = xh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Th(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Th(this.a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.k.getAndIncrement();
        this.a.getClass();
        this.a.a(false);
        return Unit.INSTANCE;
    }
}
