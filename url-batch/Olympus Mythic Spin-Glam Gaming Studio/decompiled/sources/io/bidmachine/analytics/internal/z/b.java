package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.Struct;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.internal.g.C5902d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes10.dex */
public final class b {
    public static final a g = new a(null);
    private final C1771b a;
    private final io.bidmachine.analytics.internal.H.c b;
    private final String c;
    private final CoroutineScope d;
    private Job e;
    private final AtomicBoolean f = new AtomicBoolean(false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.z.b$b, reason: collision with other inner class name */
    public static final class C1771b {
        private final MonitorConfig a;
        private final String b;
        private final Struct c;

        public C1771b(MonitorConfig monitorConfig, String str, Struct struct) {
            this.a = monitorConfig;
            this.b = str;
            this.c = struct;
        }

        public final Struct a() {
            return this.c;
        }

        public final MonitorConfig b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }
    }

    static final class c extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, Continuation continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = b.this;
                List list = this.c;
                this.a = 1;
                if (bVar.a(list, this) == coroutine_suspended) {
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

    static final class d extends SuspendLambda implements Function2 {
        int a;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long interval = b.this.a.b().getInterval();
                this.a = 1;
                if (DelayKt.delay(interval, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ((Result) obj).getValue();
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            b bVar = b.this;
            this.a = 2;
            if (bVar.a(0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    static final class e extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return b.this.a((List) null, this);
        }
    }

    static final class f extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, Continuation continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                io.bidmachine.analytics.internal.B.a aVar = new io.bidmachine.analytics.internal.B.a(b.this.a.b().getUrl(), b.this.a.b().getName(), b.this.a.a(), this.c, null, 16, null);
                this.a = 1;
                a = aVar.a(this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a = ((Result) obj).getValue();
            }
            b bVar = b.this;
            List list = this.c;
            if (Result.m8029isSuccessimpl(a)) {
                bVar.b.b(list);
            }
            b bVar2 = b.this;
            List list2 = this.c;
            if (Result.m8026exceptionOrNullimpl(a) != null) {
                bVar2.b.c(list2);
            }
            return Result.m8022boximpl(a);
        }
    }

    static final class g extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object a = b.this.a(0, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    static final class h extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ C5902d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C5902d c5902d, Continuation continuation) {
            super(2, continuation);
            this.c = c5902d;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new h(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (Result.m8029isSuccessimpl(b.this.a(this.c))) {
                    b bVar = b.this;
                    int batchSize = bVar.a.b().getBatchSize();
                    this.a = 1;
                    if (bVar.a(batchSize, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    b bVar2 = b.this;
                    List listOf = CollectionsKt.listOf(this.c);
                    this.a = 2;
                    if (bVar2.a(listOf, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public b(io.bidmachine.analytics.internal.I.f fVar, C1771b c1771b, io.bidmachine.analytics.internal.H.c cVar) {
        this.a = c1771b;
        this.b = cVar;
        this.c = c1771b.b().getName();
        this.d = CoroutineScopeKt.CoroutineScope(new CoroutineName("AnalyticsMonitor: " + c1771b.b().getName()).plus(SupervisorKt.SupervisorJob$default(null, 1, null)).plus(fVar.c()));
    }

    public final String b() {
        return this.c;
    }

    public final void b(C5902d c5902d) {
        if (this.f.get()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new h(c5902d, null), 3, null);
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            Object a2 = this.b.a(this.a.b().getName(), this.a.c());
            if (Result.m8029isSuccessimpl(a2)) {
                BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new c((List) a2, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(C5902d c5902d) {
        try {
            Result.Companion companion = Result.INSTANCE;
            return this.b.a(c5902d);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0087, B:14:0x008d, B:15:0x0090, B:22:0x003e, B:24:0x0066, B:26:0x006f, B:28:0x0075, B:31:0x0082), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, Continuation continuation) {
        g gVar;
        int i2;
        b bVar;
        Object obj;
        try {
            if (continuation instanceof g) {
                gVar = (g) continuation;
                int i3 = gVar.e;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.e = i3 - Integer.MIN_VALUE;
                    Object obj2 = gVar.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = gVar.e;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Result.Companion companion = Result.INSTANCE;
                        Object a2 = this.b.a(this.a.b().getName(), this.a.c(), this.a.b().getBatchSize());
                        if (Result.m8029isSuccessimpl(a2)) {
                            List list = (List) a2;
                            if (!list.isEmpty() && list.size() >= i) {
                                gVar.a = this;
                                gVar.b = a2;
                                gVar.e = 1;
                                if (a(list, gVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                a(this, false, 1, null);
                            }
                        }
                        bVar = this;
                        obj = a2;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = gVar.b;
                        bVar = (b) gVar.a;
                        ResultKt.throwOnFailure(obj2);
                    }
                    if (Result.m8026exceptionOrNullimpl(obj) != null) {
                        a(bVar, false, 1, null);
                    }
                    return Result.m8023constructorimpl(Result.m8022boximpl(obj));
                }
            }
            if (i2 != 0) {
            }
            if (Result.m8026exceptionOrNullimpl(obj) != null) {
            }
            return Result.m8023constructorimpl(Result.m8022boximpl(obj));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        gVar = new g(continuation);
        Object obj22 = gVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = gVar.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, Continuation continuation) {
        e eVar;
        int i;
        Object a2;
        b bVar;
        Object obj;
        Deferred async$default;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - Integer.MIN_VALUE;
                Object obj2 = eVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    a2 = this.b.a(list);
                    if (Result.m8029isSuccessimpl(a2)) {
                        List chunked = CollectionsKt.chunked(list, this.a.b().getBatchSize());
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(chunked, 10));
                        Iterator it = chunked.iterator();
                        while (it.hasNext()) {
                            async$default = BuildersKt__Builders_commonKt.async$default(this.d, null, null, new f((List) it.next(), null), 3, null);
                            arrayList.add(async$default);
                        }
                        eVar.a = this;
                        eVar.b = a2;
                        eVar.e = 1;
                        if (AwaitKt.awaitAll(arrayList, eVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bVar = this;
                        obj = a2;
                    } else {
                        bVar = this;
                        if (Result.m8026exceptionOrNullimpl(a2) != null) {
                            bVar.a(true);
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = eVar.b;
                    bVar = (b) eVar.a;
                    ResultKt.throwOnFailure(obj2);
                }
                bVar.a(true);
                a2 = obj;
                if (Result.m8026exceptionOrNullimpl(a2) != null) {
                }
                return Unit.INSTANCE;
            }
        }
        eVar = new e(continuation);
        Object obj22 = eVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.e;
        if (i != 0) {
        }
        bVar.a(true);
        a2 = obj;
        if (Result.m8026exceptionOrNullimpl(a2) != null) {
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void a(b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.a(z);
    }

    private final void a(boolean z) {
        Job launch$default;
        Job job;
        if (this.f.get()) {
            return;
        }
        if (z || (job = this.e) == null || !job.isActive()) {
            Job job2 = this.e;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new d(null), 3, null);
            this.e = launch$default;
        }
    }
}
