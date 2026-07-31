package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.internal.Callback;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.internal.mute.MutableAd;
import com.mobilefuse.sdk.internal.mute.MutableAdController;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetrySdkTypesKt;
import com.mobilefuse.sdk.utils.AdErrorCallback;
import com.mobilefuse.sdk.utils.PlacementUtil;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
public class MobileFuseOmniAd implements WinningBidInfoSource, MutableAd {

    @NonNull
    protected AdController adController;
    protected AdController.AdListener adControllerListener;

    @NonNull
    private final AdInstanceInfo adInstanceInfo;
    protected Listener adListener;
    private AdMuteStateManager adMuteStateManager;

    @NonNull
    private AdState adState;

    @NonNull
    private final AdController.AdType adType;

    @NonNull
    protected Context context;

    @NonNull
    private final Handler handler;

    @NonNull
    protected final MutableAdController mutableAdController;

    @NonNull
    protected final ObservableConfig observableConfig;
    protected String placementId;

    @NonNull
    private Position position;

    @Nullable
    private AppLifecycleHelper.ActivityLifecycleObserver renderingActivityOnDestroyListener;

    public enum AdState {
        THUMBNAIL,
        FULL_SCREEN
    }

    public interface Listener extends BaseAdListener {
        void onAdClosed();

        void onStateChange(@NonNull AdState adState);
    }

    public MobileFuseOmniAd(@NonNull Context context, @NonNull String str) {
        this(context, str, false);
    }

