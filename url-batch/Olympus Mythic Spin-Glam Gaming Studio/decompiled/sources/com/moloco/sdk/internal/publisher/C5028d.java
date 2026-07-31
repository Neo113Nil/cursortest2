package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.a;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.internal.ortb.model.C5024f;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@VisibleForTesting
/* renamed from: com.moloco.sdk.internal.publisher.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5028d implements AdLoad {

    @NotNull
    public static final a p = new a(null);
    public static final int q = 8;

    @Deprecated
    @NotNull
    public static final String r = "AdLoad";

    @NotNull
    public final Function1 a;

    @NotNull
    public final String b;

    @NotNull
    public final Function1 c;

    @NotNull
    public final com.moloco.sdk.internal.ortb.b d;

    @NotNull
    public final q e;

    @NotNull
    public final AdFormatType f;

    @NotNull
    public final com.moloco.sdk.internal.services.K g;

    @NotNull
    public final MetricsRecorder h;

    @Nullable
    public final Function0 i;

    @NotNull
    public final CoroutineScope j;
    public boolean k;

    @Nullable
    public String l;

    @Nullable
    public com.moloco.sdk.internal.ortb.model.g m;

    @NotNull
    public final TimerEvent n;

    @Nullable
    public Job o;

    /* renamed from: com.moloco.sdk.internal.publisher.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$load$2", f = "AdLoad.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.d$b */
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdLoad.Listener d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, AdLoad.Listener listener, long j, Continuation continuation) {
            super(2, continuation);
            this.c = str;
            this.d = listener;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5028d.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5024f ext;
            C5024f ext2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C5028d c5028d = C5028d.this;
                String str = this.c;
                this.a = 1;
                obj = c5028d.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str2 = (String) obj;
            if (str2 == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdLoadImpl", "Could not pre-process the bid response. Failing the load() call.", null, false, 12, null);
                AdLoad.Listener listener = this.d;
                if (listener != null) {
                    listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(C5028d.this.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR));
                }
                MetricsRecorder metricsRecorder = C5028d.this.h;
                TimerEvent withTag = C5028d.this.n.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
                String c = dVar.c();
                MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                TimerEvent withTag2 = withTag.withTag(c, String.valueOf(errorType.getErrorCode()));
                com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                String c2 = dVar2.c();
                String name = C5028d.this.f.name();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                metricsRecorder.recordTimerEvent(withTag2.withTag(c2, lowerCase));
                MetricsRecorder metricsRecorder2 = C5028d.this.h;
                CountEvent withTag3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.m.c()).withTag(dVar.c(), String.valueOf(errorType.getErrorCode()));
                String c3 = dVar2.c();
                String lowerCase2 = C5028d.this.f.name().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                metricsRecorder2.recordCountEvent(withTag3.withTag(c3, lowerCase2));
                return Unit.INSTANCE;
            }
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, C5028d.r, "Processed the bidResponse, proceeding with the load() call.", null, false, 12, null);
            y a = C5031g.a(this.d, C5028d.this.n, C5028d.this.f, C5028d.this.h, C5028d.this.i);
            if (Intrinsics.areEqual(C5028d.this.l, str2)) {
                if (C5028d.this.isLoaded()) {
                    com.moloco.sdk.internal.ortb.model.B b = null;
                    MolocoAd createAdInfo$default = MolocoAdKt.createAdInfo$default(C5028d.this.b, null, null, 6, null);
                    long j = this.e;
                    C5028d c5028d2 = C5028d.this;
                    C5023e a2 = c5028d2.a(c5028d2.m);
                    a.a(createAdInfo$default, j, (a2 == null || (ext2 = a2.getExt()) == null) ? null : ext2.getSdkEvents());
                    C5028d c5028d3 = C5028d.this;
                    C5023e a3 = c5028d3.a(c5028d3.m);
                    if (a3 != null && (ext = a3.getExt()) != null) {
                        b = ext.getSdkEvents();
                    }
                    a.a(createAdInfo$default, b);
                    return Unit.INSTANCE;
                }
                Job job = C5028d.this.o;
                if (job != null && job.isActive()) {
                    MolocoLogger.info$default(molocoLogger, C5028d.r, "Already loading ad " + C5028d.this.f + ' ' + C5028d.this.b + ". Returning", null, false, 12, null);
                    return Unit.INSTANCE;
                }
            }
            C5028d.this.a(str2, this.e, a);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl", f = "AdLoad.kt", l = {168}, m = "processBidResponse")
    /* renamed from: com.moloco.sdk.internal.publisher.d$c */
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return C5028d.this.a((String) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1", f = "AdLoad.kt", l = {193}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.d$d, reason: collision with other inner class name */
    public static final class C1541d extends SuspendLambda implements Function2 {
        public Object a;
        public long b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ String f;
        public final /* synthetic */ long g;
        public final /* synthetic */ y h;

        /* renamed from: com.moloco.sdk.internal.publisher.d$d$a */
        public static final class a implements InterfaceC5050b.a {
            public final /* synthetic */ C5028d a;
            public final /* synthetic */ y b;
            public final /* synthetic */ C5023e c;

            @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoad$1", f = "AdLoad.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$a, reason: collision with other inner class name */
            public static final class C1542a extends SuspendLambda implements Function2 {
                public int a;
                public final /* synthetic */ C5028d b;
                public final /* synthetic */ y c;
                public final /* synthetic */ C5023e d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1542a(C5028d c5028d, y yVar, C5023e c5023e, Continuation continuation) {
                    super(2, continuation);
                    this.b = c5028d;
                    this.c = yVar;
                    this.d = c5023e;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C1542a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C1542a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C5024f ext;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.k = true;
                    y yVar = this.c;
                    MolocoAd createAdInfo = MolocoAdKt.createAdInfo(this.b.b, Boxing.boxFloat(this.d.getPrice()), this.d.getCrid());
                    C5028d c5028d = this.b;
                    C5023e a = c5028d.a(c5028d.m);
                    yVar.a(createAdInfo, (a == null || (ext = a.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadError$1", f = "AdLoad.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$b */
            public static final class b extends SuspendLambda implements Function2 {
                public int a;
                public final /* synthetic */ C5028d b;
                public final /* synthetic */ y c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C5028d c5028d, y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Continuation continuation) {
                    super(2, continuation);
                    this.b = c5028d;
                    this.c = yVar;
                    this.d = cVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new b(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C5024f ext;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.k = false;
                    y yVar = this.c;
                    com.moloco.sdk.internal.t a = com.moloco.sdk.internal.u.a(this.b.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, this.d, null, 8, null);
                    C5028d c5028d = this.b;
                    C5023e a2 = c5028d.a(c5028d.m);
                    yVar.a(a, (a2 == null || (ext = a2.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadTimeout$1", f = "AdLoad.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$c */
            public static final class c extends SuspendLambda implements Function2 {
                public int a;
                public final /* synthetic */ C5028d b;
                public final /* synthetic */ y c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(C5028d c5028d, y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar, Continuation continuation) {
                    super(2, continuation);
                    this.b = c5028d;
                    this.c = yVar;
                    this.d = aVar;
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

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C5024f ext;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.k = false;
                    y yVar = this.c;
                    com.moloco.sdk.internal.t a = com.moloco.sdk.internal.u.a(this.b.b, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, this.d, null, 8, null);
                    C5028d c5028d = this.b;
                    C5023e a2 = c5028d.a(c5028d.m);
                    yVar.a(a, (a2 == null || (ext = a2.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.INSTANCE;
                }
            }

            public a(C5028d c5028d, y yVar, C5023e c5023e) {
                this.a = c5028d;
                this.b = yVar;
                this.c = c5023e;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b.a
            public void a() {
                BuildersKt__Builders_commonKt.launch$default(this.a.j, null, null, new C1542a(this.a, this.b, this.c, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                BuildersKt__Builders_commonKt.launch$default(this.a.j, null, null, new c(this.a, this.b, timeoutError, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                Intrinsics.checkNotNullParameter(internalError, "internalError");
                BuildersKt__Builders_commonKt.launch$default(this.a.j, null, null, new b(this.a, this.b, internalError, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1541d(String str, long j, y yVar, Continuation continuation) {
            super(2, continuation);
            this.f = str;
            this.g = j;
            this.h = yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1541d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1541d c1541d = C5028d.this.new C1541d(this.f, this.g, this.h, continuation);
            c1541d.d = obj;
            return c1541d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
        
            if (r6 != null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
        
            if (r2 != null) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0173  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.internal.ortb.model.g gVar;
            C5028d c5028d;
            long j;
            Object a2;
            y yVar;
            C5023e a3;
            C5024f ext;
            String str;
            Map emptyMap;
            C5024f ext2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            com.moloco.sdk.internal.ortb.model.B b = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.d;
                C5028d.this.k = false;
                if (!Intrinsics.areEqual(C5028d.this.l, this.f)) {
                    C5028d.this.l = this.f;
                    C5028d.this.m = null;
                }
                gVar = C5028d.this.m;
                if (gVar == null) {
                    c5028d = C5028d.this;
                    String str2 = this.f;
                    y yVar2 = this.h;
                    j = this.g;
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    com.moloco.sdk.internal.ortb.b bVar = c5028d.d;
                    this.d = c5028d;
                    this.a = yVar2;
                    this.b = j;
                    this.c = 1;
                    a2 = bVar.a(str2, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    yVar = yVar2;
                }
                a3 = gVar == null ? C5028d.this.a(gVar) : null;
                if (a3 == null) {
                    ((InterfaceC5050b) C5028d.this.c.invoke(a3)).a(((Duration) C5028d.this.a.invoke(Boxing.boxLong(this.g))).m8173unboximpl(), new a(C5028d.this, this.h, a3));
                    return Unit.INSTANCE;
                }
                y yVar3 = this.h;
                C5028d c5028d2 = C5028d.this;
                com.moloco.sdk.internal.t a4 = com.moloco.sdk.internal.u.a(c5028d2.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.o.e, null, 8, null);
                C5023e a5 = c5028d2.a(c5028d2.m);
                if (a5 != null && (ext = a5.getExt()) != null) {
                    b = ext.getSdkEvents();
                }
                yVar3.a(a4, b);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.b;
            yVar = (y) this.a;
            c5028d = (C5028d) this.d;
            ResultKt.throwOnFailure(obj);
            j = j2;
            a2 = obj;
            com.moloco.sdk.internal.x xVar = (com.moloco.sdk.internal.x) a2;
            if (!(xVar instanceof x.b)) {
                if (!(xVar instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                x.a aVar = (x.a) xVar;
                com.moloco.sdk.internal.o a6 = c5028d.a((com.moloco.sdk.internal.ortb.a) aVar.a());
                Object a7 = aVar.a();
                a.C1536a c1536a = a7 instanceof a.C1536a ? (a.C1536a) a7 : null;
                Exception b2 = c1536a != null ? c1536a.b() : null;
                Object a8 = aVar.a();
                a.b bVar2 = a8 instanceof a.b ? (a.b) a8 : null;
                List<String> b3 = bVar2 != null ? bVar2.b() : null;
                if (b3 != null) {
                    List<String> list = !b3.isEmpty() ? b3 : null;
                    if (list != null) {
                        str = CollectionsKt.joinToString$default(list, StringUtils.COMMA, " missingFields=", null, 0, null, null, 60, null);
                    }
                }
                str = "";
                MolocoLogger.error$default(MolocoLogger.INSTANCE, C5028d.r, "startLoadJob failed to parse BID json string. subType=" + a6 + str, b2, false, 8, null);
                if (b3 != null) {
                    List<String> list2 = !b3.isEmpty() ? b3 : null;
                    if (list2 != null) {
                        String joinToString$default = CollectionsKt.joinToString$default(list2, StringUtils.COMMA, null, null, 0, null, null, 62, null);
                        if (joinToString$default != null) {
                            emptyMap = MapsKt.mapOf(TuplesKt.to("missing_fields", joinToString$default));
                        }
                    }
                }
                emptyMap = MapsKt.emptyMap();
                yVar.a(com.moloco.sdk.internal.u.a(c5028d.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, a6, emptyMap), (com.moloco.sdk.internal.ortb.model.B) null);
                return Unit.INSTANCE;
            }
            com.moloco.sdk.internal.ortb.model.g gVar2 = (com.moloco.sdk.internal.ortb.model.g) ((x.b) xVar).a();
            c5028d.m = gVar2;
            MolocoAd createAdInfo$default = MolocoAdKt.createAdInfo$default(c5028d.b, null, null, 6, null);
            C5023e a9 = c5028d.a(c5028d.m);
            yVar.a(createAdInfo$default, j, (a9 == null || (ext2 = a9.getExt()) == null) ? null : ext2.getSdkEvents());
            gVar = gVar2;
            if (gVar == null) {
            }
            if (a3 == null) {
            }
        }
    }

    public C5028d(@NotNull CoroutineScope scope, @NotNull Function1 timeout, @NotNull String adUnitId, @NotNull Function1 recreateXenossAdLoader, @NotNull com.moloco.sdk.internal.ortb.b parseBidResponse, @NotNull q adLoadPreprocessor, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.internal.services.K webViewChecker, @NotNull MetricsRecorder metricsRecorder, @Nullable Function0 function0) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        Intrinsics.checkNotNullParameter(parseBidResponse, "parseBidResponse");
        Intrinsics.checkNotNullParameter(adLoadPreprocessor, "adLoadPreprocessor");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = timeout;
        this.b = adUnitId;
        this.c = recreateXenossAdLoader;
        this.d = parseBidResponse;
        this.e = adLoadPreprocessor;
        this.f = adFormatType;
        this.g = webViewChecker;
        this.h = metricsRecorder;
        this.i = function0;
        this.j = CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.n = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.j.c());
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(@NotNull String bidResponseJson, @Nullable AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(this.g.a());
        if (m8026exceptionOrNullimpl != null) {
            MolocoLogger.INSTANCE.error(r, "WebView Error: " + m8026exceptionOrNullimpl.getMessage(), m8026exceptionOrNullimpl, true);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(this.b, MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        long a2 = a.h.a.i().a();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdLoadImpl", "load() called with bidResponseJson: " + bidResponseJson, false, 4, null);
        this.n.startTimer();
        MetricsRecorder metricsRecorder = this.h;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.k.c());
        String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.f.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(countEvent.withTag(c2, lowerCase));
        BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new b(bidResponseJson, listener, a2, null), 3, null);
    }

    public final C5023e a(com.moloco.sdk.internal.ortb.model.g gVar) {
        List<com.moloco.sdk.internal.ortb.model.C> b2;
        com.moloco.sdk.internal.ortb.model.C c2;
        List<C5023e> b3;
        if (gVar == null || (b2 = gVar.b()) == null || (c2 = b2.get(0)) == null || (b3 = c2.b()) == null) {
            return null;
        }
        return b3.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        c cVar;
        int i;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    q qVar = this.e;
                    cVar.a = str;
                    cVar.d = 1;
                    obj = qVar.a(str, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) cVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                String str2 = (String) obj;
                return str2 == null ? str2 : str;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        if (str22 == null) {
        }
    }

    public final void a(String str, long j, y yVar) {
        Job launch$default;
        Job job = this.o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new C1541d(str, j, yVar, null), 3, null);
        this.o = launch$default;
    }

    public final com.moloco.sdk.internal.o a(com.moloco.sdk.internal.ortb.a aVar) {
        if (aVar instanceof a.C1536a) {
            return com.moloco.sdk.internal.o.c;
        }
        if (aVar instanceof a.b) {
            return com.moloco.sdk.internal.o.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C5028d(CoroutineScope coroutineScope, Function1 function1, String str, Function1 function12, com.moloco.sdk.internal.ortb.b bVar, q qVar, AdFormatType adFormatType, com.moloco.sdk.internal.services.K k, MetricsRecorder metricsRecorder, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, function1, str, function12, bVar, qVar, adFormatType, k, metricsRecorder, (i & 512) != 0 ? null : function0);
    }
}
