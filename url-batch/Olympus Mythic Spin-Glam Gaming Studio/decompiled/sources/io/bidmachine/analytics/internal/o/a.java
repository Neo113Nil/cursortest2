package io.bidmachine.analytics.internal.o;

import android.content.Context;
import io.bidmachine.analytics.internal.I.b;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.g.EnumC5899a;
import io.bidmachine.analytics.internal.g.EnumC5905g;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.analytics.internal.h.InterfaceC5907b;
import io.bidmachine.analytics.internal.i.AbstractC5912a;
import io.bidmachine.analytics.internal.m.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class a extends io.bidmachine.analytics.internal.m.a {
    private final C5890a k;
    private final Function1 l;
    private final String m;
    private F n;
    public static final A o = new A(null);
    private static final Lazy p = LazyKt.lazy(m.a);
    private static final Lazy q = LazyKt.lazy(k.a);
    private static final Lazy r = LazyKt.lazy(j.a);
    private static final Lazy s = LazyKt.lazy(l.a);
    private static final Lazy t = LazyKt.lazy(C5915b.a);
    private static final Lazy u = LazyKt.lazy(C5916c.a);
    private static final Lazy v = LazyKt.lazy(C5918e.a);
    private static final Lazy w = LazyKt.lazy(C5917d.a);
    private static final Lazy x = LazyKt.lazy(x.a);
    private static final Lazy y = LazyKt.lazy(z.a);
    private static final Lazy z = LazyKt.lazy(y.a);
    private static final Lazy A = LazyKt.lazy(h.a);
    private static final Lazy B = LazyKt.lazy(i.a);
    private static final Lazy C = LazyKt.lazy(s.a);
    private static final Lazy D = LazyKt.lazy(t.a);
    private static final Lazy E = LazyKt.lazy(C5919f.a);
    private static final Lazy F = LazyKt.lazy(g.a);
    private static final Lazy G = LazyKt.lazy(q.a);
    private static final Lazy H = LazyKt.lazy(r.a);
    private static final Lazy I = LazyKt.lazy(n.a);
    private static final Lazy J = LazyKt.lazy(p.a);
    private static final Lazy K = LazyKt.lazy(v.a);
    private static final Lazy L = LazyKt.lazy(u.a);
    private static final Lazy M = LazyKt.lazy(o.a);
    private static final Lazy N = LazyKt.lazy(w.a);

    public static final class A {
        public /* synthetic */ A(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return (String) a.t.getValue();
        }

        public final String b() {
            return (String) a.u.getValue();
        }

        public final String c() {
            return (String) a.w.getValue();
        }

        public final String d() {
            return (String) a.v.getValue();
        }

        public final String e() {
            return (String) a.E.getValue();
        }

        public final String f() {
            return (String) a.F.getValue();
        }

        public final String g() {
            return (String) a.A.getValue();
        }

        public final String h() {
            return (String) a.B.getValue();
        }

        public final String i() {
            return (String) a.r.getValue();
        }

        public final String j() {
            return (String) a.q.getValue();
        }

        public final String k() {
            return (String) a.s.getValue();
        }

        public final String l() {
            return (String) a.p.getValue();
        }

        public final String m() {
            return (String) a.I.getValue();
        }

        public final String n() {
            return (String) a.M.getValue();
        }

        public final String o() {
            return (String) a.J.getValue();
        }

        public final String p() {
            return (String) a.G.getValue();
        }

        public final String q() {
            return (String) a.H.getValue();
        }

        public final String r() {
            return (String) a.C.getValue();
        }

        public final String s() {
            return (String) a.D.getValue();
        }

        public final String t() {
            return (String) a.L.getValue();
        }

        public final String u() {
            return (String) a.K.getValue();
        }

        public final String v() {
            return (String) a.N.getValue();
        }

        public final String w() {
            return (String) a.x.getValue();
        }

        public final String x() {
            return (String) a.z.getValue();
        }

        public final String y() {
            return (String) a.y.getValue();
        }

        private A() {
        }
    }

    public static final class B implements InvocationHandler {
        private final InterfaceC5907b a;
        private Method b;

        public B(InterfaceC5907b interfaceC5907b) {
            this.a = interfaceC5907b;
        }

        private final JSONObject a(Object obj) {
            try {
                Method method = this.b;
                if (method == null) {
                    method = obj.getClass().getMethod(a.o.n(), null);
                    this.b = method;
                }
                Object invoke = method.invoke(obj, null);
                if (invoke instanceof JSONObject) {
                    return (JSONObject) invoke;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object orNull;
            String name = method.getName();
            A a = a.o;
            if (Intrinsics.areEqual(name, a.m())) {
                return Boolean.valueOf(obj == (objArr != null ? ArraysKt.getOrNull(objArr, 0) : null));
            }
            if (Intrinsics.areEqual(name, a.o())) {
                return Integer.valueOf(System.identityHashCode(obj));
            }
            if (Intrinsics.areEqual(name, a.u())) {
                return a.v();
            }
            if (Intrinsics.areEqual(method.getName(), a.t()) && objArr != null && (orNull = ArraysKt.getOrNull(objArr, 0)) != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    JSONObject a2 = a(orNull);
                    if (a2 == null || a2.length() <= 0) {
                        this.a.a(new io.bidmachine.analytics.internal.g.h("isimp", h.a.MONITOR_NO_CONTENT, null, 4, null));
                        return null;
                    }
                    try {
                        this.a.a(io.bidmachine.analytics.internal.I.g.a(a2));
                    } catch (Throwable th) {
                        this.a.a(new io.bidmachine.analytics.internal.g.h("isimp", h.a.MONITOR_BAD_CONTENT, io.bidmachine.analytics.internal.I.g.a(th)));
                    }
                    Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8023constructorimpl(ResultKt.createFailure(th2));
                }
            }
            return null;
        }
    }

    public static final class C implements E {
        public static final C1741a e = new C1741a(null);
        private final Object b;
        private final Method c;
        private final Method d;

        /* renamed from: io.bidmachine.analytics.internal.o.a$C$a, reason: collision with other inner class name */
        public static final class C1741a {

            /* renamed from: io.bidmachine.analytics.internal.o.a$C$a$a, reason: collision with other inner class name */
            static final class C1742a extends Lambda implements Function3 {
                public static final C1742a a = new C1742a();

                C1742a() {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final E invoke(Object obj, Method method, Method method2) {
                    return new C(obj, method, method2);
                }
            }

            public /* synthetic */ C1741a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final E a(InterfaceC5907b interfaceC5907b) {
                E.C1745a c1745a = E.a;
                A a = a.o;
                return c1745a.a(interfaceC5907b, a.e(), a.f(), a.p(), a.q(), C1742a.a);
            }

            private C1741a() {
            }
        }

        public C(Object obj, Method method, Method method2) {
            this.b = obj;
            this.c = method;
            this.d = method2;
        }

        @Override // io.bidmachine.analytics.internal.o.a.E
        public void a() {
            this.c.invoke(null, this.b);
        }

        @Override // io.bidmachine.analytics.internal.o.a.E
        public void b() {
            this.d.invoke(null, this.b);
        }
    }

    public static final class D implements E {
        public static final C1743a e = new C1743a(null);
        private final Object b;
        private final Method c;
        private final Method d;

        /* renamed from: io.bidmachine.analytics.internal.o.a$D$a, reason: collision with other inner class name */
        public static final class C1743a {

            /* renamed from: io.bidmachine.analytics.internal.o.a$D$a$a, reason: collision with other inner class name */
            static final class C1744a extends Lambda implements Function3 {
                public static final C1744a a = new C1744a();

                C1744a() {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final E invoke(Object obj, Method method, Method method2) {
                    return new D(obj, method, method2);
                }
            }

            public /* synthetic */ C1743a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final E a(InterfaceC5907b interfaceC5907b) {
                E.C1745a c1745a = E.a;
                A a = a.o;
                return c1745a.a(interfaceC5907b, a.g(), a.h(), a.r(), a.s(), C1744a.a);
            }

            private C1743a() {
            }
        }

        public D(Object obj, Method method, Method method2) {
            this.b = obj;
            this.c = method;
            this.d = method2;
        }

        @Override // io.bidmachine.analytics.internal.o.a.E
        public void a() {
            this.c.invoke(null, this.b);
        }

        @Override // io.bidmachine.analytics.internal.o.a.E
        public void b() {
            this.d.invoke(null, this.b);
        }
    }

    public interface E {
        public static final C1745a a = C1745a.a;

        /* renamed from: io.bidmachine.analytics.internal.o.a$E$a, reason: collision with other inner class name */
        public static final class C1745a {
            static final /* synthetic */ C1745a a = new C1745a();

            private C1745a() {
            }

            public final E a(InterfaceC5907b interfaceC5907b, String str, String str2, String str3, String str4, Function3 function3) {
                Class<?> cls;
                Class<?> cls2;
                try {
                    cls = Class.forName(str);
                } catch (Throwable unused) {
                    cls = null;
                }
                if (cls == null) {
                    return null;
                }
                try {
                    cls2 = Class.forName(str2);
                } catch (Throwable unused2) {
                    cls2 = null;
                }
                if (cls2 == null) {
                    return null;
                }
                return (E) function3.invoke(Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new B(interfaceC5907b)), cls.getMethod(str3, cls2), cls.getMethod(str4, cls2));
            }
        }

        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.bidmachine.analytics.internal.o.a$a, reason: collision with other inner class name */
    public static final class C1747a extends Lambda implements Function1 {
        public static final C1747a a = new C1747a();

        C1747a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F invoke(InterfaceC5907b interfaceC5907b) {
            return new F(interfaceC5907b, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.o.a$b, reason: case insensitive filesystem */
    static final class C5915b extends Lambda implements Function0 {
        public static final C5915b a = new C5915b();

        C5915b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("QkFOTkVS");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.o.a$c, reason: case insensitive filesystem */
    static final class C5916c extends Lambda implements Function0 {
        public static final C5916c a = new C5916c();

        C5916c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("SU5URVJTVElUSUFM");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.o.a$d, reason: case insensitive filesystem */
    static final class C5917d extends Lambda implements Function0 {
        public static final C5917d a = new C5917d();

        C5917d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("TkFUSVZFQUQ=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.o.a$e, reason: case insensitive filesystem */
    static final class C5918e extends Lambda implements Function0 {
        public static final C5918e a = new C5918e();

        C5918e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("UkVXQVJERURfVklERU8=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.o.a$f, reason: case insensitive filesystem */
    static final class C5919f extends Lambda implements Function0 {
        public static final C5919f a = new C5919f();

        C5919f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("Y29tLmlyb25zb3VyY2UubWVkaWF0aW9uc2RrLklyb25Tb3VyY2U=");
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
            return io.bidmachine.analytics.internal.I.g.a("Y29tLmlyb25zb3VyY2UubWVkaWF0aW9uc2RrLmltcHJlc3Npb25EYXRhLkltcHJlc3Npb25EYXRhTGlzdGVuZXI=");
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
            return io.bidmachine.analytics.internal.I.g.a("Y29tLnVuaXR5M2QubWVkaWF0aW9uLkxldmVsUGxheQ==");
        }
    }

    static final class i extends Lambda implements Function0 {
        public static final i a = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("Y29tLnVuaXR5M2QubWVkaWF0aW9uLmltcHJlc3Npb24uTGV2ZWxQbGF5SW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class j extends Lambda implements Function0 {
        public static final j a = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("YWRGb3JtYXQ=");
        }
    }

    static final class k extends Lambda implements Function0 {
        public static final k a = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("YWROZXR3b3Jr");
        }
    }

    static final class l extends Lambda implements Function0 {
        public static final l a = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("cHJlY2lzaW9u");
        }
    }

    static final class m extends Lambda implements Function0 {
        public static final m a = new m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("cmV2ZW51ZQ==");
        }
    }

    static final class n extends Lambda implements Function0 {
        public static final n a = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("ZXF1YWxz");
        }
    }

    static final class o extends Lambda implements Function0 {
        public static final o a = new o();

        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("Z2V0QWxsRGF0YQ==");
        }
    }

    static final class p extends Lambda implements Function0 {
        public static final p a = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("aGFzaENvZGU=");
        }
    }

    static final class q extends Lambda implements Function0 {
        public static final q a = new q();

        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("YWRkSW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class r extends Lambda implements Function0 {
        public static final r a = new r();

        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("cmVtb3ZlSW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class s extends Lambda implements Function0 {
        public static final s a = new s();

        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("YWRkSW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class t extends Lambda implements Function0 {
        public static final t a = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("cmVtb3ZlSW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class u extends Lambda implements Function0 {
        public static final u a = new u();

        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("b25JbXByZXNzaW9uU3VjY2Vzcw==");
        }
    }

    static final class v extends Lambda implements Function0 {
        public static final v a = new v();

        v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("dG9TdHJpbmc=");
        }
    }

    static final class w extends Lambda implements Function0 {
        public static final w a = new w();

        w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("TGlzdGVuZXI=");
        }
    }

    static final class x extends Lambda implements Function0 {
        public static final x a = new x();

        x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("QklE");
        }
    }

    static final class y extends Lambda implements Function0 {
        public static final y a = new y();

        y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("Q1BN");
        }
    }

    static final class z extends Lambda implements Function0 {
        public static final z a = new z();

        z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("UkFURQ==");
        }
    }

    public /* synthetic */ a(C5890a c5890a, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5890a, (i2 & 2) != 0 ? C1747a.a : function1);
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public String a() {
        return this.m;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    /* renamed from: a */
    public void b(AbstractC5912a.b bVar) {
        super.b(bVar);
        this.n = (F) this.l.invoke(this);
    }

    @Override // io.bidmachine.analytics.internal.m.a
    public a.b b(Map map) {
        Object obj;
        String obj2;
        A a = o;
        Float a2 = b.a(map.get(a.l()));
        if (a2 == null || (obj = map.get(a.j())) == null || (obj2 = obj.toString()) == null) {
            return null;
        }
        return new a.b(null, this.k.e().currentTimeMillis(), 0, a2, d(map), obj2, null, false, 197, null);
    }

    @Override // io.bidmachine.analytics.internal.m.a
    public EnumC5899a c(Map map) {
        String obj;
        String upperCase;
        A a = o;
        Object obj2 = map.get(a.i());
        if (obj2 == null || (obj = obj2.toString()) == null || (upperCase = obj.toUpperCase(Locale.US)) == null) {
            return null;
        }
        if (Intrinsics.areEqual(upperCase, a.a())) {
            return EnumC5899a.BANNER;
        }
        if (Intrinsics.areEqual(upperCase, a.b())) {
            return EnumC5899a.INTERSTITIAL;
        }
        if (Intrinsics.areEqual(upperCase, a.d())) {
            return EnumC5899a.REWARDED;
        }
        if (Intrinsics.areEqual(upperCase, a.c())) {
            return EnumC5899a.NATIVE;
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void e(Context context) {
        F f = this.n;
        if (f != null) {
            f.a();
        }
    }

    @Override // io.bidmachine.analytics.internal.m.a, io.bidmachine.analytics.internal.h.AbstractC5909d
    public void f(Context context) {
        super.f(context);
        F f = this.n;
        if (f != null) {
            f.b();
        }
    }

    public a(C5890a c5890a, Function1 function1) {
        super(c5890a);
        this.k = c5890a;
        this.l = function1;
        this.m = "isimp";
    }

    private final EnumC5905g d(Map map) {
        String obj;
        String upperCase;
        A a = o;
        Object obj2 = map.get(a.k());
        if (obj2 == null || (obj = obj2.toString()) == null || (upperCase = obj.toUpperCase(Locale.US)) == null) {
            return EnumC5905g.ESTIMATED;
        }
        return Intrinsics.areEqual(upperCase, a.w()) ? true : Intrinsics.areEqual(upperCase, a.y()) ? EnumC5905g.PRECISE : Intrinsics.areEqual(upperCase, a.x()) ? EnumC5905g.ESTIMATED : EnumC5905g.ESTIMATED;
    }

    public static final class F {
        private final InterfaceC5907b a;
        private final E b;

        /* renamed from: io.bidmachine.analytics.internal.o.a$F$a, reason: collision with other inner class name */
        static final class C1746a extends Lambda implements Function0 {
            final /* synthetic */ InterfaceC5907b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1746a(InterfaceC5907b interfaceC5907b) {
                super(0);
                this.a = interfaceC5907b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E mo4828invoke() {
                return D.e.a(this.a);
            }
        }

        static final class b extends Lambda implements Function0 {
            final /* synthetic */ InterfaceC5907b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC5907b interfaceC5907b) {
                super(0);
                this.a = interfaceC5907b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E mo4828invoke() {
                return C.e.a(this.a);
            }
        }

        public F(InterfaceC5907b interfaceC5907b, List list) {
            E e;
            this.a = interfaceC5907b;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    e = null;
                    break;
                } else {
                    e = (E) ((Function0) it.next()).mo4828invoke();
                    if (e != null) {
                        break;
                    }
                }
            }
            if (e == null) {
                throw new IllegalArgumentException("No implementation found for isimp");
            }
            this.b = e;
        }

        public final void a() {
            this.b.b();
        }

        public final void b() {
            this.b.a();
        }

        public /* synthetic */ F(InterfaceC5907b interfaceC5907b, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC5907b, (i & 2) != 0 ? CollectionsKt.listOf((Object[]) new Function0[]{new C1746a(interfaceC5907b), new b(interfaceC5907b)}) : list);
        }
    }
}
