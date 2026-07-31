package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes13.dex */
public abstract class AbstractSharedFlowSlot {
    public abstract boolean allocateLocked(Object obj);

    public abstract Continuation[] freeLocked(Object obj);
}
