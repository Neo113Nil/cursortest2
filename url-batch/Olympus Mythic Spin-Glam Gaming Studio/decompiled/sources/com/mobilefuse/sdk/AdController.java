package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Zf;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.AdmCacheMonitor;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.config.Apply_BidResponse_to_ObservableConfigKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.internal.repository.AdLoadingConfig;
import com.mobilefuse.sdk.internal.repository.AdRepository;
import com.mobilefuse.sdk.internal.repository.BiddingAdRepository;
import com.mobilefuse.sdk.internal.repository.MfxAdRepository;
import com.mobilefuse.sdk.internal.repository.ParsedAdMarkupResponse;
import com.mobilefuse.sdk.mfx.BasicAdParser;
import com.mobilefuse.sdk.mfx.BidLossService;
import com.mobilefuse.sdk.mfx.MfxRequestAdKt;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.model.AdmCreativeFormat;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidRequest;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponseToWinningBidInfoKt;
import com.mobilefuse.sdk.privacy.PrivacyCenter;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.vast.VastAdRenderer;
import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\b\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020YH\u0002J\u0006\u0010[\u001a\u00020AJ\u0006\u0010\\\u001a\u00020YJ\b\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020YH\u0002J\u0006\u0010`\u001a\u00020YJ\b\u0010a\u001a\u00020YH\u0002J\u0006\u0010b\u001a\u00020\u000bJ\b\u0010c\u001a\u0004\u0018\u00010\u0005J\u001c\u0010d\u001a\u0004\u0018\u00010e2\u0006\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010iH\u0002J\b\u0010j\u001a\u0004\u0018\u00010OJ\b\u0010k\u001a\u00020lH\u0002J\b\u0010m\u001a\u00020\u0005H\u0002J\b\u0010n\u001a\u0004\u0018\u00010SJ\u0006\u0010o\u001a\u00020AJ\u0006\u0010p\u001a\u00020AJ\u0006\u0010q\u001a\u00020AJ\r\u0010r\u001a\u00020AH\u0000¢\u0006\u0002\bsJ\u0006\u0010t\u001a\u00020AJ\u0006\u0010u\u001a\u00020AJ\u0006\u0010v\u001a\u00020YJ\u0010\u0010w\u001a\u00020Y2\b\u00106\u001a\u0004\u0018\u00010\u0005J\u0006\u0010x\u001a\u00020YJ\u0010\u0010y\u001a\u00020\u00002\b\u0010z\u001a\u0004\u0018\u00010\u0010J\u0006\u0010{\u001a\u00020YJ\u0006\u0010|\u001a\u00020YJ\u0006\u0010}\u001a\u00020YJ\u0006\u0010~\u001a\u00020YJ\u0006\u0010\u007f\u001a\u00020YJ\u0019\u0010\u0080\u0001\u001a\u00020Y2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0000¢\u0006\u0003\b\u0083\u0001J2\u0010\u0080\u0001\u001a\u00020Y2\b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0084\u0001\u001a\u00020e2\u0016\u0010\u0085\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0086\u0001J1\u0010\u0080\u0001\u001a\u00020Y2\b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0016\u0010\u0085\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0086\u0001H\u0000¢\u0006\u0003\b\u0083\u0001J\u0012\u0010\u0087\u0001\u001a\u00020Y2\u0007\u0010\u0088\u0001\u001a\u00020*H\u0002J\u000f\u0010\u0089\u0001\u001a\u00020YH\u0000¢\u0006\u0003\b\u008a\u0001J\u0019\u0010\u008b\u0001\u001a\u00020Y2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0000¢\u0006\u0003\b\u008e\u0001J\u000f\u0010\u008f\u0001\u001a\u00020Y2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0010\u0010\u0090\u0001\u001a\u00020Y2\u0007\u0010\u0091\u0001\u001a\u00020;J\u0010\u0010\u0092\u0001\u001a\u00020Y2\u0007\u0010\u0093\u0001\u001a\u00020OJ\u0007\u0010\u0094\u0001\u001a\u00020YJ\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001J\u0010\u0010\u0097\u0001\u001a\u00020Y2\u0007\u0010\u0098\u0001\u001a\u000200J\t\u0010\u0099\u0001\u001a\u00020YH\u0002J\u0007\u0010\u009a\u0001\u001a\u00020YJ\t\u0010\u009b\u0001\u001a\u00020YH\u0002R\u001a\u0010\u0014\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0012\u0010/\u001a\u0002008\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0016R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010B\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010D\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bD\u0010CR\u000e\u0010E\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u0004\u0018\u00010O8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010R\u001a\u0004\u0018\u00010SX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006 \u0001"}, d2 = {"Lcom/mobilefuse/sdk/AdController;", "", "context", "Landroid/content/Context;", "placementId", "", "adType", "Lcom/mobilefuse/sdk/AdController$AdType;", "adInstanceInfo", "Lcom/mobilefuse/sdk/AdInstanceInfo;", "adWidth", "", "adHeight", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "adListener", "Lcom/mobilefuse/sdk/AdController$AdListener;", "adMuteStateManager", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;", "(Landroid/content/Context;Ljava/lang/String;Lcom/mobilefuse/sdk/AdController$AdType;Lcom/mobilefuse/sdk/AdInstanceInfo;IILcom/mobilefuse/sdk/config/ObservableConfig;Lcom/mobilefuse/sdk/AdController$AdListener;Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;)V", "adBackgroundColor", "getAdBackgroundColor$mobilefuse_sdk_core_release", "()I", "setAdBackgroundColor$mobilefuse_sdk_core_release", "(I)V", "getAdHeight", "getAdInstanceInfo", "()Lcom/mobilefuse/sdk/AdInstanceInfo;", "adRenderer", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "getAdRenderer$mobilefuse_sdk_core_release", "()Lcom/mobilefuse/sdk/BaseAdRenderer;", "setAdRenderer$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/BaseAdRenderer;)V", "adRendererConfig", "Lcom/mobilefuse/sdk/AdRendererConfig;", "getAdRendererConfig$mobilefuse_sdk_core_release", "()Lcom/mobilefuse/sdk/AdRendererConfig;", "setAdRendererConfig$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/AdRendererConfig;)V", "adRepository", "Lcom/mobilefuse/sdk/internal/repository/AdRepository;", "Lcom/mobilefuse/sdk/internal/repository/ParsedAdMarkupResponse;", "getAdRepository$mobilefuse_sdk_core_release", "()Lcom/mobilefuse/sdk/internal/repository/AdRepository;", "setAdRepository$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/internal/repository/AdRepository;)V", "adState", "Lcom/mobilefuse/sdk/AdController$AdState;", "getAdType", "()Lcom/mobilefuse/sdk/AdController$AdType;", "getAdWidth", "admCacheMonitor", "Lcom/mobilefuse/sdk/AdmCacheMonitor;", "bidResponse", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "getContext", "()Landroid/content/Context;", "fullscreenAdBridge", "Lcom/mobilefuse/sdk/AdController$FullscreenAdBridge;", "getFullscreenAdBridge$mobilefuse_sdk_core_release", "()Lcom/mobilefuse/sdk/AdController$FullscreenAdBridge;", "setFullscreenAdBridge$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/AdController$FullscreenAdBridge;)V", "hasAdRendered", "", "isAdLoaded", "()Z", "isAdLoading", "loadedFromBiddingToken", "lockedSessionTestMode", "lossUrlHasBeenCalled", "getObservableConfig", "()Lcom/mobilefuse/sdk/config/ObservableConfig;", "setObservableConfig", "(Lcom/mobilefuse/sdk/config/ObservableConfig;)V", "getPlacementId", "()Ljava/lang/String;", "renderingActivity", "Landroid/app/Activity;", "telemetryAgent", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "winningBidInfo", "Lcom/mobilefuse/sdk/WinningBidInfo;", "getWinningBidInfo$mobilefuse_sdk_core_release", "()Lcom/mobilefuse/sdk/WinningBidInfo;", "setWinningBidInfo$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/WinningBidInfo;)V", "applyCurrentBackgroundColor", "", "cacheAdAssets", "canLoadAd", "closeFullscreenAd", "createAdLoadingConfig", "Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "createAdRenderer", "destroy", "destroyAdRenderer", "getAdBackgroundColor", "getAdm", "getOmniExtendedAdType", "Lcom/mobilefuse/sdk/ExtendedAdType;", "mediaType", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "creativeFormat", "Lcom/mobilefuse/sdk/network/model/AdmCreativeFormat;", "getRenderingActivity", "getRtbCacheMonitorListener", "Lcom/mobilefuse/sdk/AdmCacheMonitor$Listener;", "getSdkNameForAdRequest", "getWinningBidInfo", "isAdRendering", "isAdVisibleOnScreen", "isDestroyed", "isLoadedFromBiddingToken", "isLoadedFromBiddingToken$mobilefuse_sdk_core_release", "isLockedSessionTestMode", "isTransparentBackground", "loadAd", "loadAdFromBiddingToken", "lockSessionTestMode", "newInstance", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onActivityDestroy", "onActivityPause", "onActivityResume", "onActivityStart", "onActivityStop", "onAdLifecycleEvent", "event", "Lcom/mobilefuse/sdk/AdLifecycleEvent;", "onAdLifecycleEvent$mobilefuse_sdk_core_release", "extendedAdType", "extraParams", "", "onAdRepositoryResponse", "response", "onAllAdAssetsPreloaded", "onAllAdAssetsPreloaded$mobilefuse_sdk_core_release", "sendBidLossReason", "reason", "Lcom/mobilefuse/sdk/internal/RtbLossReason;", "sendBidLossReason$mobilefuse_sdk_core_release", "setAdBackgroundColor", "setFullscreenAdBridge", "bridge", "setRenderingActivity", "activity", "showFullscreenAd", "showInlineAd", "Landroid/view/View;", "updateState", "newState", "updateTestMode", "verifyLossReason", "verifyTelemetryLogs", "AdListener", "AdState", "AdType", "FullscreenAdBridge", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes8.dex */
public final class AdController {
    private int adBackgroundColor;
    private final int adHeight;

    @NotNull
    private final AdInstanceInfo adInstanceInfo;

    @Nullable
    public AdListener adListener;
    private final AdMuteStateManager adMuteStateManager;

    @Nullable
    private BaseAdRenderer<?> adRenderer;

    @Nullable
    private AdRendererConfig adRendererConfig;

    @Nullable
    private AdRepository<ParsedAdMarkupResponse> adRepository;

    @NotNull
    public AdState adState;

    @NotNull
    private final AdType adType;
    private final int adWidth;
    private AdmCacheMonitor admCacheMonitor;

    @Nullable
    public MfxBidResponse bidResponse;

    @NotNull
    private final Context context;

    @Nullable
    private FullscreenAdBridge fullscreenAdBridge;
    private boolean hasAdRendered;
    private boolean loadedFromBiddingToken;
    private boolean lockedSessionTestMode;
    private boolean lossUrlHasBeenCalled;

    @Nullable
    private ObservableConfig observableConfig;

    @NotNull
    private final String placementId;

    @Nullable
    public Activity renderingActivity;
    private TelemetryAgent telemetryAgent;

    @Nullable
    private WinningBidInfo winningBidInfo;

    /* compiled from: AdController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0018"}, d2 = {"Lcom/mobilefuse/sdk/AdController$AdListener;", "", Zf.f, "", "url", "", Zf.g, "onAdControllerUpdated", "newAdController", "Lcom/mobilefuse/sdk/AdController;", TelemetryAdLifecycleEvent.AD_ERROR, "error", "Lcom/mobilefuse/sdk/AdError;", "onAdExpired", "expiry", "", Zf.j, "onAdNotFilled", "reason", "", "onAdRendered", "onFullscreenChanged", "isFullscreen", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public interface AdListener {
        void onAdClicked(@NotNull String url) throws Throwable;

        void onAdClosed() throws Throwable;

        void onAdControllerUpdated(@NotNull AdController newAdController) throws Throwable;

        void onAdError(@NotNull AdError error) throws Throwable;

        void onAdExpired(float expiry) throws Throwable;

        void onAdLoaded() throws Throwable;

        void onAdNotFilled(int reason) throws Throwable;

        void onAdRendered() throws Throwable;

        void onFullscreenChanged(boolean isFullscreen) throws Throwable;
    }

    /* compiled from: AdController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/AdController$AdState;", "", "(Ljava/lang/String;I)V", "IDLE", "LOADING", POBOMSDKLogConstants.MSG_OMSDK_LOADED_EVENT, "NOT_FILLED", "RENDERED", "CLOSED", "RTB_EXPIRED", "DESTROYED", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public enum AdState {
        IDLE,
        LOADING,
        LOADED,
        NOT_FILLED,
        RENDERED,
        CLOSED,
        RTB_EXPIRED,
        DESTROYED
    }

    /* compiled from: AdController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/AdController$FullscreenAdBridge;", "", Zf.g, "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public interface FullscreenAdBridge {
        void onAdClosed();
    }

    private final void cacheAdAssets() throws Throwable {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            createAdRenderer();
            BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
            if (baseAdRenderer != null) {
                if (baseAdRenderer != null) {
                    baseAdRenderer.preloadAd(getAdm());
                }
            } else {
                updateState(AdState.NOT_FILLED);
                AdListener adListener = this.adListener;
                if (adListener != null) {
                    adListener.onAdNotFilled(2);
                }
            }
        } catch (Throwable th) {
            int i = AdController$cacheAdAssets$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdRepositoryResponse(ParsedAdMarkupResponse response) throws Throwable {
        MfxBidResponse mfxBidResponse;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            onAdLifecycleEvent$mobilefuse_sdk_core_release(BaseAdLifecycleEvent.AD_DATA_LOAD_COMPLETED, new HashMap());
            this.bidResponse = response.getBidResponse();
            updateTestMode();
            MfxBidResponse mfxBidResponse2 = this.bidResponse;
            this.winningBidInfo = mfxBidResponse2 != null ? MfxBidResponseToWinningBidInfoKt.getWinningBidInfo(mfxBidResponse2) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("Winning bid received with CRID: ");
            WinningBidInfo winningBidInfo = this.winningBidInfo;
            sb.append(winningBidInfo != null ? winningBidInfo.getCreativeId() : null);
            DebuggingKt.logDebug$default(this, sb.toString(), null, 2, null);
            if (!getLoadedFromBiddingToken() && (mfxBidResponse = this.bidResponse) != null) {
                int expires = mfxBidResponse.getExpires();
                AdmCacheMonitor admCacheMonitor = this.admCacheMonitor;
                if (admCacheMonitor != null) {
                    admCacheMonitor.startMonitor(expires);
                }
            }
            cacheAdAssets();
            verifyTelemetryLogs();
        } catch (Throwable th) {
            int i = AdController$onAdRepositoryResponse$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void updateTestMode() {
        Boolean forceTestMode;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            MfxBidResponse mfxBidResponse = this.bidResponse;
            if (mfxBidResponse == null || (forceTestMode = mfxBidResponse.getForceTestMode()) == null) {
                return;
            }
            MobileFuseSettings.setTestModeOverrideFromServer(forceTestMode.booleanValue());
            lockSessionTestMode();
        } catch (Throwable th) {
            int i = AdController$updateTestMode$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void verifyTelemetryLogs() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            MfxBidResponse mfxBidResponse = this.bidResponse;
            if (Intrinsics.areEqual(mfxBidResponse != null ? mfxBidResponse.getForceLogging() : null, Boolean.TRUE)) {
                TelemetryManager.INSTANCE.enableStructuredLogs();
            }
        } catch (Throwable th) {
            int i = AdController$verifyTelemetryLogs$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public AdController(@NotNull Context context, @NotNull String placementId, @NotNull AdType adType, @NotNull AdInstanceInfo adInstanceInfo, int i, int i2, @Nullable ObservableConfig observableConfig, @Nullable AdListener adListener, @NotNull AdMuteStateManager adMuteStateManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        Intrinsics.checkNotNullParameter(adMuteStateManager, "adMuteStateManager");
        this.context = context;
        this.placementId = placementId;
        this.adType = adType;
        this.adInstanceInfo = adInstanceInfo;
        this.adWidth = i;
        this.adHeight = i2;
        this.observableConfig = observableConfig;
        this.adListener = adListener;
        this.adMuteStateManager = adMuteStateManager;
        this.adState = AdState.IDLE;
        this.telemetryAgent = adInstanceInfo.telemetryAgent;
        this.adBackgroundColor = -1;
        this.admCacheMonitor = new AdmCacheMonitor(this, getRtbCacheMonitorListener());
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    public final AdType getAdType() {
        return this.adType;
    }

    @NotNull
    public final AdInstanceInfo getAdInstanceInfo() {
        return this.adInstanceInfo;
    }

    public final int getAdWidth() {
        return this.adWidth;
    }

    public final int getAdHeight() {
        return this.adHeight;
    }

    @Nullable
    public final ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    public final void setObservableConfig(@Nullable ObservableConfig observableConfig) {
        this.observableConfig = observableConfig;
    }

    @Nullable
    public final AdRepository<ParsedAdMarkupResponse> getAdRepository$mobilefuse_sdk_core_release() {
        return this.adRepository;
    }

    public final void setAdRepository$mobilefuse_sdk_core_release(@Nullable AdRepository<ParsedAdMarkupResponse> adRepository) {
        this.adRepository = adRepository;
    }

    @Nullable
    public final WinningBidInfo getWinningBidInfo$mobilefuse_sdk_core_release() {
        return this.winningBidInfo;
    }

    public final void setWinningBidInfo$mobilefuse_sdk_core_release(@Nullable WinningBidInfo winningBidInfo) {
        this.winningBidInfo = winningBidInfo;
    }

    @Nullable
    /* renamed from: getAdRendererConfig$mobilefuse_sdk_core_release, reason: from getter */
    public final AdRendererConfig getAdRendererConfig() {
        return this.adRendererConfig;
    }

    public final void setAdRendererConfig$mobilefuse_sdk_core_release(@Nullable AdRendererConfig adRendererConfig) {
        this.adRendererConfig = adRendererConfig;
    }

    @Nullable
    public final BaseAdRenderer<?> getAdRenderer$mobilefuse_sdk_core_release() {
        return this.adRenderer;
    }

    public final void setAdRenderer$mobilefuse_sdk_core_release(@Nullable BaseAdRenderer<?> baseAdRenderer) {
        this.adRenderer = baseAdRenderer;
    }

    public final int getAdBackgroundColor$mobilefuse_sdk_core_release() {
        return this.adBackgroundColor;
    }

    public final void setAdBackgroundColor$mobilefuse_sdk_core_release(int i) {
        this.adBackgroundColor = i;
    }

    @Nullable
    /* renamed from: getFullscreenAdBridge$mobilefuse_sdk_core_release, reason: from getter */
    public final FullscreenAdBridge getFullscreenAdBridge() {
        return this.fullscreenAdBridge;
    }

    public final void setFullscreenAdBridge$mobilefuse_sdk_core_release(@Nullable FullscreenAdBridge fullscreenAdBridge) {
        this.fullscreenAdBridge = fullscreenAdBridge;
    }

    public final void loadAd() throws Throwable {
        if (this.adState == AdState.DESTROYED) {
            return;
        }
        if (!canLoadAd()) {
            DebuggingKt.logDebug$default(this, "Ad can't be loaded. Current state is: " + this.adState, null, 2, null);
            AdListener adListener = this.adListener;
            if (adListener != null) {
                adListener.onAdError(AdError.AD_ALREADY_LOADED);
                return;
            }
            return;
        }
        this.loadedFromBiddingToken = false;
        lockSessionTestMode();
        onAdLifecycleEvent$mobilefuse_sdk_core_release(BaseAdLifecycleEvent.AD_DATA_LOAD_STARTED, new HashMap());
        updateState(AdState.LOADING);
        Telemetry.INSTANCE.reportAdMetric(this.adInstanceInfo.createTelemetryAdInfo(), MetricRecordName.ON_AD_LOADED);
        MfxAdRepository mfxAdRepository = new MfxAdRepository(this.telemetryAgent, createAdLoadingConfig(), new Function1() { // from class: com.mobilefuse.sdk.AdController$loadAd$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final AdmParser invoke(@NotNull AdmMediaType it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new BasicAdParser();
            }
        }, new Function5() { // from class: com.mobilefuse.sdk.AdController$loadAd$2
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Boolean) obj4).booleanValue(), (Float) obj5);
            }

            @NotNull
            public final MfxBidRequest invoke(@NotNull String placementId, int i, int i2, boolean z, @Nullable Float f) {
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                return MfxRequestAdKt.createMfxBidRequest(placementId, i, i2, z, f);
            }
        }, HttpClientKt.getDefaultHttpClient());
        this.adRepository = mfxAdRepository;
        mfxAdRepository.loadAd(new Function1() { // from class: com.mobilefuse.sdk.AdController$loadAd$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BaseError) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull BaseError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AdController.this.updateState(AdController.AdState.NOT_FILLED);
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AdController.AdListener adListener2 = AdController.this.adListener;
                    if (adListener2 != null) {
                        adListener2.onAdNotFilled(1);
                    }
                } catch (Throwable th) {
                    int i = AdController$loadAd$3$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }, new Function1() { // from class: com.mobilefuse.sdk.AdController$loadAd$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ParsedAdMarkupResponse) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ParsedAdMarkupResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    AdController.this.onAdRepositoryResponse(response);
                } catch (Throwable th) {
                    AdController adController = AdController.this;
                    StabilityHelper.logAdErrorException(adController, th, adController.getObservableConfig(), AdError.AD_LOAD_ERROR);
                }
            }
        });
    }

    private final AdLoadingConfig createAdLoadingConfig() {
        int nextConfigUid = AdLoadingConfig.INSTANCE.nextConfigUid();
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig == null) {
            observableConfig = new ObservableConfig();
        }
        return new AdLoadingConfig(nextConfigUid, observableConfig, this.adWidth, this.adHeight, this.lockedSessionTestMode, this.adType.name(), this.placementId, this.adInstanceInfo.instanceId);
    }

    public final void loadAdFromBiddingToken(@Nullable String bidResponse) throws Throwable {
        if (isDestroyed()) {
            return;
        }
        MobileFuseServices.requireAllServices();
        if (!canLoadAd()) {
            DebuggingKt.logDebug$default(this, "Ad can't be loaded. Current state is: " + this.adState, null, 2, null);
            AdListener adListener = this.adListener;
            if (adListener != null) {
                adListener.onAdError(AdError.AD_ALREADY_LOADED);
                return;
            }
            return;
        }
        this.loadedFromBiddingToken = true;
        if (TextUtils.isEmpty(bidResponse)) {
            AdListener adListener2 = this.adListener;
            if (adListener2 != null) {
                adListener2.onAdNotFilled(2);
                return;
            }
            return;
        }
        if (bidResponse == null) {
            throw new IllegalStateException("Required value was null.");
        }
        lockSessionTestMode();
        onAdLifecycleEvent$mobilefuse_sdk_core_release(BaseAdLifecycleEvent.AD_DATA_LOAD_STARTED, new HashMap());
        updateState(AdState.LOADING);
        Telemetry.INSTANCE.reportAdMetric(this.adInstanceInfo.createTelemetryAdInfo(), MetricRecordName.ON_AD_LOADED);
        BiddingAdRepository biddingAdRepository = new BiddingAdRepository(bidResponse, this.telemetryAgent, createAdLoadingConfig(), new Function1() { // from class: com.mobilefuse.sdk.AdController$loadAdFromBiddingToken$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final AdmParser invoke(@NotNull AdmMediaType it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new BasicAdParser();
            }
        });
        this.adRepository = biddingAdRepository;
        biddingAdRepository.loadAd(new Function1() { // from class: com.mobilefuse.sdk.AdController$loadAdFromBiddingToken$2
            {
                super(1);
            }

            public final void invoke(@NotNull BaseError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AdController.this.updateState(AdController.AdState.NOT_FILLED);
                    AdController.AdListener adListener3 = AdController.this.adListener;
                    if (adListener3 != null) {
                        adListener3.onAdNotFilled(1);
                    }
                } catch (Throwable th) {
                    int i = AdController$loadAdFromBiddingToken$2$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BaseError) obj);
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.mobilefuse.sdk.AdController$loadAdFromBiddingToken$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ParsedAdMarkupResponse) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ParsedAdMarkupResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    AdController.this.onAdRepositoryResponse(response);
                } catch (Throwable th) {
                    AdController adController = AdController.this;
                    StabilityHelper.logAdErrorException(adController, th, adController.getObservableConfig(), AdError.AD_LOAD_ERROR);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void createAdRenderer() throws Throwable {
        ExtendedAdType extendedAdType;
        ExtendedAdType extendedAdType2;
        MfxBidResponse mfxBidResponse;
        String adRendererType;
        BaseAdRenderer<?> baseAdRenderer;
        AdmMediaType type;
        if (isDestroyed() || this.bidResponse == null) {
            return;
        }
        AdRendererListener adRendererListener = new AdRendererListener() { // from class: com.mobilefuse.sdk.AdController$createAdRenderer$adRendererListener$1
            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClicked(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AdController.this.onAdLifecycleEvent$mobilefuse_sdk_core_release(BaseAdLifecycleEvent.AD_CLICKED);
                    AdController.AdListener adListener = AdController.this.adListener;
                    if (adListener != null) {
                        adListener.onAdClicked(url);
                    }
                } catch (Throwable th) {
                    int i = AdController$createAdRenderer$adRendererListener$1$onAdClicked$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClosed() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AdService.disposeFullscreenAdLock(AdController.this);
                    SensorService.updateSensors(AdController.this.getContext());
                    AdController.FullscreenAdBridge fullscreenAdBridge = AdController.this.getFullscreenAdBridge();
                    if (fullscreenAdBridge != null) {
                        fullscreenAdBridge.onAdClosed();
                    }
                    AdController.this.setFullscreenAdBridge$mobilefuse_sdk_core_release(null);
                    AdController adController = AdController.this;
                    adController.renderingActivity = null;
                    adController.updateState(AdController.AdState.CLOSED);
                    AdController.AdListener adListener = AdController.this.adListener;
                    if (adListener != null) {
                        adListener.onAdClosed();
                    }
                } catch (Throwable th) {
                    int i = AdController$createAdRenderer$adRendererListener$1$onAdClosed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdImpression() throws Throwable {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Telemetry.INSTANCE.reportAdMetric(AdController.this.getAdInstanceInfo().createTelemetryAdInfo(AdController.this.getObservableConfig()), MetricRecordName.ON_AD_RENDERED);
                    AdController.AdListener adListener = AdController.this.adListener;
                    if (adListener != null) {
                        adListener.onAdRendered();
                    }
                } catch (Throwable th) {
                    int i = AdController$createAdRenderer$adRendererListener$1$onAdImpression$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onFullscreenChanged(boolean isFullscreen) {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("fullscreen", String.valueOf(isFullscreen) + "");
                    AdController.this.onAdLifecycleEvent$mobilefuse_sdk_core_release(BaseAdLifecycleEvent.AD_FULLSCREEN_CHANGED, hashMap);
                    AdController.AdListener adListener = AdController.this.adListener;
                    if (adListener != null) {
                        adListener.onFullscreenChanged(isFullscreen);
                    }
                } catch (Throwable th) {
                    int i = AdController$createAdRenderer$adRendererListener$1$onFullscreenChanged$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onPreloadStatusChange(boolean isPreloaded) {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Boolean valueOf = Boolean.valueOf(isPreloaded);
                    if (!isPreloaded) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        AdController.this.onAllAdAssetsPreloaded$mobilefuse_sdk_core_release();
                    } else {
                        AdController.AdListener adListener = AdController.this.adListener;
                        if (adListener != null) {
                            adListener.onAdNotFilled(2);
                        }
                    }
                } catch (Throwable th) {
                    int i = AdController$createAdRenderer$adRendererListener$1$onPreloadStatusChange$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:10:0x0032, B:12:0x004a, B:15:0x005d, B:17:0x0063, B:42:0x0056), top: B:9:0x0032 }] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:20:0x0068, B:22:0x0070, B:23:0x0076, B:25:0x007e, B:27:0x0086, B:29:0x008e), top: B:19:0x0068 }] */
            @Override // com.mobilefuse.sdk.AdRendererListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onAdRuntimeError(@NotNull RtbLossReason error) {
                AdController.AdListener adListener;
                AdmCacheMonitor admCacheMonitor;
                BaseAdRenderer<?> adRenderer$mobilefuse_sdk_core_release;
                Intrinsics.checkNotNullParameter(error, "error");
                if (AdController.this.isDestroyed()) {
                    return;
                }
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                boolean z = true;
                try {
                    AdController.this.sendBidLossReason$mobilefuse_sdk_core_release(error);
                } catch (Throwable th) {
                    int i = AdController$createAdRenderer$adRendererListener$1$onAdRuntimeError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                try {
                    SensorService.updateSensors(AdController.this.getContext());
                    AdController.this.onAdLifecycleEvent$mobilefuse_sdk_core_release(BaseAdLifecycleEvent.AD_RUNTIME_ERROR);
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
                try {
                    if (!AdController.this.isAdLoaded()) {
                        if (AdController.this.isAdLoading()) {
                        }
                        adListener = AdController.this.adListener;
                        if (adListener != null) {
                            adListener.onAdError(AdError.AD_RUNTIME_ERROR);
                        }
                        admCacheMonitor = AdController.this.admCacheMonitor;
                        if (admCacheMonitor != null) {
                            admCacheMonitor.destroy();
                        }
                        if (AdController.this.getFullscreenAdBridge() != null || AdController.this.getAdRenderer$mobilefuse_sdk_core_release() == null || (adRenderer$mobilefuse_sdk_core_release = AdController.this.getAdRenderer$mobilefuse_sdk_core_release()) == null) {
                            return;
                        }
                        adRenderer$mobilefuse_sdk_core_release.requestAdClose();
                        return;
                    }
                    admCacheMonitor = AdController.this.admCacheMonitor;
                    if (admCacheMonitor != null) {
                    }
                    if (AdController.this.getFullscreenAdBridge() != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (!z) {
                        StabilityHelper.logAdRenderingException(this, th, AdController.this.getObservableConfig());
                        return;
                    } else {
                        StabilityHelper.logException(this, th);
                        return;
                    }
                }
                AdController.this.updateState(AdController.AdState.NOT_FILLED);
                adListener = AdController.this.adListener;
                if (adListener != null) {
                }
            }
        };
        if (this.adType == AdType.OMNI) {
            MfxBidResponse mfxBidResponse2 = this.bidResponse;
            if (mfxBidResponse2 == null || (type = mfxBidResponse2.getType()) == null) {
                return;
            }
            MfxBidResponse mfxBidResponse3 = this.bidResponse;
            extendedAdType2 = getOmniExtendedAdType(type, mfxBidResponse3 != null ? mfxBidResponse3.getCreativeFormat() : null);
            if (extendedAdType2 == null) {
                return;
            }
        } else {
            MfxBidResponse mfxBidResponse4 = this.bidResponse;
            if ((mfxBidResponse4 != null ? mfxBidResponse4.getCreativeFormat() : null) == AdmCreativeFormat.TRANSPARENT_INTERSTITIAL) {
                extendedAdType2 = MraidAdRenderer.MraidExtendedAdType.INTERSTITIAL_TRANSPARENT;
            } else {
                extendedAdType = null;
                String sdkNameForAdRequest = getSdkNameForAdRequest();
                MobileFuse.Companion companion = MobileFuse.INSTANCE;
                this.adRendererConfig = new AdRendererConfig(sdkNameForAdRequest, companion.getSdkVersion(), MobileFuseSettings.getAdvertisingId(), PrivacyCenter.isSdkLimitedToSendUserDataJavaLegacy(), companion.getPrivacyPreferences().isSubjectToCoppa(), this.lockedSessionTestMode, this.adType == AdType.BANNER, false, false, isTransparentBackground(), this.adWidth, this.adHeight, null, extendedAdType, this.observableConfig, this.adInstanceInfo.instanceId, null, null, this.adMuteStateManager, 201088, null);
                mfxBidResponse = this.bidResponse;
                if (mfxBidResponse != null) {
                    ObservableConfig observableConfig = this.observableConfig;
                    if (observableConfig != null) {
                        Apply_BidResponse_to_ObservableConfigKt.applyConfigFromBidResponse(observableConfig, mfxBidResponse);
                    }
                    this.adRenderer = AdRendererFactory.getAdRenderer(this.context, mfxBidResponse.getType(), this.adRendererConfig, adRendererListener);
                }
                if (this.adRenderer != null) {
                    DebuggingKt.logDebug$default(this, "Can't create ad renderer by renderer factory", null, 2, null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                BaseAdRenderer<?> baseAdRenderer2 = this.adRenderer;
                if (baseAdRenderer2 == null || (adRendererType = TelemetrySdkActionFactory.getAdRendererType(baseAdRenderer2.getClass().getName())) == null) {
                    return;
                }
                arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_RENDERER, adRendererType, true));
                this.telemetryAgent.onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_INSTANCE_RENDERER_CREATED.updateExtraMessageField(adRendererType), this.adInstanceInfo, arrayList));
                this.adInstanceInfo.renderType = adRendererType;
                BaseAdRenderer<?> baseAdRenderer3 = this.adRenderer;
                if (baseAdRenderer3 != null) {
                    baseAdRenderer3.setAdLifecycleEventListener(new AdController$sam$com_mobilefuse_sdk_AdLifecycleEventListener$0(new AdController$createAdRenderer$3(this)));
                }
                BaseAdRenderer<?> baseAdRenderer4 = this.adRenderer;
                if (baseAdRenderer4 != null) {
                    baseAdRenderer4.setAdBackgroundColor(this.adBackgroundColor);
                }
                Activity activity = this.renderingActivity;
                if (activity == null || (baseAdRenderer = this.adRenderer) == null) {
                    return;
                }
                baseAdRenderer.renderingActivity = activity;
                return;
            }
        }
        extendedAdType = extendedAdType2;
        String sdkNameForAdRequest2 = getSdkNameForAdRequest();
        MobileFuse.Companion companion2 = MobileFuse.INSTANCE;
        this.adRendererConfig = new AdRendererConfig(sdkNameForAdRequest2, companion2.getSdkVersion(), MobileFuseSettings.getAdvertisingId(), PrivacyCenter.isSdkLimitedToSendUserDataJavaLegacy(), companion2.getPrivacyPreferences().isSubjectToCoppa(), this.lockedSessionTestMode, this.adType == AdType.BANNER, false, false, isTransparentBackground(), this.adWidth, this.adHeight, null, extendedAdType, this.observableConfig, this.adInstanceInfo.instanceId, null, null, this.adMuteStateManager, 201088, null);
        mfxBidResponse = this.bidResponse;
        if (mfxBidResponse != null) {
        }
        if (this.adRenderer != null) {
        }
    }

    private final ExtendedAdType getOmniExtendedAdType(AdmMediaType mediaType, AdmCreativeFormat creativeFormat) {
        if (mediaType == AdmMediaType.VIDEO) {
            return VastAdRenderer.VastExtendedAdType.THUMBNAIL;
        }
        if (mediaType == AdmMediaType.BANNER) {
            if (creativeFormat == AdmCreativeFormat.OMNI_BREAKOUT) {
                return MraidAdRenderer.MraidExtendedAdType.SPLASH;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Can't create Ad Renderer for media type ");
            sb.append(this.adType);
            sb.append(" and creative format: ");
            MfxBidResponse mfxBidResponse = this.bidResponse;
            sb.append(mfxBidResponse != null ? mfxBidResponse.getCreativeFormat() : null);
            DebuggingKt.logDebug$default(this, sb.toString(), null, 2, null);
            return null;
        }
        DebuggingKt.logDebug$default(this, "Media type " + mediaType + " is not supported for Omni Ad", null, 2, null);
        return null;
    }

    public final void onAllAdAssetsPreloaded$mobilefuse_sdk_core_release() throws Throwable {
        updateState(AdState.LOADED);
        Telemetry.INSTANCE.reportAdMetric(this.adInstanceInfo.createTelemetryAdInfo(), MetricRecordName.ON_AD_READY);
        AdListener adListener = this.adListener;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    public final void showFullscreenAd() throws Throwable {
        AdType adType = this.adType;
        AdType adType2 = AdType.INTERSTITIAL;
        if (adType == adType2 || adType == AdType.REWARDED || adType == AdType.OMNI) {
            boolean z = adType == AdType.OMNI;
            Activity currentActivity = AppLifecycleHelper.getCurrentActivity();
            if (z && currentActivity == null) {
                AdListener adListener = this.adListener;
                if (adListener != null) {
                    adListener.onAdError(AdError.AD_RUNTIME_ERROR);
                    return;
                }
                return;
            }
            AdType adType3 = this.adType;
            if ((adType3 == adType2 || adType3 == AdType.REWARDED) && !AdService.acquireFullscreenAdLock(this)) {
                AdListener adListener2 = this.adListener;
                if (adListener2 != null) {
                    adListener2.onAdError(AdError.AD_ALREADY_RENDERED);
                    return;
                }
                return;
            }
            if (z) {
                if (currentActivity != null) {
                    setRenderingActivity(currentActivity);
                }
                AdmCacheMonitor admCacheMonitor = this.admCacheMonitor;
                if (admCacheMonitor != null) {
                    admCacheMonitor.destroy();
                }
                updateState(AdState.RENDERED);
                this.hasAdRendered = true;
                BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
                if (baseAdRenderer != null) {
                    baseAdRenderer.renderAd();
                    return;
                }
                return;
            }
            AdService.showFullscreenAd(this);
        }
    }

    public final void lockSessionTestMode() throws Throwable {
        if (MobileFuseSettings.isTestModeOverrideFromServer()) {
            this.lockedSessionTestMode = true;
            return;
        }
        if (MobileFuseSettings.isTestMode()) {
            this.lockedSessionTestMode = true;
            return;
        }
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig == null) {
            this.lockedSessionTestMode = false;
        } else {
            this.lockedSessionTestMode = observableConfig != null ? ObservableConfig.getBooleanValue$default(observableConfig, ObservableConfigKey.TEST_MODE, false, 2, null) : false;
        }
    }

    public final void setFullscreenAdBridge(@NotNull FullscreenAdBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.fullscreenAdBridge = bridge;
    }

    public final void closeFullscreenAd() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer;
        if (isAdRendering() && (baseAdRenderer = this.adRenderer) != null) {
            baseAdRenderer.requestAdClose();
        }
    }

    @Nullable
    public final View showInlineAd() throws Throwable {
        if (isDestroyed()) {
            return null;
        }
        if (this.hasAdRendered) {
            AdListener adListener = this.adListener;
            if (adListener != null) {
                adListener.onAdError(AdError.AD_ALREADY_RENDERED);
            }
            return null;
        }
        AdmCacheMonitor admCacheMonitor = this.admCacheMonitor;
        if (admCacheMonitor != null) {
            admCacheMonitor.destroy();
        }
        updateState(AdState.RENDERED);
        this.hasAdRendered = true;
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.renderAd();
        }
        BaseAdRenderer<?> baseAdRenderer2 = this.adRenderer;
        if (baseAdRenderer2 != null) {
            return baseAdRenderer2.getAdViewProperty();
        }
        return null;
    }

    @Nullable
    public final String getAdm() {
        MfxBidResponse mfxBidResponse = this.bidResponse;
        if (mfxBidResponse != null) {
            return mfxBidResponse.getAdm();
        }
        return null;
    }

    public final boolean isTransparentBackground() throws Throwable {
        AdmCreativeFormat creativeFormat;
        MfxBidResponse mfxBidResponse = this.bidResponse;
        if (mfxBidResponse == null || (creativeFormat = mfxBidResponse.getCreativeFormat()) == null) {
            return false;
        }
        return creativeFormat.getIsTransparent();
    }

    public final int getAdBackgroundColor() {
        return this.adBackgroundColor;
    }

    public final void setAdBackgroundColor(int adBackgroundColor) throws Throwable {
        this.adBackgroundColor = adBackgroundColor;
        applyCurrentBackgroundColor();
    }

    private final void applyCurrentBackgroundColor() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer;
        int i = this.adBackgroundColor;
        if (i == -1 || (baseAdRenderer = this.adRenderer) == null) {
            return;
        }
        baseAdRenderer.setAdBackgroundColor(i);
    }

    public final boolean isAdVisibleOnScreen() {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            return baseAdRenderer._isVisibleOnScreen();
        }
        return false;
    }

    public final void setRenderingActivity(@NotNull Activity activity) throws Throwable {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.renderingActivity = activity;
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            AppLifecycleHelper.tryToRefreshFirstActivity(activity);
            baseAdRenderer.renderingActivity = activity;
        }
    }

    @Nullable
    public final Activity getRenderingActivity() {
        return this.renderingActivity;
    }

    public final boolean isAdLoaded() {
        return this.adState == AdState.LOADED;
    }

    public final boolean isAdRendering() {
        return this.adState == AdState.RENDERED;
    }

    public final boolean isAdLoading() {
        return this.adState == AdState.LOADING;
    }

    public final boolean canLoadAd() {
        AdState adState = this.adState;
        return adState == AdState.IDLE || adState == AdState.CLOSED || adState == AdState.NOT_FILLED;
    }

    /* renamed from: isLockedSessionTestMode, reason: from getter */
    public final boolean getLockedSessionTestMode() {
        return this.lockedSessionTestMode;
    }

    public final void updateState(@NotNull AdState newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.adState = newState;
    }

    public final boolean isDestroyed() {
        return this.adState == AdState.DESTROYED;
    }

    private final void destroyAdRenderer() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.destroy();
        }
        this.adRenderer = null;
    }

    public final void verifyLossReason() {
        AdState adState = this.adState;
        if (adState == AdState.LOADED || adState == AdState.LOADING) {
            sendBidLossReason$mobilefuse_sdk_core_release(RtbLossReason.AD_DESTROYED_BEFORE_SHOW_CALLED);
        }
    }

    public final void destroy() throws Throwable {
        verifyLossReason();
        if (isDestroyed()) {
            return;
        }
        AdmCacheMonitor admCacheMonitor = this.admCacheMonitor;
        if (admCacheMonitor != null) {
            admCacheMonitor.destroy();
        }
        this.admCacheMonitor = null;
        this.observableConfig = null;
        destroyAdRenderer();
        this.adRendererConfig = null;
        this.adRepository = null;
        updateState(AdState.DESTROYED);
        this.adListener = null;
        this.renderingActivity = null;
    }

    public final void onActivityStart() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityStart();
        }
    }

    public final void onActivityResume() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityResume();
        }
    }

    public final void onActivityPause() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityPause();
        }
    }

    public final void onActivityStop() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityStop();
        }
    }

    public final void onActivityDestroy() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.onActivityDestroy();
        }
    }

    public final void onAdLifecycleEvent$mobilefuse_sdk_core_release(@NotNull AdLifecycleEvent event) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        onAdLifecycleEvent$mobilefuse_sdk_core_release(event, null);
    }

    public final void onAdLifecycleEvent$mobilefuse_sdk_core_release(@NotNull AdLifecycleEvent event, @Nullable Map<String, String> extraParams) throws Throwable {
        ExtendedAdType extendedAdType;
        Intrinsics.checkNotNullParameter(event, "event");
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer == null || (extendedAdType = baseAdRenderer.extendedAdType) == null) {
            extendedAdType = BaseExtendedAdType.UNKNOWN;
        }
        onAdLifecycleEvent(event, extendedAdType, extraParams);
    }

    public final void onAdLifecycleEvent(@NotNull AdLifecycleEvent event, @NotNull ExtendedAdType extendedAdType, @Nullable Map<String, String> extraParams) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(extendedAdType, "extendedAdType");
        DebuggingKt.logDebug$default(this, "onAdLifecycleEvent [placementId:  " + this.placementId + ", event: " + event + " adType: " + this.adType.getValue() + " extendedAdType: " + extendedAdType + ']', null, 2, null);
    }

    public final void sendBidLossReason$mobilefuse_sdk_core_release(@NotNull RtbLossReason reason) {
        MfxBidResponse mfxBidResponse;
        Intrinsics.checkNotNullParameter(reason, "reason");
        MfxBidResponse mfxBidResponse2 = this.bidResponse;
        if (mfxBidResponse2 == null || this.lossUrlHasBeenCalled || this.hasAdRendered) {
            return;
        }
        this.lossUrlHasBeenCalled = true;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        if (mfxBidResponse2 != null) {
            try {
                String lossUrl = mfxBidResponse2.getLossUrl();
                if (lossUrl == null || lossUrl.length() == 0 || (mfxBidResponse = this.bidResponse) == null) {
                    return;
                }
                BidLossService.sendBidLoss(lossUrl, (float) mfxBidResponse.getCpm(), reason);
            } catch (Throwable th) {
                int i = AdController$sendBidLossReason$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    private final AdmCacheMonitor.Listener getRtbCacheMonitorListener() {
        return new AdmCacheMonitor.Listener() { // from class: com.mobilefuse.sdk.AdController$getRtbCacheMonitorListener$1
            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onNewAdLoadFailed() {
            }

            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onNewAdRequested() {
            }

            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onNewAdFullyLoaded(@Nullable AdController adController) {
                AdController.AdListener adListener;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AdController.this.sendBidLossReason$mobilefuse_sdk_core_release(RtbLossReason.IMPRESSION_OPPORTUNITY_EXPIRED);
                    if (adController == null || (adListener = AdController.this.adListener) == null) {
                        return;
                    }
                    adListener.onAdControllerUpdated(adController);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    int i = AdController$getRtbCacheMonitorListener$1$onNewAdFullyLoaded$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onAdmCacheExpired() {
                AdController.this.sendBidLossReason$mobilefuse_sdk_core_release(RtbLossReason.IMPRESSION_OPPORTUNITY_EXPIRED);
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AdController.this.updateState(AdController.AdState.RTB_EXPIRED);
                } catch (Throwable th) {
                    int i = AdController$getRtbCacheMonitorListener$1$onAdmCacheExpired$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdmCacheMonitor.Listener
            public void onAdExpired(float expiry) {
                AdController.this.sendBidLossReason$mobilefuse_sdk_core_release(RtbLossReason.IMPRESSION_OPPORTUNITY_EXPIRED);
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AdController.AdListener adListener = AdController.this.adListener;
                    if (adListener != null) {
                        adListener.onAdExpired(expiry);
                    }
                } catch (Throwable th) {
                    int i = AdController$getRtbCacheMonitorListener$1$onAdExpired$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        };
    }

    /* compiled from: AdController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/AdController$AdType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BANNER", "INTERSTITIAL", "OMNI", BrandSafetyUtils.k, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public enum AdType {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        OMNI("omni"),
        REWARDED("rewarded");


        @NotNull
        private final String value;

        AdType(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Nullable
    public final WinningBidInfo getWinningBidInfo() {
        return this.winningBidInfo;
    }

    private final String getSdkNameForAdRequest() {
        return "MobileFuse Ads";
    }

    @NotNull
    public final AdController newInstance(@Nullable AdListener listener) throws Throwable {
        AdController adController = new AdController(this.context, this.placementId, this.adType, this.adInstanceInfo, this.adWidth, this.adHeight, this.observableConfig, listener, this.adMuteStateManager);
        adController.renderingActivity = this.renderingActivity;
        return adController;
    }

    /* renamed from: isLoadedFromBiddingToken$mobilefuse_sdk_core_release, reason: from getter */
    public final boolean getLoadedFromBiddingToken() {
        return this.loadedFromBiddingToken;
    }
}
