package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Context.kt */
/* loaded from: classes13.dex */
final class CancellableFlowImpl implements CancellableFlow {
    private final Flow flow;

    public CancellableFlowImpl(Flow flow) {
        this.flow = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.flow.collect(new CancellableFlowImpl$collect$2(flowCollector), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
