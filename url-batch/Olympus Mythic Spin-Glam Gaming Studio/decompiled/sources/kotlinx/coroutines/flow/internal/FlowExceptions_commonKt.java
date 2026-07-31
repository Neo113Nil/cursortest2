package kotlinx.coroutines.flow.internal;

/* compiled from: FlowExceptions.common.kt */
/* loaded from: classes3.dex */
public abstract class FlowExceptions_commonKt {
    public static final void checkOwnership(AbortFlowException abortFlowException, Object obj) {
        if (abortFlowException.owner != obj) {
            throw abortFlowException;
        }
    }
}
