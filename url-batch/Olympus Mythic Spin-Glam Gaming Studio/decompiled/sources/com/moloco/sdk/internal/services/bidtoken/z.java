package com.moloco.sdk.internal.services.bidtoken;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@VisibleForTesting
/* loaded from: classes4.dex */
public final class z implements y {
    public static final int i = 8;

    @NotNull
    public final InterfaceC5038a b;

    @NotNull
    public final CoroutineScope c;

    @NotNull
    public final v d;

    @NotNull
    public final String e;
    public boolean f;

    @NotNull
    public final Mutex g;

    @Nullable
    public Job h;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl$bidToken$2", f = "ServerBidTokenService.kt", l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function1 {
        public int a;
        public final /* synthetic */ MetricsRecorder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MetricsRecorder metricsRecorder, Continuation continuation) {
            super(1, continuation);
            this.c = metricsRecorder;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return z.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                z.this.b("[Thread: " + Thread.currentThread().getName() + "] Acquired lock, fetching status of current token");
                v vVar = z.this.d;
                this.a = 1;
                obj = vVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            B b = (B) obj;
            z.this.a("[Thread: " + Thread.currentThread().getName() + "] bidToken status: " + b);
            if (!b.b()) {
                z.this.b("[Thread: " + Thread.currentThread().getName() + "] bidToken needs refresh, fetching new token");
                z zVar = z.this;
                MetricsRecorder metricsRecorder = this.c;
                k b2 = e.b();
                this.a = 2;
                obj = zVar.a(metricsRecorder, b2, false, false, this);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
            MetricsRecorder metricsRecorder2 = this.c;
            CountEvent withTag = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.v.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "true").withTag("initial_fetch", "false");
            B b3 = B.b;
            metricsRecorder2.recordCountEvent(withTag.withTag("expiring", b != b3 ? "false" : "true"));
            k a = z.this.d.a();
            if (b == b3) {
                z.this.a("[Thread: " + Thread.currentThread().getName() + "] bidToken is expiring, returning cached, and refreshing async");
                z.this.a(this.c);
            } else {
                z.this.a("[Thread: " + Thread.currentThread().getName() + "] bidToken doesn't need refresh, returning cached");
            }
            return a;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl", f = "ServerBidTokenService.kt", l = {129, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173}, m = "fetchServerBidToken$moloco_sdk_release")
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public boolean e;
        public boolean f;
        public /* synthetic */ Object g;
        public int i;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return z.this.a(null, null, false, false, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl$fetchServerBidToken$bidTokenComponents$1", f = "ServerBidTokenService.kt", l = {174}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function1 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.internal.x<k, com.moloco.sdk.internal.m> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.internal.x<k, com.moloco.sdk.internal.m> xVar, Continuation continuation) {
            super(1, continuation);
            this.c = xVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return z.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                v vVar = z.this.d;
                k kVar = (k) ((x.b) this.c).a();
                this.a = 1;
                if (vVar.a(kVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl$refreshTokenAsyncOnExpiry$1", f = "ServerBidTokenService.kt", l = {106}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ MetricsRecorder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MetricsRecorder metricsRecorder, Continuation continuation) {
            super(2, continuation);
            this.c = metricsRecorder;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return z.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                z.this.b("[Thread: " + Thread.currentThread().getName() + "] Fetching token from server");
                z zVar = z.this;
                MetricsRecorder metricsRecorder = this.c;
                k b = e.b();
                this.a = 1;
                if (zVar.a(metricsRecorder, b, true, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            z.this.b("[Thread: " + Thread.currentThread().getName() + "] Finished fetching token from server");
            return Unit.INSTANCE;
        }
    }

    public z(@NotNull InterfaceC5038a bidTokenApi, @NotNull CoroutineScope scope, @NotNull v tokenCache) {
        Intrinsics.checkNotNullParameter(bidTokenApi, "bidTokenApi");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tokenCache, "tokenCache");
        this.b = bidTokenApi;
        this.c = scope;
        this.d = tokenCache;
        this.e = "ServerBidTokenServiceImpl";
        this.f = true;
        this.g = MutexKt.Mutex$default(false, 1, null);
    }

    public final void b(String str) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, null, false, 12, null);
    }

    @VisibleForTesting
    public final void a(@NotNull MetricsRecorder metricsRecorder) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        b("[Thread: " + Thread.currentThread().getName() + "] Refreshing token async");
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.x.c());
        Job job = this.h;
        metricsRecorder.recordCountEvent(countEvent.withTag("async", String.valueOf(job != null ? job.isActive() : false)));
        Job job2 = this.h;
        if (job2 != null && job2.isActive()) {
            b("[Thread: " + Thread.currentThread().getName() + "] Async refresh already in progress. Returning");
            return;
        }
        b("[Thread: " + Thread.currentThread().getName() + "] Scheduling to fetch token from server");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new d(metricsRecorder, null), 3, null);
        this.h = launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @VisibleForTesting
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull MetricsRecorder metricsRecorder, @NotNull k kVar, boolean z, boolean z2, @NotNull Continuation continuation) {
        b bVar;
        int i2;
        k kVar2;
        boolean z3;
        TimerEvent timerEvent;
        boolean z4;
        MetricsRecorder metricsRecorder2;
        z zVar;
        com.moloco.sdk.internal.x xVar;
        z zVar2;
        com.moloco.sdk.internal.x xVar2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.i = i3 - Integer.MIN_VALUE;
                Object obj = bVar.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bVar.i;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.m.c());
                    b("[Thread: " + Thread.currentThread().getName() + "] fetchServerBidToken");
                    InterfaceC5038a interfaceC5038a = this.b;
                    bVar.a = this;
                    bVar.b = metricsRecorder;
                    kVar2 = kVar;
                    bVar.c = kVar2;
                    bVar.d = startTimerEvent;
                    bVar.e = z;
                    z3 = z2;
                    bVar.f = z3;
                    bVar.i = 1;
                    Object a2 = interfaceC5038a.a(metricsRecorder, bVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    timerEvent = startTimerEvent;
                    obj = a2;
                    z4 = z;
                    metricsRecorder2 = metricsRecorder;
                    zVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar2 = (com.moloco.sdk.internal.x) bVar.b;
                        zVar2 = (z) bVar.a;
                        ResultKt.throwOnFailure(obj);
                        k kVar3 = (k) ((x.b) xVar2).a();
                        zVar2.f = false;
                        return kVar3;
                    }
                    boolean z5 = bVar.f;
                    z4 = bVar.e;
                    timerEvent = (TimerEvent) bVar.d;
                    kVar2 = (k) bVar.c;
                    metricsRecorder2 = (MetricsRecorder) bVar.b;
                    z zVar3 = (z) bVar.a;
                    ResultKt.throwOnFailure(obj);
                    z3 = z5;
                    zVar = zVar3;
                }
                xVar = (com.moloco.sdk.internal.x) obj;
                if (!(xVar instanceof x.a)) {
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.u.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    CountEvent withTag = countEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    x.a aVar = (x.a) xVar;
                    metricsRecorder2.recordCountEvent(withTag.withTag(dVar2.c(), String.valueOf(((com.moloco.sdk.internal.m) aVar.a()).b())).withTag("initial_fetch", String.valueOf(zVar.f)).withTag("was_expiring", String.valueOf(z3)).withTag("async", String.valueOf(z4)));
                    metricsRecorder2.recordTimerEvent(timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), String.valueOf(((com.moloco.sdk.internal.m) aVar.a()).b())).withTag("initial_fetch", String.valueOf(zVar.f)).withTag("was_expiring", String.valueOf(z3)).withTag("async", String.valueOf(z4)));
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, zVar.e, "bidtoken request failed: " + ((com.moloco.sdk.internal.m) aVar.a()).b() + ", details: " + ((com.moloco.sdk.internal.m) aVar.a()).a(), null, false, 12, null);
                    return kVar2;
                }
                if (xVar instanceof x.b) {
                    CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.u.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent2.withTag(dVar3.c(), "success").withTag("initial_fetch", String.valueOf(zVar.f)).withTag("was_expiring", String.valueOf(z3)).withTag("async", String.valueOf(z4)));
                    metricsRecorder2.recordTimerEvent(timerEvent.withTag(dVar3.c(), "success").withTag("initial_fetch", String.valueOf(zVar.f)).withTag("was_expiring", String.valueOf(z3)).withTag("async", String.valueOf(z4)));
                    metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.v.c()).withTag(dVar3.c(), "false").withTag("initial_fetch", String.valueOf(zVar.f)).withTag("async", String.valueOf(z4)));
                    zVar.b("[Thread: " + Thread.currentThread().getName() + "] bidtoken request success");
                    Mutex mutex = zVar.g;
                    c cVar = zVar.new c(xVar, null);
                    bVar.a = zVar;
                    bVar.b = xVar;
                    bVar.c = null;
                    bVar.d = null;
                    bVar.i = 2;
                    if (com.moloco.sdk.internal.utils.a.a(mutex, cVar, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zVar2 = zVar;
                    xVar2 = xVar;
                    k kVar32 = (k) ((x.b) xVar2).a();
                    zVar2.f = false;
                    return kVar32;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bVar.i;
        if (i2 != 0) {
        }
        xVar = (com.moloco.sdk.internal.x) obj2;
        if (!(xVar instanceof x.a)) {
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.y
    @Nullable
    public Object a(@NotNull MetricsRecorder metricsRecorder, @NotNull Continuation continuation) {
        b("[Thread: " + Thread.currentThread().getName() + "] Fetching bidToken(), acquiring lock");
        return com.moloco.sdk.internal.utils.a.a(this.g, new a(metricsRecorder, null), continuation);
    }

    public final void a(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.e, "[Thread: " + Thread.currentThread().getName() + "] " + str, false, 4, null);
    }
}
