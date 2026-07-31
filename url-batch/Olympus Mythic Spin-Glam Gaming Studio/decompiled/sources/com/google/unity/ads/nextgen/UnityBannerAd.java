package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAd;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.nextgen.UnityBannerAd;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes10.dex */
public class UnityBannerAd {
    private View adView;
    private BannerAd bannerAd;

    @Nullable
    private FrameLayout bannerLayout;
    private final UnityBannerAdCallback callback;
    protected boolean hidden;
    private int horizontalOffset;
    private View.OnLayoutChangeListener layoutChangeListener;
    private int positionCode;
    protected Activity unityPlayerActivity;
    private int verticalOffset;

    protected static class Insets {
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;

        protected Insets() {
        }
    }

    public UnityBannerAd(Activity activity, UnityBannerAdCallback unityBannerAdCallback) {
        this.unityPlayerActivity = activity;
        this.callback = unityBannerAdCallback;
    }

    public void create(int i) {
        this.horizontalOffset = 0;
        this.verticalOffset = 0;
        this.positionCode = i;
        this.hidden = false;
    }

    public void create(int i, int i2) {
        this.positionCode = -1;
        this.horizontalOffset = i;
        this.verticalOffset = i2;
        this.hidden = false;
    }

    protected void load(BannerAdRequest bannerAdRequest) {
        BannerAd.load(bannerAdRequest, new AnonymousClass1(this));
        setLayoutChangeListener();
    }

    /* renamed from: com.google.unity.ads.nextgen.UnityBannerAd$1, reason: invalid class name */
    class AnonymousClass1 implements AdLoadCallback<BannerAd> {
        final /* synthetic */ UnityBannerAd this$0;

        AnonymousClass1(UnityBannerAd unityBannerAd) {
            Objects.requireNonNull(unityBannerAd);
            this.this$0 = unityBannerAd;
        }

