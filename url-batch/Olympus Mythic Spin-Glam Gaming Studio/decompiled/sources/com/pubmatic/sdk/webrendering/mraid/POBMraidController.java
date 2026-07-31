package com.pubmatic.sdk.webrendering.mraid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.R;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.network.POBImageRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import com.pubmatic.sdk.webrendering.mraid.POBAudioVolumeObserver;
import com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity;
import com.pubmatic.sdk.webrendering.mraid.q;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBAdVisibilityListener;
import com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity;
import com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PubMaticNetworkBridge;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@Keep
@MainThread
/* loaded from: classes14.dex */
public class POBMraidController implements n, POBAdVisibilityListener {
    private static final String TAG = "POBMraidController";

    @Nullable
    private String adomain;

    @NonNull
    private final Context appContext;

    @Nullable
    private POBAudioVolumeObserver.a audioVolumeChangeListener;

    @NonNull
    private POBMraidBridge currentBridge;

    @Nullable
    private POBNetworkHandler.POBImageNetworkListener<String> imageNetworkListener;
    private int initialHeight;
    private int initialWidth;
    private boolean isAdVisible;
    private boolean isExposureChangeEnabled;
    private boolean isViewableChangeTracking;

    @Nullable
    private POBLocationDetector locationDetector;

    @NonNull
    private final POBMraidBridge mraidBridge;

    @Nullable
    private o mraidControllerListener;
    private boolean mraidInitState;

    @Nullable
    private Map<String, String> orientationProperties;

    @NonNull
    private final String placementType;

    @Nullable
    private POBNetworkHandler pobNetworkHandler;
    private final int rendererId;

    @Nullable
    private q resizeView;

    @Nullable
    private ViewTreeObserver.OnScrollChangedListener scrollChangeListener;

    @Nullable
    private POBWebView twoPartWebView;

    @Nullable
    private k twoPartWebViewTouchListener;

    @Nullable
    private WeakReference<POBVideoPlayerActivity> videoPlayerActivityRef;
    private float visiblePercentage;

    @Nullable
    private ViewGroup webViewParent;

    class a implements POBNetworkHandler.POBImageNetworkListener {

        /* renamed from: com.pubmatic.sdk.webrendering.mraid.POBMraidController$a$a, reason: collision with other inner class name */
        class RunnableC1692a implements Runnable {
            final /* synthetic */ Bitmap a;

            RunnableC1692a(Bitmap bitmap) {
                this.a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMRAIDUtil.a(POBMraidController.this.appContext, this.a, Calendar.getInstance().getTimeInMillis() + ".jpeg")) {
                    POBLog.info(POBMraidController.TAG, "image successfully saved to device!", new Object[0]);
                } else {
                    POBLog.error(POBMraidController.TAG, "Error saving picture to device through MRAID ad.", new Object[0]);
                }
            }
        }

