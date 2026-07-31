package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.ji, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4107ji extends SuspendLambda implements Function2 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4107ji(ViewGroup viewGroup, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, Continuation continuation) {
        super(2, continuation);
        this.a = viewGroup;
        this.b = gestureDetectorOnGestureListenerC4476xi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4107ji(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4107ji(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.removeView(this.b);
        return Unit.INSTANCE;
    }
}
