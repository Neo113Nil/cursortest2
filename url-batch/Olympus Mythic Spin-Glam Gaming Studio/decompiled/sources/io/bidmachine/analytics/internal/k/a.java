package io.bidmachine.analytics.internal.k;

import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.j.AbstractC5914a;
import io.bidmachine.analytics.internal.q.a;
import io.bidmachine.analytics.internal.q.b;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends AbstractC5914a {
    public static final h q = new h(null);
    private static final Lazy r = LazyKt.lazy(f.a);
    private static final Lazy s = LazyKt.lazy(g.a);
    private static final Lazy t = LazyKt.lazy(d.a);
    private static final Lazy u = LazyKt.lazy(e.a);
    private static final Lazy v = LazyKt.lazy(c.a);
    private final String n;
    private final b o;
    private final C1737a p;

    /* renamed from: io.bidmachine.analytics.internal.k.a$a, reason: collision with other inner class name */
    private final class C1737a implements a.InterfaceC5935d {
        public C1737a() {
        }

        @Override // io.bidmachine.analytics.internal.q.a.InterfaceC5935d
        public void a(a.C5934c c5934c) {
            Map a = a.this.a(AbstractC5914a.i.c(), a.this.f());
            String c = c5934c.c();
            if (c != null) {
                a.put(a.q.d(), c);
            }
            String d = c5934c.d();
            if (d != null) {
                a.put(a.q.e(), d);
            }
            Double e = c5934c.e();
            if (e != null) {
                a.put(a.q.b(), Double.valueOf(e.doubleValue()));
            }
            String a2 = c5934c.a();
            if (a2 != null) {
                a.put(a.q.c(), a2);
            }
            Map b = c5934c.b();
            if (b.isEmpty()) {
                b = null;
            }
            if (b != null) {
                a.put(a.q.a(), b);
            }
            a.this.a(a);
        }
    }

    private final class b implements b.InterfaceC1755b {
        public b() {
        }

        @Override // io.bidmachine.analytics.internal.q.b.InterfaceC1755b
        public void a(b.C5958a c5958a) {
            Map a = a.this.a(AbstractC5914a.i.d(), a.this.g());
            String c = c5958a.c();
            if (c != null) {
                a.put(a.q.d(), c);
            }
            String d = c5958a.d();
            if (d != null) {
                a.put(a.q.e(), d);
            }
            Double e = c5958a.e();
            if (e != null) {
                a.put(a.q.b(), Double.valueOf(e.doubleValue()));
            }
            String a2 = c5958a.a();
            if (a2 != null) {
                a.put(a.q.c(), a2);
            }
            Map b = c5958a.b();
            if (b.isEmpty()) {
                b = null;
            }
            if (b != null) {
                a.put(a.q.a(), b);
            }
            a.this.a(a);
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
            return io.bidmachine.analytics.internal.I.g.b("MnclRXZtFmchB3Xt9GdzV3Y=");
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.b("QZ15WZ2VmcfRnblZXZ==");
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
            return io.bidmachine.analytics.internal.I.g.b("Qej5WZyJXdj9VZ15WZ2VmcfRnblZXZ==");
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
            return io.bidmachine.analytics.internal.I.g.b("smcvdHdl52Xu9Wa0FWakVWb=");
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
            return io.bidmachine.analytics.internal.I.g.b("smcvdHdl52Xu9Wa0FmepRXZu9Wb=");
        }
    }

    public static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return (String) a.v.getValue();
        }

        public final String b() {
            return (String) a.t.getValue();
        }

        public final String c() {
            return (String) a.u.getValue();
        }

        public final String d() {
            return (String) a.r.getValue();
        }

        public final String e() {
            return (String) a.s.getValue();
        }

        private h() {
        }
    }

    public a(C5890a c5890a) {
        super(c5890a);
        this.n = "mia";
        this.o = new b();
        this.p = new C1737a();
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public String a() {
        return this.n;
    }

    @Override // io.bidmachine.analytics.internal.j.AbstractC5914a
    public void l() {
        h().b((a.InterfaceC5935d) this.p);
    }

    @Override // io.bidmachine.analytics.internal.j.AbstractC5914a
    public void m() {
        i().b((b.InterfaceC1755b) this.o);
    }

    @Override // io.bidmachine.analytics.internal.j.AbstractC5914a
    public void n() {
        h().a((a.InterfaceC5935d) this.p);
    }

    @Override // io.bidmachine.analytics.internal.j.AbstractC5914a
    public void o() {
        i().a((b.InterfaceC1755b) this.o);
    }
}
