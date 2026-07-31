package com.unity3d.ironsourceads.rewarded;

import com.ironsource.Bb;
import com.ironsource.C4595ce;
import com.ironsource.C4736kc;
import com.ironsource.Eb;
import com.ironsource.R7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class RewardedAdLoader {

    @NotNull
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();

    @NotNull
    private static final Executor a = R7.a.d();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Bb loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(@NotNull RewardedAdRequest adRequest, @NotNull RewardedAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(a, new C4595ce(adRequest, listener, C4736kc.e.a(IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Eb loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final Bb a2 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: com.unity3d.ironsourceads.rewarded.RewardedAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoader.a(Bb.this);
            }
        });
    }
}
