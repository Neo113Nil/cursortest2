package io.bidmachine.analytics.internal.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.bidmachine.analytics.internal.a.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5892c {
    private final Context a;
    private final Lazy b = LazyKt.lazy(new b());
    private final Lazy c = LazyKt.lazy(new a());
    private final Lazy d = LazyKt.lazy(new d());
    private final Lazy e = LazyKt.lazy(new f());
    private final Lazy f = LazyKt.lazy(new C1732c());
    private final Lazy g = LazyKt.lazy(new e());

    /* renamed from: io.bidmachine.analytics.internal.a.c$a */
    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteDatabase mo4828invoke() {
            return C5892c.this.c().getWritableDatabase();
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.a.c$b */
    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.E.a mo4828invoke() {
            return new io.bidmachine.analytics.internal.E.a(C5892c.this.a());
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.a.c$c, reason: collision with other inner class name */
    static final class C1732c extends Lambda implements Function0 {
        C1732c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.H.b mo4828invoke() {
            return new io.bidmachine.analytics.internal.H.b(C5892c.this.b());
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.a.c$d */
    static final class d extends Lambda implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.H.d mo4828invoke() {
            io.bidmachine.analytics.internal.H.d dVar = new io.bidmachine.analytics.internal.H.d(C5892c.this.b());
            dVar.b();
            return dVar;
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.a.c$e */
    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.J.a mo4828invoke() {
            return new io.bidmachine.analytics.internal.J.a(C5892c.this.a(), null, 0, 6, null);
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.a.c$f */
    static final class f extends Lambda implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.H.f mo4828invoke() {
            io.bidmachine.analytics.internal.H.f fVar = new io.bidmachine.analytics.internal.H.f(C5892c.this.b());
            fVar.b();
            return fVar;
        }
    }

    public C5892c(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.analytics.internal.E.a c() {
        return (io.bidmachine.analytics.internal.E.a) this.b.getValue();
    }

    public final io.bidmachine.analytics.internal.H.a d() {
        return (io.bidmachine.analytics.internal.H.a) this.f.getValue();
    }

    public final io.bidmachine.analytics.internal.H.c e() {
        return (io.bidmachine.analytics.internal.H.c) this.d.getValue();
    }

    public final io.bidmachine.analytics.internal.J.b f() {
        return (io.bidmachine.analytics.internal.J.b) this.g.getValue();
    }

    public final io.bidmachine.analytics.internal.H.e g() {
        return (io.bidmachine.analytics.internal.H.e) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SQLiteDatabase b() {
        return (SQLiteDatabase) this.c.getValue();
    }

    public final Context a() {
        return this.a;
    }
}
