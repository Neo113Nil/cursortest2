package com.ogury.ad.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ogury/ad/async/BackgroundScheduler;", "Lcom/ogury/ad/async/Scheduler;", "()V", "threadPoolExecutor", "Ljava/util/concurrent/ExecutorService;", "scheduleJob", "", "runnable", "Ljava/lang/Runnable;", "Companion", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BackgroundScheduler implements Scheduler {
    private static final int MIN_NR_OF_CACHED_THREADS = 4;

    @NotNull
    private final ExecutorService threadPoolExecutor;

    public BackgroundScheduler() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(4, Runtime.getRuntime().availableProcessors()));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(...)");
        this.threadPoolExecutor = newFixedThreadPool;
    }

    @Override // com.ogury.ad.async.Scheduler
    public void scheduleJob(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.threadPoolExecutor.execute(runnable);
    }
}
