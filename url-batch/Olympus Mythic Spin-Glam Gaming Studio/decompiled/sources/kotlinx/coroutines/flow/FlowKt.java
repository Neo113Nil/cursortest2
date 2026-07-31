package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: classes14.dex */
public abstract class FlowKt {
    public static final Flow asFlow(Iterable iterable) {
        return FlowKt__BuildersKt.asFlow(iterable);
    }

    public static final SharedFlow asSharedFlow(MutableSharedFlow mutableSharedFlow) {
        return FlowKt__ShareKt.asSharedFlow(mutableSharedFlow);
    }

    public static final StateFlow asStateFlow(MutableStateFlow mutableStateFlow) {
        return FlowKt__ShareKt.asStateFlow(mutableStateFlow);
    }

    public static final Flow buffer(Flow flow, int i, BufferOverflow bufferOverflow) {
        return FlowKt__ContextKt.buffer(flow, i, bufferOverflow);
    }

    public static final Flow callbackFlow(Function2 function2) {
        return FlowKt__BuildersKt.callbackFlow(function2);
    }

    public static final Flow cancellable(Flow flow) {
        return FlowKt__ContextKt.cancellable(flow);
    }

    /* renamed from: catch, reason: not valid java name */
    public static final Flow m8234catch(Flow flow, Function3 function3) {
        return FlowKt__ErrorsKt.m8236catch(flow, function3);
    }

    public static final Object catchImpl(Flow flow, FlowCollector flowCollector, Continuation continuation) {
        return FlowKt__ErrorsKt.catchImpl(flow, flowCollector, continuation);
    }

    public static final Flow channelFlow(Function2 function2) {
        return FlowKt__BuildersKt.channelFlow(function2);
    }

    public static final Object collect(Flow flow, Continuation continuation) {
        return FlowKt__CollectKt.collect(flow, continuation);
    }

    public static final Object collectLatest(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__CollectKt.collectLatest(flow, function2, continuation);
    }

    public static final Flow combine(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt__ZipKt.combine(flow, flow2, function3);
    }

    public static final Flow conflate(Flow flow) {
        return FlowKt__ContextKt.conflate(flow);
    }

    public static final Flow consumeAsFlow(ReceiveChannel receiveChannel) {
        return FlowKt__ChannelsKt.consumeAsFlow(receiveChannel);
    }

    public static final Flow distinctUntilChanged(Flow flow) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow);
    }

    public static final Flow drop(Flow flow, int i) {
        return FlowKt__LimitKt.drop(flow, i);
    }

    public static final Flow dropWhile(Flow flow, Function2 function2) {
        return FlowKt__LimitKt.dropWhile(flow, function2);
    }

    public static final Object emitAll(FlowCollector flowCollector, ReceiveChannel receiveChannel, Continuation continuation) {
        return FlowKt__ChannelsKt.emitAll(flowCollector, receiveChannel, continuation);
    }

    public static final Object emitAll(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        return FlowKt__CollectKt.emitAll(flowCollector, flow, continuation);
    }

    public static final void ensureActive(FlowCollector flowCollector) {
        FlowKt__EmittersKt.ensureActive(flowCollector);
    }

    public static final Flow filterNotNull(Flow flow) {
        return FlowKt__TransformKt.filterNotNull(flow);
    }

    public static final Object first(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.first(flow, continuation);
    }

    public static final Object first(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__ReduceKt.first(flow, function2, continuation);
    }

    public static final Object firstOrNull(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.firstOrNull(flow, continuation);
    }

    public static final Object firstOrNull(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__ReduceKt.firstOrNull(flow, function2, continuation);
    }

    public static final Flow flow(Function2 function2) {
        return FlowKt__BuildersKt.flow(function2);
    }

    public static final Flow flowCombine(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt__ZipKt.flowCombine(flow, flow2, function3);
    }

    public static final Flow flowOf(Object obj) {
        return FlowKt__BuildersKt.flowOf(obj);
    }

    public static final Flow flowOn(Flow flow, CoroutineContext coroutineContext) {
        return FlowKt__ContextKt.flowOn(flow, coroutineContext);
    }

    public static final Job launchIn(Flow flow, CoroutineScope coroutineScope) {
        return FlowKt__CollectKt.launchIn(flow, coroutineScope);
    }

    public static final Flow mapLatest(Flow flow, Function2 function2) {
        return FlowKt__MergeKt.mapLatest(flow, function2);
    }

    public static final Flow onCompletion(Flow flow, Function3 function3) {
        return FlowKt__EmittersKt.onCompletion(flow, function3);
    }

    public static final Flow onEach(Flow flow, Function2 function2) {
        return FlowKt__TransformKt.onEach(flow, function2);
    }

    public static final Flow onStart(Flow flow, Function2 function2) {
        return FlowKt__EmittersKt.onStart(flow, function2);
    }

    public static final SharedFlow onSubscription(SharedFlow sharedFlow, Function2 function2) {
        return FlowKt__ShareKt.onSubscription(sharedFlow, function2);
    }

    public static final Flow receiveAsFlow(ReceiveChannel receiveChannel) {
        return FlowKt__ChannelsKt.receiveAsFlow(receiveChannel);
    }

    public static final SharedFlow shareIn(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        return FlowKt__ShareKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    public static final Object single(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.single(flow, continuation);
    }

    public static final StateFlow stateIn(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, sharingStarted, obj);
    }

    public static final Flow take(Flow flow, int i) {
        return FlowKt__LimitKt.take(flow, i);
    }

    public static final Flow transformLatest(Flow flow, Function3 function3) {
        return FlowKt__MergeKt.transformLatest(flow, function3);
    }

    public static final Flow transformWhile(Flow flow, Function3 function3) {
        return FlowKt__LimitKt.transformWhile(flow, function3);
    }
}
