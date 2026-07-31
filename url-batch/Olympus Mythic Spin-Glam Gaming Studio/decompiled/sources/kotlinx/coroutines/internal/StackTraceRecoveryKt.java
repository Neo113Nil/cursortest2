package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* compiled from: StackTraceRecovery.kt */
/* loaded from: classes14.dex */
public abstract class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = new ArtificialStackFrames().coroutineBoundary();
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClassName;

    public static final Throwable recoverStackTrace(Throwable th) {
        return th;
    }

    static {
        Object m8023constructorimpl;
        Object m8023constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            m8023constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) m8023constructorimpl;
        try {
            m8023constructorimpl2 = Result.m8023constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl2) != null) {
            m8023constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) m8023constructorimpl2;
    }
}
