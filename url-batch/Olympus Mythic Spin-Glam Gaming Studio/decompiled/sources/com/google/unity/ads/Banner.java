package com.google.unity.ads;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes11.dex */
public class Banner {
    protected BaseAdView adView;
    protected boolean hidden;
    private int mHorizontalOffset;
    private View.OnLayoutChangeListener mLayoutChangeListener;
    private int mPositionCode;
    private int mVerticalOffset;
    protected UnityAdListener unityListener;
    protected Activity unityPlayerActivity;

    protected static class Insets {
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;

        protected Insets() {
        }
    }

    protected Banner() {
    }

    public Banner(Activity activity, UnityAdListener unityAdListener) {
        this.unityPlayerActivity = activity;
        this.unityListener = unityAdListener;
    }

    public void create(final String str, final AdSize adSize, final int i) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.Banner.1
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.createAdView(str, adSize);
                this.this$0.mHorizontalOffset = 0;
                this.this$0.mVerticalOffset = 0;
                this.this$0.mPositionCode = i;
                this.this$0.hidden = false;
            }
        });
    }

    public void create(final String str, final AdSize adSize, final int i, final int i2) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.Banner.2
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.createAdView(str, adSize);
                this.this$0.mPositionCode = -1;
                this.this$0.mHorizontalOffset = i;
                this.this$0.mVerticalOffset = i2;
                this.this$0.hidden = false;
            }
        });
    }

    protected void createAdView(String str, AdSize adSize) {
        AdView adView = new AdView(this.unityPlayerActivity);
        this.adView = adView;
        adView.setBackgroundColor(0);
        this.adView.setAdUnitId(str);
        this.adView.setAdSize(adSize);
        this.adView.setVisibility(8);
        this.adView.setDescendantFocusability(393216);
        this.unityPlayerActivity.addContentView(this.adView, getLayoutParams());
        this.adView.setAdListener(new AdListener(this) { // from class: com.google.unity.ads.Banner.3
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                Banner banner = this.this$0;
                if (banner.unityListener != null) {
                    if (!banner.hidden) {
                        banner.show();
                    }
                    new Thread(new Runnable(this) { // from class: com.google.unity.ads.Banner.3.1
                        final /* synthetic */ AnonymousClass3 this$1;

                        {
                            Objects.requireNonNull(this);
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            UnityAdListener unityAdListener = this.this$1.this$0.unityListener;
                            if (unityAdListener != null) {
                                unityAdListener.onAdLoaded();
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(final LoadAdError loadAdError) {
                if (this.this$0.unityListener != null) {
                    new Thread(new Runnable(this) { // from class: com.google.unity.ads.Banner.3.2
                        final /* synthetic */ AnonymousClass3 this$1;

                        {
                            Objects.requireNonNull(this);
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            UnityAdListener unityAdListener = this.this$1.this$0.unityListener;
                            if (unityAdListener != null) {
                                unityAdListener.onAdFailedToLoad(loadAdError);
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                if (this.this$0.unityListener != null) {
                    new Thread(new Runnable(this) { // from class: com.google.unity.ads.Banner.3.3
                        final /* synthetic */ AnonymousClass3 this$1;

                        {
                            Objects.requireNonNull(this);
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            UnityAdListener unityAdListener = this.this$1.this$0.unityListener;
                            if (unityAdListener != null) {
                                unityAdListener.onAdOpened();
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                if (this.this$0.unityListener != null) {
                    new Thread(new Runnable(this) { // from class: com.google.unity.ads.Banner.3.4
                        final /* synthetic */ AnonymousClass3 this$1;

                        {
                            Objects.requireNonNull(this);
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            UnityAdListener unityAdListener = this.this$1.this$0.unityListener;
                            if (unityAdListener != null) {
                                unityAdListener.onAdClosed();
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                if (this.this$0.unityListener != null) {
                    new Thread(new Runnable(this) { // from class: com.google.unity.ads.Banner.3.5
                        final /* synthetic */ AnonymousClass3 this$1;

                        {
                            Objects.requireNonNull(this);
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            UnityAdListener unityAdListener = this.this$1.this$0.unityListener;
                            if (unityAdListener != null) {
                                unityAdListener.onAdImpression();
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                if (this.this$0.unityListener != null) {
                    new Thread(new Runnable(this) { // from class: com.google.unity.ads.Banner.3.6
                        final /* synthetic */ AnonymousClass3 this$1;

                        {
                            Objects.requireNonNull(this);
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            UnityAdListener unityAdListener = this.this$1.this$0.unityListener;
                            if (unityAdListener != null) {
                                unityAdListener.onAdClicked();
                            }
                        }
                    }).start();
                }
            }
        });
        this.adView.setOnPaidEventListener(new OnPaidEventListener(this) { // from class: com.google.unity.ads.Banner.4
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.google.android.gms.ads.OnPaidEventListener
            public void onPaidEvent(final AdValue adValue) {
                if (this.this$0.unityListener != null) {
                    new Thread(new Runnable(this) { // from class: com.google.unity.ads.Banner.4.1
                        final /* synthetic */ AnonymousClass4 this$1;

                        {
                            Objects.requireNonNull(this);
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            UnityAdListener unityAdListener = this.this$1.this$0.unityListener;
                            if (unityAdListener != null) {
                                unityAdListener.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
                            }
                        }
                    }).start();
                }
            }
        });
        setLayoutChangeListener();
    }

    protected void setLayoutChangeListener() {
        this.mLayoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: com.google.unity.ads.Banner.5
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i3 == i7 && i4 == i8 && i2 == i6) {
                    return;
                }
                Banner banner = this.this$0;
                if (banner.hidden) {
                    return;
                }
                banner.updatePosition();
            }
        };
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().addOnLayoutChangeListener(this.mLayoutChangeListener);
    }

    public void loadAd(final AdRequest adRequest) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.Banner.6
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(PluginUtils.LOGTAG, "Calling loadAd() on Android");
                this.this$0.adView.loadAd(adRequest);
            }
        });
    }

    public void show() {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.Banner.7
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(PluginUtils.LOGTAG, "Calling show() on Android");
                Banner banner = this.this$0;
                banner.hidden = false;
                banner.adView.setVisibility(0);
                this.this$0.updatePosition();
                this.this$0.adView.resume();
            }
        });
    }

    public void hide() {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.Banner.8
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(PluginUtils.LOGTAG, "Calling hide() on Android");
                Banner banner = this.this$0;
                banner.hidden = true;
                banner.adView.setVisibility(8);
                this.this$0.adView.pause();
            }
        });
    }

    public void destroy() {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.Banner.9
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(PluginUtils.LOGTAG, "Calling destroy() on Android");
                BaseAdView baseAdView = this.this$0.adView;
                if (baseAdView != null) {
                    baseAdView.destroy();
                    ViewParent parent = this.this$0.adView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(this.this$0.adView);
                    }
                }
            }
        });
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().removeOnLayoutChangeListener(this.mLayoutChangeListener);
    }

    @Nullable
    public String getAdUnitId() {
        BaseAdView baseAdView = this.adView;
        if (baseAdView == null) {
            return null;
        }
        return baseAdView.getAdUnitId();
    }

    public float getHeightInPixels() {
        this.unityPlayerActivity.runOnUiThread(new FutureTask(new Callable<Integer>(this) { // from class: com.google.unity.ads.Banner.10
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                return Integer.valueOf(this.this$0.adView.getAdSize().getHeightInPixels(this.this$0.unityPlayerActivity));
            }
        }));
        try {
            return ((Integer) r2.get()).intValue();
        } catch (InterruptedException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad view height: %s", e.getLocalizedMessage()));
            return -1.0f;
        } catch (ExecutionException e2) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad view height: %s", e2.getLocalizedMessage()));
            return -1.0f;
        }
    }

    public float getWidthInPixels() {
        this.unityPlayerActivity.runOnUiThread(new FutureTask(new Callable<Integer>(this) { // from class: com.google.unity.ads.Banner.11
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                return Integer.valueOf(this.this$0.adView.getAdSize().getWidthInPixels(this.this$0.unityPlayerActivity));
            }
        }));
        try {
            return ((Integer) r2.get()).intValue();
        } catch (InterruptedException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad view width: %s", e.getLocalizedMessage()));
            return -1.0f;
        } catch (ExecutionException e2) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad view width: %s", e2.getLocalizedMessage()));
            return -1.0f;
        }
    }

    public void setPosition(final int i) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.Banner.12
            final /* synthetic */ Banner this$0;

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
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.Banner.13
            final /* synthetic */ Banner this$0;

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

    public boolean isCollapsible() {
        BaseAdView baseAdView = this.adView;
        if (baseAdView == null) {
            return false;
        }
        return baseAdView.isCollapsible();
    }

    public long getPlacementId() {
        BaseAdView baseAdView = this.adView;
        if (baseAdView == null) {
            return 0L;
        }
        return baseAdView.getPlacementId();
    }

    public void setPlacementId(long j) {
        BaseAdView baseAdView = this.adView;
        if (baseAdView == null) {
            return;
        }
        baseAdView.setPlacementId(j);
    }

    public boolean isVisible() {
        BaseAdView baseAdView = this.adView;
        return baseAdView != null && baseAdView.getVisibility() == 0;
    }

    protected FrameLayout.LayoutParams getLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = PluginUtils.getLayoutGravityForPositionCode(this.mPositionCode);
        Insets safeInsets = getSafeInsets();
        int i = safeInsets.left;
        int i2 = safeInsets.top;
        layoutParams.bottomMargin = safeInsets.bottom;
        layoutParams.rightMargin = safeInsets.right;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePosition() {
        if (this.adView == null || this.hidden) {
            return;
        }
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.Banner.14
            final /* synthetic */ Banner this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.adView.setLayoutParams(this.this$0.getLayoutParams());
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Insets getSafeInsets() {
        Window window;
        DisplayCutout displayCutout;
        int safeInsetTop;
        int safeInsetLeft;
        int safeInsetBottom;
        int safeInsetRight;
        Insets insets = new Insets();
        if (Build.VERSION.SDK_INT < 28 || (window = this.unityPlayerActivity.getWindow()) == null || (r1 = window.getDecorView().getRootWindowInsets()) == null || displayCutout == null) {
            return insets;
        }
        safeInsetTop = displayCutout.getSafeInsetTop();
        insets.top = safeInsetTop;
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        insets.left = safeInsetLeft;
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        insets.bottom = safeInsetBottom;
        safeInsetRight = displayCutout.getSafeInsetRight();
        insets.right = safeInsetRight;
        return insets;
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        BaseAdView baseAdView = this.adView;
        if (baseAdView == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return baseAdView.getResponseInfo();
    }
}
