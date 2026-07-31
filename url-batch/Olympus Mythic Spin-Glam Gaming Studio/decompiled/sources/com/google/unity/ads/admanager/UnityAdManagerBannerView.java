package com.google.unity.ads.admanager;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.unity.ads.Banner;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.admanager.UnityAdManagerBannerView;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes12.dex */
public class UnityAdManagerBannerView extends Banner {
    private final ExecutorService service;

    public UnityAdManagerBannerView(Activity activity, UnityAdManagerAdListener unityAdManagerAdListener) {
        this.unityPlayerActivity = activity;
        this.unityListener = unityAdManagerAdListener;
        this.service = Executors.newSingleThreadExecutor();
    }

    @Override // com.google.unity.ads.Banner
    protected void createAdView(String str, AdSize adSize) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(this.unityPlayerActivity);
        this.adView = adManagerAdView;
        adManagerAdView.setBackgroundColor(0);
        this.adView.setAdUnitId(str);
        this.adView.setAdSize(adSize);
        this.adView.setVisibility(8);
        this.adView.setDescendantFocusability(393216);
        this.unityPlayerActivity.addContentView(this.adView, getLayoutParams());
        this.adView.setAdListener(new AnonymousClass1(this));
        this.adView.setOnPaidEventListener(new AnonymousClass2(this));
        ((AdManagerAdView) this.adView).setAppEventListener(new AnonymousClass3(this));
        setLayoutChangeListener();
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerBannerView$1, reason: invalid class name */
    class AnonymousClass1 extends AdListener {
        final /* synthetic */ UnityAdManagerBannerView this$0;

        AnonymousClass1(UnityAdManagerBannerView unityAdManagerBannerView) {
            Objects.requireNonNull(unityAdManagerBannerView);
            this.this$0 = unityAdManagerBannerView;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            if (!((Banner) this.this$0).hidden) {
                this.this$0.show();
            }
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerBannerView.AnonymousClass1.this.lambda$onAdLoaded$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            if (((Banner) this.this$0).unityListener != null) {
                ((Banner) this.this$0).unityListener.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerBannerView.AnonymousClass1.this.lambda$onAdFailedToLoad$0(loadAdError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            if (((Banner) this.this$0).unityListener != null) {
                ((Banner) this.this$0).unityListener.onAdFailedToLoad(loadAdError);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerBannerView.AnonymousClass1.this.lambda$onAdOpened$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdOpened$0() {
            if (((Banner) this.this$0).unityListener != null) {
                ((Banner) this.this$0).unityListener.onAdOpened();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerBannerView.AnonymousClass1.this.lambda$onAdClosed$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClosed$0() {
            if (((Banner) this.this$0).unityListener != null) {
                ((Banner) this.this$0).unityListener.onAdClosed();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerBannerView.AnonymousClass1.this.lambda$onAdImpression$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            if (((Banner) this.this$0).unityListener != null) {
                ((Banner) this.this$0).unityListener.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerBannerView.AnonymousClass1.this.lambda$onAdClicked$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            if (((Banner) this.this$0).unityListener != null) {
                ((Banner) this.this$0).unityListener.onAdClicked();
            }
        }
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerBannerView$2, reason: invalid class name */
    class AnonymousClass2 implements OnPaidEventListener {
        final /* synthetic */ UnityAdManagerBannerView this$0;

        AnonymousClass2(UnityAdManagerBannerView unityAdManagerBannerView) {
            Objects.requireNonNull(unityAdManagerBannerView);
            this.this$0 = unityAdManagerBannerView;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerBannerView.AnonymousClass2.this.lambda$onPaidEvent$0(adValue);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPaidEvent$0(AdValue adValue) {
            if (((Banner) this.this$0).unityListener != null) {
                ((Banner) this.this$0).unityListener.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerBannerView$3, reason: invalid class name */
    class AnonymousClass3 implements AppEventListener {
        final /* synthetic */ UnityAdManagerBannerView this$0;

        AnonymousClass3(UnityAdManagerBannerView unityAdManagerBannerView) {
            Objects.requireNonNull(unityAdManagerBannerView);
            this.this$0 = unityAdManagerBannerView;
        }

        @Override // com.google.android.gms.ads.admanager.AppEventListener
        public void onAppEvent(final String str, final String str2) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerBannerView.AnonymousClass3.this.lambda$onAppEvent$0(str, str2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAppEvent$0(String str, String str2) {
            if (((Banner) this.this$0).unityListener != null) {
                ((UnityAdManagerAdListener) ((Banner) this.this$0).unityListener).onAppEvent(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAd$0(AdManagerAdRequest adManagerAdRequest) {
        ((AdManagerAdView) this.adView).loadAd(adManagerAdRequest);
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                UnityAdManagerBannerView.this.lambda$loadAd$0(adManagerAdRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AdSize[] lambda$getAdSizes$0() throws Exception {
        return ((AdManagerAdView) this.adView).getAdSizes();
    }

    public List<AdSize> getAdSizes() {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AdSize[] lambda$getAdSizes$0;
                lambda$getAdSizes$0 = UnityAdManagerBannerView.this.lambda$getAdSizes$0();
                return lambda$getAdSizes$0;
            }
        });
        this.unityPlayerActivity.runOnUiThread(futureTask);
        AdSize[] adSizeArr = new AdSize[0];
        try {
            adSizeArr = (AdSize[]) futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad sizes: %s", e.getLocalizedMessage()));
        }
        return Arrays.asList(adSizeArr);
    }

    public void setAdSizes(final List<AdSize> list) {
        if (list == null || list.size() < 1) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnityAdManagerBannerView.this.lambda$setAdSizes$0(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdSizes$0(List list) {
        ((AdManagerAdView) this.adView).setAdSizes((AdSize[]) list.toArray(new AdSize[list.size()]));
    }
}
