package io.bidmachine.analytics.internal.n;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.k4$$ExternalSyntheticBackport0;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.g.EnumC5899a;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.analytics.internal.i.AbstractC5912a;
import io.bidmachine.analytics.internal.m.a;
import io.bidmachine.analytics.internal.p.a;
import io.bidmachine.util.UtilsKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes11.dex */
public final class a extends io.bidmachine.analytics.internal.m.a {
    public static final i q = new i(null);
    private static final Lazy r = LazyKt.lazy(d.a);
    private static final Lazy s = LazyKt.lazy(c.a);
    private static final Lazy t = LazyKt.lazy(b.a);
    private static final Lazy u = LazyKt.lazy(C1740a.a);
    private static final Lazy v = LazyKt.lazy(h.a);
    private static final Lazy w = LazyKt.lazy(f.a);
    private static final Lazy x = LazyKt.lazy(g.a);
    private static final Lazy y = LazyKt.lazy(e.a);
    private final C5890a k;
    private final j l;
    private final String m;
    private final Lazy n;
    private List o;
    private volatile Bundle p;

    /* renamed from: io.bidmachine.analytics.internal.n.a$a, reason: collision with other inner class name */
    static final class C1740a extends Lambda implements Function0 {
        public static final C1740a a = new C1740a();

        C1740a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("YW5kcm9pZC5vcy5CdW5kbGU=");
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("Y29tLnNhZmVkay5hbmRyb2lkLnV0aWxzLlBlcnNpc3RlbnRDb25jdXJyZW50SGFzaE1hcA==");
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("Y29tLnNhZmVkay5hbmRyb2lkLmFuYWx5dGljcy5TdGF0c0NvbGxlY3Rvcg==");
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j mo4828invoke() {
            i iVar = a.q;
            return new j(iVar.c(), iVar.b());
        }
    }

