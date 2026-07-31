package com.mobilefuse.sdk.ad.rendering.splashad;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import com.mobilefuse.sdk.ExtendedAdType;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.ExtendedController;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainerFactoryKt;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedPositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.ScaleModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.StaticPositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.StaticSizeModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.interpolator.QuadEaseInOutInterpolator;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdAnchorService;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdAnchorServiceKt;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdFullscreenService;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdTouchService;
import com.mobilefuse.sdk.ad.rendering.omniad.service.TouchEventType;
import com.mobilefuse.sdk.ad.rendering.omniad.view.ViewRenderingPixels;
import com.mobilefuse.sdk.ad.rendering.omniad.view.ViewRenderingPixelsKt;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.utils.DimConversionsKt;
import com.mobilefuse.sdk.utils.ViewToBitmapKt;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SplashAdController.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 }2\u00020\u0001:\u0001}B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u000bH\u0014¢\u0006\u0004\b%\u0010 J\u001b\u0010'\u001a\u00020\u000b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000b¢\u0006\u0004\b)\u0010 J\r\u0010*\u001a\u00020\u000b¢\u0006\u0004\b*\u0010 J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00104\u001a\u0002018\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010@\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010WR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010WR\u0014\u0010]\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010c\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010>\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010jR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010n\u001a\u0004\bo\u0010pR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010b\u001a\u0004\bq\u0010rR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010s\u001a\u0004\bt\u0010uR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010s\u001a\u0004\bv\u0010uR$\u0010|\u001a\u0002072\u0006\u0010w\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006~"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/splashad/SplashAdController;", "Lcom/mobilefuse/sdk/ad/rendering/ExtendedController;", "Landroid/app/Activity;", "renderingActivity", "Landroid/view/View;", "contentView", "Landroid/webkit/WebView;", "webView", "Lcom/mobilefuse/sdk/omid/OmidBridge;", "omidBridge", "Lkotlin/Function0;", "", "rendererCloseRequestAction", "Lkotlin/Function1;", "", "rendererFatalExceptionCallback", "", "changeCloseBtnVisibility", "<init>", "(Landroid/app/Activity;Landroid/view/View;Landroid/webkit/WebView;Lcom/mobilefuse/sdk/omid/OmidBridge;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "changeToFullscreen", "completeAction", "requestFullscreenChange", "(ZLkotlin/jvm/functions/Function0;)V", EidRequestBuilder.REQUEST_FIELD_EMAIL, "onFatalException", "(Ljava/lang/Throwable;)V", "adContent", "activity", "bindContentImpl", "(Landroid/view/View;Landroid/app/Activity;)V", "onWebViewPageFinished", "()V", "requestTransition", "requestExpand", "invalidateLayout", "unbindContentImpl", "onAdCloseRequested", "expandedCloseAction", "onWebViewExpanded", "(Lkotlin/jvm/functions/Function0;)V", "onCloseRequestedFromExpandActivity", "onExpandActivityClosed", "Lcom/mobilefuse/sdk/ExtendedAdType;", "getExtendedAdType", "()Lcom/mobilefuse/sdk/ExtendedAdType;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/view/ViewRenderingPixels;", "viewRenderingPixels", "Lcom/mobilefuse/sdk/ad/rendering/omniad/view/ViewRenderingPixels;", "Landroid/graphics/Point;", "sizeDp", "Landroid/graphics/Point;", "sizePx", "getSizePx", "()Landroid/graphics/Point;", "", "marginDp", "I", "", "watchdogTransitionDelay", "J", "transitionProcessed", "Z", "expanded", "closed", "Ljava/lang/Runnable;", "transitionWatchdogTask", "Ljava/lang/Runnable;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "omniAdContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "getOmniAdContainer$mobilefuse_sdk_mraid_release", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;", "propertyService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdFullscreenService;", "fullscreenService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdFullscreenService;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdAnchorService;", "anchorService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdAnchorService;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdTouchService;", "touchService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdTouchService;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "animatedPositionModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "staticPositionModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "staticSizeModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "defaultPositionModifier", "defaultSizeModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "defaultScaleModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "expandedActivityCloseAction", "Lkotlin/jvm/functions/Function0;", "isExpandedCloseBtnTransparent", "()Z", "setExpandedCloseBtnTransparent", "(Z)V", "Landroid/app/Activity;", "getRenderingActivity", "()Landroid/app/Activity;", "Landroid/view/View;", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Lcom/mobilefuse/sdk/omid/OmidBridge;", "getOmidBridge", "()Lcom/mobilefuse/sdk/omid/OmidBridge;", "getRendererCloseRequestAction", "()Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "getRendererFatalExceptionCallback", "()Lkotlin/jvm/functions/Function1;", "getChangeCloseBtnVisibility", "value", "getAnchor", "()I", "setAnchor", "(I)V", "anchor", "Companion", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes8.dex */
public final class SplashAdController extends ExtendedController {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static WeakReference<SplashAdController> currentFullscreenController;
    private final OmniAdAnchorService anchorService;
    private final PositionModifier animatedPositionModifier;

