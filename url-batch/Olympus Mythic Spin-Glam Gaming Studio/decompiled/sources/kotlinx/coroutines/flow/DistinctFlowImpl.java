package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* compiled from: Distinct.kt */
/* loaded from: classes11.dex */
final class DistinctFlowImpl implements Flow {
    public final Function2 areEquivalent;
    public final Function1 keySelector;
    private final Flow upstream;

    public DistinctFlowImpl(Flow flow, Function1 function1, Function2 function2) {
        this.upstream = flow;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlinx.coroutines.internal.Symbol] */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = NullSurrogateKt.NULL;
        Object collect = this.upstream.collect(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, flowCollector), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
