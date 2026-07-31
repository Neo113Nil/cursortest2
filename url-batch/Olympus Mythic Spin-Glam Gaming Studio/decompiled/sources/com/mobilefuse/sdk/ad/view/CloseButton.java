package com.mobilefuse.sdk.ad.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.ironsource.C4643f8;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.PositionType;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.mraid.R;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.utils.DimConversionsKt;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MobileFuseNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CloseButton.kt */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u0011\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\u0015J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0015J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0015R0\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u00109\u001a\u00020.2\u0006\u0010#\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;\"\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\"\u0010G\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R*\u0010J\u001a\u00020.2\u0006\u0010#\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010;\"\u0004\bL\u0010=R\u0016\u0010M\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010R\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\"8\u0006X\u0086D¢\u0006\f\n\u0004\bX\u0010E\u001a\u0004\bY\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010[R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010[R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010SR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\\R\u0011\u0010^\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b]\u0010;¨\u0006_"}, d2 = {"Lcom/mobilefuse/sdk/ad/view/CloseButton;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "", "interactionSizeDp", "resId", "Lkotlin/Function0;", "", "onClosableAction", "onCloseAction", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "closeConfig", "", "uiAdm", "<init>", "(Landroid/content/Context;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/mobilefuse/sdk/CloseConfigResponse;Ljava/lang/String;)V", "com/mobilefuse/sdk/ad/view/CloseButton$createWebView$1", "createWebView", "()Lcom/mobilefuse/sdk/ad/view/CloseButton$createWebView$1;", "onWebViewRenderGone", "()V", POBConstants.KEY_JS, "callJsBridgeCmd", "(Ljava/lang/String;)V", "clearDelayedTasks", "doShow", "addWebView", "applyThumbnailMode", "destroyWebView", "applyOffset", "Landroid/widget/RelativeLayout$LayoutParams;", "createCloseConfigLayoutParams", "()Landroid/widget/RelativeLayout$LayoutParams;", "", "value", "updateThumbnailModeDims", "(F)I", "", "delayMillis", "showWithDelay", "(J)V", "show", "hide", "destroy", "Lkotlin/Function1;", "", "onVisibilityChange", "Lkotlin/jvm/functions/Function1;", "getOnVisibilityChange", "()Lkotlin/jvm/functions/Function1;", "setOnVisibilityChange", "(Lkotlin/jvm/functions/Function1;)V", "interactionSizePx", "I", "getInteractionSizePx", "()I", "isTransparent", "Z", "()Z", "setTransparent", "(Z)V", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Landroid/view/View;", "closeZone", "Landroid/view/View;", "closeBtnDelaySeconds", "F", "closeBtnDelaySecondsLeft", "countdownMode", "getCountdownMode", "setCountdownMode", "thumbnailMode", "getThumbnailMode", "setThumbnailMode", "closeZoneActivationRequestTimestamp", "J", "Ljava/lang/Runnable;", "activateCloseZoneTask", "Ljava/lang/Runnable;", "closeConfigPx", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "getCloseConfigPx", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "setCloseConfigPx", "(Lcom/mobilefuse/sdk/CloseConfigResponse;)V", "DEFAULT_TRANSLATION", "getDEFAULT_TRANSLATION", "()F", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", C4643f8.k, VastAttributes.VISIBLE, "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class CloseButton extends RelativeLayout {
    private final float DEFAULT_TRANSLATION;
    private final Runnable activateCloseZoneTask;
    private float closeBtnDelaySeconds;
    private float closeBtnDelaySecondsLeft;
    private final CloseConfigResponse closeConfig;

    @Nullable
    private CloseConfigResponse closeConfigPx;
    private View closeZone;
    private long closeZoneActivationRequestTimestamp;
    private boolean countdownMode;
    private final int interactionSizeDp;
    private final int interactionSizePx;
    private boolean isTransparent;
    private final Function0 onClosableAction;
    private final Function0 onCloseAction;

    @Nullable
    private Function1 onVisibilityChange;
    private boolean thumbnailMode;
    private final String uiAdm;
    private WebView webView;

    public CloseButton(@NotNull Context context, int i, int i2, @NotNull Function0 function0, @NotNull Function0 function02) {
        this(context, i, i2, function0, function02, null, null, 96, null);
    }

    public CloseButton(@NotNull Context context, int i, int i2, @NotNull Function0 function0, @NotNull Function0 function02, @Nullable CloseConfigResponse closeConfigResponse) {
        this(context, i, i2, function0, function02, closeConfigResponse, null, 64, null);
    }

    public CloseButton(@NotNull Context context, int i, @NotNull Function0 function0, @NotNull Function0 function02) {
        this(context, i, 0, function0, function02, null, null, 100, null);
    }

    public CloseButton(@NotNull Context context, @NotNull Function0 function0, @NotNull Function0 function02) {
        this(context, 0, 0, function0, function02, null, null, 102, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.E, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbnailMode() {
        int i;
        Integer num;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            callJsBridgeCmd("setThumbnailMode(" + this.thumbnailMode + ");");
            View view = this.closeZone;
            if (view != null) {
                CloseConfigResponse closeConfigResponse = this.closeConfigPx;
                Integer valueOf = closeConfigResponse != null ? Integer.valueOf((int) closeConfigResponse.getWidth()) : null;
                CloseConfigResponse closeConfigResponse2 = this.closeConfigPx;
                Integer valueOf2 = closeConfigResponse2 != null ? Integer.valueOf((int) closeConfigResponse2.getHeight()) : null;
                if (this.thumbnailMode) {
                    CloseConfigResponse closeConfigResponse3 = this.closeConfig;
                    valueOf = closeConfigResponse3 != null ? Integer.valueOf(updateThumbnailModeDims(closeConfigResponse3.getWidth())) : null;
                    CloseConfigResponse closeConfigResponse4 = this.closeConfig;
                    num = closeConfigResponse4 != null ? Integer.valueOf(updateThumbnailModeDims(closeConfigResponse4.getHeight())) : null;
                    i = updateThumbnailModeDims(this.interactionSizeDp);
                } else {
                    Integer num2 = valueOf2;
                    i = this.interactionSizePx;
                    num = num2;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                view.getLayoutParams().width = valueOf != null ? valueOf.intValue() : i;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (num != null) {
                    i = num.intValue();
                }
                layoutParams2.height = i;
                view.setLayoutParams(layoutParams);
            }
        } catch (Throwable th) {
            int i2 = CloseButton$applyThumbnailMode$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i2 == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void clearDelayedTasks() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.closeZoneActivationRequestTimestamp = 0L;
            SchedulersKt.getGlobalHandler().removeCallbacks(this.activateCloseZoneTask);
        } catch (Throwable th) {
            int i = CloseButton$clearDelayedTasks$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void destroyWebView() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
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
                webView.destroy();
            }
            this.webView = null;
        } catch (Throwable th) {
            int i = CloseButton$destroyWebView$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void doShow() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            clearDelayedTasks();
            this.closeZoneActivationRequestTimestamp = System.currentTimeMillis();
            addWebView();
            setVisibility(0);
            Function1 function1 = this.onVisibilityChange;
            if (function1 != null) {
            }
        } catch (Throwable th) {
            int i = CloseButton$doShow$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWebViewRenderGone() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            destroyWebView();
            if (getVisibility() != 0) {
                return;
            }
            this.closeBtnDelaySecondsLeft = (float) Math.rint(Math.max(0.0f, this.closeBtnDelaySeconds - ((System.currentTimeMillis() - this.closeZoneActivationRequestTimestamp) / 1000.0f)));
            addWebView();
        } catch (Throwable th) {
            int i = CloseButton$onWebViewRenderGone$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void destroy() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            destroyWebView();
        } catch (Throwable th) {
            int i = CloseButton$destroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void hide() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            clearDelayedTasks();
            setVisibility(4);
            Function1 function1 = this.onVisibilityChange;
            if (function1 != null) {
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
            }
        } catch (Throwable th) {
            int i = CloseButton$hide$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setTransparent(boolean z) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.isTransparent = z;
            if (z) {
                WebView webView = this.webView;
                if (webView != null) {
                    webView.setVisibility(8);
                }
            } else {
                WebView webView2 = this.webView;
                if (webView2 != null) {
                    webView2.setVisibility(0);
                }
            }
        } catch (Throwable th) {
            int i = CloseButton$isTransparent$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void show() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.closeBtnDelaySeconds = 0.0f;
            this.closeBtnDelaySecondsLeft = 0.0f;
            doShow();
            this.activateCloseZoneTask.run();
        } catch (Throwable th) {
            int i = CloseButton$show$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void showWithDelay(long delayMillis) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        float f = delayMillis / 1000.0f;
        try {
            this.closeBtnDelaySeconds = f;
            this.closeBtnDelaySecondsLeft = f;
            doShow();
            SchedulersKt.getGlobalHandler().postDelayed(this.activateCloseZoneTask, delayMillis);
        } catch (Throwable th) {
            int i = CloseButton$showWithDelay$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public /* synthetic */ CloseButton(Context context, int i, int i2, Function0 function0, Function0 function02, CloseConfigResponse closeConfigResponse, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? 60 : i, (i3 & 4) != 0 ? R.id.closeBtn : i2, function0, function02, (i3 & 32) != 0 ? null : closeConfigResponse, (i3 & 64) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseButton(@NotNull Context context, int i, int i2, @NotNull Function0 onClosableAction, @NotNull Function0 onCloseAction, @Nullable CloseConfigResponse closeConfigResponse, @Nullable String str) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClosableAction, "onClosableAction");
        Intrinsics.checkNotNullParameter(onCloseAction, "onCloseAction");
        this.interactionSizeDp = i;
        this.onClosableAction = onClosableAction;
        this.onCloseAction = onCloseAction;
        this.closeConfig = closeConfigResponse;
        this.uiAdm = str;
        this.isTransparent = true;
        this.countdownMode = true;
        this.activateCloseZoneTask = new Runnable() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$activateCloseZoneTask$1
            @Override // java.lang.Runnable
            public final void run() {
                Function0 function0;
                View view;
                function0 = CloseButton.this.onClosableAction;
                function0.mo4828invoke();
                view = CloseButton.this.closeZone;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$activateCloseZoneTask$1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Function0 function02;
                            function02 = CloseButton.this.onCloseAction;
                            function02.mo4828invoke();
                        }
                    });
                }
            }
        };
        this.DEFAULT_TRANSLATION = 5.0f;
        setId(i2);
        setVisibility(8);
        this.closeConfigPx = closeConfigResponse != null ? CloseConfigResponse.copy$default(closeConfigResponse, null, DimConversionsKt.dpToPx(closeConfigResponse.getWidth(), context), DimConversionsKt.dpToPx(closeConfigResponse.getHeight(), context), null, null, 25, null) : null;
        int dpToPx = DimConversionsKt.dpToPx(i, context);
        this.interactionSizePx = dpToPx;
        if (closeConfigResponse != null && this.closeConfigPx != null) {
            layoutParams = createCloseConfigLayoutParams();
        } else {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        View view = new View(context);
        addView(view, layoutParams);
        Unit unit = Unit.INSTANCE;
        this.closeZone = view;
        applyOffset();
    }

    @Nullable
    public final Function1 getOnVisibilityChange() {
        return this.onVisibilityChange;
    }

    public final void setOnVisibilityChange(@Nullable Function1 function1) {
        this.onVisibilityChange = function1;
    }

    public final int getInteractionSizePx() {
        return this.interactionSizePx;
    }

    /* renamed from: isTransparent, reason: from getter */
    public final boolean getIsTransparent() {
        return this.isTransparent;
    }

    public final boolean getCountdownMode() {
        return this.countdownMode;
    }

    public final void setCountdownMode(boolean z) {
        this.countdownMode = z;
    }

    public final boolean getThumbnailMode() {
        return this.thumbnailMode;
    }

    public final void setThumbnailMode(boolean z) {
        this.thumbnailMode = z;
        applyThumbnailMode();
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigPx() {
        return this.closeConfigPx;
    }

    public final void setCloseConfigPx(@Nullable CloseConfigResponse closeConfigResponse) {
        this.closeConfigPx = closeConfigResponse;
    }

    public final float getDEFAULT_TRANSLATION() {
        return this.DEFAULT_TRANSLATION;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.webkit.WebView, com.mobilefuse.sdk.ad.view.CloseButton$createWebView$1] */
    @SuppressLint({"SetJavaScriptEnabled"})
    private final CloseButton$createWebView$1 createWebView() {
        final Context context = getContext();
        final ?? r6 = new WebView(context) { // from class: com.mobilefuse.sdk.ad.view.CloseButton$createWebView$1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/ad/view/CloseButton$createWebView$1;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
                DetectTouchUtils.viewOnTouch(h.E, this, ev);
                return safedk_CloseButton$createWebView$1_dispatchTouchEvent_dd2ce1fc92a96066ce8667d54ae60083(ev);
            }

            @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }

            public boolean safedk_CloseButton$createWebView$1_dispatchTouchEvent_dd2ce1fc92a96066ce8667d54ae60083(MotionEvent p0) {
                return false;
            }
        };
        WebSettings settings = r6.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "settings");
        settings.setJavaScriptEnabled(true);
        WebSettings settings2 = r6.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "settings");
        settings2.setAllowContentAccess(true);
        WebSettings settings3 = r6.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings3, "settings");
        settings3.setAllowFileAccess(true);
        WebSettings settings4 = r6.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings4, "settings");
        settings4.setAllowFileAccessFromFileURLs(false);
        WebSettings settings5 = r6.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings5, "settings");
        settings5.setAllowUniversalAccessFromFileURLs(false);
        r6.setBackgroundColor(Color.argb(0, 255, 255, 255));
        r6.setLayerType(2, null);
        String str = this.uiAdm;
        if (str != null) {
            MobileFuseNetworkBridge.webviewLoadDataWithBaseURL(r6, "file:///android_asset/mobilefuse/", str, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        } else {
            final Flow<String> specificAssetAbsolutePathFlow = MobileFuseAssetManager.INSTANCE.getSpecificAssetAbsolutePathFlow("mraid_controls.html");
            final Schedulers schedulers = Schedulers.MAIN;
            FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$$special$$inlined$runOn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FlowCollector<? super String>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull final FlowCollector<? super String> flow) {
                    Intrinsics.checkNotNullParameter(flow, "$this$flow");
                    Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$$special$$inlined$runOn$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitSuccess(T t) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            final FlowCollector flowCollector = flow;
                            SchedulersKt.runOnScheduler(schedulers, new Function0() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$$special$.inlined.runOn.1.1.1
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
                                    FlowCollector.this.emit(value);
                                }
                            });
                        }
                    });
                }
            }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$$special$$inlined$collectResult$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitError(@NotNull Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    FlowCollector.DefaultImpls.emitError(this, error);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitSuccess(T t) {
                    FlowCollector.DefaultImpls.emitSuccess(this, t);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        String str2 = (String) ((SuccessResult) result).getValue();
                        if (str2 != null) {
                            MobileFuseNetworkBridge.webviewLoadUrl(CloseButton$createWebView$1.this, str2);
                        } else {
                            DebuggingKt.logError$default(CloseButton$createWebView$1.this, "Can´t load asset file. getSpecificAssetAbsolutePath returned null", null, null, 6, null);
                        }
                    }
                }
            });
        }
        r6.setWebViewClient(new WebViewClient() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$createWebView$$inlined$apply$lambda$1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(@Nullable WebView view, @NotNull String url) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/ad/view/CloseButton$createWebView$$inlined$apply$lambda$1;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
                CreativeInfoManager.onResourceLoaded(h.E, view, url);
                safedk_CloseButton$createWebView$$inlined$apply$lambda$1_onLoadResource_04dfec7c02f81fdca44ff257beed6d15(view, url);
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

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders(h.E, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.E, view, url, shouldOverrideUrlLoading);
                return shouldOverrideUrlLoading;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(@NotNull WebView view, @NotNull String url) {
                float f;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    CloseButton.this.callJsBridgeCmd("setCountdownMode(" + CloseButton.this.getCountdownMode() + ");");
                    CloseButton.this.applyThumbnailMode();
                    CloseButton closeButton = CloseButton.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("show(");
                    f = CloseButton.this.closeBtnDelaySecondsLeft;
                    sb.append(f);
                    sb.append(");");
                    closeButton.callJsBridgeCmd(sb.toString());
                } catch (Throwable th) {
                    int i = CloseButton$createWebView$2$3$onPageFinished$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                super.onPageFinished(view, url);
            }

            public void safedk_CloseButton$createWebView$$inlined$apply$lambda$1_onLoadResource_04dfec7c02f81fdca44ff257beed6d15(WebView p0, String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    HttpRequestTracker.logHttpRequest(url);
                } catch (Throwable th) {
                    int i = CloseButton$createWebView$2$3$onLoadResource$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                super.onLoadResource(p0, url);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
                DebuggingKt.logDebug(this, "WebView Render Process has gone. Add a new web view.", "Close Button");
                CloseButton.this.onWebViewRenderGone();
                return true;
            }
        });
        return r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ObsoleteSdkInt"})
    public final void callJsBridgeCmd(final String js) {
        if (this.webView == null) {
            return;
        }
        SchedulersKt.getGlobalHandler().post(new Runnable() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$callJsBridgeCmd$1
            @Override // java.lang.Runnable
            public final void run() {
                WebView webView;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    String str = "closeButton." + js;
                    webView = CloseButton.this.webView;
                    if (webView != null) {
                        webView.evaluateJavascript(str, null);
                    }
                } catch (Throwable th) {
                    int i = CloseButton$callJsBridgeCmd$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        });
    }

    private final void addWebView() {
        ViewGroup.LayoutParams layoutParams;
        if (this.closeConfigPx == null || (layoutParams = createCloseConfigLayoutParams()) == null) {
            int i = this.interactionSizePx;
            layoutParams = new ViewGroup.LayoutParams(i, i);
        }
        CloseButton$createWebView$1 createWebView = createWebView();
        this.webView = createWebView;
        createWebView.setVisibility(this.isTransparent ? 8 : 0);
        addView(createWebView, layoutParams);
    }

    public final boolean isVisible() {
        return getVisibility() == 0;
    }

    private final void applyOffset() {
        float f = this.DEFAULT_TRANSLATION;
        int i = -1;
        float f2 = (-1) * f;
        CloseConfigResponse closeConfigResponse = this.closeConfig;
        if (closeConfigResponse != null) {
            int i2 = (closeConfigResponse.getPos() == PositionType.tr || closeConfigResponse.getPos() == PositionType.br) ? -1 : 1;
            if (closeConfigResponse.getPos() != PositionType.bl && closeConfigResponse.getPos() != PositionType.br) {
                i = 1;
            }
            Float xOffset = closeConfigResponse.getXOffset();
            f2 = (xOffset != null ? xOffset.floatValue() : this.DEFAULT_TRANSLATION) * i2;
            Float yOffset = closeConfigResponse.getYOffset();
            f = (yOffset != null ? yOffset.floatValue() : this.DEFAULT_TRANSLATION) * i;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setTranslationX(DimConversionsKt.dpToPx(f2, context));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        setTranslationY(DimConversionsKt.dpToPx(f, context2));
    }

    private final RelativeLayout.LayoutParams createCloseConfigLayoutParams() {
        CloseConfigResponse closeConfigResponse = this.closeConfigPx;
        int width = closeConfigResponse != null ? (int) closeConfigResponse.getWidth() : 50;
        CloseConfigResponse closeConfigResponse2 = this.closeConfigPx;
        return new RelativeLayout.LayoutParams(width, closeConfigResponse2 != null ? (int) closeConfigResponse2.getHeight() : 50);
    }

    private final int updateThumbnailModeDims(float value) {
        float f = value - 10;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return DimConversionsKt.dpToPx(f, context);
    }
}
