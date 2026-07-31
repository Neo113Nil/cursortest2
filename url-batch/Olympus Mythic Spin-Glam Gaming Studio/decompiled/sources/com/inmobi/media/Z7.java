package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes14.dex */
public final class Z7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3859a8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z7(C3859a8 c3859a8, Continuation continuation) {
        super(2, continuation);
        this.a = c3859a8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z7(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z7(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a.d.e()) {
            C3859a8 c3859a8 = this.a;
            c3859a8.b.setVolume(1.0f);
            X4.a(c3859a8.c, c3859a8.a, new W1(1.0f, false));
            c3859a8.e = false;
        } else {
            this.a.a();
        }
        return Unit.INSTANCE;
    }
}
