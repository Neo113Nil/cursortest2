package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.y5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4489y5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C4515z5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4489y5(C4515z5 c4515z5, Continuation continuation) {
        super(2, continuation);
        this.b = c4515z5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4489y5(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4489y5(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC4353t1 abstractC4353t1 = this.b.b;
            if (abstractC4353t1 != null) {
                abstractC4353t1.a();
            }
            Sc sc = this.b.a;
            if (sc != null) {
                this.a = 1;
                if (sc.a(this) == coroutine_suspended) {
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
