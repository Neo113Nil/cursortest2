package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.CombineKt;

/* compiled from: Zip.kt */
/* loaded from: classes12.dex */
abstract /* synthetic */ class FlowKt__ZipKt {
    public static final Flow combine(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt.flowCombine(flow, flow2, function3);
    }

    public static final Flow flowCombine(final Flow flow, final Flow flow2, final Function3 function3) {
        return new Flow() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Function0 function0;
                Flow[] flowArr = {Flow.this, flow2};
                function0 = new Function0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Void mo4828invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr, function0, new FlowKt__ZipKt$combine$1$1(function3, null), continuation);
                return combineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : Unit.INSTANCE;
            }
        };
    }
}
