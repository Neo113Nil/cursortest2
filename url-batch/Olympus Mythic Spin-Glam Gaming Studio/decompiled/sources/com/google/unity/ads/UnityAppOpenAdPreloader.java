package com.google.unity.ads;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.appopen.AppOpenAdPreloader;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.unity.ads.UnityAppOpenAdPreloader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class UnityAppOpenAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final ExecutorService service = Executors.newSingleThreadExecutor();

    public UnityAppOpenAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return AppOpenAdPreloader.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.UnityAppOpenAdPreloader$1, reason: invalid class name */
    class AnonymousClass1 extends PreloadCallbackV2 {
        final /* synthetic */ UnityAppOpenAdPreloader this$0;

        AnonymousClass1(UnityAppOpenAdPreloader unityAppOpenAdPreloader) {
            Objects.requireNonNull(unityAppOpenAdPreloader);
            this.this$0 = unityAppOpenAdPreloader;
        }

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdPreloaded(@NonNull final String str, final ResponseInfo responseInfo) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAdPreloader$1$$ExternalSyntheticLambda0
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

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdsExhausted(@NonNull final String str) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAdPreloader$1$$ExternalSyntheticLambda1
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

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdFailedToPreload(@NonNull final String str, @NonNull final AdError adError) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAdPreloader$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAdPreloader.AnonymousClass1.this.lambda$onAdFailedToPreload$0(str, adError);
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
        return AppOpenAdPreloader.isAdAvailable(str);
    }

    public int getNumAdsAvailable(String str) {
        return AppOpenAdPreloader.getNumAdsAvailable(str);
    }

    @Nullable
    public UnityAppOpenAd pollAd(String str, UnityAppOpenAdCallback unityAppOpenAdCallback) {
        AppOpenAd pollAd = AppOpenAdPreloader.pollAd(str);
        if (pollAd == null) {
            return null;
        }
        UnityAppOpenAd unityAppOpenAd = new UnityAppOpenAd(this.activity, unityAppOpenAdCallback);
        unityAppOpenAd.setAppOpenAd(pollAd);
        return unityAppOpenAd;
    }

    @Nullable
    public PreloadConfiguration getConfiguration(String str) {
        return AppOpenAdPreloader.getConfiguration(str);
    }

    public Map<String, PreloadConfiguration> getConfigurations() {
        return AppOpenAdPreloader.getConfigurations();
    }

    public void destroy(String str) {
        AppOpenAdPreloader.destroy(str);
    }

    public void destroyAll() {
        AppOpenAdPreloader.destroyAll();
    }
}
