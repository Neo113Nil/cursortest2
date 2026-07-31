package com.mobilefuse.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.component.MraidAdRendererComponent;
import com.mobilefuse.sdk.component.VastAdRendererComponent;
import com.mobilefuse.sdk.config.ExternalUsageInfo;
import com.mobilefuse.sdk.config.UsageInfoType;
import com.mobilefuse.sdk.core.BuildConfig;
import com.mobilefuse.sdk.device.UserAgentInfoKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.identity.EidService;
import com.mobilefuse.sdk.identity.IdentifierUpdateSignal;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.storyboard.StoryboardAdRenderComponent;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.yandex.div.core.timer.TimerController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* compiled from: MobileFuseSettings.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u00020)H\u0007J\u001c\u0010*\u001a\u00020)2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001fH\u0007J\n\u0010,\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010-\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010.\u001a\u00020\u000eH\u0007J\b\u0010/\u001a\u00020\u0004H\u0007J\n\u00100\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u00101\u001a\u000202H\u0007J\b\u00103\u001a\u000204H\u0007J\b\u00105\u001a\u00020\u0004H\u0007J\u0012\u00106\u001a\u0004\u0018\u00010\u00042\u0006\u00107\u001a\u00020\u001aH\u0007J\n\u00108\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u00109\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010;\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010<\u001a\u0004\u0018\u00010\u00042\u0006\u0010=\u001a\u00020\u0004H\u0007J\b\u0010>\u001a\u00020\u0004H\u0007J\b\u0010?\u001a\u00020@H\u0007J\b\u0010A\u001a\u00020)H\u0007J\b\u0010B\u001a\u00020\u0014H\u0007J\b\u0010C\u001a\u00020\u0014H\u0007J\b\u0010D\u001a\u00020\u0014H\u0007J\b\u0010E\u001a\u00020\u0014H\u0007J\b\u0010F\u001a\u00020\u0014H\u0007J\r\u0010G\u001a\u00020)H\u0001¢\u0006\u0002\bHJ\u0012\u0010I\u001a\u00020)2\b\u0010J\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010K\u001a\u00020)2\u0006\u0010L\u001a\u00020\u0014H\u0007J\u0010\u0010M\u001a\u00020)2\u0006\u0010L\u001a\u00020\u0014H\u0007J\u0010\u0010N\u001a\u00020)2\u0006\u0010L\u001a\u00020\u0014H\u0007J\u0010\u0010O\u001a\u00020)2\u0006\u0010P\u001a\u000204H\u0007J\u0018\u0010Q\u001a\u00020)2\u0006\u00107\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020\u0004H\u0007J\u0018\u0010R\u001a\u00020)2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0004H\u0007J\u0018\u0010U\u001a\u00020)2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0004H\u0007J\u0010\u0010V\u001a\u00020)2\u0006\u0010L\u001a\u00020\u0014H\u0007J\u0010\u0010W\u001a\u00020)2\u0006\u0010L\u001a\u00020\u0014H\u0007J\u0010\u0010X\u001a\u00020)2\u0006\u0010Y\u001a\u00020@H\u0007J\b\u0010Z\u001a\u00020\u0014H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u0019j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0004`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148A@AX\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006["}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseSettings;", "", "()V", "advertisingId", "", "appName", "appPackageInfo", "Landroid/content/pm/PackageInfo;", "appSetId", "getAppSetId$mobilefuse_sdk_core_release", "()Ljava/lang/String;", "setAppSetId$mobilefuse_sdk_core_release", "(Ljava/lang/String;)V", "appVersionCode", "", "appVersionName", "deviceIp", "getDeviceIp$mobilefuse_sdk_core_release", "setDeviceIp$mobilefuse_sdk_core_release", "expiredAdReloading", "", "initialized", "limitTrackingEnabled", "logHttpRequests", "overrideSettings", "Ljava/util/HashMap;", "Lcom/mobilefuse/sdk/MobileFuseSetting;", "Lkotlin/collections/HashMap;", "spoofMode", "tabletDevice", "testCeltraIdsMap", "", "testMode", "<set-?>", "testModeOverrideFromServer", "isTestModeOverrideFromServer$annotations", "isTestModeOverrideFromServer", "()Z", "setTestModeOverrideFromServer", "(Z)V", "clearMaxInterstitialCloseButtonDelay", "", "configureTestCeltraIds", "configMap", "getAdvertisingId", "getAppName", "getAppVersionCode", "getAppVersionName", "getDeviceLanguage", "getMaxInterstitialCloseButtonDelayMs", "", "getMaxInterstitialCloseButtonDelaySeconds", "", "getMfxBidEndpointUrl", "getOverride", "setting", "getSdkAdapterName", "getSdkAdapterVersion", "getSdkModuleName", "getSdkModuleVersion", "getTestCeltraIdForPlacement", "placementId", "getUserAgent", "getVideoClickthroughBehaviour", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "initSettings", "isExpiredAdReloading", "isLimitTrackingEnabled", "isSpoofMode", "isTabletDevice", "isTestMode", TimerController.RESET_COMMAND, "reset$mobilefuse_sdk_core_release", "setAdvertisingId", "value", "setExpiredAdReloading", "newValue", "setLimitTrackingEnabled", "setLogHttpRequests", "setMaxInterstitialCloseButtonDelayInSeconds", "seconds", "setOverride", "setSdkAdapter", "name", "version", "setSdkModule", "setSpoofMode", "setTestMode", "setVideoClickthroughBehaviour", "behaviour", "shouldLogHttpRequests", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public final class MobileFuseSettings {
    private static String advertisingId;
    private static String appName;
    private static PackageInfo appPackageInfo;

    @Nullable
    private static String appSetId;
    private static int appVersionCode;
    private static String appVersionName;

    @Nullable
    private static String deviceIp;
    private static boolean initialized;
    private static boolean logHttpRequests;
    private static boolean spoofMode;
    private static boolean tabletDevice;
    private static Map<String, String> testCeltraIdsMap;
    private static boolean testMode;
    private static boolean testModeOverrideFromServer;

    @NotNull
    public static final MobileFuseSettings INSTANCE = new MobileFuseSettings();
    private static boolean limitTrackingEnabled = true;
    private static final HashMap<MobileFuseSetting, String> overrideSettings = new HashMap<>();
    private static boolean expiredAdReloading = true;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes3.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileFuseSetting.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[MobileFuseSetting.IFA.ordinal()] = 1;
            iArr[MobileFuseSetting.LMT.ordinal()] = 2;
        }
    }

    @Deprecated
    public static final void clearMaxInterstitialCloseButtonDelay() {
    }

    @Deprecated
    public static final long getMaxInterstitialCloseButtonDelayMs() {
        return 0L;
    }

    @Deprecated
    public static final float getMaxInterstitialCloseButtonDelaySeconds() {
        return 0.0f;
    }

    public static /* synthetic */ void isTestModeOverrideFromServer$annotations() {
    }

    @Deprecated
    public static final void setMaxInterstitialCloseButtonDelayInSeconds(float seconds) {
    }

    @Deprecated
    public static final void setVideoClickthroughBehaviour(@NotNull ClickthroughBehaviour behaviour) {
        Intrinsics.checkNotNullParameter(behaviour, "behaviour");
    }

    @Nullable
    public static final String getDeviceLanguage() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
            return locale.getLanguage();
        } catch (Throwable th) {
            int i = MobileFuseSettings$getDeviceLanguage$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
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

    @Nullable
    public static final String getTestCeltraIdForPlacement(@NotNull String placementId) {
        String str;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Map<String, String> map = testCeltraIdsMap;
            if (map != null && (str = map.get(placementId)) != null) {
                return str;
            }
            Map<String, String> map2 = testCeltraIdsMap;
            if (map2 == null) {
                return null;
            }
            String str2 = map2.get(Marker.ANY_MARKER);
            if (str2 != null) {
                return str2;
            }
            return null;
        } catch (Throwable th) {
            int i = MobileFuseSettings$getTestCeltraIdForPlacement$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
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

    public static final void setOverride(@NotNull MobileFuseSetting setting, @NotNull String value) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(value, "value");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            overrideSettings.put(setting, value);
            int i = WhenMappings.$EnumSwitchMapping$0[setting.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    limitTrackingEnabled = Boolean.parseBoolean(value);
                    EidService.INSTANCE.getService().handleSdkStateChanged(IdentifierUpdateSignal.LMT_CHANGED);
                }
            } else if (advertisingId != null) {
                advertisingId = value;
            }
        } catch (Throwable th) {
            int i2 = MobileFuseSettings$setOverride$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i2 == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final void setSpoofMode(boolean newValue) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.SPOOF_MODE, Boolean.valueOf(spoofMode), true));
            Telemetry.INSTANCE.onAction(TelemetryActionFactory.createWarnAction(MobileFuseSetting.class, TelemetryActionSdkEvents.SDK_SET_SPOOF_MODE_GLOBALLY.updateExtraMessageField(spoofMode ? "on" : "off"), arrayList));
        } catch (Throwable th) {
            int i = MobileFuseSettings$setSpoofMode$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        spoofMode = newValue;
    }

    public static final void setTestMode(boolean newValue) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.TEST_MODE, Boolean.valueOf(testMode), true));
            Telemetry.INSTANCE.onAction(TelemetryActionFactory.createWarnAction(MobileFuseSetting.class, TelemetryActionSdkEvents.SDK_SET_TEST_MODE_GLOBALLY.updateExtraMessageField(testMode ? "on" : "off"), arrayList));
        } catch (Throwable th) {
            int i = MobileFuseSettings$setTestMode$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        testMode = newValue;
    }

    static {
        SdkInitializer.ensureSdkSetup(true);
    }

    private MobileFuseSettings() {
    }

    @Nullable
    public final String getAppSetId$mobilefuse_sdk_core_release() {
        return appSetId;
    }

    public final void setAppSetId$mobilefuse_sdk_core_release(@Nullable String str) {
        appSetId = str;
    }

    @Nullable
    public final String getDeviceIp$mobilefuse_sdk_core_release() {
        return deviceIp;
    }

    public final void setDeviceIp$mobilefuse_sdk_core_release(@Nullable String str) {
        deviceIp = str;
    }

    @Nullable
    public static final String getOverride(@NotNull MobileFuseSetting setting) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(setting, "setting");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            errorResult = new SuccessResult(overrideSettings.get(setting));
        } catch (Throwable th) {
            if (MobileFuseSettings$getOverride$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            value = null;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (String) value;
    }

    public static final void initSettings() {
        if (initialized) {
            return;
        }
        initialized = true;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            MraidAdRendererComponent.INSTANCE.register();
            VastAdRendererComponent.INSTANCE.register();
            StoryboardAdRenderComponent.INSTANCE.register();
            TelemetryManager.Companion companion = TelemetryManager.INSTANCE;
            companion.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.11.0");
            companion.registerModule(com.mobilefuse.sdk.common.BuildConfig.LIBRARY_PACKAGE_NAME, "1.11.0");
            VideoPlayerSettings.Companion companion2 = VideoPlayerSettings.INSTANCE;
            companion2.setSdkName("MobileFuse Ads");
            companion2.setSdkVersion(MobileFuse.INSTANCE.getSdkVersion());
            Context globalContext = AppLifecycleHelper.getGlobalContext();
            appName = Utils.getApplicationName(globalContext);
            tabletDevice = Utils.isDeviceTypeTablet();
            PackageInfo packageInfo = Utils.getPackageInfo(globalContext);
            appPackageInfo = packageInfo;
            appVersionName = packageInfo != null ? packageInfo.versionName : null;
            appVersionCode = packageInfo != null ? packageInfo.versionCode : 0;
        } catch (Throwable th) {
            int i = MobileFuseSettings$initSettings$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @VisibleForTesting
    public static final void reset$mobilefuse_sdk_core_release() {
        initialized = false;
        appName = null;
        tabletDevice = false;
        testMode = false;
        spoofMode = false;
        appPackageInfo = null;
        appVersionName = null;
        appVersionCode = 0;
        advertisingId = null;
        limitTrackingEnabled = false;
        overrideSettings.clear();
        testCeltraIdsMap = null;
        expiredAdReloading = true;
        logHttpRequests = false;
        appSetId = null;
        deviceIp = null;
        ExternalUsageInfo.INSTANCE.clear();
    }

    @NotNull
    public static final String getAppVersionName() {
        String str = appVersionName;
        return str == null ? "" : str;
    }

    public static final boolean isTabletDevice() {
        return tabletDevice;
    }

    public static final void setLimitTrackingEnabled(boolean newValue) {
        if (getOverride(MobileFuseSetting.LMT) != null) {
            MobileFuse.INSTANCE.logDebug("Can't apply the lmt value because its override is active.");
        } else {
            limitTrackingEnabled = newValue;
            EidService.INSTANCE.getService().handleSdkStateChanged(IdentifierUpdateSignal.LMT_CHANGED);
        }
    }

    public static final boolean isLimitTrackingEnabled() {
        return limitTrackingEnabled;
    }

    public static final boolean isExpiredAdReloading() {
        return expiredAdReloading;
    }

    public static final void setExpiredAdReloading(boolean newValue) {
        expiredAdReloading = newValue;
    }

    public static final boolean isSpoofMode() {
        return spoofMode;
    }

    public static final void setLogHttpRequests(boolean newValue) {
        logHttpRequests = newValue;
        HttpRequestTracker.setEnabled(newValue);
    }

    public static final boolean shouldLogHttpRequests() {
        return logHttpRequests;
    }

    public static final void configureTestCeltraIds(@NotNull Map<String, String> configMap) {
        Intrinsics.checkNotNullParameter(configMap, "configMap");
        testCeltraIdsMap = configMap;
    }

    public static final void setSdkModule(@NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        ExternalUsageInfo.INSTANCE.addUsageInfo(UsageInfoType.MODULE, name, version);
    }

    public static final void setSdkAdapter(@NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        ExternalUsageInfo.INSTANCE.addUsageInfo(UsageInfoType.ADAPTER, name, version);
    }

    @Nullable
    public static final String getSdkModuleName() {
        return ExternalUsageInfo.INSTANCE.getUsageInfoName(UsageInfoType.MODULE);
    }

    @Nullable
    public static final String getSdkModuleVersion() {
        return ExternalUsageInfo.INSTANCE.getUsageInfoVersion(UsageInfoType.MODULE);
    }

    @Nullable
    public static final String getSdkAdapterName() {
        return ExternalUsageInfo.INSTANCE.getUsageInfoName(UsageInfoType.ADAPTER);
    }

    @Nullable
    public static final String getSdkAdapterVersion() {
        return ExternalUsageInfo.INSTANCE.getUsageInfoVersion(UsageInfoType.ADAPTER);
    }

    @NotNull
    public static final String getUserAgent() {
        return UserAgentInfoKt.getUserAgentInfo().getUserAgent();
    }

    @NotNull
    public static final String getMfxBidEndpointUrl() {
        String override = getOverride(MobileFuseSetting.MFX_BID_ENDPOINT_URL);
        return override == null ? BuildConfig.MFX_BID_ENDPOINT_URL : override;
    }

    public static final void setAdvertisingId(@Nullable String value) throws Throwable {
        String override = getOverride(MobileFuseSetting.IFA);
        if (override != null) {
            value = override;
        }
        advertisingId = value;
        EidService.INSTANCE.getService().handleSdkStateChanged(IdentifierUpdateSignal.IFA_CHANGED);
    }

    @Nullable
    public static final String getAdvertisingId() {
        return advertisingId;
    }

    public static final boolean isTestMode() {
        return testMode;
    }

    @Nullable
    public static final String getAppName() {
        return appName;
    }

    public static final int getAppVersionCode() {
        return appVersionCode;
    }

    public static final boolean isTestModeOverrideFromServer() {
        return testModeOverrideFromServer;
    }

    public static final void setTestModeOverrideFromServer(boolean z) {
        testModeOverrideFromServer = z;
    }

    @Deprecated
    @NotNull
    public static final ClickthroughBehaviour getVideoClickthroughBehaviour() {
        return MobileFuseDefaults.INSTANCE.getDEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR();
    }
}
