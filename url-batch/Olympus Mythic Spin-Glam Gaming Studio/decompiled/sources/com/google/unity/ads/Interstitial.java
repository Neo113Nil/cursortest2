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
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.unity.ads.Interstitial;
import java.util.Objects;

/* loaded from: classes12.dex */
public class Interstitial {
    private final Activity activity;
    private final UnityInterstitialAdCallback callback;
    private InterstitialAd interstitialAd;
    private final FullScreenContentCallback fullScreenContentCallback = new AnonymousClass1(this);
    private final OnPaidEventListener onPaidEventListener = new AnonymousClass2(this);

    public void destroy() {
    }

    /* renamed from: com.google.unity.ads.Interstitial$1, reason: invalid class name */
    class AnonymousClass1 extends FullScreenContentCallback {
        final /* synthetic */ Interstitial this$0;

        AnonymousClass1(Interstitial interstitial) {
            Objects.requireNonNull(interstitial);
            this.this$0 = interstitial;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final AdError adError) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.AnonymousClass1.this.lambda$onAdFailedToShowFullScreenContent$0(adError);
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
            new Thread(new Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.AnonymousClass1.this.lambda$onAdShowedFullScreenContent$0();
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
            new Thread(new Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.AnonymousClass1.this.lambda$onAdDismissedFullScreenContent$0();
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
            new Thread(new Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.AnonymousClass1.this.lambda$onAdImpression$0();
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
            new Thread(new Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.AnonymousClass1.this.lambda$onAdClicked$0();
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

    public Interstitial(Activity activity, UnityInterstitialAdCallback unityInterstitialAdCallback) {
        this.activity = activity;
        this.callback = unityInterstitialAdCallback;
    }

    public void setInterstitialAd(InterstitialAd interstitialAd) {
        this.interstitialAd = interstitialAd;
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.Interstitial$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Interstitial.this.lambda$setInterstitialAd$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setInterstitialAd$0() {
        this.interstitialAd.setOnPaidEventListener(this.onPaidEventListener);
        this.interstitialAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    /* renamed from: com.google.unity.ads.Interstitial$2, reason: invalid class name */
    class AnonymousClass2 implements OnPaidEventListener {
        final /* synthetic */ Interstitial this$0;

        AnonymousClass2(Interstitial interstitial) {
            Objects.requireNonNull(interstitial);
            this.this$0 = interstitial;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.Interstitial$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.AnonymousClass2.this.lambda$onPaidEvent$0(adValue);
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

    public void loadAd(final String str, final AdRequest adRequest) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.Interstitial$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Interstitial.this.lambda$loadAd$0(str, adRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAd$0(String str, AdRequest adRequest) {
        InterstitialAd.load(this.activity, str, adRequest, new AnonymousClass3(this));
    }

    /* renamed from: com.google.unity.ads.Interstitial$3, reason: invalid class name */
    class AnonymousClass3 extends InterstitialAdLoadCallback {
        final /* synthetic */ Interstitial this$0;

        AnonymousClass3(Interstitial interstitial) {
            Objects.requireNonNull(interstitial);
            this.this$0 = interstitial;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            this.this$0.interstitialAd = interstitialAd;
            this.this$0.interstitialAd.setOnPaidEventListener(this.this$0.onPaidEventListener);
            this.this$0.interstitialAd.setFullScreenContentCallback(this.this$0.fullScreenContentCallback);
            new Thread(new Runnable() { // from class: com.google.unity.ads.Interstitial$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.AnonymousClass3.this.lambda$onAdLoaded$0();
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onInterstitialAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.Interstitial$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.AnonymousClass3.this.lambda$onAdFailedToLoad$0(loadAdError);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onInterstitialAdFailedToLoad(loadAdError);
            }
        }
    }

    public boolean isAdAvailable(@NonNull String str) {
        return InterstitialAd.isAdAvailable(this.activity, str);
    }

    public void pollAd(@NonNull String str) {
        InterstitialAd pollAd = InterstitialAd.pollAd(this.activity, str);
        this.interstitialAd = pollAd;
        if (pollAd == null) {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain an Interstitial Ad from the preloader.");
            final LoadAdError loadAdError = new LoadAdError(0, "Failed to obtain an Interstitial Ad from the preloader.", MobileAds.ERROR_DOMAIN, null, null);
            new Thread(new Runnable() { // from class: com.google.unity.ads.Interstitial$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.this.lambda$pollAd$0(loadAdError);
                }
            }).start();
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.Interstitial$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.this.lambda$pollAd$1();
                }
            });
            this.interstitialAd.setFullScreenContentCallback(this.fullScreenContentCallback);
            UnityInterstitialAdCallback unityInterstitialAdCallback = this.callback;
            if (unityInterstitialAdCallback != null) {
                unityInterstitialAdCallback.onInterstitialAdLoaded();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$0(LoadAdError loadAdError) {
        UnityInterstitialAdCallback unityInterstitialAdCallback = this.callback;
        if (unityInterstitialAdCallback != null) {
            unityInterstitialAdCallback.onInterstitialAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$1() {
        this.interstitialAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    public long getPlacementId() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            return 0L;
        }
        return interstitialAd.getPlacementId();
    }

    public void setPlacementId(long j) {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.setPlacementId(j);
    }

    @Nullable
    public String getAdUnitId() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            return null;
        }
        return interstitialAd.getAdUnitId();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return interstitialAd.getResponseInfo();
    }

    public void show() {
        if (this.interstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.Interstitial$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Interstitial.this.lambda$show$0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        this.interstitialAd.setImmersiveMode(true);
        this.interstitialAd.show(this.activity);
    }
}
