package com.mobilefuse.sdk.telemetry;

import android.util.Log;
import com.mobilefuse.sdk.logging.DeviceLogBridge;
import com.mobilefuse.sdk.logging.LogLevel;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryHelpersKt;
import com.mobilefuse.sdk.telemetry.loggers.DeviceLogsHandler;
import com.mobilefuse.sdk.telemetry.loggers.ExceptionHandler;
import com.mobilefuse.sdk.telemetry.loggers.LogsHandler;
import com.mobilefuse.sdk.telemetry.loggers.MetricsHandler;
import com.mobilefuse.sdk.telemetry.loggers.SampleRatesManager;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import io.appmetrica.analytics.impl.C5574ol;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetryManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryManager;", "", "()V", "Companion", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public final class TelemetryManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static final UUID SESSION_ID;
    private static final DeviceLogsHandler deviceLogsHandler;

    @NotNull
    private static final ExceptionHandler exceptionHandler;
    private static final LogsHandler logsHandler;
    private static final MetricsHandler metricsHandler;
    private static final Map<String, String> modules;

    @NotNull
    private static String releaseVersion;
    private static final SampleRatesManager sampleRatesManager;
    private static final Map<String, String> variables;

    public static final void activateRemoteDeviceLogging(boolean z, @Nullable Integer num, @Nullable Integer num2) {
        INSTANCE.activateRemoteDeviceLogging(z, num, num2);
    }

    public static final void enableStructuredLogs() {
        INSTANCE.enableStructuredLogs();
    }

    @NotNull
    public static final Map<String, String> getModules() {
        return INSTANCE.getModules();
    }

    @NotNull
    public static final String getReleaseVersion() {
        return releaseVersion;
    }

    @NotNull
    public static final List<TelemetryBreadcrumb> getTelemetryEventList() {
        return INSTANCE.getTelemetryEventList();
    }

    @NotNull
    public static final Map<String, String> getVariables() {
        return INSTANCE.getVariables();
    }

    public static final void logBreadcrumb(@NotNull String str, @NotNull String str2, @Nullable Map<String, ? extends Object> map, @NotNull LogLevel logLevel, @NotNull String str3) {
        INSTANCE.logBreadcrumb(str, str2, map, logLevel, str3);
    }

    public static final void registerModule(@NotNull String str, @NotNull String str2) {
        INSTANCE.registerModule(str, str2);
    }

    public static final void registerVariable(@NotNull String str, @NotNull String str2) {
        INSTANCE.registerVariable(str, str2);
    }

    public static final void reportSessionStarted() {
        INSTANCE.reportSessionStarted();
    }

    public static final void setReleaseVersion(@NotNull String str) {
        releaseVersion = str;
    }

    public static final void updateSampleRateFromServer() {
        INSTANCE.updateSampleRateFromServer();
    }

    /* compiled from: TelemetryManager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u001cH\u0007J\u0006\u0010$\u001a\u00020\u0011J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0007J\u0006\u0010&\u001a\u00020\u0011J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0007J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0007JB\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010/2\b\b\u0002\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0011H\u0007J\u0018\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0011H\u0007J\u0018\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011H\u0007J\u0016\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=J\b\u0010>\u001a\u00020\u001cH\u0007J\b\u0010?\u001a\u00020\u001cH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryManager$Companion;", "", "()V", C5574ol.f, "Ljava/util/UUID;", "deviceLogsHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/DeviceLogsHandler;", "exceptionHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/ExceptionHandler;", "getExceptionHandler", "()Lcom/mobilefuse/sdk/telemetry/loggers/ExceptionHandler;", "logsHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/LogsHandler;", "metricsHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/MetricsHandler;", "modules", "", "", "releaseVersion", "getReleaseVersion$annotations", "getReleaseVersion", "()Ljava/lang/String;", "setReleaseVersion", "(Ljava/lang/String;)V", "sampleRatesManager", "Lcom/mobilefuse/sdk/telemetry/loggers/SampleRatesManager;", "variables", "activateRemoteDeviceLogging", "", "sendConsoleLogs", "", "consoleLogTimeLimit", "", "consoleLogCountLimit", "(ZLjava/lang/Integer;Ljava/lang/Integer;)V", "enableStructuredLogs", "getDeviceLogsSessionId", "getModules", "getSessionId", "getTelemetryEventList", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "getVariables", "logBreadcrumb", "category", "logType", "data", "", "logLevel", "Lcom/mobilefuse/sdk/logging/LogLevel;", "message", "registerModule", "module", "version", "registerVariable", "variable", "value", "reportAdMetric", "telemetryAdInfo", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "events", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordName;", "reportSessionStarted", "updateSampleRateFromServer", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        public static /* synthetic */ void getReleaseVersion$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getReleaseVersion() {
            return TelemetryManager.releaseVersion;
        }

        public final void setReleaseVersion(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            TelemetryManager.releaseVersion = str;
        }

        @NotNull
        public final ExceptionHandler getExceptionHandler() {
            return TelemetryManager.exceptionHandler;
        }

        @NotNull
        public final List<TelemetryBreadcrumb> getTelemetryEventList() {
            return TelemetryManager.logsHandler.getTelemetryEventList();
        }

        @NotNull
        public final Map<String, String> getModules() {
            return TelemetryManager.modules;
        }

        @NotNull
        public final Map<String, String> getVariables() {
            return TelemetryManager.variables;
        }

        public static /* synthetic */ void logBreadcrumb$default(Companion companion, String str, String str2, Map map, LogLevel logLevel, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            Map map2 = map;
            if ((i & 8) != 0) {
                logLevel = LogLevel.INFO;
            }
            companion.logBreadcrumb(str, str2, map2, logLevel, str3);
        }

        public final void logBreadcrumb(@NotNull String category, @NotNull String logType, @Nullable Map<String, ? extends Object> data, @NotNull LogLevel logLevel, @NotNull String message) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(logType, "logType");
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter(message, "message");
            try {
                TelemetryBreadcrumb telemetryBreadcrumb = new TelemetryBreadcrumb(message, category, data, 0L, logLevel, logType, false, 72, null);
                if (data != null) {
                    Log.d("MobileFuse.Telemetry", '[' + category + "] " + message + ' ' + SentryHelpersKt.getJsonWithStringValues(data));
                } else {
                    Log.d("MobileFuse.Telemetry", '[' + category + "] " + message);
                }
                TelemetryManager.logsHandler.reportBreadcrumb(telemetryBreadcrumb);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public final void registerModule(@NotNull String module, @NotNull String version) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(version, "version");
            try {
                TelemetryManager.modules.put(module, version);
            } catch (Throwable unused) {
            }
        }

        public final void registerVariable(@NotNull String variable, @NotNull String value) {
            Intrinsics.checkNotNullParameter(variable, "variable");
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                TelemetryManager.variables.put(variable, value);
            } catch (Throwable unused) {
            }
        }

        public final void updateSampleRateFromServer() {
            TelemetryManager.sampleRatesManager.updateSampleRateFromServer();
        }

        public final void reportSessionStarted() {
            TelemetryManager.logsHandler.reportSessionStarted(TelemetryManager.modules, TelemetryManager.variables);
            TelemetryManager.deviceLogsHandler.reportSessionStarted(TelemetryManager.modules, TelemetryManager.variables);
        }

        public final void reportAdMetric(@NotNull TelemetryAdInfo telemetryAdInfo, @NotNull MetricRecordName events) {
            Intrinsics.checkNotNullParameter(telemetryAdInfo, "telemetryAdInfo");
            Intrinsics.checkNotNullParameter(events, "events");
            TelemetryManager.metricsHandler.reportMetric(telemetryAdInfo, events);
        }

        @NotNull
        public final String getSessionId() {
            return TelemetryManager.logsHandler.getSessionId();
        }

        public final void enableStructuredLogs() {
            TelemetryManager.logsHandler.enableAndSendEventsImmediately();
        }

        public static /* synthetic */ void activateRemoteDeviceLogging$default(Companion companion, boolean z, Integer num, Integer num2, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            companion.activateRemoteDeviceLogging(z, num, num2);
        }

        public final void activateRemoteDeviceLogging(boolean sendConsoleLogs, @Nullable Integer consoleLogTimeLimit, @Nullable Integer consoleLogCountLimit) {
            try {
                TelemetryManager.deviceLogsHandler.activateRemoteLogging(sendConsoleLogs, consoleLogTimeLimit, consoleLogCountLimit);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @NotNull
        public final String getDeviceLogsSessionId() {
            return TelemetryManager.deviceLogsHandler.getSessionId();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "UUID.randomUUID()");
        SESSION_ID = randomUUID;
        releaseVersion = "Unset";
        modules = new LinkedHashMap();
        variables = new LinkedHashMap();
        LogsHandler logsHandler2 = new LogsHandler(randomUUID);
        logsHandler = logsHandler2;
        MetricsHandler metricsHandler2 = new MetricsHandler();
        metricsHandler = metricsHandler2;
        ExceptionHandler exceptionHandler2 = new ExceptionHandler();
        exceptionHandler = exceptionHandler2;
        sampleRatesManager = new SampleRatesManager(exceptionHandler2, logsHandler2, metricsHandler2);
        DeviceLogsHandler deviceLogsHandler2 = new DeviceLogsHandler(randomUUID, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        deviceLogsHandler = deviceLogsHandler2;
        try {
            companion.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.11.0");
            companion.registerModule("kotlin", KotlinVersion.CURRENT.toString());
            DeviceLogBridge.INSTANCE.setListener(deviceLogsHandler2);
        } catch (Throwable unused) {
        }
    }
}
