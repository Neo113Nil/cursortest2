package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes12.dex */
public final class W4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ MutableSharedFlow b;
    public final /* synthetic */ AbstractC4233oc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W4(MutableSharedFlow mutableSharedFlow, AbstractC4233oc abstractC4233oc, Continuation continuation) {
        super(2, continuation);
        this.b = mutableSharedFlow;
        this.c = abstractC4233oc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new W4(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new W4(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.b;
            AbstractC4233oc abstractC4233oc = this.c;
            this.a = 1;
            if (mutableSharedFlow.emit(abstractC4233oc, this) == coroutine_suspended) {
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
