package com.unity3d.ironsourceads.interstitial;

import com.ironsource.B9;
import com.ironsource.Bb;
import com.ironsource.C4736kc;
import com.ironsource.Eb;
import com.ironsource.R7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class InterstitialAdLoader {

    @NotNull
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();

    @NotNull
    private static final Executor a = R7.a.d();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Bb loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(@NotNull InterstitialAdRequest adRequest, @NotNull InterstitialAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(a, new B9(adRequest, listener, C4736kc.e.a(IronSource.a.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Eb loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final Bb a2 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: com.unity3d.ironsourceads.interstitial.InterstitialAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoader.a(Bb.this);
            }
        });
    }
}
