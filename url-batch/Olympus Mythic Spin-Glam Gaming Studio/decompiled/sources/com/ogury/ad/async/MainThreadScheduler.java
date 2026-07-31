package com.ogury.ad.async;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ogury/ad/async/MainThreadScheduler;", "Lcom/ogury/ad/async/Scheduler;", "()V", "mainThreadHandler", "Landroid/os/Handler;", "scheduleJob", "", "runnable", "Ljava/lang/Runnable;", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MainThreadScheduler implements Scheduler {

    @NotNull
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    @Override // com.ogury.ad.async.Scheduler
    public void scheduleJob(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.mainThreadHandler.post(runnable);
    }
}
