package io.bidmachine.analytics.internal.q;

import com.ironsource.k4$$ExternalSyntheticBackport0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.analytics.internal.I.c;
import io.bidmachine.analytics.internal.I.e;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.analytics.internal.a.f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class b {
    private final io.bidmachine.analytics.internal.J.b a;
    private volatile boolean b;
    private B0 c;
    private final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    private final e f;
    private final c g;
    private final Set h;
    private volatile Map i;
    private final Lazy j;
    private final Lazy k;
    private final Object l;
    private final Lazy m;
    private final Lazy n;
    private final Lazy o;
    public static final z0 p = new z0(null);
    private static final Lazy q = LazyKt.lazy(C5965e.a);
    private static final Lazy r = LazyKt.lazy(C5967f.a);
    private static final Lazy s = LazyKt.lazy(C5969g.a);
    private static final Lazy t = LazyKt.lazy(C5984n0.a);
    private static final Lazy u = LazyKt.lazy(C5968f0.a);
    private static final Lazy v = LazyKt.lazy(C5962c0.a);
    private static final Lazy w = LazyKt.lazy(p0.a);
    private static final Lazy x = LazyKt.lazy(q0.a);
    private static final Lazy y = LazyKt.lazy(C5970g0.a);
    private static final Lazy z = LazyKt.lazy(C5986o0.a);
    private static final Lazy A = LazyKt.lazy(C5972h0.a);
    private static final Lazy B = LazyKt.lazy(C5966e0.a);
    private static final Lazy C = LazyKt.lazy(C5982m0.a);
    private static final Lazy D = LazyKt.lazy(C5980l0.a);
    private static final Lazy E = LazyKt.lazy(C5974i0.a);
    private static final Lazy F = LazyKt.lazy(C5964d0.a);
    private static final Lazy G = LazyKt.lazy(C5978k0.a);
    private static final Lazy H = LazyKt.lazy(C5976j0.a);
    private static final Lazy I = LazyKt.lazy(F.a);
    private static final Lazy J = LazyKt.lazy(C5992u.a);
    private static final Lazy K = LazyKt.lazy(G.a);
    private static final Lazy L = LazyKt.lazy(C5995x.a);
    private static final Lazy M = LazyKt.lazy(P.a);
    private static final Lazy N = LazyKt.lazy(Q.a);
    private static final Lazy O = LazyKt.lazy(Y.a);
    private static final Lazy P = LazyKt.lazy(T.a);
    private static final Lazy Q = LazyKt.lazy(C5996y.a);
    private static final Lazy R = LazyKt.lazy(C5997z.a);
    private static final Lazy S = LazyKt.lazy(C5993v.a);
    private static final Lazy T = LazyKt.lazy(D.a);
    private static final Lazy U = LazyKt.lazy(C5994w.a);
    private static final Lazy V = LazyKt.lazy(C5959a0.a);
    private static final Lazy W = LazyKt.lazy(R.a);
    private static final Lazy X = LazyKt.lazy(H.a);
    private static final Lazy Y = LazyKt.lazy(O.a);
    private static final Lazy Z = LazyKt.lazy(C.a);
    private static final Lazy a0 = LazyKt.lazy(Z.a);
    private static final Lazy b0 = LazyKt.lazy(A.a);
    private static final Lazy c0 = LazyKt.lazy(W.a);
    private static final Lazy d0 = LazyKt.lazy(K.a);
    private static final Lazy e0 = LazyKt.lazy(E.a);
    private static final Lazy f0 = LazyKt.lazy(X.a);
    private static final Lazy g0 = LazyKt.lazy(M.a);
    private static final Lazy h0 = LazyKt.lazy(N.a);
    private static final Lazy i0 = LazyKt.lazy(V.a);
    private static final Lazy j0 = LazyKt.lazy(I.a);
    private static final Lazy k0 = LazyKt.lazy(J.a);
    private static final Lazy l0 = LazyKt.lazy(U.a);
    private static final Lazy m0 = LazyKt.lazy(B.a);
    private static final Lazy n0 = LazyKt.lazy(S.a);
    private static final Lazy o0 = LazyKt.lazy(L.a);
    private static final Lazy p0 = LazyKt.lazy(C5991t.a);
    private static final Lazy q0 = LazyKt.lazy(C5990s.a);
    private static final Lazy r0 = LazyKt.lazy(x0.a);
    private static final Lazy s0 = LazyKt.lazy(y0.a);
    private static final Lazy t0 = LazyKt.lazy(w0.a);
    private static final Lazy u0 = LazyKt.lazy(C5963d.a);
    private static final Lazy v0 = LazyKt.lazy(C5983n.a);
    private static final Lazy w0 = LazyKt.lazy(C5989r.a);
    private static final Lazy x0 = LazyKt.lazy(C5977k.a);
    private static final Lazy y0 = LazyKt.lazy(C5979l.a);
    private static final Lazy z0 = LazyKt.lazy(C5987p.a);
    private static final Lazy A0 = LazyKt.lazy(C5981m.a);
    private static final Lazy B0 = LazyKt.lazy(C5973i.a);
    private static final Lazy C0 = LazyKt.lazy(C5988q.a);
    private static final Lazy D0 = LazyKt.lazy(C5971h.a);
    private static final Lazy E0 = LazyKt.lazy(C5975j.a);
    private static final Lazy F0 = LazyKt.lazy(C5985o.a);
    private static final Lazy G0 = LazyKt.lazy(s0.a);
    private static final Lazy H0 = LazyKt.lazy(t0.a);
    private static final Lazy I0 = LazyKt.lazy(r0.a);
    private static final Lazy J0 = LazyKt.lazy(C5960b0.a);
    private static final Lazy K0 = LazyKt.lazy(u0.a);
    private static final Lazy L0 = LazyKt.lazy(v0.a);

    static final class A extends Lambda implements Function0 {
        public static final A a = new A();

        A() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("lNXYoNmc1B3XwBXYf5Wa");
        }
    }

    private interface A0 {

        public static final class a implements A0 {
            private final C5958a a;

            public a(C5958a c5958a) {
                this.a = c5958a;
            }

            public final C5958a a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        /* renamed from: io.bidmachine.analytics.internal.q.b$A0$b, reason: collision with other inner class name */
        public static final class C1754b implements A0 {
            private final E0 a;

            public C1754b(E0 e0) {
                this.a = e0;
            }

            public final E0 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1754b) && Intrinsics.areEqual(this.a, ((C1754b) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return super.toString();
            }
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
            return g.b("EGdhR2XlNXYoNmc1B3XwBXYf5Wa=");
        }
    }

    private static final class B0 {
        private final List a;
        private final Class b;
        private final Object c;

        public B0(List list, Class cls, Object obj) {
            this.a = list;
            this.b = cls;
            this.c = obj;
        }

        public final List a() {
            return this.a;
        }

        public final Object b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof B0)) {
                return false;
            }
            B0 b0 = (B0) obj;
            return Intrinsics.areEqual(this.a, b0.a) && Intrinsics.areEqual(this.b, b0.b) && Intrinsics.areEqual(this.c, b0.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return super.toString();
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
            return g.b("l1WYu9VZnF2ajFGc");
        }
    }

    private final class C0 implements InvocationHandler {
        public C0() {
        }

        private final Object a(Object obj, Method method, Object[] objArr) {
            Object orNull;
            A0 g;
            if (Intrinsics.areEqual(method.getDeclaringClass(), Object.class)) {
                String name = method.getName();
                z0 z0Var = b.p;
                if (Intrinsics.areEqual(name, z0Var.Z())) {
                    return Boolean.valueOf(obj == (objArr != null ? ArraysKt.getOrNull(objArr, 0) : null));
                }
                if (Intrinsics.areEqual(name, z0Var.m0())) {
                    return Integer.valueOf(System.identityHashCode(obj));
                }
                if (Intrinsics.areEqual(name, z0Var.n0())) {
                    return String.valueOf(System.identityHashCode(obj));
                }
                return null;
            }
            int m = k4$$ExternalSyntheticBackport0.m(method);
            if ((m != 1 && m != 2) || objArr == null || (orNull = ArraysKt.getOrNull(objArr, 0)) == null || !b.this.b((Class) orNull.getClass()) || (g = b.this.g(orNull)) == null || !b.this.h.add(orNull)) {
                return null;
            }
            b.this.a(g);
            return null;
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

    static final class D extends Lambda implements Function0 {
        public static final D a = new D();

        D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("U2YpJHc=");
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
            return g.b("AdjVHZvJHc==");
        }
    }

    public static final class E0 {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private final String h;
        private final Map i;

        public E0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = map;
        }

        public final String a() {
            return this.e;
        }

        public final Map b() {
            return this.i;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof E0)) {
                return false;
            }
            E0 e0 = (E0) obj;
            return Intrinsics.areEqual(this.a, e0.a) && Intrinsics.areEqual(this.b, e0.b) && Intrinsics.areEqual(this.c, e0.c) && Intrinsics.areEqual(this.d, e0.d) && Intrinsics.areEqual(this.e, e0.e) && Intrinsics.areEqual(this.f, e0.f) && Intrinsics.areEqual(this.g, e0.g) && Intrinsics.areEqual(this.h, e0.h) && Intrinsics.areEqual(this.i, e0.i);
        }

        public final String f() {
            return this.c;
        }

        public final String g() {
            return this.g;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            return ((hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.i.hashCode();
        }

        public String toString() {
            return super.toString();
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
            return g.b("AZp9FdjVHZvJHc==");
        }
    }

    public interface F0 {
        void a(E0 e0);
    }

    static final class G extends Lambda implements Function0 {
        public static final G a = new G();

        G() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("MHZp9FdjVHZvJHc=");
        }
    }

    private static final class G0 {
        private Object a;
        private Map b;
        private int c;
        private Map d;
        private int e;
        private boolean f;

        public G0(Object obj, Map map, int i, Map map2, int i2, boolean z) {
            this.a = obj;
            this.b = map;
            this.c = i;
            this.d = map2;
            this.e = i2;
            this.f = z;
        }

        public final void a(Object obj) {
            this.a = obj;
        }

        public final void b(Map map) {
            this.b = map;
        }

        public final Map c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final boolean e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof G0)) {
                return false;
            }
            G0 g0 = (G0) obj;
            return Intrinsics.areEqual(this.a, g0.a) && Intrinsics.areEqual(this.b, g0.b) && this.c == g0.c && Intrinsics.areEqual(this.d, g0.d) && this.e == g0.e && this.f == g0.f;
        }

        public final Object f() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Object obj = this.a;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Map map = this.b;
            int hashCode2 = (((hashCode + (map == null ? 0 : map.hashCode())) * 31) + Integer.hashCode(this.c)) * 31;
            Map map2 = this.d;
            int hashCode3 = (((hashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31) + Integer.hashCode(this.e)) * 31;
            boolean z = this.f;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode3 + i;
        }

        public String toString() {
            return super.toString();
        }

        public final Map a() {
            return this.d;
        }

        public final void b(int i) {
            this.c = i;
        }

        public final void a(Map map) {
            this.d = map;
        }

        public final int b() {
            return this.e;
        }

        public final void a(int i) {
            this.e = i;
        }

        public final void a(boolean z) {
            this.f = z;
        }

        public /* synthetic */ G0(Object obj, Map map, int i, Map map2, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : obj, (i3 & 2) != 0 ? null : map, (i3 & 4) != 0 ? -1 : i, (i3 & 8) == 0 ? map2 : null, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? false : z);
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
            return g.b("lBXe09FdjVHZvJHc");
        }
    }

    private enum H0 {
        AD_REVENUE,
        MANUAL_PURCHASE_VALIDATION,
        PURCHASE_VALIDATE
    }

    static final class I extends Lambda implements Function0 {
        public static final I a = new I();

        I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("Qelt2XjlGbiVHc==");
        }
    }

    public /* synthetic */ class I0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[H0.values().length];
            try {
                iArr[H0.AD_REVENUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H0.MANUAL_PURCHASE_VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H0.PURCHASE_VALIDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
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
            return g.b("5V2ajlGbiVHc");
        }
    }

    static final class J0 extends Lambda implements Function0 {
        J0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class mo4828invoke() {
            return b.this.f.a(b.p.b());
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
            return g.b("U2chh2YyVHc=");
        }
    }

    static final class K0 extends Lambda implements Function1 {
        K0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(b.this.c(obj));
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
            return g.b("zxWahRXZk9Fbh52bpRXakRWYfV2chh2YyVHc");
        }
    }

    static final class L0 extends Lambda implements Function0 {
        L0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(b.this.l != null);
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
            return g.b("QY0FGZfV2chh2YyVHc==");
        }
    }

    static final class M0 extends Lambda implements Function0 {
        M0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class mo4828invoke() {
            return b.this.f.a(b.p.c());
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
            return g.b("hRXYkV2chh2YyVHc");
        }
    }

    static final class N0 extends Lambda implements Function0 {
        N0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            Object a;
            b bVar = b.this;
            try {
                Object obj = bVar.l;
                if (obj != null && (a = e.a(bVar.f, obj, b.p.k0(), (List) null, 4, (Object) null)) != null) {
                    return a.toString();
                }
            } catch (Throwable unused) {
            }
            return null;
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
            return g.b("QZtlGdfV2chh2YyVHc==");
        }
    }

    static final class O0 extends Lambda implements Function0 {
        O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f mo4828invoke() {
            String y0 = b.this.y0();
            if (y0 == null) {
                return null;
            }
            List split$default = StringsKt.split$default((CharSequence) y0, new char[]{' '}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, StringsKt.split$default((CharSequence) it.next(), new char[]{':'}, false, 0, 6, (Object) null));
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt.trim((String) it2.next()).toString());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList3.add(obj);
                }
            }
            f.a aVar = f.d;
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                f a = aVar.a((String) it3.next());
                if (a != null) {
                    return a;
                }
            }
            return null;
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
            return g.b("4WZr9GdfV2chh2YyVHc=");
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
            return g.b("gblt2bUV2chh2YyVHc==");
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
            return g.b("QZwlHdfV2chh2YyVHc==");
        }
    }

    static final class S extends Lambda implements Function0 {
        public static final S a = new S();

        S() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("hRXYk9FdwlWZjVmc");
        }
    }

    static final class T extends Lambda implements Function0 {
        public static final T a = new T();

        T() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("QZ15WZ2Vmc==");
        }
    }

    static final class U extends Lambda implements Function0 {
        public static final U a = new U();

        U() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("EGdhR2Xnl2c=");
        }
    }

    static final class V extends Lambda implements Function0 {
        public static final V a = new V();

        V() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("lJXd0Fmbnl2c");
        }
    }

    static final class W extends Lambda implements Function0 {
        public static final W a = new W();

        W() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("lJWayN2ciV3c");
        }
    }

    static final class X extends Lambda implements Function0 {
        public static final X a = new X();

        X() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("4WZr9Gd=");
        }
    }

    static final class Y extends Lambda implements Function0 {
        public static final Y a = new Y();

        Y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("QWaf52bpR3YhNnbhJHd=");
        }
    }

    static final class Z extends Lambda implements Function0 {
        public static final Z a = new Z();

        Z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("U2chh2YyVHcwBXYul2ajFmc0RmbhVGdhRWasFmd=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$a, reason: case insensitive filesystem */
    public static final class C5958a {
        private final String a;
        private final String b;
        private final String c;
        private final Double d;
        private final Map e;

        public C5958a(String str, String str2, String str3, Double d, Map map) {
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
            if (!(obj instanceof C5958a)) {
                return false;
            }
            C5958a c5958a = (C5958a) obj;
            return Intrinsics.areEqual(this.a, c5958a.a) && Intrinsics.areEqual(this.b, c5958a.b) && Intrinsics.areEqual(this.c, c5958a.c) && Intrinsics.areEqual((Object) this.d, (Object) c5958a.d) && Intrinsics.areEqual(this.e, c5958a.e);
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

    /* renamed from: io.bidmachine.analytics.internal.q.b$a0, reason: case insensitive filesystem */
    static final class C5959a0 extends Lambda implements Function0 {
        public static final C5959a0 a = new C5959a0();

        C5959a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("kVGdhRWasFmd");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$b, reason: collision with other inner class name */
    public interface InterfaceC1755b {
        void a(C5958a c5958a);
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$b0, reason: case insensitive filesystem */
    static final class C5960b0 extends Lambda implements Function0 {
        public static final C5960b0 a = new C5960b0();

        C5960b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set mo4828invoke() {
            z0 z0Var = b.p;
            return SetsKt.setOf((Object[]) new String[]{z0Var.J(), z0Var.S(), z0Var.F(), z0Var.M(), z0Var.A(), z0Var.w()});
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$c, reason: case insensitive filesystem */
    private static final class C5961c {
        private Object a;
        private Map b;

        public C5961c(Object obj, Map map) {
            this.a = obj;
            this.b = map;
        }

        public final Object a() {
            return this.a;
        }

        public final Map b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5961c)) {
                return false;
            }
            C5961c c5961c = (C5961c) obj;
            return Intrinsics.areEqual(this.a, c5961c.a) && Intrinsics.areEqual(this.b, c5961c.b);
        }

        public int hashCode() {
            Object obj = this.a;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Map map = this.b;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        public final void a(Object obj) {
            this.a = obj;
        }

        public final void a(Map map) {
            this.b = map;
        }

        public /* synthetic */ C5961c(Object obj, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : map);
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$c0, reason: case insensitive filesystem */
    static final class C5962c0 extends Lambda implements Function0 {
        public static final C5962c0 a = new C5962c0();

        C5962c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("zxWY1FXZ");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$d, reason: case insensitive filesystem */
    static final class C5963d extends Lambda implements Function0 {
        public static final C5963d a = new C5963d();

        C5963d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("4icllHbmNHcwFmLt92Y=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$d0, reason: case insensitive filesystem */
    static final class C5964d0 extends Lambda implements Function0 {
        public static final C5964d0 a = new C5964d0();

        C5964d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("k3YuVmcyV3Q0V2Z=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$e, reason: case insensitive filesystem */
    static final class C5965e extends Lambda implements Function0 {
        public static final C5965e a = new C5965e();

        C5965e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("EGdhRUZ15WZ2VmUkFkRB5icllHbmNHcwFmLt92Y=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$e0, reason: case insensitive filesystem */
    static final class C5966e0 extends Lambda implements Function0 {
        public static final C5966e0 a = new C5966e0();

        C5966e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("QZk92Q3EjM082cJl3YuVmcyV3Q0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$f, reason: case insensitive filesystem */
    static final class C5967f extends Lambda implements Function0 {
        public static final C5967f a = new C5967f();

        C5967f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("wcslWY0VGRlNXYoNmc1BlRB5icllHbmNHcwFmLt92Y==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$f0, reason: case insensitive filesystem */
    static final class C5968f0 extends Lambda implements Function0 {
        public static final C5968f0 a = new C5968f0();

        C5968f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("U2YuFGdz5WS0V2Z=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$g, reason: case insensitive filesystem */
    static final class C5969g extends Lambda implements Function0 {
        public static final C5969g a = new C5969g();

        C5969g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("IWaMJXZ5xmRzBHcB5icllHbmNHcwFmLt92Y=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$g0, reason: case insensitive filesystem */
    static final class C5970g0 extends Lambda implements Function0 {
        public static final C5970g0 a = new C5970g0();

        C5970g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("way92d0VmTu9Wa0FWakVWT0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$h, reason: case insensitive filesystem */
    static final class C5971h extends Lambda implements Function0 {
        public static final C5971h a = new C5971h();

        C5971h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("IXZwBXYydVZy9GdzlXZLZUQ=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$h0, reason: case insensitive filesystem */
    static final class C5972h0 extends Lambda implements Function0 {
        public static final C5972h0 a = new C5972h0();

        C5972h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("way92d0VmTu9Wa0FmepRXZu9WT0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$i, reason: case insensitive filesystem */
    static final class C5973i extends Lambda implements Function0 {
        public static final C5973i a = new C5973i();

        C5973i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("hRXYEVWduVmdlJFZBZUQ");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$i0, reason: case insensitive filesystem */
    static final class C5974i0 extends Lambda implements Function0 {
        public static final C5974i0 a = new C5974i0();

        C5974i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("U2YpJHU0V2Z=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$j, reason: case insensitive filesystem */
    static final class C5975j extends Lambda implements Function0 {
        public static final C5975j a = new C5975j();

        C5975j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("ilGTyVWesZ0cwBXQ");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$j0, reason: case insensitive filesystem */
    static final class C5976j0 extends Lambda implements Function0 {
        public static final C5976j0 a = new C5976j0();

        C5976j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("klEdjVHZvJHU0V2Z");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$k, reason: case insensitive filesystem */
    static final class C5977k extends Lambda implements Function0 {
        public static final C5977k a = new C5977k();

        C5977k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("QM05WZu9Gct92Y==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$k0, reason: case insensitive filesystem */
    static final class C5978k0 extends Lambda implements Function0 {
        public static final C5978k0 a = new C5978k0();

        C5978k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("gblt2bUV2chh2YyVHU0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$l, reason: case insensitive filesystem */
    static final class C5979l extends Lambda implements Function0 {
        public static final C5979l a = new C5979l();

        C5979l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("AN05WZu9Gct92Y==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$l0, reason: case insensitive filesystem */
    static final class C5980l0 extends Lambda implements Function0 {
        public static final C5980l0 a = new C5980l0();

        C5980l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("lBXeUV2chh2YyVHU0V2Z");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$m, reason: case insensitive filesystem */
    static final class C5981m extends Lambda implements Function0 {
        public static final C5981m a = new C5981m();

        C5981m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("Qew92Y==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$m0, reason: case insensitive filesystem */
    static final class C5982m0 extends Lambda implements Function0 {
        public static final C5982m0 a = new C5982m0();

        C5982m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("QZ15WZ2VmU0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$n, reason: case insensitive filesystem */
    static final class C5983n extends Lambda implements Function0 {
        public static final C5983n a = new C5983n();

        C5983n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("QHb1FmZlRWew92Y=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$n0, reason: case insensitive filesystem */
    static final class C5984n0 extends Lambda implements Function0 {
        public static final C5984n0 a = new C5984n0();

        C5984n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("gbvl2cyVmVrR2U0V2Z==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$o, reason: case insensitive filesystem */
    static final class C5985o extends Lambda implements Function0 {
        public static final C5985o a = new C5985o();

        C5985o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("AZ==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$o0, reason: case insensitive filesystem */
    static final class C5986o0 extends Lambda implements Function0 {
        public static final C5986o0 a = new C5986o0();

        C5986o0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("UWdsFmV0V2Z=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$p, reason: case insensitive filesystem */
    static final class C5987p extends Lambda implements Function0 {
        public static final C5987p a = new C5987p();

        C5987p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("zxWY1FXZ");
        }
    }

    static final class p0 extends Lambda implements Function0 {
        public static final p0 a = new p0();

        p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("UGZvNEazFGa=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$q, reason: case insensitive filesystem */
    static final class C5988q extends Lambda implements Function0 {
        public static final C5988q a = new C5988q();

        C5988q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("UGZvNEazFGa=");
        }
    }

    static final class q0 extends Lambda implements Function0 {
        public static final q0 a = new q0();

        q0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("cmbpJHdT9Gd=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$r, reason: case insensitive filesystem */
    static final class C5989r extends Lambda implements Function0 {
        public static final C5989r a = new C5989r();

        C5989r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("cmbpJHdT9Gd=");
        }
    }

    static final class r0 extends Lambda implements Function0 {
        public static final r0 a = new r0();

        r0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set mo4828invoke() {
            z0 z0Var = b.p;
            return SetsKt.setOf((Object[]) new String[]{z0Var.H(), z0Var.Q(), z0Var.w(), z0Var.B(), z0Var.U()});
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$s, reason: case insensitive filesystem */
    static final class C5990s extends Lambda implements Function0 {
        public static final C5990s a = new C5990s();

        C5990s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("klEdjVHZvJHc");
        }
    }

    static final class s0 extends Lambda implements Function0 {
        public static final s0 a = new s0();

        s0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set mo4828invoke() {
            z0 z0Var = b.p;
            return SetsKt.setOf((Object[]) new String[]{z0Var.C(), z0Var.D(), z0Var.r(), z0Var.u(), z0Var.M(), z0Var.V(), z0Var.Q(), z0Var.v(), z0Var.w(), z0Var.s(), z0Var.A(), z0Var.X(), z0Var.O(), z0Var.E(), z0Var.L(), z0Var.z()});
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$t, reason: case insensitive filesystem */
    static final class C5991t extends Lambda implements Function0 {
        public static final C5991t a = new C5991t();

        C5991t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("gblt2bUV2chh2YyVHc==");
        }
    }

    static final class t0 extends Lambda implements Function0 {
        public static final t0 a = new t0();

        t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set mo4828invoke() {
            z0 z0Var = b.p;
            return SetsKt.setOf((Object[]) new String[]{z0Var.W(), z0Var.u(), z0Var.x(), z0Var.T()});
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$u, reason: case insensitive filesystem */
    static final class C5992u extends Lambda implements Function0 {
        public static final C5992u a = new C5992u();

        C5992u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("AZp9FduVGdu92YfZWY==");
        }
    }

    static final class u0 extends Lambda implements Function0 {
        public static final u0 a = new u0();

        u0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set mo4828invoke() {
            z0 z0Var = b.p;
            return SetsKt.setOf((Object[]) new String[]{z0Var.X(), z0Var.V(), z0Var.O(), z0Var.E(), z0Var.C(), z0Var.D(), z0Var.M(), z0Var.r()});
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$v, reason: case insensitive filesystem */
    static final class C5993v extends Lambda implements Function0 {
        public static final C5993v a = new C5993v();

        C5993v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("k3YuVmcyV3YfZWY=");
        }
    }

    static final class v0 extends Lambda implements Function0 {
        public static final v0 a = new v0();

        v0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo4828invoke() {
            f fVar = new f(6, 15, 1);
            z0 z0Var = b.p;
            return MapsKt.mapOf(TuplesKt.to(fVar, CollectionsKt.listOf((Object[]) new String[]{z0Var.k(), z0Var.o(), z0Var.d0()})), TuplesKt.to(new f(6, 15, 2), CollectionsKt.listOf((Object[]) new String[]{z0Var.o(), z0Var.h(), z0Var.i(), z0Var.j0()})), TuplesKt.to(new f(6, 15, 3), CollectionsKt.listOf((Object[]) new String[]{z0Var.o(), z0Var.h(), z0Var.i(), z0Var.j0()})), TuplesKt.to(new f(6, 16, 0), CollectionsKt.listOf((Object[]) new String[]{z0Var.m(), z0Var.o(), z0Var.e0()})), TuplesKt.to(new f(6, 16, 1), CollectionsKt.listOf((Object[]) new String[]{z0Var.o(), z0Var.k(), z0Var.e0()})), TuplesKt.to(new f(6, 16, 2), CollectionsKt.listOf((Object[]) new String[]{z0Var.o(), z0Var.k(), z0Var.e0()})), TuplesKt.to(new f(6, 17, 0), CollectionsKt.listOf((Object[]) new String[]{z0Var.j(), z0Var.o(), z0Var.f()})), TuplesKt.to(new f(6, 17, 1), CollectionsKt.listOf((Object[]) new String[]{z0Var.o(), z0Var.j(), z0Var.e0()})), TuplesKt.to(new f(6, 17, 2), CollectionsKt.listOf((Object[]) new String[]{z0Var.n(), z0Var.o(), z0Var.j0()})), TuplesKt.to(new f(6, 17, 3), CollectionsKt.listOf((Object[]) new String[]{z0Var.n(), z0Var.n(), z0Var.e0()})), TuplesKt.to(new f(6, 17, 4), CollectionsKt.listOf((Object[]) new String[]{z0Var.j(), z0Var.m(), z0Var.d0()})), TuplesKt.to(new f(6, 17, 5), CollectionsKt.listOf((Object[]) new String[]{z0Var.j(), z0Var.k(), z0Var.d0()})), TuplesKt.to(new f(6, 17, 6), CollectionsKt.listOf((Object[]) new String[]{z0Var.j(), z0Var.k(), z0Var.d0()})), TuplesKt.to(new f(6, 18, 0), CollectionsKt.listOf((Object[]) new String[]{z0Var.k(), z0Var.m(), z0Var.d0()})), TuplesKt.to(new f(6, 18, 1), CollectionsKt.listOf((Object[]) new String[]{z0Var.k(), z0Var.k(), z0Var.d0()})), TuplesKt.to(new f(7, 0, 0), CollectionsKt.listOf((Object[]) new String[]{z0Var.e(), z0Var.g(), z0Var.l()})));
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$w, reason: case insensitive filesystem */
    static final class C5994w extends Lambda implements Function0 {
        public static final C5994w a = new C5994w();

        C5994w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("U2YpJHcfZWY=");
        }
    }

    static final class w0 extends Lambda implements Function0 {
        public static final w0 a = new w0();

        w0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("FVlTFZVRSRUQ");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$x, reason: case insensitive filesystem */
    static final class C5995x extends Lambda implements Function0 {
        public static final C5995x a = new C5995x();

        C5995x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("U2chh2YyVHcfZWY=");
        }
    }

    static final class x0 extends Lambda implements Function0 {
        public static final x0 a = new x0();

        x0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("40TJRVQElETBZ1XFNVQINkUVB1XMFUVOFUT=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$y, reason: case insensitive filesystem */
    static final class C5996y extends Lambda implements Function0 {
        public static final C5996y a = new C5996y();

        C5996y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("QZ15WZ2VmcfZWY==");
        }
    }

    static final class y0 extends Lambda implements Function0 {
        public static final y0 a = new y0();

        y0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("UEVBRUSMFkVfV0UBh0QSVFU=");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.q.b$z, reason: case insensitive filesystem */
    static final class C5997z extends Lambda implements Function0 {
        public static final C5997z a = new C5997z();

        C5997z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return g.b("k3YuVmcyV3Y=");
        }
    }

    public static final class z0 {
        public /* synthetic */ z0(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set Y() {
            return (Set) b.J0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set o0() {
            return (Set) b.I0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set p0() {
            return (Set) b.G0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set q0() {
            return (Set) b.H0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set r0() {
            return (Set) b.K0.getValue();
        }

        public final String A() {
            return (String) b.T.getValue();
        }

        public final String B() {
            return (String) b.e0.getValue();
        }

        public final String C() {
            return (String) b.I.getValue();
        }

        public final String D() {
            return (String) b.K.getValue();
        }

        public final String E() {
            return (String) b.X.getValue();
        }

        public final String F() {
            return (String) b.j0.getValue();
        }

        public final String G() {
            return (String) b.k0.getValue();
        }

        public final String H() {
            return (String) b.d0.getValue();
        }

        public final String I() {
            return (String) b.o0.getValue();
        }

        public final String J() {
            return (String) b.g0.getValue();
        }

        public final String K() {
            return (String) b.h0.getValue();
        }

        public final String L() {
            return (String) b.Y.getValue();
        }

        public final String M() {
            return (String) b.M.getValue();
        }

        public final String N() {
            return (String) b.N.getValue();
        }

        public final String O() {
            return (String) b.W.getValue();
        }

        public final String P() {
            return (String) b.n0.getValue();
        }

        public final String Q() {
            return (String) b.P.getValue();
        }

        public final String R() {
            return (String) b.l0.getValue();
        }

        public final String S() {
            return (String) b.i0.getValue();
        }

        public final String T() {
            return (String) b.c0.getValue();
        }

        public final String U() {
            return (String) b.f0.getValue();
        }

        public final String V() {
            return (String) b.O.getValue();
        }

        public final String W() {
            return (String) b.a0.getValue();
        }

        public final String X() {
            return (String) b.V.getValue();
        }

        public final String Z() {
            return (String) b.v.getValue();
        }

        public final String a0() {
            return (String) b.F.getValue();
        }

        public final String b0() {
            return (String) b.B.getValue();
        }

        public final String c0() {
            return (String) b.u.getValue();
        }

        public final String d0() {
            return (String) b.y.getValue();
        }

        public final String e0() {
            return (String) b.A.getValue();
        }

        public final String f() {
            return (String) b.B0.getValue();
        }

        public final String f0() {
            return (String) b.E.getValue();
        }

        public final String g() {
            return (String) b.E0.getValue();
        }

        public final String g0() {
            return (String) b.H.getValue();
        }

        public final String h() {
            return (String) b.x0.getValue();
        }

        public final String h0() {
            return (String) b.G.getValue();
        }

        public final String i() {
            return (String) b.y0.getValue();
        }

        public final String i0() {
            return (String) b.D.getValue();
        }

        public final String j() {
            return (String) b.A0.getValue();
        }

        public final String j0() {
            return (String) b.C.getValue();
        }

        public final String k() {
            return (String) b.v0.getValue();
        }

        public final String k0() {
            return (String) b.t.getValue();
        }

        public final String l() {
            return (String) b.F0.getValue();
        }

        public final String l0() {
            return (String) b.z.getValue();
        }

        public final String m() {
            return (String) b.z0.getValue();
        }

        public final String m0() {
            return (String) b.w.getValue();
        }

        public final String n() {
            return (String) b.C0.getValue();
        }

        public final String n0() {
            return (String) b.x.getValue();
        }

        public final String o() {
            return (String) b.w0.getValue();
        }

        public final String p() {
            return (String) b.q0.getValue();
        }

        public final String q() {
            return (String) b.p0.getValue();
        }

        public final String r() {
            return (String) b.J.getValue();
        }

        public final String s() {
            return (String) b.S.getValue();
        }

        public final Map s0() {
            return (Map) b.L0.getValue();
        }

        public final String t() {
            return (String) b.U.getValue();
        }

        public final String t0() {
            return (String) b.t0.getValue();
        }

        public final String u() {
            return (String) b.L.getValue();
        }

        public final String u0() {
            return (String) b.r0.getValue();
        }

        public final String v() {
            return (String) b.Q.getValue();
        }

        public final String v0() {
            return (String) b.s0.getValue();
        }

        public final String w() {
            return (String) b.R.getValue();
        }

        public final String x() {
            return (String) b.b0.getValue();
        }

        public final String y() {
            return (String) b.m0.getValue();
        }

        public final String z() {
            return (String) b.Z.getValue();
        }

        private z0() {
        }

        public final String a() {
            return (String) b.u0.getValue();
        }

        public final String b() {
            return (String) b.q.getValue();
        }

        public final String c() {
            return (String) b.r.getValue();
        }

        public final String d() {
            return (String) b.s.getValue();
        }

        public final String e() {
            return (String) b.D0.getValue();
        }
    }

    public b(io.bidmachine.analytics.internal.J.b bVar) {
        Object obj;
        z0 z0Var;
        Class a;
        this.a = bVar;
        e eVar = new e();
        this.f = eVar;
        this.g = new c(eVar, 0, 0, 0, 14, null);
        this.h = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.i = MapsKt.emptyMap();
        this.j = LazyKt.lazy(new J0());
        this.k = LazyKt.lazy(new M0());
        try {
            z0Var = p;
            a = eVar.a(z0Var.d());
        } catch (Throwable unused) {
        }
        if (a == null) {
            obj = null;
            this.l = obj;
            this.m = LazyKt.lazy(new L0());
            this.n = LazyKt.lazy(new N0());
            this.o = LazyKt.lazy(new O0());
        }
        obj = e.a(eVar, a, z0Var.c0(), (List) null, 4, (Object) null);
        this.l = obj;
        this.m = LazyKt.lazy(new L0());
        this.n = LazyKt.lazy(new N0());
        this.o = LazyKt.lazy(new O0());
    }

    private final synchronized boolean D0() {
        boolean z2;
        try {
            if (A0()) {
                z2 = B0();
            } else {
                E0();
                z2 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    private final Class w0() {
        return (Class) this.j.getValue();
    }

    private final Class x0() {
        return (Class) this.k.getValue();
    }

    public final boolean A0() {
        return (this.d.isEmpty() && this.e.isEmpty()) ? false : true;
    }

    public final synchronized boolean B0() {
        if (this.b) {
            return true;
        }
        Object obj = this.l;
        if (obj == null) {
            return false;
        }
        this.b = b(obj);
        return this.b;
    }

    public final boolean C0() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final synchronized void E0() {
        Object m8023constructorimpl;
        try {
            B0 b02 = this.c;
            if (b02 != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(Boolean.valueOf(b02.a().remove(b02.b())));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                Result.m8022boximpl(m8023constructorimpl);
            }
            this.c = null;
            this.b = false;
            this.h.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String y0() {
        return (String) this.n.getValue();
    }

    public final f z0() {
        return (f) this.o.getValue();
    }

    private final A0.a d(Object obj) {
        String str;
        String obj2;
        C5961c i = i(obj);
        Object a = i.a();
        if (a == null) {
            return null;
        }
        e eVar = this.f;
        z0 z0Var = p;
        Object a2 = e.a(eVar, a, z0Var.d0(), (List) null, 4, (Object) null);
        if (a2 != null) {
            Object a3 = e.a(this.f, a2, z0Var.l0(), (List) null, 4, (Object) null);
            if (a3 == null || (obj2 = a3.toString()) == null) {
                obj2 = a2.toString();
            }
            str = obj2;
        } else {
            str = null;
        }
        Object a4 = e.a(this.f, a, z0Var.e0(), (List) null, 4, (Object) null);
        String obj3 = a4 != null ? a4.toString() : null;
        Object a5 = e.a(this.f, a, z0Var.b0(), (List) null, 4, (Object) null);
        String obj4 = a5 != null ? a5.toString() : null;
        Object a6 = e.a(this.f, a, z0Var.j0(), (List) null, 4, (Object) null);
        Number number = a6 instanceof Number ? (Number) a6 : null;
        Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
        Map b = i.b();
        if (b == null) {
            b = MapsKt.emptyMap();
        }
        return new A0.a(new C5958a(obj3, str, obj4, valueOf, b));
    }

    private final A0.C1754b e(Object obj) {
        G0 j = j(obj);
        A0.C1754b a = a(j);
        return a == null ? b(j, p.Y(), true) : a;
    }

    private final A0.C1754b f(Object obj) {
        G0 j = j(obj);
        A0.C1754b b = b(j, p.r0(), false);
        return b == null ? a(j) : b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A0 g(Object obj) {
        H0 h = h(obj);
        int i = h == null ? -1 : I0.$EnumSwitchMapping$0[h.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return d(obj);
        }
        if (i == 2) {
            return e(obj);
        }
        if (i == 3) {
            return f(obj);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final H0 h(Object obj) {
        String upperCase = obj.toString().toUpperCase(Locale.ROOT);
        z0 z0Var = p;
        if (StringsKt.startsWith$default(upperCase, z0Var.u0(), false, 2, (Object) null)) {
            return H0.MANUAL_PURCHASE_VALIDATION;
        }
        if (StringsKt.startsWith$default(upperCase, z0Var.v0(), false, 2, (Object) null)) {
            return H0.PURCHASE_VALIDATE;
        }
        if (StringsKt.startsWith$default(upperCase, z0Var.t0(), false, 2, (Object) null)) {
            return H0.AD_REVENUE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C5961c i(Object obj) {
        Object obj2;
        C5961c c5961c = new C5961c(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        a(obj, c5961c);
        for (Field field : this.f.b(obj.getClass())) {
            if (!Modifier.isStatic(field.getModifiers())) {
                try {
                    field.setAccessible(true);
                    obj2 = field.get(obj);
                } catch (Throwable unused) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    a(obj2, c5961c);
                }
            }
        }
        return c5961c;
    }

    private final G0 j(Object obj) {
        Object m8023constructorimpl;
        e eVar;
        Object m8023constructorimpl2;
        boolean a;
        int i;
        boolean a2;
        int i2;
        boolean a3;
        int i3;
        boolean a4;
        G0 g02 = new G0(null, null, 0, null, 0, false, 63, null);
        Class x02 = x0();
        ArrayDeque arrayDeque = new ArrayDeque();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        arrayDeque.add(TuplesKt.to(obj, 0));
        identityHashMap.put(obj, Boolean.TRUE);
        int i4 = 0;
        while (!arrayDeque.isEmpty() && i4 < 600) {
            Pair pair = (Pair) arrayDeque.removeFirst();
            Object component1 = pair.component1();
            int intValue = ((Number) pair.component2()).intValue();
            i4++;
            a(component1, g02, x02);
            if (intValue < 4) {
                c cVar = this.g;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (component1 instanceof Map) {
                        Sequence asSequence = CollectionsKt.asSequence(((Map) component1).values());
                        i3 = cVar.d;
                        for (Object obj2 : SequencesKt.toList(SequencesKt.filterNotNull(SequencesKt.take(asSequence, i3)))) {
                            a4 = cVar.a(obj2);
                            if (!a4 && obj2 != null && identityHashMap.put(obj2, Boolean.TRUE) == null) {
                                arrayDeque.add(TuplesKt.to(obj2, Integer.valueOf(intValue + 1)));
                            }
                        }
                    } else if (component1 instanceof Iterable) {
                        Sequence asSequence2 = CollectionsKt.asSequence((Iterable) component1);
                        i2 = cVar.d;
                        for (Object obj3 : SequencesKt.toList(SequencesKt.filterNotNull(SequencesKt.take(asSequence2, i2)))) {
                            a3 = cVar.a(obj3);
                            if (!a3 && obj3 != null && identityHashMap.put(obj3, Boolean.TRUE) == null) {
                                arrayDeque.add(TuplesKt.to(obj3, Integer.valueOf(intValue + 1)));
                            }
                        }
                    } else if (component1 instanceof Object[]) {
                        Sequence asSequence3 = ArraysKt.asSequence((Object[]) component1);
                        i = cVar.d;
                        for (Object obj4 : SequencesKt.filterNotNull(SequencesKt.take(asSequence3, i))) {
                            a2 = cVar.a(obj4);
                            if (!a2 && obj4 != null && identityHashMap.put(obj4, Boolean.TRUE) == null) {
                                arrayDeque.add(TuplesKt.to(obj4, Integer.valueOf(intValue + 1)));
                            }
                        }
                    } else {
                        eVar = cVar.a;
                        for (Field field : eVar.b(component1.getClass())) {
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                m8023constructorimpl2 = Result.m8023constructorimpl(field.get(component1));
                            } catch (Throwable th) {
                                Result.Companion companion3 = Result.INSTANCE;
                                m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m8028isFailureimpl(m8023constructorimpl2)) {
                                m8023constructorimpl2 = null;
                            }
                            if (m8023constructorimpl2 != null) {
                                a = cVar.a(m8023constructorimpl2);
                                if (!a && identityHashMap.put(m8023constructorimpl2, Boolean.TRUE) == null) {
                                    arrayDeque.add(TuplesKt.to(m8023constructorimpl2, Integer.valueOf(intValue + 1)));
                                }
                            }
                        }
                    }
                    m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th2));
                }
                Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            }
        }
        return g02;
    }

    private final D0 k(Object obj) {
        List split$default;
        D0 b;
        D0 b2;
        f z02 = z0();
        if (z02 == null) {
            return null;
        }
        List list = (List) p.s0().get(z02);
        if (list == null) {
            list = (List) this.i.get(z02);
        }
        if (list != null && (b2 = b(obj, list)) != null) {
            return b2;
        }
        String a = io.bidmachine.analytics.internal.J.b.a(this.a, "af" + z02, null, 2, null);
        if (a != null && (split$default = StringsKt.split$default((CharSequence) a, new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : split$default) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList == null || (b = b(obj, arrayList)) == null) {
                return null;
            }
            return b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(Object obj) {
        return b((Class) (obj != null ? obj.getClass() : null));
    }

    private final Map c(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            linkedHashMap.put(String.valueOf(key), entry.getValue());
        }
        return linkedHashMap;
    }

    public final void b(Map map) {
        this.i = map;
    }

    public final void b(InterfaceC1755b interfaceC1755b) {
        this.d.remove(interfaceC1755b);
        D0();
    }

    public final boolean a(InterfaceC1755b interfaceC1755b) {
        this.d.add(interfaceC1755b);
        return D0();
    }

    private static final class D0 {
        private final Object a;
        private final Field b;
        private final List c;
        private final Class d;
        private final int e;
        private final List f;

        public D0(Object obj, Field field, List list, Class cls, int i, List list2) {
            this.a = obj;
            this.b = field;
            this.c = list;
            this.d = cls;
            this.e = i;
            this.f = list2;
        }

        public final List a() {
            return this.f;
        }

        public final Class b() {
            return this.d;
        }

        public final List c() {
            return this.c;
        }

        public final int d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof D0)) {
                return false;
            }
            D0 d0 = (D0) obj;
            return Intrinsics.areEqual(this.a, d0.a) && Intrinsics.areEqual(this.b, d0.b) && Intrinsics.areEqual(this.c, d0.c) && Intrinsics.areEqual(this.d, d0.d) && this.e == d0.e && Intrinsics.areEqual(this.f, d0.f);
        }

        public int hashCode() {
            int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e)) * 31;
            List list = this.f;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ D0(Object obj, Field field, List list, Class cls, int i, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, field, list, cls, i, (i2 & 32) != 0 ? null : list2);
        }
    }

    public final void b(F0 f02) {
        this.e.remove(f02);
        D0();
    }

    public final boolean a(F0 f02) {
        this.e.add(f02);
        return D0();
    }

    private final boolean b(Object obj) {
        ArrayList arrayList = new ArrayList();
        D0 k = k(obj);
        if (k != null) {
            arrayList.add(k);
        } else {
            a(obj, arrayList);
        }
        return a((List) arrayList);
    }

    private final List a(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return CollectionsKt.listOf(str2);
        }
        return CollectionsKt.plus(StringsKt.split$default((CharSequence) str, new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(Object obj, List list) {
        List list2;
        Class a;
        int i;
        Object obj2;
        for (Pair pair : this.g.a(obj, StringUtils.COMMA, new K0())) {
            Object component1 = pair.component1();
            String str = (String) pair.component2();
            for (Field field : this.f.b(component1.getClass())) {
                if (!Modifier.isStatic(field.getModifiers()) && List.class.isAssignableFrom(field.getType())) {
                    Object obj3 = null;
                    try {
                        obj2 = field.get(component1);
                    } catch (Throwable unused) {
                    }
                    if (TypeIntrinsics.isMutableList(obj2)) {
                        list2 = (List) obj2;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (next != null && c(next)) {
                                    obj3 = next;
                                    break;
                                }
                            }
                            if (obj3 != null && (a = a((Class) obj3.getClass())) != null && b(a)) {
                                if (list2.isEmpty()) {
                                    i = 0;
                                } else {
                                    int i2 = 0;
                                    for (Object obj4 : list2) {
                                        if (obj4 != null && a.isAssignableFrom(obj4.getClass()) && (i2 = i2 + 1) < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                    }
                                    i = i2;
                                }
                                list.add(new D0(component1, field, list2, a, i, a(str, field.getName())));
                            }
                        }
                    }
                    list2 = null;
                    if (list2 != null) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final D0 b(Object obj, List list) {
        List list2;
        Object obj2;
        Class a;
        Object obj3;
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i = 0;
        Object obj4 = obj;
        for (int i2 = 0; i2 < lastIndex; i2++) {
            obj4 = this.f.a(obj4.getClass(), obj4, (String) list.get(i2), false);
            if (obj4 == null) {
                return null;
            }
        }
        Field a2 = this.f.a((Class) obj4.getClass(), (String) CollectionsKt.last(list), false);
        if (a2 == null || !List.class.isAssignableFrom(a2.getType())) {
            return null;
        }
        try {
            obj3 = a2.get(obj4);
        } catch (Throwable unused) {
        }
        if (TypeIntrinsics.isMutableList(obj3)) {
            list2 = (List) obj3;
            if (list2 != null) {
                return null;
            }
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (obj2 != null && c(obj2)) {
                    break;
                }
            }
            if (obj2 == null || (a = a((Class) obj2.getClass())) == null || !b(a)) {
                return null;
            }
            if (!list2.isEmpty()) {
                for (Object obj5 : list2) {
                    if (obj5 != null && a.isAssignableFrom(obj5.getClass()) && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            int i3 = i;
            if (i3 <= 0) {
                return null;
            }
            return new D0(obj4, a2, list2, a, i3, null, 32, null);
        }
        list2 = null;
        if (list2 != null) {
        }
    }

    private final Map a(Map map) {
        String obj;
        String lowerCase;
        String replace$default;
        if (map == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && (obj = key.toString()) != null && (lowerCase = obj.toLowerCase(Locale.ROOT)) != null && (replace$default = StringsKt.replace$default(lowerCase, '-', '_', false, 4, (Object) null)) != null) {
                z0 z0Var = p;
                if (Intrinsics.areEqual(replace$default, z0Var.M()) ? true : Intrinsics.areEqual(replace$default, z0Var.N())) {
                    linkedHashMap.put(z0Var.M(), value);
                } else if (Intrinsics.areEqual(replace$default, z0Var.C()) ? true : Intrinsics.areEqual(replace$default, z0Var.r())) {
                    linkedHashMap.put(z0Var.C(), value);
                } else if (Intrinsics.areEqual(replace$default, z0Var.D())) {
                    String a = a(value);
                    if (a != null) {
                        linkedHashMap.put(z0Var.C(), a);
                    }
                } else if (Intrinsics.areEqual(replace$default, z0Var.O()) ? true : Intrinsics.areEqual(replace$default, z0Var.E())) {
                    linkedHashMap.put(z0Var.O(), value);
                } else if (Intrinsics.areEqual(replace$default, z0Var.A()) ? true : Intrinsics.areEqual(replace$default, z0Var.t())) {
                    linkedHashMap.put(z0Var.A(), value);
                } else if (Intrinsics.areEqual(replace$default, z0Var.w()) ? true : Intrinsics.areEqual(replace$default, z0Var.s())) {
                    linkedHashMap.put(z0Var.w(), value);
                } else if (Intrinsics.areEqual(replace$default, z0Var.J()) ? true : Intrinsics.areEqual(replace$default, z0Var.K())) {
                    linkedHashMap.put(z0Var.J(), value);
                } else if (Intrinsics.areEqual(replace$default, z0Var.R())) {
                    linkedHashMap.put(z0Var.J(), value);
                    if (value instanceof String) {
                        a(linkedHashMap, (String) value);
                    }
                } else if (Intrinsics.areEqual(replace$default, z0Var.S())) {
                    linkedHashMap.put(z0Var.S(), value);
                } else if (Intrinsics.areEqual(replace$default, z0Var.F()) ? true : Intrinsics.areEqual(replace$default, z0Var.G())) {
                    linkedHashMap.put(z0Var.F(), value);
                } else if (Intrinsics.areEqual(replace$default, z0Var.y())) {
                    if (value instanceof Map) {
                        linkedHashMap.putAll(a((Map) value));
                    }
                } else if (Intrinsics.areEqual(replace$default, z0Var.P())) {
                    if (value instanceof Map) {
                        linkedHashMap.putAll(a((Map) value));
                    }
                } else if (Intrinsics.areEqual(replace$default, z0Var.I()) && (value instanceof Map)) {
                    linkedHashMap.putAll(a((Map) value));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final A0.C1754b a(G0 g02) {
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        String obj;
        Object a;
        String str3;
        String str4;
        String str5;
        String obj2;
        Object f = g02.f();
        if (f == null) {
            return null;
        }
        e eVar = this.f;
        z0 z0Var = p;
        Object a2 = e.a(eVar, f, z0Var.i0(), (List) null, 4, (Object) null);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map c = g02.c();
        if (c != null) {
            linkedHashMap2.putAll(c(c));
        }
        linkedHashMap2.putAll(a(g02.c()));
        Object a3 = e.a(this.f, f, z0Var.f0(), (List) null, 4, (Object) null);
        String obj3 = a3 != null ? a3.toString() : null;
        Object a4 = e.a(this.f, f, z0Var.a0(), (List) null, 4, (Object) null);
        String obj4 = a4 != null ? a4.toString() : null;
        if (a2 != null) {
            linkedHashMap = linkedHashMap2;
            Object a5 = e.a(this.f, a2, z0Var.l0(), (List) null, 4, (Object) null);
            if (a5 == null || (obj2 = a5.toString()) == null) {
                obj2 = a2.toString();
            }
            str = obj2;
        } else {
            linkedHashMap = linkedHashMap2;
            str = null;
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        Object a6 = e.a(this.f, f, z0Var.h0(), (List) null, 4, (Object) null);
        if (a6 == null || (obj = a6.toString()) == null) {
            Object remove = linkedHashMap3.remove(z0Var.M());
            if (remove == null) {
                str2 = null;
                a = e.a(this.f, f, z0Var.g0(), (List) null, 4, (Object) null);
                if (a != null || (r1 = a.toString()) == null) {
                    String a7 = a(linkedHashMap3.remove(z0Var.C()));
                }
                String str6 = a7;
                if (str != null) {
                    Object remove2 = linkedHashMap3.remove(z0Var.O());
                    str3 = remove2 != null ? remove2.toString() : null;
                } else {
                    str3 = str;
                }
                if (obj3 != null) {
                    Object remove3 = linkedHashMap3.remove(z0Var.A());
                    String obj5 = remove3 != null ? remove3.toString() : null;
                    if (obj5 == null) {
                        Object remove4 = linkedHashMap3.remove(z0Var.t());
                        if (remove4 != null) {
                            obj5 = remove4.toString();
                        } else {
                            str4 = null;
                        }
                    }
                    str4 = obj5;
                } else {
                    str4 = obj3;
                }
                if (obj4 != null) {
                    Object remove5 = linkedHashMap3.remove(z0Var.w());
                    String obj6 = remove5 != null ? remove5.toString() : null;
                    if (obj6 == null) {
                        Object remove6 = linkedHashMap3.remove(z0Var.s());
                        if (remove6 != null) {
                            obj6 = remove6.toString();
                        } else {
                            str5 = null;
                        }
                    }
                    str5 = obj6;
                } else {
                    str5 = obj4;
                }
                Object remove7 = linkedHashMap3.remove(z0Var.J());
                String obj7 = remove7 == null ? remove7.toString() : null;
                Object remove8 = linkedHashMap3.remove(z0Var.S());
                String obj8 = remove8 == null ? remove8.toString() : null;
                Object remove9 = linkedHashMap3.remove(z0Var.F());
                return new A0.C1754b(new E0(str2, str6, str3, str4, str5, obj7, obj8, remove9 != null ? remove9.toString() : null, linkedHashMap3));
            }
            obj = remove.toString();
        }
        str2 = obj;
        a = e.a(this.f, f, z0Var.g0(), (List) null, 4, (Object) null);
        if (a != null) {
        }
        String a72 = a(linkedHashMap3.remove(z0Var.C()));
        String str62 = a72;
        if (str != null) {
        }
        if (obj3 != null) {
        }
        if (obj4 != null) {
        }
        Object remove72 = linkedHashMap3.remove(z0Var.J());
        if (remove72 == null) {
        }
        Object remove82 = linkedHashMap3.remove(z0Var.S());
        if (remove82 == null) {
        }
        Object remove92 = linkedHashMap3.remove(z0Var.F());
        return new A0.C1754b(new E0(str2, str62, str3, str4, str5, obj7, obj8, remove92 != null ? remove92.toString() : null, linkedHashMap3));
    }

    private final void a(Map map, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        z0 z0Var = p;
        String optString = jSONObject.optString(z0Var.q(), "");
        if (optString.length() <= 0) {
            optString = null;
        }
        String optString2 = jSONObject.optString(z0Var.p(), "");
        String str2 = optString2.length() > 0 ? optString2 : null;
        if (optString != null && !map.containsKey(z0Var.M())) {
            map.put(z0Var.M(), optString);
        }
        if (str2 == null || map.containsKey(z0Var.C())) {
            return;
        }
        map.put(z0Var.C(), str2);
    }

    private final Map a(G0 g02, Set set, boolean z2) {
        Map a = g02.a();
        if (a == null) {
            return null;
        }
        int b = g02.b();
        if (b < 2 && (b < 1 || !g02.e())) {
            return null;
        }
        int a2 = a(a, set);
        if (z2 && a2 == 0) {
            return null;
        }
        return c(a);
    }

    private final void a(Object obj, C5961c c5961c) {
        Object obj2;
        Class w02 = w0();
        if (w02 != null && b((Class) obj.getClass())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj3 = null;
            for (Field field : this.f.b(obj.getClass())) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        field.setAccessible(true);
                        obj2 = field.get(obj);
                    } catch (Throwable unused) {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        if (w02.isInstance(obj2)) {
                            obj3 = obj2;
                        } else if (obj2 instanceof Map) {
                            a(linkedHashMap, (Map) obj2, 255);
                        }
                    }
                }
            }
            if (obj3 == null) {
                return;
            }
            if (c5961c.a() == null) {
                c5961c.a(obj3);
            } else if (c5961c.a() != obj3) {
                return;
            }
            if (c5961c.b() == null && !linkedHashMap.isEmpty()) {
                c5961c.a((Map) linkedHashMap);
            }
        }
    }

    private final A0.C1754b b(G0 g02, Set set, boolean z2) {
        String obj;
        String a;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        String obj6;
        String obj7;
        String obj8;
        Map a2 = a(g02, set, z2);
        if (a2 == null) {
            return null;
        }
        Map a3 = a(a2);
        z0 z0Var = p;
        Object obj9 = a3.get(z0Var.M());
        if (obj9 == null || (obj = obj9.toString()) == null) {
            Object obj10 = a2.get(z0Var.M());
            if (obj10 != null) {
                obj = obj10.toString();
            } else {
                Object obj11 = a2.get(z0Var.N());
                obj = obj11 != null ? obj11.toString() : null;
            }
        }
        Object obj12 = a3.get(z0Var.C());
        if (obj12 == null || (a = obj12.toString()) == null) {
            Object obj13 = a2.get(z0Var.C());
            if (obj13 != null) {
                a = obj13.toString();
            } else {
                a = a(a2.get(z0Var.D()));
                if (a == null) {
                    Object obj14 = a2.get(z0Var.r());
                    a = obj14 != null ? obj14.toString() : null;
                }
            }
        }
        Object obj15 = a3.get(z0Var.O());
        if (obj15 == null || (obj2 = obj15.toString()) == null) {
            Object obj16 = a2.get(z0Var.O());
            if (obj16 != null) {
                obj2 = obj16.toString();
            } else {
                Object obj17 = a2.get(z0Var.E());
                obj2 = obj17 != null ? obj17.toString() : null;
            }
        }
        Object obj18 = a3.get(z0Var.A());
        if (obj18 == null || (obj3 = obj18.toString()) == null) {
            Object obj19 = a2.get(z0Var.A());
            if (obj19 != null) {
                obj3 = obj19.toString();
            } else {
                Object obj20 = a2.get(z0Var.v());
                obj3 = obj20 != null ? obj20.toString() : null;
            }
        }
        Object obj21 = a3.get(z0Var.w());
        if (obj21 == null || (obj4 = obj21.toString()) == null) {
            Object obj22 = a2.get(z0Var.w());
            if (obj22 != null) {
                obj4 = obj22.toString();
            } else {
                Object obj23 = a2.get(z0Var.s());
                obj4 = obj23 != null ? obj23.toString() : null;
            }
        }
        Object obj24 = a3.get(z0Var.J());
        if (obj24 == null || (obj5 = obj24.toString()) == null) {
            Object obj25 = a2.get(z0Var.J());
            obj5 = obj25 != null ? obj25.toString() : null;
        }
        Object obj26 = a3.get(z0Var.S());
        if (obj26 == null || (obj6 = obj26.toString()) == null) {
            Object obj27 = a2.get(z0Var.S());
            obj6 = obj27 != null ? obj27.toString() : null;
        }
        Object obj28 = a3.get(z0Var.F());
        if (obj28 == null || (obj8 = obj28.toString()) == null) {
            Object obj29 = a2.get(z0Var.F());
            obj7 = obj29 != null ? obj29.toString() : null;
        } else {
            obj7 = obj8;
        }
        return new A0.C1754b(new E0(obj, a, obj2, obj3, obj4, obj5, obj6, obj7, a2));
    }

    private final void a(Object obj, G0 g02, Class cls) {
        if (obj == null) {
            return;
        }
        if (cls != null && g02.f() == null && cls.isInstance(obj)) {
            g02.a(obj);
        }
        if (obj instanceof String) {
            String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
            if (g02.e() || !p.q0().contains(lowerCase)) {
                return;
            }
            g02.a(true);
            return;
        }
        if (obj instanceof Map) {
            a((Map) obj, g02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(Class cls) {
        return cls != null && StringsKt.startsWith$default(cls.getName(), p.a(), false, 2, (Object) null);
    }

    private final void a(Map map, Map map2, int i) {
        if (map2.isEmpty() || map.size() >= i) {
            return;
        }
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String str = key instanceof String ? (String) key : null;
            if (str != null && value != null && !map.containsKey(str)) {
                map.put(str, value);
                if (map.size() >= i) {
                    return;
                }
            }
        }
    }

    private final void a(Map map, G0 g02) {
        String str;
        String obj;
        String lowerCase;
        String obj2;
        if (map.isEmpty()) {
            return;
        }
        if (!g02.e()) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                String str2 = "";
                if (key == null || (obj2 = key.toString()) == null || (str = obj2.toLowerCase(Locale.ROOT)) == null) {
                    str = "";
                }
                if (value != null && (obj = value.toString()) != null && (lowerCase = obj.toLowerCase(Locale.ROOT)) != null) {
                    str2 = lowerCase;
                }
                z0 z0Var = p;
                if (z0Var.q0().contains(str) || z0Var.q0().contains(str2)) {
                    g02.a(true);
                    break;
                }
            }
        }
        if (map.size() <= 256) {
            z0 z0Var2 = p;
            int a = a(map, z0Var2.p0());
            if (a > g02.b()) {
                g02.a(a);
                g02.a(map);
            }
            int a2 = a(map, z0Var2.o0());
            if (a2 < 1 || a2 <= g02.d()) {
                return;
            }
            g02.b(a2);
            g02.b(map);
        }
    }

    private final String a(Object obj) {
        String obj2;
        String str;
        String str2;
        if (obj instanceof Iterable) {
            for (Object obj3 : (Iterable) obj) {
                if (obj3 == null || (str2 = obj3.toString()) == null || str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            }
            return null;
        }
        if (!(obj instanceof Object[])) {
            if (obj == null || (obj2 = obj.toString()) == null || obj2.length() <= 0) {
                return null;
            }
            return obj2;
        }
        for (Object obj4 : (Object[]) obj) {
            if (obj4 == null || (str = obj4.toString()) == null || str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    private final int a(Map map, Set set) {
        String obj;
        String lowerCase;
        String replace$default;
        int i = 0;
        for (Object obj2 : map.keySet()) {
            if (obj2 != null && (obj = obj2.toString()) != null && (lowerCase = obj.toLowerCase(Locale.ROOT)) != null && (replace$default = StringsKt.replace$default(lowerCase, '-', '_', false, 4, (Object) null)) != null && set.contains(replace$default)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(A0 a02) {
        if (a02 instanceof A0.a) {
            a(((A0.a) a02).a());
        } else if (a02 instanceof A0.C1754b) {
            a(((A0.C1754b) a02).a());
        }
    }

    private final void a(C5958a c5958a) {
        Object m8023constructorimpl;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            InterfaceC1755b interfaceC1755b = (InterfaceC1755b) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                interfaceC1755b.a(c5958a);
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        }
    }

    private final void a(E0 e02) {
        Object m8023constructorimpl;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            F0 f02 = (F0) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                f02.a(e02);
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        }
    }

    private final Class a(Class cls) {
        for (Class cls2 : this.f.c(cls)) {
            if (b(cls2)) {
                Method[] declaredMethods = cls2.getDeclaredMethods();
                ArrayList arrayList = new ArrayList();
                for (Method method : declaredMethods) {
                    if (Modifier.isAbstract(method.getModifiers()) && Intrinsics.areEqual(method.getReturnType(), Void.TYPE)) {
                        arrayList.add(method);
                    }
                }
                if (arrayList.size() < 2) {
                    continue;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (k4$$ExternalSyntheticBackport0.m((Method) obj) == 1) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList<Method> arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (k4$$ExternalSyntheticBackport0.m((Method) obj2) == 2) {
                            arrayList3.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty() && !arrayList3.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Class<?> cls3 = ((Method) it.next()).getParameterTypes()[0];
                            if (!cls3.isPrimitive() && b((Class) cls3)) {
                                for (Method method2 : arrayList3) {
                                    Class<?> cls4 = method2.getParameterTypes()[0];
                                    Class<?> cls5 = method2.getParameterTypes()[1];
                                    if (Intrinsics.areEqual(cls3, cls4) && !cls5.isPrimitive() && b((Class) cls5)) {
                                        return cls2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final boolean a(List list) {
        Object obj;
        Object m8023constructorimpl;
        f z02;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int d = ((D0) next).d();
                do {
                    Object next2 = it.next();
                    int d2 = ((D0) next2).d();
                    if (d < d2) {
                        next = next2;
                        d = d2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        D0 d02 = (D0) obj;
        if (d02 == null) {
            return false;
        }
        Object newProxyInstance = Proxy.newProxyInstance(d02.b().getClassLoader(), new Class[]{d02.b()}, new C0());
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Boolean.valueOf(d02.c().add(newProxyInstance)));
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
        this.c = new B0(d02.c(), d02.b(), newProxyInstance);
        List a = d02.a();
        if (a == null || (z02 = z0()) == null) {
            return true;
        }
        this.a.a("af" + z02, CollectionsKt.joinToString$default(a, StringUtils.COMMA, null, null, 0, null, null, 62, null));
        return true;
    }
}
