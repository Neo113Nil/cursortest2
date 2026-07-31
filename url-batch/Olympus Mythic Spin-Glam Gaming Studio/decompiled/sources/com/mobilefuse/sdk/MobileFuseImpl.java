package com.mobilefuse.sdk;

import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.identity.EidService;
import com.mobilefuse.sdk.identity.IdentifierUpdateSignal;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.service.ServicesInitError;
import com.mobilefuse.sdk.service.ServicesInitResult;
import com.mobilefuse.sdk.telemetry.TelemetryActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseImpl.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J\u0006\u0010\u0018\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0016J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001cJ\u000e\u0010$\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseImpl;", "", "()V", "awaitingInitListeners", "", "Lcom/mobilefuse/sdk/SdkInitListener;", "getAwaitingInitListeners", "()Ljava/util/List;", "<set-?>", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "privacyPreferences", "getPrivacyPreferences", "()Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "sdkInitState", "Lcom/mobilefuse/sdk/MobileFuseImpl$SdkInitState;", "telemetryAgent", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "getTelemetryAgent", "()Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "destroy", "", "getDisableReason", "", "getDisableReason$mobilefuse_sdk_core_release", "getSdkVersion", "initSdk", "sdkInitListener", "isEnabled", "", "logDebug", "msg", "logError", "ex", "", "onSdkInitComplete", "initSuccess", "setPrivacyPreferences", "Companion", "SdkInitState", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final class MobileFuseImpl {

    @NotNull
    public static final String SDK_NAME = "MobileFuse Ads";
    private static final String SDK_TAG = "MobileFuse SDK";

    @NotNull
    private MobileFusePrivacyPreferences privacyPreferences = new MobileFusePrivacyPreferences.Builder().build();

    @NotNull
    private final TelemetryAgent telemetryAgent = new TelemetryAgent(MobileFuse.class);

    @NotNull
    private final List<SdkInitListener> awaitingInitListeners = new ArrayList();
    private SdkInitState sdkInitState = SdkInitState.NOT_INITIALIZED;

    /* compiled from: MobileFuseImpl.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseImpl$SdkInitState;", "", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "INITIALIZING", "INITIALIZED", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public enum SdkInitState {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED
    }

    @NotNull
    public final MobileFusePrivacyPreferences getPrivacyPreferences() {
        return this.privacyPreferences;
    }

    @NotNull
    public final TelemetryAgent getTelemetryAgent() {
        return this.telemetryAgent;
    }

    @NotNull
    public final List<SdkInitListener> getAwaitingInitListeners() {
        return this.awaitingInitListeners;
    }

    public final void initSdk(@Nullable final SdkInitListener sdkInitListener) throws Throwable {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            MobileFuseAssetManager.INSTANCE.requestAssetsManifest();
            if (this.sdkInitState == SdkInitState.INITIALIZED) {
                logDebug("The MobileFuse SDK has been already initialized. Calling the \"onInitSuccess\" callback.");
                if (sdkInitListener != null) {
                    sdkInitListener.onInitSuccess();
                    return;
                }
                return;
            }
            if (sdkInitListener != null) {
                this.awaitingInitListeners.add(sdkInitListener);
            }
            SdkInitState sdkInitState = this.sdkInitState;
            SdkInitState sdkInitState2 = SdkInitState.INITIALIZING;
            if (sdkInitState == sdkInitState2) {
                logDebug("The MobileFuse SDK has been already requested to initialize. The callback will be called after completed sdk initialization.");
            } else {
                this.sdkInitState = sdkInitState2;
                MobileFuseServices.initAllServices(new Function1() { // from class: com.mobilefuse.sdk.MobileFuseImpl$initSdk$$inlined$handleExceptions$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(@NotNull Either<ServicesInitError, ServicesInitResult> result) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                        try {
                            EidService.INSTANCE.getService().handleSdkStateChanged(IdentifierUpdateSignal.SDK_INIT);
                            MobileFuseImpl.this.onSdkInitComplete(result instanceof SuccessResult);
                        } catch (Throwable th) {
                            int i = MobileFuseImpl$initSdk$1$2$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                            if (i == 1) {
                                StabilityHelper.logException("[Automatically caught]", th);
                            } else if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Either<ServicesInitError, ServicesInitResult>) obj);
                        return Unit.INSTANCE;
                    }
                });
            }
        } catch (Throwable th) {
            int i = MobileFuseImpl$initSdk$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onSdkInitComplete(boolean initSuccess) throws Throwable {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            this.sdkInitState = SdkInitState.INITIALIZED;
            for (SdkInitListener sdkInitListener : this.awaitingInitListeners) {
                if (initSuccess) {
                    sdkInitListener.onInitSuccess();
                } else {
                    sdkInitListener.onInitError();
                }
            }
            this.awaitingInitListeners.clear();
        } catch (Throwable th) {
            int i = MobileFuseImpl$onSdkInitComplete$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setPrivacyPreferences(@NotNull MobileFusePrivacyPreferences privacyPreferences) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            if (Intrinsics.areEqual(this.privacyPreferences, privacyPreferences)) {
                MobileFuse.INSTANCE.logDebug("setPrivacyPreferences: Success, already up to date (current preferences match new values). [prefs: " + this.privacyPreferences + ']');
                return;
            }
            this.privacyPreferences = privacyPreferences;
            logDebug("Changed privacy preferences to: " + this.privacyPreferences);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.PRIVACY_PREFERENCES_DNT, Boolean.valueOf(privacyPreferences.isDoNotTrack()), true));
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.PRIVACY_PREFERENCES_SUBJECT_TO_COPPA, Boolean.valueOf(privacyPreferences.isSubjectToCoppa()), true));
            String usPrivacyConsentString = privacyPreferences.getUsPrivacyConsentString();
            if (usPrivacyConsentString != null) {
                arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.PRIVACY_PREFERENCES_US_PRIVACY_STRING, usPrivacyConsentString, true));
            }
            String gppConsentString = privacyPreferences.getGppConsentString();
            if (gppConsentString != null) {
                arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.PRIVACY_PREFERENCES_GPP_CONTENT_STRING, gppConsentString, true));
            }
            this.telemetryAgent.onAction(TelemetryActionFactory.createInfoAction(this, TelemetryActionSdkEvents.SDK_SET_PRIVACY_PREFERENCES.updateExtraMessageField(this.privacyPreferences.getHumanReadableNonEmptyValues()), arrayList));
            EidService.INSTANCE.getService().handleSdkStateChanged(IdentifierUpdateSignal.PRIVACY_PREFS_CHANGED);
        } catch (Throwable th) {
            int i = MobileFuseImpl$setPrivacyPreferences$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void logDebug(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        DebuggingKt.logDebug(this, msg, "MobileFuse SDK");
    }

    public final void logError(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        DebuggingKt.logError$default(this, msg, "MobileFuse SDK", null, 4, null);
    }

    public final void logError(@NotNull String msg, @NotNull Throwable ex) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(ex, "ex");
        DebuggingKt.logError$default(this, msg + " with exception: " + ex, "MobileFuse SDK", null, 4, null);
    }

    @NotNull
    public final String getSdkVersion() {
        return "1.11.0";
    }

    public final boolean isEnabled() {
        return MobileFuseServices.getSdkEnabled();
    }

    @Nullable
    public final String getDisableReason$mobilefuse_sdk_core_release() {
        return MobileFuseServices.getSdkDisableReason();
    }

    public final void destroy() {
        this.sdkInitState = SdkInitState.NOT_INITIALIZED;
    }
}