    @NotNull
    private final Function1 changeCloseBtnVisibility;
    private boolean closed;
    private final View contentView;
    private final PositionModifier defaultPositionModifier;
    private final ScaleModifier defaultScaleModifier;
    private final SizeModifier defaultSizeModifier;
    private boolean expanded;
    private Function0 expandedActivityCloseAction;
    private final OmniAdFullscreenService fullscreenService;
    private boolean isExpandedCloseBtnTransparent;
    private final int marginDp;

    @Nullable
    private final OmidBridge omidBridge;

    @NotNull
    private final OmniAdContainer omniAdContainer;
    private final OmniAdPropertyService propertyService;

    @NotNull
    private final Function0 rendererCloseRequestAction;

    @NotNull
    private final Function1 rendererFatalExceptionCallback;

    @NotNull
    private final Activity renderingActivity;
    private final Point sizeDp;

    @NotNull
    private final Point sizePx;
    private final PositionModifier staticPositionModifier;
    private final SizeModifier staticSizeModifier;
    private final OmniAdTouchService touchService;
    private boolean transitionProcessed;
    private final Runnable transitionWatchdogTask;
    private ViewRenderingPixels viewRenderingPixels;
    private final long watchdogTransitionDelay;

    @NotNull
    private final WebView webView;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes3.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TouchEventType.DRAG.ordinal()] = 1;
            iArr[TouchEventType.TOUCH_UP.ordinal()] = 2;
            iArr[TouchEventType.TOUCH_DOWN.ordinal()] = 3;
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.E);
        p0.startActivity(p1);
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    public void invalidateLayout() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            super.invalidateLayout();
            ViewRenderingPixels viewRenderingPixels = this.viewRenderingPixels;
            if (viewRenderingPixels != null) {
                viewRenderingPixels.invalidateLayout();
            }
            this.fullscreenService.invalidateLayout(OmniAdAnchorServiceKt.getAnchorPosition(this.anchorService), this.staticPositionModifier, this.staticSizeModifier);
        } catch (Throwable th) {
            int i = SplashAdController$invalidateLayout$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onCloseRequestedFromExpandActivity() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.rendererCloseRequestAction.mo4828invoke();
        } catch (Throwable th) {
            int i = SplashAdController$onCloseRequestedFromExpandActivity$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onExpandActivityClosed() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            currentFullscreenController = null;
            onAdReadyToClose();
        } catch (Throwable th) {
            int i = SplashAdController$onExpandActivityClosed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onWebViewExpanded(@NotNull Function0 expandedCloseAction) {
        Intrinsics.checkNotNullParameter(expandedCloseAction, "expandedCloseAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.expandedActivityCloseAction = expandedCloseAction;
        } catch (Throwable th) {
            int i = SplashAdController$onWebViewExpanded$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    protected void unbindContentImpl() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.omniAdContainer.destroy();
            ViewRenderingPixels viewRenderingPixels = this.viewRenderingPixels;
            if (viewRenderingPixels != null) {
                viewRenderingPixels.removePixels();
            }
            this.viewRenderingPixels = null;
            SchedulersKt.getGlobalHandler().removeCallbacks(this.transitionWatchdogTask);
        } catch (Throwable th) {
            int i = SplashAdController$unbindContentImpl$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final Activity getRenderingActivity() {
        return this.renderingActivity;
    }

    @NotNull
    public final WebView getWebView() {
        return this.webView;
    }

    @Nullable
    public final OmidBridge getOmidBridge() {
        return this.omidBridge;
    }

    @NotNull
    public final Function0 getRendererCloseRequestAction() {
        return this.rendererCloseRequestAction;
    }

    @NotNull
    public final Function1 getRendererFatalExceptionCallback() {
        return this.rendererFatalExceptionCallback;
    }

    @NotNull
    public final Function1 getChangeCloseBtnVisibility() {
        return this.changeCloseBtnVisibility;
    }

    public SplashAdController(@NotNull Activity renderingActivity, @NotNull View contentView, @NotNull WebView webView, @Nullable OmidBridge omidBridge, @NotNull Function0 rendererCloseRequestAction, @NotNull Function1 rendererFatalExceptionCallback, @NotNull Function1 changeCloseBtnVisibility) {
        Intrinsics.checkNotNullParameter(renderingActivity, "renderingActivity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(rendererCloseRequestAction, "rendererCloseRequestAction");
        Intrinsics.checkNotNullParameter(rendererFatalExceptionCallback, "rendererFatalExceptionCallback");
        Intrinsics.checkNotNullParameter(changeCloseBtnVisibility, "changeCloseBtnVisibility");
        this.renderingActivity = renderingActivity;
        this.contentView = contentView;
        this.webView = webView;
        this.omidBridge = omidBridge;
        this.rendererCloseRequestAction = rendererCloseRequestAction;
        this.rendererFatalExceptionCallback = rendererFatalExceptionCallback;
        this.changeCloseBtnVisibility = changeCloseBtnVisibility;
        Point point = new Point(200, 200);
        this.sizeDp = point;
        Point dpToPx = DimConversionsKt.dpToPx(point, renderingActivity);
        this.sizePx = dpToPx;
        this.marginDp = 10;
        this.watchdogTransitionDelay = 3000L;
        this.transitionWatchdogTask = new Runnable() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController$transitionWatchdogTask$1
            @Override // java.lang.Runnable
            public final void run() {
                SplashAdController.this.requestTransition();
            }
        };
        OmniAdContainer createOmniAdContainer = OmniAdContainerFactoryKt.createOmniAdContainer(renderingActivity, contentView);
        this.omniAdContainer = createOmniAdContainer;
        this.animatedPositionModifier = new AnimatedPositionModifier(createOmniAdContainer, 0L, null, 6, null);
        this.staticPositionModifier = new StaticPositionModifier(createOmniAdContainer);
        this.staticSizeModifier = new StaticSizeModifier(createOmniAdContainer);
        PositionModifier defaultPositionModifier = createOmniAdContainer.getDefaultPositionModifier();
        this.defaultPositionModifier = defaultPositionModifier;
        SizeModifier defaultSizeModifier = createOmniAdContainer.getDefaultSizeModifier();
        this.defaultSizeModifier = defaultSizeModifier;
        this.defaultScaleModifier = createOmniAdContainer.getDefaultScaleModifier();
        OmniAdPropertyService omniAdPropertyService = new OmniAdPropertyService(renderingActivity, dpToPx, createOmniAdContainer, defaultPositionModifier, defaultSizeModifier);
        this.propertyService = omniAdPropertyService;
        this.fullscreenService = new OmniAdFullscreenService(omniAdPropertyService, defaultPositionModifier, defaultSizeModifier);
        this.anchorService = new OmniAdAnchorService(omniAdPropertyService, 10, 3);
        this.touchService = new OmniAdTouchService(renderingActivity, createOmniAdContainer, point, 10, new Function3() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (TouchEventType) obj3);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, int i2, @NotNull TouchEventType touchType) {
                Intrinsics.checkNotNullParameter(touchType, "touchType");
                int i3 = WhenMappings.$EnumSwitchMapping$0[touchType.ordinal()];
                if (i3 == 1) {
                    OmniAdPropertyService.changePosition$default(SplashAdController.this.propertyService, i, i2, SplashAdController.this.staticPositionModifier, null, 8, null);
                    return;
                }
                if (i3 == 2) {
                    OmniAdPropertyService.changePosition$default(SplashAdController.this.propertyService, i, i2, SplashAdController.this.animatedPositionModifier, null, 8, null);
                    OmniAdPropertyService.changeScale$default(SplashAdController.this.propertyService, 1.0f, SplashAdController.this.defaultScaleModifier, null, 4, null);
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    OmniAdPropertyService.changeScale$default(SplashAdController.this.propertyService, 1.2f, SplashAdController.this.defaultScaleModifier, null, 4, null);
                }
            }
        });
        requestFullscreenChange$default(this, true, null, 2, null);
    }

    public final void requestTransition() {
        Either errorResult;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th) {
            if (SplashAdController$requestTransition$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (this.transitionProcessed) {
            return;
        }
        this.transitionProcessed = true;
        SchedulersKt.getGlobalHandler().removeCallbacks(this.transitionWatchdogTask);
        WebView webView = this.webView;
        int width = (webView.getWidth() / 2) - (this.sizePx.x / 2);
        int height = this.webView.getHeight();
        Point point = this.sizePx;
        int i = point.y;
        final ImageView croppedImageView = ViewToBitmapKt.toCroppedImageView(webView, width, height - i, point.x, i);
        if (croppedImageView != null) {
            View view = this.adContent;
            if (view == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            Point point2 = this.sizePx;
            ((ViewGroup) view).addView(croppedImageView, new ViewGroup.LayoutParams(point2.x, point2.y));
        } else {
            croppedImageView = null;
        }
        this.webView.setVisibility(4);
        requestFullscreenChange(false, new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController$requestTransition$1$1
            public final void invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }
        });
        this.anchorService.changePositionToAnchor(new AnimatedPositionModifier(this.omniAdContainer, 1000L, new QuadEaseInOutInterpolator()), new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController$requestTransition$$inlined$gracefullyHandleException$lambda$1
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
                OmniAdTouchService omniAdTouchService;
                OmniAdTouchService omniAdTouchService2;
                omniAdTouchService = SplashAdController.this.touchService;
                omniAdTouchService.setDragEnabled(true);
                omniAdTouchService2 = SplashAdController.this.touchService;
                omniAdTouchService2.setTouchInteractionEnabled(true);
                SplashAdController.this.getChangeCloseBtnVisibility().invoke(Boolean.TRUE);
            }
        });
        Handler globalHandler = SchedulersKt.getGlobalHandler();
        final Function0 function0 = new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController$requestTransition$$inlined$gracefullyHandleException$lambda$2
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
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    this.getWebView().setVisibility(0);
                    ImageView imageView = croppedImageView;
                    ViewParent viewParent = null;
                    ViewParent parent = imageView != null ? imageView.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        viewParent = parent;
                    }
                    ViewGroup viewGroup = (ViewGroup) viewParent;
                    if (viewGroup != null) {
                        viewGroup.removeView(croppedImageView);
                    }
                } catch (Throwable th2) {
                    int i2 = SplashAdController$$special$$inlined$runnableTry$1$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                    if (i2 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        };
        errorResult = new SuccessResult(Boolean.valueOf(globalHandler.postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.SplashAdControllerKt$sam$java_lang_Runnable$0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Intrinsics.checkNotNullExpressionValue(Function0.this.mo4828invoke(), "invoke(...)");
            }
        }, 100L)));
        if (errorResult instanceof ErrorResult) {
            onFatalException((Throwable) ((ErrorResult) errorResult).getValue());
        }
    }

    @NotNull
    public final Point getSizePx() {
        return this.sizePx;
    }

    @NotNull
    /* renamed from: getOmniAdContainer$mobilefuse_sdk_mraid_release, reason: from getter */
    public final OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    public final int getAnchor() {
        return this.anchorService.getAnchor();
    }

    public final void setAnchor(int i) {
        this.anchorService.setAnchor(i);
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    protected void bindContentImpl(@NotNull View adContent, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(adContent, "adContent");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.changeCloseBtnVisibility.invoke(Boolean.FALSE);
        this.viewRenderingPixels = ViewRenderingPixelsKt.createViewRenderingPixels(activity);
    }

    public final void onWebViewPageFinished() {
        SchedulersKt.getGlobalHandler().postDelayed(this.transitionWatchdogTask, this.watchdogTransitionDelay);
    }

    static /* synthetic */ void requestFullscreenChange$default(SplashAdController splashAdController, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController$requestFullscreenChange$1
                public final void invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }
            };
        }
        splashAdController.requestFullscreenChange(z, function0);
    }

    private final void requestFullscreenChange(boolean changeToFullscreen, final Function0 completeAction) {
        if (changeToFullscreen) {
            this.touchService.setDragEnabled(false);
            this.touchService.setTouchInteractionEnabled(false);
            this.fullscreenService.enterFullscreen(this.staticPositionModifier, this.staticSizeModifier, completeAction);
            return;
        }
        this.fullscreenService.exitFullscreen(this.staticPositionModifier, this.staticSizeModifier, new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController$requestFullscreenChange$2
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
                Point splashAdTransitionPosition;
                OmniAdPropertyService omniAdPropertyService = SplashAdController.this.propertyService;
                splashAdTransitionPosition = SplashAdControllerKt.getSplashAdTransitionPosition(SplashAdController.this);
                OmniAdPropertyService.changePosition$default(omniAdPropertyService, splashAdTransitionPosition, SplashAdController.this.staticPositionModifier, null, 4, null);
                completeAction.mo4828invoke();
            }
        });
    }

    public final void requestExpand() {
        Either errorResult;
        if (this.expanded) {
            return;
        }
        this.expanded = true;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.touchService.setDragEnabled(false);
            currentFullscreenController = new WeakReference<>(this);
            this.omniAdContainer.getFloatingContainer().setVisibility(8);
            Intent intent = new Intent(this.activity, (Class<?>) MobileFuseSplashAdActivity.class);
            intent.setFlags(268435456);
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.activity, intent);
            errorResult = new SuccessResult(Unit.INSTANCE);
        } catch (Throwable th) {
            if (SplashAdController$requestExpand$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            onFatalException((Throwable) ((ErrorResult) errorResult).getValue());
        }
    }

    private final void onFatalException(Throwable e) {
        this.rendererFatalExceptionCallback.invoke(e);
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    protected void onAdCloseRequested() {
        Either closedPosition;
        if (this.closed) {
            return;
        }
        this.closed = true;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.touchService.setDragEnabled(false);
            if (!this.expanded) {
                closedPosition = SplashAdControllerKt.getClosedPosition(this);
                if (closedPosition instanceof ErrorResult) {
                    onAdReadyToClose();
                }
                if (closedPosition instanceof SuccessResult) {
                    this.propertyService.changePosition((Point) ((SuccessResult) closedPosition).getValue(), new AnimatedPositionModifier(this.omniAdContainer, 500L, null, 4, null), new SplashAdController$onAdCloseRequested$1$2$1(this));
                    return;
                }
                return;
            }
            Function0 function0 = this.expandedActivityCloseAction;
            if (function0 == null || ((Unit) function0.mo4828invoke()) == null) {
                onAdReadyToClose();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th) {
            int i = SplashAdController$onAdCloseRequested$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: isExpandedCloseBtnTransparent, reason: from getter */
    public final boolean getIsExpandedCloseBtnTransparent() {
        return this.isExpandedCloseBtnTransparent;
    }

    public final void setExpandedCloseBtnTransparent(boolean z) {
        this.isExpandedCloseBtnTransparent = z;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    @NotNull
    public ExtendedAdType getExtendedAdType() {
        return MraidAdRenderer.MraidExtendedAdType.SPLASH;
    }

    /* compiled from: SplashAdController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/splashad/SplashAdController$Companion;", "", "()V", "<set-?>", "Ljava/lang/ref/WeakReference;", "Lcom/mobilefuse/sdk/ad/rendering/splashad/SplashAdController;", "currentFullscreenController", "getCurrentFullscreenController$mobilefuse_sdk_mraid_release", "()Ljava/lang/ref/WeakReference;", "setCurrentFullscreenController", "(Ljava/lang/ref/WeakReference;)V", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void setCurrentFullscreenController(WeakReference<SplashAdController> weakReference) {
            SplashAdController.currentFullscreenController = weakReference;
        }

        @Nullable
        public final WeakReference<SplashAdController> getCurrentFullscreenController$mobilefuse_sdk_mraid_release() {
            return SplashAdController.currentFullscreenController;
        }
    }
}
