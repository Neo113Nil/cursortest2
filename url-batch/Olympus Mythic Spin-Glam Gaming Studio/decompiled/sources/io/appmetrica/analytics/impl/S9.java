package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class S9 implements ExecutorProvider {
    public final Bk a;
    public final IHandlerExecutor b;

    public S9() {
        Bk w = Ka.k().w();
        this.a = w;
        this.b = w.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return this.a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final InterruptionSafeThread getInterruptionThread(@NotNull String str, @NotNull String str2, @NotNull Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + Td.a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getModuleExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getReportRunnableExecutor() {
        return this.a.f();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getSupportIOExecutor() {
        return this.a.g();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getUiExecutor() {
        Bk bk = this.a;
        if (bk.h == null) {
            synchronized (bk) {
                try {
                    if (bk.h == null) {
                        bk.a.getClass();
                        bk.h = new ExecutorC5859zk(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return bk.h;
    }
}
