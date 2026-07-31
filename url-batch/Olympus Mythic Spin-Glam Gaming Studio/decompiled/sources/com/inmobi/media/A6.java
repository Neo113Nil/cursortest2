package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class A6 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ C6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A6(C6 c6, Continuation continuation) {
        super(1, continuation);
        this.b = c6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new A6(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new A6(this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C6 c6 = this.b;
                this.a = 1;
                if (C6.a(c6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.toString();
        }
        return Unit.INSTANCE;
    }
}
