package com.ogury.ad.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class k extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ b c;
    public final /* synthetic */ y7 d;
    public final /* synthetic */ we e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, b bVar, y7 y7Var, we weVar, Continuation continuation) {
        super(2, continuation);
        this.b = lVar;
        this.c = bVar;
        this.d = y7Var;
        this.e = weVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            l lVar = this.b;
            b bVar = this.c;
            y7 y7Var = this.d;
            we weVar = this.e;
            this.a = 1;
            if (lVar.a(bVar, y7Var, weVar, this) == coroutine_suspended) {
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
