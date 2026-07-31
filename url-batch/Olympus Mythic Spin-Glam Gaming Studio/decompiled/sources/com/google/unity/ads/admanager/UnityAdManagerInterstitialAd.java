package com.google.unity.ads.admanager;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.admanager.UnityAdManagerInterstitialAd;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes10.dex */
public class UnityAdManagerInterstitialAd {
    private final Activity activity;
    private AdManagerInterstitialAd adManagerInterstitialAd;

    @Nullable
    private final UnityAdManagerInterstitialAdCallback callback;
    private final ExecutorService service = Executors.newSingleThreadExecutor();
    private final FullScreenContentCallback fullScreenContentCallback = new AnonymousClass1(this);
    private final OnPaidEventListener onPaidEventListener = new AnonymousClass2(this);
    private final AppEventListener appEventListener = new AnonymousClass3(this);

    public void destroy() {
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1, reason: invalid class name */
    class AnonymousClass1 extends FullScreenContentCallback {
        final /* synthetic */ UnityAdManagerInterstitialAd this$0;

        AnonymousClass1(UnityAdManagerInterstitialAd unityAdManagerInterstitialAd) {
            Objects.requireNonNull(unityAdManagerInterstitialAd);
            this.this$0 = unityAdManagerInterstitialAd;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final AdError adError) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.lambda$onAdFailedToShowFullScreenContent$0(adError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(AdError adError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.lambda$onAdShowedFullScreenContent$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.lambda$onAdDismissedFullScreenContent$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.lambda$onAdImpression$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.lambda$onAdClicked$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdClicked();
            }
        }
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$2, reason: invalid class name */
    class AnonymousClass2 implements OnPaidEventListener {
        final /* synthetic */ UnityAdManagerInterstitialAd this$0;

        AnonymousClass2(UnityAdManagerInterstitialAd unityAdManagerInterstitialAd) {
            Objects.requireNonNull(unityAdManagerInterstitialAd);
            this.this$0 = unityAdManagerInterstitialAd;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass2.this.lambda$onPaidEvent$0(adValue);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPaidEvent$0(AdValue adValue) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$3, reason: invalid class name */
    class AnonymousClass3 implements AppEventListener {
        final /* synthetic */ UnityAdManagerInterstitialAd this$0;

        AnonymousClass3(UnityAdManagerInterstitialAd unityAdManagerInterstitialAd) {
            Objects.requireNonNull(unityAdManagerInterstitialAd);
            this.this$0 = unityAdManagerInterstitialAd;
        }

        @Override // com.google.android.gms.ads.admanager.AppEventListener
        public void onAppEvent(final String str, final String str2) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass3.this.lambda$onAppEvent$0(str, str2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAppEvent$0(String str, String str2) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppEvent(str, str2);
            }
        }
    }

    public UnityAdManagerInterstitialAd(Activity activity, @Nullable UnityAdManagerInterstitialAdCallback unityAdManagerInterstitialAdCallback) {
        this.activity = activity;
        this.callback = unityAdManagerInterstitialAdCallback;
    }

    public void loadAd(final String str, final AdManagerAdRequest adManagerAdRequest) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityAdManagerInterstitialAd.this.lambda$loadAd$0(str, adManagerAdRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAd$0(String str, AdManagerAdRequest adManagerAdRequest) {
        AdManagerInterstitialAd.load(this.activity, str, adManagerAdRequest, new AnonymousClass4(this));
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$4, reason: invalid class name */
    class AnonymousClass4 extends AdManagerInterstitialAdLoadCallback {
        final /* synthetic */ UnityAdManagerInterstitialAd this$0;

        AnonymousClass4(UnityAdManagerInterstitialAd unityAdManagerInterstitialAd) {
            Objects.requireNonNull(unityAdManagerInterstitialAd);
            this.this$0 = unityAdManagerInterstitialAd;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull AdManagerInterstitialAd adManagerInterstitialAd) {
            this.this$0.adManagerInterstitialAd = adManagerInterstitialAd;
            this.this$0.adManagerInterstitialAd.setOnPaidEventListener(this.this$0.onPaidEventListener);
            this.this$0.adManagerInterstitialAd.setAppEventListener(this.this$0.appEventListener);
            this.this$0.adManagerInterstitialAd.setFullScreenContentCallback(this.this$0.fullScreenContentCallback);
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass4.this.lambda$onAdLoaded$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onInterstitialAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass4.this.lambda$onAdFailedToLoad$0(loadAdError);
                }
            });
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
        AdManagerInterstitialAd adManagerInterstitialAd = (AdManagerInterstitialAd) InterstitialAd.pollAd(this.activity, str);
        this.adManagerInterstitialAd = adManagerInterstitialAd;
        if (adManagerInterstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain an Ad Manager Interstitial Ad from the preloader.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.this.lambda$pollAd$0();
                }
            });
            this.adManagerInterstitialAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$0() {
        this.adManagerInterstitialAd.setOnPaidEventListener(this.onPaidEventListener);
        this.adManagerInterstitialAd.setAppEventListener(this.appEventListener);
    }

    @Nullable
    public String getAdUnitId() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.adManagerInterstitialAd;
        if (adManagerInterstitialAd == null) {
            return null;
        }
        return adManagerInterstitialAd.getAdUnitId();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ResponseInfo lambda$getResponseInfo$0;
                lambda$getResponseInfo$0 = UnityAdManagerInterstitialAd.this.lambda$getResponseInfo$0();
                return lambda$getResponseInfo$0;
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (ResponseInfo) futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to check Ad Manager interstitial response info: %s", e.getLocalizedMessage()));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ResponseInfo lambda$getResponseInfo$0() throws Exception {
        return this.adManagerInterstitialAd.getResponseInfo();
    }

    public void show() {
        if (this.adManagerInterstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show Ad Manager interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.this.lambda$show$0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        this.adManagerInterstitialAd.show(this.activity);
    }
}
