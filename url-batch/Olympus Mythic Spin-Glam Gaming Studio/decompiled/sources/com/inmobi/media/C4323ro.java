package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.ro, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4323ro extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AbstractC4349so b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4323ro(AbstractC4349so abstractC4349so, Continuation continuation) {
        super(2, continuation);
        this.b = abstractC4349so;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4323ro(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4323ro(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long c = this.b.c();
            this.a = 1;
            if (DelayKt.delay(c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ((Runnable) this.b.j.getValue()).run();
        return Unit.INSTANCE;
    }
}
