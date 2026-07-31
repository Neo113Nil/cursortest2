package com.google.unity.ads.nextgen;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAdPreloader;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.unity.ads.nextgen.UnityAppOpenAdPreloader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class UnityAppOpenAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final AppOpenAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    public UnityAppOpenAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this(activity, unityPreloadCallback, new AppOpenAdPreloaderWrapper(), Executors.newSingleThreadExecutor());
    }

    @VisibleForTesting
    public UnityAppOpenAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback, AppOpenAdPreloaderWrapper appOpenAdPreloaderWrapper, ExecutorService executorService) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
        this.service = executorService;
        this.preloaderWrapper = appOpenAdPreloaderWrapper;
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityAppOpenAdPreloader$1, reason: invalid class name */
    class AnonymousClass1 implements PreloadCallback {
        final /* synthetic */ UnityAppOpenAdPreloader this$0;

        AnonymousClass1(UnityAppOpenAdPreloader unityAppOpenAdPreloader) {
            Objects.requireNonNull(unityAppOpenAdPreloader);
            this.this$0 = unityAppOpenAdPreloader;
        }

        public void onAdPreloaded(@NonNull final String str, final ResponseInfo responseInfo) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAdPreloader$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAdPreloader.AnonymousClass1.this.lambda$onAdPreloaded$0(str, responseInfo);
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
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAdPreloader$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAdPreloader.AnonymousClass1.this.lambda$onAdsExhausted$0(str);
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
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAdPreloader$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAdPreloader.AnonymousClass1.this.lambda$onAdFailedToPreload$0(str, loadAdError);
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
    public UnityAppOpenAd pollAd(String str, UnityAppOpenAdCallback unityAppOpenAdCallback) {
        AppOpenAd pollAd = this.preloaderWrapper.pollAd(str);
        if (pollAd == null) {
            return null;
        }
        return new UnityAppOpenAd(this.activity, unityAppOpenAdCallback, pollAd);
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
    public static class AppOpenAdPreloaderWrapper {
        public boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallback preloadCallback) {
            return AppOpenAdPreloader.start(str, preloadConfiguration, preloadCallback);
        }

        public boolean isAdAvailable(String str) {
            return AppOpenAdPreloader.isAdAvailable(str);
        }

        public int getNumAdsAvailable(String str) {
            return AppOpenAdPreloader.getNumAdsAvailable(str);
        }

        public AppOpenAd pollAd(String str) {
            return AppOpenAdPreloader.pollAd(str);
        }

        public PreloadConfiguration getConfiguration(String str) {
            return AppOpenAdPreloader.getConfiguration(str);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return AppOpenAdPreloader.getConfigurations();
        }

        public boolean destroy(String str) {
            return AppOpenAdPreloader.destroy(str);
        }
    }
}
