package kotlinx.coroutines.intrinsics;

import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* compiled from: Undispatched.kt */
/* loaded from: classes13.dex */
public abstract class UndispatchedKt {
    public static final void startCoroutineUndispatched(Function2 function2, Object obj, Continuation continuation) {
        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext context = probeCoroutineCreated.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context, null);
            try {
                DebugProbesKt.probeCoroutineResumed(probeCoroutineCreated);
                Object wrapWithContinuationImpl = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, obj, probeCoroutineCreated) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, probeCoroutineCreated);
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                if (wrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    probeCoroutineCreated.resumeWith(Result.m8023constructorimpl(wrapWithContinuationImpl));
                }
            } catch (Throwable th) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.Companion companion = Result.INSTANCE;
            probeCoroutineCreated.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public static final Object startUndispatchedOrReturn(ScopeCoroutine scopeCoroutine, Object obj, Function2 function2) {
        return startUndspatched(scopeCoroutine, true, obj, function2);
    }

    public static final Object startUndispatchedOrReturnIgnoreTimeout(ScopeCoroutine scopeCoroutine, Object obj, Function2 function2) {
        return startUndspatched(scopeCoroutine, false, obj, function2);
    }

    private static final Object startUndspatched(ScopeCoroutine scopeCoroutine, boolean z, Object obj, Function2 function2) {
        Object completedExceptionally;
        Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, obj, scopeCoroutine) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, scopeCoroutine);
        } catch (DispatchException e) {
            dispatchExceptionAndMakeCompleting(scopeCoroutine, e);
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            scopeCoroutine.afterCompletionUndispatched();
            if (makeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                if (z || notOwnTimeout(scopeCoroutine, ((CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause)) {
                    throw ((CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause;
                }
                if (completedExceptionally instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) completedExceptionally).cause;
                }
                return completedExceptionally;
            }
            return JobSupportKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    private static final boolean notOwnTimeout(ScopeCoroutine scopeCoroutine, Throwable th) {
        return ((th instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th).coroutine == scopeCoroutine) ? false : true;
    }

    private static final Void dispatchExceptionAndMakeCompleting(ScopeCoroutine scopeCoroutine, DispatchException dispatchException) {
        scopeCoroutine.makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }
}
