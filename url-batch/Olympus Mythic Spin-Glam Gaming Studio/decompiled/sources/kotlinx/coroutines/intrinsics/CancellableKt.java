package kotlinx.coroutines.intrinsics;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* compiled from: Cancellable.kt */
/* loaded from: classes3.dex */
public abstract class CancellableKt {
    public static final void startCoroutineCancellable(Function1 function1, Continuation continuation) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function1, continuation));
            Result.Companion companion = Result.INSTANCE;
            DispatchedContinuationKt.resumeCancellableWith(intercepted, Result.m8023constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            dispatcherFailure(continuation, th);
        }
    }

    public static final void startCoroutineCancellable(Function2 function2, Object obj, Continuation continuation) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, obj, continuation));
            Result.Companion companion = Result.INSTANCE;
            DispatchedContinuationKt.resumeCancellableWith(intercepted, Result.m8023constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            dispatcherFailure(continuation, th);
        }
    }

    public static final void startCoroutineCancellable(Continuation continuation, Continuation continuation2) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(continuation);
            Result.Companion companion = Result.INSTANCE;
            DispatchedContinuationKt.resumeCancellableWith(intercepted, Result.m8023constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            dispatcherFailure(continuation2, th);
        }
    }

    private static final void dispatcherFailure(Continuation continuation, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(th)));
        throw th;
    }
}
