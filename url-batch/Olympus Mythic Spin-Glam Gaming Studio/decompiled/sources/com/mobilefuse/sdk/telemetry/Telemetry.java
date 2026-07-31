package com.mobilefuse.sdk.telemetry;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelperBridge;
import com.mobilefuse.sdk.info.GetAppInstallSourceKt;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import com.yandex.div.core.timer.TimerController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Telemetry.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/Telemetry;", "", "()V", "Companion", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class Telemetry {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static final Map<Integer, TelemetryAgent> agents;

    @NotNull
    private static TelemetryAction appLaunchAction;
    private static final Lazy defaultAppLaunchAction$delegate;
    private static boolean enabled;
    private static boolean initialized;
    private static final List<TelemetryAction> mutableActions;
    private static boolean storeActionsEnabled;

    public static final void clear() {
        INSTANCE.clear();
    }

    @Nullable
    public static final TelemetryAgent getAgent(@NotNull Object obj) {
        return INSTANCE.getAgent(obj);
    }

    @NotNull
    public static final String getDeviceLogsSessionId() {
        return INSTANCE.getDeviceLogsSessionId();
    }

    public static final boolean getEnabled() {
        return enabled;
    }

    public static final boolean getInitialized() {
        return initialized;
    }

    @NotNull
    public static final String getSessionId() {
        return INSTANCE.getSessionId();
    }

    public static final boolean getStoreActionsEnabled() {
        return storeActionsEnabled;
    }

    public static final void initialize(@NotNull Context context, @NotNull String str) {
        INSTANCE.initialize(context, str);
    }

    public static final void logException(@NotNull Object obj, @NotNull Throwable th) {
        INSTANCE.logException(obj, th);
    }

    public static final void logException(@NotNull String str, @NotNull Throwable th) {
        INSTANCE.logException(str, th);
    }

    public static final synchronized void onAction(@NotNull TelemetryAction telemetryAction) {
        synchronized (Telemetry.class) {
            INSTANCE.onAction(telemetryAction);
        }
    }

    public static final void onAppLaunch(@NotNull Object obj) {
        INSTANCE.onAppLaunch(obj);
    }

    public static final void onAppLaunchInternally(@NotNull Object obj) {
        INSTANCE.onAppLaunchInternally(obj);
    }

    public static final void reportAdMetric(@NotNull TelemetryAdInfo telemetryAdInfo, @NotNull MetricRecordName metricRecordName) {
        INSTANCE.reportAdMetric(telemetryAdInfo, metricRecordName);
    }

    @VisibleForTesting
    public static final void reset() {
        INSTANCE.reset();
    }

    public static final void setEnabled(boolean z) {
        INSTANCE.setEnabled(z);
    }

    private static final void setInitialized(boolean z) {
        initialized = z;
    }

    public static final void setStoreActionsEnabled(boolean z) {
        storeActionsEnabled = z;
    }

    public static final void startLoggingSystem() {
        INSTANCE.startLoggingSystem();
    }

    /* compiled from: Telemetry.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0007J\u0012\u0010+\u001a\u0004\u0018\u00010\u000b2\u0006\u0010,\u001a\u00020-H\u0007J\b\u0010.\u001a\u00020/H\u0007J\b\u00100\u001a\u00020/H\u0007J\u0018\u00101\u001a\u00020*2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020/H\u0007J\u0018\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020-2\u0006\u00107\u001a\u000208H\u0007J\u0018\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020/2\u0006\u00107\u001a\u000208H\u0007J\u0010\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020\u0005H\u0007J\u0010\u0010;\u001a\u00020*2\u0006\u00106\u001a\u00020-H\u0007J\u0010\u0010<\u001a\u00020*2\u0006\u00106\u001a\u00020-H\u0007J\u0015\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020\u000bH\u0000¢\u0006\u0002\b?J\u0018\u0010@\u001a\u00020*2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0007J\b\u0010E\u001a\u00020*H\u0007J\b\u0010F\u001a\u00020*H\u0007R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u000fR,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR,\u0010\u001e\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00178\u0006@BX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR2\u0010\"\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u00050\u0005 $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040#X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010%\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u0002\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u001d¨\u0006G"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/Telemetry$Companion;", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionReceiver;", "()V", "actions", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "getActions", "()Ljava/util/List;", "agents", "", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "<set-?>", "appLaunchAction", "getAppLaunchAction", "()Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "setAppLaunchAction", "(Lcom/mobilefuse/sdk/telemetry/TelemetryAction;)V", "defaultAppLaunchAction", "getDefaultAppLaunchAction", "defaultAppLaunchAction$delegate", "Lkotlin/Lazy;", "value", "", "enabled", "getEnabled$annotations", "getEnabled", "()Z", "setEnabled", "(Z)V", "initialized", "getInitialized$annotations", "getInitialized", "setInitialized", "mutableActions", "", "kotlin.jvm.PlatformType", "storeActionsEnabled", "getStoreActionsEnabled$annotations", "getStoreActionsEnabled", "setStoreActionsEnabled", "clear", "", "getAgent", "owner", "", "getDeviceLogsSessionId", "", "getSessionId", "initialize", "context", "Landroid/content/Context;", "releaseVersion", "logException", "sender", TelemetryCategory.EXCEPTION, "", "onAction", "action", "onAppLaunch", "onAppLaunchInternally", "registerAgent", "agent", "registerAgent$mobilefuse_sdk_telemetry_release", "reportAdMetric", "telemetryAdInfo", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "events", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordName;", TimerController.RESET_COMMAND, "startLoggingSystem", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion implements TelemetryActionReceiver {
        /* JADX INFO: Access modifiers changed from: private */
        public final TelemetryAction getDefaultAppLaunchAction() {
            return (TelemetryAction) Telemetry.defaultAppLaunchAction$delegate.getValue();
        }

        public static /* synthetic */ void getEnabled$annotations() {
        }

        public static /* synthetic */ void getInitialized$annotations() {
        }

        public static /* synthetic */ void getStoreActionsEnabled$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setInitialized(boolean z) {
            Telemetry.initialized = z;
        }

        public final boolean getInitialized() {
            return Telemetry.initialized;
        }

        public final boolean getEnabled() {
            return Telemetry.enabled;
        }

        public final void setEnabled(boolean z) {
            Telemetry.INSTANCE.setStoreActionsEnabled(z);
            Telemetry.enabled = z;
        }

        public final boolean getStoreActionsEnabled() {
            return Telemetry.storeActionsEnabled;
        }

        public final void setStoreActionsEnabled(boolean z) {
            Telemetry.storeActionsEnabled = z;
        }

        @Override // com.mobilefuse.sdk.telemetry.TelemetryActionReceiver
        @NotNull
        public List<TelemetryAction> getActions() {
            List<TelemetryAction> mutableActions = Telemetry.mutableActions;
            Intrinsics.checkNotNullExpressionValue(mutableActions, "mutableActions");
            return mutableActions;
        }

        private final void setAppLaunchAction(TelemetryAction telemetryAction) {
            Telemetry.appLaunchAction = telemetryAction;
        }

        @NotNull
        public final TelemetryAction getAppLaunchAction() {
            return Telemetry.appLaunchAction;
        }

        public final void registerAgent$mobilefuse_sdk_telemetry_release(@NotNull TelemetryAgent agent) {
            Intrinsics.checkNotNullParameter(agent, "agent");
            Telemetry.agents.put(Integer.valueOf(agent.getOwnerHashCode()), agent);
        }

        @Nullable
        public final TelemetryAgent getAgent(@NotNull Object owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return (TelemetryAgent) Telemetry.agents.get(Integer.valueOf(owner.hashCode()));
        }

        public final synchronized void onAction(@NotNull TelemetryAction action) {
            try {
                Intrinsics.checkNotNullParameter(action, "action");
                if (getStoreActionsEnabled()) {
                    Telemetry.mutableActions.add(action);
                }
                TelemetryHelpersKt.logBreadcrumb(action);
            } catch (Throwable th) {
                throw th;
            }
        }

        public final void onAppLaunch(@NotNull Object sender) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            clear();
            setAppLaunchAction(TelemetryActionFactory.createAction$default(sender, TelemetryBaseActionType.APP_LAUNCHED, null, null, 12, null));
            onAction(getAppLaunchAction());
        }

        public final void onAppLaunchInternally(@NotNull Object sender) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            if (getAppLaunchAction() != getDefaultAppLaunchAction()) {
                return;
            }
            onAppLaunch(sender);
        }

        public final void logException(@NotNull Object sender, @NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(exception, "exception");
            try {
                String simpleName = Reflection.getOrCreateKotlinClass(sender.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = sender.getClass().getSimpleName();
                }
                Intrinsics.checkNotNullExpressionValue(simpleName, "sender::class.simpleName…er::class.java.simpleName");
                logException(simpleName, exception);
            } catch (Throwable unused) {
            }
        }

        public final void logException(@NotNull String sender, @NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(exception, "exception");
            try {
                onAction(TelemetryHelpersKt.getTelemetryAction(exception));
                TelemetryManager.INSTANCE.getExceptionHandler().captureException(exception, sender);
            } catch (Throwable unused) {
                DebuggingKt.logDebug$default(this, "Exception caught by " + sender, null, 2, null);
                exception.printStackTrace();
            }
        }

        public final void initialize(@NotNull Context context, @NotNull String releaseVersion) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            if (getInitialized()) {
                return;
            }
            setInitialized(true);
            StabilityHelperBridge stabilityHelperBridge = StabilityHelperBridge.INSTANCE;
            stabilityHelperBridge.setLogExceptionFn(new Telemetry$Companion$initialize$1(this));
            TelemetryManager.Companion companion = TelemetryManager.INSTANCE;
            stabilityHelperBridge.setRegisterExceptionHandlerVariableFn(new Telemetry$Companion$initialize$2(companion));
            try {
                companion.setReleaseVersion(releaseVersion);
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                String packageName = applicationContext.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.applicationContext.packageName");
                companion.registerVariable("app.bundle", packageName);
                PackageManager packageManager = context.getPackageManager();
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
                PackageInfo packageInfo = packageManager.getPackageInfo(applicationContext2.getPackageName(), 0);
                String str = packageInfo.versionName;
                Intrinsics.checkNotNullExpressionValue(str, "info.versionName");
                companion.registerVariable("app.version", str);
                companion.registerVariable("app.version.code", "" + packageInfo.versionCode);
                companion.registerVariable("app.installsource", GetAppInstallSourceKt.getAppInstallSource(context));
            } catch (Throwable unused) {
            }
        }

        public final void clear() {
            Telemetry.mutableActions.clear();
            Iterator it = Telemetry.agents.values().iterator();
            while (it.hasNext()) {
                ((TelemetryAgent) it.next()).clearActions$mobilefuse_sdk_telemetry_release();
            }
            Telemetry.agents.clear();
        }

        @VisibleForTesting
        public final void reset() {
            clear();
        }

        public final void startLoggingSystem() {
            TelemetryManager.INSTANCE.reportSessionStarted();
        }

        public final void reportAdMetric(@NotNull TelemetryAdInfo telemetryAdInfo, @NotNull MetricRecordName events) {
            Intrinsics.checkNotNullParameter(telemetryAdInfo, "telemetryAdInfo");
            Intrinsics.checkNotNullParameter(events, "events");
            TelemetryManager.INSTANCE.reportAdMetric(telemetryAdInfo, events);
        }

        @NotNull
        public final String getSessionId() {
            return TelemetryManager.INSTANCE.getSessionId();
        }

        @NotNull
        public final String getDeviceLogsSessionId() {
            return TelemetryManager.INSTANCE.getDeviceLogsSessionId();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        enabled = true;
        agents = new LinkedHashMap();
        mutableActions = Collections.synchronizedList(new ArrayList());
        defaultAppLaunchAction$delegate = LazyKt.lazy(new Function0() { // from class: com.mobilefuse.sdk.telemetry.Telemetry$Companion$defaultAppLaunchAction$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final TelemetryAction mo4828invoke() {
                return new TelemetryAction(TelemetryHelpersKt.getTelemetryActionSender(Telemetry.INSTANCE), TelemetryBaseActionType.APP_LAUNCHED, null, null, 0L, 28, null);
            }
        });
        appLaunchAction = companion.getDefaultAppLaunchAction();
    }
}
