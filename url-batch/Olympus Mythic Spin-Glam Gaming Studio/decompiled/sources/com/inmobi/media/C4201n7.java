package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.n7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4201n7 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4385u7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4201n7(C4385u7 c4385u7, Continuation continuation) {
        super(2, continuation);
        this.c = c4385u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4201n7 c4201n7 = new C4201n7(this.c, continuation);
        c4201n7.b = obj;
        return c4201n7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4201n7 c4201n7 = new C4201n7(this.c, (Continuation) obj2);
        c4201n7.b = (C4210ng) obj;
        return c4201n7.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4210ng c4210ng = (C4210ng) this.b;
            C4385u7 c4385u7 = this.c;
            this.a = 1;
            Object a = c4385u7.b.a(c4210ng, this);
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
