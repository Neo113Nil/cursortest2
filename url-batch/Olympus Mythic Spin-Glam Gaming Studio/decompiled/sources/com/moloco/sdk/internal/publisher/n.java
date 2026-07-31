package com.moloco.sdk.internal.publisher;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C5022d;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5059h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C5072a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C5073b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.pubmatic.sdk.video.POBVastError;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
@VisibleForTesting
/* loaded from: classes11.dex */
public final class n<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> extends Banner implements s {
    public static final int B = 12;

    @NotNull
    public static final String C = "BannerViewImpl";

    @NotNull
    public final Context a;

    @NotNull
    public final InterfaceC5043f b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;

    @NotNull
    public final String d;
    public final boolean e;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;

    @NotNull
    public final Function8 g;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y h;

    @NotNull
    public final C5025a i;

    @NotNull
    public final com.moloco.sdk.internal.C j;

    @NotNull
    public final com.moloco.sdk.internal.i k;

    @NotNull
    public final com.moloco.sdk.internal.services.s l;

    @NotNull
    public final MetricsRecorder m;

    @NotNull
    public final Q n;

    @NotNull
    public final AdFormatType o;
    public boolean p;

    @NotNull
    public final TimerEvent q;

    @Nullable
    public TimerEvent r;

    @NotNull
    public final CoroutineScope s;

    @NotNull
    public final l<L> t;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h u;

    @Nullable
    public C v;

    @Nullable
    public BannerAdShowListener w;

    @NotNull
    public final AdLoad x;

    @NotNull
    public final L y;