        a() {
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBImageNetworkListener
        public void onFailure(POBError pOBError) {
            POBLog.error(POBMraidController.TAG, "Network error connecting to url.", new Object[0]);
            POBMraidController.this.destroyImageResource();
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBImageNetworkListener
        public void onSuccess(Bitmap bitmap) {
            POBTaskHandler.getInstance().runOnBackgroundThread(new RunnableC1692a(bitmap));
            POBMraidController.this.destroyImageResource();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.pubmatic.sdk.webrendering.mraid.b.values().length];
            a = iArr;
            try {
                iArr[com.pubmatic.sdk.webrendering.mraid.b.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.pubmatic.sdk.webrendering.mraid.b.RESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class c implements POBVideoPlayerActivity.POBVideoPlayerActivityListener {
        c() {
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity.POBVideoPlayerActivityListener
        public void onDismiss() {
            POBMraidController.this.videoPlayerActivityRef = null;
            POBMraidController.this.notifyAdCloseState();
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity.POBVideoPlayerActivityListener
        public void onStart(POBVideoPlayerActivity pOBVideoPlayerActivity) {
            POBMraidController.this.videoPlayerActivityRef = new WeakReference(pOBVideoPlayerActivity);
            POBMraidController.this.notifyAdOpenState();
        }
    }

    class d implements POBAudioVolumeObserver.a {
        d() {
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBAudioVolumeObserver.a
        public void a(Double d) {
            if (POBMraidController.this.adHasAudioFocus()) {
                POBMraidController.this.notifyAudioChangeToAd(d);
            } else {
                POBMraidController.this.notifyAudioChangeToAd(null);
            }
        }
    }

    class e implements ViewTreeObserver.OnScrollChangedListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            POBMraidController.this.updateExposureProperty(true);
        }
    }

    class f implements q.d {
        final /* synthetic */ ImageView a;
        final /* synthetic */ ImageView b;

        f(ImageView imageView, ImageView imageView2) {
            this.a = imageView;
            this.b = imageView2;
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.q.d
        public void a(POBAdViewContainer pOBAdViewContainer) {
            RelativeLayout d = POBMraidController.this.resizeView.d();
            if (this.a != null) {
                if (POBMraidController.this.mraidControllerListener != null) {
                    POBMraidController.this.mraidControllerListener.removeFriendlyObstructions(this.a);
                }
                d.removeView(this.a);
                POBMraidController.this.mraidBridge.adViewContainer.addView(this.a);
                this.a.bringToFront();
                if (POBMraidController.this.mraidControllerListener != null) {
                    POBMraidController.this.mraidControllerListener.addFriendlyObstructions(this.a, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
                }
            }
            if (POBMraidController.this.mraidControllerListener != null && this.b != null) {
                POBMraidController.this.mraidControllerListener.removeFriendlyObstructions(this.b);
            }
            POBMraidController.this.handleResizeViewCloseEvent();
        }
    }

    class g implements POBMraidViewContainerListener {
        g() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
        public void onClose() {
            POBFullScreenActivity.closeActivity(POBMraidController.this.appContext, POBMraidController.this.rendererId);
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
        public void onForward() {
        }
    }

    class h implements POBFullScreenActivityListener {
        final /* synthetic */ POBAdViewContainer a;
        final /* synthetic */ ImageView b;
        final /* synthetic */ POBMraidViewContainer c;
        final /* synthetic */ ViewGroup d;

        h(POBAdViewContainer pOBAdViewContainer, ImageView imageView, POBMraidViewContainer pOBMraidViewContainer, ViewGroup viewGroup) {
            this.a = pOBAdViewContainer;
            this.b = imageView;
            this.c = pOBMraidViewContainer;
            this.d = viewGroup;
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onCreate(Activity activity) {
            this.a.getAdView().setBaseContext(activity);
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onDestroy() {
            POBLog.debug(POBMraidController.TAG, "expand close", new Object[0]);
            POBWebView adView = this.a.getAdView();
            adView.setBaseContext(POBMraidController.this.appContext);
            if (POBMraidController.this.mraidControllerListener != null && this.b != null) {
                POBMraidController.this.mraidControllerListener.removeFriendlyObstructions(this.b);
            }
            POBMraidViewContainer pOBMraidViewContainer = this.c;
            if (pOBMraidViewContainer != null) {
                ImageView skipBtn = pOBMraidViewContainer.getSkipBtn();
                if (POBMraidController.this.mraidControllerListener != null && skipBtn != null) {
                    POBMraidController.this.mraidControllerListener.removeFriendlyObstructions(skipBtn);
                }
                this.c.removeView(this.b);
            }
            if (POBMraidController.this.mraidControllerListener != null) {
                POBMraidController.this.mraidControllerListener.onAdViewChanged(adView);
            }
            ImageView imageView = this.b;
            if (imageView != null) {
                this.a.addView(imageView);
                this.b.bringToFront();
                if (POBMraidController.this.mraidControllerListener != null) {
                    POBMraidController.this.mraidControllerListener.addFriendlyObstructions(this.b, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
                }
            }
            if (this.d != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(POBMraidController.this.initialWidth, POBMraidController.this.initialHeight);
                ViewGroup viewGroup = (ViewGroup) this.a.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.a);
                }
                this.d.addView(this.a, layoutParams);
                this.a.requestFocus();
            }
            POBMraidController.this.manageClose();
        }
    }

    class i implements POBHTMLViewClient.OnRenderProcessGoneListener {
        i() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient.OnRenderProcessGoneListener
        public void onRenderProcessGone() {
            if (POBMraidController.this.twoPartWebView != null) {
                POBMraidController.this.twoPartWebView.destroy();
                POBMraidController.this.twoPartWebView = null;
            }
        }
    }

    class j extends POBWebClient {
        final /* synthetic */ POBMraidBridge e;
        final /* synthetic */ POBAdViewContainer f;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                j jVar = j.this;
                POBMraidController pOBMraidController = POBMraidController.this;
                pOBMraidController.initProperties(jVar.e, pOBMraidController.mraidInitState);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(POBHTMLViewClient.OnRenderProcessGoneListener onRenderProcessGoneListener, POBMraidBridge pOBMraidBridge, POBAdViewContainer pOBAdViewContainer) {
            super(onRenderProcessGoneListener);
            this.e = pOBMraidBridge;
            this.f = pOBAdViewContainer;
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBWebClient, com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.F, view, url);
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            POBMraidController pOBMraidController = POBMraidController.this;
            pOBMraidController.initProperties(this.e, pOBMraidController.mraidInitState);
            POBMraidController.this.mraidInitState = false;
            POBAdViewContainer pOBAdViewContainer = this.f;
            if (pOBAdViewContainer != null) {
                pOBAdViewContainer.addOnLayoutChangeListener(new a());
                POBMraidController.this.mraidBridge.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.EXPANDED);
                POBMraidController.this.currentBridge = this.e;
            }
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBWebClient, com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.F, view, url);
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBWebClient, com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.F, view, errorCode, description, failingUrl);
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBWebClient, com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.F, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBWebClient, com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.F, view, url, shouldOverrideUrlLoading);
            return shouldOverrideUrlLoading;
        }
    }

    static class k implements View.OnTouchListener {
        boolean a;

        k() {
        }

        boolean a() {
            boolean z = this.a;
            this.a = false;
            return z;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                POBLog.debug(POBMraidController.TAG, "WebView onTouch : Focus=" + view.hasFocus(), new Object[0]);
                if (view.hasFocus()) {
                    this.a = true;
                }
            }
            return false;
        }
    }

    POBMraidController(@NonNull Context context, @NonNull POBMraidBridge pOBMraidBridge, @NonNull String str, int i2) {
        this.currentBridge = pOBMraidBridge;
        this.mraidBridge = pOBMraidBridge;
        this.rendererId = i2;
        this.placementType = str;
        pOBMraidBridge.setMraidBridgeListener(this);
        this.isAdVisible = this.currentBridge.webView.getVisibility() == 0;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.locationDetector = POBInstanceProvider.getLocationDetector(applicationContext);
        this.orientationProperties = new HashMap();
        this.isExposureChangeEnabled = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean adHasAudioFocus() {
        return this.isAdVisible;
    }

    private void addAudioVolumeListener() {
        if (this.audioVolumeChangeListener == null) {
            this.audioVolumeChangeListener = new d();
        }
        POBAudioVolumeObserver.a().registerListener(this.appContext, this.audioVolumeChangeListener);
        updateRecentAudioVolumeToAd();
    }

    private void addExposureChangeListener() {
        if (this.scrollChangeListener == null) {
            this.scrollChangeListener = new e();
        }
        this.currentBridge.webView.getViewTreeObserver().addOnScrollChangedListener(this.scrollChangeListener);
        updateExposureProperty(true);
    }

    private void addToParent() {
        if (this.webViewParent != null) {
            this.webViewParent.addView(this.mraidBridge.adViewContainer, new FrameLayout.LayoutParams(this.initialWidth, this.initialHeight));
            this.webViewParent = null;
            this.mraidBridge.adViewContainer.requestFocus();
            this.initialWidth = 0;
            this.initialHeight = 0;
            o oVar = this.mraidControllerListener;
            if (oVar != null) {
                oVar.onAdViewChanged(this.mraidBridge.adViewContainer.getAdView());
            }
        }
    }

    private void allowOrientationChange(@NonNull Activity activity, boolean z) {
        if (z) {
            activity.setRequestedOrientation(-1);
        }
    }

    private void closeVideoPlayerActivity() {
        WeakReference<POBVideoPlayerActivity> weakReference = this.videoPlayerActivityRef;
        if (weakReference != null) {
            POBVideoPlayerActivity pOBVideoPlayerActivity = weakReference.get();
            if (pOBVideoPlayerActivity != null && !pOBVideoPlayerActivity.isFinishing() && !pOBVideoPlayerActivity.isDestroyed()) {
                pOBVideoPlayerActivity.finish();
            }
            this.videoPlayerActivityRef = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyImageResource() {
        POBNetworkHandler pOBNetworkHandler = this.pobNetworkHandler;
        if (pOBNetworkHandler != null) {
            pOBNetworkHandler.cancelRequest(TAG);
            this.pobNetworkHandler = null;
        }
        this.imageNetworkListener = null;
    }

    private void dismissResize() {
        q qVar = this.resizeView;
        if (qVar != null) {
            qVar.b();
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void forceOrientation(@NonNull Activity activity, @Nullable String str) {
        String str2 = str != null ? str : "none";
        if (str2.equals("portrait")) {
            activity.setRequestedOrientation(1);
            return;
        }
        if (str2.equals("landscape")) {
            activity.setRequestedOrientation(0);
            return;
        }
        POBLog.debug(TAG, "default forceOrientation :" + str, new Object[0]);
    }

    @Nullable
    private Double getAudioVolumePercentage(@NonNull Context context) {
        return POBAudioVolumeObserver.getAudioVolumePercentage(context);
    }

    private POBNetworkHandler.POBImageNetworkListener<String> getImageNetworkListener() {
        return new a();
    }

    private String getInterstitialOrientation(@NonNull Context context) {
        return POBUtils.getDeviceOrientation(context) == 2 ? "sensor_landscape" : "portrait";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResizeViewCloseEvent() {
        addToParent();
        manageClose();
        this.resizeView = null;
    }

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    private void handleTwoPartExpand(@Nullable String str, boolean z) {
        this.mraidInitState = true;
        POBWebView createInstance = POBWebView.createInstance(this.appContext);
        this.twoPartWebView = createInstance;
        if (createInstance == null || POBUtils.isNullOrEmpty(str)) {
            POBLog.error(TAG, "Unable to render two-part expand, as webview or URL is not available", new Object[0]);
            this.mraidBridge.notifyError("Unable to render two-part expand.", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e);
            return;
        }
        POBAdViewContainer pOBAdViewContainer = new POBAdViewContainer(this.appContext, this.twoPartWebView);
        this.twoPartWebView.getSettings().setJavaScriptEnabled(true);
        k kVar = new k();
        this.twoPartWebViewTouchListener = kVar;
        this.twoPartWebView.setOnTouchListener(kVar);
        addInlineVideoSupportToWebView(this.twoPartWebView);
        POBMraidBridge pOBMraidBridge = new POBMraidBridge(pOBAdViewContainer);
        addCommandHandlers(pOBMraidBridge, true, false);
        pOBMraidBridge.setMraidBridgeListener(this);
        j jVar = new j(new i(), pOBMraidBridge, pOBAdViewContainer);
        jVar.disableMultipleOnPageFinished(true);
        this.twoPartWebView.setWebViewClient(jVar);
        manageExpand(pOBAdViewContainer, pOBMraidBridge, z);
        PubMaticNetworkBridge.webviewLoadUrl(this.twoPartWebView, str);
    }

    private boolean isTwoPartExpandShowing() {
        return this.currentBridge != this.mraidBridge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void manageClose() {
        Map<String, String> map = this.orientationProperties;
        if (map != null) {
            map.clear();
        }
        this.mraidBridge.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.DEFAULT);
        if (isTwoPartExpandShowing()) {
            initProperties(this.mraidBridge, false);
            this.mraidBridge.setMraidBridgeListener(this);
            addCommandHandlers(this.mraidBridge, false, false);
        }
        this.currentBridge = this.mraidBridge;
        notifyAdCloseState();
    }

    private void manageExpand(@NonNull POBAdViewContainer pOBAdViewContainer, @NonNull POBMraidBridge pOBMraidBridge, boolean z) {
        if (this.initialWidth == 0) {
            this.initialWidth = pOBAdViewContainer.getWidth();
        }
        if (this.initialHeight == 0) {
            this.initialHeight = pOBAdViewContainer.getHeight();
        }
        ViewGroup viewGroup = (ViewGroup) pOBAdViewContainer.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(pOBAdViewContainer);
        }
        ImageView watermarkView = pOBAdViewContainer.getWatermarkView();
        POBMraidViewContainer pOBMraidViewContainer = new POBMraidViewContainer(this.appContext, pOBAdViewContainer, false);
        if (watermarkView != null) {
            pOBAdViewContainer.removeView(watermarkView);
            pOBMraidViewContainer.setWatermarkView(watermarkView);
        }
        if (z) {
            pOBMraidViewContainer.setCustomCloseEnabled(true);
            pOBMraidViewContainer.handleSkipTimer(20000L);
        }
        pOBMraidViewContainer.setMraidViewContainerListener(new g());
        POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(this.rendererId), new POBAdViewCacheService.AdViewConfig(pOBMraidViewContainer, new h(pOBAdViewContainer, watermarkView, pOBMraidViewContainer, viewGroup)));
        Intent intent = new Intent();
        intent.putExtra(POBFullScreenActivity.RENDERER_IDENTIFIER, this.rendererId);
        Map<String, String> map = this.orientationProperties;
        if (map != null && !map.isEmpty()) {
            String str = this.orientationProperties.get("forceOrientation");
            if (str != null) {
                intent.putExtra(POBFullScreenActivity.REQUESTED_ORIENTATION, str.equals("landscape") ? 2 : 1);
            }
            String str2 = this.orientationProperties.get("allowOrientationChange");
            if (str2 != null) {
                intent.putExtra(POBFullScreenActivity.ALLOW_ORIENTATION_CHANGE, Boolean.parseBoolean(str2));
            }
        }
        try {
            safedk_POBFullScreenActivity_startActivity_9b43eeb3a2c956a47043e4be8e9dab59(this.appContext, intent);
            q qVar = this.resizeView;
            if (qVar != null) {
                qVar.a(false);
                this.resizeView.a();
            }
            if (this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.DEFAULT) {
                notifyAdOpenState();
            }
            pOBMraidBridge.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.EXPANDED);
            o oVar = this.mraidControllerListener;
            if (oVar != null) {
                oVar.onAdViewChanged(pOBAdViewContainer.getAdView());
                this.mraidControllerListener.addFriendlyObstructions(pOBMraidViewContainer.getSkipBtn(), POBObstructionUpdateListener.POBFriendlyObstructionPurpose.CLOSE_AD);
            }
        } catch (Exception e2) {
            POBLog.error(TAG, "Error expanding the banner ad. Error: %s", e2.getMessage());
        }
    }

    private void manageResize(Context context, int i2, int i3, int i4, int i5, boolean z) {
        q qVar;
        com.pubmatic.sdk.webrendering.mraid.b mraidState = this.mraidBridge.getMraidState();
        com.pubmatic.sdk.webrendering.mraid.b bVar = com.pubmatic.sdk.webrendering.mraid.b.DEFAULT;
        if (mraidState == bVar || this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.RESIZED) {
            int[] viewXYPosition = POBUtils.getViewXYPosition(this.mraidBridge.adViewContainer);
            int i6 = viewXYPosition[0];
            int i7 = viewXYPosition[1];
            if (this.mraidBridge.getMraidState().equals(bVar)) {
                this.initialWidth = this.mraidBridge.adViewContainer.getWidth();
                this.initialHeight = this.mraidBridge.adViewContainer.getHeight();
            }
            POBViewRect resizeValues = POBMRAIDUtil.getResizeValues(i4, i5, i2, i3, z, new POBViewRect(i6, i7, i3, i2, false, null), POBUtils.convertPixelToDp(context.getResources().getDrawable(R.drawable.pob_close_button).getIntrinsicWidth()), POBUtils.convertPixelToDp(context.getResources().getDrawable(R.drawable.pob_close_button).getIntrinsicHeight()));
            if (!resizeValues.isStatus()) {
                this.mraidBridge.notifyError(resizeValues.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g);
                return;
            }
            int i8 = resizeValues.getxPosition();
            int i9 = resizeValues.getyPosition();
            int width = resizeValues.getWidth();
            int height = resizeValues.getHeight();
            q qVar2 = this.resizeView;
            if (qVar2 == null) {
                ViewGroup viewGroup = (ViewGroup) this.mraidBridge.adViewContainer.getParent();
                this.webViewParent = viewGroup;
                if (viewGroup != null) {
                    ImageView watermarkView = this.mraidBridge.adViewContainer.getWatermarkView();
                    if (watermarkView != null) {
                        this.mraidBridge.adViewContainer.removeView(watermarkView);
                    }
                    this.webViewParent.removeView(this.mraidBridge.adViewContainer);
                    q qVar3 = new q(this.appContext);
                    this.resizeView = qVar3;
                    ImageView c2 = qVar3.c();
                    this.resizeView.a((ViewGroup) this.webViewParent.getRootView(), this.mraidBridge.adViewContainer, width, height, i8, i9, new f(watermarkView, c2));
                    if (watermarkView != null) {
                        this.resizeView.d().addView(watermarkView);
                    }
                    o oVar = this.mraidControllerListener;
                    if (oVar != null) {
                        oVar.onAdViewChanged(this.mraidBridge.adViewContainer.getAdView());
                        if (watermarkView != null) {
                            this.mraidControllerListener.addFriendlyObstructions(watermarkView, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
                        }
                        if (c2 != null) {
                            this.mraidControllerListener.addFriendlyObstructions(c2, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.CLOSE_AD);
                        }
                    }
                    this.resizeView.e();
                } else {
                    POBLog.error(TAG, "Unable to resize as web view parent view is null", new Object[0]);
                }
            } else {
                qVar2.a(width, height, i8, i9);
            }
            if (this.mraidBridge.getMraidState() == bVar) {
                notifyAdOpenState();
            }
            this.mraidBridge.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.RESIZED);
            initProperties(this.mraidBridge, false);
            this.currentBridge = this.mraidBridge;
        } else {
            POBLog.debug(TAG, "Ad is already open in " + this.mraidBridge.getMraidState().b() + " state!", new Object[0]);
            this.mraidBridge.notifyError("Ad is already open in " + this.mraidBridge.getMraidState().b() + " state!", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g);
        }
        if (this.mraidControllerListener == null || (qVar = this.resizeView) == null || qVar.c() == null) {
            return;
        }
        this.mraidControllerListener.addFriendlyObstructions(this.resizeView.c(), POBObstructionUpdateListener.POBFriendlyObstructionPurpose.CLOSE_AD);
    }

    private void notifyAdClick() {
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.onMRAIDAdClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdCloseState() {
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.onAdInteractionStopped();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdOpenState() {
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.onAdInteractionStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAudioChangeToAd(@Nullable Double d2) {
        this.currentBridge.setAudioVolumePercentage(d2);
    }

    private void removeAudioVolumeListener() {
        if (this.audioVolumeChangeListener != null) {
            POBAudioVolumeObserver.a().unregisterListener(this.appContext, this.audioVolumeChangeListener);
        }
        this.audioVolumeChangeListener = null;
    }

    private void removeExposureChangeListener() {
        if (this.scrollChangeListener != null) {
            this.currentBridge.webView.getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangeListener);
            this.scrollChangeListener = null;
        }
    }

    public static void safedk_POBFullScreenActivity_startActivity_9b43eeb3a2c956a47043e4be8e9dab59(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/pubmatic/sdk/webrendering/ui/POBFullScreenActivity;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.F);
        POBFullScreenActivity.startActivity(p0, p1);
    }

    public static void safedk_POBUtils_startActivity_77a045103a3f673fe5e6fdc8c1e6b82c(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/pubmatic/sdk/common/utility/POBUtils;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.F);
        POBUtils.startActivity(p0, p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateExposureProperty(boolean z) {
        float height;
        JSONObject rectJson;
        if (z) {
            Rect rect = new Rect();
            this.currentBridge.webView.getGlobalVisibleRect(rect);
            height = ((rect.height() * rect.width()) / (this.currentBridge.webView.getHeight() * this.currentBridge.webView.getWidth())) * 100.0f;
            rectJson = POBMRAIDUtil.getRectJson(POBUtils.convertPixelToDp(rect.left), POBUtils.convertPixelToDp(rect.top), POBUtils.convertPixelToDp(rect.width()), POBUtils.convertPixelToDp(rect.height()));
        } else {
            rectJson = POBMRAIDUtil.getRectJson(0, 0, 0, 0);
            height = 0.0f;
        }
        if (Math.abs(this.visiblePercentage - height) > 1.0f) {
            this.visiblePercentage = height;
            POBLog.debug(TAG, "visible percentage :" + height, new Object[0]);
            this.currentBridge.updateExposureChangeData(Float.valueOf(this.visiblePercentage), rectJson);
        }
    }

    private void updateRecentAudioVolumeToAd() {
        if (adHasAudioFocus()) {
            notifyAudioChangeToAd(getAudioVolumePercentage(this.appContext));
        } else {
            notifyAudioChangeToAd(null);
        }
    }

    void addCommandHandlers(@NonNull POBMraidBridge pOBMraidBridge, boolean z, boolean z2) {
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.j());
        if (!z2) {
            pOBMraidBridge.addCommandHandler(new l());
            pOBMraidBridge.addCommandHandler(new r());
        }
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.f());
        pOBMraidBridge.addCommandHandler(new m());
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.e());
        pOBMraidBridge.addCommandHandler(new p());
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.d());
        if (!z) {
            pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.i());
            pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.k());
        }
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.h());
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.c());
    }

