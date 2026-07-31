package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* compiled from: DebugStrings.kt */
/* loaded from: classes11.dex */
public abstract class DebugStringsKt {
    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(Continuation continuation) {
        Object m8023constructorimpl;
        if (continuation instanceof DispatchedContinuation) {
            return ((DispatchedContinuation) continuation).toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(continuation + '@' + getHexAddress(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            m8023constructorimpl = continuation.getClass().getName() + '@' + getHexAddress(continuation);
        }
        return (String) m8023constructorimpl;
    }

    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
