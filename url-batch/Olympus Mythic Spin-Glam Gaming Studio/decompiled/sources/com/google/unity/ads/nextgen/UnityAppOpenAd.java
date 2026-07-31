package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.nextgen.UnityAppOpenAd;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes14.dex */
public class UnityAppOpenAd extends UnityAdBase<AppOpenAd, UnityAppOpenAdCallback> {
    private final AdWrapper<AppOpenAd> adWrapper;
    private AppOpenAd appOpenAd;
    private final AppOpenAdEventCallback appOpenAdEventCallback;

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback unityAppOpenAdCallback) {
        this(activity, unityAppOpenAdCallback, AdWrapper.forAppOpen(), Executors.newSingleThreadExecutor());
    }

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback unityAppOpenAdCallback, AppOpenAd appOpenAd) {
        this(activity, unityAppOpenAdCallback, AdWrapper.forAppOpen(), Executors.newSingleThreadExecutor());
        this.appOpenAd = appOpenAd;
    }

    @VisibleForTesting
    UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback unityAppOpenAdCallback, AdWrapper<AppOpenAd> adWrapper, Executor executor) {
        super(activity, unityAppOpenAdCallback, executor);
        this.appOpenAdEventCallback = new AnonymousClass1(this);
        this.adWrapper = adWrapper;
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityAppOpenAd$1, reason: invalid class name */
    class AnonymousClass1 implements AppOpenAdEventCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass1(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.lambda$onAdShowedFullScreenContent$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdShowedFullScreenContent();
            }
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.lambda$onAdDismissedFullScreenContent$0();
                }
            });
            this.this$0.appOpenAd = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdDismissedFullScreenContent();
            }
        }

        public void onAdFailedToShowFullScreenContent(@NonNull final FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.lambda$onAdFailedToShowFullScreenContent$0(fullScreenContentError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(FullScreenContentError fullScreenContentError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.lambda$onAdImpression$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdImpression();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.lambda$onAdClicked$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdClicked();
            }
        }

        public void onAdPaid(@NonNull final AdValue adValue) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.lambda$onAdPaid$0(adValue);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPaid$0(AdValue adValue) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    public void load(final AdRequest adRequest) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityAppOpenAd.this.lambda$load$0(adRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new AnonymousClass2(this));
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityAppOpenAd$2, reason: invalid class name */
    class AnonymousClass2 implements AdLoadCallback<AppOpenAd> {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass2(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }

        public void onAdLoaded(@NonNull AppOpenAd appOpenAd) {
            this.this$0.appOpenAd = appOpenAd;
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.lambda$onAdLoaded$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAppOpenAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull final LoadAdError loadAdError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.lambda$onAdFailedToLoad$0(loadAdError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAppOpenAdFailedToLoad(loadAdError);
            }
        }
    }

    @VisibleForTesting
    AppOpenAd getAppOpenAd() {
        return this.appOpenAd;
    }

    public void show() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. Please call loadAd first and wait for a successful onAdLoaded callback.");
        } else {
            appOpenAd.setAdEventCallback(this.appOpenAdEventCallback);
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$$ExternalSyntheticLambda0
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
}
