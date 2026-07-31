package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes11.dex */
public final class B2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C2 a;
    public final /* synthetic */ AbstractC4295qm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(C2 c2, AbstractC4295qm abstractC4295qm, Continuation continuation) {
        super(2, continuation);
        this.a = c2;
        this.b = abstractC4295qm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new B2(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new B2(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C2 c2 = this.a;
        AbstractC4295qm abstractC4295qm = this.b;
        int i = C2.h;
        c2.b(abstractC4295qm);
        return Unit.INSTANCE;
    }
}
