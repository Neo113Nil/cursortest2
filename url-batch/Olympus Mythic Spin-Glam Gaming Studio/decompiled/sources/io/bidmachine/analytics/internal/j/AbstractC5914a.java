package io.bidmachine.analytics.internal.j;

import android.content.Context;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.analytics.internal.h.InterfaceC5907b;
import io.bidmachine.analytics.internal.i.AbstractC5912a;
import io.bidmachine.analytics.internal.i.C5913b;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.bidmachine.analytics.internal.j.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5914a extends AbstractC5912a implements InterfaceC5907b {
    public static final e i = new e(null);
    private static final Lazy j = LazyKt.lazy(C1736a.a);
    private static final Lazy k = LazyKt.lazy(b.a);
    private static final Lazy l = LazyKt.lazy(d.a);
    private static final Lazy m = LazyKt.lazy(c.a);
    private final C5890a d;
    private C5913b e;
    private InterfaceC5907b f;
    private final Lazy g = LazyKt.lazy(new g());
    private final Lazy h = LazyKt.lazy(new f());

    /* renamed from: io.bidmachine.analytics.internal.j.a$a, reason: collision with other inner class name */
    static final class C1736a extends Lambda implements Function0 {
        public static final C1736a a = new C1736a();

        C1736a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.b("rR2c");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.j.a$b */
    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.b("gclZ3XrR2c==");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.j.a$c */
    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.b("qRWY");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.j.a$d */
    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.b("mNXY");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.j.a$e */
    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return (String) AbstractC5914a.j.getValue();
        }

        public final String b() {
            return (String) AbstractC5914a.k.getValue();
        }

        public final String c() {
            return (String) AbstractC5914a.m.getValue();
        }

        public final String d() {
            return (String) AbstractC5914a.l.getValue();
        }

        private e() {
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.j.a$f */
    static final class f extends Lambda implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.q.a mo4828invoke() {
            return AbstractC5914a.this.d.b().a();
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.j.a$g */
    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.q.b mo4828invoke() {
            return AbstractC5914a.this.d.b().b();
        }
    }

    public AbstractC5914a(C5890a c5890a) {
        this.d = c5890a;
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void d(Context context) {
    }

    public final String f() {
        String fVar;
        io.bidmachine.analytics.internal.a.f R = h().R();
        return (R == null || (fVar = R.toString()) == null) ? h().Q() : fVar;
    }

    public final String g() {
        String fVar;
        io.bidmachine.analytics.internal.a.f z0 = i().z0();
        return (z0 == null || (fVar = z0.toString()) == null) ? i().y0() : fVar;
    }

    public final io.bidmachine.analytics.internal.q.a h() {
        return (io.bidmachine.analytics.internal.q.a) this.h.getValue();
    }

    public final io.bidmachine.analytics.internal.q.b i() {
        return (io.bidmachine.analytics.internal.q.b) this.g.getValue();
    }

    public final boolean j() {
        C5913b c5913b = this.e;
        return h().U() && (c5913b == null || c5913b.a(h().R()));
    }

    public final boolean k() {
        C5913b c5913b = this.e;
        return i().C0() && (c5913b == null || c5913b.b(i().z0()));
    }

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(AbstractC5912a.b bVar) {
        Map emptyMap;
        AbstractC5912a.InterfaceC1735a b2 = bVar.b();
        this.e = b2 instanceof C5913b ? (C5913b) b2 : null;
        this.f = bVar.a();
        io.bidmachine.analytics.internal.q.b i2 = i();
        C5913b c5913b = this.e;
        if (c5913b == null || (emptyMap = c5913b.a()) == null) {
            emptyMap = MapsKt.emptyMap();
        }
        i2.b(emptyMap);
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void e(Context context) {
        if (k()) {
            m();
        }
        if (j()) {
            l();
        }
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void f(Context context) {
        System.nanoTime();
        if (k()) {
            o();
        }
        System.nanoTime();
        a();
        System.nanoTime();
        if (j()) {
            n();
        }
        System.nanoTime();
        a();
    }

    @Override // io.bidmachine.analytics.internal.h.InterfaceC5907b
    public void a(Map map) {
        a();
        InterfaceC5907b interfaceC5907b = this.f;
        if (interfaceC5907b != null) {
            interfaceC5907b.a(map);
        }
    }

    @Override // io.bidmachine.analytics.internal.h.InterfaceC5907b
    public void a(h hVar) {
        InterfaceC5907b interfaceC5907b = this.f;
        if (interfaceC5907b != null) {
            interfaceC5907b.a(hVar);
        }
    }

    public final Map a(String str, String str2) {
        e eVar = i;
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(eVar.a(), str));
        if (str2 != null) {
            mutableMapOf.put(eVar.b(), str2);
        }
        return mutableMapOf;
    }
}
