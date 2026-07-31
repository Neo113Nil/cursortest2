package com.moloco.sdk.acm;

import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ironsource.X3;
import com.moloco.sdk.acm.db.MetricsDb;
import com.moloco.sdk.acm.eventprocessing.h;
import com.moloco.sdk.acm.eventprocessing.i;
import com.moloco.sdk.acm.eventprocessing.l;
import com.moloco.sdk.acm.eventprocessing.m;
import com.moloco.sdk.acm.services.ApplicationLifecycleObserver;
import com.moloco.sdk.acm.services.g;
import com.moloco.sdk.acm.services.j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001f\u0010\u0003R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R(\u0010(\u001a\u00020'8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b.\u0010\u0003\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010:\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010808078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00110<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/moloco/sdk/acm/AndroidClientMetrics;", "", "<init>", "()V", "Lcom/moloco/sdk/acm/UpdateConfig;", "newConfig", "", "updateConfigInternal", "(Lcom/moloco/sdk/acm/UpdateConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processQueuedEvents", "Lcom/moloco/sdk/acm/InitConfig;", "config", "Lcom/moloco/sdk/acm/AndroidClientMetricsCallback;", "callback", "initialize", "(Lcom/moloco/sdk/acm/InitConfig;Lcom/moloco/sdk/acm/AndroidClientMetricsCallback;)V", "updateConfig", "Lcom/moloco/sdk/acm/CountEvent;", "event", "recordCountEvent$moloco_android_client_metrics_release", "(Lcom/moloco/sdk/acm/CountEvent;)V", "recordCountEvent", "", X3.i.j0, "Lcom/moloco/sdk/acm/TimerEvent;", "startTimerEvent$moloco_android_client_metrics_release", "(Ljava/lang/String;)Lcom/moloco/sdk/acm/TimerEvent;", "startTimerEvent", "recordTimerEvent$moloco_android_client_metrics_release", "(Lcom/moloco/sdk/acm/TimerEvent;)V", "recordTimerEvent", "triggerBackgroundEvent$moloco_android_client_metrics_release", "triggerBackgroundEvent", "Lcom/moloco/sdk/acm/eventprocessing/h;", "eventProcessor", "Lcom/moloco/sdk/acm/eventprocessing/h;", "Lcom/moloco/sdk/acm/services/c;", "applicationLifecycleTracker", "Lcom/moloco/sdk/acm/services/c;", "Lcom/moloco/sdk/acm/a;", "opsConfig", "Lcom/moloco/sdk/acm/a;", "getOpsConfig$moloco_android_client_metrics_release", "()Lcom/moloco/sdk/acm/a;", "setOpsConfig$moloco_android_client_metrics_release", "(Lcom/moloco/sdk/acm/a;)V", "getOpsConfig$moloco_android_client_metrics_release$annotations", "pendingConfigUpdate", "Lcom/moloco/sdk/acm/UpdateConfig;", "Lkotlinx/coroutines/sync/Mutex;", "configMutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/CoroutineScope;", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/moloco/sdk/acm/f;", "kotlin.jvm.PlatformType", "_initializationStatus", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "preInitTimerList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "preInitCountList", "Lcom/moloco/sdk/acm/eventprocessing/l;", "requestScheduler", "Lcom/moloco/sdk/acm/eventprocessing/l;", "TAG", "Ljava/lang/String;", "getInitializationStatus$moloco_android_client_metrics_release", "()Lcom/moloco/sdk/acm/f;", "initializationStatus", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class AndroidClientMetrics {

    @NotNull
    private static final String TAG = "AndroidClientMetrics";
    private static com.moloco.sdk.acm.services.c applicationLifecycleTracker;
    private static h eventProcessor;
    public static com.moloco.sdk.acm.a opsConfig;

    @Nullable
    private static UpdateConfig pendingConfigUpdate;
    private static l requestScheduler;

    @NotNull
    public static final AndroidClientMetrics INSTANCE = new AndroidClientMetrics();

    @NotNull
    private static final Mutex configMutex = MutexKt.Mutex$default(false, 1, null);

    @NotNull
    private static final CoroutineScope ioScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));

    @NotNull
    private static final AtomicReference<f> _initializationStatus = new AtomicReference<>(f.c);

    @NotNull
    private static final CopyOnWriteArrayList<TimerEvent> preInitTimerList = new CopyOnWriteArrayList<>();

    @NotNull
    private static final CopyOnWriteArrayList<CountEvent> preInitCountList = new CopyOnWriteArrayList<>();

    @DebugMetadata(c = "com.moloco.sdk.acm.AndroidClientMetrics$initialize$1", f = "AndroidClientMetrics.kt", l = {261, 127}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public Object a;
        public int b;
        public final /* synthetic */ InitConfig c;
        public final /* synthetic */ AndroidClientMetricsCallback d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InitConfig initConfig, AndroidClientMetricsCallback androidClientMetricsCallback, Continuation continuation) {
            super(2, continuation);
            this.c = initConfig;
            this.d = androidClientMetricsCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.c, this.d, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0101 A[Catch: Exception -> 0x002f, IllegalStateException -> 0x0032, TryCatch #3 {IllegalStateException -> 0x0032, Exception -> 0x002f, blocks: (B:9:0x00f5, B:11:0x0101, B:36:0x0105, B:37:0x0108, B:19:0x002a, B:26:0x0038, B:28:0x00a1, B:29:0x00a7, B:31:0x00ad, B:32:0x00b3, B:7:0x0016, B:8:0x00f3, B:20:0x00d1, B:22:0x00d7), top: B:2:0x000b, inners: #2 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            Mutex mutex2;
            AndroidClientMetricsCallback androidClientMetricsCallback;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.b;
            try {
                try {
                } catch (Throwable th) {
                    r2.unlock(null);
                    throw th;
                }
            } catch (IllegalStateException e) {
                com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, MetricsDb.c, "Unable to create metrics db", e, false, 8, null);
                AndroidClientMetrics._initializationStatus.set(f.c);
                AndroidClientMetricsCallback androidClientMetricsCallback2 = this.d;
                if (androidClientMetricsCallback2 != null) {
                    androidClientMetricsCallback2.onInitializationFailure(e);
                }
            } catch (Exception e2) {
                com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, AndroidClientMetrics.TAG, "Initialization error", e2, false, 8, null);
                AndroidClientMetrics._initializationStatus.set(f.c);
                AndroidClientMetricsCallback androidClientMetricsCallback3 = this.d;
                if (androidClientMetricsCallback3 != null) {
                    androidClientMetricsCallback3.onInitializationFailure(e2);
                }
            }
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.acm.db.d b = MetricsDb.INSTANCE.b(this.c.getContext()).b();
                j jVar = new j();
                AndroidClientMetrics androidClientMetrics = AndroidClientMetrics.INSTANCE;
                com.moloco.sdk.acm.eventprocessing.d dVar = new com.moloco.sdk.acm.eventprocessing.d(androidClientMetrics.getOpsConfig$moloco_android_client_metrics_release(), this.c.getContext());
                AndroidClientMetrics.requestScheduler = new m(dVar, androidClientMetrics.getOpsConfig$moloco_android_client_metrics_release(), null, AndroidClientMetrics.ioScope, 4, null);
                AndroidClientMetrics.applicationLifecycleTracker = new com.moloco.sdk.acm.services.c(ProcessLifecycleOwner.INSTANCE.get().getLifecycleRegistry(), new ApplicationLifecycleObserver(dVar, AndroidClientMetrics.ioScope, new g(this.c.getContext())));
                l lVar = AndroidClientMetrics.requestScheduler;
                if (lVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("requestScheduler");
                    lVar = null;
                }
                com.moloco.sdk.acm.services.c cVar = AndroidClientMetrics.applicationLifecycleTracker;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicationLifecycleTracker");
                    cVar = null;
                }
                AndroidClientMetrics.eventProcessor = new i(b, jVar, lVar, cVar);
                AndroidClientMetrics._initializationStatus.set(f.a);
                Mutex mutex3 = AndroidClientMetrics.configMutex;
                this.a = mutex3;
                this.b = 1;
                Object lock = mutex3.lock(null, this);
                mutex = mutex3;
                if (lock == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex4 = (Mutex) this.a;
                    ResultKt.throwOnFailure(obj);
                    r2 = mutex4;
                    Unit unit = Unit.INSTANCE;
                    mutex2 = r2;
                    mutex2.unlock(null);
                    AndroidClientMetrics.INSTANCE.processQueuedEvents();
                    androidClientMetricsCallback = this.d;
                    if (androidClientMetricsCallback != null) {
                        androidClientMetricsCallback.onInitializationSuccess();
                    }
                    return Unit.INSTANCE;
                }
                Mutex mutex5 = (Mutex) this.a;
                ResultKt.throwOnFailure(obj);
                mutex = mutex5;
            }
            UpdateConfig updateConfig = AndroidClientMetrics.pendingConfigUpdate;
            mutex2 = mutex;
            if (updateConfig != null) {
                AndroidClientMetrics androidClientMetrics2 = AndroidClientMetrics.INSTANCE;
                AndroidClientMetrics.pendingConfigUpdate = null;
                com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, AndroidClientMetrics.TAG, "Updating config with pending config", false, 4, null);
                this.a = mutex;
                this.b = 2;
                r2 = mutex;
                if (androidClientMetrics2.updateConfigInternal(updateConfig, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Unit unit2 = Unit.INSTANCE;
                mutex2 = r2;
            }
            mutex2.unlock(null);
            AndroidClientMetrics.INSTANCE.processQueuedEvents();
            androidClientMetricsCallback = this.d;
            if (androidClientMetricsCallback != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.acm.AndroidClientMetrics$processQueuedEvents$1", f = "AndroidClientMetrics.kt", l = {237, 238}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public Object a;
        public int b;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Iterator it2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                it = AndroidClientMetrics.preInitTimerList.iterator();
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = (Iterator) this.a;
                    ResultKt.throwOnFailure(obj);
                    while (it2.hasNext()) {
                        CountEvent countEvent = (CountEvent) it2.next();
                        h hVar = AndroidClientMetrics.eventProcessor;
                        if (hVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventProcessor");
                            hVar = null;
                        }
                        Intrinsics.checkNotNull(countEvent);
                        this.a = it2;
                        this.b = 2;
                        if (hVar.a(countEvent, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    AndroidClientMetrics.preInitTimerList.clear();
                    AndroidClientMetrics.preInitCountList.clear();
                    return Unit.INSTANCE;
                }
                it = (Iterator) this.a;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                TimerEvent timerEvent = (TimerEvent) it.next();
                h hVar2 = AndroidClientMetrics.eventProcessor;
                if (hVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventProcessor");
                    hVar2 = null;
                }
                Intrinsics.checkNotNull(timerEvent);
                this.a = it;
                this.b = 1;
                if (hVar2.a(timerEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            it2 = AndroidClientMetrics.preInitCountList.iterator();
            while (it2.hasNext()) {
            }
            AndroidClientMetrics.preInitTimerList.clear();
            AndroidClientMetrics.preInitCountList.clear();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.acm.AndroidClientMetrics$recordCountEvent$1", f = "AndroidClientMetrics.kt", l = {193}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ CountEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CountEvent countEvent, Continuation continuation) {
            super(2, continuation);
            this.b = countEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                h hVar = AndroidClientMetrics.eventProcessor;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventProcessor");
                    hVar = null;
                }
                CountEvent countEvent = this.b;
                this.a = 1;
                if (hVar.a(countEvent, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.acm.AndroidClientMetrics$recordTimerEvent$1", f = "AndroidClientMetrics.kt", l = {228}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ TimerEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TimerEvent timerEvent, Continuation continuation) {
            super(2, continuation);
            this.b = timerEvent;
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
                h hVar = AndroidClientMetrics.eventProcessor;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventProcessor");
                    hVar = null;
                }
                TimerEvent timerEvent = this.b;
                this.a = 1;
                if (hVar.a(timerEvent, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.acm.AndroidClientMetrics", f = "AndroidClientMetrics.kt", l = {261, 167}, m = "updateConfig")
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AndroidClientMetrics.this.updateConfig(null, this);
        }
    }

    private AndroidClientMetrics() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOpsConfig$moloco_android_client_metrics_release$annotations() {
    }

    public static /* synthetic */ void initialize$default(AndroidClientMetrics androidClientMetrics, InitConfig initConfig, AndroidClientMetricsCallback androidClientMetricsCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            androidClientMetricsCallback = null;
        }
        androidClientMetrics.initialize(initConfig, androidClientMetricsCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processQueuedEvents() {
        BuildersKt__Builders_commonKt.launch$default(ioScope, null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateConfigInternal(UpdateConfig updateConfig, Continuation continuation) {
        String postAnalyticsUrl = updateConfig.getPostAnalyticsUrl();
        if (postAnalyticsUrl != null) {
            INSTANCE.getOpsConfig$moloco_android_client_metrics_release().a(postAnalyticsUrl);
        }
        Long requestPeriodSeconds = updateConfig.getRequestPeriodSeconds();
        if (requestPeriodSeconds != null) {
            INSTANCE.getOpsConfig$moloco_android_client_metrics_release().a(requestPeriodSeconds.longValue());
        }
        l lVar = requestScheduler;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestScheduler");
            lVar = null;
        }
        Object a2 = lVar.a(continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    @NotNull
    public final f getInitializationStatus$moloco_android_client_metrics_release() {
        f fVar = _initializationStatus.get();
        Intrinsics.checkNotNullExpressionValue(fVar, "get(...)");
        return fVar;
    }

    @NotNull
    public final com.moloco.sdk.acm.a getOpsConfig$moloco_android_client_metrics_release() {
        com.moloco.sdk.acm.a aVar = opsConfig;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("opsConfig");
        return null;
    }

    public final void initialize(@NotNull InitConfig config, @Nullable AndroidClientMetricsCallback callback) {
        Intrinsics.checkNotNullParameter(config, "config");
        com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.a, TAG, "ACM initialize", false, 4, null);
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(_initializationStatus, f.c, f.b)) {
            setOpsConfig$moloco_android_client_metrics_release(com.moloco.sdk.acm.e.a(config));
            BuildersKt__Builders_commonKt.launch$default(ioScope, null, null, new a(config, callback, null), 3, null);
        }
    }

    public final void recordCountEvent$moloco_android_client_metrics_release(@NotNull CountEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (_initializationStatus.get() == f.a) {
            BuildersKt__Builders_commonKt.launch$default(ioScope, null, null, new c(event, null), 3, null);
        } else {
            preInitCountList.add(event);
            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, TAG, "Moloco Client Metrics not initialized", false, 4, null);
        }
    }

    public final void recordTimerEvent$moloco_android_client_metrics_release(@NotNull TimerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.stopTimer();
        if (_initializationStatus.get() == f.a) {
            BuildersKt__Builders_commonKt.launch$default(ioScope, null, null, new d(event, null), 3, null);
        } else {
            preInitTimerList.add(event);
            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, TAG, "Moloco Client Metrics not initialized", false, 4, null);
        }
    }

    public final void setOpsConfig$moloco_android_client_metrics_release(@NotNull com.moloco.sdk.acm.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        opsConfig = aVar;
    }

    @NotNull
    public final TimerEvent startTimerEvent$moloco_android_client_metrics_release(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (_initializationStatus.get() != f.a) {
            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, TAG, "Moloco Client Metrics not initialized", false, 4, null);
        }
        TimerEvent create = TimerEvent.INSTANCE.create(eventName);
        create.startTimer();
        return create;
    }

    @VisibleForTesting
    public final void triggerBackgroundEvent$moloco_android_client_metrics_release() {
        com.moloco.sdk.acm.services.c cVar = applicationLifecycleTracker;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateConfig(@NotNull UpdateConfig updateConfig, @NotNull Continuation continuation) {
        e eVar;
        int i;
        Mutex mutex;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - Integer.MIN_VALUE;
                Object obj = eVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.e;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    Mutex mutex2 = (Mutex) eVar.b;
                    UpdateConfig updateConfig2 = (UpdateConfig) eVar.a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex2;
                    updateConfig = updateConfig2;
                    try {
                        pendingConfigUpdate = updateConfig;
                        return Unit.INSTANCE;
                    } finally {
                        mutex.unlock(null);
                    }
                }
                ResultKt.throwOnFailure(obj);
                if (_initializationStatus.get() == f.a) {
                    com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.a, TAG, "ACM update called. ACM initialized already, proceeding with update", false, 4, null);
                    eVar.e = 2;
                    if (updateConfigInternal(updateConfig, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.a, TAG, "ACM updateConfig called when the SDK was not initialized. Initialize the SDK first.", null, false, 12, null);
                mutex = configMutex;
                eVar.a = updateConfig;
                eVar.b = mutex;
                eVar.e = 1;
                if (mutex.lock(null, eVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pendingConfigUpdate = updateConfig;
                return Unit.INSTANCE;
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.e;
        if (i == 0) {
        }
    }
}
