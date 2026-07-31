package com.moloco.sdk.internal.publisher;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.InterfaceC5014a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.b;
import com.moloco.sdk.internal.i;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.service_locator.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.publisher.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5026b {

    @NotNull
    public static final a f = new a(null);
    public static final int g = 8;

    @NotNull
    public static final String h = "UNABLE_TO_CREATE_AD";

    @NotNull
    public static final String i = "AdCreator";

    @NotNull
    public final StateFlow a;

    @NotNull
    public final com.moloco.sdk.internal.services.I b;

    @NotNull
    public final C5027c c;

    @NotNull
    public final Function1 d;

    @NotNull
    public final CoroutineContext e;

    /* renamed from: com.moloco.sdk.internal.publisher.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.moloco.sdk.internal.publisher.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1540b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Initialization.values().length];
            try {
                iArr[Initialization.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Initialization.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator", f = "AdCreator.kt", l = {TTAdConstant.PACKAGE_NAME_CODE}, m = "awaitAdFactoryWithTimeoutOrNull")
    /* renamed from: com.moloco.sdk.internal.publisher.b$c */
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return C5026b.this.a(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$awaitAdFactoryWithTimeoutOrNull$2", f = "AdCreator.kt", l = {TTAdConstant.PACKAGE_NAME_CODE}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.b$d */
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ Function1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.b;
                this.a = 1;
                obj = function1.invoke(this);
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

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createBanner$2", f = "AdCreator.kt", l = {68}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.b$e */
    public static final class e extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5026b.this.new e(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.a;
                long invoke = C5026b.this.b.invoke();
                String a2 = C5026b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a2);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C5026b c5026b = C5026b.this;
                Function1 function1 = c5026b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar2;
                this.b = a2;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a = c5026b.a(function1, tVar2, metricsRecorder, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a2;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a = obj;
            }
            InterfaceC5014a interfaceC5014a = (InterfaceC5014a) a;
            if (interfaceC5014a != null) {
                Context a3 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC5043f e = a.b.a.e();
                String str3 = this.h;
                a.h hVar = a.h.a;
                long j2 = j;
                ViewParent b = interfaceC5014a.b(a3, e, str3, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C5025a(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), i.c.d, this.g);
                if (b != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (b instanceof s) {
                        ((s) b).a(j2, C5026b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(b);
                }
            }
            MolocoAdError.AdCreateError a4 = C5026b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C5026b.i, "Failed to create " + tVar + " with reason: " + a4, null, false, 12, null);
            return new x.a(a4);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createBannerTablet$2", f = "AdCreator.kt", l = {120}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.b$f */
    public static final class f extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5026b.this.new f(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.b;
                long invoke = C5026b.this.b.invoke();
                String a2 = C5026b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a2);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C5026b c5026b = C5026b.this;
                Function1 function1 = c5026b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar2;
                this.b = a2;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a = c5026b.a(function1, tVar2, metricsRecorder, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a2;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a = obj;
            }
            InterfaceC5014a interfaceC5014a = (InterfaceC5014a) a;
            if (interfaceC5014a != null) {
                Context a3 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC5043f e = a.b.a.e();
                String str3 = this.h;
                a.h hVar = a.h.a;
                long j2 = j;
                ViewParent c = interfaceC5014a.c(a3, e, str3, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C5025a(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), i.d.d, this.g);
                if (c != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (c instanceof s) {
                        ((s) c).a(j2, C5026b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(c);
                }
            }
            MolocoAdError.AdCreateError a4 = C5026b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C5026b.i, "Failed to create " + tVar + " with reason: " + a4, null, false, 12, null);
            return new x.a(a4);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createInterstitial$2", f = "AdCreator.kt", l = {262}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.b$g */
    public static final class g extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5026b.this.new g(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.f;
                long invoke = C5026b.this.b.invoke();
                String a2 = C5026b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a2);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C5026b c5026b = C5026b.this;
                Function1 function1 = c5026b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar2;
                this.b = a2;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a = c5026b.a(function1, tVar2, metricsRecorder, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a2;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a = obj;
            }
            InterfaceC5014a interfaceC5014a = (InterfaceC5014a) a;
            if (interfaceC5014a != null) {
                Context a3 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC5043f e = a.b.a.e();
                String str3 = this.h;
                a.h hVar = a.h.a;
                long j2 = j;
                InterstitialAd a4 = interfaceC5014a.a(a3, e, str3, hVar.k(), hVar.f(), a.i.a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C5025a(AdFormatType.INTERSTITIAL, com.moloco.sdk.internal.mediators.b.b(this.j), null), this.g);
                if (a4 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a4 instanceof s) {
                        ((s) a4).a(j2, C5026b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a4);
                }
            }
            MolocoAdError.AdCreateError a5 = C5026b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C5026b.i, "Failed to create " + tVar + " with reason: " + a5, null, false, 12, null);
            return new x.a(a5);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createMREC$2", f = "AdCreator.kt", l = {168}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.b$h */
    public static final class h extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5026b.this.new h(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.c;
                long a2 = C5026b.this.b.a();
                String a3 = C5026b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C5026b c5026b = C5026b.this;
                Function1 function1 = c5026b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = a2;
                this.e = 1;
                a = c5026b.a(function1, tVar2, metricsRecorder, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = a2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a = obj;
            }
            InterfaceC5014a interfaceC5014a = (InterfaceC5014a) a;
            if (interfaceC5014a != null) {
                Context a4 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC5043f e = a.b.a.e();
                String str3 = this.h;
                a.h hVar = a.h.a;
                long j2 = j;
                ViewParent a5 = interfaceC5014a.a(a4, e, str3, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C5025a(AdFormatType.MREC, com.moloco.sdk.internal.mediators.b.c(this.j), null), hVar.j(), i.b.d, this.g);
                if (a5 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a5 instanceof s) {
                        ((s) a5).a(j2, C5026b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a5);
                }
            }
            MolocoAdError.AdCreateError a6 = C5026b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C5026b.i, "Failed to create " + tVar + " with reason: " + a6, null, false, 12, null);
            return new x.a(a6);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createNativeAd$2", f = "AdCreator.kt", l = {212}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.b$i */
    public static final class i extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5026b.this.new i(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.d;
                long a2 = C5026b.this.b.a();
                String a3 = C5026b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C5026b c5026b = C5026b.this;
                Function1 function1 = c5026b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = a2;
                this.e = 1;
                a = c5026b.a(function1, tVar2, metricsRecorder, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = a2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a = obj;
            }
            InterfaceC5014a interfaceC5014a = (InterfaceC5014a) a;
            if (interfaceC5014a != null) {
                Context a4 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC5043f e = a.b.a.e();
                com.moloco.sdk.internal.services.n i2 = a.e.a.i();
                String str3 = this.h;
                a.h hVar = a.h.a;
                long j2 = j;
                NativeAd a5 = interfaceC5014a.a(a4, e, i2, str3, hVar.k(), hVar.f(), a.i.a.c(), hVar.j(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C5025a(AdFormatType.NATIVE, com.moloco.sdk.internal.mediators.b.d(this.j), null), hVar.i(), this.g);
                if (a5 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a5 instanceof s) {
                        ((s) a5).a(j2, C5026b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a5);
                }
            }
            MolocoAdError.AdCreateError a6 = C5026b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C5026b.i, "Failed to create " + tVar + " with reason: " + a6, null, false, 12, null);
            return new x.a(a6);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createRewardedInterstitial$2", f = "AdCreator.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.b$j */
    public static final class j extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5026b.this.new j(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.g;
                long invoke = C5026b.this.b.invoke();
                String a2 = C5026b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a2);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C5026b c5026b = C5026b.this;
                Function1 function1 = c5026b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.a = tVar2;
                this.b = a2;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a = c5026b.a(function1, tVar2, metricsRecorder, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a2;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a = obj;
            }
            InterfaceC5014a interfaceC5014a = (InterfaceC5014a) a;
            if (interfaceC5014a != null) {
                Context a3 = com.moloco.sdk.service_locator.a.a.a();
                InterfaceC5043f e = a.b.a.e();
                String str3 = this.h;
                a.h hVar = a.h.a;
                long j2 = j;
                RewardedInterstitialAd a4 = interfaceC5014a.a(a3, e, str3, hVar.k(), hVar.f(), a.i.a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(this.i), new C5025a(AdFormatType.REWARDED, com.moloco.sdk.internal.mediators.b.b(this.j), null), this.g, a.c.a.b());
                if (a4 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a4 instanceof s) {
                        ((s) a4).a(j2, C5026b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C5026b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a4);
                }
            }
            MolocoAdError.AdCreateError a5 = C5026b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C5026b.i, "Failed to create " + tVar + " with reason: " + a5, null, false, 12, null);
            return new x.a(a5);
        }
    }

    public C5026b(@NotNull StateFlow initializationState, @NotNull com.moloco.sdk.internal.services.I timeProviderService, @NotNull C5027c adCreatorConfiguration, @NotNull Function1 awaitAdFactory) {
        Intrinsics.checkNotNullParameter(initializationState, "initializationState");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(adCreatorConfiguration, "adCreatorConfiguration");
        Intrinsics.checkNotNullParameter(awaitAdFactory, "awaitAdFactory");
        this.a = initializationState;
        this.b = timeProviderService;
        this.c = adCreatorConfiguration;
        this.d = awaitAdFactory;
        this.e = com.moloco.sdk.internal.scheduling.b.a().getDefault();
    }

    @Nullable
    public final Object d(@NotNull String str, @NotNull String str2, @NotNull MetricsRecorder metricsRecorder, @Nullable String str3, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.e, new h(metricsRecorder, str2, str3, str, null), continuation);
    }

    @Nullable
    public final Object e(@NotNull String str, @NotNull String str2, @NotNull MetricsRecorder metricsRecorder, @Nullable String str3, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.e, new i(metricsRecorder, str2, str3, str, null), continuation);
    }

    @Nullable
    public final Object f(@NotNull String str, @NotNull String str2, @NotNull MetricsRecorder metricsRecorder, @Nullable String str3, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.e, new j(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ Object d(C5026b c5026b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c5026b.d(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ Object e(C5026b c5026b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c5026b.e(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ Object f(C5026b c5026b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c5026b.f(str, str2, metricsRecorder, str3, continuation);
    }

    @Nullable
    public final Object b(@NotNull String str, @NotNull String str2, @NotNull MetricsRecorder metricsRecorder, @Nullable String str3, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.e, new f(metricsRecorder, str2, str3, str, null), continuation);
    }

    @Nullable
    public final Object c(@NotNull String str, @NotNull String str2, @NotNull MetricsRecorder metricsRecorder, @Nullable String str3, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.e, new g(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ Object b(C5026b c5026b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c5026b.b(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ Object c(C5026b c5026b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c5026b.c(str, str2, metricsRecorder, str3, continuation);
    }

    @Nullable
    public final Object a(@NotNull String str, @NotNull String str2, @NotNull MetricsRecorder metricsRecorder, @Nullable String str3, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.e, new e(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ Object a(C5026b c5026b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c5026b.a(str, str2, metricsRecorder, str3, continuation);
    }

    public final MolocoAdError.AdCreateError a(String str, String str2, TimerEvent timerEvent, t tVar, MetricsRecorder metricsRecorder) {
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
        CountEvent withTag = countEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("initial_sdk_init_state", str2).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name());
        Initialization initialization = (Initialization) this.a.getValue();
        int i2 = initialization == null ? -1 : C1540b.a[initialization.ordinal()];
        if (i2 == -1) {
            com.moloco.sdk.internal.error.b f2 = a.b.a.f();
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE_");
            String upperCase = tVar.name().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
            sb.append("_AD_FAILED_SDK_INIT_NOT_COMPLETED");
            b.a.a(f2, sb.toString(), null, 2, null);
            TimerEvent withTag2 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag2.withTag(dVar2.c(), "sdk_init_not_completed"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar2.c(), "sdk_init_not_completed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i2 == 1) {
            b.a.a(a.b.a.f(), h, null, 2, null);
            TimerEvent withTag3 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag3.withTag(dVar3.c(), "unable_to_create_ad"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar3.c(), "unable_to_create_ad"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Could not find the adUnitId that was requested for load: " + str, null, false, 12, null);
            return MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i2 == 2) {
            com.moloco.sdk.internal.error.b f3 = a.b.a.f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE_");
            String upperCase2 = tVar.name().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            sb2.append(upperCase2);
            sb2.append("_AD_FAILED_SDK_INIT_FAILED");
            b.a.a(f3, sb2.toString(), null, 2, null);
            TimerEvent withTag4 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag4.withTag(dVar4.c(), "sdk_init_failed"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar4.c(), "sdk_init_failed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_FAILED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @SuppressLint({"RestrictedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function1 function1, t tVar, MetricsRecorder metricsRecorder, Continuation continuation) {
        c cVar;
        int i2;
        TimerEvent startTimerEvent;
        Object m8206withTimeoutOrNullKLykuaI;
        t tVar2 = tVar;
        MetricsRecorder metricsRecorder2 = metricsRecorder;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i3 = cVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.f = i3 - Integer.MIN_VALUE;
                Object obj = cVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    startTimerEvent = metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.i.c());
                    Duration duration = this.c.c().get(tVar2);
                    long m8173unboximpl = duration != null ? duration.m8173unboximpl() : this.c.d();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "Waiting for AdFactory with timeout: " + ((Object) Duration.m8170toStringimpl(m8173unboximpl)), null, false, 12, null);
                    d dVar = new d(function1, null);
                    cVar.a = tVar2;
                    cVar.b = metricsRecorder2;
                    cVar.c = startTimerEvent;
                    cVar.f = 1;
                    m8206withTimeoutOrNullKLykuaI = TimeoutKt.m8206withTimeoutOrNullKLykuaI(m8173unboximpl, dVar, cVar);
                    if (m8206withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    TimerEvent timerEvent = (TimerEvent) cVar.c;
                    metricsRecorder2 = (MetricsRecorder) cVar.b;
                    t tVar3 = (t) cVar.a;
                    ResultKt.throwOnFailure(obj);
                    startTimerEvent = timerEvent;
                    tVar2 = tVar3;
                    m8206withTimeoutOrNullKLykuaI = obj;
                }
                InterfaceC5014a interfaceC5014a = (InterfaceC5014a) m8206withTimeoutOrNullKLykuaI;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append("AdFactory received: ");
                sb.append(interfaceC5014a != null);
                MolocoLogger.info$default(molocoLogger, i, sb.toString(), null, false, 12, null);
                metricsRecorder2.recordTimerEvent(startTimerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), interfaceC5014a == null ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE));
                return m8206withTimeoutOrNullKLykuaI;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cVar.f;
        if (i2 != 0) {
        }
        InterfaceC5014a interfaceC5014a2 = (InterfaceC5014a) m8206withTimeoutOrNullKLykuaI;
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdFactory received: ");
        sb2.append(interfaceC5014a2 != null);
        MolocoLogger.info$default(molocoLogger2, i, sb2.toString(), null, false, 12, null);
        metricsRecorder2.recordTimerEvent(startTimerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), interfaceC5014a2 == null ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE));
        return m8206withTimeoutOrNullKLykuaI;
    }

    public final String a() {
        String name;
        Initialization initialization = (Initialization) this.a.getValue();
        if (initialization != null && (name = initialization.name()) != null) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        return "not_invoked_or_in_progress";
    }
}
