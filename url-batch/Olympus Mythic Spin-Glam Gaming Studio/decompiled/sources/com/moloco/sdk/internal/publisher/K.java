package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@VisibleForTesting
/* loaded from: classes3.dex */
public final class K implements RewardedInterstitialAdShowListener, AdShowListener {
    public static final int e = 0;
    public final /* synthetic */ AdShowListener a;

    @Nullable
    public final RewardedInterstitialAdShowListener b;

    @NotNull
    public final Function0 c;

    @NotNull
    public final com.moloco.sdk.internal.y d;

    public K(@Nullable RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, @NotNull Function0 provideSdkEvents, @NotNull com.moloco.sdk.internal.y sdkEventUrlTracker) {
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        this.a = C5034j.a(rewardedInterstitialAdShowListener);
        this.b = rewardedInterstitialAdShowListener;
        this.c = provideSdkEvents;
        this.d = sdkEventUrlTracker;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(@NotNull MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onAdShowSuccess(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(@NotNull MolocoAd molocoAd) {
        String onRewardedVideoCompleted;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.B b = (com.moloco.sdk.internal.ortb.model.B) this.c.mo4828invoke();
        if (b != null && (onRewardedVideoCompleted = b.getOnRewardedVideoCompleted()) != null) {
            y.a.a(this.d, onRewardedVideoCompleted, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoCompleted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(@NotNull MolocoAd molocoAd) {
        String onRewardedVideoStarted;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.B b = (com.moloco.sdk.internal.ortb.model.B) this.c.mo4828invoke();
        if (b != null && (onRewardedVideoStarted = b.getOnRewardedVideoStarted()) != null) {
            y.a.a(this.d, onRewardedVideoStarted, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(@NotNull MolocoAd molocoAd) {
        String onUserRewarded;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.B b = (com.moloco.sdk.internal.ortb.model.B) this.c.mo4828invoke();
        if (b != null && (onUserRewarded = b.getOnUserRewarded()) != null) {
            y.a.a(this.d, onUserRewarded, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onUserRewarded(molocoAd);
        }
    }
}
