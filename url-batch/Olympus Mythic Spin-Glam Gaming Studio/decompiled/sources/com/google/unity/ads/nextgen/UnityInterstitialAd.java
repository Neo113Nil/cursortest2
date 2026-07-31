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
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdEventCallback;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.nextgen.UnityInterstitialAd;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes15.dex */
public class UnityInterstitialAd extends UnityAdBase<InterstitialAd, UnityInterstitialAdCallback> {
    private final AdWrapper<InterstitialAd> adWrapper;

    public UnityInterstitialAd(Activity activity, UnityInterstitialAdCallback unityInterstitialAdCallback) {
        this(activity, unityInterstitialAdCallback, AdWrapper.forInterstitial(), Executors.newSingleThreadExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityInterstitialAd(Activity activity, UnityInterstitialAdCallback unityInterstitialAdCallback, InterstitialAd interstitialAd) {
        this(activity, unityInterstitialAdCallback, AdWrapper.forInterstitial(), Executors.newSingleThreadExecutor());
        this.ad = interstitialAd;
    }

    @VisibleForTesting
    UnityInterstitialAd(Activity activity, UnityInterstitialAdCallback unityInterstitialAdCallback, AdWrapper<InterstitialAd> adWrapper, Executor executor) {
        super(activity, unityInterstitialAdCallback, executor);
        this.adWrapper = adWrapper;
    }

    @VisibleForTesting
    InterstitialAd getInterstitialAd() {
        return (InterstitialAd) this.ad;
    }

    public void load(final AdRequest adRequest) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityInterstitialAd.this.lambda$load$0(adRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityInterstitialAd$1, reason: invalid class name */
    class AnonymousClass1 implements AdLoadCallback<InterstitialAd> {
        final /* synthetic */ UnityInterstitialAd this$0;

        AnonymousClass1(UnityInterstitialAd unityInterstitialAd) {
            Objects.requireNonNull(unityInterstitialAd);
            this.this$0 = unityInterstitialAd;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            UnityInterstitialAd unityInterstitialAd = this.this$0;
            unityInterstitialAd.ad = interstitialAd;
            unityInterstitialAd.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAd.AnonymousClass1.this.lambda$onAdLoaded$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onInterstitialAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull final LoadAdError loadAdError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAd.AnonymousClass1.this.lambda$onAdFailedToLoad$0(loadAdError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onInterstitialAdFailedToLoad(loadAdError);
            }
        }
    }

    public void show() {
        AdT adt = this.ad;
        if (adt == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show intertitial ad before it was ready. Please call loadAd first and wait for a successful onAdLoaded callback.");
        } else {
            ((InterstitialAd) adt).setAdEventCallback(new AnonymousClass2(this));
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAd.this.lambda$show$0();
                }
            });
        }
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityInterstitialAd$2, reason: invalid class name */
    class AnonymousClass2 implements InterstitialAdEventCallback {
        final /* synthetic */ UnityInterstitialAd this$0;

        AnonymousClass2(UnityInterstitialAd unityInterstitialAd) {
            Objects.requireNonNull(unityInterstitialAd);
            this.this$0 = unityInterstitialAd;
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAd.AnonymousClass2.this.lambda$onAdShowedFullScreenContent$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdShowedFullScreenContent();
            }
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAd.AnonymousClass2.this.lambda$onAdDismissedFullScreenContent$0();
                }
            });
            this.this$0.ad = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdDismissedFullScreenContent();
            }
        }

        public void onAdFailedToShowFullScreenContent(@NonNull final FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAd.AnonymousClass2.this.lambda$onAdFailedToShowFullScreenContent$0(fullScreenContentError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(FullScreenContentError fullScreenContentError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAd.AnonymousClass2.this.lambda$onAdImpression$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdImpression();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAd.AnonymousClass2.this.lambda$onAdClicked$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdClicked();
            }
        }

        public void onAdPaid(@NonNull final AdValue adValue) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAd.AnonymousClass2.this.lambda$onAdPaid$0(adValue);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPaid$0(AdValue adValue) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        ((InterstitialAd) this.ad).setImmersiveMode(true);
        ((InterstitialAd) this.ad).show(this.activity);
    }

    public long getPlacementId() {
        AdT adt = this.ad;
        if (adt == 0) {
            return 0L;
        }
        return ((InterstitialAd) adt).getPlacementId();
    }

    public void setPlacementId(long j) {
        AdT adt = this.ad;
        if (adt == 0) {
            return;
        }
        ((InterstitialAd) adt).setPlacementId(j);
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        AdT adt = this.ad;
        if (adt == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return ((InterstitialAd) adt).getResponseInfo();
    }
}
