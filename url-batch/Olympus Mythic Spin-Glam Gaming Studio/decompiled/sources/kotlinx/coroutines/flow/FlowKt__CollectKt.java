package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;

/* compiled from: Collect.kt */
/* loaded from: classes4.dex */
abstract /* synthetic */ class FlowKt__CollectKt {
    public static final Object collect(Flow flow, Continuation continuation) {
        Object collect = flow.collect(NopCollector.INSTANCE, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public static final Job launchIn(Flow flow, CoroutineScope coroutineScope) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FlowKt__CollectKt$launchIn$1(flow, null), 3, null);
        return launch$default;
    }

    public static final Object collectLatest(Flow flow, Function2 function2, Continuation continuation) {
        Object collect = FlowKt.collect(FlowKt__ContextKt.buffer$default(FlowKt.mapLatest(flow, function2), 0, null, 2, null), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public static final Object emitAll(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        FlowKt.ensureActive(flowCollector);
        Object collect = flow.collect(flowCollector, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
