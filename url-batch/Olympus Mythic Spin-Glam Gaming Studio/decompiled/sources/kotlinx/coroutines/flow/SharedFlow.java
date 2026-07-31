package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* compiled from: SharedFlow.kt */
/* loaded from: classes6.dex */
public interface SharedFlow extends Flow {
    @Override // kotlinx.coroutines.flow.Flow
    Object collect(FlowCollector flowCollector, Continuation continuation);
}
