package io.bidmachine.analytics.internal.I;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes12.dex */
public final class f {
    public static final d g = new d(null);
    private static final f h = new f(a.a, b.a, c.a);
    private final Function0 a;
    private final Function0 b;
    private final Function0 c;
    private final Lazy d = LazyKt.lazy(new g());
    private final Lazy e = LazyKt.lazy(new C1729f());
    private final Lazy f = LazyKt.lazy(new e());

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return Dispatchers.getMain();
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return Dispatchers.getIO();
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return Dispatchers.getDefault();
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.h;
        }

        private d() {
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return (CoroutineDispatcher) f.this.c.mo4828invoke();
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.I.f$f, reason: collision with other inner class name */
    static final class C1729f extends Lambda implements Function0 {
        C1729f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return (CoroutineDispatcher) f.this.b.mo4828invoke();
        }
    }

    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return (CoroutineDispatcher) f.this.a.mo4828invoke();
        }
    }

    public f(Function0 function0, Function0 function02, Function0 function03) {
        this.a = function0;
        this.b = function02;
        this.c = function03;
    }

    public final CoroutineDispatcher b() {
        return (CoroutineDispatcher) this.f.getValue();
    }

    public final CoroutineDispatcher c() {
        return (CoroutineDispatcher) this.e.getValue();
    }
}
