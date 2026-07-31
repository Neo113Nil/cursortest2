package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.o7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4228o7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C4385u7 b;
    public final /* synthetic */ C4053hg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4228o7(C4385u7 c4385u7, C4053hg c4053hg, Continuation continuation) {
        super(2, continuation);
        this.b = c4385u7;
        this.c = c4053hg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4228o7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4228o7(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4385u7 c4385u7 = this.b;
            C4053hg c4053hg = this.c;
            C4201n7 c4201n7 = new C4201n7(c4385u7, null);
            this.a = 1;
            if (c4385u7.a(c4053hg, c4201n7, this) == coroutine_suspended) {
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
