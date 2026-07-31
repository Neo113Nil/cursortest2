package com.ogury.ad.async;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ogury/ad/async/SchedulersFactory;", "", "createBackgroundScheduler", "Lcom/ogury/ad/async/Scheduler;", "createMainThreadScheduler", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SchedulersFactory {
    @NotNull
    Scheduler createBackgroundScheduler();

    @NotNull
    Scheduler createMainThreadScheduler();
}
