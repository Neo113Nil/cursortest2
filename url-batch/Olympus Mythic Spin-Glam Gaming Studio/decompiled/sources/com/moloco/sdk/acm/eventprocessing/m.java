package com.moloco.sdk.acm.eventprocessing;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m implements l {

    @NotNull
    public final com.moloco.sdk.acm.eventprocessing.c a;

    @NotNull
    public final com.moloco.sdk.acm.a b;

    @NotNull
    public final ScheduledExecutorService c;

    @NotNull
    public final CoroutineScope d;

    @Nullable
    public ScheduledFuture<?> e;

    @NotNull
    public final Mutex f;

    @DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.RequestSchedulerTimer", f = "RequestSchedulerTimer.kt", l = {68}, m = "resetScheduleAndTriggerNewScheduledUpload")
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return m.this.a(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.RequestSchedulerTimer$schedule$1$1", f = "RequestSchedulerTimer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;

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
            return m.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            m.this.a.a();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.RequestSchedulerTimer", f = "RequestSchedulerTimer.kt", l = {68}, m = "scheduleUploadAndPurge")
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return m.this.b(this);
        }
    }

    public m(@NotNull com.moloco.sdk.acm.eventprocessing.c dbWorkRequest, @NotNull com.moloco.sdk.acm.a opsConfig, @NotNull ScheduledExecutorService scheduler, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(dbWorkRequest, "dbWorkRequest");
        Intrinsics.checkNotNullParameter(opsConfig, "opsConfig");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = dbWorkRequest;
        this.b = opsConfig;
        this.c = scheduler;
        this.d = coroutineScope;
        this.f = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.acm.eventprocessing.l
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(@NotNull Continuation continuation) {
        c cVar;
        int i;
        m mVar;
        Mutex mutex;
        try {
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i2 = cVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.e = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cVar.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.f;
                        cVar.a = this;
                        cVar.b = mutex2;
                        cVar.e = 1;
                        if (mutex2.lock(null, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mVar = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) cVar.b;
                        mVar = (m) cVar.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    mVar.a();
                    return Unit.INSTANCE;
                }
            }
            mVar.a();
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        cVar = new c(continuation);
        Object obj2 = cVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.e;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:11:0x004e, B:13:0x0052, B:14:0x005d), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.acm.eventprocessing.l
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull Continuation continuation) {
        a aVar;
        int i;
        m mVar;
        Mutex mutex;
        ScheduledFuture<?> scheduledFuture;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.e = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.f;
                        aVar.a = this;
                        aVar.b = mutex2;
                        aVar.e = 1;
                        if (mutex2.lock(null, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mVar = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) aVar.b;
                        mVar = (m) aVar.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    scheduledFuture = mVar.e;
                    if (scheduledFuture != null) {
                        Boxing.boxBoolean(scheduledFuture.cancel(false));
                    }
                    mVar.a();
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit;
                }
            }
            scheduledFuture = mVar.e;
            if (scheduledFuture != null) {
            }
            mVar.a();
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit2;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.e;
        if (i != 0) {
        }
    }

    public /* synthetic */ m(com.moloco.sdk.acm.eventprocessing.c cVar, com.moloco.sdk.acm.a aVar, ScheduledExecutorService scheduledExecutorService, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar, (i & 4) != 0 ? Executors.newSingleThreadScheduledExecutor() : scheduledExecutorService, coroutineScope);
    }

    public static final void b(m mVar) {
        BuildersKt__Builders_commonKt.launch$default(mVar.d, null, null, mVar.new b(null), 3, null);
    }

    public final void a() {
        ScheduledFuture<?> scheduledFuture = this.e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.e = this.c.scheduleWithFixedDelay(new Runnable() { // from class: com.moloco.sdk.acm.eventprocessing.m$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    m.b(m.this);
                }
            }, this.b.h(), this.b.h(), TimeUnit.SECONDS);
        }
    }
}
