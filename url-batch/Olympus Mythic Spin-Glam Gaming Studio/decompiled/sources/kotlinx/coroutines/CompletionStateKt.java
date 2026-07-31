package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: CompletionState.kt */
/* loaded from: classes15.dex */
public abstract class CompletionStateKt {
    public static final Object toState(Object obj) {
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj);
        return m8026exceptionOrNullimpl == null ? obj : new CompletedExceptionally(m8026exceptionOrNullimpl, false, 2, null);
    }

    public static final Object toState(Object obj, CancellableContinuation cancellableContinuation) {
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj);
        return m8026exceptionOrNullimpl == null ? obj : new CompletedExceptionally(m8026exceptionOrNullimpl, false, 2, null);
    }

    public static final Object recoverResult(Object obj, Continuation continuation) {
        if (obj instanceof CompletedExceptionally) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(((CompletedExceptionally) obj).cause));
        }
        return Result.m8023constructorimpl(obj);
    }
}
