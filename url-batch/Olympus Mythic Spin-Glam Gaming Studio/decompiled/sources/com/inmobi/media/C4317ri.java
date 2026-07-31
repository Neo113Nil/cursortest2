package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.ri, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4317ri extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4317ri(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, Continuation continuation) {
        super(2, continuation);
        this.b = gestureDetectorOnGestureListenerC4476xi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4317ri(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4317ri(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC4466x9 interfaceC4466x9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!this.b.isAttachedToWindow() && (interfaceC4466x9 = this.b.i) != null) {
            ((C4493y9) interfaceC4466x9).a();
        }
        return Unit.INSTANCE;
    }
}