    @NotNull
    public static final a z = new a(null);
    public static final int A = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, n.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5050b invoke(C5023e p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((n) this.receiver).a(p0);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$1", f = "Banner.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function3 {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public c(Continuation continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.b = z;
            cVar.c = z2;
            return cVar.invokeSuspend(Unit.INSTANCE);
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

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$2", f = "Banner.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ boolean b;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation continuation) {
            return ((d) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.b = ((Boolean) obj).booleanValue();
            return dVar;
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

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$3", f = "Banner.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ n<L> c;
        public final /* synthetic */ l<L> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n<L> nVar, l<L> lVar, Continuation continuation) {
            super(2, continuation);
            this.c = nVar;
            this.d = lVar;
        }

        public final Object a(boolean z, Continuation continuation) {
            return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = new e(this.c, this.d, continuation);
            eVar.b = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r3 == null) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String lowerCase;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
            String name;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            this.c.t.b(z);
            if (z) {
                TimerEvent timerEvent = this.c.r;
                if (timerEvent != null) {
                    n<L> nVar = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f = nVar.t.f();
                    if (f != null && (creativeType = f.getCreativeType()) != null && (name = creativeType.name()) != null) {
                        lowerCase = name.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    MetricsRecorder metricsRecorder = nVar.m;
                    String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    String lowerCase2 = nVar.o.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(c, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
                }
                String c2 = this.c.c();
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, n.C, "Banner parent view type: " + c2, false, 4, null);
                C c3 = this.c.v;
                if (c3 != null) {
                    c3.a(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null), c2);
                }
            } else {
                C c4 = this.c.v;
                if (c4 != null) {
                    c4.onAdHidden(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null));
                }
                Job a = this.d.a();
                if (a != null) {
                    Job.DefaultImpls.cancel$default(a, null, 1, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$4", f = "Banner.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ boolean b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation continuation) {
            return ((f) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = new f(continuation);
            fVar.b = ((Boolean) obj).booleanValue();
            return fVar;
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

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$5", f = "Banner.kt", l = {}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ n<L> c;
        public final /* synthetic */ l<L> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(n<L> nVar, l<L> lVar, Continuation continuation) {
            super(2, continuation);
            this.c = nVar;
            this.d = lVar;
        }

        public final Object a(boolean z, Continuation continuation) {
            return ((g) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            g gVar = new g(this.c, this.d, continuation);
            gVar.b = ((Boolean) obj).booleanValue();
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r3 == null) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String lowerCase;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
            String name;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b) {
                TimerEvent timerEvent = this.c.r;
                if (timerEvent != null) {
                    n<L> nVar = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f = nVar.t.f();
                    if (f != null && (creativeType = f.getCreativeType()) != null && (name = creativeType.name()) != null) {
                        lowerCase = name.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    MetricsRecorder metricsRecorder = nVar.m;
                    String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    String lowerCase2 = nVar.o.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(c, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
                }
                String c2 = this.c.c();
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, n.C, "Banner parent view type: " + c2, false, 4, null);
                C c3 = this.c.v;
                if (c3 != null) {
                    c3.a(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null), c2);
                }
            } else {
                C c4 = this.c.v;
                if (c4 != null) {
                    c4.onAdHidden(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null));
                }
                Job a = this.d.a();
                if (a != null) {
                    Job.DefaultImpls.cancel$default(a, null, 1, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$load$1", f = "Banner.kt", l = {}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ n<L> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdLoad.Listener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(n<L> nVar, String str, AdLoad.Listener listener, Continuation continuation) {
            super(2, continuation);
            this.b = nVar;
            this.c = str;
            this.d = listener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.x.load(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$1", f = "Banner.kt", l = {POBVastError.NO_VAST_RESPONSE}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ SharedFlow b;
        public final /* synthetic */ n<L> c;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ n<L> a;

            public a(n<L> nVar) {
                this.a = nVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Unit unit, Continuation continuation) {
                this.a.y.b();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SharedFlow sharedFlow, n<L> nVar, Continuation continuation) {
            super(2, continuation);
            this.b = sharedFlow;
            this.c = nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlow = this.b;
                a aVar = new a(this.c);
                this.a = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$2$1", f = "Banner.kt", l = {Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ MotionEvent b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A c;
        public final /* synthetic */ n<L> d;
        public final /* synthetic */ MutableSharedFlow e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MotionEvent motionEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A a, n<L> nVar, MutableSharedFlow mutableSharedFlow, Continuation continuation) {
            super(2, continuation);
            this.b = motionEvent;
            this.c = a;
            this.d = nVar;
            this.e = mutableSharedFlow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MotionEvent motionEvent = this.b;
                if (motionEvent != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A a2 = this.c;
                    n<L> nVar = this.d;
                    MutableSharedFlow mutableSharedFlow = this.e;
                    com.moloco.sdk.internal.services.s sVar = nVar.l;
                    String c = nVar.t.c();
                    String d = nVar.t.d();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar = nVar.u;
                    this.a = 1;
                    a = a2.a(motionEvent, sVar, c, d, hVar, mutableSharedFlow, (r19 & 64) != 0 ? com.moloco.sdk.internal.A.b() : null, this);
                    if (a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public /* synthetic */ n(Context context, InterfaceC5043f interfaceC5043f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, String str, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function8 function8, Function1 function1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, C5025a c5025a, com.moloco.sdk.internal.C c2, com.moloco.sdk.internal.i iVar, com.moloco.sdk.internal.services.s sVar, MetricsRecorder metricsRecorder, Q q, AdFormatType adFormatType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC5043f, aVar, str, z2, rVar, function8, function1, yVar, c5025a, c2, iVar, sVar, metricsRecorder, q, (i2 & 32768) != 0 ? AdFormatType.BANNER : adFormatType);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i l(n nVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = nVar.t.f();
        if (f2 != null) {
            return f2.getCreativeType();
        }
        return null;
    }

    public static final com.moloco.sdk.internal.ortb.model.B m(n nVar) {
        return nVar.t.e();
    }

    public static final C5035k n(n nVar) {
        return nVar.t.b();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i o(n nVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = nVar.t.f();
        if (f2 != null) {
            return f2.getCreativeType();
        }
        return null;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j2, long j3) {
        this.i.a(j2, j3);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.s, null, 1, null);
        a(this, null, 1, null);
        setAdShowListener(null);
        this.v = null;
    }

    @Override // com.moloco.sdk.publisher.Banner, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.moloco.sdk.publisher.Banner
    @Nullable
    public BannerAdShowListener getAdShowListener() {
        return this.w;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    public long mo6143getCreateAdObjectDurationUwyO8pc() {
        return this.i.mo6143getCreateAdObjectDurationUwyO8pc();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.x.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(@NotNull String bidResponseJson, @Nullable AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.m.recordTimerEvent(this.q);
        this.r = this.m.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.p.c());
        BuildersKt__Builders_commonKt.launch$default(this.s, null, null, new h(this, bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.publisher.Banner, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.moloco.sdk.publisher.Banner
    public void setAdShowListener(@Nullable BannerAdShowListener bannerAdShowListener) {
        C a2 = a(bannerAdShowListener);
        this.v = a2;
        this.w = a2.b();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    public void mo6144setCreateAdObjectDurationLRDsOJo(long j2) {
        this.i.mo6144setCreateAdObjectDurationLRDsOJo(j2);
    }

    public static final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w {
        public final /* synthetic */ n<L> a;

        public k(n<L> nVar) {
            this.a = nVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w
        public void a(boolean z) {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            C c = this.a.v;
            if (c != null) {
                c.onAdClicked(MolocoAdKt.createAdInfo$default(this.a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            n<L> nVar = this.a;
            nVar.a(com.moloco.sdk.internal.u.a(nVar.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }
    }

    public final void b() {
        StateFlow isLoaded;
        l<L> lVar = this.t;
        if (!a()) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "Banner: Using isAdShowing function to track ad display state.", false, 4, null);
            Job a2 = lVar.a();
            if (a2 != null) {
                Job.DefaultImpls.cancel$default(a2, null, 1, null);
            }
            lVar.a(FlowKt.launchIn(FlowKt.onEach(FlowKt.dropWhile(a(this.t.f()), new f(null)), new g(this, lVar, null)), this.s));
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "MREC: Using ViewVisibilityTracker(ImpressionViewVisibilityTracker) to track ad display state.", false, 4, null);
        Job a3 = lVar.a();
        if (a3 != null) {
            Job.DefaultImpls.cancel$default(a3, null, 1, null);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = lVar.f();
        if (f2 == null || (isLoaded = f2.isLoaded()) == null) {
            return;
        }
        lVar.a(FlowKt.launchIn(FlowKt.onEach(FlowKt.dropWhile(FlowKt.combine(isLoaded, this.n.a(this), new c(null)), new d(null)), new e(this, lVar, null)), this.s));
    }

    public final String c() {
        Object parent = getParent();
        while (parent != null) {
            String simpleName = parent.getClass().getSimpleName();
            Intrinsics.checkNotNull(simpleName);
            if (StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "RecyclerView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "ScrollView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "ListView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "ViewPager", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "HorizontalScrollView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "AndroidComposeView", false, 2, (Object) null)) {
                return simpleName;
            }
            View view = parent instanceof View ? (View) parent : null;
            parent = view != null ? view.getParent() : null;
        }
        return "none";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull String adUnitId, boolean z2, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull Function8 createXenossBannerView, @NotNull Function1 createXenossBannerAdShowListener, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull com.moloco.sdk.internal.C viewLifecycleOwner, @NotNull com.moloco.sdk.internal.i bannerSize, @NotNull com.moloco.sdk.internal.services.s clickthroughService, @NotNull MetricsRecorder metricsRecorder, @NotNull Q viewVisibilityTracker, @NotNull AdFormatType adFormatType) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(createXenossBannerView, "createXenossBannerView");
        Intrinsics.checkNotNullParameter(createXenossBannerAdShowListener, "createXenossBannerAdShowListener");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.a = context;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = adUnitId;
        this.e = z2;
        this.f = externalLinkHandler;
        this.g = createXenossBannerView;
        this.h = watermark;
        this.i = adCreateLoadTimeoutManager;
        this.j = viewLifecycleOwner;
        this.k = bannerSize;
        this.l = clickthroughService;
        this.m = metricsRecorder;
        this.n = viewVisibilityTracker;
        this.o = adFormatType;
        TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.q = startTimerEvent.withTag(c2, lowerCase);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.s = CoroutineScope;
        this.t = new l<>(null, null, null, null, false, null, null, false, 255, null);
        this.u = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a();
        this.x = C5029e.a(CoroutineScope, new Function1() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.a(n.this, ((Long) obj).longValue());
            }
        }, adUnitId, new b(this), adFormatType, a.C1563a.a.b(), metricsRecorder, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return n.l(n.this);
            }
        });
        this.y = (L) createXenossBannerAdShowListener.invoke(new k(this));
    }

    public final C a(BannerAdShowListener bannerAdShowListener) {
        return new C(bannerAdShowListener, this.b, this.c, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return n.m(n.this);
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return n.n(n.this);
            }
        }, this.o, this.m, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return n.o(n.this);
            }
        });
    }

    public static /* synthetic */ void a(n nVar, com.moloco.sdk.internal.t tVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tVar = null;
        }
        nVar.a(tVar);
    }

    public final void a(com.moloco.sdk.internal.t tVar) {
        boolean booleanValue;
        C c2;
        C c3;
        l<L> lVar = this.t;
        Job a2 = lVar.a();
        if (a2 != null) {
            Job.DefaultImpls.cancel$default(a2, null, 1, null);
        }
        lVar.a((Job) null);
        if (a()) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "MREC : isAdShowing state set from ViewVisibilityTracker (ImpressionViewVisibilityTracker).", false, 4, null);
            booleanValue = this.t.h();
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "Banner: isAdShowing state set from isAdShowing function.", false, 4, null);
            booleanValue = ((Boolean) a(this.t.f()).getValue()).booleanValue();
        }
        l<L> lVar2 = this.t;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f2 = lVar2.f();
        if (f2 != null) {
            f2.destroy();
        }
        lVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B) null);
        if (tVar != null && (c3 = this.v) != null) {
            c3.a(tVar);
        }
        if (booleanValue && (c2 = this.v) != null) {
            c2.onAdHidden(MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        }
        this.t.a((com.moloco.sdk.internal.ortb.model.B) null);
        if (a()) {
            this.t.b(false);
        }
        this.t.a((C5035k) null);
    }

    public static final Duration a(n nVar, long j2) {
        return Duration.m8137boximpl(nVar.i.a());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final InterfaceC5050b a(C5023e c5023e) {
        C5022d bannerClickMetaData;
        C5022d bannerClickMetaData2;
        this.p = C5059h.a.b(c5023e.getAdm());
        a(this, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B) this.g.invoke(this.a, this.c, c5023e, this.f, this.h, this.j, this.l, this.u);
        l<L> lVar = this.t;
        lVar.a(b2);
        lVar.a(c5023e.getExt().getSdkEvents());
        lVar.a(c5023e.getCom.ironsource.q2.y java.lang.String() != null ? new C5035k(c5023e.getCom.ironsource.q2.y java.lang.String(), Float.valueOf(c5023e.getPrice())) : null);
        com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData = c5023e.getExt().getMolocoSdkClickMetaData();
        lVar.b((molocoSdkClickMetaData == null || (bannerClickMetaData2 = molocoSdkClickMetaData.getBannerClickMetaData()) == null) ? null : bannerClickMetaData2.getClickThrough());
        com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData2 = c5023e.getExt().getMolocoSdkClickMetaData();
        lVar.a((molocoSdkClickMetaData2 == null || (bannerClickMetaData = molocoSdkClickMetaData2.getBannerClickMetaData()) == null) ? null : bannerClickMetaData.getClickTracking());
        com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData3 = c5023e.getExt().getMolocoSdkClickMetaData();
        lVar.a((molocoSdkClickMetaData3 != null ? molocoSdkClickMetaData3.getBannerClickMetaData() : null) != null);
        b2.setAdShowListener(this.y);
        b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.moloco.sdk.internal.j.a(this.k.b()), com.moloco.sdk.internal.j.a(this.k.a()));
        layoutParams.gravity = 1;
        addView(b2, layoutParams);
        if (this.t.g()) {
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A a2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A(this.a);
            final MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            BuildersKt__Builders_commonKt.launch$default(this.s, null, null, new i(MutableSharedFlow$default, this, null), 3, null);
            a2.setOnTouchListener(new View.OnTouchListener() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return n.a(n.this, a2, MutableSharedFlow$default, view, motionEvent);
                }
            });
            addView(a2, new FrameLayout.LayoutParams(-1, com.moloco.sdk.internal.j.a(this.k.a())));
        }
        C5073b c5073b = new C5073b(this.f, this.a, null, 0, 12, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388691;
        c5073b.setPadding(12, 0, 0, 12);
        c5073b.setPrivacyUrl(C5072a.a);
        c5073b.setOnButtonRenderedListener(new Function1() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.a(n.this, (a.AbstractC1677a.c) obj);
            }
        });
        c5073b.setLayoutParams(layoutParams2);
        addView(c5073b);
        return b2;
    }

    public static final boolean a(n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A a2, MutableSharedFlow mutableSharedFlow, View view, MotionEvent motionEvent) {
        BuildersKt__Builders_commonKt.launch$default(nVar.s, null, null, new j(motionEvent, a2, nVar, mutableSharedFlow, null), 3, null);
        return false;
    }

    public static final Unit a(n nVar, a.AbstractC1677a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        nVar.u.a(button);
        return Unit.INSTANCE;
    }

    public final StateFlow a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b2) {
        if (!this.e && b2 != null) {
            return b2.l();
        }
        return getIsViewShown();
    }

    public final boolean a() {
        return this.o == AdFormatType.MREC && this.p;
    }
}
