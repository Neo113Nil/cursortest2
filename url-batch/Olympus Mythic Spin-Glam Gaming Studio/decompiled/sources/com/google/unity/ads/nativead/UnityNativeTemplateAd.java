package com.google.unity.ads.nativead;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.unity.ads.PluginUtils;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes12.dex */
public class UnityNativeTemplateAd {
    private Activity activity;
    private UnityNativeTemplateAdCallback callback;
    private AdSize mAdSize;
    private View.OnLayoutChangeListener mLayoutChangeListener;
    private int mPositionCode;
    private NativeAd nativeAd;
    private TemplateView templateView;
    protected boolean hidden = false;
    private int mHorizontalOffset = 0;
    private int mVerticalOffset = 0;

    protected static class Insets {
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;

        protected Insets() {
        }
    }

    public UnityNativeTemplateAd(Activity activity, UnityNativeTemplateAdCallback unityNativeTemplateAdCallback) {
        this.activity = activity;
        this.callback = unityNativeTemplateAdCallback;
    }

    /* renamed from: com.google.unity.ads.nativead.UnityNativeTemplateAd$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ UnityNativeTemplateAd this$0;
        final /* synthetic */ String val$adUnitId;
        final /* synthetic */ NativeAdOptions val$options;
        final /* synthetic */ AdRequest val$request;

