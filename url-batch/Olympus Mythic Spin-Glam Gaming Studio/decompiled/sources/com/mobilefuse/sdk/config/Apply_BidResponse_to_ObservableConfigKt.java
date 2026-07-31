package com.mobilefuse.sdk.config;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.logging.SdkLogger;
import com.mobilefuse.sdk.math.MathMf;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: apply_BidResponse_to_ObservableConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"applyConfigFromBidResponse", "", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "bidResponse", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public final class Apply_BidResponse_to_ObservableConfigKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f6 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001f, B:10:0x00e8, B:12:0x00f6, B:15:0x0102, B:16:0x010b, B:18:0x0111, B:19:0x011e, B:21:0x012d, B:23:0x013c, B:25:0x0142, B:26:0x0147, B:28:0x014d, B:29:0x0154, B:31:0x015c, B:32:0x0160, B:36:0x0135, B:37:0x002b, B:39:0x0031, B:40:0x0037, B:42:0x0047, B:44:0x0053, B:45:0x0059, B:46:0x00b6, B:48:0x00be, B:50:0x00c4, B:51:0x00cf, B:53:0x00d7, B:55:0x00dd, B:57:0x008e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0102 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001f, B:10:0x00e8, B:12:0x00f6, B:15:0x0102, B:16:0x010b, B:18:0x0111, B:19:0x011e, B:21:0x012d, B:23:0x013c, B:25:0x0142, B:26:0x0147, B:28:0x014d, B:29:0x0154, B:31:0x015c, B:32:0x0160, B:36:0x0135, B:37:0x002b, B:39:0x0031, B:40:0x0037, B:42:0x0047, B:44:0x0053, B:45:0x0059, B:46:0x00b6, B:48:0x00be, B:50:0x00c4, B:51:0x00cf, B:53:0x00d7, B:55:0x00dd, B:57:0x008e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0111 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001f, B:10:0x00e8, B:12:0x00f6, B:15:0x0102, B:16:0x010b, B:18:0x0111, B:19:0x011e, B:21:0x012d, B:23:0x013c, B:25:0x0142, B:26:0x0147, B:28:0x014d, B:29:0x0154, B:31:0x015c, B:32:0x0160, B:36:0x0135, B:37:0x002b, B:39:0x0031, B:40:0x0037, B:42:0x0047, B:44:0x0053, B:45:0x0059, B:46:0x00b6, B:48:0x00be, B:50:0x00c4, B:51:0x00cf, B:53:0x00d7, B:55:0x00dd, B:57:0x008e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0142 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001f, B:10:0x00e8, B:12:0x00f6, B:15:0x0102, B:16:0x010b, B:18:0x0111, B:19:0x011e, B:21:0x012d, B:23:0x013c, B:25:0x0142, B:26:0x0147, B:28:0x014d, B:29:0x0154, B:31:0x015c, B:32:0x0160, B:36:0x0135, B:37:0x002b, B:39:0x0031, B:40:0x0037, B:42:0x0047, B:44:0x0053, B:45:0x0059, B:46:0x00b6, B:48:0x00be, B:50:0x00c4, B:51:0x00cf, B:53:0x00d7, B:55:0x00dd, B:57:0x008e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001f, B:10:0x00e8, B:12:0x00f6, B:15:0x0102, B:16:0x010b, B:18:0x0111, B:19:0x011e, B:21:0x012d, B:23:0x013c, B:25:0x0142, B:26:0x0147, B:28:0x014d, B:29:0x0154, B:31:0x015c, B:32:0x0160, B:36:0x0135, B:37:0x002b, B:39:0x0031, B:40:0x0037, B:42:0x0047, B:44:0x0053, B:45:0x0059, B:46:0x00b6, B:48:0x00be, B:50:0x00c4, B:51:0x00cf, B:53:0x00d7, B:55:0x00dd, B:57:0x008e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015c A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x0017, B:7:0x001f, B:10:0x00e8, B:12:0x00f6, B:15:0x0102, B:16:0x010b, B:18:0x0111, B:19:0x011e, B:21:0x012d, B:23:0x013c, B:25:0x0142, B:26:0x0147, B:28:0x014d, B:29:0x0154, B:31:0x015c, B:32:0x0160, B:36:0x0135, B:37:0x002b, B:39:0x0031, B:40:0x0037, B:42:0x0047, B:44:0x0053, B:45:0x0059, B:46:0x00b6, B:48:0x00be, B:50:0x00c4, B:51:0x00cf, B:53:0x00d7, B:55:0x00dd, B:57:0x008e), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void applyConfigFromBidResponse(@NotNull ObservableConfig applyConfigFromBidResponse, @NotNull MfxBidResponse bidResponse) {
        Float endCardCloseSeconds;
        Integer maxEndCards;
        float floatValue;
        Float forceSkipSeconds;
        Float blockSkipSeconds;
        boolean shouldStreamVideo;
        Boolean allowClickthroughWithoutTap;
        Boolean forceVerboseLogging;
        Intrinsics.checkNotNullParameter(applyConfigFromBidResponse, "$this$applyConfigFromBidResponse");
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (bidResponse.getType() != AdmMediaType.VIDEO) {
                if (bidResponse.getType() != AdmMediaType.NATIVE) {
                    if (bidResponse.getType() == AdmMediaType.STORYBOARD) {
                    }
                    floatValue = applyConfigFromBidResponse.getFloatValue(ObservableConfigKey.DEFAULT_FORCE_SKIP_SECONDS, -1.0f);
                    forceSkipSeconds = bidResponse.getForceSkipSeconds();
                    if (forceSkipSeconds != null) {
                        floatValue = MathMf.minPreferPositive(forceSkipSeconds.floatValue(), floatValue);
                    }
                    if (floatValue > -1.0f) {
                        applyConfigFromBidResponse.setValue(ObservableConfigKey.FORCE_SKIP_SECONDS, Float.valueOf(floatValue));
                    }
                    blockSkipSeconds = bidResponse.getBlockSkipSeconds();
                    if (blockSkipSeconds != null) {
                        applyConfigFromBidResponse.setValue(ObservableConfigKey.BLOCK_SKIP_SECONDS, Float.valueOf(blockSkipSeconds.floatValue()));
                    }
                    shouldStreamVideo = bidResponse.getShouldStreamVideo();
                    applyConfigFromBidResponse.setValue(ObservableConfigKey.VIDEO_STREAM_ENABLED, Boolean.valueOf(shouldStreamVideo));
                    if (shouldStreamVideo || !applyConfigFromBidResponse.hasValue(ObservableConfigKey.VIDEO_CACHE_ENABLED)) {
                        applyConfigFromBidResponse.setValue(ObservableConfigKey.VIDEO_CACHE_ENABLED, Boolean.TRUE);
                    }
                    allowClickthroughWithoutTap = bidResponse.getAllowClickthroughWithoutTap();
                    if (allowClickthroughWithoutTap != null) {
                        applyConfigFromBidResponse.setValue(ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP, allowClickthroughWithoutTap);
                    }
                    forceVerboseLogging = bidResponse.getForceVerboseLogging();
                    if (forceVerboseLogging != null) {
                        SdkLogger.setVerboseLoggingFromMfx(forceVerboseLogging.booleanValue());
                    }
                    TelemetryManager.Companion companion = TelemetryManager.INSTANCE;
                    Boolean sendConsoleLogs = bidResponse.getSendConsoleLogs();
                    companion.activateRemoteDeviceLogging(sendConsoleLogs != null ? sendConsoleLogs.booleanValue() : false, bidResponse.getConsoleLogsTimeLimit(), bidResponse.getConsoleLogsCountLimit());
                }
            }
            ClickthroughBehaviour clickBehavior = bidResponse.getClickBehavior();
            if (clickBehavior == null) {
                clickBehavior = MobileFuseDefaults.INSTANCE.getDEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR();
            }
            applyConfigFromBidResponse.setValue(ObservableConfigKey.VIDEO_CLICK_THROUGH_BEHAVIOUR, clickBehavior);
            ObservableConfigKey observableConfigKey = ObservableConfigKey.PUBLISHER_MUTED;
            if (!applyConfigFromBidResponse.hasValue(observableConfigKey)) {
                boolean booleanValue = applyConfigFromBidResponse.getBooleanValue(ObservableConfigKey.DEFAULT_MUTED, true);
                Boolean muted = bidResponse.getMuted();
                boolean booleanValue2 = muted != null ? muted.booleanValue() : booleanValue;
                DebuggingKt.logDebug$default(applyConfigFromBidResponse, "Apply muted config [appliedValue=" + booleanValue2 + ", defaultValue=" + booleanValue + ", bidResponseValue=" + bidResponse.getMuted() + ']', null, 2, null);
                applyConfigFromBidResponse.setValue(ObservableConfigKey.AWAITING_MUTED, Boolean.valueOf(booleanValue2));
            } else {
                applyConfigFromBidResponse.setValue(ObservableConfigKey.AWAITING_MUTED, Boolean.valueOf(ObservableConfig.getBooleanValue$default(applyConfigFromBidResponse, observableConfigKey, false, 2, null)));
                DebuggingKt.logDebug$default(applyConfigFromBidResponse, "Muted config configured by app developer [value=" + applyConfigFromBidResponse.getValue(observableConfigKey) + ']', null, 2, null);
            }
            ObservableConfigKey observableConfigKey2 = ObservableConfigKey.MAX_END_CARDS;
            if (!applyConfigFromBidResponse.hasValue(observableConfigKey2) && (maxEndCards = bidResponse.getMaxEndCards()) != null) {
                applyConfigFromBidResponse.setValue(observableConfigKey2, Integer.valueOf(maxEndCards.intValue()));
            }
            ObservableConfigKey observableConfigKey3 = ObservableConfigKey.END_CARD_CLOSE_SECONDS;
            if (!applyConfigFromBidResponse.hasValue(observableConfigKey3) && (endCardCloseSeconds = bidResponse.getEndCardCloseSeconds()) != null) {
                applyConfigFromBidResponse.setValue(observableConfigKey3, Float.valueOf(endCardCloseSeconds.floatValue()));
            }
            floatValue = applyConfigFromBidResponse.getFloatValue(ObservableConfigKey.DEFAULT_FORCE_SKIP_SECONDS, -1.0f);
            forceSkipSeconds = bidResponse.getForceSkipSeconds();
            if (forceSkipSeconds != null) {
            }
            if (floatValue > -1.0f) {
            }
            blockSkipSeconds = bidResponse.getBlockSkipSeconds();
            if (blockSkipSeconds != null) {
            }
            shouldStreamVideo = bidResponse.getShouldStreamVideo();
            applyConfigFromBidResponse.setValue(ObservableConfigKey.VIDEO_STREAM_ENABLED, Boolean.valueOf(shouldStreamVideo));
            if (shouldStreamVideo) {
            }
            applyConfigFromBidResponse.setValue(ObservableConfigKey.VIDEO_CACHE_ENABLED, Boolean.TRUE);
            allowClickthroughWithoutTap = bidResponse.getAllowClickthroughWithoutTap();
            if (allowClickthroughWithoutTap != null) {
            }
            forceVerboseLogging = bidResponse.getForceVerboseLogging();
            if (forceVerboseLogging != null) {
            }
            TelemetryManager.Companion companion2 = TelemetryManager.INSTANCE;
            Boolean sendConsoleLogs2 = bidResponse.getSendConsoleLogs();
            companion2.activateRemoteDeviceLogging(sendConsoleLogs2 != null ? sendConsoleLogs2.booleanValue() : false, bidResponse.getConsoleLogsTimeLimit(), bidResponse.getConsoleLogsCountLimit());
        } catch (Throwable th) {
            int i = Apply_BidResponse_to_ObservableConfigKt$applyConfigFromBidResponse$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
