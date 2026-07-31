package com.yandex.div.internal.viewpool;

import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.Scopes;
import com.ironsource.X3;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdvanceViewPool.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u001f\u0010\u0013\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u0015J0\u0010\u0016\u001a\u00020\u000f\"\b\b\u0000\u0010\u0014*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0017J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/internal/viewpool/AdvanceViewPool;", "Lcom/yandex/div/internal/viewpool/ViewPool;", "profiler", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;", "sessionProfiler", "Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;", "viewCreator", "Lcom/yandex/div/internal/viewpool/ViewCreator;", "(Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;Lcom/yandex/div/internal/viewpool/ViewCreator;)V", "viewFactories", "", "", "Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", "Landroid/view/View;", "changeCapacity", "", "tag", "newCapacity", "", "obtain", "T", "(Ljava/lang/String;)Landroid/view/View;", "register", "factory", "Lcom/yandex/div/internal/viewpool/ViewFactory;", "capacity", "unregister", "Channel", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdvanceViewPool implements ViewPool {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final ViewPoolProfiler profiler;

    @NotNull
    private final PerformanceDependentSessionProfiler sessionProfiler;

    @NotNull
    private final ViewCreator viewCreator;

    @NotNull
    private final Map<String, Channel<? extends View>> viewFactories = new ArrayMap();

    public AdvanceViewPool(@Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler performanceDependentSessionProfiler, @NotNull ViewCreator viewCreator) {
        this.profiler = viewPoolProfiler;
        this.sessionProfiler = performanceDependentSessionProfiler;
        this.viewCreator = viewCreator;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    public <T extends View> void register(@NotNull String tag, @NotNull ViewFactory<T> factory, int capacity) {
        synchronized (this.viewFactories) {
            if (this.viewFactories.containsKey(tag)) {
                Assert.fail("Factory is already registered");
            } else {
                this.viewFactories.put(tag, new Channel<>(tag, this.profiler, this.sessionProfiler, factory, this.viewCreator, capacity));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    public void unregister(@NotNull String tag) {
        synchronized (this.viewFactories) {
            if (!this.viewFactories.containsKey(tag)) {
                Assert.fail("Factory is not registered");
            } else {
                ((Channel) UtilsKt.removeOrThrow$default(this.viewFactories, tag, null, 2, null)).stop();
            }
        }
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    @NotNull
    public <T extends View> T obtain(@NotNull String tag) {
        Channel channel;
        synchronized (this.viewFactories) {
            channel = (Channel) UtilsKt.getOrThrow(this.viewFactories, tag, "Factory is not registered");
        }
        T t = (T) channel.createView();
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.AdvanceViewPool.obtain");
        return t;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    public void changeCapacity(@NotNull String tag, int newCapacity) {
        synchronized (this.viewFactories) {
            Object orThrow = UtilsKt.getOrThrow(this.viewFactories, tag, "Factory is not registered");
            ((Channel) orThrow).setCapacity(newCapacity);
        }
    }

    /* compiled from: AdvanceViewPool.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 )*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001)B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010!\u001a\u00020\"H\u0007J\r\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\r\u0010%\u001a\u00028\u0000H\u0007¢\u0006\u0002\u0010$J\r\u0010&\u001a\u00028\u0000H\u0003¢\u0006\u0002\u0010$J\b\u0010'\u001a\u00020\"H\u0002J\u0006\u0010(\u001a\u00020\"R\u001a\u0010\u0010\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", "T", "Landroid/view/View;", "Lcom/yandex/div/internal/viewpool/ViewFactory;", "viewName", "", "profiler", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;", "sessionProfiler", "Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;", "viewFactory", "viewCreator", "Lcom/yandex/div/internal/viewpool/ViewCreator;", "initCapacity", "", "(Ljava/lang/String;Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;Lcom/yandex/div/internal/viewpool/ViewFactory;Lcom/yandex/div/internal/viewpool/ViewCreator;I)V", "capacity", "getCapacity", "()I", "setCapacity", "(I)V", "notEmpty", "", "getNotEmpty", "()Z", "realQueueSize", "Ljava/util/concurrent/atomic/AtomicInteger;", X3.i.h0, "Ljava/util/concurrent/atomic/AtomicBoolean;", "getViewName", "()Ljava/lang/String;", "viewQueue", "Ljava/util/concurrent/BlockingQueue;", "createAndEnqueueView", "", "createView", "()Landroid/view/View;", "extractView", "extractViewBlocked", "requestViewCreation", "stop", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Channel<T extends View> implements ViewFactory<T> {
        private static final long MAX_WAITING_TIME = 16;
        private volatile int capacity;
        private final boolean notEmpty;

        @Nullable
        private final ViewPoolProfiler profiler;

        @NotNull
        private AtomicInteger realQueueSize;

        @NotNull
        private final PerformanceDependentSessionProfiler sessionProfiler;

        @NotNull
        private final ViewCreator viewCreator;

        @NotNull
        private final ViewFactory<T> viewFactory;

        @NotNull
        private final String viewName;

        @NotNull
        private final BlockingQueue<T> viewQueue = new LinkedBlockingQueue();

        @NotNull
        private final AtomicBoolean stopped = new AtomicBoolean(false);

        public Channel(@NotNull String str, @Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler performanceDependentSessionProfiler, @NotNull ViewFactory<T> viewFactory, @NotNull ViewCreator viewCreator, int i) {
            this.viewName = str;
            this.profiler = viewPoolProfiler;
            this.sessionProfiler = performanceDependentSessionProfiler;
            this.viewFactory = viewFactory;
            this.viewCreator = viewCreator;
            this.realQueueSize = new AtomicInteger(i);
            this.notEmpty = !r1.isEmpty();
            this.capacity = i;
            for (int i2 = 0; i2 < i; i2++) {
                this.viewCreator.request$div_release(this, 0);
            }
        }

        @NotNull
        public final String getViewName() {
            return this.viewName;
        }

        @Override // com.yandex.div.internal.viewpool.ViewFactory
        @NotNull
        public T createView() {
            return extractView();
        }

        public final boolean getNotEmpty() {
            return this.notEmpty;
        }

        public final int getCapacity() {
            return this.capacity;
        }

        public final void setCapacity(int i) {
            this.capacity = i;
        }

        @AnyThread
        @NotNull
        public final T extractView() {
            Companion companion = AdvanceViewPool.INSTANCE;
            long nanoTime = System.nanoTime();
            Object poll = this.viewQueue.poll();
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (poll != null) {
                this.realQueueSize.decrementAndGet();
                ViewPoolProfiler viewPoolProfiler = this.profiler;
                if (viewPoolProfiler != null) {
                    viewPoolProfiler.onViewObtainedWithoutBlock$div_release(nanoTime2);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler = this.sessionProfiler;
                String str = this.viewName;
                int size = this.viewQueue.size();
                PerformanceDependentSession performanceDependentSession = performanceDependentSessionProfiler.session;
                if (performanceDependentSession != null) {
                    performanceDependentSession.viewObtained$div_release(str, nanoTime2, size, false);
                }
            } else {
                long nanoTime3 = System.nanoTime();
                poll = extractViewBlocked();
                long nanoTime4 = System.nanoTime() - nanoTime3;
                ViewPoolProfiler viewPoolProfiler2 = this.profiler;
                if (viewPoolProfiler2 != null) {
                    viewPoolProfiler2.onViewObtainedWithBlock$div_release(this.viewName, nanoTime4);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler2 = this.sessionProfiler;
                String str2 = this.viewName;
                int size2 = this.viewQueue.size();
                PerformanceDependentSession performanceDependentSession2 = performanceDependentSessionProfiler2.session;
                if (performanceDependentSession2 != null) {
                    performanceDependentSession2.viewObtained$div_release(str2, nanoTime4, size2, true);
                }
            }
            requestViewCreation();
            Intrinsics.checkNotNull(poll);
            return (T) poll;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @AnyThread
        public final T extractViewBlocked() {
            try {
                this.viewCreator.promote$div_release(this);
                T poll = this.viewQueue.poll(MAX_WAITING_TIME, TimeUnit.MILLISECONDS);
                if (poll != null) {
                    this.realQueueSize.decrementAndGet();
                } else {
                    poll = this.viewFactory.createView();
                }
                return poll;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return this.viewFactory.createView();
            }
        }

        private final void requestViewCreation() {
            if (this.capacity <= this.realQueueSize.get()) {
                return;
            }
            Companion companion = AdvanceViewPool.INSTANCE;
            long nanoTime = System.nanoTime();
            this.viewCreator.request$div_release(this, this.viewQueue.size());
            this.realQueueSize.incrementAndGet();
            long nanoTime2 = System.nanoTime() - nanoTime;
            ViewPoolProfiler viewPoolProfiler = this.profiler;
            if (viewPoolProfiler != null) {
                viewPoolProfiler.onViewRequested$div_release(nanoTime2);
            }
        }

        @WorkerThread
        public final void createAndEnqueueView() {
            if (this.stopped.get()) {
                return;
            }
            try {
                this.viewQueue.offer(this.viewFactory.createView());
            } catch (Exception unused) {
            }
        }

        public final void stop() {
            this.stopped.set(true);
            this.viewQueue.clear();
        }
    }

    /* compiled from: AdvanceViewPool.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¨\u0006\b"}, d2 = {"Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Companion;", "", "()V", Scopes.PROFILE, "", "section", "Lkotlin/Function0;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final long profile(Function0 section) {
            long nanoTime = System.nanoTime();
            section.mo4828invoke();
            return System.nanoTime() - nanoTime;
        }
    }
}
