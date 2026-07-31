package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.hl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4058hl extends SuspendLambda implements Function1 {
    public C4058hl(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4058hl(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4058hl((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Deferred deferred = C4084il.d;
        if (deferred != null) {
            Job.DefaultImpls.cancel$default(deferred, null, 1, null);
        }
        C4084il.d = null;
        C4084il.c.clear();
        return Unit.INSTANCE;
    }
}
