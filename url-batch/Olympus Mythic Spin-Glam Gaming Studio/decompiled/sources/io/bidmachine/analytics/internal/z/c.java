package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.Struct;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.C.a;
import io.bidmachine.analytics.internal.I.f;
import io.bidmachine.analytics.internal.g.C5903e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes10.dex */
public final class c {
    private final a a;
    private final io.bidmachine.analytics.internal.H.e b;
    private final String c;
    private final CoroutineScope d;

    public static final class a {
        private final ReaderConfig a;
        private final String b;
        private final Struct c;
        private final a.InterfaceC1722a d;

        public a(ReaderConfig readerConfig, String str, Struct struct, a.InterfaceC1722a interfaceC1722a) {
            this.a = readerConfig;
            this.b = str;
            this.c = struct;
            this.d = interfaceC1722a;
        }

        public final a.InterfaceC1722a a() {
            return this.d;
        }

        public final Struct b() {
            return this.c;
        }

        public final ReaderConfig c() {
            return this.a;
        }
    }

    static final class b extends ContinuationImpl {
        Object a;
        /* synthetic */ Object b;
        int d;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a = c.this.a((String) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.z.c$c, reason: collision with other inner class name */
    static final class C1772c extends ContinuationImpl {
        Object a;
        /* synthetic */ Object b;
        int d;

        C1772c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return c.this.a((List) null, this);
        }
    }

    static final class d extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, Continuation continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                io.bidmachine.analytics.internal.C.a aVar = new io.bidmachine.analytics.internal.C.a(c.this.a.c().getUrl(), c.this.a.c().getName(), c.this.a.b(), this.c, c.this.a.a(), null, 32, null);
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
            c cVar = c.this;
            List list = this.c;
            if (Result.m8029isSuccessimpl(a)) {
                io.bidmachine.analytics.internal.H.e eVar = cVar.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((C5903e) obj2).b() != null) {
                        arrayList.add(obj2);
                    }
                }
                eVar.b(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((C5903e) obj3).b() == null) {
                        arrayList2.add(obj3);
                    }
                }
                cVar.b.c(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    cVar.a((C5903e) it.next());
                }
            }
            c cVar2 = c.this;
            List list2 = this.c;
            if (Result.m8026exceptionOrNullimpl(a) != null) {
                cVar2.b.c(list2);
            }
            return Result.m8022boximpl(a);
        }
    }

    static final class e extends SuspendLambda implements Function2 {
        Object a;
        int b;
        final /* synthetic */ String d;
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, List list, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new e(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                arrayList = new ArrayList();
                c cVar = c.this;
                String str = this.d;
                List list = this.e;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((C5903e) obj2).b() != null) {
                        arrayList2.add(obj2);
                    }
                }
                cVar.a(str, arrayList2);
                List<C5903e> list2 = this.e;
                c cVar2 = c.this;
                for (C5903e c5903e : list2) {
                    if (Result.m8028isFailureimpl(cVar2.a(c5903e))) {
                        arrayList.add(c5903e);
                    }
                }
                c cVar3 = c.this;
                String str2 = this.d;
                this.a = arrayList;
                this.b = 1;
                if (cVar3.a(str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                arrayList = (List) this.a;
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            if (!arrayList.isEmpty()) {
                c cVar4 = c.this;
                this.a = null;
                this.b = 2;
                if (cVar4.a(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public c(f fVar, a aVar, io.bidmachine.analytics.internal.H.e eVar) {
        this.a = aVar;
        this.b = eVar;
        this.c = aVar.c().getName();
        this.d = CoroutineScopeKt.CoroutineScope(new CoroutineName("AnalyticsMonitor: " + aVar.c().getName()).plus(SupervisorKt.SupervisorJob$default(null, 1, null)).plus(fVar.c()));
    }

    public final void b(String str, List list) {
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new e(str, list, null), 3, null);
    }

    public final String a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String str, List list) {
        try {
            Result.Companion companion = Result.INSTANCE;
            io.bidmachine.analytics.internal.H.e eVar = this.b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5903e) it.next()).e());
            }
            return Result.m8023constructorimpl(Result.m8022boximpl(eVar.a(str, arrayList)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        b bVar;
        int i;
        Object a2;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i2 = bVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.d = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        a2 = this.b.a(str);
                        if (Result.m8029isSuccessimpl(a2)) {
                            List list = (List) a2;
                            if (!list.isEmpty()) {
                                bVar.a = a2;
                                bVar.d = 1;
                                if (a(list, bVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a2 = bVar.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m8023constructorimpl(Result.m8022boximpl(a2));
                }
            }
            if (i != 0) {
            }
            return Result.m8023constructorimpl(Result.m8022boximpl(a2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(C5903e c5903e) {
        boolean z;
        C5903e a2;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (c5903e.b() != null) {
                return this.b.a(c5903e);
            }
            Object a3 = this.b.a(c5903e.d(), c5903e.e());
            if (Result.m8028isFailureimpl(a3)) {
                a3 = null;
            }
            C5903e c5903e2 = (C5903e) a3;
            if (c5903e2 == null) {
                return this.b.a(c5903e);
            }
            if (this.a.c().getUniqueOnly() && Intrinsics.areEqual(c5903e.a(), c5903e2.a())) {
                z = false;
                a2 = c5903e.a((r18 & 1) != 0 ? c5903e.a : c5903e2.c(), (r18 & 2) != 0 ? c5903e.b : null, (r18 & 4) != 0 ? c5903e.c : 0L, (r18 & 8) != 0 ? c5903e.d : null, (r18 & 16) != 0 ? c5903e.e : null, (r18 & 32) != 0 ? c5903e.f : null, (r18 & 64) != 0 ? c5903e.g : z);
                return this.b.b(a2);
            }
            z = true;
            a2 = c5903e.a((r18 & 1) != 0 ? c5903e.a : c5903e2.c(), (r18 & 2) != 0 ? c5903e.b : null, (r18 & 4) != 0 ? c5903e.c : 0L, (r18 & 8) != 0 ? c5903e.d : null, (r18 & 16) != 0 ? c5903e.e : null, (r18 & 32) != 0 ? c5903e.f : null, (r18 & 64) != 0 ? c5903e.g : z);
            return this.b.b(a2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, Continuation continuation) {
        C1772c c1772c;
        int i;
        Deferred async$default;
        if (continuation instanceof C1772c) {
            c1772c = (C1772c) continuation;
            int i2 = c1772c.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1772c.d = i2 - Integer.MIN_VALUE;
                Object obj = c1772c.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1772c.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object a2 = this.b.a(list);
                    if (Result.m8029isSuccessimpl(a2)) {
                        async$default = BuildersKt__Builders_commonKt.async$default(this.d, null, null, new d(list, null), 3, null);
                        c1772c.a = a2;
                        c1772c.d = 1;
                        if (async$default.await(c1772c) == coroutine_suspended) {
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
        c1772c = new C1772c(continuation);
        Object obj2 = c1772c.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1772c.d;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
