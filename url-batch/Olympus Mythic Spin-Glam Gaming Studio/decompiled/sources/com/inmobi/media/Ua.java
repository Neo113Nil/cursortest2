package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes12.dex */
public final class Ua extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ Xa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ua(Xa xa, Continuation continuation) {
        super(1, continuation);
        this.b = xa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Ua(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ua(this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Xa xa = this.b;
            xa.getClass();
            xa.b = new C4358t6("crash", (Y9) AbstractC3861aa.a.getValue(), xa, xa.a.getEventConfig(), null);
            Xa xa2 = this.b;
            this.a = 1;
            if (Xa.a(xa2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
