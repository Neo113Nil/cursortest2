package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes10.dex */
public final class a implements s<u> {

    @NotNull
    public static final C1600a o = new C1600a(null);
    public static final int p = 8;

    @NotNull
    public static final String q = "WebviewAd";

    @NotNull
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b b;

    @NotNull
    public final i c;

    @NotNull
    public final h d;

    @NotNull
    public final MetricsRecorder e;

    @NotNull
    public final CoroutineScope f;

    @NotNull
    public final e g;

    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a h;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b i;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a j;

    @NotNull
    public final Lazy k;

    @NotNull
    public final MutableStateFlow l;

    @NotNull
    public final Lazy m;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a n;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$a, reason: collision with other inner class name */
    public static final class C1600a {
        public /* synthetic */ C1600a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1600a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$isAdDisplaying$2$1", f = "WebviewAd.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function3 {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.b = z;
            bVar.c = z2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$show$1", f = "WebviewAd.kt", l = {81}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ u c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$show$1$error$1", f = "WebviewAd.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$d$a, reason: collision with other inner class name */
        public static final class C1601a extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ Object b;

            public C1601a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l lVar, Continuation continuation) {
                return ((C1601a) create(lVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C1601a c1601a = new C1601a(continuation);
                c1601a.b = obj;
                return c1601a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((l) this.b) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u uVar, Continuation continuation) {
            super(2, continuation);
            this.c = uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a.this.l.setValue(Boxing.boxBoolean(true));
                MolocoLogger.info$default(MolocoLogger.INSTANCE, a.q, "Ad show called, isAdDisplaying: " + ((Boolean) a.this.l.getValue()).booleanValue(), null, false, 12, null);
                StateFlow unrecoverableError = a.this.p().getUnrecoverableError();
                C1601a c1601a = new C1601a(null);
                this.a = 1;
                obj = FlowKt.first(unrecoverableError, c1601a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            l lVar = (l) obj;
            if (lVar != null) {
                u uVar = this.c;
                MolocoLogger.error$default(MolocoLogger.INSTANCE, a.q, "Ad show error: " + lVar, null, false, 12, null);
                uVar.a(lVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Context context, @NotNull final String adm, @NotNull Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> eventHandlers, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b clickthroughEventHandler, @NotNull i contentLoadedHandler, @NotNull h playListItemDisplayingEventHandler, @NotNull MetricsRecorder metricsRecorder, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(clickthroughEventHandler, "clickthroughEventHandler");
        Intrinsics.checkNotNullParameter(contentLoadedHandler, "contentLoadedHandler");
        Intrinsics.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = eventHandlers;
        this.b = clickthroughEventHandler;
        this.c = contentLoadedHandler;
        this.d = playListItemDisplayingEventHandler;
        this.e = metricsRecorder;
        this.f = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        e eVar = new e(eventHandlers, metricsRecorder);
        this.g = eVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b(context, contentLoadedHandler, playListItemDisplayingEventHandler, metricsRecorder, z, null, 32, null);
        MolocoAdsNetworkBridge.webviewAddJavascriptInterface(bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(eVar), "AndroidTemplateBridge");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b bVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b(context, bVar, clickthroughEventHandler);
        this.h = bVar2;
        bVar2.b();
        this.i = bVar;
        this.j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(bVar, metricsRecorder);
        this.k = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.a(adm, this);
            }
        });
        this.l = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.m = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.b(a.this);
            }
        });
        this.n = k();
    }

    public static final StateFlow b(a aVar) {
        return FlowKt.stateIn(FlowKt.flowCombine(aVar.l, aVar.i.a(), new b(null)), aVar.f, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    public static Object c(a aVar) {
        return Reflection.property0(new PropertyReference0Impl(aVar.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, q, "Ad destroy called", null, false, 12, null);
        this.l.setValue(Boolean.FALSE);
        this.h.remove();
        this.i.destroy();
        CoroutineScopeKt.cancel$default(this.f, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return this.n.isLoaded();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a k() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a) this.k.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5049a
    @NotNull
    public StateFlow l() {
        return (StateFlow) this.m.getValue();
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a n() {
        return this.h;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b p() {
        return this.i;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a s() {
        return this.j;
    }

    @NotNull
    public final StateFlow x() {
        return this.i.getOrientation$moloco_sdk_release();
    }

    public final void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.h = aVar;
    }

    public static final class c implements InterfaceC5050b.a {
        public final /* synthetic */ InterfaceC5050b.a b;

        public c(InterfaceC5050b.a aVar) {
            this.b = aVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b.a
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, a.q, "Ad load successful, start collecting playlist item displaying events", null, false, 12, null);
            a.this.p().a(a.this.n());
            InterfaceC5050b.a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b.a
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
            Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
            InterfaceC5050b.a aVar = this.b;
            if (aVar != null) {
                aVar.a(timeoutError);
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b.a
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
            Intrinsics.checkNotNullParameter(internalError, "internalError");
            InterfaceC5050b.a aVar = this.b;
            if (aVar != null) {
                aVar.a(internalError);
            }
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a a(String str, a aVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a(str, aVar.f, aVar.i);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public void a(@NotNull u listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new d(listener, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        k().a(j, new c(aVar));
    }

    public /* synthetic */ a(Context context, String str, Set set, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar, i iVar, h hVar, MetricsRecorder metricsRecorder, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, set, bVar, iVar, hVar, metricsRecorder, (i & 128) != 0 ? true : z);
    }
}
