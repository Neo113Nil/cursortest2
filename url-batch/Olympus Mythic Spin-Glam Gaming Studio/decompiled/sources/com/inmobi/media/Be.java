package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes11.dex */
public final class Be extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ He b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Be(He he, Continuation continuation) {
        super(2, continuation);
        this.b = he;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Be(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Be(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC4466x9 l = this.b.l();
            if (l != null) {
                ((C4493y9) l).a("NativeRenderedState", "Impression Tracking Started - waiting for viewability criteria");
            }
            Flow b = ((C4338sd) this.b.b.j.getValue()).b();
            Ae ae = new Ae(null);
            this.a = 1;
            if (FlowKt.first(b, ae, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.b.m();
        ((C4338sd) this.b.b.j.getValue()).a();
        return Unit.INSTANCE;
    }
}
