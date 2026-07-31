package io.bidmachine.analytics.internal.a;

import android.content.Context;
import io.bidmachine.analytics.internal.u.g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class d {
    private final Context a;
    private final Lazy b = LazyKt.lazy(b.a);
    private final Lazy c = LazyKt.lazy(c.a);
    private final Lazy d = LazyKt.lazy(a.a);

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.s.b mo4828invoke() {
            return new io.bidmachine.analytics.internal.s.b();
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.t.e mo4828invoke() {
            return new io.bidmachine.analytics.internal.t.e(0, 1, null);
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g mo4828invoke() {
            return new g();
        }
    }

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    public final io.bidmachine.analytics.internal.s.b a() {
        return (io.bidmachine.analytics.internal.s.b) this.d.getValue();
    }

    public final io.bidmachine.analytics.internal.t.e b() {
        return (io.bidmachine.analytics.internal.t.e) this.b.getValue();
    }

    public final g c() {
        return (g) this.c.getValue();
    }
}
