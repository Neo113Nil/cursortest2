package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4584c3 implements V<BannerAdView> {

    @NotNull
    private final InterfaceC4704ig a;

    @NotNull
    private final BannerAdLoaderListener b;

    public C4584c3(@NotNull InterfaceC4704ig threadManager, @NotNull BannerAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void b(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(new Runnable() { // from class: com.ironsource.c3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4584c3.a(IronSourceError.this, this);
            }
        });
    }

    @Override // com.ironsource.V
    public void a(@NotNull final BannerAdView adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.a.a(new Runnable() { // from class: com.ironsource.c3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4584c3.a(BannerAdView.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView adObject, C4584c3 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onBannerAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C4584c3 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.b.onBannerAdLoadFailed(error);
    }
}
