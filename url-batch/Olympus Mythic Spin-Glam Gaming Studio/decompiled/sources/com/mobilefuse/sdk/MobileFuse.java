package com.mobilefuse.sdk;

import android.content.Context;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.logging.SdkLogger;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuse.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuse;", "", "()V", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes5.dex */
public final class MobileFuse {

    @NotNull
    public static final String SDK_NAME = "MobileFuse Ads";

    @NotNull
    public static final String SDK_TAG = "MobileFuse SDK";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static MobileFuseImpl sdkImpl = new MobileFuseImpl();

    public static final void enableVerboseLogging() {
        INSTANCE.enableVerboseLogging();
    }

    @NotNull
    public static final MobileFusePrivacyPreferences getPrivacyPreferences() {
        return INSTANCE.getPrivacyPreferences();
    }

    @NotNull
    public static final String getSdkVersion() {
        return INSTANCE.getSdkVersion();
    }

    @NotNull
    public static final TelemetryAgent getTelemetryAgent() {
        return INSTANCE.getTelemetryAgent();
    }

    public static final synchronized void init() {
        synchronized (MobileFuse.class) {
            INSTANCE.init();
        }
    }

    @Deprecated
    public static final synchronized void init(@NotNull Context context, int i, int i2) {
        synchronized (MobileFuse.class) {
            INSTANCE.init(context, i, i2);
        }
    }

    @Deprecated
    public static final synchronized void init(@NotNull Context context, int i, int i2, @Nullable SdkInitListener sdkInitListener) {
        synchronized (MobileFuse.class) {
            INSTANCE.init(context, i, i2, sdkInitListener);
        }
    }

    @Deprecated
    public static final synchronized void init(@NotNull Context context, @NotNull String str) {
        synchronized (MobileFuse.class) {
            INSTANCE.init(context, str);
        }
    }

    @Deprecated
    public static final synchronized void init(@NotNull Context context, @NotNull String str, @Nullable SdkInitListener sdkInitListener) {
        synchronized (MobileFuse.class) {
            INSTANCE.init(context, str, sdkInitListener);
        }
    }

    public static final synchronized void init(@Nullable SdkInitListener sdkInitListener) {
        synchronized (MobileFuse.class) {
            INSTANCE.init(sdkInitListener);
        }
    }

    @Deprecated
    public static final synchronized void initSdkServices(@Nullable Context context) {
        synchronized (MobileFuse.class) {
            INSTANCE.initSdkServices(context);
        }
    }

    public static final boolean isEnabled() {
        return INSTANCE.isEnabled();
    }

    public static final void logDebug(@NotNull String str) {
        INSTANCE.logDebug(str);
    }

    public static final void logError(@NotNull String str) {
        INSTANCE.logError(str);
    }

    public static final void logError(@NotNull String str, @NotNull Throwable th) {
        INSTANCE.logError(str, th);
    }

    public static final void logWarning(@NotNull String str) {
        INSTANCE.logWarning(str);
    }

    public static final void setPrivacyPreferences(@NotNull MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        INSTANCE.setPrivacyPreferences(mobileFusePrivacyPreferences);
    }

    /* compiled from: MobileFuse.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\tH\u0007J \u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J*\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\"\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuse$Companion;", "", "()V", "SDK_NAME", "", "SDK_TAG", "sdkImpl", "Lcom/mobilefuse/sdk/MobileFuseImpl;", "enableVerboseLogging", "", "getPrivacyPreferences", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "getSdkVersion", "getTelemetryAgent", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "init", "context", "Landroid/content/Context;", "publisherId", "", "appId", "sdkInitListener", "Lcom/mobilefuse/sdk/SdkInitListener;", "appKey", "initSdkServices", "isEnabled", "", "logDebug", "msg", "logError", "ex", "", "logWarning", "setPrivacyPreferences", "preferences", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        public final void logError(@NotNull String msg, @NotNull Throwable ex) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(ex, "ex");
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                DebuggingKt.logError$default(MobileFuse.INSTANCE, msg + ex.getMessage(), MobileFuse.SDK_TAG, null, 4, null);
            } catch (Throwable th) {
                int i = MobileFuse$Companion$logError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        public final synchronized void init(@NotNull Context context, int publisherId, int appId) {
            Intrinsics.checkNotNullParameter(context, "context");
            init(context, publisherId, appId, null);
        }

        @Deprecated
        public final synchronized void init(@NotNull Context context, int publisherId, int appId, @Nullable SdkInitListener sdkInitListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            init(context, String.valueOf(publisherId) + "_" + appId, sdkInitListener);
        }

        @Deprecated
        public final synchronized void init(@NotNull Context context, @NotNull String appKey) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            init(context, appKey, (SdkInitListener) null);
        }

        @Deprecated
        public final synchronized void init(@NotNull Context context, @NotNull String appKey, @Nullable SdkInitListener sdkInitListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            init(sdkInitListener);
        }

        public final synchronized void init() {
            init(null);
        }

        public final synchronized void init(@Nullable final SdkInitListener sdkInitListener) {
            try {
                Telemetry.INSTANCE.startLoggingSystem();
                SchedulersKt.getGlobalHandler().post(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuse$Companion$init$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            MobileFuse.sdkImpl.initSdk(SdkInitListener.this);
                        } catch (Throwable th) {
                            StabilityHelper.logException((Class<?>) MobileFuse.class, th);
                            SdkInitListener sdkInitListener2 = SdkInitListener.this;
                            if (sdkInitListener2 != null) {
                                sdkInitListener2.onInitError();
                            }
                        }
                    }
                });
            } finally {
            }
        }

        @Deprecated
        public final synchronized void initSdkServices(@Nullable Context context) {
            MobileFuseServices.requireAllServices();
        }

        @NotNull
        public final MobileFusePrivacyPreferences getPrivacyPreferences() {
            return MobileFuse.sdkImpl.getPrivacyPreferences();
        }

        public final void setPrivacyPreferences(@NotNull MobileFusePrivacyPreferences preferences) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            MobileFuse.sdkImpl.setPrivacyPreferences(preferences);
        }

        public final boolean isEnabled() {
            return MobileFuse.sdkImpl.isEnabled();
        }

        public final void logDebug(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            DebuggingKt.logDebug(this, msg, MobileFuse.SDK_TAG);
        }

        public final void logWarning(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            DebuggingKt.logWarn(this, msg, MobileFuse.SDK_TAG);
        }

        public final void logError(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            DebuggingKt.logError$default(this, msg, MobileFuse.SDK_TAG, null, 4, null);
        }

        @NotNull
        public final String getSdkVersion() {
            return "1.11.0";
        }

        public final void enableVerboseLogging() {
            SdkLogger.setVerboseLogging(true);
        }

        @NotNull
        public final TelemetryAgent getTelemetryAgent() {
            return MobileFuse.sdkImpl.getTelemetryAgent();
        }
    }

    static {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SdkInitializer.ensureSdkSetup(true);
            Telemetry.INSTANCE.onAppLaunchInternally("MobileFuseSDK");
        } catch (Throwable th) {
            int i = MobileFuse$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
