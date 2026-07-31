package com.google.unity.ads;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdPreloader;
import com.google.unity.ads.UnityRewardedAdPreloader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes11.dex */
public class UnityRewardedAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final ExecutorService service = Executors.newSingleThreadExecutor();

    public UnityRewardedAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return RewardedAdPreloader.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.UnityRewardedAdPreloader$1, reason: invalid class name */
    class AnonymousClass1 extends PreloadCallbackV2 {
        final /* synthetic */ UnityRewardedAdPreloader this$0;

        AnonymousClass1(UnityRewardedAdPreloader unityRewardedAdPreloader) {
            Objects.requireNonNull(unityRewardedAdPreloader);
            this.this$0 = unityRewardedAdPreloader;
        }

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdPreloaded(@NonNull final String str, final ResponseInfo responseInfo) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAdPreloader$1$$ExternalSyntheticLambda2
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

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdsExhausted(@NonNull final String str) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAdPreloader$1$$ExternalSyntheticLambda1
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

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdFailedToPreload(@NonNull final String str, @NonNull final AdError adError) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAdPreloader$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAdPreloader.AnonymousClass1.this.lambda$onAdFailedToPreload$0(str, adError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToPreload$0(String str, AdError adError) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdFailedToPreload(str, adError);
            }
        }
    }

    public boolean isAdAvailable(String str) {
        return RewardedAdPreloader.isAdAvailable(str);
    }

    public int getNumAdsAvailable(String str) {
        return RewardedAdPreloader.getNumAdsAvailable(str);
    }

    public void destroy(String str) {
        RewardedAdPreloader.destroy(str);
    }

    @Nullable
    public UnityRewardedAd pollAd(String str, UnityRewardedAdCallback unityRewardedAdCallback) {
        RewardedAd pollAd = RewardedAdPreloader.pollAd(str);
        if (pollAd == null) {
            return null;
        }
        UnityRewardedAd unityRewardedAd = new UnityRewardedAd(this.activity, unityRewardedAdCallback);
        unityRewardedAd.setRewardedAd(pollAd);
        return unityRewardedAd;
    }

    @Nullable
    public PreloadConfiguration getConfiguration(String str) {
        return RewardedAdPreloader.getConfiguration(str);
    }

    public Map<String, PreloadConfiguration> getConfigurations() {
        return RewardedAdPreloader.getConfigurations();
    }

    public void destroyAll() {
        RewardedAdPreloader.destroyAll();
    }
}
