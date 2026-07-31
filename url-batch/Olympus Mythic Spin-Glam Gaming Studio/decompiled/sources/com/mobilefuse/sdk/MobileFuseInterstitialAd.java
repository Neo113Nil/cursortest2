package com.mobilefuse.sdk;

import android.content.Context;
import com.ironsource.Zf;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.MobileFuseInterstitialAd;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.internal.Callback;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.internal.mute.MutableAd;
import com.mobilefuse.sdk.internal.mute.MutableAdController;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetrySdkTypesKt;
import com.mobilefuse.sdk.utils.PlacementUtil;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseInterstitialAd.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0002FGB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010.\u001a\u00020/J0\u00100\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u001c\u00101\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020/02H\u0002J\b\u00104\u001a\u00020\u000bH\u0002J\b\u00105\u001a\u00020/H\u0002J\r\u00106\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0017J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aJ\b\u00109\u001a\u00020\u001aH\u0016J\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010:\u001a\u00020/J\u000e\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020\u0006J\u0010\u0010=\u001a\u00020/2\u0006\u0010<\u001a\u00020\u0006H\u0002J\b\u0010>\u001a\u00020/H\u0002J\u000e\u0010?\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010@\u001a\u00020/2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020\u001aH\u0016J\u000e\u0010C\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020\u001aJ\u0006\u0010D\u001a\u00020/J\b\u0010E\u001a\u00020/H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010&8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseInterstitialAd;", "Lcom/mobilefuse/sdk/WinningBidInfoSource;", "Lcom/mobilefuse/sdk/internal/mute/MutableAd;", "ctx", "Landroid/content/Context;", "placementId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "adController", "Lcom/mobilefuse/sdk/AdController;", "adControllerListener", "Lcom/mobilefuse/sdk/AdController$AdListener;", "adInstanceInfo", "Lcom/mobilefuse/sdk/AdInstanceInfo;", "adListener", "Lcom/mobilefuse/sdk/MobileFuseInterstitialAd$Listener;", "adMuteStateManager", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;", "adType", "Lcom/mobilefuse/sdk/AdController$AdType;", "bidFloor", "", "_getBidFloor", "()Ljava/lang/Float;", "context", "isLoaded", "", "_isLoaded", "()Z", "isLoading", "_isLoading", "value", "isTestMode", "_isTestMode", "_setTestMode", "(Z)V", "mutableAdController", "Lcom/mobilefuse/sdk/internal/mute/MutableAdController;", "Lcom/mobilefuse/sdk/MuteChangedListener;", "muteChangedListener", "getMuteChangedListener", "()Lcom/mobilefuse/sdk/MuteChangedListener;", "setMuteChangedListener", "(Lcom/mobilefuse/sdk/MuteChangedListener;)V", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "clearBidFloor", "", "createAdController", "createAdErrorCallback", "Lkotlin/Function2;", "Lcom/mobilefuse/sdk/AdError;", "createListener", "detectTestModeFromPlacementId", "getBidFloor", "getWinningBidInfo", "Lcom/mobilefuse/sdk/WinningBidInfo;", "isMuted", "loadAd", "loadAdFromBiddingToken", "bidResponse", "loadAdFromBiddingTokenInternal", "loadAdInternal", "setBidFloor", "setListener", "setMuted", "muted", "setTestMode", h.aj, "showAdInternal", "Companion", "Listener", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class MobileFuseInterstitialAd implements WinningBidInfoSource, MutableAd {
    public static final int AD_SIZE_FULLSCREEN = -1;
    private AdController adController;
    private AdController.AdListener adControllerListener;
    private final AdInstanceInfo adInstanceInfo;
    private Listener adListener;
    private final AdMuteStateManager adMuteStateManager;
    private final AdController.AdType adType;
    private final Context context;
    private final MutableAdController mutableAdController;
    private final ObservableConfig observableConfig;
    private String placementId;

    /* compiled from: MobileFuseInterstitialAd.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseInterstitialAd$Listener;", "Lcom/mobilefuse/sdk/BaseAdListener;", Zf.g, "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public interface Listener extends BaseAdListener {
        void onAdClosed() throws Throwable;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes3.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdError.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AdError.AD_RUNTIME_ERROR.ordinal()] = 1;
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
            int i = MobileFuseInterstitialAd$loadAdFromBiddingTokenInternal$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
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
            int i = MobileFuseInterstitialAd$loadAdInternal$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAdInternal() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createShowAdAction(_isLoaded(), this.adInstanceInfo));
            if (!_isLoaded()) {
                MobileFuse.INSTANCE.logError("Interstitial Ad failed to show because there is no ad loaded. Ensure that you call loadAd() and check that an ad is loaded before calling showAd().");
                return;
            }
            AdController adController = this.adController;
            if (adController != null) {
                adController.showFullscreenAd();
            }
        } catch (Throwable th) {
            int i = MobileFuseInterstitialAd$showAdInternal$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
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
            int i = MobileFuseInterstitialAd$bidFloor$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
                return null;
            }
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final /* synthetic */ boolean _isTestMode() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return PlacementUtil.isTestMode(this.observableConfig);
        } catch (Throwable th) {
            int i = MobileFuseInterstitialAd$isTestMode$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
                return false;
            }
            if (i == 2) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final /* synthetic */ void _setTestMode(boolean z) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PlacementUtil.setTestMode(this.observableConfig, z);
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceSetTestModeAction(z, adInstanceInfo));
        } catch (Throwable th) {
            int i = MobileFuseInterstitialAd$isTestMode$$inlined$handleExceptions$2$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
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
            int i = MobileFuseInterstitialAd$clearBidFloor$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
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
            int i = MobileFuseInterstitialAd$setBidFloor$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public MobileFuseInterstitialAd(@NotNull Context ctx, @NotNull String placementId) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.placementId = placementId;
        Context applicationContext = ctx.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "ctx.applicationContext");
        this.context = applicationContext;
        AdController.AdType adType = AdController.AdType.INTERSTITIAL;
        this.adType = adType;
        AdMuteStateManager adMuteStateManager = new AdMuteStateManager();
        this.adMuteStateManager = adMuteStateManager;
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices();
        AdInstanceInfo adInstanceInfo = new AdInstanceInfo(this, adType.getValue(), this.placementId);
        this.adInstanceInfo = adInstanceInfo;
        ObservableConfig observableConfig = new ObservableConfig();
        this.observableConfig = observableConfig;
        MutableAdController mutableAdController = new MutableAdController(observableConfig, adInstanceInfo, adMuteStateManager);
        this.mutableAdController = mutableAdController;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            observableConfig.setValue(ObservableConfigKey.DEFAULT_MUTED, Boolean.FALSE);
            observableConfig.setValue(ObservableConfigKey.MRAID_AD_SKIPOFFSET_SECONDS, Float.valueOf(5.0f));
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceCreatedAction$default(adInstanceInfo, null, 2, null));
            observableConfig.setValue(ObservableConfigKey.AD_INSTANCE_INFO, adInstanceInfo);
            mutableAdController.init();
            observableConfig.setValue(ObservableConfigKey.AD_ERROR_CALLBACK, createAdErrorCallback());
            detectTestModeFromPlacementId();
            AdController.AdListener createListener = createListener();
            this.adControllerListener = createListener;
            if (createListener != null) {
                this.adController = createAdController(applicationContext, this.placementId, adInstanceInfo, observableConfig, createListener);
            }
        } catch (Throwable th) {
            int i = MobileFuseInterstitialAd$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final AdController createAdController(Context context, String placementId, AdInstanceInfo adInstanceInfo, ObservableConfig observableConfig, AdController.AdListener adListener) {
        return AdControllerFactory.INSTANCE.createAdController(context, placementId, adInstanceInfo, -1, -1, observableConfig, adListener, this.adMuteStateManager, this.adType);
    }

    private final void detectTestModeFromPlacementId() {
        PlacementUtil.detectTestMode(this.placementId, this.observableConfig, new Callback() { // from class: com.mobilefuse.sdk.MobileFuseInterstitialAd$detectTestModeFromPlacementId$1
            @Override // com.mobilefuse.sdk.internal.Callback
            public final void call(@NotNull String newPlacementId) {
                Intrinsics.checkNotNullParameter(newPlacementId, "newPlacementId");
                MobileFuseInterstitialAd.this.placementId = newPlacementId;
            }
        });
    }

    public final void loadAd() {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.MobileFuseInterstitialAd$loadAd$1
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
                MobileFuseInterstitialAd.this.loadAdInternal();
            }
        });
    }

    public final void loadAdFromBiddingToken(@NotNull final String bidResponse) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.MobileFuseInterstitialAd$loadAdFromBiddingToken$1
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
                MobileFuseInterstitialAd.this.loadAdFromBiddingTokenInternal(bidResponse);
            }
        });
    }

    public final void showAd() {
        SchedulersKt.safelyRunOnMainThread$default(null, new Function0() { // from class: com.mobilefuse.sdk.MobileFuseInterstitialAd$showAd$1
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
                MobileFuseInterstitialAd.this.showAdInternal();
            }
        }, 1, null);
    }

    private final Function2 createAdErrorCallback() {
        return new Function2() { // from class: com.mobilefuse.sdk.MobileFuseInterstitialAd$createAdErrorCallback$1
            {
                super(2);
            }

            public final void invoke(@NotNull AdError adError, @Nullable ObservableConfig observableConfig) {
                MobileFuseInterstitialAd.Listener listener;
                Intrinsics.checkNotNullParameter(adError, "adError");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    MobileFuse.INSTANCE.logDebug("Ad Error: " + adError);
                    listener = MobileFuseInterstitialAd.this.adListener;
                    if (listener != null) {
                        listener.onAdError(adError);
                    }
                } catch (Throwable th) {
                    int i = MobileFuseInterstitialAd$createAdErrorCallback$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
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

    private final AdController.AdListener createListener() {
        return new AdController.AdListener() { // from class: com.mobilefuse.sdk.MobileFuseInterstitialAd$createListener$1
            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onFullscreenChanged(boolean isFullscreen) {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdLoaded() throws Throwable {
                MutableAdController mutableAdController;
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                MobileFuseInterstitialAd.Listener listener;
                mutableAdController = MobileFuseInterstitialAd.this.mutableAdController;
                mutableAdController.startObserver();
                adInstanceInfo = MobileFuseInterstitialAd.this.adInstanceInfo;
                TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                Pair<String, String> pair = TelemetryAdLifecycleEvent.AD_LOADED;
                adInstanceInfo2 = MobileFuseInterstitialAd.this.adInstanceInfo;
                telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction$default(pair, adInstanceInfo2, null, 4, null));
                listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdLoaded();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdNotFilled(int reason) throws Throwable {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                MobileFuseInterstitialAd.Listener listener;
                MutableAdController mutableAdController;
                adInstanceInfo = MobileFuseInterstitialAd.this.adInstanceInfo;
                TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                Pair<String, String> pair = TelemetryAdLifecycleEvent.AD_NOT_FILLED;
                adInstanceInfo2 = MobileFuseInterstitialAd.this.adInstanceInfo;
                telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction$default(pair, adInstanceInfo2, null, 4, null));
                listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdNotFilled();
                }
                mutableAdController = MobileFuseInterstitialAd.this.mutableAdController;
                mutableAdController.removeObserver();
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClosed() throws Throwable {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                AdInstanceInfo adInstanceInfo3;
                AdInstanceInfo adInstanceInfo4;
                AdController adController;
                AdController adController2;
                AdController adController3;
                AdController adController4;
                MobileFuseInterstitialAd.Listener listener;
                MutableAdController mutableAdController;
                AdController.AdListener adListener;
                adInstanceInfo = MobileFuseInterstitialAd.this.adInstanceInfo;
                TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                Pair<String, String> pair = TelemetryAdLifecycleEvent.AD_CLOSED;
                adInstanceInfo2 = MobileFuseInterstitialAd.this.adInstanceInfo;
                telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction$default(pair, adInstanceInfo2, null, 4, null));
                adInstanceInfo3 = MobileFuseInterstitialAd.this.adInstanceInfo;
                TelemetryAgent telemetryAgent2 = adInstanceInfo3.telemetryAgent;
                TelemetryActionSdkEvents telemetryActionSdkEvents = TelemetryActionSdkEvents.AD_INSTANCE_DESTROYED;
                adInstanceInfo4 = MobileFuseInterstitialAd.this.adInstanceInfo;
                telemetryAgent2.onAction(TelemetrySdkActionFactory.createAdInstanceAction$default(telemetryActionSdkEvents, adInstanceInfo4, null, 4, null));
                adController = MobileFuseInterstitialAd.this.adController;
                if (adController != null) {
                    adListener = MobileFuseInterstitialAd.this.adControllerListener;
                    adController2 = adController.newInstance(adListener);
                } else {
                    adController2 = null;
                }
                adController3 = MobileFuseInterstitialAd.this.adController;
                if (adController3 != null) {
                    adController3.destroy();
                }
                adController4 = MobileFuseInterstitialAd.this.adController;
                if (adController4 != null) {
                    adController4.adListener = null;
                }
                MobileFuseInterstitialAd.this.adController = adController2;
                listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdClosed();
                }
                mutableAdController = MobileFuseInterstitialAd.this.mutableAdController;
                mutableAdController.removeObserver();
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdRendered() throws Throwable {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                MobileFuseInterstitialAd.Listener listener;
                adInstanceInfo = MobileFuseInterstitialAd.this.adInstanceInfo;
                TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                Pair<String, String> pair = TelemetryAdLifecycleEvent.AD_RENDERED;
                adInstanceInfo2 = MobileFuseInterstitialAd.this.adInstanceInfo;
                telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction$default(pair, adInstanceInfo2, null, 4, null));
                listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdRendered();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClicked(@NotNull String url) throws Throwable {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                MobileFuseInterstitialAd.Listener listener;
                Intrinsics.checkNotNullParameter(url, "url");
                adInstanceInfo = MobileFuseInterstitialAd.this.adInstanceInfo;
                TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                adInstanceInfo2 = MobileFuseInterstitialAd.this.adInstanceInfo;
                telemetryAgent.onAction(TelemetrySdkActionFactory.createAdClickedAction(url, adInstanceInfo2));
                listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdClicked();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdExpired(float expiry) throws Throwable {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                AdController adController;
                AdController adController2;
                MobileFuseInterstitialAd.Listener listener;
                MutableAdController mutableAdController;
                AdController adController3;
                AdController.AdListener adListener;
                adInstanceInfo = MobileFuseInterstitialAd.this.adInstanceInfo;
                TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                adInstanceInfo2 = MobileFuseInterstitialAd.this.adInstanceInfo;
                telemetryAgent.onAction(TelemetrySdkActionFactory.createAdExpiryAction(expiry, adInstanceInfo2));
                adController = MobileFuseInterstitialAd.this.adController;
                if (adController != null) {
                    adListener = MobileFuseInterstitialAd.this.adControllerListener;
                    adController2 = adController.newInstance(adListener);
                } else {
                    adController2 = null;
                }
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    adController3 = MobileFuseInterstitialAd.this.adController;
                    if (adController3 != null) {
                        adController3.destroy();
                    }
                    MobileFuseInterstitialAd.this.adController = null;
                } catch (Throwable th) {
                    int i = MobileFuseInterstitialAd$createListener$1$onAdExpired$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                MobileFuseInterstitialAd.this.adController = adController2;
                listener = MobileFuseInterstitialAd.this.adListener;
                if (listener != null) {
                    listener.onAdExpired();
                }
                mutableAdController = MobileFuseInterstitialAd.this.mutableAdController;
                mutableAdController.removeObserver();
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdControllerUpdated(@NotNull AdController newAdController) throws Throwable {
                AdController.AdListener adListener;
                AdController adController;
                AdController adController2;
                Intrinsics.checkNotNullParameter(newAdController, "newAdController");
                MobileFuse.INSTANCE.logDebug("[Interstitial::AdmCacheMonitor] onAdControllerUpdated");
                adListener = MobileFuseInterstitialAd.this.adControllerListener;
                newAdController.adListener = adListener;
                adController = MobileFuseInterstitialAd.this.adController;
                if (adController != null) {
                    adController.adListener = null;
                }
                adController2 = MobileFuseInterstitialAd.this.adController;
                if (adController2 != null) {
                    adController2.destroy();
                }
                MobileFuseInterstitialAd.this.adController = newAdController;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
            
                r5 = r4.this$0.adListener;
             */
            @Override // com.mobilefuse.sdk.AdController.AdListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onAdError(@NotNull AdError error) throws Throwable {
                AdInstanceInfo adInstanceInfo;
                AdInstanceInfo adInstanceInfo2;
                AdController adController;
                AdController adController2;
                MobileFuseInterstitialAd.Listener listener;
                MobileFuseInterstitialAd.Listener listener2;
                MobileFuseInterstitialAd.Listener listener3;
                MutableAdController mutableAdController;
                MobileFuseInterstitialAd.Listener listener4;
                Intrinsics.checkNotNullParameter(error, "error");
                adInstanceInfo = MobileFuseInterstitialAd.this.adInstanceInfo;
                TelemetryAgent telemetryAgent = adInstanceInfo.telemetryAgent;
                adInstanceInfo2 = MobileFuseInterstitialAd.this.adInstanceInfo;
                String errorMessage = error.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "";
                }
                telemetryAgent.onAction(TelemetrySdkActionFactory.createAdErrorAction(adInstanceInfo2, errorMessage));
                adController = MobileFuseInterstitialAd.this.adController;
                AdController.AdState adState = adController != null ? adController.adState : null;
                if (MobileFuseInterstitialAd.WhenMappings.$EnumSwitchMapping$0[error.ordinal()] != 1) {
                    listener4 = MobileFuseInterstitialAd.this.adListener;
                    if (listener4 != null) {
                        listener4.onAdError(error);
                    }
                } else if (adState == AdController.AdState.NOT_FILLED) {
                    listener3 = MobileFuseInterstitialAd.this.adListener;
                    if (listener3 != null) {
                        listener3.onAdNotFilled();
                    }
                } else if (adState == AdController.AdState.RENDERED) {
                    listener2 = MobileFuseInterstitialAd.this.adListener;
                    if (listener2 != null) {
                        listener2.onAdError(AdError.AD_RUNTIME_ERROR);
                    }
                } else {
                    adController2 = MobileFuseInterstitialAd.this.adController;
                    if ((adController2 != null ? adController2.adState : null) == AdController.AdState.LOADED && listener != null) {
                        listener.onAdError(AdError.AD_RUNTIME_ERROR);
                    }
                }
                mutableAdController = MobileFuseInterstitialAd.this.mutableAdController;
                mutableAdController.removeObserver();
            }
        };
    }

    public final void setListener(@Nullable Listener adListener) {
        this.adListener = adListener;
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
        this.mutableAdController.setMuted(muted);
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public boolean isMuted() {
        return this.mutableAdController.isMuted();
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        return this.mutableAdController.getMuteChangedListener();
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener) {
        this.mutableAdController.setMuteChangedListener(muteChangedListener);
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
}
