package io.bidmachine;

import io.bidmachine.internal.C6007b;
import io.bidmachine.internal.InterfaceC6014i;
import io.bidmachine.models.AdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.util.SdkDispatchers;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.taskmanager.SuspendCancellableTask;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import io.bidmachine.utils.log.UtilsLoggerInstance;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 #2\u00020\u0001:\u0003$#%B]\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lio/bidmachine/AdResponseCacheParamsCollector;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "ioDispatcher", "", "Lio/bidmachine/TrackEventType;", "adResponseCacheEnabledEvents", "adaptiveResourcesCacheEnabledEvents", "Lio/bidmachine/internal/i;", "Lio/bidmachine/AdResponse;", "adResponseCacheParamsAdapter", "Lio/bidmachine/unified/UnifiedMediationParams;", "adaptiveResourcesCacheParamsAdapter", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/util/List;Ljava/util/List;Lio/bidmachine/internal/i;Lio/bidmachine/internal/i;)V", "trackEventType", "adResponse", "Lio/bidmachine/AdResponseCacheParamsCollector$Callback;", "callback", "", "collect", "(Lio/bidmachine/TrackEventType;Lio/bidmachine/AdResponse;Lio/bidmachine/AdResponseCacheParamsCollector$Callback;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/List;", "Lio/bidmachine/internal/i;", "Lio/bidmachine/util/taskmanager/TaskManager;", "taskManager$delegate", "Lkotlin/Lazy;", "getTaskManager", "()Lio/bidmachine/util/taskmanager/TaskManager;", "taskManager", "Lio/bidmachine/utils/log/UtilsLoggerInstance;", "logger", "Lio/bidmachine/utils/log/UtilsLoggerInstance;", "Companion", "Callback", "a", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class AdResponseCacheParamsCollector {

    @NotNull
    public static final List<TrackEventType> DEFAULT_ADAPTIVE_RESOURCES_CACHE_EVENTS;

    @NotNull
    public static final List<TrackEventType> DEFAULT_AD_RESPONSE_CACHE_EVENTS;

    @NotNull
    private static final String TAG = "AdResponseCacheParamsCollector";

    @NotNull
    private final List<TrackEventType> adResponseCacheEnabledEvents;

    @NotNull
    private final InterfaceC6014i adResponseCacheParamsAdapter;

    @NotNull
    private final List<TrackEventType> adaptiveResourcesCacheEnabledEvents;

    @NotNull
    private final InterfaceC6014i adaptiveResourcesCacheParamsAdapter;

    @NotNull
    private final CoroutineDispatcher ioDispatcher;

    @NotNull
    private final UtilsLoggerInstance logger;

    @NotNull
    private final CoroutineDispatcher mainDispatcher;

    /* renamed from: taskManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy taskManager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lio/bidmachine/AdResponseCacheParamsCollector$Callback;", "", "onCollected", "", "cacheParams", "", "", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Callback {
        void onCollected(@NotNull Map<String, ? extends Object> cacheParams);
    }

    private final class a extends SuspendCancellableTask {
        private final TrackEventType a;
        private final AdResponse b;
        private final Callback c;
        final /* synthetic */ AdResponseCacheParamsCollector d;

        /* renamed from: io.bidmachine.AdResponseCacheParamsCollector$a$a, reason: collision with other inner class name */
        static final class C1708a extends ContinuationImpl {
            Object a;
            Object b;
            Object c;
            Object d;
            Object e;
            /* synthetic */ Object f;
            int h;

            C1708a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f = obj;
                this.h |= Integer.MIN_VALUE;
                return a.this.runTask(null, this);
            }
        }

        static final class b extends Lambda implements Function0 {
            final /* synthetic */ Map b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Map map) {
                super(0);
                this.b = map;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo4828invoke() {
                return a.this.a.getActionValue() + ". Collected cache params: " + UtilsKt.toJsonObject(this.b);
            }
        }

        static final class c extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ Map c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Map map, Continuation continuation) {
                super(2, continuation);
                this.c = map;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return a.this.new c(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a.this.c.onCollected(this.c);
                return Unit.INSTANCE;
            }
        }

        public a(AdResponseCacheParamsCollector adResponseCacheParamsCollector, TrackEventType trackEventType, AdResponse adResponse, Callback callback) {
            Intrinsics.checkNotNullParameter(trackEventType, "trackEventType");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.d = adResponseCacheParamsCollector;
            this.a = trackEventType;
            this.b = adResponse;
            this.c = callback;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0123 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // io.bidmachine.util.taskmanager.SuspendCancellableTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object runTask(CoroutineContext coroutineContext, Continuation continuation) {
            C1708a c1708a;
            Object coroutine_suspended;
            int i;
            AdResponseCacheParamsCollector adResponseCacheParamsCollector;
            Map createMapBuilder;
            a aVar;
            Map map;
            Map map2;
            AdResponse adResponse;
            Map map3;
            a aVar2;
            Map map4;
            AdResponse adResponse2;
            Map map5;
            AdObject adObject;
            AdObjectParams params;
            UnifiedMediationParams mediationParams;
            CoroutineDispatcher coroutineDispatcher;
            c cVar;
            if (continuation instanceof C1708a) {
                c1708a = (C1708a) continuation;
                int i2 = c1708a.h;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1708a.h = i2 - Integer.MIN_VALUE;
                    Object obj = c1708a.f;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c1708a.h;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        adResponseCacheParamsCollector = this.d;
                        createMapBuilder = MapsKt.createMapBuilder();
                        if (!adResponseCacheParamsCollector.adResponseCacheEnabledEvents.contains(this.a)) {
                            aVar2 = this;
                            map2 = createMapBuilder;
                            if (adResponseCacheParamsCollector.adaptiveResourcesCacheEnabledEvents.contains(aVar2.a)) {
                            }
                            Map build = MapsKt.build(map2);
                            aVar2.d.logger.d(AdResponseCacheParamsCollector.TAG, aVar2.new b(build));
                            coroutineDispatcher = aVar2.d.mainDispatcher;
                            cVar = aVar2.new c(build, null);
                            c1708a.a = null;
                            c1708a.b = null;
                            c1708a.c = null;
                            c1708a.d = null;
                            c1708a.e = null;
                            c1708a.h = 3;
                            if (BuildersKt.withContext(coroutineDispatcher, cVar, c1708a) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        try {
                            adResponse = this.b;
                        } catch (Throwable unused) {
                            aVar = this;
                            map = createMapBuilder;
                            map2 = map;
                        }
                        if (adResponse == null) {
                            aVar = this;
                            map = createMapBuilder;
                            map2 = map;
                            map3 = null;
                            UtilsKt.putAllIfNotEmpty(createMapBuilder, map3);
                            Unit unit = Unit.INSTANCE;
                            createMapBuilder = map;
                            aVar2 = aVar;
                            if (adResponseCacheParamsCollector.adaptiveResourcesCacheEnabledEvents.contains(aVar2.a)) {
                                try {
                                    adResponse2 = aVar2.b;
                                } catch (Throwable unused2) {
                                    map4 = map2;
                                }
                                if (adResponse2 == null || (adObject = adResponse2.getAdObject()) == null || (params = adObject.getParams()) == null || (mediationParams = params.getMediationParams()) == null) {
                                    map5 = null;
                                    map4 = map2;
                                    UtilsKt.putAllIfNotEmpty(createMapBuilder, map5);
                                    Unit unit2 = Unit.INSTANCE;
                                    map2 = map4;
                                } else {
                                    InterfaceC6014i interfaceC6014i = adResponseCacheParamsCollector.adaptiveResourcesCacheParamsAdapter;
                                    c1708a.a = aVar2;
                                    c1708a.b = map2;
                                    c1708a.c = createMapBuilder;
                                    c1708a.d = null;
                                    c1708a.e = null;
                                    c1708a.h = 2;
                                    obj = interfaceC6014i.getCacheParams(mediationParams, c1708a);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    map4 = map2;
                                    map5 = (Map) obj;
                                    UtilsKt.putAllIfNotEmpty(createMapBuilder, map5);
                                    Unit unit22 = Unit.INSTANCE;
                                    map2 = map4;
                                }
                            }
                            Map build2 = MapsKt.build(map2);
                            aVar2.d.logger.d(AdResponseCacheParamsCollector.TAG, aVar2.new b(build2));
                            coroutineDispatcher = aVar2.d.mainDispatcher;
                            cVar = aVar2.new c(build2, null);
                            c1708a.a = null;
                            c1708a.b = null;
                            c1708a.c = null;
                            c1708a.d = null;
                            c1708a.e = null;
                            c1708a.h = 3;
                            if (BuildersKt.withContext(coroutineDispatcher, cVar, c1708a) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        InterfaceC6014i interfaceC6014i2 = adResponseCacheParamsCollector.adResponseCacheParamsAdapter;
                        c1708a.a = this;
                        c1708a.b = adResponseCacheParamsCollector;
                        c1708a.c = createMapBuilder;
                        c1708a.d = createMapBuilder;
                        c1708a.e = createMapBuilder;
                        c1708a.h = 1;
                        obj = interfaceC6014i2.getCacheParams(adResponse, c1708a);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                        map = createMapBuilder;
                        map2 = map;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            createMapBuilder = (Map) c1708a.c;
                            map4 = (Map) c1708a.b;
                            aVar2 = (a) c1708a.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                map5 = (Map) obj;
                                UtilsKt.putAllIfNotEmpty(createMapBuilder, map5);
                                Unit unit222 = Unit.INSTANCE;
                            } catch (Throwable unused3) {
                            }
                            map2 = map4;
                            Map build22 = MapsKt.build(map2);
                            aVar2.d.logger.d(AdResponseCacheParamsCollector.TAG, aVar2.new b(build22));
                            coroutineDispatcher = aVar2.d.mainDispatcher;
                            cVar = aVar2.new c(build22, null);
                            c1708a.a = null;
                            c1708a.b = null;
                            c1708a.c = null;
                            c1708a.d = null;
                            c1708a.e = null;
                            c1708a.h = 3;
                            if (BuildersKt.withContext(coroutineDispatcher, cVar, c1708a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        createMapBuilder = (Map) c1708a.e;
                        map = (Map) c1708a.d;
                        map2 = (Map) c1708a.c;
                        adResponseCacheParamsCollector = (AdResponseCacheParamsCollector) c1708a.b;
                        aVar = (a) c1708a.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable unused4) {
                        }
                    }
                    map3 = (Map) obj;
                    UtilsKt.putAllIfNotEmpty(createMapBuilder, map3);
                    Unit unit3 = Unit.INSTANCE;
                    createMapBuilder = map;
                    aVar2 = aVar;
                    if (adResponseCacheParamsCollector.adaptiveResourcesCacheEnabledEvents.contains(aVar2.a)) {
                    }
                    Map build222 = MapsKt.build(map2);
                    aVar2.d.logger.d(AdResponseCacheParamsCollector.TAG, aVar2.new b(build222));
                    coroutineDispatcher = aVar2.d.mainDispatcher;
                    cVar = aVar2.new c(build222, null);
                    c1708a.a = null;
                    c1708a.b = null;
                    c1708a.c = null;
                    c1708a.d = null;
                    c1708a.e = null;
                    c1708a.h = 3;
                    if (BuildersKt.withContext(coroutineDispatcher, cVar, c1708a) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
            c1708a = new C1708a(continuation);
            Object obj2 = c1708a.f;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c1708a.h;
            if (i != 0) {
            }
            map3 = (Map) obj2;
            UtilsKt.putAllIfNotEmpty(createMapBuilder, map3);
            Unit unit32 = Unit.INSTANCE;
            createMapBuilder = map;
            aVar2 = aVar;
            if (adResponseCacheParamsCollector.adaptiveResourcesCacheEnabledEvents.contains(aVar2.a)) {
            }
            Map build2222 = MapsKt.build(map2);
            aVar2.d.logger.d(AdResponseCacheParamsCollector.TAG, aVar2.new b(build2222));
            coroutineDispatcher = aVar2.d.mainDispatcher;
            cVar = aVar2.new c(build2222, null);
            c1708a.a = null;
            c1708a.b = null;
            c1708a.c = null;
            c1708a.d = null;
            c1708a.e = null;
            c1708a.h = 3;
            if (BuildersKt.withContext(coroutineDispatcher, cVar, c1708a) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineTaskManager mo4828invoke() {
            return new CoroutineTaskManager(AdResponseCacheParamsCollector.this.ioDispatcher);
        }
    }

    static {
        TrackEventType trackEventType = TrackEventType.AuctionRequest;
        TrackEventType trackEventType2 = TrackEventType.AuctionRequestExpired;
        TrackEventType trackEventType3 = TrackEventType.Click;
        TrackEventType trackEventType4 = TrackEventType.Close;
        TrackEventType trackEventType5 = TrackEventType.Destroy;
        TrackEventType trackEventType6 = TrackEventType.Expired;
        TrackEventType trackEventType7 = TrackEventType.FillAd;
        TrackEventType trackEventType8 = TrackEventType.Show;
        DEFAULT_AD_RESPONSE_CACHE_EVENTS = CollectionsKt.listOf((Object[]) new TrackEventType[]{trackEventType, trackEventType2, trackEventType3, trackEventType4, trackEventType5, trackEventType6, trackEventType7, TrackEventType.ImpressionOpportunity, trackEventType8});
        DEFAULT_ADAPTIVE_RESOURCES_CACHE_EVENTS = CollectionsKt.listOf((Object[]) new TrackEventType[]{trackEventType, trackEventType2, TrackEventType.BrokenCreativeDetector, trackEventType3, trackEventType4, trackEventType5, trackEventType6, trackEventType7, TrackEventType.Load, trackEventType8});
    }

    public AdResponseCacheParamsCollector() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final TaskManager getTaskManager() {
        return (TaskManager) this.taskManager.getValue();
    }

    public final void collect(@NotNull TrackEventType trackEventType, @Nullable AdResponse adResponse, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(trackEventType, "trackEventType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        getTaskManager().execute(new a(this, trackEventType, adResponse, callback));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher) {
        this(mainDispatcher, null, null, null, null, null, 62, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher) {
        this(mainDispatcher, ioDispatcher, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher, @NotNull List<? extends TrackEventType> adResponseCacheEnabledEvents) {
        this(mainDispatcher, ioDispatcher, adResponseCacheEnabledEvents, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher, @NotNull List<? extends TrackEventType> adResponseCacheEnabledEvents, @NotNull List<? extends TrackEventType> adaptiveResourcesCacheEnabledEvents) {
        this(mainDispatcher, ioDispatcher, adResponseCacheEnabledEvents, adaptiveResourcesCacheEnabledEvents, null, null, 48, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adaptiveResourcesCacheEnabledEvents, "adaptiveResourcesCacheEnabledEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher, @NotNull List<? extends TrackEventType> adResponseCacheEnabledEvents, @NotNull List<? extends TrackEventType> adaptiveResourcesCacheEnabledEvents, @NotNull InterfaceC6014i adResponseCacheParamsAdapter) {
        this(mainDispatcher, ioDispatcher, adResponseCacheEnabledEvents, adaptiveResourcesCacheEnabledEvents, adResponseCacheParamsAdapter, null, 32, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adaptiveResourcesCacheEnabledEvents, "adaptiveResourcesCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adResponseCacheParamsAdapter, "adResponseCacheParamsAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher, @NotNull List<? extends TrackEventType> adResponseCacheEnabledEvents, @NotNull List<? extends TrackEventType> adaptiveResourcesCacheEnabledEvents, @NotNull InterfaceC6014i adResponseCacheParamsAdapter, @NotNull InterfaceC6014i adaptiveResourcesCacheParamsAdapter) {
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adaptiveResourcesCacheEnabledEvents, "adaptiveResourcesCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adResponseCacheParamsAdapter, "adResponseCacheParamsAdapter");
        Intrinsics.checkNotNullParameter(adaptiveResourcesCacheParamsAdapter, "adaptiveResourcesCacheParamsAdapter");
        this.mainDispatcher = mainDispatcher;
        this.ioDispatcher = ioDispatcher;
        this.adResponseCacheEnabledEvents = adResponseCacheEnabledEvents;
        this.adaptiveResourcesCacheEnabledEvents = adaptiveResourcesCacheEnabledEvents;
        this.adResponseCacheParamsAdapter = adResponseCacheParamsAdapter;
        this.adaptiveResourcesCacheParamsAdapter = adaptiveResourcesCacheParamsAdapter;
        this.taskManager = LazyKt.lazy(new b());
        this.logger = new UtilsLoggerInstance();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AdResponseCacheParamsCollector(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, List list, List list2, InterfaceC6014i interfaceC6014i, InterfaceC6014i interfaceC6014i2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineDispatcher, r12, r0, r1, interfaceC6014i, (i & 32) != 0 ? new C6007b(null, Rendering.getMediaFileCacheManagerProvider(), 1, 0 == true ? 1 : 0) : interfaceC6014i2);
        coroutineDispatcher = (i & 1) != 0 ? SdkDispatchers.INSTANCE.getDefault().getMain() : coroutineDispatcher;
        CoroutineDispatcher io2 = (i & 2) != 0 ? SdkDispatchers.INSTANCE.getDefault().getIo() : coroutineDispatcher2;
        List list3 = (i & 4) != 0 ? DEFAULT_AD_RESPONSE_CACHE_EVENTS : list;
        List list4 = (i & 8) != 0 ? DEFAULT_ADAPTIVE_RESOURCES_CACHE_EVENTS : list2;
        if ((i & 16) != 0) {
            C5999c a2 = C5999c.a();
            Intrinsics.checkNotNullExpressionValue(a2, "get()");
            interfaceC6014i = new AdResponseCacheParamsAdapter(a2);
        }
    }
}
