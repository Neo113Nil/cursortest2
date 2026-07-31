package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes11.dex */
public final class P7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ V7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P7(Continuation continuation, V7 v7) {
        super(2, continuation);
        this.a = v7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new P7(continuation, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new P7((Continuation) obj2, this.a).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InMobiVideoBridge.exoPlayer3Stop(this.a.p);
        this.a.p.clearMediaItems();
        InMobiVideoBridge.exoPlayer3Release(this.a.p);
        this.a.z.a();
        this.a.y.d.d();
        return Unit.INSTANCE;
    }
}
