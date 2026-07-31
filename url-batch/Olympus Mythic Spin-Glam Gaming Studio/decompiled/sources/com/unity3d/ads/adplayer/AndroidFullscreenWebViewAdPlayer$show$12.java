package com.unity3d.ads.adplayer;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {165, 168, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidFullscreenWebViewAdPlayer$show$12 extends SuspendLambda implements Function2 {
    final /* synthetic */ CompletableDeferred $listenerStarted;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$show$12(CompletableDeferred completableDeferred, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, Continuation continuation) {
        super(2, continuation);
        this.$listenerStarted = completableDeferred;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidFullscreenWebViewAdPlayer$show$12(this.$listenerStarted, this.this$0, this.$showOptions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidFullscreenWebViewAdPlayer$show$12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OfferwallManager offerwallManager;
        String offerwallPlacementName;
        Flow flow;
        WebViewAdPlayer webViewAdPlayer;
        AnonymousClass4 anonymousClass4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableDeferred completableDeferred = this.$listenerStarted;
            this.label = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                offerwallManager = this.this$0.offerwallManager;
                offerwallPlacementName = ((AndroidShowOptions) this.$showOptions).getOfferwallPlacementName();
                if (offerwallPlacementName == null) {
                    offerwallPlacementName = "";
                }
                final SharedFlow shareIn = FlowKt.shareIn(offerwallManager.showAd(offerwallPlacementName), this.this$0.getScope(), SharingStarted.Companion.getEagerly(), 5);
                flow = new Flow() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {52}, m = "emit")
                        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i2 = anonymousClass1.label;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OfferwallEvent offerwallEvent = ((OfferwallEventData) obj).getOfferwallEvent();
                                        if (offerwallEvent != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(offerwallEvent, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
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
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                webViewAdPlayer = this.this$0.webViewAdPlayer;
                anonymousClass4 = new AnonymousClass4(webViewAdPlayer);
                this.label = 3;
                if (flow.collect(anonymousClass4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Flow onStart = FlowKt.onStart(this.this$0.getOnOfferwallEvent(), new AnonymousClass1(this.this$0, this.$showOptions, null));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
        this.label = 2;
        if (FlowKt.first(onStart, anonymousClass2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        offerwallManager = this.this$0.offerwallManager;
        offerwallPlacementName = ((AndroidShowOptions) this.$showOptions).getOfferwallPlacementName();
        if (offerwallPlacementName == null) {
        }
        final Flow shareIn2 = FlowKt.shareIn(offerwallManager.showAd(offerwallPlacementName), this.this$0.getScope(), SharingStarted.Companion.getEagerly(), 5);
        flow = new Flow() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {52}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj22);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                OfferwallEvent offerwallEvent = ((OfferwallEventData) obj).getOfferwallEvent();
                                if (offerwallEvent != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(offerwallEvent, anonymousClass1) == coroutine_suspended2) {
                                        return coroutine_suspended2;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj22);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj222 = anonymousClass1.result;
                    Object coroutine_suspended22 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        webViewAdPlayer = this.this$0.webViewAdPlayer;
        anonymousClass4 = new AnonymousClass4(webViewAdPlayer);
        this.label = 3;
        if (flow.collect(anonymousClass4, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {167}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, Continuation continuation) {
            super(2, continuation);
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$showOptions, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                str = this.this$0.opportunityId;
                DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(str, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                this.label = 1;
                if (displayMessages.emit(displayReady, this) == coroutine_suspended) {
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

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OfferwallShowEvent offerwallShowEvent, Continuation continuation) {
            return ((AnonymousClass2) create(offerwallShowEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(Intrinsics.areEqual((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
        }
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 implements FlowCollector, FunctionAdapter {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(OfferwallEvent offerwallEvent, Continuation continuation) {
            Object sendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, continuation);
            return sendOfferwallEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendOfferwallEvent : Unit.INSTANCE;
        }
    }
}
