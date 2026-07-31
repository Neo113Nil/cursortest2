package com.google.unity.ads;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdPreloader;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.unity.ads.UnityInterstitialAdPreloader;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public class UnityInterstitialAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;

    public UnityInterstitialAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return InterstitialAdPreloader.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.UnityInterstitialAdPreloader$1, reason: invalid class name */
    class AnonymousClass1 extends PreloadCallbackV2 {
        final /* synthetic */ UnityInterstitialAdPreloader this$0;

        AnonymousClass1(UnityInterstitialAdPreloader unityInterstitialAdPreloader) {
            Objects.requireNonNull(unityInterstitialAdPreloader);
            this.this$0 = unityInterstitialAdPreloader;
        }

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdPreloaded(@NonNull final String str, final ResponseInfo responseInfo) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda0
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

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdsExhausted(@NonNull final String str) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda1
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

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdFailedToPreload(@NonNull final String str, @NonNull final AdError adError) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAdPreloader.AnonymousClass1.this.lambda$onAdFailedToPreload$0(str, adError);
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
        return InterstitialAdPreloader.isAdAvailable(str);
    }

    public int getNumAdsAvailable(String str) {
        return InterstitialAdPreloader.getNumAdsAvailable(str);
    }

    public void destroy(String str) {
        InterstitialAdPreloader.destroy(str);
    }

    @Nullable
    public Interstitial pollAd(String str, UnityInterstitialAdCallback unityInterstitialAdCallback) {
        InterstitialAd pollAd = InterstitialAdPreloader.pollAd(str);
        if (pollAd == null) {
            return null;
        }
        Interstitial interstitial = new Interstitial(this.activity, unityInterstitialAdCallback);
        interstitial.setInterstitialAd(pollAd);
        return interstitial;
    }

    @Nullable
    public PreloadConfiguration getConfiguration(String str) {
        return InterstitialAdPreloader.getConfiguration(str);
    }

    public Map<String, PreloadConfiguration> getConfigurations() {
        return InterstitialAdPreloader.getConfigurations();
    }

    public void destroyAll() {
        InterstitialAdPreloader.destroyAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnNewThread(Runnable runnable) {
        new Thread(runnable).start();
    }
}
