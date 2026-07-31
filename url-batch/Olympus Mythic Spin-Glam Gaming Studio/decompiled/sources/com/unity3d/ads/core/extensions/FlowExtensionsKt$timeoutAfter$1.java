package com.unity3d.ads.core.extensions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: FlowExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class FlowExtensionsKt$timeoutAfter$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ boolean $active;
    final /* synthetic */ Function2 $block;
    final /* synthetic */ Flow $this_timeoutAfter;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowExtensionsKt$timeoutAfter$1(long j, boolean z, Function2 function2, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$timeoutMillis = j;
        this.$active = z;
        this.$block = function2;
        this.$this_timeoutAfter = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtensionsKt$timeoutAfter$1 flowExtensionsKt$timeoutAfter$1 = new FlowExtensionsKt$timeoutAfter$1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, continuation);
        flowExtensionsKt$timeoutAfter$1.L$0 = obj;
        return flowExtensionsKt$timeoutAfter$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope producerScope, Continuation continuation) {
        return ((FlowExtensionsKt$timeoutAfter$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ ProducerScope $$this$channelFlow;
        final /* synthetic */ Flow $this_timeoutAfter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Flow flow, ProducerScope producerScope, Continuation continuation) {
            super(2, continuation);
            this.$this_timeoutAfter = flow;
            this.$$this$channelFlow = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_timeoutAfter, this.$$this$channelFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = this.$this_timeoutAfter;
                final ProducerScope producerScope = this.$$this$channelFlow;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(T t, Continuation continuation) {
                        Object send = ProducerScope.this.send(t, continuation);
                        return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SendChannel.DefaultImpls.close$default(this.$$this$channelFlow, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new AnonymousClass1(this.$this_timeoutAfter, producerScope, null), 3, null);
            long j = this.$timeoutMillis;
            this.L$0 = producerScope;
            this.label = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            producerScope = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (this.$active) {
            Function2 function2 = this.$block;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(producerScope);
            this.L$0 = null;
            this.label = 2;
            if (function2.invoke(anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FlowExtensions.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function0 {
        AnonymousClass2(Object obj) {
            super(0, obj, ProducerScope.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            invoke();
            return Unit.INSTANCE;
        }

        public final void invoke() {
            SendChannel.DefaultImpls.close$default((ProducerScope) this.receiver, null, 1, null);
        }
    }
}
