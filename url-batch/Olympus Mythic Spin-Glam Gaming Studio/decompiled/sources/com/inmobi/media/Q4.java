package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Q4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3961e6 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(C3961e6 c3961e6, long j, Continuation continuation) {
        super(2, continuation);
        this.b = c3961e6;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Q4(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Q4(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            S4 s4 = S4.a;
            C3961e6 c3961e6 = this.b;
            int maxAdRecords = S4.c().getContextualData().getMaxAdRecords();
            long j = this.c;
            this.a = 1;
            Intrinsics.checkNotNullExpressionValue("S4", "TAG");
            K4 k4 = (K4) S4.b.getValue();
            C4308r9 c4308r9 = k4.a;
            J4 j4 = new J4(k4, c3961e6, j, maxAdRecords, null);
            c4308r9.getClass();
            Object a = c4308r9.a(new C4282q9(c4308r9, j4, null), this);
            if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a = Unit.INSTANCE;
            }
            if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a = Unit.INSTANCE;
            }
            if (a == coroutine_suspended) {
                return coroutine_suspended;
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
