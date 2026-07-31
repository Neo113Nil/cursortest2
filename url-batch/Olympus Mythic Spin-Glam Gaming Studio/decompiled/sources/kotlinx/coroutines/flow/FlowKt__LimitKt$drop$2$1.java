package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: Limit.kt */
/* loaded from: classes11.dex */
final class FlowKt__LimitKt$drop$2$1 implements FlowCollector {
    final /* synthetic */ int $count;
    final /* synthetic */ Ref$IntRef $skipped;
    final /* synthetic */ FlowCollector $this_flow;

    FlowKt__LimitKt$drop$2$1(Ref$IntRef ref$IntRef, int i, FlowCollector flowCollector) {
        this.$skipped = ref$IntRef;
        this.$count = i;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        int i;
        if (continuation instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) continuation;
            int i2 = flowKt__LimitKt$drop$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$drop$2$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$drop$2$1$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Ref$IntRef ref$IntRef = this.$skipped;
                    int i3 = ref$IntRef.element;
                    if (i3 < this.$count) {
                        ref$IntRef.element = i3 + 1;
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector = this.$this_flow;
                    flowKt__LimitKt$drop$2$1$emit$1.label = 1;
                    if (flowCollector.emit(obj, flowKt__LimitKt$drop$2$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
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
        flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
        Object obj22 = flowKt__LimitKt$drop$2$1$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$drop$2$1$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
