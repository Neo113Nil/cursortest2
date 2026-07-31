package io.bidmachine.analytics.internal.l;

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

/* loaded from: classes5.dex */
public final class a extends AbstractC5914a {
    private final String n;
    private final b o;
    private final C1738a p;
    public static final u q = new u(null);
    private static final Lazy r = LazyKt.lazy(q.a);
    private static final Lazy s = LazyKt.lazy(l.a);
    private static final Lazy t = LazyKt.lazy(k.a);
    private static final Lazy u = LazyKt.lazy(e.a);
    private static final Lazy v = LazyKt.lazy(m.a);
    private static final Lazy w = LazyKt.lazy(r.a);
    private static final Lazy x = LazyKt.lazy(h.a);
    private static final Lazy y = LazyKt.lazy(n.a);
    private static final Lazy z = LazyKt.lazy(t.a);
    private static final Lazy A = LazyKt.lazy(s.a);
    private static final Lazy B = LazyKt.lazy(p.a);
    private static final Lazy C = LazyKt.lazy(g.a);
    private static final Lazy D = LazyKt.lazy(i.a);
    private static final Lazy E = LazyKt.lazy(f.a);
    private static final Lazy F = LazyKt.lazy(c.a);
    private static final Lazy G = LazyKt.lazy(d.a);
    private static final Lazy H = LazyKt.lazy(j.a);
    private static final Lazy I = LazyKt.lazy(o.a);

    /* renamed from: io.bidmachine.analytics.internal.l.a$a, reason: collision with other inner class name */
    private final class C1738a implements a.W {
        public C1738a() {
        }

        @Override // io.bidmachine.analytics.internal.q.a.W
        public void a(a.V v) {
            Map map;
            Map a = a.this.a(AbstractC5914a.i.c(), a.this.f());
            if (v instanceof a.V.b) {
                u uVar = a.q;
                a.put(uVar.l(), uVar.r());
                a.V.b bVar = (a.V.b) v;
                String h = bVar.h();
                if (h != null) {
                    a.put(uVar.j(), h);
                }
                String i = bVar.i();
                if (i != null) {
                    a.put(uVar.n(), i);
                }
                String e = bVar.e();
                if (e != null) {
                    a.put(uVar.e(), e);
                }
                Double j = bVar.j();
                if (j != null) {
                    a.put(uVar.i(), Double.valueOf(j.doubleValue()));
                }
                String c = bVar.c();
                if (c != null) {
                    a.put(uVar.c(), c);
                }
                String f = bVar.f();
                if (f != null) {
                    a.put(uVar.g(), f);
                }
                String d = bVar.d();
                if (d != null) {
                    a.put(uVar.d(), d);
                }
                String a2 = bVar.a();
                if (a2 != null) {
                    a.put(uVar.a(), a2);
                }
                Map b = bVar.b();
                if (b != null) {
                    if (b.isEmpty()) {
                        b = null;
                    }
                    if (b != null) {
                        a.put(uVar.b(), b);
                    }
                }
                Map g = bVar.g();
                if (g != null) {
                    map = g.isEmpty() ? null : g;
                    if (map != null) {
                        a.put(uVar.h(), map);
                    }
                }
            } else if (v instanceof a.V.C1752a) {
                u uVar2 = a.q;
                a.put(uVar2.l(), uVar2.q());
                a.V.C1752a c1752a = (a.V.C1752a) v;
                String i2 = c1752a.i();
                if (i2 != null) {
                    a.put(uVar2.j(), i2);
                }
                String g2 = c1752a.g();
                if (g2 != null) {
                    a.put(uVar2.n(), g2);
                }
                Long e2 = c1752a.e();
                if (e2 != null) {
                    a.put(uVar2.i(), Long.valueOf(e2.longValue()));
                }
                String b2 = c1752a.b();
                if (b2 != null) {
                    a.put(uVar2.c(), b2);
                }
                String c2 = c1752a.c();
                if (c2 != null) {
                    a.put(uVar2.g(), c2);
                }
                String h2 = c1752a.h();
                if (h2 != null) {
                    a.put(uVar2.p(), h2);
                }
                Long f2 = c1752a.f();
                if (f2 != null) {
                    a.put(uVar2.m(), Long.valueOf(f2.longValue()));
                }
                Map a3 = c1752a.a();
                if (a3 != null) {
                    if (a3.isEmpty()) {
                        a3 = null;
                    }
                    if (a3 != null) {
                        a.put(uVar2.b(), a3);
                    }
                }
                Map d2 = c1752a.d();
                if (d2 != null) {
                    map = d2.isEmpty() ? null : d2;
                    if (map != null) {
                        a.put(uVar2.h(), map);
                    }
                }
            }
            a.this.a(a);
        }
    }

    private final class b implements b.F0 {
        public b() {
        }

