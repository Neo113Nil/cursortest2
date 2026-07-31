package com.google.unity.ads;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.unity.ads.UnityRewardedAd;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes12.dex */
public class UnityRewardedAd {
    private final Activity activity;
    private UnityRewardedAdCallback callback;
    private RewardedAd rewardedAd;
    private final OnPaidEventListener onPaidEventListener = new AnonymousClass1(this);
    private final FullScreenContentCallback fullScreenContentCallback = new AnonymousClass2(this);

    public void destroy() {
    }

    /* renamed from: com.google.unity.ads.UnityRewardedAd$1, reason: invalid class name */
    class AnonymousClass1 implements OnPaidEventListener {
        final /* synthetic */ UnityRewardedAd this$0;

        AnonymousClass1(UnityRewardedAd unityRewardedAd) {
            Objects.requireNonNull(unityRewardedAd);
            this.this$0 = unityRewardedAd;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass1.this.lambda$onPaidEvent$0(adValue);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPaidEvent$0(AdValue adValue) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* renamed from: com.google.unity.ads.UnityRewardedAd$2, reason: invalid class name */
    class AnonymousClass2 extends FullScreenContentCallback {
        final /* synthetic */ UnityRewardedAd this$0;

        AnonymousClass2(UnityRewardedAd unityRewardedAd) {
            Objects.requireNonNull(unityRewardedAd);
            this.this$0 = unityRewardedAd;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final AdError adError) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.lambda$onAdFailedToShowFullScreenContent$0(adError);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(AdError adError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.lambda$onAdShowedFullScreenContent$0();
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.lambda$onAdDismissedFullScreenContent$0();
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.lambda$onAdImpression$0();
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.lambda$onAdClicked$0();
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdClicked();
            }
        }
    }

    public UnityRewardedAd(Activity activity, UnityRewardedAdCallback unityRewardedAdCallback) {
        this.activity = activity;
        this.callback = unityRewardedAdCallback;
    }

    public void setRewardedAd(RewardedAd rewardedAd) {
        this.rewardedAd = rewardedAd;
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityRewardedAd.this.lambda$setRewardedAd$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRewardedAd$0() {
        this.rewardedAd.setOnPaidEventListener(this.onPaidEventListener);
        this.rewardedAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    public void loadAd(final String str, final AdRequest adRequest) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnityRewardedAd.this.lambda$loadAd$0(str, adRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAd$0(String str, AdRequest adRequest) {
        RewardedAd.load(this.activity, str, adRequest, new AnonymousClass3(this));
    }

    /* renamed from: com.google.unity.ads.UnityRewardedAd$3, reason: invalid class name */
    class AnonymousClass3 extends RewardedAdLoadCallback {
        final /* synthetic */ UnityRewardedAd this$0;

        AnonymousClass3(UnityRewardedAd unityRewardedAd) {
            Objects.requireNonNull(unityRewardedAd);
            this.this$0 = unityRewardedAd;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            this.this$0.rewardedAd = rewardedAd;
            this.this$0.rewardedAd.setOnPaidEventListener(this.this$0.onPaidEventListener);
            this.this$0.rewardedAd.setFullScreenContentCallback(this.this$0.fullScreenContentCallback);
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass3.this.lambda$onAdLoaded$0();
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onRewardedAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass3.this.lambda$onAdFailedToLoad$0(loadAdError);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onRewardedAdFailedToLoad(loadAdError);
            }
        }
    }

    public void pollAd(@NonNull String str) {
        RewardedAd pollAd = RewardedAd.pollAd(this.activity, str);
        this.rewardedAd = pollAd;
        if (pollAd == null) {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain a Rewarded Ad from the preloader.");
            final LoadAdError loadAdError = new LoadAdError(0, "Failed to obtain a Rewarded Ad from the preloader.", MobileAds.ERROR_DOMAIN, null, null);
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.this.lambda$pollAd$0(loadAdError);
                }
            }).start();
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.this.lambda$pollAd$1();
                }
            });
            this.rewardedAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$0(LoadAdError loadAdError) {
        UnityRewardedAdCallback unityRewardedAdCallback = this.callback;
        if (unityRewardedAdCallback != null) {
            unityRewardedAdCallback.onRewardedAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$1() {
        this.rewardedAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    public boolean isAdAvailable(@NonNull String str) {
        return RewardedAd.isAdAvailable(this.activity, str);
    }

    public void show() {
        if (this.rewardedAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show rewarded ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.this.lambda$show$0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        this.rewardedAd.setImmersiveMode(true);
        this.rewardedAd.show(this.activity, new AnonymousClass4(this));
    }

    /* renamed from: com.google.unity.ads.UnityRewardedAd$4, reason: invalid class name */
    class AnonymousClass4 implements OnUserEarnedRewardListener {
        final /* synthetic */ UnityRewardedAd this$0;

        AnonymousClass4(UnityRewardedAd unityRewardedAd) {
            Objects.requireNonNull(unityRewardedAd);
            this.this$0 = unityRewardedAd;
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull final RewardItem rewardItem) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass4.this.lambda$onUserEarnedReward$0(rewardItem);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUserEarnedReward$0(RewardItem rewardItem) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }
    }

    public void setServerSideVerificationOptions(final ServerSideVerificationOptions serverSideVerificationOptions) {
        if (this.rewardedAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried set server side verification before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.this.lambda$setServerSideVerificationOptions$0(serverSideVerificationOptions);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setServerSideVerificationOptions$0(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.rewardedAd.setServerSideVerificationOptions(serverSideVerificationOptions);
    }

    @Nullable
    public String getAdUnitId() {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            return null;
        }
        return rewardedAd.getAdUnitId();
    }

    public long getPlacementId() {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            return 0L;
        }
        return rewardedAd.getPlacementId();
    }

    public void setPlacementId(long j) {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.setPlacementId(j);
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return rewardedAd.getResponseInfo();
    }

    @Nullable
    public RewardItem getRewardItem() {
        if (this.rewardedAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get reward item before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
            return null;
        }
        FutureTask futureTask = new FutureTask(new Callable<RewardItem>(this) { // from class: com.google.unity.ads.UnityRewardedAd.5
            final /* synthetic */ UnityRewardedAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RewardItem call() {
                return this.this$0.rewardedAd.getRewardItem();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (RewardItem) futureTask.get();
        } catch (InterruptedException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to get reward item: %s", e.getLocalizedMessage()));
            return null;
        } catch (ExecutionException e2) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to get reward item: %s", e2.getLocalizedMessage()));
            return null;
        }
    }
}
