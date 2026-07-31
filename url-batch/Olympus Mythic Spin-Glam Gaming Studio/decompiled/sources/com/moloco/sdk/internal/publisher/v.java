package com.moloco.sdk.internal.publisher;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C5021c;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.internal.ortb.model.C5024f;
import com.moloco.sdk.internal.publisher.v;
import com.moloco.sdk.internal.publisher.z;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5049a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class v<T extends AdShowListener> implements FullscreenAd<T>, s {

    @NotNull
    public static final a u = new a(null);
    public static final int v = 8;

    @NotNull
    public static final String w = "FullscreenAdImpl";

    @NotNull
    public final Context a;

    @NotNull
    public final InterfaceC5043f b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;

    @NotNull
    public final String d;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i e;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;

    @NotNull
    public final Function1 g;

    @NotNull
    public final u<T> h;

    @NotNull
    public final AdFormatType i;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y j;

    @NotNull
    public final C5025a k;

    @NotNull
    public final MetricsRecorder l;

    @NotNull
    public final CoroutineScope m;

    @NotNull
    public final TimerEvent n;

    @Nullable
    public TimerEvent o;

    @NotNull
    public final AdLoad p;

    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h q;

    @Nullable
    public C5021c r;

    @Nullable
    public Function1 s;

    @Nullable
    public Function0 t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, v.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5050b invoke(C5023e p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((v) this.receiver).a(p0);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1", f = "FullscreenAdImpl.kt", l = {277, 279}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ InterfaceC5049a b;
        public final /* synthetic */ z c;
        public final /* synthetic */ v<T> d;

        @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1$1", f = "FullscreenAdImpl.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ boolean b;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            public final Object a(boolean z, Continuation continuation) {
                return ((a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1$2", f = "FullscreenAdImpl.kt", l = {}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ boolean b;

            public b(Continuation continuation) {
                super(2, continuation);
            }

            public final Object a(boolean z, Continuation continuation) {
                return ((b) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                b bVar = new b(continuation);
                bVar.b = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(!this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC5049a interfaceC5049a, z zVar, v<? super T> vVar, Continuation continuation) {
            super(2, continuation);
            this.b = interfaceC5049a;
            this.c = zVar;
            this.d = vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.b, this.c, this.d, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            z zVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow l = this.b.l();
                a aVar = new a(null);
                this.a = 1;
                if (FlowKt.first(l, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    zVar = this.c;
                    if (zVar != null) {
                        zVar.onAdHidden(MolocoAdKt.createAdInfo$default(this.d.d, null, null, 6, null));
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            z zVar2 = this.c;
            if (zVar2 != null) {
                z.a.a(zVar2, MolocoAdKt.createAdInfo$default(this.d.d, null, null, 6, null), null, 2, null);
            }
            StateFlow l2 = this.b.l();
            b bVar = new b(null);
            this.a = 2;
            if (FlowKt.first(l2, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zVar = this.c;
            if (zVar != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$load$1", f = "FullscreenAdImpl.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ v<T> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdLoad.Listener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(v<? super T> vVar, String str, AdLoad.Listener listener, Continuation continuation) {
            super(2, continuation);
            this.b = vVar;
            this.c = str;
            this.d = listener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.p.load(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    public static final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u {
        public final /* synthetic */ v<T> a;
        public final /* synthetic */ z b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(v<? super T> vVar, z zVar) {
            this.a = vVar;
            this.b = zVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            v<T> vVar = this.a;
            vVar.a(com.moloco.sdk.internal.u.a(vVar.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            z zVar = this.b;
            if (zVar != null) {
                zVar.onAdClicked(MolocoAdKt.createAdInfo$default(this.a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, v.w, "Template ad skip button shown, triggering reward callback", null, false, 12, null);
            Function0 c = this.a.c();
            if (c != null) {
                c.mo4828invoke();
            }
            z zVar = this.b;
            if (zVar != null) {
                zVar.a();
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$show$2", f = "FullscreenAdImpl.kt", l = {}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ T b;
        public final /* synthetic */ v<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(T t, v<? super T> vVar, Continuation continuation) {
            super(2, continuation);
            this.b = t;
            this.c = vVar;
        }

        public static final C5035k b(v vVar) {
            return vVar.a();
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c(v vVar) {
            return vVar.b();
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC5049a interfaceC5049a = null;
            if (this.b != null) {
                u uVar = this.c.h;
                T t = this.b;
                InterfaceC5043f interfaceC5043f = this.c.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = this.c.c;
                final v<T> vVar = this.c;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.internal.publisher.v$g$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return v.g.a(v.this);
                    }
                };
                final v<T> vVar2 = this.c;
                Function0 function02 = new Function0() { // from class: com.moloco.sdk.internal.publisher.v$g$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return v.g.b(v.this);
                    }
                };
                AdFormatType adFormatType = this.c.i;
                MetricsRecorder metricsRecorder = this.c.l;
                final v<T> vVar3 = this.c;
                uVar.a(new D(t, interfaceC5043f, aVar, function0, function02, adFormatType, metricsRecorder, new Function0() { // from class: com.moloco.sdk.internal.publisher.v$g$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return v.g.c(v.this);
                    }
                }));
            } else {
                this.c.h.a((z) null);
            }
            z d = this.c.h.d();
            if (this.c.h.a() instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a = this.c.h.a();
                if (a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) {
                    interfaceC5049a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) a;
                }
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a2 = this.c.h.a();
                if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) {
                    interfaceC5049a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) a2;
                }
            }
            if (interfaceC5049a == null || !this.c.isLoaded()) {
                if (d != null) {
                    d.a(com.moloco.sdk.internal.u.a(this.c.d, MolocoAdError.ErrorType.AD_SHOW_ERROR_NOT_LOADED, com.moloco.sdk.internal.o.f, null, 8, null));
                }
                return Unit.INSTANCE;
            }
            if (((Boolean) interfaceC5049a.l().getValue()).booleanValue()) {
                if (d != null) {
                    d.a(com.moloco.sdk.internal.u.a(this.c.d, MolocoAdError.ErrorType.AD_SHOW_ERROR_ALREADY_DISPLAYING, com.moloco.sdk.internal.o.g, null, 8, null));
                }
                return Unit.INSTANCE;
            }
            this.c.a(interfaceC5049a, d);
            if (interfaceC5049a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) interfaceC5049a).a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t) this.c.b(d));
            } else if (interfaceC5049a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) interfaceC5049a).a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) this.c.q, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h) this.c.a(d));
            }
            return Unit.INSTANCE;
        }

        public static final com.moloco.sdk.internal.ortb.model.B a(v vVar) {
            return vVar.d();
        }
    }

    public v(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull String adUnitId, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull Function1 generateAggregatedOptions, @NotNull u<T> adDataHolder, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(generateAggregatedOptions, "generateAggregatedOptions");
        Intrinsics.checkNotNullParameter(adDataHolder, "adDataHolder");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = context;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = adUnitId;
        this.e = persistentHttpRequest;
        this.f = externalLinkHandler;
        this.g = generateAggregatedOptions;
        this.h = adDataHolder;
        this.i = adFormatType;
        this.j = watermark;
        this.k = adCreateLoadTimeoutManager;
        this.l = metricsRecorder;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.m = CoroutineScope;
        TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.n = startTimerEvent.withTag(c2, lowerCase);
        this.p = C5029e.a(CoroutineScope, new Function1() { // from class: com.moloco.sdk.internal.publisher.v$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.a(v.this, ((Long) obj).longValue());
            }
        }, adUnitId, new b(this), adFormatType, a.C1563a.a.b(), metricsRecorder, new Function0() { // from class: com.moloco.sdk.internal.publisher.v$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return v.k(v.this);
            }
        });
        this.q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h) generateAggregatedOptions.invoke(null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i k(v vVar) {
        return vVar.b();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j, long j2) {
        this.k.a(j, j2);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.m, null, 1, null);
        a(this, null, 1, null);
        this.s = null;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    public long mo6143getCreateAdObjectDurationUwyO8pc() {
        return this.k.mo6143getCreateAdObjectDurationUwyO8pc();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.p.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(@NotNull String bidResponseJson, @Nullable AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.l.recordTimerEvent(this.n);
        this.o = this.l.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.p.c());
        BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new d(this, bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    public void mo6144setCreateAdObjectDurationLRDsOJo(long j) {
        this.k.mo6144setCreateAdObjectDurationLRDsOJo(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // com.moloco.sdk.publisher.FullscreenAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void show(@Nullable T t) {
        String lowerCase;
        String name;
        TimerEvent timerEvent = this.o;
        if (timerEvent != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i b2 = b();
            if (b2 != null && (name = b2.name()) != null) {
                lowerCase = name.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            MetricsRecorder metricsRecorder = this.l;
            String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
            String lowerCase2 = this.i.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            metricsRecorder.recordTimerEvent(timerEvent.withTag(c2, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
        }
        MetricsRecorder metricsRecorder2 = this.l;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.A.c());
        String c3 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase3 = this.i.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        metricsRecorder2.recordCountEvent(countEvent.withTag(c3, lowerCase3));
        BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new g(t, this, null), 3, null);
    }

    @Nullable
    public final Function0 c() {
        return this.t;
    }

    @Nullable
    public final com.moloco.sdk.internal.ortb.model.B d() {
        return this.h.e();
    }

    @Nullable
    public final Function1 e() {
        return this.s;
    }

    @Nullable
    public final Boolean f() {
        StateFlow k;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a2 = this.h.a();
        if (a2 == null || (k = a2.k()) == null) {
            return null;
        }
        return (Boolean) k.getValue();
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i b() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a2 = this.h.a();
        if (a2 != null) {
            return a2.getCreativeType();
        }
        return null;
    }

    public final f b(z zVar) {
        return new f(this, zVar);
    }

    @Nullable
    public final C5035k a() {
        return this.h.c();
    }

    public static /* synthetic */ void a(v vVar, com.moloco.sdk.internal.t tVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tVar = null;
        }
        vVar.a(tVar);
    }

    public static final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g {
        public final /* synthetic */ v<T> a;
        public final /* synthetic */ z b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(v<? super T> vVar, z zVar) {
            this.a = vVar;
            this.b = zVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w
        public void a(boolean z) {
            String eventLink;
            C5021c c5021c = this.a.r;
            if (c5021c != null) {
                v<T> vVar = this.a;
                if (c5021c.getEnabled() && ((!z || c5021c.getOnSkip()) && (eventLink = c5021c.getEventLink()) != null)) {
                    vVar.e.a(eventLink);
                }
            }
            Function1 e = this.a.e();
            if (e != null) {
                e.invoke(Boolean.valueOf(z));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            z zVar = this.b;
            if (zVar != null) {
                zVar.onAdClicked(MolocoAdKt.createAdInfo$default(this.a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, v.w, "Ad skip button shown, triggering callback", null, false, 12, null);
            Function0 c = this.a.c();
            if (c != null) {
                c.mo4828invoke();
            }
            z zVar = this.b;
            if (zVar != null) {
                zVar.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            v<T> vVar = this.a;
            vVar.a(com.moloco.sdk.internal.u.a(vVar.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.moloco.sdk.internal.t tVar) {
        StateFlow l;
        u<T> uVar = this.h;
        Job b2 = uVar.b();
        if (b2 != null) {
            Job.DefaultImpls.cancel$default(b2, null, 1, null);
        }
        uVar.a((Job) null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a2 = this.h.a();
        boolean z = (a2 == null || (l = a2.l()) == null || !((Boolean) l.getValue()).booleanValue()) ? false : true;
        u<T> uVar2 = this.h;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a3 = uVar2.a();
        if (a3 != null) {
            a3.destroy();
        }
        uVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?>) null);
        u<T> uVar3 = this.h;
        z d2 = uVar3.d();
        uVar3.a((z) null);
        if (tVar != null && d2 != null) {
            d2.a(tVar);
        }
        if (z && d2 != null) {
            d2.onAdHidden(MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        }
        this.h.a((com.moloco.sdk.internal.ortb.model.B) null);
        this.h.a((C5035k) null);
    }

    public static final Duration a(v vVar, long j) {
        return Duration.m8137boximpl(vVar.k.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5050b a(C5023e c5023e) {
        com.moloco.sdk.internal.ortb.model.z player;
        com.moloco.sdk.internal.ortb.model.s experimental;
        Boolean serverRenderingIgnoreNetErrFailed;
        boolean z = true;
        a(this, null, 1, null);
        com.moloco.sdk.internal.ortb.model.x xVar = c5023e.getExt().getCom.ironsource.f8.p java.lang.String();
        if (xVar != null ? Intrinsics.areEqual(xVar.getServerRenderingEnabled(), Boolean.TRUE) : false) {
            com.moloco.sdk.internal.ortb.model.x xVar2 = c5023e.getExt().getCom.ironsource.f8.p java.lang.String();
            if (xVar2 != null && (experimental = xVar2.getExperimental()) != null && (serverRenderingIgnoreNetErrFailed = experimental.getServerRenderingIgnoreNetErrFailed()) != null) {
                z = serverRenderingIgnoreNetErrFailed.booleanValue();
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.a(this.a, c5023e.getAdm(), new com.moloco.sdk.internal.services.t(this.f, this.c), this.j, this.l, z);
            u<T> uVar = this.h;
            uVar.a(a2);
            C5024f ext = c5023e.getExt();
            uVar.a(ext != null ? ext.getSdkEvents() : null);
            uVar.a(c5023e.getCom.ironsource.q2.y java.lang.String() != null ? new C5035k(c5023e.getCom.ironsource.q2.y java.lang.String(), Float.valueOf(c5023e.getPrice())) : null);
            return a2;
        }
        Function1 function1 = this.g;
        C5024f ext2 = c5023e.getExt();
        this.q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h) function1.invoke(ext2 != null ? ext2.getPlayer() : null);
        C5024f ext3 = c5023e.getExt();
        this.r = (ext3 == null || (player = ext3.getPlayer()) == null) ? null : player.getAutoStore();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.a(this.a, this.c, null, c5023e, this.f, this.j, this.l, 4, null);
        u<T> uVar2 = this.h;
        uVar2.a(a3);
        C5024f ext4 = c5023e.getExt();
        uVar2.a(ext4 != null ? ext4.getSdkEvents() : null);
        uVar2.a(c5023e.getCom.ironsource.q2.y java.lang.String() != null ? new C5035k(c5023e.getCom.ironsource.q2.y java.lang.String(), Float.valueOf(c5023e.getPrice())) : null);
        return a3;
    }

    public final void a(InterfaceC5049a interfaceC5049a, z zVar) {
        Job launch$default;
        u<T> uVar = this.h;
        Job b2 = uVar.b();
        if (b2 != null) {
            Job.DefaultImpls.cancel$default(b2, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new c(interfaceC5049a, zVar, this, null), 3, null);
        uVar.a(launch$default);
    }

    public final void a(@Nullable Function1 function1) {
        this.s = function1;
    }

    public final void a(@Nullable Function0 function0) {
        this.t = function0;
    }

    public final e a(z zVar) {
        return new e(this, zVar);
    }

    public /* synthetic */ v(Context context, InterfaceC5043f interfaceC5043f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1 function1, u uVar, AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, C5025a c5025a, MetricsRecorder metricsRecorder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC5043f, aVar, str, iVar, rVar, function1, (i & 128) != 0 ? new u(null, null, null, null, null, 31, null) : uVar, adFormatType, yVar, c5025a, metricsRecorder);
    }
}