        @Override // io.bidmachine.analytics.internal.q.b.F0
        public void a(b.E0 e0) {
            Map a = a.this.a(AbstractC5914a.i.d(), a.this.g());
            String f = e0.f();
            if (f != null) {
                a.put(a.q.o(), f);
            }
            String d = e0.d();
            if (d != null) {
                a.put(a.q.j(), d);
            }
            String c = e0.c();
            if (c != null) {
                a.put(a.q.i(), c);
            }
            String a2 = e0.a();
            if (a2 != null) {
                a.put(a.q.c(), a2);
            }
            String e = e0.e();
            if (e != null) {
                a.put(a.q.k(), e);
            }
            String g = e0.g();
            if (g != null) {
                a.put(a.q.p(), g);
            }
            Map b = e0.b();
            if (b.isEmpty()) {
                b = null;
            }
            if (b != null) {
                a.put(a.q.f(), b);
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
            return io.bidmachine.analytics.internal.I.g.b("QWaft2YhJGbsF2Y=");
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
            return io.bidmachine.analytics.internal.I.g.b("wcyVGdl1WYyFGcft2YhJGbsF2Y==");
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
            return io.bidmachine.analytics.internal.I.g.b("k3YuVmcyV3Y=");
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
            return io.bidmachine.analytics.internal.I.g.b("AZp9lbvlGdhNWasBXdkVGZ==");
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
            return io.bidmachine.analytics.internal.I.g.b("4WZr9GdfRnblZXZ=");
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
            return io.bidmachine.analytics.internal.I.g.b("zFmc0hXZ");
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
            return io.bidmachine.analytics.internal.I.g.b("QWafJXZkJ3b=");
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
            return io.bidmachine.analytics.internal.I.g.b("zJXZ0VWbhJXYw9lcl5GdyFGc");
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
            return io.bidmachine.analytics.internal.I.g.b("U2YpJHc=");
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
            return io.bidmachine.analytics.internal.I.g.b("AZp9FdjVHZvJHc==");
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
            return io.bidmachine.analytics.internal.I.g.b("QY0FGZfV2chh2YyVHc==");
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
            return io.bidmachine.analytics.internal.I.g.b("AZul2afV2chh2YyVHc==");
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
            return io.bidmachine.analytics.internal.I.g.b("QZtlGdfV2chh2YyVHc==");
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
            return io.bidmachine.analytics.internal.I.g.b("4WZr9GdfV2chh2YyVHc=");
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
            return io.bidmachine.analytics.internal.I.g.b("QZwlHdfV2chh2YyVHc==");
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
            return io.bidmachine.analytics.internal.I.g.b("lJXd0Fmbnl2c");
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
            return io.bidmachine.analytics.internal.I.g.b("42bpRHcpJ3YzJWdz9VZy9Gdz9VehxGc=");
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
            return io.bidmachine.analytics.internal.I.g.b("Q3clVXclJ3Xu9Wa0F2YpZWayVmd=");
        }
    }

    public static final class u {
        public /* synthetic */ u(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return (String) a.F.getValue();
        }

        public final String b() {
            return (String) a.G.getValue();
        }

        public final String c() {
            return (String) a.u.getValue();
        }

        public final String d() {
            return (String) a.E.getValue();
        }

        public final String e() {
            return (String) a.C.getValue();
        }

        public final String f() {
            return (String) a.x.getValue();
        }

        public final String g() {
            return (String) a.D.getValue();
        }

        public final String h() {
            return (String) a.H.getValue();
        }

        public final String i() {
            return (String) a.t.getValue();
        }

        public final String j() {
            return (String) a.s.getValue();
        }

        public final String k() {
            return (String) a.v.getValue();
        }

        public final String l() {
            return (String) a.y.getValue();
        }

        public final String m() {
            return (String) a.I.getValue();
        }

        public final String n() {
            return (String) a.B.getValue();
        }

        public final String o() {
            return (String) a.r.getValue();
        }

        public final String p() {
            return (String) a.w.getValue();
        }

        public final String q() {
            return (String) a.A.getValue();
        }

        public final String r() {
            return (String) a.z.getValue();
        }

        private u() {
        }
    }

    public a(C5890a c5890a) {
        super(c5890a);
        this.n = "mip";
        this.o = new b();
        this.p = new C1738a();
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public String a() {
        return this.n;
    }

    @Override // io.bidmachine.analytics.internal.j.AbstractC5914a
    public void l() {
        h().b((a.W) this.p);
    }

    @Override // io.bidmachine.analytics.internal.j.AbstractC5914a
    public void m() {
        i().b((b.F0) this.o);
    }

    @Override // io.bidmachine.analytics.internal.j.AbstractC5914a
    public void n() {
        h().a((a.W) this.p);
    }

    @Override // io.bidmachine.analytics.internal.j.AbstractC5914a
    public void o() {
        i().a((b.F0) this.o);
    }
}
