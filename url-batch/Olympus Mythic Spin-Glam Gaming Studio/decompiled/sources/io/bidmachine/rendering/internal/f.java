package io.bidmachine.rendering.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes11.dex */
public final class f {
    public static final e i = new e(null);
    private static final f j = new f(a.a, b.a, c.a, d.a);
    private final Function0 a;
    private final Function0 b;
    private final Function0 c;
    private final Function0 d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private final Lazy h;

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
            return Dispatchers.getMain().getImmediate();
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
            return Dispatchers.getIO();
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return Dispatchers.getDefault();
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.j;
        }

        private e() {
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.f$f, reason: collision with other inner class name */
    static final class C1798f extends Lambda implements Function0 {
        C1798f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return (CoroutineDispatcher) f.this.d.mo4828invoke();
        }
    }

    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return (CoroutineDispatcher) f.this.c.mo4828invoke();
        }
    }

    static final class h extends Lambda implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return (CoroutineDispatcher) f.this.a.mo4828invoke();
        }
    }

    static final class i extends Lambda implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo4828invoke() {
            return (CoroutineDispatcher) f.this.b.mo4828invoke();
        }
    }

    public f(Function0 mainProvider, Function0 mainImmediateProvider, Function0 ioProvider, Function0 defaultProvider) {
        Intrinsics.checkNotNullParameter(mainProvider, "mainProvider");
        Intrinsics.checkNotNullParameter(mainImmediateProvider, "mainImmediateProvider");
        Intrinsics.checkNotNullParameter(ioProvider, "ioProvider");
        Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
        this.a = mainProvider;
        this.b = mainImmediateProvider;
        this.c = ioProvider;
        this.d = defaultProvider;
        this.e = LazyKt.lazy(new h());
        this.f = LazyKt.lazy(new i());
        this.g = LazyKt.lazy(new g());
        this.h = LazyKt.lazy(new C1798f());
    }

    public static final f f() {
        return i.a();
    }

    public final CoroutineDispatcher e() {
        return (CoroutineDispatcher) this.f.getValue();
    }

    public final CoroutineDispatcher b() {
        return (CoroutineDispatcher) this.h.getValue();
    }

    public final CoroutineDispatcher c() {
        return (CoroutineDispatcher) this.g.getValue();
    }

    public final CoroutineDispatcher d() {
        return (CoroutineDispatcher) this.e.getValue();
    }
}
