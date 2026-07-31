package com.unity3d.ads.adplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: AndroidWebViewContainer.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 72\u00020\u0001:\u00017BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J\u001e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0002\u0010/J\u001e\u00100\u001a\u00020$2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(H\u0096@¢\u0006\u0002\u00104J\u000e\u00105\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\b\u00106\u001a\u00020$H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00068"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webView", "Landroid/webkit/WebView;", "webViewClient", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "sendWebViewClientErrorDiagnostics", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Landroid/webkit/WebView;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "getWebView", "()Landroid/webkit/WebView;", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "_lastInputEvent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/view/InputEvent;", "get_lastInputEvent", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "lastInputEvent", "Lkotlinx/coroutines/flow/StateFlow;", "getLastInputEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "onRenderProcessGone", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUrl", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaluateJavascript", "handlerType", "Lcom/unity3d/ads/adplayer/HandlerType;", "arguments", "Lorg/json/JSONArray;", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addJavascriptInterface", "webViewBridgeInterface", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "name", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "applySafeAreaInsets", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes8.dex */
public final class AndroidWebViewContainer implements WebViewContainer {

    @NotNull
    private static final String JS_CLOSING_PARENTHESES = ")";

    @NotNull
    private static final String JS_INSTRUCTION = "javascript:window.nativebridge.";

    @NotNull
    private static final String JS_OPENING_PARENTHESES = "(";

    @NotNull
    private static final String JS_SEMICOLON = ";";

    @NotNull
    private final MutableStateFlow _lastInputEvent;

    @NotNull
    private final AdObject adObject;

    @NotNull
    private final Context context;

    @NotNull
    private final StateFlow lastInputEvent;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    @NotNull
    private final WebView webView;

    @NotNull
    private final AndroidWebViewClient webViewClient;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final StringBuilder SHARED_STRING_BUILDER = new StringBuilder(4096);

    @NotNull
    private static final Mutex SHARED_STRING_MUTEX = MutexKt.Mutex$default(false, 1, null);

    private static final int applySafeAreaInsets$lambda$6$toPx(int i, float f) {
        return (int) (i / f);
    }

    public AndroidWebViewContainer(@NotNull WebView webView, @NotNull AndroidWebViewClient webViewClient, @NotNull SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, @NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher defaultDispatcher, @NotNull CoroutineScope adPlayerScope, @NotNull Context context, @NotNull AdObject adObject, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.webView = webView;
        this.webViewClient = webViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        this.adObject = adObject;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        CoroutineScope plus = CoroutineScopeKt.plus(CoroutineScopeKt.plus(adPlayerScope, mainDispatcher), new CoroutineName("AndroidWebViewContainer"));
        this.scope = plus;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._lastInputEvent = MutableStateFlow;
        this.lastInputEvent = FlowKt.asStateFlow(MutableStateFlow);
        final StateFlow isRenderProcessGone = webViewClient.getIsRenderProcessGone();
        FlowKt.launchIn(FlowKt.onEach(new Flow() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (((Boolean) obj).booleanValue()) {
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
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, new AnonymousClass2(null)), CoroutineScopeKt.plus(plus, defaultDispatcher));
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean _init_$lambda$1;
                _init_$lambda$1 = AndroidWebViewContainer._init_$lambda$1(AndroidWebViewContainer.this, view, motionEvent);
                return _init_$lambda$1;
            }
        });
        applySafeAreaInsets();
    }

    @NotNull
    public final WebView getWebView() {
        return this.webView;
    }

    /* compiled from: AndroidWebViewContainer.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer$Companion;", "", "<init>", "()V", "SHARED_STRING_BUILDER", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getSHARED_STRING_BUILDER$annotations", "getSHARED_STRING_BUILDER", "()Ljava/lang/StringBuilder;", "SHARED_STRING_MUTEX", "Lkotlinx/coroutines/sync/Mutex;", "getSHARED_STRING_MUTEX", "()Lkotlinx/coroutines/sync/Mutex;", "JS_INSTRUCTION", "", "JS_OPENING_PARENTHESES", "JS_CLOSING_PARENTHESES", "JS_SEMICOLON", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getSHARED_STRING_BUILDER$annotations() {
        }

        private Companion() {
        }

        @NotNull
        public final StringBuilder getSHARED_STRING_BUILDER() {
            return AndroidWebViewContainer.SHARED_STRING_BUILDER;
        }

        @NotNull
        public final Mutex getSHARED_STRING_MUTEX() {
            return AndroidWebViewContainer.SHARED_STRING_MUTEX;
        }
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.scope;
    }

    @NotNull
    public final MutableStateFlow get_lastInputEvent() {
        return this._lastInputEvent;
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @NotNull
    public StateFlow getLastInputEvent() {
        return this.lastInputEvent;
    }

    /* compiled from: AndroidWebViewContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2 {
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AndroidWebViewContainer.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        public final Object invoke(boolean z, Continuation continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                if (androidWebViewContainer.onRenderProcessGone(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(AndroidWebViewContainer androidWebViewContainer, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        androidWebViewContainer._lastInputEvent.setValue(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onRenderProcessGone(Continuation continuation) {
        AndroidWebViewContainer$onRenderProcessGone$1 androidWebViewContainer$onRenderProcessGone$1;
        int i;
        if (continuation instanceof AndroidWebViewContainer$onRenderProcessGone$1) {
            androidWebViewContainer$onRenderProcessGone$1 = (AndroidWebViewContainer$onRenderProcessGone$1) continuation;
            int i2 = androidWebViewContainer$onRenderProcessGone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$onRenderProcessGone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$onRenderProcessGone$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewContainer$onRenderProcessGone$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    androidWebViewContainer$onRenderProcessGone$1.label = 1;
                    if (destroy(androidWebViewContainer$onRenderProcessGone$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
                this.sendWebViewClientErrorDiagnostics.invoke(CollectionsKt.listOf(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)), this.adObject);
                return Unit.INSTANCE;
            }
        }
        androidWebViewContainer$onRenderProcessGone$1 = new AndroidWebViewContainer$onRenderProcessGone$1(this, continuation);
        Object obj2 = androidWebViewContainer$onRenderProcessGone$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$onRenderProcessGone$1.label;
        if (i != 0) {
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
        this.sendWebViewClientErrorDiagnostics.invoke(CollectionsKt.listOf(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)), this.adObject);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadUrl(@NotNull String str, @NotNull Continuation continuation) {
        AndroidWebViewContainer$loadUrl$1 androidWebViewContainer$loadUrl$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        List<WebViewClientError> list;
        if (continuation instanceof AndroidWebViewContainer$loadUrl$1) {
            androidWebViewContainer$loadUrl$1 = (AndroidWebViewContainer$loadUrl$1) continuation;
            int i2 = androidWebViewContainer$loadUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$loadUrl$1.label = i2 - Integer.MIN_VALUE;
                obj = androidWebViewContainer$loadUrl$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewContainer$loadUrl$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                    AndroidWebViewContainer$loadUrl$2 androidWebViewContainer$loadUrl$2 = new AndroidWebViewContainer$loadUrl$2(this, str, null);
                    androidWebViewContainer$loadUrl$1.label = 1;
                    if (BuildersKt.withContext(coroutineContext, androidWebViewContainer$loadUrl$2, androidWebViewContainer$loadUrl$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list = (List) androidWebViewContainer$loadUrl$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            this.sendWebViewClientErrorDiagnostics.invoke(list, this.adObject);
                            throw new LoadWebViewError(list);
                        }
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (!list.isEmpty()) {
                            androidWebViewContainer$loadUrl$1.L$0 = list;
                            androidWebViewContainer$loadUrl$1.label = 3;
                            if (destroy(androidWebViewContainer$loadUrl$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.sendWebViewClientErrorDiagnostics.invoke(list, this.adObject);
                            throw new LoadWebViewError(list);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Deferred onLoadFinished = this.webViewClient.getOnLoadFinished();
                androidWebViewContainer$loadUrl$1.label = 2;
                obj = onLoadFinished.await(androidWebViewContainer$loadUrl$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                }
            }
        }
        androidWebViewContainer$loadUrl$1 = new AndroidWebViewContainer$loadUrl$1(this, continuation);
        obj = androidWebViewContainer$loadUrl$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$loadUrl$1.label;
        if (i != 0) {
        }
        Deferred onLoadFinished2 = this.webViewClient.getOnLoadFinished();
        androidWebViewContainer$loadUrl$1.label = 2;
        obj = onLoadFinished2.await(androidWebViewContainer$loadUrl$1);
        if (obj == coroutine_suspended) {
        }
        list = (List) obj;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(3:17|18|19))(3:30|31|(5:33|23|(1:25)|12|13)(2:34|(1:36)))|20|21|22|23|(0)|12|13))|38|6|7|(0)(0)|20|21|22|23|(0)|12|13|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object evaluateJavascript(@NotNull HandlerType handlerType, @NotNull JSONArray jSONArray, @NotNull Continuation continuation) {
        AndroidWebViewContainer$evaluateJavascript$1 androidWebViewContainer$evaluateJavascript$1;
        Object coroutine_suspended;
        int i;
        String jSONArray2;
        Mutex mutex;
        String sb;
        Job launch$default;
        try {
            if (continuation instanceof AndroidWebViewContainer$evaluateJavascript$1) {
                androidWebViewContainer$evaluateJavascript$1 = (AndroidWebViewContainer$evaluateJavascript$1) continuation;
                int i2 = androidWebViewContainer$evaluateJavascript$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidWebViewContainer$evaluateJavascript$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidWebViewContainer$evaluateJavascript$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidWebViewContainer$evaluateJavascript$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        jSONArray2 = jSONArray.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
                        int length = handlerType.getJsPath().length() + 32 + jSONArray2.length() + 2;
                        if (length > SHARED_STRING_BUILDER.capacity()) {
                            StringBuilder sb2 = new StringBuilder(length);
                            sb2.append(JS_INSTRUCTION);
                            sb2.append(handlerType.getJsPath());
                            sb2.append(JS_OPENING_PARENTHESES);
                            sb2.append(jSONArray2);
                            sb2.append(JS_CLOSING_PARENTHESES);
                            sb2.append(JS_SEMICOLON);
                            sb = sb2.toString();
                            Intrinsics.checkNotNull(sb);
                            launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AndroidWebViewContainer$evaluateJavascript$2(this, sb, null), 3, null);
                            androidWebViewContainer$evaluateJavascript$1.L$0 = null;
                            androidWebViewContainer$evaluateJavascript$1.L$1 = null;
                            androidWebViewContainer$evaluateJavascript$1.L$2 = null;
                            androidWebViewContainer$evaluateJavascript$1.label = 2;
                            if (launch$default.join(androidWebViewContainer$evaluateJavascript$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        mutex = SHARED_STRING_MUTEX;
                        androidWebViewContainer$evaluateJavascript$1.L$0 = handlerType;
                        androidWebViewContainer$evaluateJavascript$1.L$1 = jSONArray2;
                        androidWebViewContainer$evaluateJavascript$1.L$2 = mutex;
                        androidWebViewContainer$evaluateJavascript$1.label = 1;
                        if (mutex.lock(null, androidWebViewContainer$evaluateJavascript$1) == coroutine_suspended) {
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
                        Mutex mutex2 = (Mutex) androidWebViewContainer$evaluateJavascript$1.L$2;
                        jSONArray2 = (String) androidWebViewContainer$evaluateJavascript$1.L$1;
                        HandlerType handlerType2 = (HandlerType) androidWebViewContainer$evaluateJavascript$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        handlerType = handlerType2;
                    }
                    StringBuilder sb3 = SHARED_STRING_BUILDER;
                    StringsKt.clear(sb3);
                    sb3.append(JS_INSTRUCTION);
                    sb3.append(handlerType.getJsPath());
                    sb3.append(JS_OPENING_PARENTHESES);
                    sb3.append(jSONArray2);
                    sb3.append(JS_CLOSING_PARENTHESES);
                    sb3.append(JS_SEMICOLON);
                    sb = sb3.toString();
                    Intrinsics.checkNotNull(sb);
                    launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AndroidWebViewContainer$evaluateJavascript$2(this, sb, null), 3, null);
                    androidWebViewContainer$evaluateJavascript$1.L$0 = null;
                    androidWebViewContainer$evaluateJavascript$1.L$1 = null;
                    androidWebViewContainer$evaluateJavascript$1.L$2 = null;
                    androidWebViewContainer$evaluateJavascript$1.label = 2;
                    if (launch$default.join(androidWebViewContainer$evaluateJavascript$1) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
            StringBuilder sb32 = SHARED_STRING_BUILDER;
            StringsKt.clear(sb32);
            sb32.append(JS_INSTRUCTION);
            sb32.append(handlerType.getJsPath());
            sb32.append(JS_OPENING_PARENTHESES);
            sb32.append(jSONArray2);
            sb32.append(JS_CLOSING_PARENTHESES);
            sb32.append(JS_SEMICOLON);
            sb = sb32.toString();
            Intrinsics.checkNotNull(sb);
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AndroidWebViewContainer$evaluateJavascript$2(this, sb, null), 3, null);
            androidWebViewContainer$evaluateJavascript$1.L$0 = null;
            androidWebViewContainer$evaluateJavascript$1.L$1 = null;
            androidWebViewContainer$evaluateJavascript$1.L$2 = null;
            androidWebViewContainer$evaluateJavascript$1.label = 2;
            if (launch$default.join(androidWebViewContainer$evaluateJavascript$1) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        androidWebViewContainer$evaluateJavascript$1 = new AndroidWebViewContainer$evaluateJavascript$1(this, continuation);
        Object obj2 = androidWebViewContainer$evaluateJavascript$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$evaluateJavascript$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addJavascriptInterface(@NotNull WebViewBridge webViewBridge, @NotNull String str, @NotNull Continuation continuation) {
        AndroidWebViewContainer$addJavascriptInterface$1 androidWebViewContainer$addJavascriptInterface$1;
        int i;
        if (continuation instanceof AndroidWebViewContainer$addJavascriptInterface$1) {
            androidWebViewContainer$addJavascriptInterface$1 = (AndroidWebViewContainer$addJavascriptInterface$1) continuation;
            int i2 = androidWebViewContainer$addJavascriptInterface$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$addJavascriptInterface$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$addJavascriptInterface$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewContainer$addJavascriptInterface$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                    AndroidWebViewContainer$addJavascriptInterface$2 androidWebViewContainer$addJavascriptInterface$2 = new AndroidWebViewContainer$addJavascriptInterface$2(this, str, webViewBridge, null);
                    androidWebViewContainer$addJavascriptInterface$1.label = 1;
                    if (BuildersKt.withContext(coroutineContext, androidWebViewContainer$addJavascriptInterface$2, androidWebViewContainer$addJavascriptInterface$1) == coroutine_suspended) {
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
        androidWebViewContainer$addJavascriptInterface$1 = new AndroidWebViewContainer$addJavascriptInterface$1(this, continuation);
        Object obj2 = androidWebViewContainer$addJavascriptInterface$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$addJavascriptInterface$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(@NotNull Continuation continuation) {
        AndroidWebViewContainer$destroy$1 androidWebViewContainer$destroy$1;
        int i;
        if (continuation instanceof AndroidWebViewContainer$destroy$1) {
            androidWebViewContainer$destroy$1 = (AndroidWebViewContainer$destroy$1) continuation;
            int i2 = androidWebViewContainer$destroy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$destroy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$destroy$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewContainer$destroy$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext plus = this.scope.getCoroutineContext().plus(NonCancellable.INSTANCE);
                    AndroidWebViewContainer$destroy$2 androidWebViewContainer$destroy$2 = new AndroidWebViewContainer$destroy$2(this, null);
                    androidWebViewContainer$destroy$1.label = 1;
                    if (BuildersKt.withContext(plus, androidWebViewContainer$destroy$2, androidWebViewContainer$destroy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
                return Unit.INSTANCE;
            }
        }
        androidWebViewContainer$destroy$1 = new AndroidWebViewContainer$destroy$1(this, continuation);
        Object obj2 = androidWebViewContainer$destroy$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$destroy$1.label;
        if (i != 0) {
        }
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        return Unit.INSTANCE;
    }

    private final void applySafeAreaInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(this.webView, new OnApplyWindowInsetsListener() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat applySafeAreaInsets$lambda$6;
                applySafeAreaInsets$lambda$6 = AndroidWebViewContainer.applySafeAreaInsets$lambda$6(AndroidWebViewContainer.this, view, windowInsetsCompat);
                return applySafeAreaInsets$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat applySafeAreaInsets$lambda$6(AndroidWebViewContainer androidWebViewContainer, View v, WindowInsetsCompat insets) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Float.valueOf(androidWebViewContainer.context.getResources().getDisplayMetrics().density));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Float valueOf = Float.valueOf(1.0f);
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = valueOf;
        }
        float floatValue = ((Number) m8023constructorimpl).floatValue();
        int applySafeAreaInsets$lambda$6$toPx = applySafeAreaInsets$lambda$6$toPx(Math.max(insets2.left, insets3.left), floatValue);
        int applySafeAreaInsets$lambda$6$toPx2 = applySafeAreaInsets$lambda$6$toPx(Math.max(insets2.top, insets3.top), floatValue);
        BuildersKt__Builders_commonKt.launch$default(androidWebViewContainer.scope, null, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(androidWebViewContainer, StringsKt.trimIndent("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '" + applySafeAreaInsets$lambda$6$toPx + "px');\n                    root.style.setProperty('--safe-area-inset-right', '" + applySafeAreaInsets$lambda$6$toPx(Math.max(insets2.right, insets3.right), floatValue) + "px');\n                    root.style.setProperty('--safe-area-inset-top', '" + applySafeAreaInsets$lambda$6$toPx2 + "px');\n                    root.style.setProperty('--safe-area-inset-bottom', '" + applySafeAreaInsets$lambda$6$toPx(Math.max(insets2.bottom, insets3.bottom), floatValue) + "px');\n                })();\n            "), null), 3, null);
        return insets;
    }
}
