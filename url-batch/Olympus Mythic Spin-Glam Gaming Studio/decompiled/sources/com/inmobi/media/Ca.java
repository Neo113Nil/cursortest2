package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Ca extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ha a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ca(Ha ha, Continuation continuation) {
        super(2, continuation);
        this.a = ha;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ca(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ca(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC4466x9 interfaceC4466x9 = this.a.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "destroyVideoPlayer is called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a.a;
        gestureDetectorOnGestureListenerC4476xi.b1 = null;
        D8 d8 = gestureDetectorOnGestureListenerC4476xi.Z0;
        if (d8 != null) {
            d8.a();
        }
        return Unit.INSTANCE;
    }
}