        public void onAdLoaded(@NonNull BannerAd bannerAd) {
            this.this$0.bannerAd = bannerAd;
            UnityBannerAd unityBannerAd = this.this$0;
            if (!unityBannerAd.hidden) {
                unityBannerAd.show();
            }
            new Thread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityBannerAd.AnonymousClass1.this.lambda$onAdLoaded$0();
                }
            }).start();
            bannerAd.setAdEventCallback(new BannerAdEventCallback(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.1.1
                final /* synthetic */ AnonymousClass1 this$1;

                {
                    Objects.requireNonNull(this);
                    this.this$1 = this;
                }

                public void onAdImpression() {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onAdImpression();
                    }
                }

                public void onAdClicked() {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onAdClicked();
                    }
                }

                public void onAdShowedFullScreenContent() {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onAdOpened();
                    }
                }

                public void onAdDismissedFullScreenContent() {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onAdClosed();
                    }
                }

                public void onAdPaid(@NonNull AdValue adValue) {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull final LoadAdError loadAdError) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityBannerAd.AnonymousClass1.this.lambda$onAdFailedToLoad$0(loadAdError);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToLoad(loadAdError);
            }
        }
    }

    protected void show() {
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnityBannerAd.this.lambda$show$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        if (this.bannerAd == null) {
            Log.w(PluginUtils.LOGTAG, "Tried to show banner before ad was ready.");
            return;
        }
        if (this.bannerLayout == null) {
            this.bannerLayout = new FrameLayout(this.unityPlayerActivity);
        }
        if (this.bannerLayout.getParent() == null) {
            this.unityPlayerActivity.addContentView(this.bannerLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        this.adView = this.bannerAd.getView(this.unityPlayerActivity);
        this.bannerLayout.removeAllViews();
        this.bannerLayout.addView(this.adView);
        this.adView.setVisibility(0);
        updatePosition();
        this.hidden = false;
    }

    protected void hide() {
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                UnityBannerAd.this.lambda$hide$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$0() {
        FrameLayout frameLayout = this.bannerLayout;
        if (frameLayout == null || frameLayout.getParent() == null) {
            return;
        }
        ((ViewGroup) this.bannerLayout.getParent()).removeView(this.bannerLayout);
        this.hidden = true;
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        BannerAd bannerAd = this.bannerAd;
        if (bannerAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return bannerAd.getResponseInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePosition() {
        if (this.adView == null || this.hidden) {
            return;
        }
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.2
            final /* synthetic */ UnityBannerAd this$0;

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

    public void setPosition(final int i) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.3
            final /* synthetic */ UnityBannerAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.positionCode = i;
                this.this$0.updatePosition();
            }
        });
    }

    public void setPosition(final int i, final int i2) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.4
            final /* synthetic */ UnityBannerAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.positionCode = -1;
                this.this$0.horizontalOffset = i;
                this.this$0.verticalOffset = i2;
                this.this$0.updatePosition();
            }
        });
    }

    public float getHeightInPixels() {
        if (this.bannerAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get height of a null banner ad.");
            return -1.0f;
        }
        this.unityPlayerActivity.runOnUiThread(new FutureTask(new Callable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer lambda$getHeightInPixels$0;
                lambda$getHeightInPixels$0 = UnityBannerAd.this.lambda$getHeightInPixels$0();
                return lambda$getHeightInPixels$0;
            }
        }));
        try {
            return ((Integer) r0.get()).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad view height: %s", e.getLocalizedMessage()));
            return -1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getHeightInPixels$0() throws Exception {
        return Integer.valueOf(this.bannerAd.getAdSize().getHeightInPixels(this.unityPlayerActivity));
    }

    public float getWidthInPixels() {
        if (this.bannerAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get width of a null banner ad.");
            return -1.0f;
        }
        this.unityPlayerActivity.runOnUiThread(new FutureTask(new Callable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer lambda$getWidthInPixels$0;
                lambda$getWidthInPixels$0 = UnityBannerAd.this.lambda$getWidthInPixels$0();
                return lambda$getWidthInPixels$0;
            }
        }));
        try {
            return ((Integer) r0.get()).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad view width: %s", e.getLocalizedMessage()));
            return -1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getWidthInPixels$0() throws Exception {
        return Integer.valueOf(this.bannerAd.getAdSize().getWidthInPixels(this.unityPlayerActivity));
    }

    public boolean isCollapsible() {
        BannerAd bannerAd = this.bannerAd;
        if (bannerAd == null) {
            return false;
        }
        return bannerAd.isCollapsible();
    }

    public void destroy() {
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityBannerAd.this.lambda$destroy$0();
            }
        });
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().removeOnLayoutChangeListener(this.layoutChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$0() {
        if (this.bannerAd == null) {
            return;
        }
        FrameLayout frameLayout = this.bannerLayout;
        if (frameLayout != null) {
            frameLayout.removeView(this.adView);
        }
        this.bannerAd.destroy();
    }

    protected void setLayoutChangeListener() {
        this.layoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.5
            final /* synthetic */ UnityBannerAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i3 == i7 && i4 == i8 && i2 == i6) {
                    return;
                }
                UnityBannerAd unityBannerAd = this.this$0;
                if (unityBannerAd.hidden) {
                    return;
                }
                unityBannerAd.updatePosition();
            }
        };
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().addOnLayoutChangeListener(this.layoutChangeListener);
    }

    protected FrameLayout.LayoutParams getLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = PluginUtils.getLayoutGravityForPositionCode(this.positionCode);
        Insets safeInsets = getSafeInsets();
        int i = safeInsets.left;
        int i2 = safeInsets.top;
        layoutParams.bottomMargin = safeInsets.bottom;
        layoutParams.rightMargin = safeInsets.right;
        int i3 = this.positionCode;
        if (i3 == -1) {
            int convertDpToPixel = (int) PluginUtils.convertDpToPixel(this.horizontalOffset);
            if (convertDpToPixel >= i) {
                i = convertDpToPixel;
            }
            int convertDpToPixel2 = (int) PluginUtils.convertDpToPixel(this.verticalOffset);
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
}
