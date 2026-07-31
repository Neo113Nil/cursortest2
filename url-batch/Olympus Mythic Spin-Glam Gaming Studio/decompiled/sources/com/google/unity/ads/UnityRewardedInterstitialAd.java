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
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.unity.ads.UnityRewardedInterstitialAd;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class UnityRewardedInterstitialAd {
    private Activity activity;
    private UnityRewardedInterstitialAdCallback callback;
    private RewardedInterstitialAd rewardedInterstitialAd;

    public void destroy() {
    }

    public UnityRewardedInterstitialAd(Activity activity, UnityRewardedInterstitialAdCallback unityRewardedInterstitialAdCallback) {
        this.activity = activity;
        this.callback = unityRewardedInterstitialAdCallback;
    }

    /* renamed from: com.google.unity.ads.UnityRewardedInterstitialAd$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;
        final /* synthetic */ String val$adUnitId;
        final /* synthetic */ AdRequest val$request;

        AnonymousClass1(UnityRewardedInterstitialAd unityRewardedInterstitialAd, String str, AdRequest adRequest) {
            this.val$adUnitId = str;
            this.val$request = adRequest;
            Objects.requireNonNull(unityRewardedInterstitialAd);
            this.this$0 = unityRewardedInterstitialAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardedInterstitialAd.load(this.this$0.activity, this.val$adUnitId, this.val$request, new C02531(this));
        }

        /* renamed from: com.google.unity.ads.UnityRewardedInterstitialAd$1$1, reason: invalid class name and collision with other inner class name */
        class C02531 extends RewardedInterstitialAdLoadCallback {
            final /* synthetic */ AnonymousClass1 this$1;

            C02531(AnonymousClass1 anonymousClass1) {
                Objects.requireNonNull(anonymousClass1);
                this.this$1 = anonymousClass1;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {
                this.this$1.this$0.rewardedInterstitialAd = rewardedInterstitialAd;
                this.this$1.this$0.rewardedInterstitialAd.setOnPaidEventListener(new OnPaidEventListener(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.1
                    final /* synthetic */ C02531 this$2;

                    {
                        Objects.requireNonNull(this);
                        this.this$2 = this;
                    }

                    @Override // com.google.android.gms.ads.OnPaidEventListener
                    public void onPaidEvent(final AdValue adValue) {
                        new Thread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.1.1
                            final /* synthetic */ C02541 this$3;

                            {
                                Objects.requireNonNull(this);
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (this.this$3.this$2.this$1.this$0.callback != null) {
                                    this.this$3.this$2.this$1.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
                                }
                            }
                        }).start();
                    }
                });
                this.this$1.this$0.rewardedInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2
                    final /* synthetic */ C02531 this$2;

                    {
                        Objects.requireNonNull(this);
                        this.this$2 = this;
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(final AdError adError) {
                        new Thread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.1
                            final /* synthetic */ AnonymousClass2 this$3;

                            {
                                Objects.requireNonNull(this);
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (this.this$3.this$2.this$1.this$0.callback != null) {
                                    this.this$3.this$2.this$1.this$0.callback.onAdFailedToShowFullScreenContent(adError);
                                }
                            }
                        }).start();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        new Thread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.2
                            final /* synthetic */ AnonymousClass2 this$3;

                            {
                                Objects.requireNonNull(this);
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (this.this$3.this$2.this$1.this$0.callback != null) {
                                    this.this$3.this$2.this$1.this$0.callback.onAdShowedFullScreenContent();
                                }
                            }
                        }).start();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        new Thread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.3
                            final /* synthetic */ AnonymousClass2 this$3;

                            {
                                Objects.requireNonNull(this);
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (this.this$3.this$2.this$1.this$0.callback != null) {
                                    this.this$3.this$2.this$1.this$0.callback.onAdDismissedFullScreenContent();
                                }
                            }
                        }).start();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdImpression() {
                        new Thread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.4
                            final /* synthetic */ AnonymousClass2 this$3;

                            {
                                Objects.requireNonNull(this);
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (this.this$3.this$2.this$1.this$0.callback != null) {
                                    this.this$3.this$2.this$1.this$0.callback.onAdImpression();
                                }
                            }
                        }).start();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdClicked() {
                        new Thread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.5
                            final /* synthetic */ AnonymousClass2 this$3;

                            {
                                Objects.requireNonNull(this);
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (this.this$3.this$2.this$1.this$0.callback != null) {
                                    this.this$3.this$2.this$1.this$0.callback.onAdClicked();
                                }
                            }
                        }).start();
                    }
                });
                new Thread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.3
                    final /* synthetic */ C02531 this$2;

                    {
                        Objects.requireNonNull(this);
                        this.this$2 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (this.this$2.this$1.this$0.callback != null) {
                            this.this$2.this$1.this$0.callback.onRewardedInterstitialAdLoaded();
                        }
                    }
                }).start();
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(final LoadAdError loadAdError) {
                new Thread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.4
                    final /* synthetic */ C02531 this$2;

                    {
                        Objects.requireNonNull(this);
                        this.this$2 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (this.this$2.this$1.this$0.callback != null) {
                            this.this$2.this$1.this$0.callback.onRewardedInterstitialAdFailedToLoad(loadAdError);
                        }
                    }
                }).start();
            }
        }
    }

    public void loadAd(String str, AdRequest adRequest) {
        this.activity.runOnUiThread(new AnonymousClass1(this, str, adRequest));
    }

    public void show() {
        if (this.rewardedInterstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show rewarded interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.2
                final /* synthetic */ UnityRewardedInterstitialAd this$0;

                {
                    Objects.requireNonNull(this);
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$0.rewardedInterstitialAd.setImmersiveMode(true);
                    this.this$0.rewardedInterstitialAd.show(this.this$0.activity, new AnonymousClass1(this));
                }

                /* renamed from: com.google.unity.ads.UnityRewardedInterstitialAd$2$1, reason: invalid class name */
                class AnonymousClass1 implements OnUserEarnedRewardListener {
                    final /* synthetic */ AnonymousClass2 this$1;

                    AnonymousClass1(AnonymousClass2 anonymousClass2) {
                        Objects.requireNonNull(anonymousClass2);
                        this.this$1 = anonymousClass2;
                    }

                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public void onUserEarnedReward(@NonNull final RewardItem rewardItem) {
                        new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd$2$1$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                UnityRewardedInterstitialAd.AnonymousClass2.AnonymousClass1.this.lambda$onUserEarnedReward$0(rewardItem);
                            }
                        }).start();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ void lambda$onUserEarnedReward$0(RewardItem rewardItem) {
                        if (this.this$1.this$0.callback != null) {
                            this.this$1.this$0.callback.onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
                        }
                    }
                }
            });
        }
    }

    public long getPlacementId() {
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd == null) {
            return 0L;
        }
        return rewardedInterstitialAd.getPlacementId();
    }

    public void setPlacementId(long j) {
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd == null) {
            return;
        }
        rewardedInterstitialAd.setPlacementId(j);
    }

    public void setServerSideVerificationOptions(final ServerSideVerificationOptions serverSideVerificationOptions) {
        if (this.rewardedInterstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to set server side verification before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.3
                final /* synthetic */ UnityRewardedInterstitialAd this$0;

                {
                    Objects.requireNonNull(this);
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$0.rewardedInterstitialAd.setServerSideVerificationOptions(serverSideVerificationOptions);
                }
            });
        }
    }

    @Nullable
    public String getAdUnitId() {
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd == null) {
            return null;
        }
        return rewardedInterstitialAd.getAdUnitId();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return rewardedInterstitialAd.getResponseInfo();
    }

    @Nullable
    public RewardItem getRewardItem() {
        if (this.rewardedInterstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get reward item before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
            return null;
        }
        FutureTask futureTask = new FutureTask(new Callable<RewardItem>(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.4
            final /* synthetic */ UnityRewardedInterstitialAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RewardItem call() {
                return this.this$0.rewardedInterstitialAd.getRewardItem();
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
