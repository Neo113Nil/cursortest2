package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* compiled from: Yield.kt */
/* loaded from: classes13.dex */
public abstract class YieldKt {
    public static final Object yield(Continuation continuation) {
        Object coroutine_suspended;
        CoroutineContext context = continuation.getContext();
        JobKt.ensureActive(context);
        Continuation intercepted = IntrinsicsKt.intercepted(continuation);
        DispatchedContinuation dispatchedContinuation = intercepted instanceof DispatchedContinuation ? (DispatchedContinuation) intercepted : null;
        if (dispatchedContinuation == null) {
            coroutine_suspended = Unit.INSTANCE;
        } else {
            if (DispatchedContinuationKt.safeIsDispatchNeeded(dispatchedContinuation.dispatcher, context)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context, Unit.INSTANCE);
            } else {
                YieldContext yieldContext = new YieldContext();
                CoroutineContext plus = context.plus(yieldContext);
                Unit unit = Unit.INSTANCE;
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(plus, unit);
                if (yieldContext.dispatcherWasUnconfined) {
                    coroutine_suspended = DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation) ? IntrinsicsKt.getCOROUTINE_SUSPENDED() : unit;
                }
            }
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }
}
