package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.lf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4156lf extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C4288qf b;
    public final /* synthetic */ C4053hg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4156lf(C4288qf c4288qf, C4053hg c4053hg, Continuation continuation) {
        super(2, continuation);
        this.b = c4288qf;
        this.c = c4053hg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4156lf(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4156lf(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4288qf c4288qf = this.b;
            C4053hg c4053hg = this.c;
            C4130kf c4130kf = new C4130kf(c4288qf, null);
            this.a = 1;
            if (c4288qf.a(c4053hg, c4130kf, this) == coroutine_suspended) {
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
