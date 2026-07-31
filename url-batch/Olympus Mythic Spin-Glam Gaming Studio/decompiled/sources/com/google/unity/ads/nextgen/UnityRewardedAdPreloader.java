package com.google.unity.ads.nextgen;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAdPreloader;
import com.google.unity.ads.nextgen.UnityRewardedAdPreloader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public class UnityRewardedAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final RewardedAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    public UnityRewardedAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this(activity, unityPreloadCallback, new RewardedAdPreloaderWrapper(), Executors.newSingleThreadExecutor());
    }

    @VisibleForTesting
    public UnityRewardedAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback, RewardedAdPreloaderWrapper rewardedAdPreloaderWrapper, ExecutorService executorService) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
        this.service = executorService;
        this.preloaderWrapper = rewardedAdPreloaderWrapper;
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityRewardedAdPreloader$1, reason: invalid class name */
    class AnonymousClass1 implements PreloadCallback {
        final /* synthetic */ UnityRewardedAdPreloader this$0;

        AnonymousClass1(UnityRewardedAdPreloader unityRewardedAdPreloader) {
            Objects.requireNonNull(unityRewardedAdPreloader);
            this.this$0 = unityRewardedAdPreloader;
        }

        public void onAdPreloaded(@NonNull final String str, final ResponseInfo responseInfo) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAdPreloader$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAdPreloader.AnonymousClass1.this.lambda$onAdPreloaded$0(str, responseInfo);
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
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAdPreloader$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAdPreloader.AnonymousClass1.this.lambda$onAdsExhausted$0(str);
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
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAdPreloader$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAdPreloader.AnonymousClass1.this.lambda$onAdFailedToPreload$0(str, loadAdError);
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
    public UnityRewardedAd pollAd(String str, UnityRewardedAdCallback unityRewardedAdCallback) {
        RewardedAd pollAd = this.preloaderWrapper.pollAd(str);
        if (pollAd == null) {
            return null;
        }
        return new UnityRewardedAd(this.activity, unityRewardedAdCallback, pollAd);
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
    public static class RewardedAdPreloaderWrapper {
        public boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallback preloadCallback) {
            return RewardedAdPreloader.start(str, preloadConfiguration, preloadCallback);
        }

        public boolean isAdAvailable(String str) {
            return RewardedAdPreloader.isAdAvailable(str);
        }

        public int getNumAdsAvailable(String str) {
            return RewardedAdPreloader.getNumAdsAvailable(str);
        }

        public RewardedAd pollAd(String str) {
            return RewardedAdPreloader.pollAd(str);
        }

        public PreloadConfiguration getConfiguration(String str) {
            return RewardedAdPreloader.getConfiguration(str);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return RewardedAdPreloader.getConfigurations();
        }

        public boolean destroy(String str) {
            return RewardedAdPreloader.destroy(str);
        }
    }
}
