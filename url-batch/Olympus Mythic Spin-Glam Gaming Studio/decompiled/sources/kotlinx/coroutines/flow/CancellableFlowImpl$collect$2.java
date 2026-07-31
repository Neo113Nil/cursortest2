package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.JobKt;

/* compiled from: Context.kt */
/* loaded from: classes13.dex */
final class CancellableFlowImpl$collect$2 implements FlowCollector {
    final /* synthetic */ FlowCollector $collector;

    CancellableFlowImpl$collect$2(FlowCollector flowCollector) {
        this.$collector = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
        int i;
        if (continuation instanceof CancellableFlowImpl$collect$2$emit$1) {
            cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) continuation;
            int i2 = cancellableFlowImpl$collect$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancellableFlowImpl$collect$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cancellableFlowImpl$collect$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cancellableFlowImpl$collect$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    JobKt.ensureActive(cancellableFlowImpl$collect$2$emit$1.getContext());
                    FlowCollector flowCollector = this.$collector;
                    cancellableFlowImpl$collect$2$emit$1.label = 1;
                    if (flowCollector.emit(obj, cancellableFlowImpl$collect$2$emit$1) == coroutine_suspended) {
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
        cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, continuation);
        Object obj22 = cancellableFlowImpl$collect$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cancellableFlowImpl$collect$2$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
