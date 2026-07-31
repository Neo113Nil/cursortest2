package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes13.dex */
public final class Re extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ StateFlow c;
    public final /* synthetic */ Function1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Re(StateFlow stateFlow, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.c = stateFlow;
        this.d = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Re re = new Re(this.c, continuation, this.d);
        re.b = obj;
        return re;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Re) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            StateFlow stateFlow = this.c;
            Qe qe = new Qe(coroutineScope, this.d);
            this.a = 1;
            if (stateFlow.collect(qe, this) == coroutine_suspended) {
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
