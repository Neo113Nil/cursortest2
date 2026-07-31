package com.unity3d.ads.adplayer;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: FullScreenWebViewDisplay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/DisplayMessage;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ CancellableContinuation $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, CancellableContinuation cancellableContinuation, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: FullScreenWebViewDisplay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 135}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ CancellableContinuation $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, CancellableContinuation cancellableContinuation, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = cancellableContinuation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            AdObject adObject;
            AdObject adObject2;
            LoadEvent loadEvent;
            AdPlayer adPlayer;
            Flow onLoadEvent;
            MutableSharedFlow displayMessages;
            DisplayMessage.WebViewInstanceRequest webViewInstanceRequest;
            String str;
            CoroutineScope coroutineScope2;
            ISDKDispatchers dispatchers;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                adObject = this.this$0.getAdObject();
                if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null) {
                    adObject2 = this.this$0.getAdObject();
                    if (adObject2 == null || (adPlayer = adObject2.getAdPlayer()) == null || (onLoadEvent = adPlayer.getOnLoadEvent()) == null) {
                        loadEvent = null;
                        if (loadEvent instanceof LoadEvent.Error) {
                            this.this$0.setResult(0);
                            dispatchers = this.this$0.getDispatchers();
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(dispatchers.getDefault()), null, null, new C17031(this.this$0, null), 3, null);
                            this.this$0.finish();
                            CancellableContinuation.DefaultImpls.cancel$default(this.$continuation, null, 1, null);
                        }
                    } else {
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        obj = FlowKt.single(onLoadEvent, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                str = this.this$0.opportunityId;
                webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(str);
                this.L$0 = coroutineScope;
                this.label = 2;
                if (displayMessages.emit(webViewInstanceRequest, this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope;
                CoroutineScopeKt.ensureActive(coroutineScope2);
                CancellableContinuation cancellableContinuation = this.$continuation;
                Result.Companion companion = Result.INSTANCE;
                Unit unit = Unit.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(unit));
                return unit;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive(coroutineScope2);
                CancellableContinuation cancellableContinuation2 = this.$continuation;
                Result.Companion companion2 = Result.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m8023constructorimpl(unit2));
                return unit2;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            loadEvent = (LoadEvent) obj;
            if (loadEvent instanceof LoadEvent.Error) {
            }
            displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
            str = this.this$0.opportunityId;
            webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(str);
            this.L$0 = coroutineScope;
            this.label = 2;
            if (displayMessages.emit(webViewInstanceRequest, this) != coroutine_suspended) {
            }
        }

        /* compiled from: FullScreenWebViewDisplay.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1", f = "FullScreenWebViewDisplay.kt", l = {123}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17031 extends SuspendLambda implements Function2 {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17031(FullScreenWebViewDisplay fullScreenWebViewDisplay, Continuation continuation) {
                super(2, continuation);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C17031(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C17031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, "Error loading webView");
                    this.label = 1;
                    if (displayMessages.emit(displayError, this) == coroutine_suspended) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers dispatchers;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.this$0);
        dispatchers = this.this$0.getDispatchers();
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, dispatchers.getDefault(), null, new AnonymousClass1(this.this$0, this.$continuation, null), 2, null);
        return Unit.INSTANCE;
    }
}
