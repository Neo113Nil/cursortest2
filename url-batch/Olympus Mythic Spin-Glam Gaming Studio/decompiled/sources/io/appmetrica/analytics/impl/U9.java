package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class U9 implements IHandlerExecutor {
    public final Looper a;
    public final Handler b;
    public final HandlerThreadC5824yb c;

    public U9(@NonNull String str) {
        this(a(str));
    }

    public static HandlerThreadC5824yb a(String str) {
        HandlerThreadC5824yb handlerThreadC5824yb = new HandlerThreadC5824yb(str + "-" + Td.a.incrementAndGet());
        handlerThreadC5824yb.start();
        return handlerThreadC5824yb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j) {
        this.b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        HandlerThreadC5824yb handlerThreadC5824yb = this.c;
        synchronized (handlerThreadC5824yb) {
            z = handlerThreadC5824yb.a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC5824yb handlerThreadC5824yb = this.c;
        synchronized (handlerThreadC5824yb) {
            handlerThreadC5824yb.a = false;
            handlerThreadC5824yb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.b.post(futureTask);
        return futureTask;
    }

    public U9(HandlerThreadC5824yb handlerThreadC5824yb) {
        this(handlerThreadC5824yb, handlerThreadC5824yb.getLooper(), new Handler(handlerThreadC5824yb.getLooper()));
    }

    @VisibleForTesting
    public U9(@NonNull HandlerThreadC5824yb handlerThreadC5824yb, @NonNull Looper looper, @NonNull Handler handler) {
        this.c = handlerThreadC5824yb;
        this.a = looper;
        this.b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        this.b.postDelayed(runnable, timeUnit.toMillis(j));
    }
}
