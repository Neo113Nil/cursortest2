package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes12.dex */
public final class Kn extends SuspendLambda implements Function2 {
    public final /* synthetic */ On a;
    public final /* synthetic */ InterfaceC4057hk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kn(On on, InterfaceC4057hk interfaceC4057hk, Continuation continuation) {
        super(2, continuation);
        this.a = on;
        this.b = interfaceC4057hk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Kn(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Kn(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        On on = this.a;
        on.h = this.b;
        on.f.a(on.j);
        return Unit.INSTANCE;
    }
}
