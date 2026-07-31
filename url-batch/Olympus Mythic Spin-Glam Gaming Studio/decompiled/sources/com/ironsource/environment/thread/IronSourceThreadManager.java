package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.C4687hg;
import com.ironsource.C4774me;
import com.ironsource.C4782n4;
import com.ironsource.Ff;
import com.ironsource.Gf;
import com.ironsource.If;
import com.ironsource.InterfaceC4669gg;
import com.ironsource.Kb;
import com.ironsource.S9;
import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class IronSourceThreadManager {

    @NotNull
    public static final IronSourceThreadManager INSTANCE;
    private static boolean a;

    @NotNull
    private static final Lazy b;

    @NotNull
    private static final Lazy c;

    @NotNull
    private static final AtomicReference<Gf> d;

    @NotNull
    private static final Lazy e;

    @NotNull
    private static final Lazy f;

    @NotNull
    private static final Lazy g;

    @NotNull
    private static final Lazy h;

    @NotNull
    private static final Lazy i;

    @NotNull
    private static final Lazy j;

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 mo4828invoke() {
            S9 s9 = new S9("adapterBackground");
            s9.start();
            s9.a();
            return s9;
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4774me mo4828invoke() {
            return new C4774me(0, null, 3, 0 == true ? 1 : 0);
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler mo4828invoke() {
            S9 s9 = new S9("IronSourceInitiatorHandler");
            s9.start();
            s9.a();
            return new Handler(s9.getLooper());
        }
    }

    static final class e extends Lambda implements Function0 {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.environment.thread.a mo4828invoke() {
            return com.ironsource.environment.thread.a.c.a("LevelPlayThread");
        }
    }

    static final class f extends Lambda implements Function0 {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 mo4828invoke() {
            S9 s9 = new S9("mediationBackground");
            s9.start();
            s9.a();
            return s9;
        }
    }

    static final class g extends Lambda implements Function0 {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 mo4828invoke() {
            S9 s9 = new S9("publisher-callbacks");
            s9.start();
            s9.a();
            return s9;
        }
    }

    static final class h extends Lambda implements Function0 {
        public static final h a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 mo4828invoke() {
            S9 s9 = new S9("managersThread");
            s9.start();
            s9.a();
            return s9;
        }
    }

    static final class i extends Lambda implements Function0 {
        public static final i a = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler mo4828invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        IronSourceThreadManager ironSourceThreadManager = new IronSourceThreadManager();
        INSTANCE = ironSourceThreadManager;
        b = LazyKt.lazy(i.a);
        c = LazyKt.lazy(e.a);
        d = new AtomicReference<>(ironSourceThreadManager.f());
        e = LazyKt.lazy(c.a);
        f = LazyKt.lazy(h.a);
        g = LazyKt.lazy(f.a);
        h = LazyKt.lazy(a.a);
        i = LazyKt.lazy(g.a);
        j = LazyKt.lazy(b.a);
    }

    private IronSourceThreadManager() {
    }

    private final S9 a() {
        return (S9) h.getValue();
    }

    private final C4774me b() {
        return (C4774me) j.getValue();
    }

    private final S9 c() {
        return (S9) g.getValue();
    }

    private final S9 d() {
        return (S9) i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler e() {
        return (Handler) b.getValue();
    }

    private final Ff f() {
        return new Ff(new d(), new InterfaceC4669gg() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda0
            @Override // com.ironsource.InterfaceC4669gg
            public final void a(Function0 function0) {
                IronSourceThreadManager.a(function0);
            }
        });
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j2);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j2);
    }

    public static /* synthetic */ Gf.a postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return ironSourceThreadManager.postOnUiThreadTask(runnable, j2);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void changeToUISchedulerIfNeeded() {
        if (Kb.u.d().h().z()) {
            d.set(new Ff(null, C4687hg.a(e()), 1, 0 == true ? 1 : 0));
        }
    }

    public final void executeTasks(boolean z, boolean z2, @NotNull List<? extends Runnable> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!z) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z2) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        for (final Runnable runnable : tasks) {
            postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            C4782n4.d().a(e2);
        }
    }

    @NotNull
    public final Handler getInitHandler() {
        return (Handler) e.getValue();
    }

    @NotNull
    public final com.ironsource.environment.thread.a getLevelPlayThread() {
        return (com.ironsource.environment.thread.a) c.getValue();
    }

    @NotNull
    public final S9 getSharedManagersThread() {
        return (S9) f.getValue();
    }

    @NotNull
    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return a;
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    @NotNull
    public final Gf.a postOnUiThreadTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            a().b(action);
        }
    }

    public final void removeMediationBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            c().b(action);
        }
    }

    public final void setUseSharedExecutorService(boolean z) {
        a = z;
    }

    public static final class d implements If {
        d() {
        }

        @Override // com.ironsource.If
        @NotNull
        public If.a a(long j, @NotNull final Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            IronSourceThreadManager.INSTANCE.e().postDelayed(runnable, j);
            return new If.a() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$d$$ExternalSyntheticLambda0
                @Override // com.ironsource.If.a
                public final void cancel() {
                    IronSourceThreadManager.d.a(runnable);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "$runnable");
            IronSourceThreadManager.INSTANCE.e().removeCallbacks(runnable);
        }
    }

    private final boolean a(Runnable runnable) {
        return a && b().getQueue().contains(runnable);
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a) {
            b().schedule(action, j2, TimeUnit.MILLISECONDS);
        } else {
            a().a(action, j2);
        }
    }

    public final void postMediationBackgroundTask(@NotNull Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a) {
            b().schedule(action, j2, TimeUnit.MILLISECONDS);
        } else {
            c().a(action, j2);
        }
    }

    @NotNull
    public final Gf.a postOnUiThreadTask(@NotNull Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        Gf gf = d.get();
        Duration.Companion companion = Duration.Companion;
        return gf.a(action, DurationKt.toDuration(j2, DurationUnit.MILLISECONDS));
    }

    public final void postPublisherCallback(@NotNull Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        d().a(action, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, final CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.mo4828invoke();
    }
}
