package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4130kf extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4288qf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4130kf(C4288qf c4288qf, Continuation continuation) {
        super(2, continuation);
        this.c = c4288qf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4130kf c4130kf = new C4130kf(this.c, continuation);
        c4130kf.b = obj;
        return c4130kf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4130kf c4130kf = new C4130kf(this.c, (Continuation) obj2);
        c4130kf.b = (C4210ng) obj;
        return c4130kf.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4210ng c4210ng = (C4210ng) this.b;
            C4288qf c4288qf = this.c;
            this.a = 1;
            Object a = c4288qf.b.a(c4210ng, this);
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
