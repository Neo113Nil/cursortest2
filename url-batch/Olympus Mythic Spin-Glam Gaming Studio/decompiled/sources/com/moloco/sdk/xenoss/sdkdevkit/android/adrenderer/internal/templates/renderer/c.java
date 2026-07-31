package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.client_metrics_data.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import io.ktor.http.HttpStatusCode;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes9.dex */
public final class c extends WebViewClientCompat {

    @NotNull
    public static final a s = new a(null);
    public static final int t = 8;

    @NotNull
    public static final String u = "TemplateWebViewClientImpl";
    public static final int v = 5;
    public static final long w = 1000;
    public static final long x = 1000;

    @NotNull
    public final i a;

    @NotNull
    public final MetricsRecorder b;
    public final boolean c;

    @NotNull
    public final CoroutineScope d;

    @NotNull
    public final MutableStateFlow e;

    @NotNull
    public final StateFlow f;

    @NotNull
    public final MutableStateFlow g;

    @NotNull
    public final StateFlow h;

    @NotNull
    public final MutableStateFlow i;

    @NotNull
    public final StateFlow j;
    public int k;

    @Nullable
    public Job l;

    @Nullable
    public Job m;

    @NotNull
    public final MutableStateFlow n;

    @Nullable
    public Job o;

    @Nullable
    public TimerEvent p;

    @Nullable
    public TimerEvent q;

