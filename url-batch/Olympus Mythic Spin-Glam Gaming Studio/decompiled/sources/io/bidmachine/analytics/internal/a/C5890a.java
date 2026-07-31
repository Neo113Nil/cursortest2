package io.bidmachine.analytics.internal.a;

import android.content.Context;
import io.bidmachine.util.time.SystemTimeManagerInstance;
import io.bidmachine.util.time.TimeManagerInstance;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.bidmachine.analytics.internal.a.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5890a {
    private final Context a;
    private final Lazy b = LazyKt.lazy(new b());
    private final Lazy c = LazyKt.lazy(new c());
    private final Lazy d = LazyKt.lazy(new C1730a());
    private final Lazy e = LazyKt.lazy(d.a);

    /* renamed from: io.bidmachine.analytics.internal.a.a$a, reason: collision with other inner class name */
    static final class C1730a extends Lambda implements Function0 {
        C1730a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5891b mo4828invoke() {
            return new C5891b(C5890a.this.c().f());
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.a.a$b */
    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5892c mo4828invoke() {
            return new C5892c(C5890a.this.a());
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.a.a$c */
    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.a.d mo4828invoke() {
            return new io.bidmachine.analytics.internal.a.d(C5890a.this.a());
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.a.a$d */
    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SystemTimeManagerInstance mo4828invoke() {
            return new SystemTimeManagerInstance();
        }
    }

    public C5890a(Context context) {
        this.a = context.getApplicationContext();
    }

    public final Context a() {
        return this.a;
    }

    public final C5891b b() {
        return (C5891b) this.d.getValue();
    }

    public final C5892c c() {
        return (C5892c) this.b.getValue();
    }

    public final io.bidmachine.analytics.internal.a.d d() {
        return (io.bidmachine.analytics.internal.a.d) this.c.getValue();
    }

    public final TimeManagerInstance e() {
        return (TimeManagerInstance) this.e.getValue();
    }
}
