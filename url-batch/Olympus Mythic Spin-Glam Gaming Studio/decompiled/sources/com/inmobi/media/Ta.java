package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
public final class Ta extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ Xa b;
    public final /* synthetic */ Q2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ta(Xa xa, Q2 q2, Continuation continuation) {
        super(1, continuation);
        this.b = xa;
        this.c = q2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Ta(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ta(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Xa xa = this.b;
            Q2 q2 = this.c;
            this.a = 1;
            if (Xa.a(xa, q2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.b.a();
        return Unit.INSTANCE;
    }
}