    @Nullable
    public String r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$handleRetry$1", f = "TemplateWebviewClientImpl.kt", l = {251}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ WebView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WebView webView, Continuation continuation) {
            super(2, continuation);
            this.c = webView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = (c.this.k * 1000) + 1000;
                this.a = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) c.this.e.getValue()).booleanValue()) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, c.u, "Skip reload; content already loaded after backoff", null, false, 12, null);
                return Unit.INSTANCE;
            }
            Job job = c.this.o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            Job job2 = c.this.m;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
            this.c.reload();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, c.u, "Reload attempt: " + c.this.k, null, false, 12, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$onPageFinished$1", f = "TemplateWebviewClientImpl.kt", l = {142}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$c, reason: collision with other inner class name */
    public static final class C1612c extends SuspendLambda implements Function2 {
        public int a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$c$a */
        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ c a;

            public a(c cVar) {
                this.a = cVar;
            }

            public final Object a(boolean z, Continuation continuation) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, c.u, "Webview page pending error resolution: " + z, null, false, 12, null);
                if (!z) {
                    this.a.d();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public C1612c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1612c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new C1612c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = c.this.n;
                a aVar = new a(c.this);
                this.a = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$pageFinished$3", f = "TemplateWebviewClientImpl.kt", l = {105}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ c a;

            public a(c cVar) {
                this.a = cVar;
            }

            public final Object a(boolean z, Continuation continuation) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, c.u, "Content loaded event received, isSuccess: " + z, null, false, 12, null);
                this.a.e.setValue(Boxing.boxBoolean(z));
                Job job = this.a.o;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                MetricsRecorder metricsRecorder = this.a.b;
                CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.P.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                String c = dVar.c();
                String str = LoginLogger.EVENT_EXTRAS_FAILURE;
                metricsRecorder.recordCountEvent(countEvent.withTag(c, z ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE));
                TimerEvent timerEvent = this.a.q;
                if (timerEvent != null) {
                    MetricsRecorder metricsRecorder2 = this.a.b;
                    String c2 = dVar.c();
                    if (z) {
                        str = "success";
                    }
                    metricsRecorder2.recordTimerEvent(timerEvent.withTag(c2, str));
                }
                if (z) {
                    Job job2 = this.a.l;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, null, 1, null);
                    }
                    this.a.l = null;
                    this.a.k = 0;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow c = c.this.a.c();
                a aVar = new a(c.this);
                this.a = 1;
                if (c.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public /* synthetic */ c(i iVar, MetricsRecorder metricsRecorder, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, metricsRecorder, (i & 4) != 0 ? true : z);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.D, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        Job launch$default;
        super.onPageFinished(webView, str);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Webview page finished loading has pending error: " + ((Boolean) this.n.getValue()).booleanValue(), null, false, 12, null);
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.O.c()).withTag("pending_error", String.valueOf(((Boolean) this.n.getValue()).booleanValue())));
        if (!((Boolean) this.n.getValue()).booleanValue()) {
            d();
        } else {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new C1612c(null), 3, null);
            this.m = launch$default;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/c;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.D, webView, str);
        safedk_c_onPageStarted_1b5fbf3b0ef8f34133effaa8738df643(webView, str, bitmap);
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(@NotNull final WebView view, @NotNull WebResourceRequest request, @NotNull final WebResourceErrorCompat error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        this.n.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Received error: " + error.getErrorCode() + ", with description: " + ((Object) error.getDescription()) + " for url: " + request.getUrl() + " ad isLoaded: " + ((Boolean) this.f.getValue()).booleanValue() + ", isPageFinished: " + ((Boolean) this.h.getValue()).booleanValue(), null, false, 12, null);
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        StringBuilder sb = new StringBuilder();
        sb.append("ContentChecker.isRequiredContent('");
        sb.append(uri);
        sb.append("');");
        view.evaluateJavascript(sb.toString(), new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                c.a(c.this, error, view, (String) obj);
            }
        });
        super.onReceivedError(view, request, error);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(@NotNull final WebView view, @NotNull WebResourceRequest request, @NotNull final WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.n.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, '[' + Thread.currentThread().getName() + "] Received HTTP error: " + Integer.valueOf(errorResponse.getStatusCode()) + ", with description: " + errorResponse.getReasonPhrase() + " for url: " + request.getUrl(), null, false, 12, null);
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        StringBuilder sb = new StringBuilder();
        sb.append("ContentChecker.isRequiredContent('");
        sb.append(uri);
        sb.append("');");
        view.evaluateJavascript(sb.toString(), new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                c.a(c.this, errorResponse, view, (String) obj);
            }
        });
        super.onReceivedHttpError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@NotNull WebView view, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), "render_process_gone_error").withTag("is_loaded", String.valueOf(((Boolean) this.f.getValue()).booleanValue())));
        this.i.setValue(l.e);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, u, "onRenderProcessGone", null, false, 12, null);
        this.n.setValue(Boolean.FALSE);
        return true;
    }

    public void safedk_c_onPageStarted_1b5fbf3b0ef8f34133effaa8738df643(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "HTML Page started loading", null, false, 12, null);
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.M.c()));
        MetricsRecorder metricsRecorder = this.b;
        String p12 = e.u.c();
        this.p = metricsRecorder.startTimerEvent(p12);
        MetricsRecorder metricsRecorder2 = this.b;
        String p13 = e.v.c();
        this.q = metricsRecorder2.startTimerEvent(p13);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.D, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.D, view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }

    public c(@NotNull i contentLoadedEventHandler, @NotNull MetricsRecorder metricsRecorder, boolean z) {
        Intrinsics.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = contentLoadedEventHandler;
        this.b = metricsRecorder;
        this.c = z;
        this.d = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.i = MutableStateFlow3;
        this.j = FlowKt.asStateFlow(MutableStateFlow3);
        this.n = StateFlowKt.MutableStateFlow(bool);
    }

    @NotNull
    public final StateFlow b() {
        return this.f;
    }

    @NotNull
    public final StateFlow c() {
        return this.h;
    }

    public final void d() {
        Job launch$default;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("HTML Page finished loading is success: ");
        sb.append(this.j.getValue() == null);
        MolocoLogger.info$default(molocoLogger, u, sb.toString(), null, false, 12, null);
        this.g.setValue(Boolean.TRUE);
        if (this.j.getValue() == null) {
            MolocoLogger.info$default(molocoLogger, u, "Waiting for content HTML assets to load or error out", null, false, 12, null);
            MetricsRecorder metricsRecorder = this.b;
            CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.N.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
            metricsRecorder.recordCountEvent(countEvent.withTag(dVar.c(), "success"));
            TimerEvent timerEvent = this.p;
            if (timerEvent != null) {
                this.b.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new d(null), 3, null);
            this.o = launch$default;
            return;
        }
        MolocoLogger.info$default(molocoLogger, u, "Unrecoverable error occurred, not setting isLoaded to true", null, false, 12, null);
        this.e.setValue(Boolean.FALSE);
        Job job = this.o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        Job job2 = this.l;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
        this.l = null;
        MetricsRecorder metricsRecorder2 = this.b;
        CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.N.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.d;
        CountEvent withTag = countEvent2.withTag(dVar2.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
        com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
        String c = dVar3.c();
        String str = this.r;
        if (str == null) {
            str = "unknown";
        }
        metricsRecorder2.recordCountEvent(withTag.withTag(c, str));
        TimerEvent timerEvent2 = this.p;
        if (timerEvent2 != null) {
            MetricsRecorder metricsRecorder3 = this.b;
            TimerEvent withTag2 = timerEvent2.withTag(dVar2.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            String c2 = dVar3.c();
            String str2 = this.r;
            metricsRecorder3.recordTimerEvent(withTag2.withTag(c2, str2 != null ? str2 : "unknown"));
        }
    }

    public final boolean e() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("retryCount: ");
        sb.append(this.k);
        sb.append(", MAX_RETRY_LIMIT: 5, retryCount < MAX_RETRY_LIMIT: ");
        sb.append(this.k < 5);
        MolocoLogger.debug$default(molocoLogger, u, sb.toString(), false, 4, null);
        return this.k < 5;
    }

    @NotNull
    public final StateFlow a() {
        return this.j;
    }

    public static final void a(c cVar, WebResourceErrorCompat webResourceErrorCompat, WebView webView, String str) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, u, '[' + Thread.currentThread().getName() + "] Content type with webview error is required: " + parseBoolean, null, false, 12, null);
        if (parseBoolean) {
            if (!((Boolean) cVar.f.getValue()).booleanValue()) {
                g a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h.a(webResourceErrorCompat.getDescription().toString());
                if (Intrinsics.areEqual(a2.c(), k.c.j.c()) && cVar.c) {
                    cVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.J.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceErrorCompat.getDescription())).withTag("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).withTag("is_loaded", String.valueOf(((Boolean) cVar.f.getValue()).booleanValue())));
                    MolocoLogger.info$default(molocoLogger, u, "Ignoring error: " + ((Object) webResourceErrorCompat.getDescription()) + " with code: " + webResourceErrorCompat.getErrorCode() + " since it's marked to be ignored pre load", null, false, 12, null);
                } else if (a2.e() && cVar.e()) {
                    cVar.a(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), webView);
                } else {
                    cVar.a(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), l.c);
                }
            } else {
                MolocoLogger.info$default(molocoLogger, u, "Webview is already showing and received error: " + ((Object) webResourceErrorCompat.getDescription()), null, false, 12, null);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h.a(webResourceErrorCompat.getDescription().toString()).f()) {
                    cVar.a(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), l.c);
                } else {
                    cVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.J.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceErrorCompat.getDescription())).withTag("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).withTag("is_loaded", String.valueOf(((Boolean) cVar.f.getValue()).booleanValue())));
                    MolocoLogger.info$default(molocoLogger, u, "Webview is already showing but received " + ((Object) webResourceErrorCompat.getDescription()) + ", not setting unrecoverable error", null, false, 12, null);
                }
            }
        } else {
            MolocoLogger.info$default(molocoLogger, u, "Content is not required, not setting unrecoverable error", null, false, 12, null);
            cVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "false").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceErrorCompat.getDescription())).withTag("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).withTag("is_loaded", String.valueOf(((Boolean) cVar.f.getValue()).booleanValue())));
        }
        cVar.n.setValue(Boolean.FALSE);
    }

    public final void a(String str, int i, WebView webView) {
        Job launch$default;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Retrying error... Attempt: " + (this.k + 1), null, false, 12, null);
        this.k = this.k + 1;
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.I.c()).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.f.c(), String.valueOf(this.k)).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(str)).withTag("status_code", String.valueOf(i)));
        Job job = this.l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new b(webView, null), 3, null);
        this.l = launch$default;
    }

    public final void a(String str, int i, l lVar) {
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, u, "Setting unrecoverable error with description: " + str + ", code: " + i + ", errorType: " + lVar, null, false, 12, null);
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(str)).withTag("status_code", String.valueOf(i)).withTag("is_loaded", String.valueOf(((Boolean) this.f.getValue()).booleanValue())));
        this.r = str;
        this.i.setValue(lVar);
    }

    public static final void a(c cVar, WebResourceResponse webResourceResponse, WebView webView, String str) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, u, '[' + Thread.currentThread().getName() + "] Content isRequired with http error: " + parseBoolean, null, false, 12, null);
        if (parseBoolean) {
            if (((Boolean) cVar.f.getValue()).booleanValue()) {
                cVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.J.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceResponse.getStatusCode())).withTag("is_loaded", String.valueOf(((Boolean) cVar.f.getValue()).booleanValue())));
                MolocoLogger.info$default(molocoLogger, u, "Webview is already showing but received HTTP " + webResourceResponse.getStatusCode() + ", not setting unrecoverable error", null, false, 12, null);
            } else if (cVar.a(webResourceResponse.getStatusCode()) && cVar.e()) {
                cVar.a(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), webView);
            } else {
                cVar.a(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), l.d);
                MolocoLogger.warn$default(molocoLogger, u, "Setting unrecoverable error: " + cVar.j.getValue(), null, false, 12, null);
            }
        } else {
            MolocoLogger.info$default(molocoLogger, u, "Content is not required, not setting unrecoverable error", null, false, 12, null);
            cVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "false").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(webResourceResponse.getStatusCode())).withTag("is_loaded", String.valueOf(((Boolean) cVar.f.getValue()).booleanValue())));
        }
        cVar.n.setValue(Boolean.FALSE);
    }

    public final boolean a(int i) {
        HttpStatusCode.Companion companion = HttpStatusCode.Companion;
        return i == companion.getTooManyRequests().getValue() || i == companion.getRequestTimeout().getValue() || i < 400 || i >= 500;
    }
}
