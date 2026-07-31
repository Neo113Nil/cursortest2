package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4327s2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MutableStateFlow c;
    public final /* synthetic */ AbstractC4459x2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4327s2(MutableStateFlow mutableStateFlow, Continuation continuation, AbstractC4459x2 abstractC4459x2) {
        super(2, continuation);
        this.c = mutableStateFlow;
        this.d = abstractC4459x2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4327s2 c4327s2 = new C4327s2(this.c, continuation, this.d);
        c4327s2.b = obj;
        return c4327s2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4327s2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            MutableStateFlow mutableStateFlow = this.c;
            C4300r2 c4300r2 = new C4300r2(coroutineScope, this.d);
            this.a = 1;
            if (mutableStateFlow.collect(c4300r2, this) == coroutine_suspended) {
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
