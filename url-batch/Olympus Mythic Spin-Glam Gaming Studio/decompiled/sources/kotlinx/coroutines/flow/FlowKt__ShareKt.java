package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* compiled from: Share.kt */
/* loaded from: classes10.dex */
abstract /* synthetic */ class FlowKt__ShareKt {
    public static final SharedFlow shareIn(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        SharingConfig configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, i);
        MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(i, configureSharing$FlowKt__ShareKt.extraBufferCapacity, configureSharing$FlowKt__ShareKt.onBufferOverflow);
        return new ReadonlySharedFlow(MutableSharedFlow, launchSharing$FlowKt__ShareKt(coroutineScope, configureSharing$FlowKt__ShareKt.context, configureSharing$FlowKt__ShareKt.upstream, MutableSharedFlow, sharingStarted, SharedFlowKt.NO_VALUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SharingConfig configureSharing$FlowKt__ShareKt(Flow flow, int i) {
        ChannelFlow channelFlow;
        Flow dropChannelOperators;
        int coerceAtLeast = RangesKt.coerceAtLeast(i, Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()) - i;
        if ((flow instanceof ChannelFlow) && (dropChannelOperators = (channelFlow = (ChannelFlow) flow).dropChannelOperators()) != null) {
            int i2 = channelFlow.capacity;
            if (i2 != -3 && i2 != -2 && i2 != 0) {
                coerceAtLeast = i2;
            } else if (channelFlow.onBufferOverflow != BufferOverflow.SUSPEND) {
                if (i == 0) {
                    coerceAtLeast = 1;
                }
                coerceAtLeast = 0;
            }
            return new SharingConfig(dropChannelOperators, coerceAtLeast, channelFlow.onBufferOverflow, channelFlow.context);
        }
        return new SharingConfig(flow, coerceAtLeast, BufferOverflow.SUSPEND, EmptyCoroutineContext.INSTANCE);
    }

    private static final Job launchSharing$FlowKt__ShareKt(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow flow, MutableSharedFlow mutableSharedFlow, SharingStarted sharingStarted, Object obj) {
        return BuildersKt.launch(coroutineScope, coroutineContext, Intrinsics.areEqual(sharingStarted, SharingStarted.Companion.getEagerly()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, obj, null));
    }

    public static final StateFlow stateIn(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        SharingConfig configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(obj);
        return new ReadonlyStateFlow(MutableStateFlow, launchSharing$FlowKt__ShareKt(coroutineScope, configureSharing$FlowKt__ShareKt.context, configureSharing$FlowKt__ShareKt.upstream, MutableStateFlow, sharingStarted, obj));
    }

    public static final SharedFlow asSharedFlow(MutableSharedFlow mutableSharedFlow) {
        return new ReadonlySharedFlow(mutableSharedFlow, null);
    }

    public static final StateFlow asStateFlow(MutableStateFlow mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow, null);
    }

    public static final SharedFlow onSubscription(SharedFlow sharedFlow, Function2 function2) {
        return new SubscribedSharedFlow(sharedFlow, function2);
    }
}
