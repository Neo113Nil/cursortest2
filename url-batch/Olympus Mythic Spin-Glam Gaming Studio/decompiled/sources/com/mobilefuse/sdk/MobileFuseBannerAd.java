package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.MobileFuseBannerAd;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.internal.AdRefresher;
import com.mobilefuse.sdk.internal.Callback;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.internal.mute.MutableAd;
import com.mobilefuse.sdk.internal.mute.MutableAdController;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import com.mobilefuse.sdk.telemetry.TelemetryAction;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetrySdkTypesKt;
import com.mobilefuse.sdk.utils.PlacementUtil;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.impl.M2;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseBannerAd.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002|}B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010L\u001a\u00020MH\u0002J\u0006\u0010N\u001a\u00020MJE\u0010O\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020H2\u0006\u0010\u001e\u001a\u00020\u001aH\u0001¢\u0006\u0002\bRJ\u001c\u0010S\u001a\u0016\u0012\u0004\u0012\u00020U\u0012\u0006\u0012\u0004\u0018\u00010H\u0012\u0004\u0012\u00020M0TH\u0002J\b\u0010V\u001a\u00020\u001aH\u0002J\u0006\u0010W\u001a\u00020MJ\b\u0010X\u001a\u00020MH\u0002J\b\u0010Y\u001a\u00020MH\u0002J\b\u0010Z\u001a\u00020MH\u0002J\u0006\u0010[\u001a\u00020MJ\r\u0010\\\u001a\u0004\u0018\u000101¢\u0006\u0002\u00103J\n\u0010]\u001a\u0004\u0018\u00010^H\u0016J\u0010\u0010_\u001a\u00020M2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010`\u001a\u00020\u0013H\u0002J\u0006\u00106\u001a\u00020\u0013J\u0006\u00108\u001a\u00020\u0013J\u0006\u0010:\u001a\u00020\u0013J\b\u0010a\u001a\u00020\u0013H\u0016J\u0006\u0010<\u001a\u00020\u0013J\u0006\u0010b\u001a\u00020MJ\u000e\u0010c\u001a\u00020M2\u0006\u0010d\u001a\u00020\u000eJ\u0010\u0010e\u001a\u00020M2\u0006\u0010d\u001a\u00020\u000eH\u0002J\b\u0010f\u001a\u00020MH\u0002J\b\u0010g\u001a\u00020MH\u0014J\b\u0010h\u001a\u00020MH\u0014J\b\u0010i\u001a\u00020MH\u0002J\u0010\u0010j\u001a\u00020M2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010k\u001a\u00020MH\u0002J\u000e\u0010l\u001a\u00020M2\u0006\u0010m\u001a\u00020\u000bJ\u0012\u0010n\u001a\u00020M2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\u000e\u0010q\u001a\u00020M2\u0006\u00100\u001a\u000201J\u0010\u0010r\u001a\u00020M2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010s\u001a\u00020M2\u0006\u0010t\u001a\u00020\u0013H\u0016J\u000e\u0010u\u001a\u00020M2\u0006\u0010*\u001a\u00020\u0013J\u0006\u0010v\u001a\u00020MJ\b\u0010w\u001a\u00020MH\u0002J\b\u0010x\u001a\u00020MH\u0002J\b\u0010y\u001a\u00020MH\u0002J\u0010\u0010z\u001a\u00020\u00132\u0006\u0010{\u001a\u00020\u0013H\u0002R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u0001018G¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00106\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b7\u0010-R\u0011\u00108\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b9\u0010-R\u0011\u0010:\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b;\u0010-R$\u0010<\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010-\"\u0004\b>\u0010/R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010B\u001a\u0004\u0018\u00010A2\b\u0010*\u001a\u0004\u0018\u00010A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006~"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseBannerAd;", "Landroid/widget/FrameLayout;", "Lcom/mobilefuse/sdk/WinningBidInfoSource;", "Lcom/mobilefuse/sdk/internal/mute/MutableAd;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "placementId", "", "adSize", "Lcom/mobilefuse/sdk/MobileFuseBannerAd$AdSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/mobilefuse/sdk/MobileFuseBannerAd$AdSize;)V", "activityInBackground", "", "activityLifecycleObserver", "Lcom/mobilefuse/sdk/AppLifecycleHelper$ActivityLifecycleObserver;", "adBackgroundColor", "adController", "Lcom/mobilefuse/sdk/AdController;", "adControllerListener", "Lcom/mobilefuse/sdk/AdController$AdListener;", "adExpanded", "adInstanceInfo", "Lcom/mobilefuse/sdk/AdInstanceInfo;", "adListener", "Lcom/mobilefuse/sdk/MobileFuseBannerAd$Listener;", "adMuteStateManager", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;", "adRefreshedController", "adRefreshedControllerListener", "adRefresher", "Lcom/mobilefuse/sdk/internal/AdRefresher;", "adType", "Lcom/mobilefuse/sdk/AdController$AdType;", "attachedToWindow", "attributeSet", "value", "autorefreshEnabled", "getAutorefreshEnabled", "()Z", "setAutorefreshEnabled", "(Z)V", "bidFloor", "", "_getBidFloor", "()Ljava/lang/Float;", "destroyed", "inlineContainer", "isDestroyed", "_isDestroyed", "isLoaded", "_isLoaded", "isLoading", "_isLoading", "isTestMode", "_isTestMode", "_setTestMode", "mutableAdController", "Lcom/mobilefuse/sdk/internal/mute/MutableAdController;", "Lcom/mobilefuse/sdk/MuteChangedListener;", "muteChangedListener", "getMuteChangedListener", "()Lcom/mobilefuse/sdk/MuteChangedListener;", "setMuteChangedListener", "(Lcom/mobilefuse/sdk/MuteChangedListener;)V", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "renderingActivity", "Landroid/app/Activity;", "requestedOneTimeAdRefresh", "applyCurrentBackgroundColor", "", "clearBidFloor", "createAdController", "adWidth", "adHeight", "createAdController$mobilefuse_sdk_core_release", "createAdErrorCallback", "Lkotlin/Function2;", "Lcom/mobilefuse/sdk/AdError;", "createListener", "destroy", "destroyAdRefreshedController", "destroyInternal", "detectTestModeFromPlacementId", "forceRefresh", "getBidFloor", "getWinningBidInfo", "Lcom/mobilefuse/sdk/WinningBidInfo;", "init", "isAdRefresherEnabled", "isMuted", "loadAd", "loadAdFromBiddingToken", "bidResponse", "loadAdFromBiddingTokenInternal", "loadAdInternal", "onAttachedToWindow", "onDetachedFromWindow", "onRefreshAdLoadFailed", "parseViewAttrs", "requestAdRefresh", "setAutorefreshInterval", "seconds", "setBackground", M2.g, "Landroid/graphics/drawable/Drawable;", "setBidFloor", "setListener", "setMuted", "muted", "setTestMode", "setup", h.aj, "startActivityLifecycleChecking", "stopActivityLifecycleChecking", "tryToRotateAd", "force", "AdSize", "Listener", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class MobileFuseBannerAd extends FrameLayout implements WinningBidInfoSource, MutableAd {
    private boolean activityInBackground;
    private AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver;
    private int adBackgroundColor;
    private AdController adController;
    private AdController.AdListener adControllerListener;
    private boolean adExpanded;
    private AdInstanceInfo adInstanceInfo;
    private Listener adListener;
    private final AdMuteStateManager adMuteStateManager;
    private AdController adRefreshedController;
    private AdController.AdListener adRefreshedControllerListener;
    private AdRefresher adRefresher;
    private AdSize adSize;
    private final AdController.AdType adType;
    private boolean attachedToWindow;
    private AttributeSet attributeSet;
    private int defStyleAttr;
    private boolean destroyed;
    private FrameLayout inlineContainer;
    private MutableAdController mutableAdController;
    private ObservableConfig observableConfig;
    private String placementId;
    private Activity renderingActivity;
    private boolean requestedOneTimeAdRefresh;

    /* compiled from: MobileFuseBannerAd.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseBannerAd$Listener;", "Lcom/mobilefuse/sdk/BaseAdListener;", "onAdCollapsed", "", "onAdExpanded", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public interface Listener extends BaseAdListener {
        void onAdCollapsed() throws Throwable;

        void onAdExpanded() throws Throwable;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes5.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdController.AdState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AdController.AdState.NOT_FILLED.ordinal()] = 1;
            iArr[AdController.AdState.RENDERED.ordinal()] = 2;
            iArr[AdController.AdState.IDLE.ordinal()] = 3;
            iArr[AdController.AdState.LOADING.ordinal()] = 4;
            iArr[AdController.AdState.LOADED.ordinal()] = 5;
            iArr[AdController.AdState.CLOSED.ordinal()] = 6;
            iArr[AdController.AdState.RTB_EXPIRED.ordinal()] = 7;
            iArr[AdController.AdState.DESTROYED.ordinal()] = 8;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.E, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destroyInternal() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceAction$default(TelemetryActionSdkEvents.AD_INSTANCE_DESTROYED, adInstanceInfo, null, 4, null));
            try {
                AdController adController = this.adController;
                if (adController != null) {
                    adController.destroy();
                }
                this.adController = null;
                AdRefresher adRefresher = this.adRefresher;
                if (adRefresher != null) {
                    adRefresher.reset();
                }
                destroyAdRefreshedController();
                stopActivityLifecycleChecking();
                this.adListener = null;
                MutableAdController mutableAdController = this.mutableAdController;
                if (mutableAdController != null) {
                    mutableAdController.removeObserver();
                }
            } catch (Throwable th) {
                int i = MobileFuseBannerAd$$special$$inlined$handleExceptions$2$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } catch (Throwable th2) {
            int i2 = MobileFuseBannerAd$destroyInternal$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i2 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAdFromBiddingTokenInternal(String bidResponse) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdController adController = this.adController;
            if (adController == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(TelemetrySdkTypesKt.createParamBidResponseToken(bidResponse));
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_BIDDING_LOAD_REQUESTED, adInstanceInfo, arrayList));
            adController.loadAdFromBiddingToken(bidResponse);
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$loadAdFromBiddingTokenInternal$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAdInternal() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdController adController = this.adController;
            if (adController == null) {
                return;
            }
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceLoadAdAction(adInstanceInfo));
            adController.loadAd();
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$loadAdInternal$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void parseViewAttrs(AttributeSet attrs) throws Throwable {
        AdSize adSize;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.com_mobilefuse_sdk_BannerAd, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl…efuse_sdk_BannerAd, 0, 0)");
            try {
                String it = obtainStyledAttributes.getString(R.styleable.com_mobilefuse_sdk_BannerAd_mobilefusePlacementId);
                if (it != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    this.placementId = it;
                    this.adInstanceInfo.setPlacementId(it);
                }
                int i = obtainStyledAttributes.getInt(R.styleable.com_mobilefuse_sdk_BannerAd_mobilefuseAdSize, 1);
                if (i == 1) {
                    adSize = AdSize.BANNER_320x50;
                } else if (i == 2) {
                    adSize = AdSize.BANNER_300x50;
                } else if (i == 3) {
                    adSize = AdSize.BANNER_300x250;
                } else if (i == 4) {
                    adSize = AdSize.BANNER_728x90;
                } else {
                    adSize = AdSize.BANNER_320x50;
                }
                this.adSize = adSize;
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            int i2 = MobileFuseBannerAd$parseViewAttrs$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i2 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAd() throws Throwable {
        AdController adController;
        View showInlineAd;
        FrameLayout frameLayout;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdController adController2 = this.adController;
            boolean z = (adController2 != null ? adController2.adState : null) == AdController.AdState.LOADED;
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createShowAdAction(z, adInstanceInfo));
            if (z && (adController = this.adController) != null && (showInlineAd = adController.showInlineAd()) != null) {
                if (showInlineAd.getParent() == null && (frameLayout = this.inlineContainer) != null) {
                    frameLayout.addView(showInlineAd, new FrameLayout.LayoutParams(-1, -1));
                }
                if (isAdRefresherEnabled()) {
                    requestAdRefresh();
                    AdRefresher adRefresher = this.adRefresher;
                    if (adRefresher != null) {
                        adRefresher.reset();
                        adRefresher.start();
                    }
                }
            }
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$showAd$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final /* synthetic */ void _setTestMode(boolean z) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PlacementUtil.setTestMode(this.observableConfig, z);
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceSetTestModeAction(z, adInstanceInfo));
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$isTestMode$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void clearBidFloor() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PlacementUtil.clearBidFloor(this.observableConfig);
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$clearBidFloor$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void forceRefresh() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdController adController = this.adController;
            if (adController == null) {
                return;
            }
            AdController.AdState adState = adController != null ? adController.adState : null;
            if (adState == AdController.AdState.RENDERED || adState == AdController.AdState.CLOSED) {
                if (adController == null || !adController.getLoadedFromBiddingToken()) {
                    this.requestedOneTimeAdRefresh = true;
                    AdRefresher adRefresher = this.adRefresher;
                    if (adRefresher != null) {
                        adRefresher.reset();
                    }
                    if (tryToRotateAd(true)) {
                        return;
                    }
                    requestAdRefresh();
                }
            }
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$forceRefresh$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AdController adController;
        View findViewById;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$onAttachedToWindow$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (this.adController == null) {
            return;
        }
        this.attachedToWindow = true;
        if (Utils.isAttachedToWindow(this)) {
            this.renderingActivity = null;
            try {
                Context context = getContext();
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity == null) {
                    View rootView = getRootView();
                    activity = (rootView == null || (findViewById = rootView.findViewById(android.R.id.content)) == null) ? null : Utils.getActivityForView(findViewById);
                }
                if (activity == null) {
                    activity = AppLifecycleHelper.getCurrentActivity();
                }
                this.renderingActivity = activity;
                if (activity != null && (adController = this.adController) != null) {
                    adController.setRenderingActivity(activity);
                }
            } catch (Throwable th2) {
                int i2 = MobileFuseBannerAd$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i2 == 1) {
                    StabilityHelper.logException("[Automatically caught]", th2);
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        AdController adController2 = this.adController;
        if (adController2 != null) {
            if ((adController2.adState == AdController.AdState.LOADED ? adController2 : null) != null) {
                showAd();
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.adController == null) {
                return;
            }
            this.attachedToWindow = false;
            super.onDetachedFromWindow();
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$onDetachedFromWindow$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setBidFloor(float bidFloor) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PlacementUtil.setBidFloor(this.observableConfig, Float.valueOf(bidFloor));
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$setBidFloor$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final /* synthetic */ Float _getBidFloor() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return PlacementUtil.getBidFloor(this.observableConfig);
        } catch (Throwable th) {
            if (MobileFuseBannerAd$bidFloor$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return null;
        }
    }

    public final /* synthetic */ boolean _isTestMode() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return PlacementUtil.isTestMode(this.observableConfig);
        } catch (Throwable th) {
            if (MobileFuseBannerAd$isTestMode$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseBannerAd(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AdController.AdType adType = AdController.AdType.BANNER;
        this.adType = adType;
        this.adBackgroundColor = -1;
        this.observableConfig = new ObservableConfig();
        this.adInstanceInfo = new AdInstanceInfo(this, adType.getValue(), "");
        this.adMuteStateManager = new AdMuteStateManager();
        this.placementId = "";
        this.adSize = AdSize.BANNER_320x50;
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseBannerAd(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        AdController.AdType adType = AdController.AdType.BANNER;
        this.adType = adType;
        this.adBackgroundColor = -1;
        this.observableConfig = new ObservableConfig();
        this.adInstanceInfo = new AdInstanceInfo(this, adType.getValue(), "");
        this.adMuteStateManager = new AdMuteStateManager();
        this.placementId = "";
        this.adSize = AdSize.BANNER_320x50;
        this.attributeSet = attributeSet;
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseBannerAd(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        AdController.AdType adType = AdController.AdType.BANNER;
        this.adType = adType;
        this.adBackgroundColor = -1;
        this.observableConfig = new ObservableConfig();
        this.adInstanceInfo = new AdInstanceInfo(this, adType.getValue(), "");
        this.adMuteStateManager = new AdMuteStateManager();
        this.placementId = "";
        this.adSize = AdSize.BANNER_320x50;
        this.attributeSet = attributeSet;
        this.defStyleAttr = i;
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseBannerAd(@NotNull Context context, @NotNull String placementId, @NotNull AdSize adSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        AdController.AdType adType = AdController.AdType.BANNER;
        this.adType = adType;
        this.adBackgroundColor = -1;
        this.observableConfig = new ObservableConfig();
        this.adInstanceInfo = new AdInstanceInfo(this, adType.getValue(), "");
        this.adMuteStateManager = new AdMuteStateManager();
        this.placementId = "";
        AdSize adSize2 = AdSize.BANNER_320x50;
        this.placementId = placementId;
        this.adSize = adSize;
        init(context);
    }

    private final void init(Context context) {
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices();
        this.adInstanceInfo.setPlacementId(this.placementId);
        this.mutableAdController = new MutableAdController(this.observableConfig, this.adInstanceInfo, this.adMuteStateManager);
        AttributeSet attributeSet = this.attributeSet;
        if (attributeSet != null) {
            parseViewAttrs(attributeSet);
        }
        this.adInstanceInfo.adSize = this.adSize.name();
        AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
        adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceCreatedAction$default(adInstanceInfo, null, 2, null));
        startActivityLifecycleChecking();
        this.adRefresher = new AdRefresher(context, 30L, new AdRefresher.Listener() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$init$4
            @Override // com.mobilefuse.sdk.internal.AdRefresher.Listener
            public final void onAdRefresh() {
                AdController adController;
                DebuggingKt.logDebug$default(MobileFuseBannerAd.this, "[Banner AdRefresher] onAdRefresh", null, 2, null);
                adController = MobileFuseBannerAd.this.adRefreshedController;
                if (adController == null) {
                    MobileFuseBannerAd.this.requestAdRefresh();
                }
                MobileFuseBannerAd.this.tryToRotateAd(false);
            }
        });
        ObservableConfig observableConfig = this.observableConfig;
        ObservableConfigKey observableConfigKey = ObservableConfigKey.ENDCARD_CLOSABLE;
        Boolean bool = Boolean.FALSE;
        observableConfig.setValue(observableConfigKey, bool);
        this.observableConfig.setValue(ObservableConfigKey.AD_INSTANCE_INFO, this.adInstanceInfo);
        this.observableConfig.setValue(ObservableConfigKey.VIDEO_CACHE_ENABLED, bool);
        MutableAdController mutableAdController = this.mutableAdController;
        if (mutableAdController != null) {
            mutableAdController.init();
        }
        this.observableConfig.setValue(ObservableConfigKey.AD_ERROR_CALLBACK, createAdErrorCallback());
        detectTestModeFromPlacementId();
        AdController.AdListener createListener = createListener();
        this.adControllerListener = createListener;
        if (createListener != null) {
            this.adController = createAdController$mobilefuse_sdk_core_release(context, this.placementId, this.adInstanceInfo, this.adSize.getWidth(), this.adSize.getHeight(), this.observableConfig, createListener);
        }
        setup();
    }

    public final void setup() throws Throwable {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        if (this.adSize.getWidth() > 1 && this.adSize.getHeight() > 1) {
            final int convertDpToPx = Utils.convertDpToPx(getContext(), this.adSize.getWidth());
            final int convertDpToPx2 = Utils.convertDpToPx(getContext(), this.adSize.getHeight());
            final Context context = getContext();
            frameLayout = new FrameLayout(context) { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$setup$1
                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(MotionEvent me) {
                    DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.E, this, me);
                    return super.dispatchTouchEvent(me);
                }

                @Override // android.widget.FrameLayout, android.view.View
                protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
                        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
                        int size = View.MeasureSpec.getSize(widthMeasureSpec);
                        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
                        int i = convertDpToPx;
                        if (size > i || mode == 0) {
                            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                        }
                        int i2 = convertDpToPx2;
                        if (size2 > i2 || mode2 == 0) {
                            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                        }
                    } catch (Throwable th) {
                        int i3 = MobileFuseBannerAd$setup$1$onMeasure$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i3 == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            };
        } else {
            frameLayout = new FrameLayout(getContext());
        }
        this.inlineContainer = frameLayout;
        setLayoutParams(layoutParams2);
        View view = this.inlineContainer;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        Unit unit = Unit.INSTANCE;
        addView(view, layoutParams3);
        if (getBackground() == null) {
            setBackgroundResource(R.color.mobilefuse_default_banner_bg);
        } else {
            applyCurrentBackgroundColor();
        }
    }

    private final Function2 createAdErrorCallback() {
        return new Function2() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$createAdErrorCallback$1
            {
                super(2);
            }

            public final void invoke(@NotNull AdError adError, @Nullable ObservableConfig observableConfig) {
                MobileFuseBannerAd.Listener listener;
                Intrinsics.checkNotNullParameter(adError, "adError");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    MobileFuse.INSTANCE.logDebug("Ad Error: " + adError);
                    listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdError(adError);
                    }
                } catch (Throwable th) {
                    int i = MobileFuseBannerAd$createAdErrorCallback$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((AdError) obj, (ObservableConfig) obj2);
                return Unit.INSTANCE;
            }
        };
    }

    @VisibleForTesting
    @NotNull
    public final AdController createAdController$mobilefuse_sdk_core_release(@NotNull Context context, @NotNull String placementId, @NotNull AdInstanceInfo adInstanceInfo, int adWidth, int adHeight, @NotNull ObservableConfig observableConfig, @NotNull AdController.AdListener adListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        Intrinsics.checkNotNullParameter(observableConfig, "observableConfig");
        Intrinsics.checkNotNullParameter(adListener, "adListener");
        return AdControllerFactory.INSTANCE.createAdController(context, placementId, adInstanceInfo, adWidth, adHeight, observableConfig, adListener, this.adMuteStateManager, this.adType);
    }

    private final void detectTestModeFromPlacementId() {
        PlacementUtil.detectTestMode(this.placementId, this.observableConfig, new Callback() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$detectTestModeFromPlacementId$1
            @Override // com.mobilefuse.sdk.internal.Callback
            public final void call(@NotNull String newPlacementId) {
                Intrinsics.checkNotNullParameter(newPlacementId, "newPlacementId");
                MobileFuseBannerAd.this.placementId = newPlacementId;
            }
        });
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable background) {
        super.setBackground(background);
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            applyCurrentBackgroundColor();
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$setBackground$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void applyCurrentBackgroundColor() throws Throwable {
        AdController adController;
        Drawable background = getBackground();
        if (!(background instanceof ColorDrawable)) {
            background = null;
        }
        ColorDrawable colorDrawable = (ColorDrawable) background;
        if (colorDrawable == null) {
            return;
        }
        int color = colorDrawable.getColor();
        this.adBackgroundColor = color;
        if (color == -1 || (adController = this.adController) == null) {
            return;
        }
        adController.setAdBackgroundColor(color);
    }

    public final void loadAd() {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$loadAd$1
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
                MobileFuseBannerAd.this.loadAdInternal();
            }
        });
    }

    public final void loadAdFromBiddingToken(@NotNull final String bidResponse) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$loadAdFromBiddingToken$1
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
                MobileFuseBannerAd.this.loadAdFromBiddingTokenInternal(bidResponse);
            }
        });
    }

    @Override // com.mobilefuse.sdk.WinningBidInfoSource
    @Nullable
    public WinningBidInfo getWinningBidInfo() {
        AdController adController = this.adController;
        if (adController != null) {
            return adController.getWinningBidInfo();
        }
        return null;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuted(boolean muted) {
        MutableAdController mutableAdController = this.mutableAdController;
        if (mutableAdController != null) {
            mutableAdController.setMuted(muted);
        }
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public boolean isMuted() {
        MutableAdController mutableAdController = this.mutableAdController;
        if (mutableAdController != null) {
            return mutableAdController.isMuted();
        }
        return false;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        MutableAdController mutableAdController = this.mutableAdController;
        if (mutableAdController != null) {
            return mutableAdController.getMuteChangedListener();
        }
        return null;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener) {
        MutableAdController mutableAdController = this.mutableAdController;
        if (mutableAdController != null) {
            mutableAdController.setMuteChangedListener(muteChangedListener);
        }
    }

    public final /* synthetic */ boolean _isLoaded() {
        AdController adController = this.adController;
        if (adController != null) {
            return adController.isAdLoaded();
        }
        return false;
    }

    public final boolean isLoaded() {
        return _isLoaded();
    }

    public final /* synthetic */ boolean _isLoading() {
        AdController adController = this.adController;
        if (adController != null) {
            return adController.isAdLoading();
        }
        return false;
    }

    public final boolean isLoading() {
        return _isLoading();
    }

    /* renamed from: _isDestroyed, reason: from getter */
    public final /* synthetic */ boolean getDestroyed() {
        return this.destroyed;
    }

    public final boolean isDestroyed() {
        return getDestroyed();
    }

    public final void destroy() {
        SchedulersKt.safelyRunOnMainThread$default(null, new Function0() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$destroy$1
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
                MobileFuseBannerAd.this.destroyInternal();
            }
        }, 1, null);
    }

    private final AdController.AdListener createListener() {
        return new AdController.AdListener() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$createListener$1
            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onFullscreenChanged(boolean isFullscreen) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/MobileFuseBannerAd$createListener$1;->onFullscreenChanged(Z)V");
                BrandSafetyUtils.onMobileFuseFullscreenChanged(isFullscreen);
                safedk_MobileFuseBannerAd$createListener$1_onFullscreenChanged_a622159ce1fba7da02d6ffa316fefbb6(isFullscreen);
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClicked(@NotNull String url) {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                MobileFuseBannerAd.Listener listener;
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    adInstanceInfo = MobileFuseBannerAd.this.adInstanceInfo;
                    TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                    adInstanceInfo2 = MobileFuseBannerAd.this.adInstanceInfo;
                    telemetryAgent.onAction(TelemetrySdkActionFactory.createAdClickedAction(url, adInstanceInfo2));
                    listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdClicked();
                    }
                } catch (Throwable th) {
                    int i = MobileFuseBannerAd$createListener$1$onAdClicked$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdControllerUpdated(@NotNull AdController newAdController) {
                AdController.AdListener adListener;
                AdController adController;
                AdController adController2;
                AdController adController3;
                boolean z;
                int i;
                Intrinsics.checkNotNullParameter(newAdController, "newAdController");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    DebuggingKt.logDebug$default(this, "[Banner::AdmCacheMonitor] onAdControllerUpdated", null, 2, null);
                    adListener = MobileFuseBannerAd.this.adControllerListener;
                    newAdController.adListener = adListener;
                    adController = MobileFuseBannerAd.this.adController;
                    if (adController != null) {
                        adController.adListener = null;
                    }
                    adController2 = MobileFuseBannerAd.this.adController;
                    if (adController2 != null) {
                        adController2.destroy();
                    }
                    MobileFuseBannerAd.this.adController = newAdController;
                    adController3 = MobileFuseBannerAd.this.adController;
                    if (adController3 != null) {
                        i = MobileFuseBannerAd.this.adBackgroundColor;
                        adController3.setAdBackgroundColor(i);
                    }
                    z = MobileFuseBannerAd.this.attachedToWindow;
                    if (z) {
                        MobileFuseBannerAd.this.showAd();
                    }
                } catch (Throwable th) {
                    int i2 = MobileFuseBannerAd$createListener$1$onAdControllerUpdated$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i2 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdError(@NotNull AdError error) {
                MobileFuseBannerAd.Listener listener;
                AdController adController;
                MobileFuseBannerAd.Listener listener2;
                MobileFuseBannerAd.Listener listener3;
                FrameLayout frameLayout;
                AdController adController2;
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                Intrinsics.checkNotNullParameter(error, "error");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    String errorMessage = error.getErrorMessage();
                    if (errorMessage != null) {
                        adInstanceInfo = MobileFuseBannerAd.this.adInstanceInfo;
                        TelemetryAction createAdErrorAction = TelemetrySdkActionFactory.createAdErrorAction(adInstanceInfo, errorMessage);
                        if (createAdErrorAction != null) {
                            adInstanceInfo2 = MobileFuseBannerAd.this.adInstanceInfo;
                            adInstanceInfo2.telemetryAgent.onAction(createAdErrorAction);
                        }
                    }
                    AdError adError = AdError.AD_RUNTIME_ERROR;
                    if (error == adError) {
                        adController = MobileFuseBannerAd.this.adController;
                        AdController.AdState adState = adController != null ? adController.adState : null;
                        if (adState == null) {
                            return;
                        }
                        int i = MobileFuseBannerAd.WhenMappings.$EnumSwitchMapping$0[adState.ordinal()];
                        if (i == 1) {
                            listener2 = MobileFuseBannerAd.this.adListener;
                            if (listener2 != null) {
                                listener2.onAdNotFilled();
                                return;
                            }
                            return;
                        }
                        if (i != 2) {
                            return;
                        }
                        listener3 = MobileFuseBannerAd.this.adListener;
                        if (listener3 != null) {
                            listener3.onAdError(adError);
                        }
                        frameLayout = MobileFuseBannerAd.this.inlineContainer;
                        if (frameLayout != null) {
                            frameLayout.removeAllViews();
                        }
                        adController2 = MobileFuseBannerAd.this.adController;
                        if (adController2 != null) {
                            adController2.updateState(AdController.AdState.IDLE);
                            return;
                        }
                        return;
                    }
                    listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdError(error);
                    }
                } catch (Throwable th) {
                    int i2 = MobileFuseBannerAd$createListener$1$onAdError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i2 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdExpired(float expiry) {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                AdController adController;
                AdController adController2;
                AdController adController3;
                AdController adController4;
                MobileFuseBannerAd.Listener listener;
                int i;
                AdController.AdListener adListener;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    adInstanceInfo = MobileFuseBannerAd.this.adInstanceInfo;
                    TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                    adInstanceInfo2 = MobileFuseBannerAd.this.adInstanceInfo;
                    telemetryAgent.onAction(TelemetrySdkActionFactory.createAdExpiryAction(expiry, adInstanceInfo2));
                    adController = MobileFuseBannerAd.this.adController;
                    if (adController != null) {
                        adListener = MobileFuseBannerAd.this.adControllerListener;
                        adController2 = adController.newInstance(adListener);
                    } else {
                        adController2 = null;
                    }
                    adController3 = MobileFuseBannerAd.this.adController;
                    if (adController3 != null) {
                        adController3.destroy();
                    }
                    MobileFuseBannerAd.this.adController = null;
                    MobileFuseBannerAd.this.adController = adController2;
                    adController4 = MobileFuseBannerAd.this.adController;
                    if (adController4 != null) {
                        i = MobileFuseBannerAd.this.adBackgroundColor;
                        adController4.setAdBackgroundColor(i);
                    }
                    listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdExpired();
                    }
                } catch (Throwable th) {
                    int i2 = MobileFuseBannerAd$createListener$1$onAdExpired$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i2 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdLoaded() {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                MobileFuseBannerAd.Listener listener;
                boolean z;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    adInstanceInfo = MobileFuseBannerAd.this.adInstanceInfo;
                    TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                    Pair<String, String> pair = TelemetryAdLifecycleEvent.AD_LOADED;
                    adInstanceInfo2 = MobileFuseBannerAd.this.adInstanceInfo;
                    telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction$default(pair, adInstanceInfo2, null, 4, null));
                    listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdLoaded();
                    }
                    z = MobileFuseBannerAd.this.attachedToWindow;
                    if (z) {
                        MobileFuseBannerAd.this.showAd();
                    }
                } catch (Throwable th) {
                    int i = MobileFuseBannerAd$createListener$1$onAdLoaded$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdNotFilled(int reason) {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                MobileFuseBannerAd.Listener listener;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    adInstanceInfo = MobileFuseBannerAd.this.adInstanceInfo;
                    TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                    Pair<String, String> pair = TelemetryAdLifecycleEvent.AD_NOT_FILLED;
                    adInstanceInfo2 = MobileFuseBannerAd.this.adInstanceInfo;
                    telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction$default(pair, adInstanceInfo2, null, 4, null));
                    listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdNotFilled();
                    }
                } catch (Throwable th) {
                    int i = MobileFuseBannerAd$createListener$1$onAdNotFilled$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdRendered() {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                MobileFuseBannerAd.Listener listener;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    adInstanceInfo = MobileFuseBannerAd.this.adInstanceInfo;
                    TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                    Pair<String, String> pair = TelemetryAdLifecycleEvent.AD_RENDERED;
                    adInstanceInfo2 = MobileFuseBannerAd.this.adInstanceInfo;
                    telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction$default(pair, adInstanceInfo2, null, 4, null));
                    listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdRendered();
                    }
                } catch (Throwable th) {
                    int i = MobileFuseBannerAd$createListener$1$onAdRendered$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            public void safedk_MobileFuseBannerAd$createListener$1_onFullscreenChanged_a622159ce1fba7da02d6ffa316fefbb6(boolean p0) {
                boolean z;
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                MobileFuseBannerAd.Listener listener;
                MobileFuseBannerAd.Listener listener2;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    MobileFuseBannerAd.this.adExpanded = p0;
                    z = MobileFuseBannerAd.this.adExpanded;
                    Pair<String, String> pair = z ? TelemetryAdLifecycleEvent.AD_EXPANDED : TelemetryAdLifecycleEvent.AD_COLLAPSED;
                    adInstanceInfo = MobileFuseBannerAd.this.adInstanceInfo;
                    TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                    adInstanceInfo2 = MobileFuseBannerAd.this.adInstanceInfo;
                    telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction$default(pair, adInstanceInfo2, null, 4, null));
                    if (p0) {
                        listener2 = MobileFuseBannerAd.this.adListener;
                        if (listener2 != null) {
                            listener2.onAdExpanded();
                            return;
                        }
                        return;
                    }
                    listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdCollapsed();
                    }
                    MobileFuseBannerAd.this.tryToRotateAd(false);
                } catch (Throwable th) {
                    int i = MobileFuseBannerAd$createListener$1$onFullscreenChanged$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClosed() {
                MobileFuseBannerAd.this.forceRefresh();
            }
        };
    }

    private final void startActivityLifecycleChecking() throws Throwable {
        if (this.activityLifecycleObserver == null) {
            this.activityLifecycleObserver = new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$startActivityLifecycleChecking$1
                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityPaused(@NotNull Activity activity) {
                    Activity activity2;
                    boolean isAdRefresherEnabled;
                    AdRefresher adRefresher;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        activity2 = MobileFuseBannerAd.this.renderingActivity;
                        if (activity2 != activity) {
                            return;
                        }
                        MobileFuseBannerAd.this.activityInBackground = true;
                        DebuggingKt.logDebug$default(this, "[Banner] onActivityPaused", null, 2, null);
                        isAdRefresherEnabled = MobileFuseBannerAd.this.isAdRefresherEnabled();
                        if (isAdRefresherEnabled) {
                            DebuggingKt.logDebug$default(this, "[Banner] PAUSE ad refresher", null, 2, null);
                            adRefresher = MobileFuseBannerAd.this.adRefresher;
                            if (adRefresher != null) {
                                adRefresher.pause();
                            }
                        }
                    } catch (Throwable th) {
                        int i = MobileFuseBannerAd$startActivityLifecycleChecking$1$onActivityPaused$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }

                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityResumed(@NotNull Activity activity) {
                    Activity activity2;
                    boolean isAdRefresherEnabled;
                    AdRefresher adRefresher;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        activity2 = MobileFuseBannerAd.this.renderingActivity;
                        if (activity2 != activity) {
                            return;
                        }
                        MobileFuseBannerAd.this.activityInBackground = false;
                        DebuggingKt.logDebug$default(this, "[Banner] onActivityResumed", null, 2, null);
                        isAdRefresherEnabled = MobileFuseBannerAd.this.isAdRefresherEnabled();
                        if (isAdRefresherEnabled) {
                            DebuggingKt.logDebug$default(this, "[Banner] RESUME ad refresher", null, 2, null);
                            adRefresher = MobileFuseBannerAd.this.adRefresher;
                            if (adRefresher != null) {
                                adRefresher.start();
                            }
                        }
                    } catch (Throwable th) {
                        int i = MobileFuseBannerAd$startActivityLifecycleChecking$1$onActivityResumed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            };
        }
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = this.activityLifecycleObserver;
        if (activityLifecycleObserver != null) {
            AppLifecycleHelper.addActivityLifecycleObserver(activityLifecycleObserver);
        }
    }

    private final void stopActivityLifecycleChecking() throws Throwable {
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = this.activityLifecycleObserver;
        if (activityLifecycleObserver != null) {
            AppLifecycleHelper.removeActivityLifecycleObserver(activityLifecycleObserver);
        }
    }

    public final void setAutorefreshInterval(int seconds) {
        try {
            AdRefresher adRefresher = this.adRefresher;
            if (adRefresher != null) {
                adRefresher.setRefreshDelay((long) Math.max(seconds, 30L));
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public final boolean getAutorefreshEnabled() {
        AdRefresher adRefresher = this.adRefresher;
        if (adRefresher != null) {
            return adRefresher.isEnabled();
        }
        return false;
    }

    public final void setAutorefreshEnabled(boolean z) {
        AdRefresher adRefresher = this.adRefresher;
        if (adRefresher != null) {
            adRefresher.setEnabled(z);
        }
        if (z) {
            AdRefresher adRefresher2 = this.adRefresher;
            AdController adController = this.adController;
            if ((adController != null ? adController.adState : null) != AdController.AdState.RENDERED) {
                adRefresher2 = null;
            }
            if (adRefresher2 != null) {
                adRefresher2.start();
                return;
            }
            return;
        }
        destroyAdRefreshedController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAdRefresh() throws Throwable {
        if (this.adRefreshedController == null && !this.activityInBackground) {
            AdController.AdListener adListener = new AdController.AdListener() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd$requestAdRefresh$1
                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onFullscreenChanged(boolean isFullscreen) throws Throwable {
                    Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/MobileFuseBannerAd$requestAdRefresh$1;->onFullscreenChanged(Z)V");
                    BrandSafetyUtils.onMobileFuseFullscreenChanged(isFullscreen);
                    safedk_MobileFuseBannerAd$requestAdRefresh$1_onFullscreenChanged_bac8a1272c5ca036e93c4715e2a2667a(isFullscreen);
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdLoaded() throws Throwable {
                    MutableAdController mutableAdController;
                    boolean z;
                    mutableAdController = MobileFuseBannerAd.this.mutableAdController;
                    if (mutableAdController != null) {
                        mutableAdController.startObserver();
                    }
                    DebuggingKt.logDebug$default(this, "[Banner Refresh] onAdLoaded", null, 2, null);
                    MobileFuseBannerAd mobileFuseBannerAd = MobileFuseBannerAd.this;
                    z = mobileFuseBannerAd.requestedOneTimeAdRefresh;
                    mobileFuseBannerAd.tryToRotateAd(z);
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdNotFilled(int reason) throws Throwable {
                    DebuggingKt.logDebug$default(this, "[Banner Refresh] onAdNotFilled", null, 2, null);
                    MobileFuseBannerAd.this.onRefreshAdLoadFailed();
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdClosed() throws Throwable {
                    DebuggingKt.logDebug$default(this, "[Banner Refresh] onAdClosed", null, 2, null);
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdRendered() throws Throwable {
                    DebuggingKt.logDebug$default(this, "[Banner Refresh] onAdRendered", null, 2, null);
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdClicked(@NotNull String url) throws Throwable {
                    Intrinsics.checkNotNullParameter(url, "url");
                    DebuggingKt.logDebug$default(this, "[Banner Refresh] onAdClicked", null, 2, null);
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdExpired(float expiry) throws Throwable {
                    DebuggingKt.logDebug$default(this, "[Banner::Refresh::AdmCacheMonitor] onAdExpired", null, 2, null);
                    MobileFuseBannerAd.this.destroyAdRefreshedController();
                    MobileFuseBannerAd.this.requestAdRefresh();
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdControllerUpdated(@NotNull AdController newAdController) throws Throwable {
                    AdController.AdListener adListener2;
                    AdController adController;
                    AdController adController2;
                    Intrinsics.checkNotNullParameter(newAdController, "newAdController");
                    DebuggingKt.logDebug$default(this, "[Banner::Refresh::AdmCacheMonitor] onUpdated", null, 2, null);
                    adListener2 = MobileFuseBannerAd.this.adRefreshedControllerListener;
                    newAdController.adListener = adListener2;
                    adController = MobileFuseBannerAd.this.adRefreshedController;
                    if (adController != null) {
                        adController.adListener = null;
                    }
                    adController2 = MobileFuseBannerAd.this.adRefreshedController;
                    if (adController2 != null) {
                        adController2.destroy();
                    }
                    MobileFuseBannerAd.this.adRefreshedController = newAdController;
                    MobileFuseBannerAd.this.tryToRotateAd(false);
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdError(@NotNull AdError error) throws Throwable {
                    Intrinsics.checkNotNullParameter(error, "error");
                    DebuggingKt.logDebug$default(this, "[Banner Refresh] onAdError", null, 2, null);
                    MobileFuseBannerAd.this.onRefreshAdLoadFailed();
                }

                public void safedk_MobileFuseBannerAd$requestAdRefresh$1_onFullscreenChanged_bac8a1272c5ca036e93c4715e2a2667a(boolean p0) throws Throwable {
                    DebuggingKt.logDebug$default(this, "[Banner Refresh] onFullscreenChanged", null, 2, null);
                }
            };
            this.adRefreshedControllerListener = adListener;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AdController createAdController$mobilefuse_sdk_core_release = createAdController$mobilefuse_sdk_core_release(context, this.placementId, this.adInstanceInfo, this.adSize.getWidth(), this.adSize.getHeight(), this.observableConfig, adListener);
            this.adRefreshedController = createAdController$mobilefuse_sdk_core_release;
            if (createAdController$mobilefuse_sdk_core_release != null) {
                createAdController$mobilefuse_sdk_core_release.loadAd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destroyAdRefreshedController() throws Throwable {
        AdController adController = this.adRefreshedController;
        if (adController == null) {
            return;
        }
        if (adController != null) {
            adController.destroy();
        }
        this.adRefreshedController = null;
        this.adRefreshedControllerListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRefreshAdLoadFailed() throws Throwable {
        Listener listener;
        if (this.adRefreshedController == null) {
            return;
        }
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdRefresher adRefresher = this.adRefresher;
            if (adRefresher != null) {
                adRefresher.reset();
            }
            destroyAdRefreshedController();
            AdRefresher adRefresher2 = this.adRefresher;
            if (adRefresher2 != null) {
                adRefresher2.start();
            }
            if (!this.requestedOneTimeAdRefresh || (listener = this.adListener) == null) {
                return;
            }
            listener.onAdNotFilled();
        } catch (Throwable th) {
            int i = MobileFuseBannerAd$onRefreshAdLoadFailed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryToRotateAd(boolean force) throws Throwable {
        AdController adController;
        AdRefresher adRefresher;
        if (this.adExpanded) {
            return false;
        }
        if ((force || (adRefresher = this.adRefresher) == null || adRefresher.isCompleted()) && (adController = this.adRefreshedController) != null) {
            if ((adController != null ? adController.adState : null) == AdController.AdState.LOADED) {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    this.requestedOneTimeAdRefresh = false;
                    AdRefresher adRefresher2 = this.adRefresher;
                    if (adRefresher2 != null) {
                        adRefresher2.reset();
                    }
                    AdController adController2 = this.adController;
                    if (adController2 != null) {
                        adController2.destroy();
                    }
                    AdController adController3 = this.adRefreshedController;
                    this.adController = adController3;
                    Activity activity = this.renderingActivity;
                    if (activity != null && adController3 != null) {
                        adController3.setRenderingActivity(activity);
                    }
                    AdController adController4 = this.adController;
                    if (adController4 != null) {
                        adController4.adListener = this.adControllerListener;
                    }
                    if (adController4 != null) {
                        adController4.setAdBackgroundColor(this.adBackgroundColor);
                    }
                    this.adRefreshedController = null;
                    this.adRefreshedControllerListener = null;
                    showAd();
                    return true;
                } catch (Throwable th) {
                    int i = MobileFuseBannerAd$tryToRotateAd$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return false;
    }

    public final void setListener(@Nullable Listener adListener) {
        this.adListener = adListener;
    }

    public final boolean isTestMode() {
        return _isTestMode();
    }

    public final void setTestMode(boolean value) {
        _setTestMode(value);
    }

    @Nullable
    public final Float getBidFloor() {
        return _getBidFloor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAdRefresherEnabled() {
        AdController adController = this.adController;
        if (adController == null || adController.getLoadedFromBiddingToken()) {
            return false;
        }
        AdRefresher adRefresher = this.adRefresher;
        return adRefresher != null ? adRefresher.isEnabled() : false;
    }

    /* compiled from: MobileFuseBannerAd.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseBannerAd$AdSize;", "", "adName", "", "width", "", "height", "(Ljava/lang/String;ILjava/lang/String;II)V", "getAdName", "()Ljava/lang/String;", "getHeight", "()I", "getWidth", "BANNER_320x50", "BANNER_300x50", "BANNER_300x250", "BANNER_ADAPTIVE", "BANNER_728x90", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public enum AdSize {
        BANNER_320x50("BANNER_320x50", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
        BANNER_300x50("BANNER_300x50", 300, 50),
        BANNER_300x250("BANNER_300x250", 300, POBCommonConstants.DEFAULT_MIN_BITRATE),
        BANNER_ADAPTIVE("ADAPTIVE", -1, -1),
        BANNER_728x90("BANNER_728x90", 728, 90);


        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String adName;
        private final int height;
        private final int width;

        AdSize(String str, int i, int i2) {
            this.adName = str;
            this.width = i;
            this.height = i2;
        }

        @NotNull
        public final String getAdName() {
            return this.adName;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getHeight() {
            return this.height;
        }

        /* compiled from: MobileFuseBannerAd.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseBannerAd$AdSize$Companion;", "", "()V", "getAdSize", "Lcom/mobilefuse/sdk/MobileFuseBannerAd$AdSize;", "name", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final AdSize getAdSize(@Nullable String name) throws Throwable {
                AdSize adSize;
                if (name != null) {
                    AdSize[] values = AdSize.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            adSize = null;
                            break;
                        }
                        adSize = values[i];
                        if (StringsKt.equals(adSize.getAdName(), name, true)) {
                            break;
                        }
                        i++;
                    }
                    if (adSize != null) {
                        return adSize;
                    }
                }
                return AdSize.BANNER_320x50;
            }
        }
    }
}
