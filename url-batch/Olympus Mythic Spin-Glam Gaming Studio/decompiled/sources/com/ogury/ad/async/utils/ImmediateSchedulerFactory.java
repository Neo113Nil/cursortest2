package com.ogury.ad.async.utils;

import com.ogury.ad.async.Scheduler;
import com.ogury.ad.async.Schedulers;
import com.ogury.ad.async.SchedulersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ogury/ad/async/utils/ImmediateSchedulerFactory;", "Lcom/ogury/ad/async/SchedulersFactory;", "()V", "createBackgroundScheduler", "Lcom/ogury/ad/async/Scheduler;", "createMainThreadScheduler", "Companion", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ImmediateSchedulerFactory implements SchedulersFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ogury/ad/async/utils/ImmediateSchedulerFactory$Companion;", "", "()V", "executeAsyncCallbacksOnTheSameThread", "", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void executeAsyncCallbacksOnTheSameThread() {
            Schedulers.INSTANCE.setSchedulersFactory(new ImmediateSchedulerFactory());
        }

        private Companion() {
        }
    }

    @Override // com.ogury.ad.async.SchedulersFactory
    @NotNull
    public Scheduler createBackgroundScheduler() {
        return new ImmediateScheduler();
    }

    @Override // com.ogury.ad.async.SchedulersFactory
    @NotNull
    public Scheduler createMainThreadScheduler() {
        return new ImmediateScheduler();
    }
}