    MobileFuseOmniAd(@NonNull Context context, @NonNull String str, boolean z) {
        this.handler = Utils.getHandler();
        AdController.AdType adType = AdController.AdType.OMNI;
        this.adType = adType;
        this.position = Position.BOTTOM_RIGHT;
        this.adState = AdState.THUMBNAIL;
        this.adMuteStateManager = new AdMuteStateManager();
        this.context = context.getApplicationContext();
        this.placementId = str;
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices();
        AdInstanceInfo adInstanceInfo = new AdInstanceInfo(this, adType.getValue(), str);
        this.adInstanceInfo = adInstanceInfo;
        ObservableConfig observableConfig = new ObservableConfig();
        this.observableConfig = observableConfig;
        MutableAdController mutableAdController = new MutableAdController(observableConfig, adInstanceInfo, this.adMuteStateManager);
        this.mutableAdController = mutableAdController;
        try {
            observableConfig.setValue(ObservableConfigKey.DEFAULT_FORCE_SKIP_SECONDS, Float.valueOf(0.0f));
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceCreatedAction(adInstanceInfo));
            observableConfig.setValue(ObservableConfigKey.AD_INSTANCE_INFO, adInstanceInfo);
            observableConfig.setValue(ObservableConfigKey.POSITION, Integer.valueOf(this.position.getPositionAnchor()));
            mutableAdController.init();
            observableConfig.setValue(ObservableConfigKey.AD_ERROR_CALLBACK, new AdErrorCallback() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd$$ExternalSyntheticLambda4
                @Override // com.mobilefuse.sdk.utils.AdErrorCallback
                public final void onError(AdError adError, ObservableConfig observableConfig2) {
                    MobileFuseOmniAd.this.lambda$new$0(adError, observableConfig2);
                }
            });
            detectTestModeFromPlacementId();
            this.adControllerListener = createListener();
            if (z) {
                return;
            }
            init();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(AdError adError, ObservableConfig observableConfig) {
        try {
            MobileFuse.logDebug("Ad Error: " + adError);
            Listener listener = this.adListener;
            if (listener != null) {
                listener.onAdError(adError);
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    void init() throws Throwable {
        this.adController = createAdController(this.context, this.placementId, this.adInstanceInfo, 200, 112, this.observableConfig, this.adControllerListener);
    }

    AdController createAdController(Context context, String str, AdInstanceInfo adInstanceInfo, int i, int i2, ObservableConfig observableConfig, AdController.AdListener adListener) throws Throwable {
        return new AdController(context, str, this.adType, adInstanceInfo, i, i2, observableConfig, adListener, this.adMuteStateManager);
    }

    private void detectTestModeFromPlacementId() throws Throwable {
        String str = this.placementId;
        if (str == null) {
            return;
        }
        PlacementUtil.detectTestMode(str, this.observableConfig, new Callback() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd$$ExternalSyntheticLambda0
            @Override // com.mobilefuse.sdk.internal.Callback
            public final void call(Object obj) {
                MobileFuseOmniAd.this.lambda$detectTestModeFromPlacementId$1((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectTestModeFromPlacementId$1(String str) throws Throwable {
        this.placementId = str;
    }

    public void loadAd() {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit lambda$loadAd$2;
                lambda$loadAd$2 = MobileFuseOmniAd.this.lambda$loadAd$2();
                return lambda$loadAd$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$loadAd$2() {
        loadAdInternal();
        return Unit.INSTANCE;
    }

    private void loadAdInternal() {
        try {
            if (this.adController.isDestroyed()) {
                return;
            }
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceLoadAdAction(adInstanceInfo));
            this.adController.loadAd();
        } catch (Throwable th) {
            StabilityHelper.logAdErrorException(this, th, this.observableConfig, AdError.AD_LOAD_ERROR);
        }
    }

    public void loadAdFromBiddingToken(final String str) {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit lambda$loadAdFromBiddingToken$3;
                lambda$loadAdFromBiddingToken$3 = MobileFuseOmniAd.this.lambda$loadAdFromBiddingToken$3(str);
                return lambda$loadAdFromBiddingToken$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$loadAdFromBiddingToken$3(String str) {
        loadAdFromBiddingTokenInternal(str);
        return Unit.INSTANCE;
    }

    private void loadAdFromBiddingTokenInternal(String str) {
        try {
            if (this.adController.isDestroyed()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(TelemetrySdkTypesKt.createParamBidResponseToken(str));
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_BIDDING_LOAD_REQUESTED, adInstanceInfo, arrayList));
            this.adController.loadAdFromBiddingToken(str);
        } catch (Throwable th) {
            StabilityHelper.logAdErrorException(this, th, this.observableConfig, AdError.AD_LOAD_ERROR);
        }
    }

    public void showAd() {
        showAd(this.position);
    }

    public void showAd(@NonNull final Position position) {
        try {
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    MobileFuseOmniAd.this.lambda$showAd$4(position);
                }
            });
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showAdInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$showAd$4(@NonNull Position position) {
        try {
            this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createShowAdAction(isLoaded(), this.adInstanceInfo));
            if (!isLoaded()) {
                MobileFuse.logError("Omni Ad failed to show because there is no ad loaded. Ensure that you call loadAd() and check that an ad is loaded before calling showAd().");
                return;
            }
            if (applyPosition(position)) {
                lambda$setPosition$6(position);
            }
            this.adController.showFullscreenAd();
            startRenderingActivityOnDestroyChecking();
        } catch (Throwable th) {
            StabilityHelper.logAdRenderingException(this, th, this.observableConfig);
        }
    }

    private void startRenderingActivityOnDestroyChecking() throws Throwable {
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd.1
            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onActivityDestroyed(@NonNull Activity activity) {
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                if (activity != mobileFuseOmniAd.adController.renderingActivity) {
                    return;
                }
                mobileFuseOmniAd.stopRenderingActivityOnDestroyChecking();
                if (!MobileFuseOmniAd.this.adController.isDestroyed() && MobileFuseOmniAd.this.adController.isAdRendering()) {
                    MobileFuseOmniAd.this.closeAd();
                }
            }
        };
        this.renderingActivityOnDestroyListener = activityLifecycleObserver;
        AppLifecycleHelper.addActivityLifecycleObserver(activityLifecycleObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRenderingActivityOnDestroyChecking() {
        this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                MobileFuseOmniAd.this.lambda$stopRenderingActivityOnDestroyChecking$5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRenderingActivityOnDestroyChecking$5() {
        try {
            AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = this.renderingActivityOnDestroyListener;
            if (activityLifecycleObserver != null) {
                AppLifecycleHelper.removeActivityLifecycleObserver(activityLifecycleObserver);
                this.renderingActivityOnDestroyListener = null;
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public void closeAd() {
        try {
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MobileFuseOmniAd.this.closeAdInternal();
                }
            });
            stopRenderingActivityOnDestroyChecking();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeAdInternal() {
        try {
            if (this.adController.isAdRendering()) {
                this.adController.closeFullscreenAd();
            }
        } catch (Throwable th) {
            StabilityHelper.logAdRenderingException(this, th, this.observableConfig);
        }
    }

    @NonNull
    public Position getPosition() {
        return this.position;
    }

    public void setPosition(@NonNull final Position position) {
        try {
            if (applyPosition(position)) {
                this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MobileFuseOmniAd.this.lambda$setPosition$6(position);
                    }
                });
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private boolean applyPosition(Position position) {
        if (this.position == position) {
            return false;
        }
        this.position = position;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateObservableConfigPosition, reason: merged with bridge method [inline-methods] */
    public void lambda$setPosition$6(@NonNull Position position) {
        try {
            if (this.position != position) {
                return;
            }
            this.observableConfig.setValue(ObservableConfigKey.POSITION, Integer.valueOf(position.getPositionAnchor()));
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public boolean isLoaded() {
        return this.adController.isAdLoaded();
    }

    public boolean isRendering() {
        if (this.adController.isDestroyed()) {
            return false;
        }
        return this.adController.isAdRendering();
    }

    public boolean isLoading() {
        return this.adController.isAdLoading();
    }

    private AdController.AdListener createListener() {
        return new AdController.AdListener() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd.2
            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdLoaded() throws Throwable {
                MobileFuseOmniAd.this.mutableAdController.startObserver();
                MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_LOADED, MobileFuseOmniAd.this.adInstanceInfo));
                Listener listener = MobileFuseOmniAd.this.adListener;
                if (listener != null) {
                    listener.onAdLoaded();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdNotFilled(int i) throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_NOT_FILLED, MobileFuseOmniAd.this.adInstanceInfo));
                Listener listener = MobileFuseOmniAd.this.adListener;
                if (listener != null) {
                    listener.onAdNotFilled();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClosed() throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_CLOSED, MobileFuseOmniAd.this.adInstanceInfo));
                MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_INSTANCE_DESTROYED, MobileFuseOmniAd.this.adInstanceInfo));
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                AdController newInstance = mobileFuseOmniAd.adController.newInstance(mobileFuseOmniAd.adControllerListener);
                MobileFuseOmniAd.this.adController.destroy();
                MobileFuseOmniAd mobileFuseOmniAd2 = MobileFuseOmniAd.this;
                mobileFuseOmniAd2.adController.adListener = null;
                mobileFuseOmniAd2.adController = newInstance;
                Listener listener = mobileFuseOmniAd2.adListener;
                if (listener != null) {
                    listener.onAdClosed();
                }
                MobileFuseOmniAd.this.mutableAdController.removeObserver();
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdRendered() throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_RENDERED, MobileFuseOmniAd.this.adInstanceInfo));
                Listener listener = MobileFuseOmniAd.this.adListener;
                if (listener != null) {
                    listener.onAdRendered();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClicked(String str) throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdClickedAction(str, MobileFuseOmniAd.this.adInstanceInfo));
                Listener listener = MobileFuseOmniAd.this.adListener;
                if (listener != null) {
                    listener.onAdClicked();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdExpired(float f) throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdExpiryAction(f, MobileFuseOmniAd.this.adInstanceInfo));
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                AdController newInstance = mobileFuseOmniAd.adController.newInstance(mobileFuseOmniAd.adControllerListener);
                try {
                    MobileFuseOmniAd.this.adController.destroy();
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                }
                MobileFuseOmniAd mobileFuseOmniAd2 = MobileFuseOmniAd.this;
                mobileFuseOmniAd2.adController = newInstance;
                Listener listener = mobileFuseOmniAd2.adListener;
                if (listener != null) {
                    listener.onAdExpired();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdControllerUpdated(AdController adController) throws Throwable {
                MobileFuse.logDebug("[OmniAd::RtbCacheMonitor] onAdControllerUpdated");
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                adController.adListener = mobileFuseOmniAd.adControllerListener;
                AdController adController2 = mobileFuseOmniAd.adController;
                adController2.adListener = null;
                adController2.destroy();
                MobileFuseOmniAd.this.adController = adController;
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdError(AdError adError) throws Throwable {
                MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdErrorAction(MobileFuseOmniAd.this.adInstanceInfo, adError != null ? adError.getErrorMessage() : ""));
                AdError adError2 = AdError.AD_RUNTIME_ERROR;
                if (adError == adError2) {
                    MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                    AdController.AdState adState = mobileFuseOmniAd.adController.adState;
                    if (adState == AdController.AdState.NOT_FILLED) {
                        Listener listener = mobileFuseOmniAd.adListener;
                        if (listener != null) {
                            listener.onAdNotFilled();
                        }
                    } else if (adState == AdController.AdState.RENDERED) {
                        Listener listener2 = mobileFuseOmniAd.adListener;
                        if (listener2 != null) {
                            listener2.onAdError(adError2);
                        }
                        MobileFuseOmniAd.this.closeAd();
                    }
                } else {
                    Listener listener3 = MobileFuseOmniAd.this.adListener;
                    if (listener3 != null) {
                        listener3.onAdError(adError);
                    }
                }
                MobileFuseOmniAd.this.mutableAdController.removeObserver();
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onFullscreenChanged(boolean z) {
                if (z) {
                    MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_EXPANDED, MobileFuseOmniAd.this.adInstanceInfo));
                    MobileFuseOmniAd.this.adState = AdState.FULL_SCREEN;
                } else {
                    MobileFuseOmniAd.this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_COLLAPSED, MobileFuseOmniAd.this.adInstanceInfo));
                    MobileFuseOmniAd.this.adState = AdState.THUMBNAIL;
                }
                MobileFuseOmniAd mobileFuseOmniAd = MobileFuseOmniAd.this;
                Listener listener = mobileFuseOmniAd.adListener;
                if (listener != null) {
                    listener.onStateChange(mobileFuseOmniAd.adState);
                }
            }
        };
    }

    public void setListener(Listener listener) {
        this.adListener = listener;
    }

    public void setRenderState(@NonNull final AdState adState) {
        try {
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseOmniAd$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    MobileFuseOmniAd.this.lambda$setRenderState$7(adState);
                }
            });
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setRenderStateInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$setRenderState$7(@NonNull AdState adState) {
        try {
            if (isRendering()) {
                this.observableConfig.setValue(ObservableConfigKey.FULLSCREEN, Boolean.valueOf(adState == AdState.FULL_SCREEN));
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @NonNull
    public AdState getRenderState() {
        return this.adState;
    }

    @Override // com.mobilefuse.sdk.WinningBidInfoSource
    @Nullable
    public WinningBidInfo getWinningBidInfo() {
        if (this.adController.isDestroyed()) {
            return null;
        }
        return this.adController.getWinningBidInfo();
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuted(boolean z) {
        this.mutableAdController.setMuted(z);
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
    public void setMuteChangedListener(MuteChangedListener muteChangedListener) {
        this.mutableAdController.setMuteChangedListener(muteChangedListener);
    }

    public boolean isTestMode() {
        try {
            return PlacementUtil.isTestMode(this.observableConfig);
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            return false;
        }
    }

    public void setTestMode(boolean z) {
        try {
            PlacementUtil.setTestMode(this.observableConfig, z);
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceSetTestModeAction(z, adInstanceInfo));
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public void setBidFloor(float f) {
        try {
            PlacementUtil.setBidFloor(this.observableConfig, Float.valueOf(f));
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Nullable
    public Float getBidFloor() {
        try {
            return PlacementUtil.getBidFloor(this.observableConfig);
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            return null;
        }
    }

    public void clearBidFloor() {
        try {
            PlacementUtil.clearBidFloor(this.observableConfig);
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public enum Position {
        TOP_LEFT(0),
        TOP_RIGHT(1),
        BOTTOM_LEFT(2),
        BOTTOM_RIGHT(3);

        private final int positionAnchor;

        Position(int i) {
            this.positionAnchor = i;
        }

        public int getPositionAnchor() {
            return this.positionAnchor;
        }
    }
}
