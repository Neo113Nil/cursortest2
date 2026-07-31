package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class A1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ C1 a;
    public final /* synthetic */ D1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(C1 c1, D1 d1, Continuation continuation) {
        super(1, continuation);
        this.a = c1;
        this.b = d1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new A1(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new A1(this.a, this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.a.a(this.b);
        return Unit.INSTANCE;
    }
}
