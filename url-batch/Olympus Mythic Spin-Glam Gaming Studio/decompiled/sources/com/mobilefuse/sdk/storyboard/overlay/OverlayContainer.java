package com.mobilefuse.sdk.storyboard.overlay;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.net.URLDecoder;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: OverlayContainer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0001.BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J%\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0002\b#J\b\u0010$\u001a\u00020\nH\u0002J\u0006\u0010%\u001a\u00020\nJ\b\u0010&\u001a\u0004\u0018\u00010\u0017J\u0006\u0010'\u001a\u00020\nJ\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020\nJ\u0006\u0010,\u001a\u00020\nJ\u0006\u0010-\u001a\u00020\nR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/overlay/OverlayContainer;", "", "ctx", "Landroid/content/Context;", "response", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "parentConfig", "Lcom/mobilefuse/sdk/AdRendererConfig;", "onStartShowing", "Lkotlin/Function0;", "", "onCompleteHiding", "admClickInfoProvider", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "(Landroid/content/Context;Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;Lcom/mobilefuse/sdk/AdRendererConfig;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;)V", "config", "getConfig$mobilefuse_sdk_core_release", "()Lcom/mobilefuse/sdk/AdRendererConfig;", "setConfig$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/AdRendererConfig;)V", "dismissTimer", "Ljava/util/Timer;", "overlayView", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayView;", "getResponse", "()Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "setResponse", "(Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;)V", "showTimer", "createAdRendererListener", "Lcom/mobilefuse/sdk/AdRendererListener;", "createTimer", "specificValue", "", "specificAction", "createTimer$mobilefuse_sdk_core_release", "createView", "dismissOverlay", "getView", "hideOverlay", "onRendered", "success", "", "removeView", "showOverlay", "showOverlayTimer", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public final class OverlayContainer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final AdmClickInfoProvider admClickInfoProvider;

    @NotNull
    private AdRendererConfig config;
    private final Context ctx;
    private Timer dismissTimer;
    private final Function0 onCompleteHiding;
    private final Function0 onStartShowing;
    private OverlayView overlayView;

    @NotNull
    private OverlayResponse response;
    private Timer showTimer;

    public OverlayContainer(@NotNull Context ctx, @NotNull OverlayResponse response, @NotNull AdRendererConfig parentConfig, @Nullable Function0 function0, @Nullable Function0 function02, @Nullable AdmClickInfoProvider admClickInfoProvider) {
        AdRendererConfig copy;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(parentConfig, "parentConfig");
        this.ctx = ctx;
        this.response = response;
        this.onStartShowing = function0;
        this.onCompleteHiding = function02;
        this.admClickInfoProvider = admClickInfoProvider;
        copy = parentConfig.copy((r37 & 1) != 0 ? parentConfig.sdkName : null, (r37 & 2) != 0 ? parentConfig.sdkVersion : null, (r37 & 4) != 0 ? parentConfig.advertisingId : null, (r37 & 8) != 0 ? parentConfig.isLimitTrackingEnabled : false, (r37 & 16) != 0 ? parentConfig.isSubjectToCoppa : false, (r37 & 32) != 0 ? parentConfig.isTestMode : false, (r37 & 64) != 0 ? parentConfig.isFullscreenAd : false, (r37 & 128) != 0 ? parentConfig.isCloseButtonEnabled : false, (r37 & 256) != 0 ? parentConfig.isThumbnailSize : false, (r37 & 512) != 0 ? parentConfig.isTransparentBackground : false, (r37 & 1024) != 0 ? parentConfig.adWidth : 0, (r37 & 2048) != 0 ? parentConfig.adHeight : 0, (r37 & 4096) != 0 ? parentConfig.deviceIp : null, (r37 & 8192) != 0 ? parentConfig.extendedAdType : null, (r37 & 16384) != 0 ? parentConfig.observableConfig : null, (r37 & 32768) != 0 ? parentConfig.adInstanceId : 0, (r37 & 65536) != 0 ? parentConfig.closeConfigResponse : null, (r37 & 131072) != 0 ? parentConfig.uiAdm : null, (r37 & 262144) != 0 ? parentConfig.adMuteStateManager : null);
        this.config = copy;
        createView();
    }

    @NotNull
    public final OverlayResponse getResponse() {
        return this.response;
    }

    public final void setResponse(@NotNull OverlayResponse overlayResponse) {
        Intrinsics.checkNotNullParameter(overlayResponse, "<set-?>");
        this.response = overlayResponse;
    }

    public /* synthetic */ OverlayContainer(Context context, OverlayResponse overlayResponse, AdRendererConfig adRendererConfig, Function0 function0, Function0 function02, AdmClickInfoProvider admClickInfoProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, overlayResponse, adRendererConfig, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function02, (i & 32) != 0 ? null : admClickInfoProvider);
    }

    @NotNull
    /* renamed from: getConfig$mobilefuse_sdk_core_release, reason: from getter */
    public final AdRendererConfig getConfig() {
        return this.config;
    }

    public final void setConfig$mobilefuse_sdk_core_release(@NotNull AdRendererConfig adRendererConfig) {
        Intrinsics.checkNotNullParameter(adRendererConfig, "<set-?>");
        this.config = adRendererConfig;
    }

    /* compiled from: OverlayContainer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¨\u0006\b"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/overlay/OverlayContainer$Companion;", "", "()V", "parseOverlay", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "jsonObject", "Lorg/json/JSONObject;", "response", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OverlayResponse parseOverlay$default(Companion companion, JSONObject jSONObject, OverlayResponse overlayResponse, int i, Object obj) {
            if ((i & 2) != 0) {
                overlayResponse = null;
            }
            return companion.parseOverlay(jSONObject, overlayResponse);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final OverlayResponse parseOverlay(@NotNull JSONObject jsonObject, @Nullable OverlayResponse response) {
            String str;
            String adm;
            Float showDelay;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                AdmMediaType type = OverlayResponse.INSTANCE.getType(jsonObject.optString("type", "mraid"));
                if (type == null) {
                    return null;
                }
                String optString = jsonObject.optString("adm");
                if (Intrinsics.areEqual(optString, "")) {
                    optString = null;
                }
                if (optString != null) {
                    adm = URLDecoder.decode(optString, "UTF-8");
                    if (adm == null) {
                    }
                    str = adm;
                    if (str == null) {
                        return null;
                    }
                    float optDouble = (float) jsonObject.optDouble("show_delay", (response == null || (showDelay = response.getShowDelay()) == null) ? 0.0d : showDelay.floatValue());
                    boolean optBoolean = jsonObject.optBoolean(POBCTAOverlayData.KEY_CTA_DISMISSIBLE, response != null ? response.getDismissible() : false);
                    Float valueOf = Float.valueOf((float) jsonObject.optDouble("dismiss_delay"));
                    if (Float.isNaN(valueOf.floatValue())) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        valueOf = response != null ? response.getDismissDelay() : null;
                    }
                    return new OverlayResponse(type, str, optBoolean, Float.valueOf(optDouble), Float.valueOf(valueOf != null ? valueOf.floatValue() : (float) 0.0d));
                }
                if (response != null) {
                    adm = response.getAdm();
                    str = adm;
                    if (str == null) {
                    }
                } else {
                    str = null;
                    if (str == null) {
                    }
                }
            } catch (Throwable th) {
                StabilityHelper.logException(this, th);
                return null;
            }
        }
    }

    private final void createView() {
        this.overlayView = new OverlayView(this.ctx, this.response, this.config, createAdRendererListener(), this.admClickInfoProvider, new OverlayContainer$createView$1(this), new Function0() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$createView$2
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
                Function0 function0;
                function0 = OverlayContainer.this.onStartShowing;
                if (function0 != null) {
                }
            }
        }, new Function0() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$createView$3
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
                Function0 function0;
                function0 = OverlayContainer.this.onCompleteHiding;
                if (function0 != null) {
                }
            }
        }, new Function1() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$createView$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                OverlayContainer.this.onRendered(z);
            }
        });
    }

    private final AdRendererListener createAdRendererListener() {
        return new AdRendererListener() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$createAdRendererListener$1
            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onFullscreenChanged(boolean isFullscreen) {
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClicked(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClosed() {
                OverlayView overlayView;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    overlayView = OverlayContainer.this.overlayView;
                    if (overlayView != null) {
                        overlayView.hideView();
                    }
                    OverlayContainer.this.overlayView = null;
                } catch (Throwable th) {
                    int i = OverlayContainer$createAdRendererListener$1$onAdClosed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onPreloadStatusChange(boolean isPreloaded) {
                OverlayView overlayView;
                try {
                    if (!isPreloaded) {
                        OverlayContainer.this.onRendered(false);
                        return;
                    }
                    OverlayContainer.this.onRendered(true);
                    overlayView = OverlayContainer.this.overlayView;
                    if (overlayView != null) {
                        overlayView.showAd();
                    }
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdImpression() {
                OverlayContainer.this.dismissOverlay();
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdRuntimeError(@NotNull RtbLossReason error) {
                Intrinsics.checkNotNullParameter(error, "error");
                DebuggingKt.logError$default(this, "Overlay error: " + error.name(), null, null, 6, null);
            }
        };
    }

    @Nullable
    /* renamed from: getView, reason: from getter */
    public final OverlayView getOverlayView() {
        return this.overlayView;
    }

    public final void showOverlayTimer() {
        Float showDelay;
        if (this.response.getShowDelay() == null || (showDelay = this.response.getShowDelay()) == null) {
            return;
        }
        this.showTimer = createTimer$mobilefuse_sdk_core_release(((long) showDelay.floatValue()) * 1000, new Function0() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$showOverlayTimer$1
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
                OverlayView overlayView;
                overlayView = OverlayContainer.this.overlayView;
                if (overlayView != null) {
                    overlayView.showView();
                }
            }
        });
    }

    public final void dismissOverlay() {
        Float dismissDelay;
        if (this.response.getDismissDelay() == null) {
            return;
        }
        Float dismissDelay2 = this.response.getDismissDelay();
        if ((dismissDelay2 == null || dismissDelay2.floatValue() > 0) && (dismissDelay = this.response.getDismissDelay()) != null) {
            this.dismissTimer = createTimer$mobilefuse_sdk_core_release(((long) dismissDelay.floatValue()) * 1000, new Function0() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$dismissOverlay$2
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
                    OverlayView overlayView;
                    overlayView = OverlayContainer.this.overlayView;
                    if (overlayView != null) {
                        overlayView.hideView();
                    }
                }
            });
        }
    }

    public final void hideOverlay() {
        OverlayView overlayView = this.overlayView;
        if (overlayView != null) {
            overlayView.hideView();
        }
    }

    public final void showOverlay() {
        OverlayView overlayView = this.overlayView;
        if (overlayView != null) {
            overlayView.showView();
        }
    }

    @VisibleForTesting
    @Nullable
    public final Timer createTimer$mobilefuse_sdk_core_release(final long specificValue, @NotNull final Function0 specificAction) {
        Intrinsics.checkNotNullParameter(specificAction, "specificAction");
        try {
            final Handler handler = Utils.getHandler();
            Intrinsics.checkNotNullExpressionValue(handler, "getHandler()");
            Timer timer = new Timer();
            timer.schedule(new TimerTask() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$createTimer$$inlined$apply$lambda$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    handler.post(new Runnable() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$createTimer$$inlined$apply$lambda$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                specificAction.mo4828invoke();
                            } catch (Throwable th) {
                                StabilityHelper.logException(OverlayContainer$createTimer$$inlined$apply$lambda$1.this, th);
                            }
                        }
                    });
                }
            }, specificValue);
            return timer;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRendered(boolean success) {
        if (success) {
            return;
        }
        DebuggingKt.logError$default(this, "There was an error rendering the overlay", null, null, 6, null);
    }

    public final void removeView() {
        OverlayView overlayView = this.overlayView;
        ViewParent parent = overlayView != null ? overlayView.getParent() : null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this.overlayView);
        }
        Timer timer = this.dismissTimer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.showTimer;
        if (timer2 != null) {
            timer2.cancel();
        }
        this.dismissTimer = null;
        this.showTimer = null;
        OverlayView overlayView2 = this.overlayView;
        if (overlayView2 != null) {
            overlayView2.destroy();
        }
    }
}
