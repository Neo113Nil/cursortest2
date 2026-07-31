package com.ogury.ad.async;

import io.appmetrica.analytics.impl.M2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0006\u0010\u0014\u001a\u00020\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\f\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ogury/ad/async/Schedulers;", "Lcom/ogury/ad/async/SchedulersFactory;", "()V", "backgroundScheduler", "Lcom/ogury/ad/async/Scheduler;", "getBackgroundScheduler", "()Lcom/ogury/ad/async/Scheduler;", "backgroundScheduler$delegate", "Lkotlin/Lazy;", "mainThreadScheduler", "getMainThreadScheduler", "mainThreadScheduler$delegate", "schedulersFactory", "getSchedulersFactory", "()Lcom/ogury/ad/async/SchedulersFactory;", "setSchedulersFactory", "(Lcom/ogury/ad/async/SchedulersFactory;)V", M2.g, "createBackgroundScheduler", "createMainThreadScheduler", "mainThread", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Schedulers implements SchedulersFactory {

    @NotNull
    public static final Schedulers INSTANCE;

    /* renamed from: backgroundScheduler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy backgroundScheduler;

    /* renamed from: mainThreadScheduler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mainThreadScheduler;

    @NotNull
    private static SchedulersFactory schedulersFactory;

    static {
        Schedulers schedulers = new Schedulers();
        INSTANCE = schedulers;
        schedulersFactory = schedulers;
        backgroundScheduler = LazyKt.lazy(new Function0() { // from class: com.ogury.ad.async.Schedulers$backgroundScheduler$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Scheduler mo4828invoke() {
                return Schedulers.INSTANCE.getSchedulersFactory().createBackgroundScheduler();
            }
        });
        mainThreadScheduler = LazyKt.lazy(new Function0() { // from class: com.ogury.ad.async.Schedulers$mainThreadScheduler$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Scheduler mo4828invoke() {
                return Schedulers.INSTANCE.getSchedulersFactory().createMainThreadScheduler();
            }
        });
    }

    private Schedulers() {
    }

    private final Scheduler getBackgroundScheduler() {
        return (Scheduler) backgroundScheduler.getValue();
    }

    private final Scheduler getMainThreadScheduler() {
        return (Scheduler) mainThreadScheduler.getValue();
    }

    @NotNull
    public final Scheduler background() {
        return getBackgroundScheduler();
    }

    @Override // com.ogury.ad.async.SchedulersFactory
    @NotNull
    public Scheduler createBackgroundScheduler() {
        return new BackgroundScheduler();
    }

    @Override // com.ogury.ad.async.SchedulersFactory
    @NotNull
    public Scheduler createMainThreadScheduler() {
        return new MainThreadScheduler();
    }

    @NotNull
    public final SchedulersFactory getSchedulersFactory() {
        return schedulersFactory;
    }

    @NotNull
    public final Scheduler mainThread() {
        return getMainThreadScheduler();
    }

    public final void setSchedulersFactory(@NotNull SchedulersFactory schedulersFactory2) {
        Intrinsics.checkNotNullParameter(schedulersFactory2, "<set-?>");
        schedulersFactory = schedulersFactory2;
    }
}
