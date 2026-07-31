package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.common_adapter_internal.AdapterAccess;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.client_metrics_data.d;
import com.moloco.sdk.internal.client_metrics_data.e;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"SetJavaScriptEnabled", "ViewConstructor"})
/* loaded from: classes10.dex */
public final class b extends WebView {

    @NotNull
    public static final a i = new a(null);
    public static final int j = 8;

    @NotNull
    public static final String k = "TemplateWebView";

    @NotNull
    public static final String l = "webview_version";

    @NotNull
    public final i a;

    @NotNull
    public final h b;

    @NotNull
    public final MetricsRecorder c;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c d;

    @NotNull
    public final CoroutineScope e;

    @NotNull
    public final MutableStateFlow f;

    @NotNull
    public final StateFlow g;

    @NotNull
    public final StateFlow h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2", f = "TemplateWebView.kt", l = {148}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b, reason: collision with other inner class name */
    public static final class C1606b extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1", f = "TemplateWebView.kt", l = {154}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a */
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ b b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$1", f = "TemplateWebView.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$a, reason: collision with other inner class name */
            public static final class C1607a extends SuspendLambda implements Function3 {
                public int a;
                public /* synthetic */ boolean b;
                public /* synthetic */ Object c;

                public C1607a(Continuation continuation) {
                    super(3, continuation);
                }

