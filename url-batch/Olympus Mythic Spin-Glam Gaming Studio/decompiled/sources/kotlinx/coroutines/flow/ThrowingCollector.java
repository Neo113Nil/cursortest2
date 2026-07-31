package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* compiled from: Emitters.kt */
/* loaded from: classes14.dex */
public final class ThrowingCollector implements FlowCollector {
    public final Throwable e;

    public ThrowingCollector(Throwable th) {
        this.e = th;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        throw this.e;
    }
}
