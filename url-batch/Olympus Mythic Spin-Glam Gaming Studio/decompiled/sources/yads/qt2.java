package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class qt2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ vq3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt2(vq3 vq3Var, Continuation continuation) {
        super(2, continuation);
        this.b = vq3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qt2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new qt2(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        new CallbackStackTraceMarker(new tq3(this.b, "Cannot load bidder token. Token generation failed"));
        return Unit.INSTANCE;
    }
}
