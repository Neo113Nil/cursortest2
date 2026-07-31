package com.google.unity.ads.nextgen;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdPreloader;
import com.google.unity.ads.nextgen.UnityInterstitialAdPreloader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes15.dex */
public class UnityInterstitialAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final InterstitialAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    public UnityInterstitialAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this(activity, unityPreloadCallback, new InterstitialAdPreloaderWrapper(), Executors.newSingleThreadExecutor());
    }

    @VisibleForTesting
    public UnityInterstitialAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback, InterstitialAdPreloaderWrapper interstitialAdPreloaderWrapper, ExecutorService executorService) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
        this.service = executorService;
        this.preloaderWrapper = interstitialAdPreloaderWrapper;
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityInterstitialAdPreloader$1, reason: invalid class name */
    class AnonymousClass1 implements PreloadCallback {
        final /* synthetic */ UnityInterstitialAdPreloader this$0;

        AnonymousClass1(UnityInterstitialAdPreloader unityInterstitialAdPreloader) {
            Objects.requireNonNull(unityInterstitialAdPreloader);
            this.this$0 = unityInterstitialAdPreloader;
        }

        public void onAdPreloaded(@NonNull final String str, final ResponseInfo responseInfo) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAdPreloader.AnonymousClass1.this.lambda$onAdPreloaded$0(str, responseInfo);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPreloaded$0(String str, ResponseInfo responseInfo) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdPreloaded(str, responseInfo);
            }
        }

        public void onAdsExhausted(@NonNull final String str) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAdPreloader.AnonymousClass1.this.lambda$onAdsExhausted$0(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdsExhausted$0(String str) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdsExhausted(str);
            }
        }

        public void onAdFailedToPreload(@NonNull final String str, @NonNull final LoadAdError loadAdError) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAdPreloader.AnonymousClass1.this.lambda$onAdFailedToPreload$0(str, loadAdError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToPreload$0(String str, LoadAdError loadAdError) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdFailedToPreload(str, loadAdError);
            }
        }
    }

    public boolean isAdAvailable(String str) {
        return this.preloaderWrapper.isAdAvailable(str);
    }

    public int getNumAdsAvailable(String str) {
        return this.preloaderWrapper.getNumAdsAvailable(str);
    }

    @Nullable
    public UnityInterstitialAd pollAd(String str, UnityInterstitialAdCallback unityInterstitialAdCallback) {
        InterstitialAd pollAd = this.preloaderWrapper.pollAd(str);
        if (pollAd == null) {
            return null;
        }
        return new UnityInterstitialAd(this.activity, unityInterstitialAdCallback, pollAd);
    }

    @Nullable
    public PreloadConfiguration getConfiguration(String str) {
        return this.preloaderWrapper.getConfiguration(str);
    }

    public Map<String, PreloadConfiguration> getConfigurations() {
        return this.preloaderWrapper.getConfigurations();
    }

    public void destroy(String str) {
        this.preloaderWrapper.destroy(str);
    }

    @VisibleForTesting
    public static class InterstitialAdPreloaderWrapper {
        public boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallback preloadCallback) {
            return InterstitialAdPreloader.start(str, preloadConfiguration, preloadCallback);
        }

        public boolean isAdAvailable(String str) {
            return InterstitialAdPreloader.isAdAvailable(str);
        }

        public int getNumAdsAvailable(String str) {
            return InterstitialAdPreloader.getNumAdsAvailable(str);
        }

        public InterstitialAd pollAd(String str) {
            return InterstitialAdPreloader.pollAd(str);
        }

        public PreloadConfiguration getConfiguration(String str) {
            return InterstitialAdPreloader.getConfiguration(str);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return InterstitialAdPreloader.getConfigurations();
        }

        public boolean destroy(String str) {
            return InterstitialAdPreloader.destroy(str);
        }
    }
}
