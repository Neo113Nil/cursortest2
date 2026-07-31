package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.te, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4366te extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MutableSharedFlow c;
    public final /* synthetic */ He d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4366te(MutableSharedFlow mutableSharedFlow, Continuation continuation, He he) {
        super(2, continuation);
        this.c = mutableSharedFlow;
        this.d = he;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4366te c4366te = new C4366te(this.c, continuation, this.d);
        c4366te.b = obj;
        return c4366te;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4366te) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            MutableSharedFlow mutableSharedFlow = this.c;
            C4339se c4339se = new C4339se(coroutineScope, this.d);
            this.a = 1;
            if (mutableSharedFlow.collect(c4339se, this) == coroutine_suspended) {
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
