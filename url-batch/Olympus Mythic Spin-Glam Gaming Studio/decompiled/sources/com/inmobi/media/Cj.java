package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes10.dex */
public final class Cj extends SuspendLambda implements Function2 {
    public Mutex a;
    public Ej b;
    public Bj c;
    public Bj d;
    public int e;
    public final /* synthetic */ Ej f;
    public final /* synthetic */ Bj g;
    public final /* synthetic */ Bj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cj(Ej ej, Bj bj, Bj bj2, Continuation continuation) {
        super(2, continuation);
        this.f = ej;
        this.g = bj;
        this.h = bj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Cj(this.f, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Cj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Bj bj;
        Ej ej;
        Bj bj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ej ej2 = this.f;
            mutex = ej2.b;
            bj = this.g;
            Bj bj3 = this.h;
            this.a = mutex;
            this.b = ej2;
            this.c = bj;
            this.d = bj3;
            this.e = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ej = ej2;
            bj2 = bj3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bj2 = this.d;
            bj = this.c;
            ej = this.b;
            mutex = this.a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            ej.b(bj, bj2);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
