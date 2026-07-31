package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.xm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4480xm extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MutableStateFlow c;
    public final /* synthetic */ Nm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4480xm(MutableStateFlow mutableStateFlow, Continuation continuation, Nm nm) {
        super(2, continuation);
        this.c = mutableStateFlow;
        this.d = nm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4480xm c4480xm = new C4480xm(this.c, continuation, this.d);
        c4480xm.b = obj;
        return c4480xm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4480xm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            MutableStateFlow mutableStateFlow = this.c;
            C4453wm c4453wm = new C4453wm(coroutineScope, this.d);
            this.a = 1;
            if (mutableStateFlow.collect(c4453wm, this) == coroutine_suspended) {
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
