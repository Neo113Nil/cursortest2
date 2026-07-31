package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes11.dex */
public final class O7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ V7 b;
    public final /* synthetic */ AbstractC4295qm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O7(V7 v7, AbstractC4295qm abstractC4295qm, Continuation continuation) {
        super(2, continuation);
        this.b = v7;
        this.c = abstractC4295qm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new O7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new O7(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.b.m;
            AbstractC4295qm abstractC4295qm = this.c;
            this.a = 1;
            if (mutableSharedFlow.emit(abstractC4295qm, this) == coroutine_suspended) {
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
