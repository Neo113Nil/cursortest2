package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.vj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4424vj extends SuspendLambda implements Function1 {
    public int a;

    public C4424vj(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4424vj(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4424vj((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Intrinsics.checkNotNullExpressionValue(AbstractC4477xj.b, "access$getTAG$p(...)");
            C4187mj c4187mj = C4187mj.a;
            boolean sessionEnabled = AbstractC4477xj.a().getSessionEnabled();
            c4187mj.getClass();
            C4187mj.e = sessionEnabled;
            if (!sessionEnabled) {
                C4187mj.d = null;
            }
            C4187mj.c();
            if (AbstractC4002fj.b() == null || AbstractC4477xj.a().getLocationEnabled()) {
                C4521zb c4521zb = C4521zb.a;
                this.a = 1;
                if (c4521zb.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
