package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes10.dex */
public final class Ea extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Aa b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ea(Aa aa, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Continuation continuation) {
        super(2, continuation);
        this.b = aa;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ea(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ea) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableDeferred completableDeferred = this.b.e;
            this.a = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Ref$IntRef ref$IntRef = this.c;
        Aa aa = this.b;
        ref$IntRef.element = aa.c;
        this.d.element = aa.d;
        return Unit.INSTANCE;
    }
}
