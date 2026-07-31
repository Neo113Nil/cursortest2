package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements Function2 {
    final /* synthetic */ FlowCollector $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowTransformLatest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, continuation);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ChannelFlowTransformLatest channelFlowTransformLatest = this.this$0;
            Flow flow = channelFlowTransformLatest.flow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, coroutineScope, channelFlowTransformLatest, this.$collector);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Merge.kt */
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
    static final class AnonymousClass1 implements FlowCollector {
        final /* synthetic */ CoroutineScope $$this$coroutineScope;
        final /* synthetic */ FlowCollector $collector;
        final /* synthetic */ Ref$ObjectRef $previousFlow;
        final /* synthetic */ ChannelFlowTransformLatest this$0;

        AnonymousClass1(Ref$ObjectRef ref$ObjectRef, CoroutineScope coroutineScope, ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector) {
            this.$previousFlow = ref$ObjectRef;
            this.$$this$coroutineScope = coroutineScope;
            this.this$0 = channelFlowTransformLatest;
            this.$collector = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Type inference failed for: r8v2, types: [T, kotlinx.coroutines.Job] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            int i;
            AnonymousClass1 anonymousClass1;
            ?? launch$default;
            if (continuation instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) continuation;
                int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Job job = (Job) this.$previousFlow.element;
                        if (job != null) {
                            job.cancel(new ChildCancelledException());
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = this;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = obj;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = job;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                            if (job.join(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        anonymousClass1 = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1;
                        anonymousClass1 = (AnonymousClass1) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                    }
                    Ref$ObjectRef ref$ObjectRef = anonymousClass1.$previousFlow;
                    launch$default = BuildersKt__Builders_commonKt.launch$default(anonymousClass1.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.this$0, anonymousClass1.$collector, obj, null), 1, null);
                    ref$ObjectRef.element = launch$default;
                    return Unit.INSTANCE;
                }
            }
            channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
            Object obj22 = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
            if (i != 0) {
            }
            Ref$ObjectRef ref$ObjectRef2 = anonymousClass1.$previousFlow;
            launch$default = BuildersKt__Builders_commonKt.launch$default(anonymousClass1.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.this$0, anonymousClass1.$collector, obj, null), 1, null);
            ref$ObjectRef2.element = launch$default;
            return Unit.INSTANCE;
        }

        /* compiled from: Merge.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2 {
            final /* synthetic */ FlowCollector $collector;
            final /* synthetic */ Object $value;
            int label;
            final /* synthetic */ ChannelFlowTransformLatest this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector, Object obj, Continuation continuation) {
                super(2, continuation);
                this.this$0 = channelFlowTransformLatest;
                this.$collector = flowCollector;
                this.$value = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.this$0, this.$collector, this.$value, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Function3 function3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    function3 = this.this$0.transform;
                    FlowCollector flowCollector = this.$collector;
                    Object obj2 = this.$value;
                    this.label = 1;
                    if (function3.invoke(flowCollector, obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }
}
