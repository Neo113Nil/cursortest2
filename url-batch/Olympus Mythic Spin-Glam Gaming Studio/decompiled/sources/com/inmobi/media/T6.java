package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class T6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ U6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T6(U6 u6, Continuation continuation) {
        super(2, continuation);
        this.a = u6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T6(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new T6(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        U6 u6 = this.a;
        Uc uc = u6.f;
        InMobiAdRequestStatus status = u6.e;
        uc.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        uc.onAdLoadFailed(status);
        return Unit.INSTANCE;
    }
}
