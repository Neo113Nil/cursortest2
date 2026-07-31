package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.s7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4332s7 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ C4385u7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4332s7(C4385u7 c4385u7, Continuation continuation) {
        super(1, continuation);
        this.b = c4385u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4332s7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4332s7(this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4385u7 c4385u7 = this.b;
            this.a = 1;
            if (c4385u7.b(this) == coroutine_suspended) {
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
