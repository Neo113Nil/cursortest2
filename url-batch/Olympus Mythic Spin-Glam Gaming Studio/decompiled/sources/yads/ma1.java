package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class ma1 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ IntegrationInspectorActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma1(IntegrationInspectorActivity integrationInspectorActivity, Continuation continuation) {
        super(2, continuation);
        this.c = integrationInspectorActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ma1(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ma1(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        za1 b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            b = this.c.b();
            Flow flow = b.p;
            la1 la1Var = new la1(this.c);
            this.b = 1;
            if (flow.collect(la1Var, this) == coroutine_suspended) {
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
