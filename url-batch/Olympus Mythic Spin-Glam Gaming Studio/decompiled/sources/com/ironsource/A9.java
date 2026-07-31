package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class A9 implements V<InterstitialAd> {

    @NotNull
    private final InterfaceC4704ig a;

    @NotNull
    private final InterstitialAdLoaderListener b;

    public A9(@NotNull InterfaceC4704ig threadManager, @NotNull InterstitialAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void b(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(new Runnable() { // from class: com.ironsource.A9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                A9.a(IronSourceError.this, this);
            }
        });
    }

    @Override // com.ironsource.V
    public void a(@NotNull final InterstitialAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.a.a(new Runnable() { // from class: com.ironsource.A9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                A9.a(InterstitialAd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd adObject, A9 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onInterstitialAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, A9 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.b.onInterstitialAdLoadFailed(error);
    }
}