    static final class e extends Lambda implements Function0 {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("YWRfZm9ybWF0X3R5cGU=");
        }
    }

    static final class f extends Lambda implements Function0 {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("Y2xpY2tfdXJs");
        }
    }

    static final class g extends Lambda implements Function0 {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("ZXZlbnRfaWQ=");
        }
    }

    static final class h extends Lambda implements Function0 {
        public static final h a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("aXNfY2xpY2tlZA==");
        }
    }

    public static final class i {
        public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return (String) a.u.getValue();
        }

        public final String b() {
            return (String) a.t.getValue();
        }

        public final String c() {
            return (String) a.s.getValue();
        }

        public final j d() {
            return (j) a.r.getValue();
        }

        public final String e() {
            return (String) a.y.getValue();
        }

        public final String f() {
            return (String) a.w.getValue();
        }

        public final String g() {
            return (String) a.x.getValue();
        }

        public final String h() {
            return (String) a.v.getValue();
        }

        private i() {
        }
    }

    public static final class j {
        private final String a;
        private final String b;

        public j(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }
    }

    static final class k extends SuspendLambda implements Function2 {
        int a;

        k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long duration;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                Object m = a.this.m();
                if (Result.m8029isSuccessimpl(m)) {
                    Duration.Companion companion = Duration.Companion;
                    duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                } else {
                    if (Result.m8026exceptionOrNullimpl(m) instanceof IllegalStateException) {
                        return Unit.INSTANCE;
                    }
                    Duration.Companion companion2 = Duration.Companion;
                    duration = DurationKt.toDuration(30, DurationUnit.SECONDS);
                }
                this.a = 1;
            } while (DelayKt.m8203delayVtjQ1oo(duration, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    static final class l extends Lambda implements Function0 {
        final /* synthetic */ io.bidmachine.analytics.internal.I.f a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(io.bidmachine.analytics.internal.I.f fVar) {
            super(0);
            this.a = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo4828invoke() {
            return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(this.a.b()));
        }
    }

    public /* synthetic */ a(C5890a c5890a, j jVar, io.bidmachine.analytics.internal.I.f fVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5890a, (i2 & 2) != 0 ? q.d() : jVar, (i2 & 4) != 0 ? io.bidmachine.analytics.internal.I.f.g.a() : fVar);
    }

    private final Object l() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName(this.l.b());
            for (Field field : cls.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == cls) {
                    field.setAccessible(true);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m8023constructorimpl(field.get(null));
                }
            }
            return Result.m8023constructorimpl(null);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public String a() {
        return this.m;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void d(Context context) {
    }

    public final CoroutineScope k() {
        return (CoroutineScope) this.n.getValue();
    }

    public final Object m() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Object l2 = l();
            Object obj = Result.m8028isFailureimpl(l2) ? null : l2;
            if (obj == null) {
                if (Result.m8028isFailureimpl(l2)) {
                    a(h.a.MONITOR_INVALID, "Collector not found");
                    return Result.m8023constructorimpl(ResultKt.createFailure(new IllegalStateException()));
                }
                a(h.a.MONITOR_NO_CONTENT, "Collector disabled");
                return Result.m8023constructorimpl(ResultKt.createFailure(new RuntimeException()));
            }
            Object d2 = d(obj);
            Object obj2 = Result.m8028isFailureimpl(d2) ? null : d2;
            if (obj2 == null) {
                if (!Result.m8028isFailureimpl(d2)) {
                    return Result.m8023constructorimpl(Unit.INSTANCE);
                }
                a(h.a.MONITOR_INVALID, "List not found");
                return Result.m8023constructorimpl(ResultKt.createFailure(new IllegalStateException()));
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
            Iterator it = CollectionsKt.toSet(concurrentHashMap.keySet()).iterator();
            while (it.hasNext()) {
                Object obj3 = concurrentHashMap.get(it.next());
                if (obj3 != null) {
                    Object c2 = c(obj3);
                    if (Result.m8028isFailureimpl(c2)) {
                        c2 = null;
                    }
                    Bundle bundle = (Bundle) c2;
                    if (bundle != null) {
                        a(bundle);
                    }
                }
            }
            return Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(AbstractC5912a.b bVar) {
        super.b(bVar);
        Class.forName(this.l.b());
    }

    @Override // io.bidmachine.analytics.internal.m.a
    public a.b b(Map map) {
        String uuid;
        Boolean booleanOrDefault$default;
        i iVar = q;
        Object obj = map.get(iVar.g());
        if (obj == null || (uuid = obj.toString()) == null) {
            uuid = UUID.randomUUID().toString();
        }
        long currentTimeMillis = this.k.e().currentTimeMillis();
        Object obj2 = map.get(iVar.f());
        String obj3 = obj2 != null ? obj2.toString() : null;
        Object obj4 = map.get(iVar.h());
        return new a.b(uuid, currentTimeMillis, 0, null, null, null, obj3, (obj4 == null || (booleanOrDefault$default = UtilsKt.toBooleanOrDefault$default(obj4, null, 1, null)) == null) ? false : booleanOrDefault$default.booleanValue(), 60, null);
    }

    @Override // io.bidmachine.analytics.internal.m.a
    public EnumC5899a c(Map map) {
        String obj;
        String upperCase;
        Object obj2 = map.get(q.e());
        if (obj2 == null || (obj = obj2.toString()) == null || (upperCase = obj.toUpperCase(Locale.US)) == null) {
            return null;
        }
        a.K k2 = io.bidmachine.analytics.internal.p.a.p;
        if (Intrinsics.areEqual(upperCase, k2.a()) ? true : Intrinsics.areEqual(upperCase, k2.e()) ? true : Intrinsics.areEqual(upperCase, k2.d())) {
            return EnumC5899a.BANNER;
        }
        if (Intrinsics.areEqual(upperCase, k2.b()) ? true : Intrinsics.areEqual(upperCase, k2.c())) {
            return EnumC5899a.INTERSTITIAL;
        }
        if (Intrinsics.areEqual(upperCase, k2.g()) ? true : Intrinsics.areEqual(upperCase, k2.h()) ? true : Intrinsics.areEqual(upperCase, k2.i())) {
            return EnumC5899a.REWARDED;
        }
        if (Intrinsics.areEqual(upperCase, k2.f())) {
            return EnumC5899a.NATIVE;
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void e(Context context) {
        JobKt__JobKt.cancelChildren$default(k().getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    @Override // io.bidmachine.analytics.internal.m.a, io.bidmachine.analytics.internal.h.AbstractC5909d
    public void f(Context context) {
        super.f(context);
        BuildersKt__Builders_commonKt.launch$default(k(), null, null, new k(null), 3, null);
    }

    private final Object d(Object obj) {
        Field field;
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName(this.l.a());
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i2];
                if (!Modifier.isStatic(field.getModifiers()) && cls.isAssignableFrom(field.getType())) {
                    break;
                }
                i2++;
            }
            if (field == null) {
                return Result.m8023constructorimpl(null);
            }
            field.setAccessible(true);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(field.get(obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    public a(C5890a c5890a, j jVar, io.bidmachine.analytics.internal.I.f fVar) {
        super(c5890a);
        this.k = c5890a;
        this.l = jVar;
        this.m = "bic";
        this.n = LazyKt.lazy(new l(fVar));
        this.o = CollectionsKt.emptyList();
    }

    private final void a(Bundle bundle) {
        i iVar = q;
        String str = bundle.getString(iVar.g(), "") + '-' + bundle.getBoolean(iVar.h(), false);
        if (this.o.contains(str)) {
            return;
        }
        this.p = bundle;
        List mutableList = CollectionsKt.toMutableList((Collection) this.o);
        mutableList.add(str);
        if (mutableList.size() > 30) {
            CollectionsKt.removeFirstOrNull(mutableList);
        }
        this.o = CollectionsKt.toList(mutableList);
        a(io.bidmachine.analytics.internal.I.g.a(bundle));
    }

    public final Object c(Object obj) {
        Method method;
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = obj.getClass();
            Class<?> cls2 = Class.forName(q.a());
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i3];
                if (k4$$ExternalSyntheticBackport0.m(method) == 0 && cls2.isAssignableFrom(method.getReturnType())) {
                    break;
                }
                i3++;
            }
            if (method == null) {
                Method[] methods = cls.getMethods();
                int length2 = methods.length;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    Method method2 = methods[i2];
                    if (k4$$ExternalSyntheticBackport0.m(method2) == 0 && cls2.isAssignableFrom(method2.getReturnType())) {
                        method = method2;
                        break;
                    }
                    i2++;
                }
            }
            if (method == null) {
                return Result.m8023constructorimpl(null);
            }
            method.setAccessible(true);
            Object invoke = method.invoke(obj, null);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl((Bundle) invoke);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final void a(h.a aVar, String str) {
        this.p = null;
        a(new io.bidmachine.analytics.internal.g.h("bic", aVar, str));
    }
}
