package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: Limit.kt */
/* loaded from: classes11.dex */
final class FlowKt__LimitKt$take$2$1 implements FlowCollector {
    final /* synthetic */ Ref$IntRef $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ Object $ownershipMarker;
    final /* synthetic */ FlowCollector $this_flow;

    FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i, FlowCollector flowCollector, Object obj) {
        this.$consumed = ref$IntRef;
        this.$count = i;
        this.$this_flow = flowCollector;
        this.$ownershipMarker = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        int i;
        Object emitAbort$FlowKt__LimitKt;
        if (continuation instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) continuation;
            int i2 = flowKt__LimitKt$take$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$take$2$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$take$2$1$emit$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj2);
                Ref$IntRef ref$IntRef = this.$consumed;
                int i3 = ref$IntRef.element + 1;
                ref$IntRef.element = i3;
                if (i3 >= this.$count) {
                    FlowCollector flowCollector = this.$this_flow;
                    Object obj3 = this.$ownershipMarker;
                    flowKt__LimitKt$take$2$1$emit$1.label = 2;
                    emitAbort$FlowKt__LimitKt = FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(flowCollector, obj, obj3, flowKt__LimitKt$take$2$1$emit$1);
                    if (emitAbort$FlowKt__LimitKt == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                FlowCollector flowCollector2 = this.$this_flow;
                flowKt__LimitKt$take$2$1$emit$1.label = 1;
                if (flowCollector2.emit(obj, flowKt__LimitKt$take$2$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
        Object obj22 = flowKt__LimitKt$take$2$1$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$take$2$1$emit$1.label;
        if (i == 0) {
        }
    }
}
