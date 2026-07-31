package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.fl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4005fl extends SuspendLambda implements Function1 {
    public C4005fl(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4005fl(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4005fl((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (C4084il.b.b.get() != null && (deferred = C4084il.d) != null) {
            Job.DefaultImpls.cancel$default(deferred, null, 1, null);
        }
        return Unit.INSTANCE;
    }
}
