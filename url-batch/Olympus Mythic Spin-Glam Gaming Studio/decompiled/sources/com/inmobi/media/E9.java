package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class E9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ F9 b;
    public final /* synthetic */ AbstractC3866af c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E9(F9 f9, AbstractC3866af abstractC3866af, Continuation continuation) {
        super(2, continuation);
        this.b = f9;
        this.c = abstractC3866af;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E9(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E9(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        F4 f4 = this.b.a;
        AbstractC3866af abstractC3866af = this.c;
        this.a = 1;
        Object a = f4.a(abstractC3866af, this);
        return a == coroutine_suspended ? coroutine_suspended : a;
    }
}
