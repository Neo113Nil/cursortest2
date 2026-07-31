package kotlinx.coroutines.internal;

import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* compiled from: OnUndeliveredElement.kt */
/* loaded from: classes14.dex */
public abstract class OnUndeliveredElementKt {
    public static /* synthetic */ UndeliveredElementException callUndeliveredElementCatchingException$default(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return callUndeliveredElementCatchingException(function1, obj, undeliveredElementException);
    }

    public static final UndeliveredElementException callUndeliveredElementCatchingException(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(obj);
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                ExceptionsKt.addSuppressed(undeliveredElementException, th);
            } else {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
            }
        }
        return undeliveredElementException;
    }

    public static final void callUndeliveredElement(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        UndeliveredElementException callUndeliveredElementCatchingException = callUndeliveredElementCatchingException(function1, obj, null);
        if (callUndeliveredElementCatchingException != null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, callUndeliveredElementCatchingException);
        }
    }
}
