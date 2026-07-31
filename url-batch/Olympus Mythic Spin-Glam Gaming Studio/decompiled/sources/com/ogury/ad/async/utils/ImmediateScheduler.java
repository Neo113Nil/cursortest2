package com.ogury.ad.async.utils;

import com.ogury.ad.async.Scheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ogury/ad/async/utils/ImmediateScheduler;", "Lcom/ogury/ad/async/Scheduler;", "()V", "scheduleJob", "", "runnable", "Ljava/lang/Runnable;", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ImmediateScheduler implements Scheduler {
    @Override // com.ogury.ad.async.Scheduler
    public void scheduleJob(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        runnable.run();
    }
}