                public final Object a(boolean z, l lVar, Continuation continuation) {
                    C1607a c1607a = new C1607a(continuation);
                    c1607a.b = z;
                    c1607a.c = lVar;
                    return c1607a.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return a(((Boolean) obj).booleanValue(), (l) obj2, (Continuation) obj3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.b;
                    return TuplesKt.to(Boxing.boxBoolean(z), (l) this.c);
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$2", f = "TemplateWebView.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$b, reason: collision with other inner class name */
            public static final class C1608b extends SuspendLambda implements Function2 {
                public int a;
                public /* synthetic */ Object b;

                public C1608b(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Pair<Boolean, ? extends l> pair, Continuation continuation) {
                    return ((C1608b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C1608b c1608b = new C1608b(continuation);
                    c1608b.b = obj;
                    return c1608b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.b;
                    return Boxing.boxBoolean(((Boolean) pair.component1()).booleanValue() || ((l) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Continuation continuation) {
                super(2, continuation);
                this.b = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.flowCombine(this.b.d.b(), this.b.d.a(), new C1607a(null));
                    C1608b c1608b = new C1608b(null);
                    this.a = 1;
                    obj = FlowKt.first(flowCombine, c1608b, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1606b(String str, long j, Continuation continuation) {
            super(2, continuation);
            this.e = str;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1606b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C1606b(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TimerEvent startTimerEvent;
            Object m8206withTimeoutOrNullKLykuaI;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                startTimerEvent = b.this.c.startTimerEvent(e.r.c());
                String b = b.this.b();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.k, "Loading ad in webView, with webview version: " + b, null, false, 12, null);
                try {
                    MolocoAdsNetworkBridge.webviewLoadDataWithBaseURL(b.this, null, this.e, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
                    long j = this.f;
                    a aVar = new a(b.this, null);
                    this.a = startTimerEvent;
                    this.b = b;
                    this.c = 1;
                    m8206withTimeoutOrNullKLykuaI = TimeoutKt.m8206withTimeoutOrNullKLykuaI(j, aVar, this);
                    if (m8206withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = b;
                } catch (Exception e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, b.k, "loadHtml failed to load the provided html", e, false, 8, null);
                    MetricsRecorder metricsRecorder = b.this.c;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                    d dVar = d.d;
                    CountEvent withTag = countEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    d dVar2 = d.b;
                    metricsRecorder.recordCountEvent(withTag.withTag(dVar2.c(), "invalid_url").withTag(b.l, b));
                    b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), "invalid_url").withTag(b.l, b));
                    return new x.a(l.b);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.b;
                startTimerEvent = (TimerEvent) this.a;
                ResultKt.throwOnFailure(obj);
                m8206withTimeoutOrNullKLykuaI = obj;
            }
            if (m8206withTimeoutOrNullKLykuaI == null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.k, "Ad failed to load due to timeout", null, false, 12, null);
                MetricsRecorder metricsRecorder2 = b.this.c;
                CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                d dVar3 = d.d;
                CountEvent withTag2 = countEvent2.withTag(dVar3.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                d dVar4 = d.b;
                metricsRecorder2.recordCountEvent(withTag2.withTag(dVar4.c(), "timeout_error").withTag(b.l, str));
                b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar3.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar4.c(), "timeout_error").withTag(b.l, str));
                return new x.a(l.f);
            }
            boolean booleanValue = ((Boolean) b.this.d.b().getValue()).booleanValue();
            l lVar = (l) b.this.d.a().getValue();
            if (lVar != null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.k, "Ad failed to load due to unrecoverable error: " + lVar.name(), null, false, 12, null);
                MetricsRecorder metricsRecorder3 = b.this.c;
                CountEvent countEvent3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                d dVar5 = d.d;
                CountEvent withTag3 = countEvent3.withTag(dVar5.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                d dVar6 = d.b;
                metricsRecorder3.recordCountEvent(withTag3.withTag(dVar6.c(), lVar.name()).withTag(b.l, str));
                b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar5.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar6.c(), lVar.name()).withTag(b.l, str));
                return new x.a(lVar);
            }
            if (booleanValue) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.k, "Ad loaded successfully in webView", null, false, 12, null);
                MetricsRecorder metricsRecorder4 = b.this.c;
                CountEvent countEvent4 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                d dVar7 = d.d;
                metricsRecorder4.recordCountEvent(countEvent4.withTag(dVar7.c(), "success").withTag(b.l, str));
                b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar7.c(), "success").withTag(b.l, str));
                return new x.b(Unit.INSTANCE);
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, b.k, "Ad failed to load due to unknown error", null, false, 12, null);
            MetricsRecorder metricsRecorder5 = b.this.c;
            CountEvent countEvent5 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
            d dVar8 = d.d;
            CountEvent withTag4 = countEvent5.withTag(dVar8.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            d dVar9 = d.b;
            metricsRecorder5.recordCountEvent(withTag4.withTag(dVar9.c(), "unknown_error").withTag(b.l, str));
            b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar8.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar9.c(), "unknown_error").withTag(b.l, str));
            return new x.a(l.a);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1", f = "TemplateWebView.kt", l = {84}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a c;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ b a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1$1", f = "TemplateWebView.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a, reason: collision with other inner class name */
            public static final class C1609a extends SuspendLambda implements Function2 {
                public int a;
                public final /* synthetic */ b b;
                public final /* synthetic */ h.a c;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C1610a {
                    public static final /* synthetic */ int[] a;

                    static {
                        int[] iArr = new int[h.a.values().length];
                        try {
                            iArr[h.a.d.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[h.a.c.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1609a(b bVar, h.a aVar, Continuation continuation) {
                    super(2, continuation);
                    this.b = bVar;
                    this.c = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C1609a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C1609a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    WebSettings settings = this.b.getSettings();
                    int i = C1610a.a[this.c.ordinal()];
                    settings.setMediaPlaybackRequiresUserGesture(i != 1 ? i != 2 ? this.b.getSettings().getMediaPlaybackRequiresUserGesture() : false : true);
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1", f = "TemplateWebView.kt", l = {87}, m = "emit")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$b, reason: collision with other inner class name */
            public static final class C1611b extends ContinuationImpl {
                public Object a;
                public Object b;
                public /* synthetic */ Object c;
                public final /* synthetic */ a<T> d;
                public int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1611b(a<? super T> aVar, Continuation continuation) {
                    super(continuation);
                    this.d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.c = obj;
                    this.e |= Integer.MIN_VALUE;
                    return this.d.emit(null, this);
                }
            }

            public a(b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
                this.a = bVar;
                this.b = aVar;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24)(1:25))|12|(1:14)(1:18)|15|16))|29|6|7|(0)(0)|12|(0)(0)|15|16) */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x010a, code lost:
            
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Failed to access WebView settings", r13, false, 8, null);
             */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00a3 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0077, B:14:0x00a3, B:18:0x00ea, B:22:0x0041), top: B:7:0x0022 }] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00ea A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0077, B:14:0x00a3, B:18:0x00ea, B:22:0x0041), top: B:7:0x0022 }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(h.a aVar, Continuation continuation) {
                C1611b c1611b;
                int i;
                a<T> aVar2;
                if (continuation instanceof C1611b) {
                    c1611b = (C1611b) continuation;
                    int i2 = c1611b.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1611b.e = i2 - Integer.MIN_VALUE;
                        Object obj = c1611b.c;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1611b.e;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, b.k, "Playlist item displaying event received: " + aVar, null, false, 12, null);
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            C1609a c1609a = new C1609a(this.a, aVar, null);
                            c1611b.a = this;
                            c1611b.b = aVar;
                            c1611b.e = 1;
                            if (BuildersKt.withContext(main, c1609a, c1611b) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            aVar2 = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (h.a) c1611b.b;
                            aVar2 = (a) c1611b.a;
                            ResultKt.throwOnFailure(obj);
                        }
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.info$default(molocoLogger, b.k, "Set playback: " + aVar2.a.getSettings().getMediaPlaybackRequiresUserGesture(), null, false, 12, null);
                        if (aVar != h.a.d) {
                            MolocoLogger.info$default(molocoLogger, b.k, "Playlist item displaying event is MRAID, setting orientation to: " + aVar2.b.e().getValue(), null, false, 12, null);
                            aVar2.a.f.setValue(n.a.i.a((n.f) aVar2.b.e().getValue()));
                            aVar2.b.d();
                        } else {
                            MolocoLogger.info$default(molocoLogger, b.k, "Playlist item displaying event is not MRAID, setting orientation to none", null, false, 12, null);
                            aVar2.a.f.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d, false, 2, null));
                        }
                        return Unit.INSTANCE;
                    }
                }
                c1611b = new C1611b(this, continuation);
                Object obj2 = c1611b.c;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1611b.e;
                if (i != 0) {
                }
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger2, b.k, "Set playback: " + aVar2.a.getSettings().getMediaPlaybackRequiresUserGesture(), null, false, 12, null);
                if (aVar != h.a.d) {
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar, Continuation continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow c = b.this.b.c();
                    a aVar = new a(b.this, this.c);
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
            } catch (Exception e) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.k, "Error collecting playlist item displaying events", e, false, 8, null);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b(Context context, i iVar, h hVar, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iVar, hVar, metricsRecorder, r5, (i2 & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c(iVar, metricsRecorder, r5) : cVar);
        boolean z2 = (i2 & 16) != 0 ? true : z;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final StateFlow getOrientation$moloco_sdk_release() {
        return this.f;
    }

    @NotNull
    public final StateFlow getUnrecoverableError() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "onDetachedFromWindow called, cancelling viewScope", null, false, 12, null);
        CoroutineScopeKt.cancel$default(this.e, null, 1, null);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @NotNull
    public final StateFlow a() {
        return this.h;
    }

    public final String b() {
        PackageInfo currentWebViewPackage;
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage != null && (str = currentWebViewPackage.versionName) != null) {
                    return str;
                }
                return "unknown";
            }
            PackageManager packageManager = getContext().getPackageManager();
            for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"com.google.android.webview", "com.android.webview", "com.android.chrome"})) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, k, "Pre-O, legacy webview version: " + str2 + " → " + packageInfo.versionName, null, false, 12, null);
                String versionName = packageInfo.versionName;
                Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
                if (versionName.length() > 0) {
                    String versionName2 = packageInfo.versionName;
                    Intrinsics.checkNotNullExpressionValue(versionName2, "versionName");
                    return versionName2;
                }
            }
            return "unknown";
        } catch (Exception e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, k, "WebView version retrieval exception", e, false, 8, null);
            return "unknown";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull i contentLoadedEventHandler, @NotNull h playListItemDisplayingEventHandler, @NotNull MetricsRecorder metricsRecorder, boolean z, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c webViewClientImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        Intrinsics.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.a = contentLoadedEventHandler;
        this.b = playListItemDisplayingEventHandler;
        this.c = metricsRecorder;
        this.d = webViewClientImpl;
        this.e = CoroutineScopeKt.CoroutineScope(AdapterAccess.INSTANCE.DispatcherProvider().getMain());
        this.f = StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d, false, 2, null));
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.g = webViewClientImpl.a();
        this.h = webViewClientImpl.c();
    }

    public final void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a mraidCommunicationHub) {
        Intrinsics.checkNotNullParameter(mraidCommunicationHub, "mraidCommunicationHub");
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new c(mraidCommunicationHub, null), 3, null);
    }

    @SuppressLint({"WebViewApiAvailability"})
    @Nullable
    public final Object a(@NotNull String str, long j2, @NotNull Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new C1606b(str, j2, null), continuation);
    }
}
