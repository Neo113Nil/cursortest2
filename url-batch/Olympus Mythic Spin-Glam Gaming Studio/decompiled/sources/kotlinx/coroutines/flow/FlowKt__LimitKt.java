package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* compiled from: Limit.kt */
/* loaded from: classes11.dex */
abstract /* synthetic */ class FlowKt__LimitKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object emitAbort$FlowKt__LimitKt(FlowCollector flowCollector, Object obj, Object obj2, Continuation continuation) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        int i;
        if (continuation instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuation;
            int i2 = flowKt__LimitKt$emitAbort$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = flowKt__LimitKt$emitAbort$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$emitAbort$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    flowKt__LimitKt$emitAbort$1.L$0 = obj2;
                    flowKt__LimitKt$emitAbort$1.label = 1;
                    if (flowCollector.emit(obj, flowKt__LimitKt$emitAbort$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = flowKt__LimitKt$emitAbort$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                }
                throw new AbortFlowException(obj2);
            }
        }
        flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuation);
        Object obj32 = flowKt__LimitKt$emitAbort$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$emitAbort$1.label;
        if (i != 0) {
        }
        throw new AbortFlowException(obj2);
    }

    public static final Flow drop(final Flow flow, final int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
        }
        return new Flow() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new FlowKt__LimitKt$drop$2$1(new Ref$IntRef(), i, flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    public static final Flow dropWhile(final Flow flow, final Function2 function2) {
        return new Flow() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), flowCollector, function2), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    public static final Flow take(Flow flow, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
        }
        return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(flow, i);
    }

    public static final Flow transformWhile(Flow flow, Function3 function3) {
        return FlowKt.flow(new FlowKt__LimitKt$transformWhile$1(flow, function3, null));
    }
}