    void addInlineVideoSupportToWebView(@NonNull WebView webView) {
        webView.setWebChromeClient(new WebChromeClient());
        try {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        } catch (NoSuchMethodError e2) {
            POBLog.error(TAG, "Not able to add inline video support to WebView, %s", e2.getLocalizedMessage());
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void checkAppInstallStatus(@NonNull String str) {
        this.currentBridge.notifyAppInstallStatus(str, POBAppInstallStatusHelper.determineAppInstallStatus(this.appContext, POBInstanceProvider.getCacheManager(this.appContext), str, this.adomain).getValue());
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void close() {
        POBLog.debug(TAG, "Received MRAID close event", new Object[0]);
        if (!this.placementType.equals(POBCommonConstants.BANNER_PLACEMENT_TYPE)) {
            if (this.placementType.equals("interstitial")) {
                notifyAdCloseState();
                return;
            }
            return;
        }
        int i2 = b.a[this.currentBridge.getMraidState().ordinal()];
        if (i2 == 1) {
            POBFullScreenActivity.closeActivity(this.appContext, this.rendererId);
        } else {
            if (i2 != 2) {
                return;
            }
            dismissResize();
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void createCalendarEvent(@NonNull JSONObject jSONObject, boolean z) {
        if (z) {
            notifyAdClick();
        }
        try {
            Map a2 = POBMRAIDUtil.a(new JSONObject(jSONObject.optString("event")));
            POBLog.debug(TAG, "calendarParams :%s", a2);
            Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
            for (Map.Entry entry : a2.entrySet()) {
                Object value = entry.getValue();
                String str = (String) entry.getKey();
                if (value instanceof Long) {
                    type.putExtra(str, ((Long) value).longValue());
                } else if (value instanceof Integer) {
                    type.putExtra(str, ((Integer) value).intValue());
                } else {
                    type.putExtra(str, (String) value);
                }
            }
            type.setFlags(268435456);
            safedk_POBUtils_startActivity_77a045103a3f673fe5e6fdc8c1e6b82c(this.appContext, type);
            o oVar = this.mraidControllerListener;
            if (oVar != null) {
                oVar.onLeavingApplication();
            }
        } catch (ActivityNotFoundException e2) {
            this.currentBridge.notifyError("Device does not have calendar app." + e2.getLocalizedMessage(), "createCalendarEvent");
            POBLog.error(TAG, "Device does not have calendar app.%s", e2.getLocalizedMessage());
        } catch (IllegalArgumentException e3) {
            this.currentBridge.notifyError("Error parsing calendar event data." + e3.getLocalizedMessage(), "createCalendarEvent");
            POBLog.error(TAG, "Error parsing calendar event data.%s", e3.getLocalizedMessage());
        } catch (Exception e4) {
            this.currentBridge.notifyError("Something went wrong." + e4.getLocalizedMessage(), "createCalendarEvent");
            POBLog.error(TAG, "Something went wrong.%s", e4.getLocalizedMessage());
        }
    }

    public void destroy() {
        removeAudioVolumeListener();
        removeExposureChangeListener();
        destroyImageResource();
        dismissResize();
        POBNetworkHandler pOBNetworkHandler = this.pobNetworkHandler;
        if (pOBNetworkHandler != null) {
            pOBNetworkHandler.cancelRequest(TAG);
            this.pobNetworkHandler = null;
        }
        this.imageNetworkListener = null;
        closeVideoPlayerActivity();
        this.isViewableChangeTracking = false;
        if (this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.EXPANDED) {
            POBFullScreenActivity.closeActivity(this.appContext, this.rendererId);
        }
        this.locationDetector = null;
        this.orientationProperties = null;
        this.isExposureChangeEnabled = false;
        POBWebView pOBWebView = this.twoPartWebView;
        if (pOBWebView != null) {
            pOBWebView.destroy();
            this.twoPartWebView = null;
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void expand(@Nullable String str, boolean z, boolean z2) {
        POBLog.debug(TAG, "MRAID expand custom close: %s", Boolean.valueOf(z2));
        if (!this.placementType.equals(POBCommonConstants.BANNER_PLACEMENT_TYPE)) {
            POBLog.error(TAG, "Can't expand interstitial ad.", new Object[0]);
            this.mraidBridge.notifyError("Can't expand interstitial ad.", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e);
            return;
        }
        if (z) {
            notifyAdClick();
        }
        if (this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.DEFAULT || this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.RESIZED) {
            if (str != null && !str.isEmpty()) {
                handleTwoPartExpand(str, z2);
            } else {
                POBMraidBridge pOBMraidBridge = this.mraidBridge;
                manageExpand(pOBMraidBridge.adViewContainer, pOBMraidBridge, z2);
            }
        }
    }

    void initProperties(@NonNull POBMraidBridge pOBMraidBridge, boolean z) {
        int i2;
        int i3;
        POBWebView pOBWebView = pOBMraidBridge.webView;
        int i4 = POBUtils.getViewXYPosition(pOBWebView)[0];
        int i5 = POBUtils.getViewXYPosition(pOBWebView)[1];
        int convertPixelToDp = POBUtils.convertPixelToDp(pOBWebView.getWidth());
        int convertPixelToDp2 = POBUtils.convertPixelToDp(pOBWebView.getHeight());
        DisplayMetrics displayMetrics = this.appContext.getResources().getDisplayMetrics();
        int convertPixelToDp3 = POBUtils.convertPixelToDp(displayMetrics.widthPixels);
        int convertPixelToDp4 = POBUtils.convertPixelToDp(displayMetrics.heightPixels);
        if (z) {
            pOBMraidBridge.setScreenSize(convertPixelToDp3, convertPixelToDp4);
            pOBMraidBridge.setDefaultPosition(i4, i5, convertPixelToDp, convertPixelToDp2);
            pOBMraidBridge.setPlacementType(this.placementType);
            boolean a2 = POBMRAIDUtil.a(this.appContext);
            pOBMraidBridge.setSupportedFeatures(a2, a2, true, true, true, true, false);
            POBLocation location = POBUtils.getLocation(this.locationDetector);
            if (location != null) {
                pOBMraidBridge.setLocation(location);
            }
            pOBMraidBridge.updateMraidState(pOBMraidBridge.getMraidState());
            pOBMraidBridge.updateEvent(com.pubmatic.sdk.webrendering.mraid.a.READY);
            pOBMraidBridge.updateViewable(true);
            i2 = convertPixelToDp4;
            i3 = convertPixelToDp3;
        } else {
            i2 = convertPixelToDp4;
            i3 = convertPixelToDp3;
        }
        boolean maxSize = pOBMraidBridge.setMaxSize(i3, i2);
        boolean currentPosition = pOBMraidBridge.setCurrentPosition(i4, i5, convertPixelToDp, convertPixelToDp2);
        if (maxSize || currentPosition) {
            pOBMraidBridge.setSizeChange(convertPixelToDp, convertPixelToDp2);
            if (this.isExposureChangeEnabled) {
                updateExposureProperty(pOBWebView.isShown());
            }
        }
        pOBMraidBridge.updateMraidState(pOBMraidBridge.getMraidState());
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public boolean isUserInteracted(boolean z) {
        k kVar;
        if (isTwoPartExpandShowing() && (kVar = this.twoPartWebViewTouchListener) != null) {
            return kVar.a();
        }
        o oVar = this.mraidControllerListener;
        return oVar != null && oVar.isUserInteracted(z);
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void listenerChanged(@Nullable String str, boolean z) {
        if ("audioVolumeChange".equalsIgnoreCase(str)) {
            if (z) {
                addAudioVolumeListener();
                return;
            } else {
                removeAudioVolumeListener();
                return;
            }
        }
        if ("exposureChange".equalsIgnoreCase(str)) {
            if (z) {
                this.isExposureChangeEnabled = true;
                addExposureChangeListener();
                return;
            } else {
                this.isExposureChangeEnabled = false;
                removeExposureChangeListener();
                return;
            }
        }
        if (X3.h.V.equalsIgnoreCase(str)) {
            this.isViewableChangeTracking = z;
            return;
        }
        POBLog.error(TAG, "Listener change not found for command " + str, new Object[0]);
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBAdVisibilityListener
    public void onVisibilityChange(boolean z) {
        if (this.isAdVisible != z) {
            this.isAdVisible = z;
            StringBuilder sb = new StringBuilder();
            sb.append("MRAID Ad Visibility changed ");
            sb.append(z ? "VISIBLE" : "INVISIBLE");
            POBLog.debug(TAG, sb.toString(), new Object[0]);
            if (this.scrollChangeListener != null) {
                updateExposureProperty(this.isAdVisible);
            }
            if (this.isViewableChangeTracking) {
                this.currentBridge.updateViewable(this.isAdVisible);
            }
            if (this.audioVolumeChangeListener != null) {
                updateRecentAudioVolumeToAd();
            }
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void open(@Nullable String str, boolean z) {
        POBLog.debug(TAG, "Received MRAID event to open url : %s", str);
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.onOpen(str);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void playVideo(@NonNull String str, boolean z) {
        if (z) {
            notifyAdClick();
        }
        boolean z2 = false;
        if (POBUtils.isNullOrEmpty(str)) {
            POBLog.debug(TAG, "Can't launch video player due to invalid URL", new Object[0]);
            return;
        }
        String interstitialOrientation = this.placementType.equals("interstitial") ? getInterstitialOrientation(this.appContext) : null;
        Map<String, String> map = this.orientationProperties;
        if (map != null) {
            if (map.get("forceOrientation") != null) {
                interstitialOrientation = this.orientationProperties.get("forceOrientation");
            }
            z2 = Boolean.parseBoolean(this.orientationProperties.get("allowOrientationChange"));
        }
        Bundle bundle = new Bundle();
        if (interstitialOrientation != null) {
            bundle.putString("ForceOrientation", interstitialOrientation);
            bundle.putBoolean(POBVideoPlayerActivity.ALLOW_ORIENTATION_KEY, z2);
        }
        POBVideoPlayerActivity.startNewActivity(this.appContext, str, bundle, new c());
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void resize(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        if (!this.placementType.equals(POBCommonConstants.BANNER_PLACEMENT_TYPE)) {
            POBLog.error(TAG, "Can't resize Interstitial ad.", new Object[0]);
            this.mraidBridge.notifyError("Can't perform resize on Interstitial ad.", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g);
        } else {
            if (z2) {
                notifyAdClick();
            }
            manageResize(this.appContext, i2, i3, i4, i5, z);
        }
    }

    public void setAdomain(@Nullable String str) {
        this.adomain = str;
    }

    void setMraidControllerListener(@Nullable o oVar) {
        this.mraidControllerListener = oVar;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void setOrientation(boolean z, @Nullable String str, boolean z2) {
        if (this.orientationProperties != null) {
            if ("portrait".equalsIgnoreCase(str) || "landscape".equalsIgnoreCase(str)) {
                this.orientationProperties.put("forceOrientation", str);
            } else if (POBUtils.getDeviceOrientation(this.appContext) == 2) {
                this.orientationProperties.put("forceOrientation", "landscape");
            } else {
                this.orientationProperties.put("forceOrientation", "portrait");
            }
            this.orientationProperties.put("allowOrientationChange", String.valueOf(z));
        }
        com.pubmatic.sdk.webrendering.mraid.b mraidState = this.currentBridge.getMraidState();
        if ((!this.placementType.equals(POBCommonConstants.BANNER_PLACEMENT_TYPE) || !mraidState.equals(com.pubmatic.sdk.webrendering.mraid.b.EXPANDED)) && (!this.placementType.equals("interstitial") || !mraidState.equals(com.pubmatic.sdk.webrendering.mraid.b.DEFAULT))) {
            POBLog.error(TAG, "Can't perform orientation properties. invalid MRAID state: %s", mraidState.b());
            return;
        }
        POBLog.debug(TAG, "setOrientation : allowOrientationChange :" + z + ", forceOrientation:" + str, new Object[0]);
        Context baseContext = ((MutableContextWrapper) this.currentBridge.webView.getContext()).getBaseContext();
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            forceOrientation(activity, str);
            allowOrientationChange(activity, z);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void storePicture(@Nullable String str, boolean z) {
        if (z) {
            notifyAdClick();
        }
        if (str == null || str.isEmpty()) {
            this.currentBridge.notifyError("Missing picture url.", "storePicture");
            return;
        }
        if (!POBUtils.hasPermission(this.appContext, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            this.currentBridge.notifyError("App does not have WRITE_EXTERNAL_STORAGE permission to store the picture.", "storePicture");
            return;
        }
        if (this.pobNetworkHandler == null) {
            this.pobNetworkHandler = POBInstanceProvider.getNetworkHandlerWithMainThreadDelivery();
        }
        if (this.imageNetworkListener == null) {
            this.imageNetworkListener = getImageNetworkListener();
        }
        POBImageRequest pOBImageRequest = new POBImageRequest();
        pOBImageRequest.setUrl(str);
        pOBImageRequest.setTimeout(5000);
        pOBImageRequest.setRequestTag(TAG);
        this.pobNetworkHandler.sendImageRequest(pOBImageRequest, this.imageNetworkListener);
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void unload() {
        String str = this.placementType;
        str.getClass();
        if (str.equals(POBCommonConstants.BANNER_PLACEMENT_TYPE)) {
            o oVar = this.mraidControllerListener;
            if (oVar != null) {
                oVar.onAdUnload();
                return;
            }
            return;
        }
        if (str.equals("interstitial")) {
            close();
        } else {
            POBLog.error(TAG, "Can't perform unload as no specific placement type found.", new Object[0]);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void useCustomClose(boolean z) {
        POBLog.debug(TAG, "Received command to use custom close: " + z, new Object[0]);
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.shouldUseCustomClose(z);
        }
    }
}
