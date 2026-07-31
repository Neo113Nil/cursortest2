package com.mobilefuse.sdk.mraid;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mobilefuse.sdk.AdLifecycleEvent;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererContainer;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.ExtendedAdType;
import com.mobilefuse.sdk.LocationService;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.ad.rendering.ExtendedController;
import com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController;
import com.mobilefuse.sdk.ad.view.CloseButton;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.assetsmanager.ResultCallback;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.device.LocationData;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.mraid.MraidAdRendererContainer;
import com.mobilefuse.sdk.mraid.MraidFeatureDetection;
import com.mobilefuse.sdk.omid.MraidOmidBridge;
import com.mobilefuse.sdk.omid.OmidFriendlyObstructionPurpose;
import com.mobilefuse.sdk.omid.OmidWebViewReleaser;
import com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector;
import com.mobilefuse.sdk.rtb.ApiFramework;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.utils.PositionUtils;
import com.mobilefuse.sdk.utils.UrlHandler;
import com.mobilefuse.sdk.utils.WebViewUtils;
import com.mobilefuse.sdk.video.AdmClickInfo;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MobileFuseNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: MraidAdRenderer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0018\b\u0016\u0018\u0000 y2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005yz{|}B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0002J\b\u0010+\u001a\u00020)H\u0014J\b\u0010,\u001a\u00020)H\u0002J\u0018\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH\u0002J\u0012\u00100\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020\u000bH\u0002J\u0010\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001cH\u0002J\b\u00107\u001a\u00020)H\u0002J\b\u00108\u001a\u00020)H\u0002J\b\u00109\u001a\u00020)H\u0002J\b\u0010:\u001a\u00020)H\u0002J\b\u0010;\u001a\u00020)H\u0016J\b\u0010<\u001a\u00020)H\u0002J*\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001a2\b\u0010A\u001a\u0004\u0018\u00010BH\u0002J\u0010\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020EH\u0002J\n\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u00020IH\u0002J\u0014\u0010J\u001a\u0004\u0018\u00010K2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010L\u001a\u00020)2\u0006\u0010D\u001a\u00020EH\u0003J\u0014\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010EH\u0002J\b\u0010P\u001a\u00020)H\u0002J\b\u0010Q\u001a\u00020)H\u0002J\u0012\u0010R\u001a\u00020)2\b\u0010S\u001a\u0004\u0018\u000102H\u0002J\b\u0010T\u001a\u00020)H\u0016J\b\u0010U\u001a\u00020)H\u0016J\b\u0010V\u001a\u00020\u000bH\u0014J\b\u0010W\u001a\u00020)H\u0002J\b\u0010X\u001a\u00020)H\u0002J\u001c\u0010Y\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u000102H\u0002J\u0012\u0010[\u001a\u00020)2\b\u0010\\\u001a\u0004\u0018\u000102H\u0014J\n\u0010]\u001a\u0004\u0018\u000102H\u0002J\b\u0010^\u001a\u00020)H\u0002J\b\u0010_\u001a\u00020)H\u0002J\b\u0010`\u001a\u00020)H\u0016J\u0012\u0010a\u001a\u00020)2\b\b\u0002\u0010b\u001a\u00020\u000bH\u0002J\b\u0010c\u001a\u00020)H\u0002J\u0016\u0010d\u001a\u00020)2\f\u0010e\u001a\b\u0012\u0004\u0012\u0002020fH\u0002J\u0010\u0010g\u001a\u00020)2\u0006\u0010h\u001a\u00020\u000bH\u0002J\b\u0010i\u001a\u00020)H\u0003J(\u0010j\u001a\u00020)2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010k\u001a\u00020\u001c2\u0006\u0010l\u001a\u00020\u001cH\u0002J\u0010\u0010m\u001a\u00020)2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0018J\b\u0010n\u001a\u00020)H\u0002J\u000e\u0010o\u001a\u00020)2\u0006\u0010h\u001a\u00020\u000bJ\u0010\u0010p\u001a\u00020)2\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010q\u001a\u00020)H\u0002J\b\u0010r\u001a\u00020)H\u0003J\u0012\u0010s\u001a\u00020\u000b2\b\u0010Z\u001a\u0004\u0018\u000102H\u0002J\b\u0010t\u001a\u00020)H\u0002J\b\u0010u\u001a\u00020)H\u0002J\u0012\u0010v\u001a\u00020)2\b\u0010w\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010x\u001a\u00020)2\u0006\u0010D\u001a\u00020EH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006~"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidAdRenderer;", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "Lcom/mobilefuse/sdk/omid/MraidOmidBridge;", "context", "Landroid/content/Context;", "config", "Lcom/mobilefuse/sdk/AdRendererConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/AdRendererListener;", "(Landroid/content/Context;Lcom/mobilefuse/sdk/AdRendererConfig;Lcom/mobilefuse/sdk/AdRendererListener;)V", "activityOrientationChanged", "", "bannerExpandedWindow", "Landroid/widget/PopupWindow;", "bannerInlineLayoutParams", "Landroid/widget/RelativeLayout$LayoutParams;", "closeBtn", "Lcom/mobilefuse/sdk/ad/view/CloseButton;", "closingAd", "expanded", "handler", "Landroid/os/Handler;", "isMraidBridgeLoaded", "jsBridgeCallListener", "Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$JsBridgeCallListener;", "lastExposurePrcnt", "", "notModifiedActivityOrientation", "", "screenHeight", "screenWidth", "showingAd", "viewTreeInspector", "Lcom/mobilefuse/sdk/omid/viewtree/ViewTreeInspector;", "webView", "Landroid/webkit/WebView;", "webViewContainer", "Landroid/widget/RelativeLayout;", "webViewLoadContentType", "Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$WebViewLoadContentType;", "addCloseButton", "", X3.i.T, "applyCurrentBackgroundColor", "bridge_NotifyReadyEvents", "bridge_NotifySizeChangeEvent", "width", "height", "bridge_SetState", "state", "", "closeAd", "runtimeError", "convertPxToDp", "value", "createContainer", "createExternalController", "createSplashExternalController", "createWebView", "destroy", "dismissBannerExpandedWindow", "dispatchAdmExposureChangeEvent", "exposedPercentage", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "currentView", "Landroid/graphics/Rect;", "expandWebView", "callUri", "Landroid/net/Uri;", "getAdView", "Landroid/view/View;", "getCloseButtonShowDelay", "", "getOnLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "handleBridgeCall", "handleBridgeCallFromFetch", "Landroid/webkit/WebResourceResponse;", ShareConstants.MEDIA_URI, "handleCriticalAssetFailure", "initJsBridge", "loadAdmInWebView", "admTag", "onActivityPauseImpl", "onActivityResumeImpl", "onAdCloseRequested", "onAdImpression", "onAdmLoaded", "onClickThrough", "url", "preloadAdmImpl", "adm", "processClickMacro", "removeCloseBtnOmidFriendlyObstruction", "removeCloseButton", "renderAdmImpl", "requestAdCloseInternal", "isRuntimeException", "requestAdPositionUpdate", "sendEvents", "clickTracking", "", "setAdProperties", "setDefaultPosition", "setCurrentAppOrientation", "setCurrentPosition", "posX", "posY", "setJsBridgeCallListener", "setLocation", "setMaxSizeAndPosition", n.h, "setScreenDimensions", "setSupports", "shouldOverrideUrl", "signalOmidAdImpression", "updateCloseBtnAsOmidFriendlyObstruction", "updateWebViewBackgroundColor", "wv", "verifyEventAdded", "Companion", "JsBridgeCallListener", "MraidAdLifecycleEvent", "MraidExtendedAdType", "WebViewLoadContentType", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public class MraidAdRenderer extends BaseAdRenderer<MraidOmidBridge> {
    public static final boolean ALLOW_CLICKTHROUGH_WITHOUT_TAP_DEFAULT = false;

    @NotNull
    public static final String CLICKTHROUGH_CONSTANT = "${CLICKTHROUGH}";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String LOG_TAG = "MRAID";
    public static final long PROGRESS_BAR_SHOW_DELAY = 3000;

    @NotNull
    public static final String WEB_VIEW_BASE_URL = "https://sdk-webview.mobilefuse.com";
    private static boolean webViewCrashTestAllowed;
    private boolean activityOrientationChanged;
    private PopupWindow bannerExpandedWindow;
    private RelativeLayout.LayoutParams bannerInlineLayoutParams;
    private CloseButton closeBtn;
    private boolean closingAd;
    private boolean expanded;
    private final Handler handler;
    private boolean isMraidBridgeLoaded;
    private JsBridgeCallListener jsBridgeCallListener;
    private double lastExposurePrcnt;
    private int notModifiedActivityOrientation;
    private int screenHeight;
    private int screenWidth;
    private boolean showingAd;
    private ViewTreeInspector viewTreeInspector;
    private WebView webView;
    private RelativeLayout webViewContainer;
    private WebViewLoadContentType webViewLoadContentType;

    /* compiled from: MraidAdRenderer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$JsBridgeCallListener;", "", "getMraidSupportsList", "", "", "", "onBridgeCall", "callUri", "Landroid/net/Uri;", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
    public interface JsBridgeCallListener {
        @NotNull
        Map<String, Boolean> getMraidSupportsList();

        boolean onBridgeCall(@Nullable Uri callUri);
    }

    /* compiled from: MraidAdRenderer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$MraidAdLifecycleEvent;", "", "Lcom/mobilefuse/sdk/AdLifecycleEvent;", "(Ljava/lang/String;I)V", "MRAID_CREATE_CALENDAR_EVENT", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
    public enum MraidAdLifecycleEvent implements AdLifecycleEvent {
        MRAID_CREATE_CALENDAR_EVENT
    }

    /* compiled from: MraidAdRenderer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$MraidExtendedAdType;", "", "Lcom/mobilefuse/sdk/ExtendedAdType;", "(Ljava/lang/String;I)V", "INTERSTITIAL_TRANSPARENT", "SPLASH", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
    public enum MraidExtendedAdType implements ExtendedAdType {
        INTERSTITIAL_TRANSPARENT,
        SPLASH
    }

    /* compiled from: MraidAdRenderer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$WebViewLoadContentType;", "", "(Ljava/lang/String;I)V", "URL", "ADM", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
    public enum WebViewLoadContentType {
        URL,
        ADM
    }

    private final void bridge_SetState(String state) throws Throwable {
        Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/mraid/MraidAdRenderer;->bridge_SetState(Ljava/lang/String;)V");
        BrandSafetyUtils.onMobileFuseSetState(state);
        safedk_MraidAdRenderer_bridge_SetState_190d2423d64597e56e3cfa24926117d4(state);
    }

    @NotNull
    public static final List<ApiFramework> getSupportedApiFrameworks() {
        return INSTANCE.getSupportedApiFrameworks();
    }

    public static final boolean getWebViewCrashTestAllowed() {
        return webViewCrashTestAllowed;
    }

    public static final void setWebViewCrashTestAllowed(boolean z) {
        webViewCrashTestAllowed = z;
    }

    private final void addCloseButton(final boolean transparent) throws Throwable {
        RelativeLayout.LayoutParams layoutParams;
        CloseConfigResponse closeConfigPx;
        CloseConfigResponse closeConfigPx2;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            CloseConfigResponse closeConfigResponse = this.config.getCloseConfigResponse();
            String uiAdm = this.config.getUiAdm();
            if (this.closeBtn == null) {
                CloseButton closeButton = new CloseButton(this.context, 60, R.id.closeBtn, new Function0() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$addCloseButton$$inlined$handleExceptions$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        MraidAdRenderer.this.dispatchSkipAdAvailability();
                    }
                }, new Function0() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$addCloseButton$$inlined$handleExceptions$lambda$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final void invoke() {
                        ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                        try {
                            DebuggingKt.logDebug(MraidAdRenderer.this, "Close button clicked", MraidAdRenderer.LOG_TAG);
                            MraidAdRenderer.requestAdCloseInternal$default(MraidAdRenderer.this, false, 1, null);
                        } catch (Throwable th) {
                            int i = MraidAdRenderer$addCloseButton$1$2$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                            if (i == 1) {
                                StabilityHelper.logException("[Automatically caught]", th);
                            } else if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }
                }, closeConfigResponse, uiAdm);
                closeButton.setOnVisibilityChange(new Function1() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$addCloseButton$$inlined$handleExceptions$lambda$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        MraidAdRenderer.this.updateCloseBtnAsOmidFriendlyObstruction();
                    }
                });
                Unit unit = Unit.INSTANCE;
                this.closeBtn = closeButton;
                if (closeConfigResponse != null && closeButton.getCloseConfigPx() != null) {
                    CloseButton closeButton2 = this.closeBtn;
                    int i = 0;
                    int width = (closeButton2 == null || (closeConfigPx2 = closeButton2.getCloseConfigPx()) == null) ? 0 : (int) closeConfigPx2.getWidth();
                    CloseButton closeButton3 = this.closeBtn;
                    if (closeButton3 != null && (closeConfigPx = closeButton3.getCloseConfigPx()) != null) {
                        i = (int) closeConfigPx.getHeight();
                    }
                    layoutParams = PositionUtils.addPositionRules(new RelativeLayout.LayoutParams(width, i), closeConfigResponse);
                    layoutParams.alignWithParent = true;
                } else {
                    CloseButton closeButton4 = this.closeBtn;
                    if (closeButton4 != null) {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(closeButton4.getInteractionSizePx(), closeButton4.getInteractionSizePx());
                        layoutParams2.addRule(11);
                        layoutParams2.addRule(10);
                        layoutParams2.alignWithParent = true;
                        layoutParams = layoutParams2;
                    } else {
                        layoutParams = null;
                    }
                }
                CloseButton closeButton5 = this.closeBtn;
                if (closeButton5 != null) {
                    this.webViewContainer.addView(closeButton5, layoutParams);
                }
            }
            CloseButton closeButton6 = this.closeBtn;
            if (closeButton6 != null) {
                closeButton6.setTransparent(transparent);
            }
            ExtendedController extendedController = this.extendedController;
            if (!(extendedController instanceof SplashAdController)) {
                CloseButton closeButton7 = this.closeBtn;
                if (closeButton7 != null) {
                    closeButton7.setThumbnailMode(this.config.isThumbnailSize());
                    return;
                }
                return;
            }
            if (extendedController != null) {
                ((SplashAdController) extendedController).setExpandedCloseBtnTransparent(transparent);
                CloseButton closeButton8 = this.closeBtn;
                if (closeButton8 != null) {
                    closeButton8.setThumbnailMode(true);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController");
        } catch (Throwable th) {
            int i2 = MraidAdRenderer$addCloseButton$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i2 == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void createContainer() throws Throwable {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            RelativeLayout relativeLayout = this.webViewContainer;
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.setGravity(DivLayoutParams.DEFAULT_GRAVITY);
            MraidAdRendererContainer mraidAdRendererContainer = new MraidAdRendererContainer(this.context);
            mraidAdRendererContainer.setViewableChangeListener(new MraidAdRendererContainer.ViewableChangeListener() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$createContainer$$inlined$handleExceptions$lambda$1
                @Override // com.mobilefuse.sdk.mraid.MraidAdRendererContainer.ViewableChangeListener
                public void onViewableChange(int left, int top, int width, int height, double exposedPercentage, @Nullable Rect localClippedArea) {
                    boolean z;
                    double d;
                    double d2;
                    int convertPxToDp;
                    int convertPxToDp2;
                    int convertPxToDp3;
                    int convertPxToDp4;
                    z = MraidAdRenderer.this.expanded;
                    if (z) {
                        exposedPercentage = 100.0d;
                    }
                    d = MraidAdRenderer.this.lastExposurePrcnt;
                    if (d != exposedPercentage && exposedPercentage > 0.0d) {
                        MraidAdRenderer mraidAdRenderer = MraidAdRenderer.this;
                        convertPxToDp = mraidAdRenderer.convertPxToDp(width);
                        convertPxToDp2 = MraidAdRenderer.this.convertPxToDp(height);
                        convertPxToDp3 = MraidAdRenderer.this.convertPxToDp(left);
                        convertPxToDp4 = MraidAdRenderer.this.convertPxToDp(top);
                        mraidAdRenderer.setCurrentPosition(convertPxToDp, convertPxToDp2, convertPxToDp3, convertPxToDp4);
                    }
                    MraidAdRenderer.this.lastExposurePrcnt = exposedPercentage;
                    MraidAdRenderer mraidAdRenderer2 = MraidAdRenderer.this;
                    d2 = mraidAdRenderer2.lastExposurePrcnt;
                    mraidAdRenderer2.dispatchAdmExposureChangeEvent(d2, left, top, localClippedArea);
                }
            });
            mraidAdRendererContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            mraidAdRendererContainer.setAttachedToWindowCallback(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$createContainer$$inlined$handleExceptions$lambda$2
                @Override // java.lang.Runnable
                public final void run() {
                    ViewTreeInspector viewTreeInspector;
                    viewTreeInspector = MraidAdRenderer.this.viewTreeInspector;
                    if (viewTreeInspector != null) {
                        viewTreeInspector.startObstructionsChecking();
                    }
                }
            });
            mraidAdRendererContainer.setDetachedFromWindowCallback(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$createContainer$$inlined$handleExceptions$lambda$3
                @Override // java.lang.Runnable
                public final void run() {
                    ViewTreeInspector viewTreeInspector;
                    viewTreeInspector = MraidAdRenderer.this.viewTreeInspector;
                    if (viewTreeInspector != null) {
                        viewTreeInspector.stopObstructionsChecking();
                    }
                }
            });
            mraidAdRendererContainer.addView(this.webViewContainer);
            Unit unit = Unit.INSTANCE;
            this.contentContainer = mraidAdRendererContainer;
            if (!this.config.isFullscreenAd() && !this.config.isCloseButtonEnabled()) {
                return;
            }
            addCloseButton(false);
        } catch (Throwable th) {
            int i = MraidAdRenderer$createContainer$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void createExternalController() throws Throwable {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            createSplashExternalController();
        } catch (Throwable th) {
            int i = MraidAdRenderer$createExternalController$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void createSplashExternalController() {
        Activity activity;
        AdRendererContainer adRendererContainer;
        WebView webView;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.extendedAdType == MraidExtendedAdType.SPLASH && (activity = this.renderingActivity) != null && (adRendererContainer = this.contentContainer) != null && (webView = this.webView) != null) {
                this.extendedController = new SplashAdController(activity, adRendererContainer, webView, this.omidBridge, new Function0() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$createSplashExternalController$$inlined$handleExceptions$lambda$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        MraidAdRenderer.requestAdCloseInternal$default(MraidAdRenderer.this, false, 1, null);
                    }
                }, new Function1() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$createSplashExternalController$$inlined$handleExceptions$lambda$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        MraidAdRenderer.this.closeAd(true);
                    }
                }, new Function1() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$createSplashExternalController$$inlined$handleExceptions$lambda$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        CloseButton closeButton;
                        closeButton = MraidAdRenderer.this.closeBtn;
                        if (closeButton != null) {
                            if (z) {
                                closeButton.show();
                            } else {
                                closeButton.hide();
                            }
                        }
                    }
                });
                ObservableConfig observableConfig = this.observableConfig;
                if (observableConfig != null) {
                    ObservableConfigKey observableConfigKey = ObservableConfigKey.POSITION;
                    if (!observableConfig.hasValue(observableConfigKey)) {
                        observableConfig = null;
                    }
                    if (observableConfig != null) {
                        ExtendedController extendedController = this.extendedController;
                        if (extendedController == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController");
                        }
                        ((SplashAdController) extendedController).setAnchor(observableConfig.getIntValue(observableConfigKey, 3));
                    }
                }
                CloseButton closeButton = this.closeBtn;
                if (closeButton != null) {
                    closeButton.setThumbnailMode(true);
                }
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$createSplashExternalController$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void dismissBannerExpandedWindow() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PopupWindow popupWindow = this.bannerExpandedWindow;
            this.bannerExpandedWindow = null;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$dismissBannerExpandedWindow$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void expandWebView(Uri callUri) {
        WebView webView;
        AdRendererContainer adRendererContainer;
        Activity activity;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.config.isFullscreenAd() || this.expanded || (webView = this.webView) == null || (adRendererContainer = this.contentContainer) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            this.bannerInlineLayoutParams = (RelativeLayout.LayoutParams) layoutParams;
            adRendererContainer.removeView(this.webViewContainer);
            webView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            webView.setScaleX(1.0f);
            webView.setScaleY(1.0f);
            String queryParameter = callUri.getQueryParameter("forceOrientation");
            if (queryParameter != null && (activity = this.renderingActivity) != null) {
                boolean booleanQueryParameter = callUri.getBooleanQueryParameter("allowOrientationChange", false);
                Resources resources = this.context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                this.notModifiedActivityOrientation = resources.getConfiguration().orientation;
                this.activityOrientationChanged = true;
                Utils.lockOrientationFromExpand(activity, booleanQueryParameter, queryParameter);
            }
            PopupWindow popupWindow = new PopupWindow((View) this.webViewContainer, -1, -1, true);
            popupWindow.showAtLocation(adRendererContainer.getRootView(), 48, 0, 0);
            Unit unit = Unit.INSTANCE;
            this.bannerExpandedWindow = popupWindow;
            bridge_SetState("EXPANDED");
            this.expanded = true;
            addCloseButton(callUri.getBooleanQueryParameter("useCustomClose", false));
            CloseButton closeButton = this.closeBtn;
            if (closeButton != null) {
                closeButton.show();
            }
            this.listener.onFullscreenChanged(true);
            bridge_NotifySizeChangeEvent(this.screenWidth, this.screenHeight);
            setCurrentPosition(this.screenWidth, this.screenHeight, 0, 0);
        } catch (Throwable th) {
            int i = MraidAdRenderer$expandWebView$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void initJsBridge() {
        String str;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.isMraidBridgeLoaded = true;
            startListeningLayoutChange();
            if (this.config.isFullscreenAd()) {
                str = "Mraid.PlacementType.INTERSTITIAL";
            } else {
                str = "Mraid.PlacementType.INLINE";
            }
            WebView webView = this.webView;
            if (webView != null) {
                webView.evaluateJavascript("mraid.bridge.setPlacementType(" + str + ");", null);
            }
            setSupports();
            setAdProperties(true);
            bridge_SetState("DEFAULT");
            bridge_NotifyReadyEvents();
            onAdImpression();
        } catch (Throwable th) {
            int i = MraidAdRenderer$initJsBridge$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void loadAdmInWebView(final String admTag) throws Throwable {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", "3.0");
            jSONObject.put("sdk", "mfx");
            jSONObject.put("sdkVersion", this.config.getSdkVersion());
            jSONObject.put("appId", this.context.getPackageName());
            jSONObject.put("ifa", this.config.getAdvertisingId());
            jSONObject.put("limitAdTracking", this.config.isLimitTrackingEnabled());
            jSONObject.put("coppa", this.config.isSubjectToCoppa());
            jSONObject.put("debug", this.config.isTestMode());
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "mraidEnvironment.toString()");
            final String str = "<script>window.MRAID_ENV = " + jSONObject2 + ";</script>";
            final String str2 = "";
            MobileFuseAssetManager.INSTANCE.getSpecificAssetContent("ad_template.html", this.context, new ResultCallback() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$loadAdmInWebView$$inlined$handleExceptions$lambda$1
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
                
                    if (r2 == null) goto L19;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0002, B:5:0x0009, B:7:0x000f, B:10:0x0046, B:12:0x0050, B:14:0x0058, B:16:0x0066, B:17:0x0062, B:18:0x0068, B:22:0x003e), top: B:2:0x0002 }] */
                @Override // com.mobilefuse.sdk.assetsmanager.ResultCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onResult(@Nullable final Object result) {
                    T t;
                    Handler handler;
                    T t2;
                    String obj;
                    ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        if (result != null && (obj = result.toString()) != null) {
                            String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(obj, "{ADM_CONTENT}", Intrinsics.stringPlus(admTag, str2), false, 4, (Object) null), "{MRAID_ENV_CONFIG}", str, false, 4, (Object) null), "{MRAID_BRIDGE_INIT}", "<script>mraid.bridge.init(MRAID_ENV);</script>", false, 4, (Object) null);
                            t = replace$default;
                            if (replace$default == null) {
                            }
                            ref$ObjectRef.element = t;
                            if (this.hasOmidBridge()) {
                                MraidOmidBridge mraidOmidBridge = (MraidOmidBridge) this.omidBridge;
                                if (mraidOmidBridge != null) {
                                    String injectOmidScriptContentIntoAdm = mraidOmidBridge.injectOmidScriptContentIntoAdm((String) ref$ObjectRef.element);
                                    t2 = injectOmidScriptContentIntoAdm;
                                }
                                t2 = (String) ref$ObjectRef.element;
                                ref$ObjectRef.element = t2;
                            }
                            handler = this.handler;
                            handler.post(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$loadAdmInWebView$$inlined$handleExceptions$lambda$1.1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WebView webView;
                                    webView = this.webView;
                                    if (webView != null) {
                                        MobileFuseNetworkBridge.webviewLoadDataWithBaseURL(webView, MraidAdRenderer.WEB_VIEW_BASE_URL, (String) Ref$ObjectRef.this.element, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
                                    }
                                }
                            });
                        }
                        t = Intrinsics.stringPlus(admTag, str2);
                        ref$ObjectRef.element = t;
                        if (this.hasOmidBridge()) {
                        }
                        handler = this.handler;
                        handler.post(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$loadAdmInWebView$$inlined$handleExceptions$lambda$1.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                WebView webView;
                                webView = this.webView;
                                if (webView != null) {
                                    MobileFuseNetworkBridge.webviewLoadDataWithBaseURL(webView, MraidAdRenderer.WEB_VIEW_BASE_URL, (String) Ref$ObjectRef.this.element, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        int i = MraidAdRenderer$loadAdmInWebView$1$callback$1$onResult$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            });
        } catch (Throwable th) {
            int i = MraidAdRenderer$loadAdmInWebView$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void onAdImpression() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            final WebView webView = this.webView;
            if (webView == null) {
                return;
            }
            final MraidOmidBridge mraidOmidBridge = (MraidOmidBridge) this.omidBridge;
            if (mraidOmidBridge != null) {
                mraidOmidBridge.initAdSession(this.context, webView);
                updateCloseBtnAsOmidFriendlyObstruction();
                addRegisteredExternalFriendlyObstructions();
                mraidOmidBridge.startAdSession();
                mraidOmidBridge.signalAdLoadedEvent();
                ViewTreeInspector viewTreeInspector = new ViewTreeInspector(webView, new ViewTreeInspector.ObstructionsChangeListener() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$onAdImpression$$inlined$handleExceptions$lambda$1
                    @Override // com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector.ObstructionsChangeListener
                    public final void onChanged(List<View> list) {
                        CloseButton closeButton;
                        List list2;
                        MraidOmidBridge.this.removeAllFriendlyObstructions();
                        if (list != null) {
                            for (View view : list) {
                                closeButton = this.closeBtn;
                                if (view != closeButton) {
                                    list2 = ((BaseAdRenderer) this).externalFriendlyObstructions;
                                    if (!list2.contains(view)) {
                                        MraidOmidBridge.this.addFriendlyObstruction(view, OmidFriendlyObstructionPurpose.NOT_VISIBLE, null);
                                    }
                                }
                            }
                        }
                        this.updateCloseBtnAsOmidFriendlyObstruction();
                        this.addRegisteredExternalFriendlyObstructions();
                    }
                });
                this.viewTreeInspector = viewTreeInspector;
                viewTreeInspector.startObstructionsChecking();
                signalOmidAdImpression();
            }
            reportAdImpression();
        } catch (Throwable th) {
            int i = MraidAdRenderer$onAdImpression$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdmLoaded() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.webView == null) {
                return;
            }
            ExtendedController extendedController = this.extendedController;
            if (extendedController != null) {
                extendedController.onAdmLoaded();
            }
            AdRendererContainer adRendererContainer = this.contentContainer;
            if (adRendererContainer != null) {
                adRendererContainer.hideProgressBar();
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$onAdmLoaded$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void onClickThrough(final Context context, final String url) {
        final String str;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        if (url != null) {
            try {
                if (url.length() != 0 && context != null) {
                    if (StringsKt.contains$default((CharSequence) url, (CharSequence) CLICKTHROUGH_CONSTANT, false, 2, (Object) null)) {
                        String processClickMacro = processClickMacro();
                        if (processClickMacro != null) {
                            str = StringsKt.replace$default(url, CLICKTHROUGH_CONSTANT, processClickMacro, false, 4, (Object) null);
                            if (str == null) {
                            }
                            UrlHandler.openBrowser$default(str, context, new Function0() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$onClickThrough$$inlined$handleExceptions$lambda$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                    invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    AdRendererListener adRendererListener;
                                    adRendererListener = ((BaseAdRenderer) this).listener;
                                    adRendererListener.onAdClicked(str);
                                }
                            }, null, 8, null);
                            return;
                        }
                    }
                    str = url;
                    UrlHandler.openBrowser$default(str, context, new Function0() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$onClickThrough$$inlined$handleExceptions$lambda$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                            invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            AdRendererListener adRendererListener;
                            adRendererListener = ((BaseAdRenderer) this).listener;
                            adRendererListener.onAdClicked(str);
                        }
                    }, null, 8, null);
                    return;
                }
            } catch (Throwable th) {
                int i = MraidAdRenderer$onClickThrough$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                    return;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
        }
        String str2 = "onClickThrough called but URL or context are null: " + url;
        DebuggingKt.logError$default(this, str2, LOG_TAG, null, 4, null);
        Telemetry.INSTANCE.logException(this, new Throwable(str2));
    }

    private final void removeCloseBtnOmidFriendlyObstruction() {
        CloseButton closeButton;
        MraidOmidBridge mraidOmidBridge;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (!hasOmidBridge() || (closeButton = this.closeBtn) == null || (mraidOmidBridge = (MraidOmidBridge) this.omidBridge) == null) {
                return;
            }
            mraidOmidBridge.removeFriendlyObstruction(closeButton);
        } catch (Throwable th) {
            int i = MraidAdRenderer$removeCloseBtnOmidFriendlyObstruction$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAdProperties(boolean setDefaultPosition) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.isMraidBridgeLoaded) {
                setCurrentAppOrientation();
                setScreenDimensions();
                setMaxSizeAndPosition(setDefaultPosition);
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$setAdProperties$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void setLocation() {
        LocationData lastKnownLocationData;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.config.isLimitTrackingEnabled() || (lastKnownLocationData = LocationService.INSTANCE.getLastKnownLocationData()) == null) {
                return;
            }
            String trimIndent = StringsKt.trimIndent("\n        {\n            \"lat\": " + lastKnownLocationData.getLatitude() + ", \n            \"lon\": " + lastKnownLocationData.getLongitude() + ", \n            \"type\": 1, \n            \"accuracy\": " + lastKnownLocationData.getAccuracy() + ", \n            \"lastfix\": " + lastKnownLocationData.getLastFixSeconds() + "\n        }\n    ");
            WebView webView = this.webView;
            if (webView != null) {
                webView.evaluateJavascript("mraid.bridge.setLocation(" + trimIndent + ");", null);
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$setLocation$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void setScreenDimensions() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            WebView webView = this.webView;
            if (webView != null) {
                int[] screenSizeAsPixels = Utils.getScreenSizeAsPixels(this.context);
                this.screenWidth = convertPxToDp(screenSizeAsPixels[0]);
                this.screenHeight = convertPxToDp(screenSizeAsPixels[1]);
                webView.evaluateJavascript("mraid.bridge.setScreenSize({\"width\": " + this.screenWidth + ", \"height\": " + this.screenHeight + "});", null);
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$setScreenDimensions$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @RequiresApi
    private final void setSupports() throws Throwable {
        Map<String, Boolean> mraidSupportsList;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            WebView webView = this.webView;
            if (webView == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            MraidFeatureDetection.Companion companion = MraidFeatureDetection.INSTANCE;
            jSONObject.put("sms", companion.getSmsSupport());
            jSONObject.put("tel", companion.getTelSupport());
            jSONObject.put("calendar", false);
            jSONObject.put("storePicture", false);
            jSONObject.put("inlineVideo", true);
            jSONObject.put("ar", true);
            jSONObject.put("barometricPressure", true);
            jSONObject.put("vpaid", companion.getVpaidSupported());
            jSONObject.put("location", companion.getLocationSupport());
            JsBridgeCallListener jsBridgeCallListener = this.jsBridgeCallListener;
            if (jsBridgeCallListener != null && (mraidSupportsList = jsBridgeCallListener.getMraidSupportsList()) != null) {
                for (Map.Entry<String, Boolean> entry : mraidSupportsList.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue().booleanValue());
                }
            }
            if (this.extendedAdType == MraidExtendedAdType.SPLASH) {
                jSONObject.put("splashAd", true);
            }
            if (this.config.isFullscreenAd()) {
                jSONObject.put("transparentBackground", true);
            }
            webView.evaluateJavascript("mraid.bridge.setSupports(" + jSONObject + ");", null);
            if (MraidFeatureDetection.INSTANCE.getLocationSupport()) {
                setLocation();
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$setSupports$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void signalOmidAdImpression() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.handler.postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$signalOmidAdImpression$$inlined$handleExceptions$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    MraidOmidBridge mraidOmidBridge = (MraidOmidBridge) MraidAdRenderer.this.omidBridge;
                    if (mraidOmidBridge != null) {
                        mraidOmidBridge.signalAdImpressionEvent();
                    }
                }
            }, 200L);
        } catch (Throwable th) {
            int i = MraidAdRenderer$signalOmidAdImpression$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCloseBtnAsOmidFriendlyObstruction() {
        CloseButton closeButton;
        MraidOmidBridge mraidOmidBridge;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (!hasOmidBridge() || (closeButton = this.closeBtn) == null) {
                return;
            }
            removeCloseBtnOmidFriendlyObstruction();
            if (!closeButton.isVisible() || (mraidOmidBridge = (MraidOmidBridge) this.omidBridge) == null) {
                return;
            }
            mraidOmidBridge.addFriendlyObstruction(closeButton, OmidFriendlyObstructionPurpose.CLOSE_AD, null);
        } catch (Throwable th) {
            int i = MraidAdRenderer$updateCloseBtnAsOmidFriendlyObstruction$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void verifyEventAdded(Uri callUri) {
        WebView webView;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            String queryParameter = callUri.getQueryParameter("event");
            if (queryParameter == null) {
                return;
            }
            int hashCode = queryParameter.hashCode();
            if (hashCode == -261530729) {
                if (queryParameter.equals("exposureChange")) {
                    requestAdPositionUpdate();
                }
            } else if (hashCode == 1701845777 && queryParameter.equals("sizeChange") && (webView = this.webView) != null) {
                bridge_NotifySizeChangeEvent(convertPxToDp(webView.getWidth()), convertPxToDp(webView.getHeight()));
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$verifyEventAdded$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void destroy() throws Throwable {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            super.destroy();
            ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
            if (viewTreeInspector != null) {
                viewTreeInspector.stopObstructionsChecking();
                this.viewTreeInspector = null;
            }
            WebView webView = this.webView;
            if (webView != null) {
                ViewParent parent = webView.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                OmidWebViewReleaser.scheduleWebViewRelease(webView);
                this.webView = null;
            }
            removeCloseButton();
            this.handler.removeCallbacksAndMessages(null);
            dismissBannerExpandedWindow();
            AdRendererContainer adRendererContainer = this.contentContainer;
            if (adRendererContainer != null) {
                MraidAdRendererContainer mraidAdRendererContainer = (MraidAdRendererContainer) (!(adRendererContainer instanceof MraidAdRendererContainer) ? null : adRendererContainer);
                if (mraidAdRendererContainer != null) {
                    mraidAdRendererContainer.setViewableChangeListener(null);
                }
                ViewParent parent2 = adRendererContainer.getParent();
                if (!(parent2 instanceof ViewGroup)) {
                    parent2 = null;
                }
                ViewGroup viewGroup2 = (ViewGroup) parent2;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(adRendererContainer);
                }
                this.contentContainer = null;
            }
            ExtendedController extendedController = this.extendedController;
            if (extendedController != null) {
                extendedController.unbindContent();
                this.extendedController = null;
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$destroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void renderAdmImpl() throws Throwable {
        CloseButton closeButton;
        WebView webView;
        WebViewLoadContentType webViewLoadContentType;
        AdRendererContainer adRendererContainer;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.extendedAdType == MraidExtendedAdType.INTERSTITIAL_TRANSPARENT && (adRendererContainer = this.contentContainer) != null) {
                adRendererContainer.showProgressBarWithDelay(3000L);
            }
            if ((this.config.isFullscreenAd() || this.config.isCloseButtonEnabled()) && (closeButton = this.closeBtn) != null) {
                closeButton.showWithDelay(getCloseButtonShowDelay());
            }
            createWebView();
            createExternalController();
            String str = this.adm;
            if (str != null && (webView = this.webView) != null) {
                if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
                    MobileFuseNetworkBridge.webviewLoadUrl(webView, str);
                    webViewLoadContentType = WebViewLoadContentType.URL;
                } else if (StringsKt.startsWith$default(str, "chrome://crash", false, 2, (Object) null) && webViewCrashTestAllowed) {
                    MobileFuseNetworkBridge.webviewLoadUrl(webView, str);
                    webViewLoadContentType = WebViewLoadContentType.URL;
                } else {
                    loadAdmInWebView(str);
                    webViewLoadContentType = WebViewLoadContentType.ADM;
                }
                this.webViewLoadContentType = webViewLoadContentType;
            }
            ExtendedController extendedController = this.extendedController;
            if (extendedController != null) {
                extendedController.bindContent(this.contentContainer, this.renderingActivity);
            }
            this.webViewContainer.addView(this.webView, 0, new RelativeLayout.LayoutParams(-1, -1));
            this.showingAd = true;
        } catch (Throwable th) {
            int i = MraidAdRenderer$renderAdmImpl$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setMaxSizeAndPosition(final boolean setDefaultPosition) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            final WebView webView = this.webView;
            if (webView == null) {
                return;
            }
            this.webViewContainer.post(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$setMaxSizeAndPosition$$inlined$handleExceptions$lambda$1
                /* JADX WARN: Code restructure failed: missing block: B:18:0x00d3, code lost:
                
                    if (r3 == null) goto L21;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    int convertPxToDp;
                    int convertPxToDp2;
                    int i;
                    int i2;
                    Pair pair;
                    Window window;
                    View decorView;
                    int convertPxToDp3;
                    int convertPxToDp4;
                    int convertPxToDp5;
                    ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        int[] iArr = new int[2];
                        webView.getLocationOnScreen(iArr);
                        ArrayList arrayList = new ArrayList(2);
                        for (int i3 = 0; i3 < 2; i3++) {
                            convertPxToDp5 = this.convertPxToDp(iArr[i3]);
                            arrayList.add(Integer.valueOf(convertPxToDp5));
                        }
                        int intValue = ((Number) arrayList.get(0)).intValue();
                        int intValue2 = ((Number) arrayList.get(1)).intValue();
                        convertPxToDp = this.convertPxToDp(webView.getWidth());
                        convertPxToDp2 = this.convertPxToDp(webView.getHeight());
                        this.setCurrentPosition(convertPxToDp, convertPxToDp2, intValue, intValue2);
                        if (!setDefaultPosition) {
                            this.bridge_NotifySizeChangeEvent(convertPxToDp, convertPxToDp2);
                        } else {
                            webView.evaluateJavascript("mraid.bridge.setDefaultPosition({\"x\": " + intValue + ", \"y\": " + intValue2 + ", \"width\": " + convertPxToDp + ", \"height\": " + convertPxToDp2 + "});", null);
                        }
                        Activity activity = this.renderingActivity;
                        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                            Rect rect = new Rect();
                            decorView.getWindowVisibleDisplayFrame(rect);
                            convertPxToDp3 = this.convertPxToDp(rect.width());
                            Integer valueOf = Integer.valueOf(convertPxToDp3);
                            convertPxToDp4 = this.convertPxToDp(rect.height());
                            pair = TuplesKt.to(valueOf, Integer.valueOf(convertPxToDp4));
                        }
                        i = this.screenWidth;
                        Integer valueOf2 = Integer.valueOf(i);
                        i2 = this.screenHeight;
                        pair = TuplesKt.to(valueOf2, Integer.valueOf(i2));
                        int intValue3 = ((Number) pair.component1()).intValue();
                        int intValue4 = ((Number) pair.component2()).intValue();
                        webView.evaluateJavascript("mraid.bridge.setMaxSize({\"width\": " + intValue3 + ", \"height\": " + intValue4 + "});", null);
                    } catch (Throwable th) {
                        int i4 = MraidAdRenderer$setMaxSizeAndPosition$1$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                        if (i4 == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            });
        } catch (Throwable th) {
            int i = MraidAdRenderer$setMaxSizeAndPosition$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int convertPxToDp(int value) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return Utils.convertPxToDp(this.context, value);
        } catch (Throwable th) {
            if (MraidAdRenderer$convertPxToDp$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return 0;
        }
    }

    private final long getCloseButtonShowDelay() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            String str = "MraidRenderer skipOffset:\n";
            ObservableConfig observableConfig = this.observableConfig;
            float f = -1.0f;
            if (observableConfig != null) {
                ObservableConfigKey observableConfigKey = ObservableConfigKey.FORCE_SKIP_SECONDS;
                if (observableConfig.hasValue(observableConfigKey)) {
                    f = observableConfig.getFloatValue(observableConfigKey, -1.0f);
                    str = "MraidRenderer skipOffset:\n* use value from MFX bid response \"skipAdSeconds\"=" + f + '\n';
                } else {
                    ObservableConfigKey observableConfigKey2 = ObservableConfigKey.MRAID_AD_SKIPOFFSET_SECONDS;
                    if (observableConfig.hasValue(observableConfigKey2)) {
                        f = observableConfig.getFloatValue(observableConfigKey2, -1.0f);
                        str = "MraidRenderer skipOffset:\n* use SDK hardcoded \"skipAdSeconds\"=" + f + '\n';
                    }
                }
            }
            if (f < 0) {
                str = str + "* \"skipAdSeconds\" is less than 0, set it to 0";
                f = 0.0f;
            }
            DebuggingKt.logDebug(this, str, LOG_TAG);
            return ((long) f) * 1000;
        } catch (Throwable th) {
            if (MraidAdRenderer$getCloseButtonShowDelay$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] != 1) {
                return 0L;
            }
            StabilityHelper.logException("[Automatically caught]", th);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebResourceResponse handleBridgeCallFromFetch(final Uri uri) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        if (uri == null) {
            return null;
        }
        try {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
            if (!StringsKt.startsWith$default(uri2, "https://sdk-webview.mobilefuse.com/mraid/", false, 2, (Object) null)) {
                return null;
            }
            final Uri parse = Uri.parse(StringsKt.replace$default(uri2, "https://sdk-webview.mobilefuse.com/mraid/", "mraid://", false, 4, (Object) null));
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$handleBridgeCallFromFetch$$inlined$handleExceptionsWithDefault$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        MraidAdRenderer mraidAdRenderer = this;
                        Uri mraidUri = parse;
                        Intrinsics.checkNotNullExpressionValue(mraidUri, "mraidUri");
                        mraidAdRenderer.handleBridgeCall(mraidUri);
                    } catch (Throwable th) {
                        int i = MraidAdRenderer$handleBridgeCallFromFetch$1$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            });
            byte[] bytes = "".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new WebResourceResponse("text/plain", B5.O, new ByteArrayInputStream(bytes));
        } catch (Throwable th) {
            if (MraidAdRenderer$handleBridgeCallFromFetch$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return null;
        }
    }

    private final String processClickMacro() {
        AdmClickInfo admClickInfo;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdmClickInfoProvider admClickInfoProvider = this.admClickInfoProvider;
            if (admClickInfoProvider == null || (admClickInfo = admClickInfoProvider.getAdmClickInfo()) == null) {
                return null;
            }
            sendEvents(admClickInfo.getClickTracking());
            return admClickInfo.getClickThroughUrl();
        } catch (Throwable th) {
            if (MraidAdRenderer$processClickMacro$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldOverrideUrl(String url) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        if (url == null) {
            return true;
        }
        try {
            Uri parsed = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parsed, "parsed");
            String scheme = parsed.getScheme();
            if (scheme == null) {
                return true;
            }
            if (Intrinsics.areEqual(scheme, "mraid")) {
                handleBridgeCall(parsed);
                return true;
            }
            onClickThrough(this.context, url);
            return true;
        } catch (Throwable th) {
            if (MraidAdRenderer$shouldOverrideUrl$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return true;
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected boolean onAdCloseRequested() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (!(this.extendedController instanceof SplashAdController)) {
                return true;
            }
            requestAdCloseInternal$default(this, false, 1, null);
            return false;
        } catch (Throwable th) {
            if (MraidAdRenderer$onAdCloseRequested$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidAdRenderer(@NotNull Context context, @NotNull AdRendererConfig config, @NotNull AdRendererListener listener) {
        super(context, config, listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.webViewLoadContentType = WebViewLoadContentType.ADM;
        this.webViewContainer = new RelativeLayout(context);
        this.handler = new Handler(Looper.getMainLooper());
        this.notModifiedActivityOrientation = -1;
        this.lastExposurePrcnt = -1.0d;
        MraidFeatureDetection.INSTANCE.initialize(context);
        createContainer();
        startActivityLifecycleChecking();
    }

    /* compiled from: MraidAdRenderer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$Companion;", "", "()V", "ALLOW_CLICKTHROUGH_WITHOUT_TAP_DEFAULT", "", "CLICKTHROUGH_CONSTANT", "", "LOG_TAG", "PROGRESS_BAR_SHOW_DELAY", "", "WEB_VIEW_BASE_URL", "webViewCrashTestAllowed", "getWebViewCrashTestAllowed$annotations", "getWebViewCrashTestAllowed", "()Z", "setWebViewCrashTestAllowed", "(Z)V", "getSupportedApiFrameworks", "", "Lcom/mobilefuse/sdk/rtb/ApiFramework;", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        public static /* synthetic */ void getWebViewCrashTestAllowed$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getWebViewCrashTestAllowed() {
            return MraidAdRenderer.webViewCrashTestAllowed;
        }

        public final void setWebViewCrashTestAllowed(boolean z) {
            MraidAdRenderer.webViewCrashTestAllowed = z;
        }

        @NotNull
        public final List<ApiFramework> getSupportedApiFrameworks() {
            return CollectionsKt.listOf((Object[]) new ApiFramework[]{ApiFramework.MRAID1, ApiFramework.MRAID2, ApiFramework.MRAID3, ApiFramework.OMID1});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchAdmExposureChangeEvent(double exposedPercentage, double left, double top, Rect currentView) throws Throwable {
        String str;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            WebView webView = this.webView;
            if (webView == null) {
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(exposedPercentage)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
            if (currentView != null) {
                str = "{\n                      \"x\": " + convertPxToDp((int) left) + ",\n                      \"y\": " + convertPxToDp((int) top) + ",\n                      \"width\": " + convertPxToDp(currentView.width()) + ",\n                      \"height\": " + convertPxToDp(currentView.height()) + "\n                }";
                if (str == null) {
                }
                boolean z = exposedPercentage <= ((double) 50);
                webView.evaluateJavascript("mraid.bridge.setExposureChange(" + format + ',' + str + ',' + POBCommonConstants.NULL_VALUE + ");", null);
                StringBuilder sb = new StringBuilder();
                sb.append("mraid.bridge.setIsViewable(");
                sb.append(z);
                sb.append(");");
                webView.evaluateJavascript(sb.toString(), null);
            }
            str = POBCommonConstants.NULL_VALUE;
            if (exposedPercentage <= ((double) 50)) {
            }
            webView.evaluateJavascript("mraid.bridge.setExposureChange(" + format + ',' + str + ',' + POBCommonConstants.NULL_VALUE + ");", null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mraid.bridge.setIsViewable(");
            sb2.append(z);
            sb2.append(");");
            webView.evaluateJavascript(sb2.toString(), null);
        } catch (Throwable th) {
            int i = MraidAdRenderer$dispatchAdmExposureChangeEvent$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void createWebView() throws Throwable {
        if (this.webView != null) {
            return;
        }
        final WebView webView = new WebView(this.context);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setUseWideViewPort(false);
        settings.setMixedContentMode(0);
        settings.setMediaPlaybackRequiresUserGesture(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setHorizontalScrollbarOverlay(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setVerticalScrollbarOverlay(false);
        webView.setOverScrollMode(2);
        webView.setLayerType(2, null);
        if (isTransparentBackground()) {
            webView.setBackgroundColor(0);
        } else {
            updateWebViewBackgroundColor(webView);
        }
        webView.setWebViewClient(new WebViewClient() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$createWebView$$inlined$apply$lambda$1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(@Nullable WebView view, @NotNull String url) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$createWebView$$inlined$apply$lambda$1;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
                CreativeInfoManager.onResourceLoaded(h.E, view, url);
                safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_onLoadResource_eb60285b4fc7fe950cf675f84ee76dad(view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                BrandSafetyUtils.onWebViewPageStarted(h.E, view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                BrandSafetyUtils.onWebViewReceivedError(h.E, view, errorCode, description, failingUrl);
            }

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // android.webkit.WebViewClient
            @RequiresApi
            @Nullable
            public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$createWebView$$inlined$apply$lambda$1;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponseWithHeaders(h.E, view, request, safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldInterceptRequest_a98495addda861fc9ede17b35dc8a938(view, request));
            }

            @Override // android.webkit.WebViewClient
            @Nullable
            public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable String url) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$createWebView$$inlined$apply$lambda$1;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse(h.E, view, url, safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldInterceptRequest_7d508a211c0d4936ce7e9523ebef0002(view, url));
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(24)
            public boolean shouldOverrideUrlLoading(@Nullable WebView view, @NotNull WebResourceRequest request) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$createWebView$$inlined$apply$lambda$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
                boolean safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_b3bb39a1fb733e3c1c002123c3ff530b = safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_b3bb39a1fb733e3c1c002123c3ff530b(view, request);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.E, view, request, safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_b3bb39a1fb733e3c1c002123c3ff530b);
                return safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_b3bb39a1fb733e3c1c002123c3ff530b;
            }

            @Override // android.webkit.WebViewClient
            @RequiresApi
            public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/mraid/MraidAdRenderer$createWebView$$inlined$apply$lambda$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                boolean safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_fbe2282452dcac6d42bb420a6cdf5684 = safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_fbe2282452dcac6d42bb420a6cdf5684(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.E, view, url, safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_fbe2282452dcac6d42bb420a6cdf5684);
                return safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_fbe2282452dcac6d42bb420a6cdf5684;
            }

            @Override // android.webkit.WebViewClient
            @RequiresApi
            public void onPageFinished(@Nullable WebView view, @Nullable String url) {
                ExtendedController extendedController;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    if (Intrinsics.areEqual(url, AndroidWebViewClient.BLANK_PAGE)) {
                        return;
                    }
                    this.onAdmLoaded();
                    DebuggingKt.logDebug(this, "onPageFinished | init mraid.js", MraidAdRenderer.LOG_TAG);
                    extendedController = ((BaseAdRenderer) this).extendedController;
                    if (!(extendedController instanceof SplashAdController)) {
                        extendedController = null;
                    }
                    SplashAdController splashAdController = (SplashAdController) extendedController;
                    if (splashAdController != null) {
                        splashAdController.onWebViewPageFinished();
                    }
                    super.onPageFinished(view, url);
                } catch (Throwable th) {
                    int i = MraidAdRenderer$createWebView$1$2$onPageFinished$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            public void safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_onLoadResource_eb60285b4fc7fe950cf675f84ee76dad(WebView p0, String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    HttpRequestTracker.logHttpRequest(url);
                    super.onLoadResource(p0, url);
                } catch (Throwable th) {
                    int i = MraidAdRenderer$createWebView$1$2$onLoadResource$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
                WebView webView2;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    webView2 = this.webView;
                    if (view == webView2) {
                        DebuggingKt.logInfo(this, "WebView Render Process has gone.", "Mraid Ad Renderer");
                        this.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
                    }
                    return true;
                } catch (Throwable th) {
                    if (MraidAdRenderer$createWebView$1$2$onRenderProcessGone$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    }
                    return true;
                }
            }

            @TargetApi(24)
            public boolean safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_b3bb39a1fb733e3c1c002123c3ff530b(WebView p0, WebResourceRequest request) {
                ObservableConfig observableConfig;
                boolean shouldOverrideUrl;
                Intrinsics.checkNotNullParameter(request, "request");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    boolean z = request.hasGesture() && !request.isRedirect();
                    observableConfig = ((BaseAdRenderer) this).observableConfig;
                    boolean booleanValue = observableConfig != null ? observableConfig.getBooleanValue(ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP, false) : false;
                    if (!z && !booleanValue) {
                        return true;
                    }
                    shouldOverrideUrl = this.shouldOverrideUrl(request.getUrl().toString());
                    return shouldOverrideUrl;
                } catch (Throwable th) {
                    if (MraidAdRenderer$createWebView$1$2$shouldOverrideUrlLoading$$inlined$handleExceptionsWithDefault$2$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] != 1) {
                        return true;
                    }
                    StabilityHelper.logException("[Automatically caught]", th);
                    return true;
                }
            }

            @RequiresApi
            public boolean safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_fbe2282452dcac6d42bb420a6cdf5684(WebView p0, String p1) {
                boolean shouldOverrideUrl;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    shouldOverrideUrl = this.shouldOverrideUrl(p1);
                    return shouldOverrideUrl;
                } catch (Throwable th) {
                    if (MraidAdRenderer$createWebView$1$2$shouldOverrideUrlLoading$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    }
                    return true;
                }
            }

            /* compiled from: MraidAdRenderer.kt */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/mobilefuse/sdk/mraid/MraidAdRenderer$createWebView$1$2$shouldInterceptRequest$1"}, k = 3, mv = {1, 4, 3})
            /* renamed from: com.mobilefuse.sdk.mraid.MraidAdRenderer$createWebView$$inlined$apply$lambda$1$1, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0 {
                AnonymousClass1(MraidAdRenderer mraidAdRenderer) {
                    super(0, mraidAdRenderer, MraidAdRenderer.class, "handleCriticalAssetFailure", "handleCriticalAssetFailure()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    ((MraidAdRenderer) this.receiver).handleCriticalAssetFailure();
                }
            }

            /* compiled from: MraidAdRenderer.kt */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/mobilefuse/sdk/mraid/MraidAdRenderer$createWebView$1$2$shouldInterceptRequest$2$1"}, k = 3, mv = {1, 4, 3})
            /* renamed from: com.mobilefuse.sdk.mraid.MraidAdRenderer$createWebView$$inlined$apply$lambda$1$2, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0 {
                AnonymousClass2(MraidAdRenderer mraidAdRenderer) {
                    super(0, mraidAdRenderer, MraidAdRenderer.class, "handleCriticalAssetFailure", "handleCriticalAssetFailure()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    ((MraidAdRenderer) this.receiver).handleCriticalAssetFailure();
                }
            }

            @Nullable
            public WebResourceResponse safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldInterceptRequest_7d508a211c0d4936ce7e9523ebef0002(WebView p0, String p1) {
                WebResourceResponse handleBridgeCallFromFetch;
                try {
                    Uri parse = Uri.parse(p1);
                    handleBridgeCallFromFetch = this.handleBridgeCallFromFetch(parse);
                    return handleBridgeCallFromFetch == null ? WebViewUtils.shouldInterceptRequest(webView.getContext(), parse, new AnonymousClass1(this)) : handleBridgeCallFromFetch;
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                    return super.shouldInterceptRequest(p0, p1);
                }
            }

            @RequiresApi
            @Nullable
            public WebResourceResponse safedk_MraidAdRenderer$createWebView$$inlined$apply$lambda$1_shouldInterceptRequest_a98495addda861fc9ede17b35dc8a938(WebView p0, WebResourceRequest p1) {
                WebResourceResponse handleBridgeCallFromFetch;
                if (p1 != null) {
                    try {
                        handleBridgeCallFromFetch = this.handleBridgeCallFromFetch(p1.getUrl());
                        if (handleBridgeCallFromFetch == null) {
                            handleBridgeCallFromFetch = WebViewUtils.shouldInterceptRequest(webView.getContext(), p1.getUrl(), new AnonymousClass2(this));
                        }
                    } catch (Throwable th) {
                        StabilityHelper.logException(this, th);
                        return super.shouldInterceptRequest(p0, p1);
                    }
                } else {
                    handleBridgeCallFromFetch = null;
                }
                return handleBridgeCallFromFetch;
            }
        });
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$createWebView$1$3
            @Override // android.webkit.WebChromeClient
            @Nullable
            public Bitmap getDefaultVideoPoster() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
                    return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : defaultVideoPoster;
                } catch (Throwable th) {
                    if (MraidAdRenderer$createWebView$1$3$getDefaultVideoPoster$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    }
                    return null;
                }
            }
        });
        Unit unit = Unit.INSTANCE;
        this.webView = webView;
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void preloadAdmImpl(@Nullable String adm) throws Throwable {
        this.handler.postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$preloadAdmImpl$1
            @Override // java.lang.Runnable
            public final void run() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    MraidAdRenderer.this.onAdPreloaded();
                } catch (Throwable th) {
                    int i = MraidAdRenderer$preloadAdmImpl$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }, 200L);
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void applyCurrentBackgroundColor() throws Throwable {
        updateWebViewBackgroundColor(this.webView);
    }

    private final void updateWebViewBackgroundColor(WebView wv) throws Throwable {
        if (isTransparentBackground() || wv == null) {
            return;
        }
        wv.setBackgroundColor(getAdBackgroundColor());
        this.webViewContainer.setBackgroundColor(getAdBackgroundColor());
        AdRendererContainer adRendererContainer = this.contentContainer;
        if (adRendererContainer != null) {
            adRendererContainer.setBackgroundColor(getAdBackgroundColor());
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void removeCloseButton() throws Throwable {
        ViewParent parent;
        CloseButton closeButton = this.closeBtn;
        if (closeButton == null) {
            return;
        }
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        if (closeButton != null) {
            try {
                parent = closeButton.getParent();
            } catch (Throwable th) {
                int i = MraidAdRenderer$removeCloseButton$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            parent = null;
        }
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) parent).removeView(this.closeBtn);
        CloseButton closeButton2 = this.closeBtn;
        if (closeButton2 != null) {
            closeButton2.destroy();
        }
        this.closeBtn = null;
    }

    private final void requestAdPositionUpdate() throws Throwable {
        AdRendererContainer adRendererContainer = this.contentContainer;
        if (!(adRendererContainer instanceof MraidAdRendererContainer)) {
            adRendererContainer = null;
        }
        MraidAdRendererContainer mraidAdRendererContainer = (MraidAdRendererContainer) adRendererContainer;
        if (mraidAdRendererContainer != null) {
            mraidAdRendererContainer.checkPosition();
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    @Nullable
    public View getAdView() throws Throwable {
        return this.contentContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @RequiresApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleBridgeCall(Uri callUri) throws Throwable {
        WebView webView;
        String host = callUri.getHost();
        DebuggingKt.logDebug(this, "Call: " + host, LOG_TAG);
        if (this.closingAd) {
            return;
        }
        if (host != null) {
            switch (host.hashCode()) {
                case -1289167206:
                    if (host.equals(n.e)) {
                        expandWebView(callUri);
                        break;
                    }
                    break;
                case -860879067:
                    if (host.equals("eventListenerWasAdded")) {
                        verifyEventAdded(callUri);
                        break;
                    }
                    break;
                case -840442113:
                    if (host.equals("unload")) {
                        if (this.showingAd) {
                            requestAdCloseInternal(true);
                            break;
                        } else {
                            onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
                            break;
                        }
                    }
                    break;
                case -229840711:
                    if (host.equals("initBridge")) {
                        initJsBridge();
                        break;
                    }
                    break;
                case -117299164:
                    if (host.equals("splashAdExpand")) {
                        ExtendedController extendedController = this.extendedController;
                        if (!(extendedController instanceof SplashAdController)) {
                            extendedController = null;
                        }
                        SplashAdController splashAdController = (SplashAdController) extendedController;
                        if (splashAdController != null) {
                            removeCloseBtnOmidFriendlyObstruction();
                            splashAdController.requestExpand();
                            break;
                        }
                    }
                    break;
                case 3417674:
                    if (host.equals("open")) {
                        onClickThrough(this.context, callUri.getQueryParameter("url"));
                        break;
                    }
                    break;
                case 94756344:
                    if (host.equals("close")) {
                        requestAdCloseInternal$default(this, false, 1, null);
                        break;
                    }
                    break;
                case 133423073:
                    if (host.equals(n.h)) {
                        setOrientationProperties(callUri);
                        break;
                    }
                    break;
                case 1457578463:
                    if (host.equals("splashAdTransition")) {
                        ExtendedController extendedController2 = this.extendedController;
                        if (!(extendedController2 instanceof SplashAdController)) {
                            extendedController2 = null;
                        }
                        SplashAdController splashAdController2 = (SplashAdController) extendedController2;
                        if (splashAdController2 != null) {
                            splashAdController2.requestTransition();
                            break;
                        }
                    }
                    break;
                case 1614272768:
                    if (host.equals("useCustomClose")) {
                        addCloseButton(callUri.getBooleanQueryParameter("shouldUseCustomClose", false));
                        break;
                    }
                    break;
            }
            webView = this.webView;
            if (webView == null) {
                webView.evaluateJavascript("mraid.bridge.nativeCallComplete();", null);
                return;
            }
            return;
        }
        JsBridgeCallListener jsBridgeCallListener = this.jsBridgeCallListener;
        if (jsBridgeCallListener == null || !jsBridgeCallListener.onBridgeCall(callUri)) {
            DebuggingKt.logInfo(this, "Unimplemented command called: " + host, LOG_TAG);
        }
        webView = this.webView;
        if (webView == null) {
        }
    }

    public final void setJsBridgeCallListener(@Nullable JsBridgeCallListener listener) {
        this.jsBridgeCallListener = listener;
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void onActivityResumeImpl() throws Throwable {
        requestAdPositionUpdate();
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.startObstructionsChecking();
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void onActivityPauseImpl() throws Throwable {
        dispatchAdmExposureChangeEvent(0.0d, 0.0d, 0.0d, null);
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.stopObstructionsChecking();
        }
    }

    static /* synthetic */ void requestAdCloseInternal$default(MraidAdRenderer mraidAdRenderer, boolean z, int i, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestAdCloseInternal");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        mraidAdRenderer.requestAdCloseInternal(z);
    }

    private final void requestAdCloseInternal(final boolean isRuntimeException) throws Throwable {
        this.closingAd = true;
        if (this.expanded) {
            bridge_SetState("DEFAULT");
        } else if (this.config.isFullscreenAd()) {
            bridge_SetState("HIDDEN");
        }
        ExtendedController extendedController = this.extendedController;
        if (extendedController != null) {
            extendedController.requestAdClose(new ExtendedController.AdCloseListener() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$requestAdCloseInternal$1
                @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController.AdCloseListener
                public final void onAdClosed() {
                    MraidAdRenderer.this.closeAd(isRuntimeException);
                }
            });
        } else {
            closeAd(isRuntimeException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeAd(boolean runtimeError) throws Throwable {
        WebView webView;
        if (this.showingAd) {
            if (this.config.isFullscreenAd() || runtimeError) {
                this.showingAd = false;
            }
            dismissBannerExpandedWindow();
            if (this.activityOrientationChanged) {
                Activity activity = this.renderingActivity;
                if (activity != null) {
                    if (this.config.isFullscreenAd()) {
                        activity = null;
                    }
                    if (activity != null) {
                        activity.setRequestedOrientation(this.notModifiedActivityOrientation);
                        Utils.unlockOrientation(activity);
                    }
                }
                this.notModifiedActivityOrientation = -1;
                this.activityOrientationChanged = false;
            }
            if (this.expanded) {
                this.expanded = false;
                this.closingAd = false;
                if (!runtimeError) {
                    removeCloseButton();
                    bridge_SetState("DEFAULT");
                    WebView webView2 = this.webView;
                    if (webView2 != null) {
                        webView2.setLayoutParams(this.bannerInlineLayoutParams);
                    }
                    AdRendererContainer adRendererContainer = this.contentContainer;
                    if (adRendererContainer != null) {
                        adRendererContainer.addView(this.webViewContainer, this.bannerInlineLayoutParams);
                    }
                    this.listener.onFullscreenChanged(false);
                }
            } else {
                WebView webView3 = this.webView;
                if (webView3 != null) {
                    webView3.stopLoading();
                }
                onAdClosed();
            }
            if (runtimeError && (webView = this.webView) != null) {
                ViewParent parent = webView.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                MobileFuseNetworkBridge.webviewLoadUrl(webView, AndroidWebViewClient.BLANK_PAGE);
            }
            ExtendedController extendedController = this.extendedController;
            if (extendedController != null) {
                extendedController.unbindContent();
                this.extendedController = null;
            }
        }
    }

    private void safedk_MraidAdRenderer_bridge_SetState_190d2423d64597e56e3cfa24926117d4(String p0) throws Throwable {
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript("mraid.bridge.setState(Mraid.State." + p0 + ");", null);
        }
    }

    private final void bridge_NotifyReadyEvents() throws Throwable {
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript("mraid.bridge.notifyReadyEvent();", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bridge_NotifySizeChangeEvent(int width, int height) throws Throwable {
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript("mraid.bridge.notifySizeChangeEvent(" + width + ", " + height + ");", null);
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    @Nullable
    protected View.OnLayoutChangeListener getOnLayoutChangeListener(@Nullable Context context) throws Throwable {
        return new View.OnLayoutChangeListener() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$getOnLayoutChangeListener$1
            @Override // android.view.View.OnLayoutChangeListener
            @RequiresApi
            public void onLayoutChange(@Nullable View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                ExtendedController extendedController;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                if (right == oldRight && bottom == oldBottom) {
                    return;
                }
                try {
                    MraidAdRenderer.this.setAdProperties(false);
                    DebuggingKt.logDebug(this, "onLayoutChange [left: " + left + ", top: " + top + ", right: " + right + ", bottom: " + bottom + ']', "MF");
                    extendedController = ((BaseAdRenderer) MraidAdRenderer.this).extendedController;
                    if (extendedController != null) {
                        extendedController.invalidateLayout();
                    }
                } catch (Throwable th) {
                    int i = MraidAdRenderer$getOnLayoutChangeListener$1$onLayoutChange$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x0009, B:9:0x000e, B:11:0x0014, B:13:0x001a, B:19:0x003e, B:21:0x0052, B:25:0x0033, B:28:0x0027), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @RequiresApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setCurrentAppOrientation() throws Throwable {
        String str;
        WebView webView;
        Resources resources;
        Configuration configuration;
        if (this.webView == null) {
            return;
        }
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Activity activity = this.renderingActivity;
            Integer valueOf = (activity == null || (resources = activity.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
            if (valueOf != null && valueOf.intValue() == 1) {
                str = "portrait";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.n, str);
                jSONObject.put("locked", false);
                webView = this.webView;
                if (webView != null) {
                    webView.evaluateJavascript("mraid.bridge.setCurrentAppOrientation(" + jSONObject + ");", null);
                    return;
                }
                return;
            }
            if (valueOf.intValue() == 2) {
                str = "landscape";
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(X3.i.n, str);
                jSONObject2.put("locked", false);
                webView = this.webView;
                if (webView != null) {
                }
            }
            str = "none";
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put(X3.i.n, str);
            jSONObject22.put("locked", false);
            webView = this.webView;
            if (webView != null) {
            }
        } catch (Throwable th) {
            int i = MraidAdRenderer$setCurrentAppOrientation$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void setOrientationProperties(Uri callUri) throws Throwable {
        Activity activity;
        int i;
        if (this.renderingActivity == null) {
            return;
        }
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            String queryParameter = callUri.getQueryParameter("allowOrientationChange");
            boolean parseBoolean = queryParameter != null ? Boolean.parseBoolean(queryParameter) : true;
            String queryParameter2 = callUri.getQueryParameter("forceOrientation");
            if (queryParameter2 == null) {
                queryParameter2 = "none";
            }
            Intrinsics.checkNotNullExpressionValue(queryParameter2, "callUri.getQueryParamete…ceOrientation\") ?: \"none\"");
            if ((this.expanded || this.config.isFullscreenAd()) && (activity = this.renderingActivity) != null) {
                if (parseBoolean) {
                    activity.setRequestedOrientation(-1);
                    return;
                }
                int hashCode = queryParameter2.hashCode();
                if (hashCode == 3387192) {
                    if (queryParameter2.equals("none")) {
                        Resources resources = this.context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                        i = resources.getConfiguration().orientation;
                    }
                    Resources resources2 = this.context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
                    i = resources2.getConfiguration().orientation;
                } else if (hashCode != 729267099) {
                    if (hashCode == 1430647483 && queryParameter2.equals("landscape")) {
                        i = 2;
                    }
                    Resources resources22 = this.context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources22, "context.resources");
                    i = resources22.getConfiguration().orientation;
                } else {
                    if (queryParameter2.equals("portrait")) {
                        i = 1;
                    }
                    Resources resources222 = this.context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources222, "context.resources");
                    i = resources222.getConfiguration().orientation;
                }
                Utils.setActivityOrientation(activity, i);
            }
        } catch (Throwable th) {
            int i2 = MraidAdRenderer$setOrientationProperties$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i2 == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentPosition(int width, int height, int posX, int posY) {
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript("mraid.bridge.setCurrentPosition({\"x\": " + posX + ", \"y\": " + posY + ", \"width\": " + width + ", \"height\": " + height + "});", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCriticalAssetFailure() {
        this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer$handleCriticalAssetFailure$1
            @Override // java.lang.Runnable
            public final void run() {
                WebView webView;
                boolean z;
                AdRendererListener adRendererListener;
                try {
                    webView = MraidAdRenderer.this.webView;
                    if (webView != null) {
                        z = MraidAdRenderer.this.closingAd;
                        if (z) {
                            return;
                        }
                        DebuggingKt.logError$default(MraidAdRenderer.this, "Asset loading failed - terminating ad to prevent incomplete rendering", MraidAdRenderer.LOG_TAG, null, 4, null);
                        adRendererListener = ((BaseAdRenderer) MraidAdRenderer.this).listener;
                        adRendererListener.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
                    }
                } catch (Throwable th) {
                    StabilityHelper.logException(MraidAdRenderer.this, th);
                }
            }
        });
    }

    private final void sendEvents(List<String> clickTracking) {
        AdClickTracker.sendEvents(clickTracking);
    }
}
