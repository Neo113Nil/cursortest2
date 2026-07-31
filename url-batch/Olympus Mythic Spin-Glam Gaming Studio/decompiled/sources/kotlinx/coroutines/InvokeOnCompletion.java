package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

/* compiled from: JobSupport.kt */
/* loaded from: classes8.dex */
final class InvokeOnCompletion extends JobNode {
    private final Function1 handler;

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    public InvokeOnCompletion(Function1 function1) {
        this.handler = function1;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        this.handler.invoke(th);
    }
}
