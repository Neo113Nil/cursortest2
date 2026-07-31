package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes12.dex */
public final class Vd extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Wd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vd(Wd wd, Continuation continuation) {
        super(2, continuation);
        this.c = wd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Vd vd = new Vd(this.c, continuation);
        vd.b = obj;
        return vd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Vd vd = new Vd(this.c, (Continuation) obj2);
        vd.b = (ProducerScope) obj;
        return vd.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.b;
            Wd wd = this.c;
            MutableSharedFlow mutableSharedFlow = wd.a.a;
            Ud ud = new Ud(wd, producerScope);
            this.a = 1;
            if (mutableSharedFlow.collect(ud, this) == coroutine_suspended) {
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
