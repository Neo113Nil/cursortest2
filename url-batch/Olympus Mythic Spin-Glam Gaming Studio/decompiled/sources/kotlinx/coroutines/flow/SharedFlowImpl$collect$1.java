package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedFlow.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
/* loaded from: classes8.dex */
final class SharedFlowImpl$collect$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SharedFlowImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedFlowImpl$collect$1(SharedFlowImpl sharedFlowImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = sharedFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SharedFlowImpl.collect$suspendImpl(this.this$0, null, this);
    }
}
