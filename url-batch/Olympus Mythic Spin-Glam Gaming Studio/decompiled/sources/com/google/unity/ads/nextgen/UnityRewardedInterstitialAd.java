package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.rewarded.OnUserEarnedRewardListener;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardItem;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAdEventCallback;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.nextgen.UnityRewardedInterstitialAd;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes12.dex */
public class UnityRewardedInterstitialAd extends UnityAdBase<RewardedInterstitialAd, UnityRewardedInterstitialAdCallback> {
    private final AdWrapper<RewardedInterstitialAd> adWrapper;

    public UnityRewardedInterstitialAd(Activity activity, UnityRewardedInterstitialAdCallback unityRewardedInterstitialAdCallback) {
        this(activity, unityRewardedInterstitialAdCallback, AdWrapper.forRewardedInterstitial(), Executors.newSingleThreadExecutor());
    }

    @VisibleForTesting
    UnityRewardedInterstitialAd(Activity activity, UnityRewardedInterstitialAdCallback unityRewardedInterstitialAdCallback, AdWrapper<RewardedInterstitialAd> adWrapper, Executor executor) {
        super(activity, unityRewardedInterstitialAdCallback, executor);
        this.adWrapper = adWrapper;
    }

    public void load(final AdRequest adRequest) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityRewardedInterstitialAd.this.lambda$load$0(adRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$1, reason: invalid class name */
    class AnonymousClass1 implements AdLoadCallback<RewardedInterstitialAd> {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;

        AnonymousClass1(UnityRewardedInterstitialAd unityRewardedInterstitialAd) {
            Objects.requireNonNull(unityRewardedInterstitialAd);
            this.this$0 = unityRewardedInterstitialAd;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {
            UnityRewardedInterstitialAd unityRewardedInterstitialAd = this.this$0;
            unityRewardedInterstitialAd.ad = rewardedInterstitialAd;
            unityRewardedInterstitialAd.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.AnonymousClass1.this.lambda$onAdLoaded$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onRewardedInterstitialAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull final LoadAdError loadAdError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.AnonymousClass1.this.lambda$onAdFailedToLoad$0(loadAdError);
                }
            });
            this.this$0.ad = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onRewardedInterstitialAdFailedToLoad(loadAdError);
            }
        }
    }

    public void show() {
        AdT adt = this.ad;
        if (adt == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show rewarded interstitial ad before it was ready. Please call load first and wait for a successful onAdLoaded callback.");
        } else {
            ((RewardedInterstitialAd) adt).setAdEventCallback(new AnonymousClass2(this));
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.this.lambda$show$0();
                }
            });
        }
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2, reason: invalid class name */
    class AnonymousClass2 implements RewardedInterstitialAdEventCallback {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;

        AnonymousClass2(UnityRewardedInterstitialAd unityRewardedInterstitialAd) {
            Objects.requireNonNull(unityRewardedInterstitialAd);
            this.this$0 = unityRewardedInterstitialAd;
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.AnonymousClass2.this.lambda$onAdShowedFullScreenContent$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdShowedFullScreenContent();
            }
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.AnonymousClass2.this.lambda$onAdDismissedFullScreenContent$0();
                }
            });
            this.this$0.ad = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdDismissedFullScreenContent();
            }
        }

        public void onAdFailedToShowFullScreenContent(@NonNull final FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.AnonymousClass2.this.lambda$onAdFailedToShowFullScreenContent$0(fullScreenContentError);
                }
            });
            this.this$0.ad = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(FullScreenContentError fullScreenContentError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.AnonymousClass2.this.lambda$onAdImpression$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdImpression();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.AnonymousClass2.this.lambda$onAdClicked$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdClicked();
            }
        }

        public void onAdPaid(@NonNull final AdValue adValue) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.AnonymousClass2.this.lambda$onAdPaid$0(adValue);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPaid$0(AdValue adValue) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        ((RewardedInterstitialAd) this.ad).setImmersiveMode(true);
        ((RewardedInterstitialAd) this.ad).show(this.activity, new AnonymousClass3(this));
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$3, reason: invalid class name */
    class AnonymousClass3 implements OnUserEarnedRewardListener {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;

        AnonymousClass3(UnityRewardedInterstitialAd unityRewardedInterstitialAd) {
            Objects.requireNonNull(unityRewardedInterstitialAd);
            this.this$0 = unityRewardedInterstitialAd;
        }

        public void onUserEarnedReward(@NonNull final RewardItem rewardItem) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedInterstitialAd.AnonymousClass3.this.lambda$onUserEarnedReward$0(rewardItem);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUserEarnedReward$0(RewardItem rewardItem) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }
    }

    public long getPlacementId() {
        AdT adt = this.ad;
        if (adt == 0) {
            return 0L;
        }
        return ((RewardedInterstitialAd) adt).getPlacementId();
    }

    public void setPlacementId(long j) {
        AdT adt = this.ad;
        if (adt == 0) {
            return;
        }
        ((RewardedInterstitialAd) adt).setPlacementId(j);
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        AdT adt = this.ad;
        if (adt == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return ((RewardedInterstitialAd) adt).getResponseInfo();
    }
}
