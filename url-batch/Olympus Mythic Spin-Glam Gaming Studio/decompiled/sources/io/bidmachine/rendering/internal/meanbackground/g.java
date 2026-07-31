package io.bidmachine.rendering.internal.meanbackground;

import android.view.View;
import io.bidmachine.rendering.internal.meanbackground.a;
import io.bidmachine.rendering.internal.meanbackground.b;
import io.bidmachine.rendering.internal.meanbackground.c;
import io.bidmachine.rendering.internal.meanbackground.d;
import io.bidmachine.rendering.internal.meanbackground.i;
import io.bidmachine.rendering.internal.meanbackground.o;
import io.bidmachine.rendering.utils.RenderingLoggerInstance;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import io.bidmachine.util.taskmanager.handler.BackgroundHandlerTaskManager;
import io.bidmachine.util.taskmanager.handler.HandlerTaskManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes.dex */
public final class g {
    private static final a l = new a(null);
    private final CoroutineContext a;
    private final b b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private final Lazy h;
    private final m i;
    private final io.bidmachine.rendering.internal.meanbackground.b j;
    private final a.C1799a k;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BackgroundHandlerTaskManager mo4828invoke() {
            return new BackgroundHandlerTaskManager();
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RenderingLoggerInstance mo4828invoke() {
            return new RenderingLoggerInstance();
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l mo4828invoke() {
            return new l(g.this.b());
        }
    }

    static final class f extends Lambda implements Function0 {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n mo4828invoke() {
            return new n();
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.meanbackground.g$g, reason: collision with other inner class name */
    static final class C1802g extends Lambda implements Function0 {
        C1802g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o mo4828invoke() {
            return new o(new o.a(null, g.this.b.d().getFirst(), g.this.b.d().getLast(), o.a.InterfaceC1806a.b.a, 1, null), io.bidmachine.rendering.internal.f.i.a(), g.this.a().getHandler());
        }
    }

    static final class h extends Lambda implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineTaskManager mo4828invoke() {
            return new CoroutineTaskManager(g.this.a);
        }
    }

    public g(CoroutineContext coroutineContext, b config) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = coroutineContext;
        this.b = config;
        this.c = LazyKt.lazy(new h());
        this.d = LazyKt.lazy(c.a);
        this.e = LazyKt.lazy(d.a);
        this.f = LazyKt.lazy(new e());
        this.g = LazyKt.lazy(f.a);
        this.h = LazyKt.lazy(new C1802g());
        this.i = new io.bidmachine.rendering.internal.meanbackground.e();
        this.j = new io.bidmachine.rendering.internal.meanbackground.b(new b.a(config.e(), config.f(), new d.a(config.d().getLast())));
        this.k = new a.C1799a(35, new d.a(config.d().getLast()));
    }

    private final o e() {
        return (o) this.h.getValue();
    }

    private final TaskManager f() {
        return (TaskManager) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HandlerTaskManager a() {
        return (HandlerTaskManager) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoggerInstance b() {
        return (LoggerInstance) this.e.getValue();
    }

    private final l c() {
        return (l) this.f.getValue();
    }

    private final n d() {
        return (n) this.g.getValue();
    }

    public final void a(View view, Integer num, Function0 onFallback, Function1 onFinished) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onFallback, "onFallback");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        f().executeSafely(new io.bidmachine.rendering.internal.meanbackground.h(view, 1000L, new j(d(), e(), a(num), b(num), c()), c(), onFallback, onFinished));
    }

    public final void b(View view, Integer num, Function0 onFallback, Function1 onFinished) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onFallback, "onFallback");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        f().executeSafely(new io.bidmachine.rendering.internal.meanbackground.h(view, 1000L, new k(d(), e(), a(num), this.j, b(num), c()), c(), onFallback, onFinished));
    }

    public static final class b {
        private final IntRange a;
        private final int b;
        private final int c;
        private final IntRange d;
        private final float e;
        private final float f;
        private final float g;

        public b(IntRange dimensionsRangePx, int i, int i2, IntRange sampleStepRangePx, float f, float f2, float f3) {
            Intrinsics.checkNotNullParameter(dimensionsRangePx, "dimensionsRangePx");
            Intrinsics.checkNotNullParameter(sampleStepRangePx, "sampleStepRangePx");
            this.a = dimensionsRangePx;
            this.b = i;
            this.c = i2;
            this.d = sampleStepRangePx;
            this.e = f;
            this.f = f2;
            this.g = f3;
        }

        public final float a() {
            return this.e;
        }

        public final float b() {
            return this.g;
        }

        public final float c() {
            return this.f;
        }

        public final IntRange d() {
            return this.a;
        }

        public final int e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && Intrinsics.areEqual(this.d, bVar.d) && Float.compare(this.e, bVar.e) == 0 && Float.compare(this.f, bVar.f) == 0 && Float.compare(this.g, bVar.g) == 0;
        }

        public final int f() {
            return this.c;
        }

        public final IntRange g() {
            return this.d;
        }

        public int hashCode() {
            return (((((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + Float.hashCode(this.e)) * 31) + Float.hashCode(this.f)) * 31) + Float.hashCode(this.g);
        }

        public String toString() {
            return "Config(dimensionsRangePx=" + this.a + ", maxOffsetPx=" + this.b + ", maxSampleSizePx=" + this.c + ", sampleStepRangePx=" + this.d + ", detectorAlphaThreshold=" + this.e + ", detectorTolerance=" + this.f + ", detectorBrightnessThreshold=" + this.g + ')';
        }

        public /* synthetic */ b(IntRange intRange, int i, int i2, IntRange intRange2, float f, float f2, float f3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? new IntRange(200, 512) : intRange, (i3 & 2) != 0 ? 5 : i, (i3 & 4) != 0 ? 25 : i2, (i3 & 8) != 0 ? new IntRange(1, 8) : intRange2, (i3 & 16) != 0 ? 0.01f : f, (i3 & 32) != 0 ? 0.02f : f2, (i3 & 64) != 0 ? 0.04f : f3);
        }
    }

    private final io.bidmachine.rendering.internal.meanbackground.a a(Integer num) {
        return new io.bidmachine.rendering.internal.meanbackground.a(this.a, this.k, new io.bidmachine.rendering.internal.meanbackground.c(new c.a(num, this.b.a(), this.b.c(), this.b.b())), this.i);
    }

    private final i b(Integer num) {
        return new i(new i.a(num != null ? num.intValue() : -16777216, this.b.d().getLast(), this.b.g().getFirst(), this.b.g().getLast(), i.a.InterfaceC1803a.C1804a.a), this.i);
    }

    public /* synthetic */ g(CoroutineContext coroutineContext, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SupervisorKt.SupervisorJob$default(null, 1, null).plus(io.bidmachine.rendering.internal.f.i.a().b()) : coroutineContext, (i & 2) != 0 ? new b(null, 0, 0, null, 0.0f, 0.0f, 0.0f, 127, null) : bVar);
    }
}
