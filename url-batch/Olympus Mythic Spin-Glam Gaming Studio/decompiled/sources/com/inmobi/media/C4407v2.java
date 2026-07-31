package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4407v2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AbstractC4459x2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4407v2(AbstractC4459x2 abstractC4459x2, Continuation continuation) {
        super(2, continuation);
        this.b = abstractC4459x2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4407v2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4407v2(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC4459x2 abstractC4459x2 = this.b;
            this.a = 1;
            if (AbstractC4459x2.b(abstractC4459x2, this) == coroutine_suspended) {
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
