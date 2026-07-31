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
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.unity.ads.UnityAppOpenAd;
import java.util.Objects;

/* loaded from: classes15.dex */
public class UnityAppOpenAd {
    private final Activity activity;
    AppOpenAd appOpenAd;
    private final UnityAppOpenAdCallback callback;
    private final OnPaidEventListener onPaidEventListener = new AnonymousClass1(this);
    private final FullScreenContentCallback fullScreenContentCallback = new AnonymousClass2(this);

    public void destroy() {
    }

    /* renamed from: com.google.unity.ads.UnityAppOpenAd$1, reason: invalid class name */
    class AnonymousClass1 implements OnPaidEventListener {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass1(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.lambda$onPaidEvent$0(adValue);
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

    /* renamed from: com.google.unity.ads.UnityAppOpenAd$2, reason: invalid class name */
    class AnonymousClass2 extends FullScreenContentCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass2(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final AdError adError) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.lambda$onAdFailedToShowFullScreenContent$0(adError);
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
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.lambda$onAdShowedFullScreenContent$0();
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
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.lambda$onAdDismissedFullScreenContent$0();
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
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.lambda$onAdImpression$0();
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
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.lambda$onAdClicked$0();
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

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback unityAppOpenAdCallback) {
        this.activity = activity;
        this.callback = unityAppOpenAdCallback;
    }

    public void loadAd(final String str, final AdRequest adRequest) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnityAppOpenAd.this.lambda$loadAd$0(str, adRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAd$0(String str, AdRequest adRequest) {
        AppOpenAd.load(this.activity, str, adRequest, new AnonymousClass3(this));
    }

    /* renamed from: com.google.unity.ads.UnityAppOpenAd$3, reason: invalid class name */
    class AnonymousClass3 extends AppOpenAd.AppOpenAdLoadCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass3(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull AppOpenAd appOpenAd) {
            UnityAppOpenAd unityAppOpenAd = this.this$0;
            unityAppOpenAd.appOpenAd = appOpenAd;
            appOpenAd.setOnPaidEventListener(unityAppOpenAd.onPaidEventListener);
            UnityAppOpenAd unityAppOpenAd2 = this.this$0;
            unityAppOpenAd2.appOpenAd.setFullScreenContentCallback(unityAppOpenAd2.fullScreenContentCallback);
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass3.this.lambda$onAdLoaded$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppOpenAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull final LoadAdError loadAdError) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass3.this.lambda$onAdFailedToLoad$0(loadAdError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppOpenAdFailedToLoad(loadAdError);
            }
        }
    }

    void setAppOpenAd(AppOpenAd appOpenAd) {
        this.appOpenAd = appOpenAd;
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                UnityAppOpenAd.this.lambda$setAppOpenAd$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAppOpenAd$0() {
        this.appOpenAd.setOnPaidEventListener(this.onPaidEventListener);
        this.appOpenAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    public void pollAd(@NonNull String str) {
        AppOpenAd pollAd = AppOpenAd.pollAd(this.activity, str);
        this.appOpenAd = pollAd;
        if (pollAd == null) {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain an App Open Ad from the preloader.");
            final LoadAdError loadAdError = new LoadAdError(0, "Failed to obtain an App Open Ad from the preloader.", MobileAds.ERROR_DOMAIN, null, null);
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.this.lambda$pollAd$0(loadAdError);
                }
            }).start();
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.this.lambda$pollAd$1();
                }
            });
            this.appOpenAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$0(LoadAdError loadAdError) {
        UnityAppOpenAdCallback unityAppOpenAdCallback = this.callback;
        if (unityAppOpenAdCallback != null) {
            unityAppOpenAdCallback.onAppOpenAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$1() {
        this.appOpenAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    public boolean isAdAvailable(@NonNull String str) {
        return AppOpenAd.isAdAvailable(this.activity, str);
    }

    public void show() {
        if (this.appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.this.lambda$show$0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        this.appOpenAd.setImmersiveMode(true);
        this.appOpenAd.show(this.activity);
    }

    @Nullable
    public String getAdUnitId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return null;
        }
        return appOpenAd.getAdUnitId();
    }

    public long getPlacementId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return 0L;
        }
        return appOpenAd.getPlacementId();
    }

    public void setPlacementId(long j) {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return;
        }
        appOpenAd.setPlacementId(j);
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return appOpenAd.getResponseInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnNewThread(Runnable runnable) {
        new Thread(runnable).start();
    }
}
