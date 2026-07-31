package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes12.dex */
public final class L7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ V7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L7(Continuation continuation, V7 v7) {
        super(2, continuation);
        this.a = v7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new L7(continuation, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new L7((Continuation) obj2, this.a).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InMobiVideoBridge.exoPlayer3Pause(this.a.p);
        this.a.x.a();
        C3859a8 c3859a8 = this.a.y;
        c3859a8.b.setVolume(0.0f);
        c3859a8.d.a();
        V7 v7 = this.a;
        v7.l.set(Jg.e);
        V7 v72 = this.a;
        v72.a(new C4218nn(v72.p.getCurrentPosition()));
        return Unit.INSTANCE;
    }
}
