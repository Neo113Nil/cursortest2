package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.pb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4258pb extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4284qb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4258pb(C4284qb c4284qb, Continuation continuation) {
        super(2, continuation);
        this.a = c4284qb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4258pb(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4258pb(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4284qb c4284qb = this.a;
        Uc uc = c4284qb.f;
        InMobiAdRequestStatus status = c4284qb.e;
        uc.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        uc.onAdLoadFailed(status);
        return Unit.INSTANCE;
    }
}
