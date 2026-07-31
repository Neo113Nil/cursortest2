package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class pt2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ vq3 b;
    public final /* synthetic */ o73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt2(vq3 vq3Var, o73 o73Var, Continuation continuation) {
        super(2, continuation);
        this.b = vq3Var;
        this.c = o73Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new pt2(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pt2(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        new CallbackStackTraceMarker(new uq3(this.b, this.c.a));
        return Unit.INSTANCE;
    }
}
