package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4472xe extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ge a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4472xe(Ge ge, Continuation continuation) {
        super(2, continuation);
        this.a = ge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4472xe(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4472xe(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.h.onVideoPaused();
        return Unit.INSTANCE;
    }
}
