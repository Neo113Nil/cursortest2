package com.ogury.ad.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public final class od extends SuspendLambda implements Function2 {
    public final /* synthetic */ ke a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(ke keVar, Continuation continuation) {
        super(2, continuation);
        this.a = keVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new od(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new od(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BuildersKt.runBlocking(Dispatchers.getIO(), new ud(this.a, 0L, null));
        return Unit.INSTANCE;
    }
}
