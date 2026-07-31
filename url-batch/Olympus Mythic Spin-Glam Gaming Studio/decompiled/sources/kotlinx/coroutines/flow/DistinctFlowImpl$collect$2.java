package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* compiled from: Distinct.kt */
/* loaded from: classes11.dex */
final class DistinctFlowImpl$collect$2 implements FlowCollector {
    final /* synthetic */ FlowCollector $collector;
    final /* synthetic */ Ref$ObjectRef $previousKey;
    final /* synthetic */ DistinctFlowImpl this$0;

    DistinctFlowImpl$collect$2(DistinctFlowImpl distinctFlowImpl, Ref$ObjectRef ref$ObjectRef, FlowCollector flowCollector) {
        this.this$0 = distinctFlowImpl;
        this.$previousKey = ref$ObjectRef;
        this.$collector = flowCollector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        int i;
        if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
            distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
            int i2 = distinctFlowImpl$collect$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                distinctFlowImpl$collect$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = distinctFlowImpl$collect$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = distinctFlowImpl$collect$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    ?? invoke = this.this$0.keySelector.invoke(obj);
                    T t = this.$previousKey.element;
                    if (t == NullSurrogateKt.NULL || !((Boolean) this.this$0.areEquivalent.invoke(t, invoke)).booleanValue()) {
                        this.$previousKey.element = invoke;
                        FlowCollector flowCollector = this.$collector;
                        distinctFlowImpl$collect$2$emit$1.label = 1;
                        if (flowCollector.emit(obj, distinctFlowImpl$collect$2$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
        Object obj22 = distinctFlowImpl$collect$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = distinctFlowImpl$collect$2$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
