package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public final class J implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v {

    @NotNull
    public static final a s = new a(null);
    public static final int t = 8;

    @NotNull
    public static final String u = "TemplateFullscreenAd";

    @NotNull
    public final Context a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y b;

    @NotNull
    public final r c;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i d;

    @NotNull
    public final MetricsRecorder e;

    @NotNull
    public final CoroutineScope f;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d g;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i h;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b i;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h j;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j k;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c l;

    @NotNull
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> m;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a n;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i o;

    @NotNull
    public final MutableStateFlow p;

    @NotNull
    public final Lazy q;

    @NotNull
    public final MutableStateFlow r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$isAdDisplaying$2$1", f = "TemplateFullscreenAd.kt", l = {}, m = "invokeSuspend")
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
            boolean z = this.b;
            boolean z2 = this.c;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append("isAdDisplaying final: ");
            boolean z3 = false;
            sb.append(z && z2);
            sb.append(", _isAdDisplaying: ");
            sb.append(z);
            sb.append(", webViewIsDisplaying: ");
            sb.append(z2);
            MolocoLogger.info$default(molocoLogger, J.u, sb.toString(), null, false, 12, null);
            if (z && z2) {
                z3 = true;
            }
            return Boxing.boxBoolean(z3);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1", f = "TemplateFullscreenAd.kt", l = {135}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ d d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$1", f = "TemplateFullscreenAd.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ List<Job> b;
            public final /* synthetic */ J c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends Job> list, J j, Continuation continuation) {
                super(2, continuation);
                this.b = list;
                this.c = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Unit unit, Continuation continuation) {
                return ((a) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Iterator<T> it = this.b.iterator();
                while (it.hasNext()) {
                    Job.DefaultImpls.cancel$default((Job) it.next(), null, 1, null);
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, J.u, "Calling close()", null, false, 12, null);
                FullscreenWebviewActivity.INSTANCE.a();
                Handler handler = new Handler(Looper.getMainLooper());
                final J j = this.c;
                handler.postDelayed(new Runnable() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$c$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.c.a.a(J.this);
                    }
                }, 1000L);
                return Unit.INSTANCE;
            }

            public static final void a(J j) {
                j.destroy();
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$1", f = "TemplateFullscreenAd.kt", l = {115}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ J b;
            public final /* synthetic */ d c;

            public static final class a<T> implements FlowCollector {
                public final /* synthetic */ d a;

                public a(d dVar) {
                    this.a = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation continuation) {
                    this.a.b();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(J j, d dVar, Continuation continuation) {
                super(2, continuation);
                this.b = j;
                this.c = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow c = this.b.i.c();
                    a aVar = new a(this.c);
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

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$2", f = "TemplateFullscreenAd.kt", l = {120}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$c$c, reason: collision with other inner class name */
        public static final class C1569c extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ J b;
            public final /* synthetic */ d c;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$c$c$a */
            public static final class a<T> implements FlowCollector {
                public final /* synthetic */ d a;

                public a(d dVar) {
                    this.a = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation continuation) {
                    this.a.a();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1569c(J j, d dVar, Continuation continuation) {
                super(2, continuation);
                this.b = j;
                this.c = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1569c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1569c(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow c = this.b.k.c();
                    a aVar = new a(this.c);
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

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$3", f = "TemplateFullscreenAd.kt", l = {129}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ J b;
            public final /* synthetic */ d c;

            public static final class a<T> implements FlowCollector {
                public final /* synthetic */ d a;

                public a(d dVar) {
                    this.a = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation continuation) {
                    this.a.a();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(J j, d dVar, Continuation continuation) {
                super(2, continuation);
                this.b = j;
                this.c = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new d(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow c = this.b.l.c();
                    a aVar = new a(this.c);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d dVar, Continuation continuation) {
            super(2, continuation);
            this.d = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = J.this.new c(this.d, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Job launch$default;
            Job launch$default2;
            Job launch$default3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(J.this, this.d, null), 3, null);
                launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1569c(J.this, this.d, null), 3, null);
                launch$default3 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new d(J.this, this.d, null), 3, null);
                List listOf = CollectionsKt.listOf((Object[]) new Job[]{launch$default, launch$default2, launch$default3});
                SharedFlow c = J.this.g.c();
                a aVar = new a(listOf, J.this, null);
                this.a = 1;
                if (FlowKt.collectLatest(c, aVar, this) == coroutine_suspended) {
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

    public J(@NotNull Context context, @NotNull String adm, @NotNull com.moloco.sdk.internal.services.s clickthroughService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, @NotNull MetricsRecorder metricsRecorder, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = context;
        this.b = watermark;
        this.c = externalLinkHandler;
        this.d = persistentHttpRequest;
        this.e = metricsRecorder;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.f = CoroutineScope;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d(CoroutineScope);
        this.g = dVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i(CoroutineScope);
        this.h = iVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b(clickthroughService, CoroutineScope);
        this.i = bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h(CoroutineScope);
        this.j = hVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j jVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j(CoroutineScope);
        this.k = jVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(CoroutineScope);
        this.l = cVar;
        Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> of = SetsKt.setOf((Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a[]{dVar, bVar, iVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(metricsRecorder), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g(externalLinkHandler), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f(persistentHttpRequest), hVar, jVar, cVar});
        this.m = of;
        this.n = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(context, adm, of, bVar, iVar, hVar, metricsRecorder, z);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c2 = C5059h.a.c(adm);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, u, "Template ad resolved creativeType: " + c2, false, 4, null);
        this.o = c2;
        Boolean bool = Boolean.FALSE;
        this.p = StateFlowKt.MutableStateFlow(bool);
        this.q = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return J.e(J.this);
            }
        });
        this.r = StateFlowKt.MutableStateFlow(bool);
    }

    public static final StateFlow e(J j) {
        return FlowKt.stateIn(FlowKt.flowCombine(j.p, j.n.l(), new b(null)), j.f, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "destroy called", null, false, 12, null);
        this.n.destroy();
        FullscreenWebviewActivity.INSTANCE.a();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return this.n.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    @NotNull
    public StateFlow k() {
        return this.r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5049a
    @NotNull
    public StateFlow l() {
        return (StateFlow) this.q.getValue();
    }

    public static final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u a;
        public final /* synthetic */ J b;

        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar, J j) {
            this.a = uVar;
            this.b = j;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar = this.a;
            if (uVar != null) {
                uVar.a(internalShowError);
            }
            this.b.destroy();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar = this.a;
            if (uVar != null) {
                uVar.b();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, J.u, "Skip button shown, triggering listener callback", null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar = this.a;
            if (uVar != null) {
                uVar.a();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t options, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar) {
        Intrinsics.checkNotNullParameter(options, "options");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "fullscreen ad show called", null, false, 12, null);
        d dVar = new d(uVar, this);
        this.b.a(this.n.p());
        this.n.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u) dVar);
        try {
            FullscreenWebviewActivity.INSTANCE.a(this.a, this.p, this.n, this.e, this.r);
            BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new c(dVar, null), 3, null);
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 36 && (e instanceof UndeclaredThrowableException)) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, u, "Android16BetaFix - Prevented system-level NPE during startActivity", e, false, 8, null);
                dVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.h);
            } else {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, u, "Failed to start fullscreen activity", e, false, 8, null);
                throw e;
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        this.n.a(j, aVar);
    }

    public /* synthetic */ J(Context context, String str, com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, MetricsRecorder metricsRecorder, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, sVar, yVar, rVar, iVar, metricsRecorder, (i & 128) != 0 ? true : z);
    }
}
