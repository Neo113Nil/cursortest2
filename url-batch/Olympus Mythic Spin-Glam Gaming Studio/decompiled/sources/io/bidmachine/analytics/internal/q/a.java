package io.bidmachine.analytics.internal.q;

import io.bidmachine.analytics.internal.I.e;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.analytics.internal.a.f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class a {
    private volatile boolean a;
    private U b;
    private final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    private final e e = new e();
    private final Lazy f = LazyKt.lazy(new X());
    private final Lazy g = LazyKt.lazy(new Y());
    private final Lazy h = LazyKt.lazy(new Z());
    private final Lazy i = LazyKt.lazy(new a0());
    public static final T j = new T(null);
    private static final Lazy k = LazyKt.lazy(C5937f.a);
    private static final Lazy l = LazyKt.lazy(C5940i.a);
    private static final Lazy m = LazyKt.lazy(C5936e.a);
    private static final Lazy n = LazyKt.lazy(C5939h.a);
    private static final Lazy o = LazyKt.lazy(H.a);
    private static final Lazy p = LazyKt.lazy(R.a);
    private static final Lazy q = LazyKt.lazy(C5955x.a);
    private static final Lazy r = LazyKt.lazy(C5957z.a);
    private static final Lazy s = LazyKt.lazy(C5946o.a);
    private static final Lazy t = LazyKt.lazy(L.a);
    private static final Lazy u = LazyKt.lazy(M.a);
    private static final Lazy v = LazyKt.lazy(N.a);
    private static final Lazy w = LazyKt.lazy(O.a);
    private static final Lazy x = LazyKt.lazy(Q.a);
    private static final Lazy y = LazyKt.lazy(P.a);
    private static final Lazy z = LazyKt.lazy(S.a);
    private static final Lazy A = LazyKt.lazy(G.a);
    private static final Lazy B = LazyKt.lazy(D.a);
    private static final Lazy C = LazyKt.lazy(F.a);
    private static final Lazy D = LazyKt.lazy(C5956y.a);
    private static final Lazy E = LazyKt.lazy(C5953v.a);
    private static final Lazy F = LazyKt.lazy(A.a);
    private static final Lazy G = LazyKt.lazy(C5954w.a);
    private static final Lazy H = LazyKt.lazy(C5951t.a);
    private static final Lazy I = LazyKt.lazy(C5952u.a);
    private static final Lazy J = LazyKt.lazy(B.a);
    private static final Lazy K = LazyKt.lazy(J.a);
    private static final Lazy L = LazyKt.lazy(C.a);
    private static final Lazy M = LazyKt.lazy(E.a);
    private static final Lazy N = LazyKt.lazy(I.a);
    private static final Lazy O = LazyKt.lazy(C5950s.a);
    private static final Lazy P = LazyKt.lazy(C5949r.a);
    private static final Lazy Q = LazyKt.lazy(C5947p.a);
    private static final Lazy R = LazyKt.lazy(K.a);
    private static final Lazy S = LazyKt.lazy(C5948q.a);
    private static final Lazy T = LazyKt.lazy(C5943l.a);
    private static final Lazy U = LazyKt.lazy(C5942k.a);
    private static final Lazy V = LazyKt.lazy(C5941j.a);
    private static final Lazy W = LazyKt.lazy(C5944m.a);
    private static final Lazy X = LazyKt.lazy(C5945n.a);
    private static final Lazy Y = LazyKt.lazy(C5938g.a);

    static final class A extends Lambda implements Function0 {
        public static final A a = new A();

        A() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("AZJJXZkJ3T0V2Z==");
        }
    }

    static final class B extends Lambda implements Function0 {
        public static final B a = new B();

        B() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("MnclRXZtFmchBlcl5GdyFGU0V2Z=");
        }
    }

    static final class C extends Lambda implements Function0 {
        public static final C a = new C();

        C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("U2YpJHU0V2Z=");
        }
    }

    static final class D extends Lambda implements Function0 {
        public static final D a = new D();

        D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("klEdjVHZvJHU0V2Z");
        }
    }

    static final class E extends Lambda implements Function0 {
        public static final E a = new E();

        E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("l1WaUV2chh2YyVHU0V2Z");
        }
    }

    static final class F extends Lambda implements Function0 {
        public static final F a = new F();

        F() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("gblt2bUV2chh2YyVHU0V2Z==");
        }
    }

    static final class G extends Lambda implements Function0 {
        public static final G a = new G();

        G() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("QZ15WZ2VmU0V2Z==");
        }
    }

    static final class H extends Lambda implements Function0 {
        public static final H a = new H();

        H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("gbvl2cyVmVrR2U0V2Z==");
        }
    }

    static final class I extends Lambda implements Function0 {
        public static final I a = new I();

        I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("lJXd0Fmbnl2U0V2Z");
        }
    }

    static final class J extends Lambda implements Function0 {
        public static final J a = new J();

        J() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("1t2U0V2Z");
        }
    }

    static final class K extends Lambda implements Function0 {
        public static final K a = new K();

        K() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("lNmc192U0V2Z");
        }
    }

    static final class L extends Lambda implements Function0 {
        public static final L a = new L();

        L() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("UGZvNEazFGa=");
        }
    }

    static final class M extends Lambda implements Function0 {
        public static final M a = new M();

        M() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("cmbpJHdT9Gd=");
        }
    }

    static final class N extends Lambda implements Function0 {
        public static final N a = new N();

        N() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("UWduVmdlJFZBt2YhJHd=");
        }
    }

    static final class O extends Lambda implements Function0 {
        public static final O a = new O();

        O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("42bpRHcpJ3YzJWdTVmcvR3U5FGbQt2YhJHd=");
        }
    }

    static final class P extends Lambda implements Function0 {
        public static final P a = new P();

        P() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("QZzFGajJXdQVmcvR3U5FGbQt2YhJHVk5WQ5ZWayVmd==");
        }
    }

    static final class Q extends Lambda implements Function0 {
        public static final Q a = new Q();

        Q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("U2chh2YyVHUlJ3b0NVehxGU5ZWayVmd=");
        }
    }

    static final class R extends Lambda implements Function0 {
        public static final R a = new R();

        R() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("AZp9mck5WY==");
        }
    }

    static final class S extends Lambda implements Function0 {
        public static final S a = new S();

        S() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set mo4828invoke() {
            T t = a.j;
            return SetsKt.setOf((Object[]) new String[]{t.M(), t.L()});
        }
    }

    public static final class T {
        public /* synthetic */ T(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set O() {
            return (Set) a.z.getValue();
        }

        public final String A() {
            return (String) a.M.getValue();
        }

        public final String B() {
            return (String) a.C.getValue();
        }

        public final String C() {
            return (String) a.A.getValue();
        }

        public final String D() {
            return (String) a.o.getValue();
        }

        public final String E() {
            return (String) a.N.getValue();
        }

        public final String F() {
            return (String) a.K.getValue();
        }

        public final String G() {
            return (String) a.R.getValue();
        }

        public final String H() {
            return (String) a.t.getValue();
        }

        public final String I() {
            return (String) a.u.getValue();
        }

        public final String J() {
            return (String) a.v.getValue();
        }

        public final String K() {
            return (String) a.w.getValue();
        }

        public final String L() {
            return (String) a.y.getValue();
        }

        public final String M() {
            return (String) a.x.getValue();
        }

        public final String N() {
            return (String) a.p.getValue();
        }

        public final String b() {
            return (String) a.k.getValue();
        }

        public final String c() {
            return (String) a.Y.getValue();
        }

        public final String d() {
            return (String) a.n.getValue();
        }

        public final String e() {
            return (String) a.l.getValue();
        }

        public final String f() {
            return (String) a.V.getValue();
        }

        public final String g() {
            return (String) a.U.getValue();
        }

        public final String h() {
            return (String) a.T.getValue();
        }

        public final String i() {
            return (String) a.W.getValue();
        }

        public final String j() {
            return (String) a.X.getValue();
        }

        public final String k() {
            return (String) a.s.getValue();
        }

        public final String l() {
            return (String) a.Q.getValue();
        }

        public final String m() {
            return (String) a.S.getValue();
        }

        public final String n() {
            return (String) a.P.getValue();
        }

        public final String o() {
            return (String) a.O.getValue();
        }

        public final String p() {
            return (String) a.H.getValue();
        }

        public final String q() {
            return (String) a.I.getValue();
        }

        public final String r() {
            return (String) a.E.getValue();
        }

        public final String s() {
            return (String) a.G.getValue();
        }

        public final String t() {
            return (String) a.q.getValue();
        }

        public final String u() {
            return (String) a.D.getValue();
        }

        public final String v() {
            return (String) a.r.getValue();
        }

        public final String w() {
            return (String) a.F.getValue();
        }

        public final String x() {
            return (String) a.J.getValue();
        }

        public final String y() {
            return (String) a.L.getValue();
        }

        public final String z() {
            return (String) a.B.getValue();
        }

        private T() {
        }

        public final String a() {
            return (String) a.m.getValue();
        }
    }

    private static final class U {
        private final Object a;
        private final Field b;
        private final Object c;
        private final Object d;

        public U(Object obj, Field field, Object obj2, Object obj3) {
            this.a = obj;
            this.b = field;
            this.c = obj2;
            this.d = obj3;
        }

        public final Field a() {
            return this.b;
        }

        public final Object b() {
            return this.c;
        }

        public final Object c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof U)) {
                return false;
            }
            U u = (U) obj;
            return Intrinsics.areEqual(this.a, u.a) && Intrinsics.areEqual(this.b, u.b) && Intrinsics.areEqual(this.c, u.c) && Intrinsics.areEqual(this.d, u.d);
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public static abstract class V {

        /* renamed from: io.bidmachine.analytics.internal.q.a$V$a, reason: collision with other inner class name */
        public static final class C1752a extends V {
            private final String a;
            private final String b;
            private final Long c;
            private final String d;
            private final String e;
            private final String f;
            private final Long g;
            private final Map h;
            private final Map i;

            public C1752a(String str, String str2, Long l, String str3, String str4, String str5, Long l2, Map map, Map map2) {
                super(null);
                this.a = str;
                this.b = str2;
                this.c = l;
                this.d = str3;
                this.e = str4;
                this.f = str5;
                this.g = l2;
                this.h = map;
                this.i = map2;
            }

            public final Map a() {
                return this.h;
            }

            public final String b() {
                return this.d;
            }

            public final String c() {
                return this.e;
            }

            public final Map d() {
                return this.i;
            }

            public final Long e() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1752a)) {
                    return false;
                }
                C1752a c1752a = (C1752a) obj;
                return Intrinsics.areEqual(this.a, c1752a.a) && Intrinsics.areEqual(this.b, c1752a.b) && Intrinsics.areEqual(this.c, c1752a.c) && Intrinsics.areEqual(this.d, c1752a.d) && Intrinsics.areEqual(this.e, c1752a.e) && Intrinsics.areEqual(this.f, c1752a.f) && Intrinsics.areEqual(this.g, c1752a.g) && Intrinsics.areEqual(this.h, c1752a.h) && Intrinsics.areEqual(this.i, c1752a.i);
            }

            public final Long f() {
                return this.g;
            }

            public final String g() {
                return this.b;
            }

            public final String h() {
                return this.f;
            }

            public int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Long l = this.c;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                String str3 = this.d;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.e;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                Long l2 = this.g;
                int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
                Map map = this.h;
                int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
                Map map2 = this.i;
                return hashCode8 + (map2 != null ? map2.hashCode() : 0);
            }

            public final String i() {
                return this.a;
            }

            public String toString() {
                return super.toString();
            }
        }

        public static final class b extends V {
            private final String a;
            private final String b;
            private final String c;
            private final Double d;
            private final String e;
            private final String f;
            private final String g;
            private final String h;
            private final Map i;
            private final Map j;

            public b(String str, String str2, String str3, Double d, String str4, String str5, String str6, String str7, Map map, Map map2) {
                super(null);
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = d;
                this.e = str4;
                this.f = str5;
                this.g = str6;
                this.h = str7;
                this.i = map;
                this.j = map2;
            }

            public final String a() {
                return this.h;
            }

            public final Map b() {
                return this.i;
            }

            public final String c() {
                return this.e;
            }

            public final String d() {
                return this.g;
            }

            public final String e() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && Intrinsics.areEqual((Object) this.d, (Object) bVar.d) && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f) && Intrinsics.areEqual(this.g, bVar.g) && Intrinsics.areEqual(this.h, bVar.h) && Intrinsics.areEqual(this.i, bVar.i) && Intrinsics.areEqual(this.j, bVar.j);
            }

            public final String f() {
                return this.f;
            }

            public final Map g() {
                return this.j;
            }

            public final String h() {
                return this.a;
            }

            public int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Double d = this.d;
                int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
                String str4 = this.e;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.g;
                int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.h;
                int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
                Map map = this.i;
                int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
                Map map2 = this.j;
                return hashCode9 + (map2 != null ? map2.hashCode() : 0);
            }

            public final String i() {
                return this.b;
            }

            public final Double j() {
                return this.d;
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ V(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private V() {
        }
    }

    public interface W {
        void a(V v);
    }

    static final class X extends Lambda implements Function0 {
        X() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            T t;
            Class a;
            a aVar = a.this;
            try {
                e eVar = aVar.e;
                t = a.j;
                a = eVar.a(t.b());
            } catch (Throwable unused) {
            }
            if (a == null) {
                return null;
            }
            Object a2 = e.a(aVar.e, a, t.t(), (List) null, 4, (Object) null);
            return a2 == null ? e.a(aVar.e, a, t.v(), (List) null, 4, (Object) null) : a2;
        }
    }

    static final class Y extends Lambda implements Function0 {
        Y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(a.this.P() != null);
        }
    }

    static final class Z extends Lambda implements Function0 {
        Z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            Object a;
            a aVar = a.this;
            try {
                e eVar = aVar.e;
                T t = a.j;
                Class a2 = eVar.a(t.d());
                if (a2 != null && (a = e.a(aVar.e, a2, t.D(), (List) null, 4, (Object) null)) != null) {
                    return a.toString();
                }
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$a, reason: collision with other inner class name */
    private final class C1753a implements InvocationHandler {
        private final Object a;

        public C1753a(Object obj) {
            this.a = obj;
        }

        private final Object a(Object obj, Method method, Object[] objArr) {
            if (Intrinsics.areEqual(method.getDeclaringClass(), Object.class)) {
                String name = method.getName();
                T t = a.j;
                if (Intrinsics.areEqual(name, t.k())) {
                    return Boolean.valueOf(obj == (objArr != null ? ArraysKt.getOrNull(objArr, 0) : null));
                }
                if (Intrinsics.areEqual(name, t.H())) {
                    return Integer.valueOf(System.identityHashCode(obj));
                }
                if (Intrinsics.areEqual(name, t.I())) {
                    return String.valueOf(System.identityHashCode(obj));
                }
                return null;
            }
            if (objArr != null) {
                String name2 = method.getName();
                T t2 = a.j;
                if (Intrinsics.areEqual(name2, t2.J())) {
                    Object orNull = ArraysKt.getOrNull(objArr, 0);
                    if (orNull != null && a.this.a((Class) orNull.getClass()) && !a.this.c.isEmpty()) {
                        a aVar = a.this;
                        aVar.a(aVar.a(orNull));
                    }
                } else if (Intrinsics.areEqual(name2, t2.K())) {
                    Object orNull2 = ArraysKt.getOrNull(objArr, 0);
                    if (orNull2 != null && a.this.a((Class) orNull2.getClass()) && !a.this.d.isEmpty()) {
                        a aVar2 = a.this;
                        aVar2.a((V) aVar2.b(orNull2));
                    }
                } else if (t2.O().contains(name2)) {
                    Object orNull3 = ArraysKt.getOrNull(objArr, 0);
                    if (!a.this.d.isEmpty() && orNull3 != null && a.this.a((Class) orNull3.getClass())) {
                        a aVar3 = a.this;
                        aVar3.a((V) aVar3.c(orNull3));
                    }
                }
            }
            return objArr == null ? method.invoke(this.a, null) : method.invoke(this.a, Arrays.copyOf(objArr, objArr.length));
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                System.nanoTime();
                Object a = a(obj, method, objArr);
                System.nanoTime();
                return a;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    static final class a0 extends Lambda implements Function0 {
        a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f mo4828invoke() {
            String Q = a.this.Q();
            if (Q == null) {
                return null;
            }
            return f.d.a(StringsKt.replace$default(Q, a.j.N(), "", false, 4, (Object) null));
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$b, reason: case insensitive filesystem */
    private static final class C5933b {
        private final Object a;
        private final Field b;
        private final Object c;

        public C5933b(Object obj, Field field, Object obj2) {
            this.a = obj;
            this.b = field;
            this.c = obj2;
        }

        public final Field a() {
            return this.b;
        }

        public final Object b() {
            return this.c;
        }

        public final Object c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5933b)) {
                return false;
            }
            C5933b c5933b = (C5933b) obj;
            return Intrinsics.areEqual(this.a, c5933b.a) && Intrinsics.areEqual(this.b, c5933b.b) && Intrinsics.areEqual(this.c, c5933b.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$c, reason: case insensitive filesystem */
    public static final class C5934c {
        private final String a;
        private final String b;
        private final String c;
        private final Double d;
        private final Map e;

        public C5934c(String str, String str2, String str3, Double d, Map map) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = d;
            this.e = map;
        }

        public final String a() {
            return this.c;
        }

        public final Map b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public final Double e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5934c)) {
                return false;
            }
            C5934c c5934c = (C5934c) obj;
            return Intrinsics.areEqual(this.a, c5934c.a) && Intrinsics.areEqual(this.b, c5934c.b) && Intrinsics.areEqual(this.c, c5934c.c) && Intrinsics.areEqual((Object) this.d, (Object) c5934c.d) && Intrinsics.areEqual(this.e, c5934c.e);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Double d = this.d;
            return ((hashCode3 + (d != null ? d.hashCode() : 0)) * 31) + this.e.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$d, reason: case insensitive filesystem */
    public interface InterfaceC5935d {
        void a(C5934c c5934c);
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$e, reason: case insensitive filesystem */
    static final class C5936e extends Lambda implements Function0 {
        public static final C5936e a = new C5936e();

        C5936e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("yVGbk5WYIlHdpZXa0NWY");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$f, reason: case insensitive filesystem */
    static final class C5937f extends Lambda implements Function0 {
        public static final C5937f a = new C5937f();

        C5937f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("0NXdqRWQusGZz5CdzVnakFmLt92Y");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$g, reason: case insensitive filesystem */
    static final class C5938g extends Lambda implements Function0 {
        public static final C5938g a = new C5938g();

        C5938g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("usGZz5CdzVnakFmLt92Y");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$h, reason: case insensitive filesystem */
    static final class C5939h extends Lambda implements Function0 {
        public static final C5939h a = new C5939h();

        C5939h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("AbpRXVusGZz5CdzVnakFmLt92Y==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$i, reason: case insensitive filesystem */
    static final class C5940i extends Lambda implements Function0 {
        public static final C5940i a = new C5940i();

        C5940i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("gclxGZuFGS5RXa2lGdjFUSusGZz5CdzVnakFmLt92Y==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$j, reason: case insensitive filesystem */
    static final class C5941j extends Lambda implements Function0 {
        public static final C5941j a = new C5941j();

        C5941j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("Qnb192YfNnbvl2czVmcw1WafRWY=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$k, reason: case insensitive filesystem */
    static final class C5942k extends Lambda implements Function0 {
        public static final C5942k a = new C5942k();

        C5942k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("Qnbl1WZjFGbw9VZ15WZ2VmcfRWY=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$l, reason: case insensitive filesystem */
    static final class C5943l extends Lambda implements Function0 {
        public static final C5943l a = new C5943l();

        C5943l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("0lmb19VZ15WZ2VmcfRWY");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$m, reason: case insensitive filesystem */
    static final class C5944m extends Lambda implements Function0 {
        public static final C5944m a = new C5944m();

        C5944m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("z1WYyFGcft2YhJGbsF2Y");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$n, reason: case insensitive filesystem */
    static final class C5945n extends Lambda implements Function0 {
        public static final C5945n a = new C5945n();

        C5945n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("MXbhJXYw9lcl5GdyFGc=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$o, reason: case insensitive filesystem */
    static final class C5946o extends Lambda implements Function0 {
        public static final C5946o a = new C5946o();

        C5946o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("zxWY1FXZ");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$p, reason: case insensitive filesystem */
    static final class C5947p extends Lambda implements Function0 {
        public static final C5947p a = new C5947p();

        C5947p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("05WdvN0cu9WazNXZyBXbJRWQ0V2Z");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$q, reason: case insensitive filesystem */
    static final class C5948q extends Lambda implements Function0 {
        public static final C5948q a = new C5948q();

        C5948q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("way92d0VmTlVnblZXZSRWQ0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$r, reason: case insensitive filesystem */
    static final class C5949r extends Lambda implements Function0 {
        public static final C5949r a = new C5949r();

        C5949r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("05WZtV2YhxGUlVnblZXZSRWQ0V2Z");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$s, reason: case insensitive filesystem */
    static final class C5950s extends Lambda implements Function0 {
        public static final C5950s a = new C5950s();

        C5950s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("Adp5WVlVnblZXZSRWQ0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$t, reason: case insensitive filesystem */
    static final class C5951t extends Lambda implements Function0 {
        public static final C5951t a = new C5951t();

        C5951t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("AZJt2YhJGbsF2Q0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$u, reason: case insensitive filesystem */
    static final class C5952u extends Lambda implements Function0 {
        public static final C5952u a = new C5952u();

        C5952u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("zJXZ0VWbhJXYQt2YhJGbsF2Q0V2Z");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$v, reason: case insensitive filesystem */
    static final class C5953v extends Lambda implements Function0 {
        public static final C5953v a = new C5953v();

        C5953v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("k3YuVmcyV3Q0V2Z=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$w, reason: case insensitive filesystem */
    static final class C5954w extends Lambda implements Function0 {
        public static final C5954w a = new C5954w();

        C5954w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("klkbvlGdhNWasBXdkVGR0V2Z");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$x, reason: case insensitive filesystem */
    static final class C5955x extends Lambda implements Function0 {
        public static final C5955x a = new C5955x();

        C5955x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("lNmbhR3culEdsVXYmVGR0V2Z");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$y, reason: case insensitive filesystem */
    static final class C5956y extends Lambda implements Function0 {
        public static final C5956y a = new C5956y();

        C5956y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("gblt2bURnblZXR0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.a$z, reason: case insensitive filesystem */
    static final class C5957z extends Lambda implements Function0 {
        public static final C5957z a = new C5957z();

        C5957z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("U2YuFGdz5WS0V2Z=");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P() {
        return this.f.getValue();
    }

    private final synchronized boolean V() {
        boolean z2;
        try {
            if (S()) {
                z2 = T();
            } else {
                W();
                z2 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    public final String Q() {
        return (String) this.h.getValue();
    }

    public final f R() {
        return (f) this.i.getValue();
    }

    public final boolean S() {
        return (this.c.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    public final synchronized boolean T() {
        Object m8023constructorimpl;
        if (this.a) {
            return true;
        }
        Object P2 = P();
        if (P2 == null) {
            return false;
        }
        Class a = this.e.a(j.e());
        if (a == null) {
            return false;
        }
        C5933b d = d(P2);
        if (d == null) {
            return false;
        }
        Object newProxyInstance = Proxy.newProxyInstance(a.getClassLoader(), new Class[]{a}, new C1753a(d.b()));
        try {
            Result.Companion companion = Result.INSTANCE;
            d.a().setAccessible(true);
            d.a().set(d.c(), newProxyInstance);
            m8023constructorimpl = Result.m8023constructorimpl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = bool;
        }
        if (!((Boolean) m8023constructorimpl).booleanValue()) {
            return false;
        }
        this.b = new U(d.c(), d.a(), d.b(), newProxyInstance);
        this.a = true;
        return true;
    }

    public final boolean U() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final synchronized void W() {
        U u2 = this.b;
        if (u2 == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            u2.a().setAccessible(true);
            u2.a().set(u2.c(), u2.b());
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        this.b = null;
        this.a = false;
    }

    private final C5933b d(Object obj) {
        Object m8023constructorimpl;
        Field field;
        Object obj2;
        Class a = this.e.a(j.e());
        if (a == null) {
            return null;
        }
        for (Class<?> cls = obj.getClass(); cls != null && !Intrinsics.areEqual(cls, Object.class); cls = cls.getSuperclass()) {
            try {
                field = cls.getDeclaredField(j.a());
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable unused2) {
                }
                try {
                    obj2 = field.get(obj);
                } catch (Throwable unused3) {
                    obj2 = null;
                }
                if (obj2 != null && a.isAssignableFrom(obj2.getClass())) {
                    return new C5933b(obj, field, obj2);
                }
                return null;
            }
        }
        for (Field field2 : this.e.b(obj.getClass())) {
            if (a.isAssignableFrom(field2.getType())) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(field2.get(obj));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                    m8023constructorimpl = null;
                }
                if (m8023constructorimpl != null) {
                    return new C5933b(obj, field2, m8023constructorimpl);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V.b c(Object obj) {
        e eVar = this.e;
        T t2 = j;
        Object a = e.a(eVar, obj, t2.C(), (List) null, 4, (Object) null);
        Number number = a instanceof Number ? (Number) a : null;
        Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
        Object a2 = e.a(this.e, obj, t2.z(), (List) null, 4, (Object) null);
        String obj2 = a2 != null ? a2.toString() : null;
        Object a3 = e.a(this.e, obj, t2.B(), (List) null, 4, (Object) null);
        String obj3 = a3 != null ? a3.toString() : null;
        Object a4 = e.a(this.e, obj, t2.u(), (List) null, 4, (Object) null);
        String obj4 = a4 != null ? a4.toString() : null;
        Object a5 = e.a(this.e, obj, t2.r(), (List) null, 4, (Object) null);
        String obj5 = a5 != null ? a5.toString() : null;
        Object a6 = e.a(this.e, obj, t2.w(), (List) null, 4, (Object) null);
        String obj6 = a6 != null ? a6.toString() : null;
        Object a7 = e.a(this.e, obj, t2.s(), (List) null, 4, (Object) null);
        String obj7 = a7 != null ? a7.toString() : null;
        Object a8 = e.a(this.e, obj, t2.p(), (List) null, 4, (Object) null);
        String obj8 = a8 != null ? a8.toString() : null;
        Object a9 = e.a(this.e, obj, t2.q(), (List) null, 4, (Object) null);
        Map map = a9 instanceof Map ? (Map) a9 : null;
        Object a10 = e.a(this.e, obj, t2.x(), (List) null, 4, (Object) null);
        return new V.b(obj2, obj3, obj4, valueOf, obj5, obj6, obj7, obj8, map, a10 instanceof Map ? (Map) a10 : null);
    }

    public final void b(InterfaceC5935d interfaceC5935d) {
        this.c.remove(interfaceC5935d);
        V();
    }

    public final void b(W w2) {
        this.d.remove(w2);
        V();
    }

    public final boolean a(InterfaceC5935d interfaceC5935d) {
        this.c.add(interfaceC5935d);
        return V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V.C1752a b(Object obj) {
        e eVar = this.e;
        T t2 = j;
        Object a = e.a(eVar, obj, t2.y(), (List) null, 4, (Object) null);
        Object a2 = e.a(this.e, obj, t2.A(), (List) null, 4, (Object) null);
        Object a3 = e.a(this.e, obj, t2.F(), (List) null, 4, (Object) null);
        String obj2 = a3 != null ? a3.toString() : null;
        Object a4 = e.a(this.e, obj, t2.B(), (List) null, 4, (Object) null);
        String obj3 = a4 != null ? a4.toString() : null;
        Number number = a instanceof Number ? (Number) a : null;
        Long valueOf = number != null ? Long.valueOf(number.longValue()) : null;
        Object a5 = e.a(this.e, obj, t2.r(), (List) null, 4, (Object) null);
        String obj4 = a5 != null ? a5.toString() : null;
        Object a6 = e.a(this.e, obj, t2.w(), (List) null, 4, (Object) null);
        String obj5 = a6 != null ? a6.toString() : null;
        Object a7 = e.a(this.e, obj, t2.E(), (List) null, 4, (Object) null);
        String obj6 = a7 != null ? a7.toString() : null;
        Number number2 = a2 instanceof Number ? (Number) a2 : null;
        Long valueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
        Object a8 = e.a(this.e, obj, t2.q(), (List) null, 4, (Object) null);
        Map map = a8 instanceof Map ? (Map) a8 : null;
        Object a9 = e.a(this.e, obj, t2.x(), (List) null, 4, (Object) null);
        return new V.C1752a(obj2, obj3, valueOf, obj4, obj5, obj6, valueOf2, map, a9 instanceof Map ? (Map) a9 : null);
    }

    public final boolean a(W w2) {
        this.d.add(w2);
        return V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5934c a(Object obj) {
        e eVar = this.e;
        T t2 = j;
        Object a = e.a(eVar, obj, t2.C(), (List) null, 4, (Object) null);
        Number number = a instanceof Number ? (Number) a : null;
        Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object a2 = e.a(this.e, obj, t2.o(), (List) null, 4, (Object) null);
        if (a2 != null) {
            linkedHashMap.put(t2.h(), a2);
        }
        Object a3 = e.a(this.e, obj, t2.n(), (List) null, 4, (Object) null);
        if (a3 != null) {
            linkedHashMap.put(t2.g(), a3);
        }
        Object a4 = e.a(this.e, obj, t2.l(), (List) null, 4, (Object) null);
        if (a4 != null) {
            linkedHashMap.put(t2.f(), a4);
        }
        Object a5 = e.a(this.e, obj, t2.q(), (List) null, 4, (Object) null);
        Map map = a5 instanceof Map ? (Map) a5 : null;
        if (map != null) {
            linkedHashMap.put(t2.i(), map);
        }
        Object a6 = e.a(this.e, obj, t2.x(), (List) null, 4, (Object) null);
        Map map2 = a6 instanceof Map ? (Map) a6 : null;
        if (map2 != null) {
            linkedHashMap.put(t2.j(), map2);
        }
        Object a7 = e.a(this.e, obj, t2.G(), (List) null, 4, (Object) null);
        String obj2 = a7 != null ? a7.toString() : null;
        Object a8 = e.a(this.e, obj, t2.m(), (List) null, 4, (Object) null);
        String obj3 = a8 != null ? a8.toString() : null;
        Object a9 = e.a(this.e, obj, t2.r(), (List) null, 4, (Object) null);
        return new C5934c(obj2, obj3, a9 != null ? a9.toString() : null, valueOf, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C5934c c5934c) {
        Object m8023constructorimpl;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            InterfaceC5935d interfaceC5935d = (InterfaceC5935d) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                interfaceC5935d.a(c5934c);
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(V v2) {
        Object m8023constructorimpl;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            W w2 = (W) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                w2.a(v2);
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(Class cls) {
        return cls != null && StringsKt.startsWith$default(cls.getName(), j.c(), false, 2, (Object) null);
    }
}
