package io.bidmachine.analytics.internal.r;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.I.f;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.analytics.internal.h.AbstractC5909d;
import io.bidmachine.analytics.internal.h.InterfaceC5908c;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes14.dex */
public abstract class a extends AbstractC5909d {
    private final Lazy d = LazyKt.lazy(d.a);
    private Job e;
    private C1756a f;

    /* renamed from: io.bidmachine.analytics.internal.r.a$a, reason: collision with other inner class name */
    public static final class C1756a {
        private final long a;
        private final List b;
        private final InterfaceC5908c c;

        public C1756a(long j, List list, InterfaceC5908c interfaceC5908c) {
            this.a = j;
            this.b = list;
            this.c = interfaceC5908c;
        }

        public final InterfaceC5908c a() {
            return this.c;
        }

        public final long b() {
            return this.a;
        }

        public final List c() {
            return this.b;
        }
    }

    static final class b extends SuspendLambda implements Function2 {
        Object a;
        Object b;
        Object c;
        int d;
        private /* synthetic */ Object e;
        final /* synthetic */ C1756a f;
        final /* synthetic */ a g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1756a c1756a, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f = c1756a;
            this.g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f, this.g, continuation);
            bVar.e = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        
            r12 = r7;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b8 -> B:6:0x0041). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            a aVar;
            Collection collection;
            Iterator it;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.e;
            } else if (i == 1) {
                it = (Iterator) this.c;
                collection = (Collection) this.b;
                aVar = (a) this.a;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.e;
                ResultKt.throwOnFailure(obj);
                Object obj2 = ((Result) obj).getValue();
                if (Result.m8028isFailureimpl(obj2)) {
                    obj2 = null;
                }
                InterfaceC5908c.a aVar2 = (InterfaceC5908c.a) obj2;
                if (aVar2 != null) {
                    collection.add(aVar2);
                }
                coroutineScope2 = coroutineScope3;
                if (it.hasNext()) {
                    ReaderConfig.Rule rule = (ReaderConfig.Rule) it.next();
                    this.e = coroutineScope2;
                    this.a = aVar;
                    this.b = collection;
                    this.c = it;
                    this.d = 1;
                    Object b = aVar.b(rule, this);
                    if (b == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope3 = coroutineScope2;
                    obj2 = b;
                    if (Result.m8028isFailureimpl(obj2)) {
                    }
                    InterfaceC5908c.a aVar22 = (InterfaceC5908c.a) obj2;
                    if (aVar22 != null) {
                    }
                    coroutineScope2 = coroutineScope3;
                    if (it.hasNext()) {
                        List list = (List) collection;
                        if (this.g.c()) {
                            this.f.a().a(list);
                        }
                        long b2 = this.f.b();
                        this.e = coroutineScope2;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = 2;
                        if (DelayKt.delay(b2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope2;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.e;
                ResultKt.throwOnFailure(obj);
            }
            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                return Unit.INSTANCE;
            }
            List c = this.f.c();
            a aVar3 = this.g;
            ArrayList arrayList = new ArrayList();
            CoroutineScope coroutineScope4 = coroutineScope;
            it = c.iterator();
            coroutineScope2 = coroutineScope4;
            aVar = aVar3;
            collection = arrayList;
            if (it.hasNext()) {
            }
        }
    }

    static final class c extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object b = a.this.b(null, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8022boximpl(b);
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo4828invoke() {
            return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(f.g.a().c()));
        }
    }

    public abstract Object a(ReaderConfig.Rule rule, Continuation continuation);

    public boolean c() {
        return true;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void e(Context context) {
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void f(Context context) {
        Job launch$default;
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        C1756a c1756a = this.f;
        if (c1756a == null) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(b(), null, null, new b(c1756a, this, null), 3, null);
        this.e = launch$default;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(C1756a c1756a) {
        this.f = c1756a;
    }

    public final CoroutineScope b() {
        return (CoroutineScope) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ReaderConfig.Rule rule, Continuation continuation) {
        c cVar;
        int i;
        a aVar;
        Object m8023constructorimpl;
        String str;
        h.a aVar2;
        String str2;
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
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        cVar.a = this;
                        cVar.b = rule;
                        cVar.e = 1;
                        obj = a(rule, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } catch (Throwable th) {
                        th = th;
                        aVar = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        ReaderConfig.Rule rule2 = rule;
                        str = (String) (!Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
                        if (str == null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rule = (ReaderConfig.Rule) cVar.b;
                    aVar = (a) cVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        ReaderConfig.Rule rule22 = rule;
                        str = (String) (!Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
                        if (str == null) {
                        }
                    }
                }
                m8023constructorimpl = Result.m8023constructorimpl((String) obj);
                ReaderConfig.Rule rule222 = rule;
                str = (String) (!Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
                if (str == null) {
                    return Result.m8023constructorimpl(new InterfaceC5908c.a(rule222, str, null, 4, null));
                }
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (!(m8026exceptionOrNullimpl instanceof CancellationException)) {
                    if (m8026exceptionOrNullimpl instanceof FileNotFoundException) {
                        aVar2 = h.a.READER_NO_CONTENT;
                    } else if (m8026exceptionOrNullimpl instanceof SecurityException) {
                        aVar2 = h.a.READER_NO_ACCESS;
                    } else {
                        aVar2 = m8026exceptionOrNullimpl instanceof IllegalStateException ? h.a.READER_BAD_CONTENT : h.a.READER_INVALID;
                    }
                    if (m8026exceptionOrNullimpl == null || (str2 = g.a(m8026exceptionOrNullimpl)) == null) {
                        str2 = "";
                    }
                    return Result.m8023constructorimpl(new InterfaceC5908c.a(rule222, null, new h(aVar.a(), aVar2, str2), 2, null));
                }
                throw m8026exceptionOrNullimpl;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.e;
        if (i != 0) {
        }
        m8023constructorimpl = Result.m8023constructorimpl((String) obj2);
        ReaderConfig.Rule rule2222 = rule;
        str = (String) (!Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
        if (str == null) {
        }
    }
}
