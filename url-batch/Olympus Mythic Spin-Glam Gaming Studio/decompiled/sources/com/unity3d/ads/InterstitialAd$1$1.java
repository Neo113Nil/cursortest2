package com.unity3d.ads;

import com.unity3d.ads.InterstitialAd$1$1;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: InterstitialAd.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.InterstitialAd$1$1", f = "InterstitialAd.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InterstitialAd$1$1 extends SuspendLambda implements Function2 {
    int label;
    final /* synthetic */ InterstitialAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterstitialAd$1$1(InterstitialAd interstitialAd, Continuation continuation) {
        super(2, continuation);
        this.this$0 = interstitialAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InterstitialAd$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((InterstitialAd$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdObject adObject;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            adObject = this.this$0.adObject;
            final MutableStateFlow state = adObject.getState();
            final AdObjectState adObjectState = AdObjectState.EXPIRED;
            Flow take = FlowKt.take(new Flow() { // from class: com.unity3d.ads.InterstitialAd$1$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.InterstitialAd$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ AdObjectState receiver$inlined;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.unity3d.ads.InterstitialAd$1$1$invokeSuspend$$inlined$filter$1$2", f = "InterstitialAd.kt", l = {50}, m = "emit")
                    /* renamed from: com.unity3d.ads.InterstitialAd$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
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

                    public AnonymousClass2(FlowCollector flowCollector, AdObjectState adObjectState) {
                        this.$this_unsafeFlow = flowCollector;
                        this.receiver$inlined = adObjectState;
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
                                    if (this.receiver$inlined.equals(obj)) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, adObjectState), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            }, 1);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (take.collect(anonymousClass2, this) == coroutine_suspended) {
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

    /* compiled from: InterstitialAd.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.InterstitialAd$1$1$2, reason: invalid class name */
    static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ InterstitialAd this$0;

        AnonymousClass2(InterstitialAd interstitialAd) {
            this.this$0 = interstitialAd;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(AdObjectState adObjectState, Continuation continuation) {
            SafeCallbackInvoke safeCallbackInvoke;
            safeCallbackInvoke = this.this$0.safeCallbackInvoke;
            final InterstitialAd interstitialAd = this.this$0;
            safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.InterstitialAd$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    Unit emit$lambda$0;
                    emit$lambda$0 = InterstitialAd$1$1.AnonymousClass2.emit$lambda$0(InterstitialAd.this);
                    return emit$lambda$0;
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$0(InterstitialAd interstitialAd) {
            AdExpiredListener<InterstitialAd> onAdExpired = interstitialAd.getOnAdExpired();
            if (onAdExpired != null) {
                onAdExpired.onAdExpired(interstitialAd);
            }
            return Unit.INSTANCE;
        }
    }
}