        AnonymousClass1(UnityNativeTemplateAd unityNativeTemplateAd, String str, NativeAdOptions nativeAdOptions, AdRequest adRequest) {
            this.val$adUnitId = str;
            this.val$options = nativeAdOptions;
            this.val$request = adRequest;
            Objects.requireNonNull(unityNativeTemplateAd);
            this.this$0 = unityNativeTemplateAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            new AdLoader.Builder(this.this$0.activity, this.val$adUnitId).forNativeAd(new AnonymousClass2(this)).withAdListener(new AdListener(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.1.1
                final /* synthetic */ AnonymousClass1 this$1;

                {
                    Objects.requireNonNull(this);
                    this.this$1 = this;
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    this.this$1.this$0.callback.onNativeAdFailedToLoad(loadAdError);
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdImpression() {
                    this.this$1.this$0.callback.onAdImpression();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    this.this$1.this$0.callback.onAdClicked();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    this.this$1.this$0.callback.onAdDismissedFullScreenContent();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdOpened() {
                    this.this$1.this$0.callback.onAdShowedFullScreenContent();
                }
            }).withNativeAdOptions(this.val$options).build().loadAd(this.val$request);
        }

        /* renamed from: com.google.unity.ads.nativead.UnityNativeTemplateAd$1$2, reason: invalid class name */
        class AnonymousClass2 implements NativeAd.OnNativeAdLoadedListener {
            final /* synthetic */ AnonymousClass1 this$1;

            AnonymousClass2(AnonymousClass1 anonymousClass1) {
                Objects.requireNonNull(anonymousClass1);
                this.this$1 = anonymousClass1;
            }

            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public void onNativeAdLoaded(NativeAd nativeAd) {
                this.this$1.this$0.nativeAd = nativeAd;
                this.this$1.this$0.callback.onNativeAdLoaded();
                this.this$1.this$0.nativeAd.setOnPaidEventListener(new OnPaidEventListener(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.1.2.1
                    final /* synthetic */ AnonymousClass2 this$2;

                    {
                        Objects.requireNonNull(this);
                        this.this$2 = this;
                    }

                    @Override // com.google.android.gms.ads.OnPaidEventListener
                    public void onPaidEvent(final AdValue adValue) {
                        new Thread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.1.2.1.1
                            final /* synthetic */ C02591 this$3;

                            {
                                Objects.requireNonNull(this);
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (this.this$3.this$2.this$1.this$0.callback != null) {
                                    this.this$3.this$2.this$1.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
                                }
                            }
                        }).start();
                    }
                });
            }
        }
    }

    public void loadAd(String str, NativeAdOptions nativeAdOptions, AdRequest adRequest) {
        this.activity.runOnUiThread(new AnonymousClass1(this, str, nativeAdOptions, adRequest));
    }

    public long getPlacementId() {
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd == null) {
            return 0L;
        }
        return nativeAd.getPlacementId();
    }

    public void setPlacementId(long j) {
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd == null) {
            return;
        }
        nativeAd.setPlacementId(j);
    }

    public void setPositionCode(final int i) {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.2
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mPositionCode = i;
                this.this$0.updatePosition();
            }
        });
    }

    public void setPosition(final int i, final int i2) {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.3
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mPositionCode = -1;
                this.this$0.mHorizontalOffset = i;
                this.this$0.mVerticalOffset = i2;
                this.this$0.updatePosition();
            }
        });
    }

    public void renderDefaultSizeAtPosition(final UnityNativeTemplateStyle unityNativeTemplateStyle, int i, int i2) {
        removeTemplateView();
        this.mPositionCode = -1;
        this.mHorizontalOffset = i;
        this.mVerticalOffset = i2;
        this.mAdSize = null;
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.4
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.templateView = unityNativeTemplateStyle.asTemplateView(unityNativeTemplateAd.activity);
                this.this$0.templateView.setNativeAd(this.this$0.nativeAd);
                FrameLayout frameLayout = new FrameLayout(this.this$0.activity);
                frameLayout.addView(this.this$0.templateView, this.this$0.getLayoutParams());
                this.this$0.activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public void renderDefaultSizeAtPositionCode(final UnityNativeTemplateStyle unityNativeTemplateStyle, int i) {
        removeTemplateView();
        this.mPositionCode = i;
        this.mAdSize = null;
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.5
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.templateView = unityNativeTemplateStyle.asTemplateView(unityNativeTemplateAd.activity);
                this.this$0.templateView.setNativeAd(this.this$0.nativeAd);
                FrameLayout frameLayout = new FrameLayout(this.this$0.activity);
                frameLayout.addView(this.this$0.templateView, this.this$0.getLayoutParams());
                this.this$0.activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public void renderCustomSizeAtPosition(final UnityNativeTemplateStyle unityNativeTemplateStyle, final AdSize adSize, int i, int i2) {
        removeTemplateView();
        this.mPositionCode = -1;
        this.mHorizontalOffset = i;
        this.mVerticalOffset = i2;
        this.mAdSize = adSize;
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.6
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.templateView = unityNativeTemplateStyle.asTemplateView(unityNativeTemplateAd.activity);
                this.this$0.templateView.setNativeAd(this.this$0.nativeAd);
                FrameLayout frameLayout = new FrameLayout(this.this$0.activity);
                FrameLayout.LayoutParams layoutParams = this.this$0.getLayoutParams();
                layoutParams.height = adSize.getHeight();
                layoutParams.width = adSize.getWidth();
                frameLayout.addView(this.this$0.templateView, layoutParams);
                this.this$0.activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public void renderCustomSizeAtPositionCode(final UnityNativeTemplateStyle unityNativeTemplateStyle, final AdSize adSize, int i) {
        removeTemplateView();
        this.mPositionCode = i;
        this.mAdSize = adSize;
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.7
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.templateView = unityNativeTemplateStyle.asTemplateView(unityNativeTemplateAd.activity);
                this.this$0.templateView.setNativeAd(this.this$0.nativeAd);
                FrameLayout frameLayout = new FrameLayout(this.this$0.activity);
                FrameLayout.LayoutParams layoutParams = this.this$0.getLayoutParams();
                layoutParams.height = adSize.getHeight();
                layoutParams.width = adSize.getWidth();
                frameLayout.addView(this.this$0.templateView, layoutParams);
                this.this$0.activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public ResponseInfo getResponseInfo() {
        FutureTask futureTask = new FutureTask(new Callable<ResponseInfo>(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.8
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ResponseInfo call() {
                return this.this$0.nativeAd.getResponseInfo();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (ResponseInfo) futureTask.get();
        } catch (InterruptedException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to check native response info: %s", e.getLocalizedMessage()));
            return null;
        } catch (ExecutionException e2) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to check native response info: %s", e2.getLocalizedMessage()));
            return null;
        }
    }

    public void show() {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.9
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.templateView == null) {
                    return;
                }
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.hidden = false;
                unityNativeTemplateAd.templateView.setVisibility(0);
                this.this$0.updatePosition();
            }
        });
    }

    public void hide() {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.10
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.templateView == null) {
                    return;
                }
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.hidden = true;
                unityNativeTemplateAd.templateView.setVisibility(8);
            }
        });
    }

    public float getHeightInPixels() {
        if (this.templateView == null) {
            return 0.0f;
        }
        return r0.getHeight();
    }

    public float getWidthInPixels() {
        if (this.templateView == null) {
            return 0.0f;
        }
        return r0.getWidth();
    }

    public void destroy() {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.11
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.templateView != null) {
                    this.this$0.templateView.destroyNativeAd();
                    ViewParent parent = this.this$0.templateView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(this.this$0.templateView);
                    }
                }
            }
        });
        this.activity.getWindow().getDecorView().getRootView().removeOnLayoutChangeListener(this.mLayoutChangeListener);
        this.mLayoutChangeListener = null;
    }

    protected void setLayoutChangeListener() {
        if (this.mLayoutChangeListener != null) {
            return;
        }
        this.mLayoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.12
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i3 == i7 && i4 == i8 && i2 == i6) {
                    return;
                }
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                if (unityNativeTemplateAd.hidden) {
                    return;
                }
                unityNativeTemplateAd.updatePosition();
            }
        };
        this.activity.getWindow().getDecorView().getRootView().addOnLayoutChangeListener(this.mLayoutChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePosition() {
        if (this.templateView == null) {
            return;
        }
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.13
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = this.this$0.getLayoutParams();
                if (this.this$0.mAdSize != null) {
                    layoutParams.height = this.this$0.mAdSize.getHeight();
                    layoutParams.width = this.this$0.mAdSize.getWidth();
                }
                this.this$0.templateView.setLayoutParams(layoutParams);
            }
        });
    }

    private void removeTemplateView() {
        if (this.templateView != null) {
            this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.14
                final /* synthetic */ UnityNativeTemplateAd this$0;

                {
                    Objects.requireNonNull(this);
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ((ViewGroup) this.this$0.templateView.getParent()).removeView(this.this$0.templateView);
                }
            });
        }
    }

    protected FrameLayout.LayoutParams getLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = PluginUtils.getLayoutGravityForPositionCode(this.mPositionCode);
        Insets insets = getInsets();
        int i = insets.left;
        int i2 = insets.top;
        layoutParams.bottomMargin = insets.bottom;
        layoutParams.rightMargin = insets.right;
        int i3 = this.mPositionCode;
        if (i3 == -1) {
            int convertDpToPixel = (int) PluginUtils.convertDpToPixel(this.mHorizontalOffset);
            if (convertDpToPixel >= i) {
                i = convertDpToPixel;
            }
            int convertDpToPixel2 = (int) PluginUtils.convertDpToPixel(this.mVerticalOffset);
            if (convertDpToPixel2 >= i2) {
                i2 = convertDpToPixel2;
            }
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
        } else {
            layoutParams.leftMargin = i;
            if (i3 == 0 || i3 == 2 || i3 == 3) {
                layoutParams.topMargin = i2;
            }
        }
        return layoutParams;
    }

    private Insets getInsets() {
        DisplayCutout displayCutout;
        DisplayCutout displayCutout2;
        int safeInsetTop;
        int safeInsetLeft;
        int safeInsetBottom;
        int safeInsetRight;
        Insets insets = new Insets();
        if (Build.VERSION.SDK_INT >= 28 && this.activity.getWindow() != null && this.activity.getWindow().getDecorView().getRootWindowInsets() != null) {
            displayCutout = this.activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null) {
                displayCutout2 = this.activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
                safeInsetTop = displayCutout2.getSafeInsetTop();
                insets.top = safeInsetTop;
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                insets.left = safeInsetLeft;
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                insets.bottom = safeInsetBottom;
                safeInsetRight = displayCutout2.getSafeInsetRight();
                insets.right = safeInsetRight;
            }
        }
        return insets;
    }
}
