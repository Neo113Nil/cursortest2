package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4452wl extends SuspendLambda implements Function2 {
    public int a;

    public C4452wl(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4452wl(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4452wl((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String b = AbstractC4002fj.b();
            if (b == null) {
                return Unit.INSTANCE;
            }
            if (!Intrinsics.areEqual(b, AbstractC4002fj.c)) {
                C4277q4 c4277q4 = AbstractC4015g4.a;
                this.a = 1;
                Object a = C4308r9.a(((C4067i4) AbstractC4015g4.a.b.b.getValue()).a, "config_db", null, this, 6);
                if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a = Unit.INSTANCE;
                }
                if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a = Unit.INSTANCE;
                }
                if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a = Unit.INSTANCE;
                }
                if (a == coroutine_suspended) {
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
