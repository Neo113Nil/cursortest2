package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4577be implements V<RewardedAd> {

    @NotNull
    private final InterfaceC4704ig a;

    @NotNull
    private final RewardedAdLoaderListener b;

    public C4577be(@NotNull InterfaceC4704ig threadManager, @NotNull RewardedAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void b(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.a.a(new Runnable() { // from class: com.ironsource.be$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4577be.a(C4577be.this, error);
            }
        });
    }

    @Override // com.ironsource.V
    public void a(@NotNull final RewardedAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.a.a(new Runnable() { // from class: com.ironsource.be$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4577be.a(RewardedAd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd adObject, C4577be this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onRewardedAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4577be this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.b.onRewardedAdLoadFailed(error);
    }
}
