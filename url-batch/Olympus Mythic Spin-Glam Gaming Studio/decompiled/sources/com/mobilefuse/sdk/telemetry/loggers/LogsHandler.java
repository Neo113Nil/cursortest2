package com.mobilefuse.sdk.telemetry.loggers;

import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.mobilefuse.sdk.telemetry.TelemetryHelpersKt;
import com.mobilefuse.sdk.telemetry.mfxlogs.EventTypes;
import com.mobilefuse.sdk.telemetry.mfxlogs.TelemetryEventsMfxImpl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LogsHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010.\u001a\u00020/H\u0000¢\u0006\u0002\b0J\u0006\u00101\u001a\u00020/J\u0006\u00102\u001a\u000203J\r\u00104\u001a\u00020/H\u0000¢\u0006\u0002\b5J\u000e\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u0019J\b\u00108\u001a\u00020/H\u0002J\u001e\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;J.\u0010>\u001a\u00020/2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002030@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002030@J\b\u0010B\u001a\u00020/H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190%8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR$\u0010'\u001a\u00020(8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006C"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/loggers/LogsHandler;", "Lcom/mobilefuse/sdk/telemetry/loggers/BaseSampleRate;", CommonUrlParts.UUID, "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "JOB_TIME_TO_CHECK_LOGS", "", "TIME_DEBOUNCE", "TIME_TO_DELETE_LOGS", "", "getTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release$annotations", "()V", "getTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release", "()I", "setTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release", "(I)V", "debouncer", "Lcom/mobilefuse/sdk/telemetry/loggers/TelemetryDebouncer;", "getDebouncer$mobilefuse_sdk_telemetry_release$annotations", "getDebouncer$mobilefuse_sdk_telemetry_release", "()Lcom/mobilefuse/sdk/telemetry/loggers/TelemetryDebouncer;", "setDebouncer$mobilefuse_sdk_telemetry_release", "(Lcom/mobilefuse/sdk/telemetry/loggers/TelemetryDebouncer;)V", "eventLogs", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "getEventLogs$mobilefuse_sdk_telemetry_release$annotations", "getEventLogs$mobilefuse_sdk_telemetry_release", "()Ljava/util/List;", "eventsAreProcessing", "", "getEventsAreProcessing$mobilefuse_sdk_telemetry_release$annotations", "getEventsAreProcessing$mobilefuse_sdk_telemetry_release", "()Z", "setEventsAreProcessing$mobilefuse_sdk_telemetry_release", "(Z)V", "telemetryEventList", "", "getTelemetryEventList", "telemetryEventsMfxImpl", "Lcom/mobilefuse/sdk/telemetry/mfxlogs/TelemetryEventsMfxImpl;", "getTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release$annotations", "getTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release", "()Lcom/mobilefuse/sdk/telemetry/mfxlogs/TelemetryEventsMfxImpl;", "setTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release", "(Lcom/mobilefuse/sdk/telemetry/mfxlogs/TelemetryEventsMfxImpl;)V", "debounceMfxLog", "", "debounceMfxLog$mobilefuse_sdk_telemetry_release", "enableAndSendEventsImmediately", "getSessionId", "", "removeLogs", "removeLogs$mobilefuse_sdk_telemetry_release", "reportBreadcrumb", "breadcrumb", "reportEvents", "reportSampleRateBreadcrumb", "exceptionsSampleRate", "", "logsSampleRate", "metricsSampleRate", "reportSessionStarted", "modules", "", "variables", "startDeleteLogsRunnable", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public final class LogsHandler extends BaseSampleRate {
    private final long JOB_TIME_TO_CHECK_LOGS;
    private final long TIME_DEBOUNCE;
    private int TIME_TO_DELETE_LOGS;

    @NotNull
    private TelemetryDebouncer debouncer;

    @NotNull
    private final List<TelemetryBreadcrumb> eventLogs;
    private boolean eventsAreProcessing;

    @NotNull
    private TelemetryEventsMfxImpl telemetryEventsMfxImpl;

    @VisibleForTesting
    public static /* synthetic */ void getDebouncer$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEventLogs$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEventsAreProcessing$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release$annotations() {
    }

    public LogsHandler(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.eventLogs = new ArrayList();
        this.telemetryEventsMfxImpl = new TelemetryEventsMfxImpl(uuid);
        this.JOB_TIME_TO_CHECK_LOGS = 60000L;
        this.TIME_DEBOUNCE = 30000L;
        this.TIME_TO_DELETE_LOGS = Constants.THIRTY_MINUTES;
        this.debouncer = new TelemetryDebouncer(30000L);
        startDeleteLogsRunnable();
    }

    @NotNull
    public final List<TelemetryBreadcrumb> getEventLogs$mobilefuse_sdk_telemetry_release() {
        return this.eventLogs;
    }

    @NotNull
    /* renamed from: getTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final TelemetryEventsMfxImpl getTelemetryEventsMfxImpl() {
        return this.telemetryEventsMfxImpl;
    }

    public final void setTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release(@NotNull TelemetryEventsMfxImpl telemetryEventsMfxImpl) {
        Intrinsics.checkNotNullParameter(telemetryEventsMfxImpl, "<set-?>");
        this.telemetryEventsMfxImpl = telemetryEventsMfxImpl;
    }

    /* renamed from: getEventsAreProcessing$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final boolean getEventsAreProcessing() {
        return this.eventsAreProcessing;
    }

    public final void setEventsAreProcessing$mobilefuse_sdk_telemetry_release(boolean z) {
        this.eventsAreProcessing = z;
    }

    /* renamed from: getTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final int getTIME_TO_DELETE_LOGS() {
        return this.TIME_TO_DELETE_LOGS;
    }

    public final void setTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release(int i) {
        this.TIME_TO_DELETE_LOGS = i;
    }

    @NotNull
    /* renamed from: getDebouncer$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final TelemetryDebouncer getDebouncer() {
        return this.debouncer;
    }

    public final void setDebouncer$mobilefuse_sdk_telemetry_release(@NotNull TelemetryDebouncer telemetryDebouncer) {
        Intrinsics.checkNotNullParameter(telemetryDebouncer, "<set-?>");
        this.debouncer = telemetryDebouncer;
    }

    @NotNull
    public final List<TelemetryBreadcrumb> getTelemetryEventList() {
        return CollectionsKt.toList(this.eventLogs);
    }

    private final void startDeleteLogsRunnable() {
        SchedulersKt.safelyRunOnBgThread$default(null, new LogsHandler$startDeleteLogsRunnable$1(this), 1, null);
    }

    public final void reportSampleRateBreadcrumb(double exceptionsSampleRate, double logsSampleRate, double metricsSampleRate) {
        reportBreadcrumb(new TelemetryBreadcrumb("Telemetry sample rates were set to " + exceptionsSampleRate + " for exceptions, " + logsSampleRate + " for logs, " + metricsSampleRate + " for metrics", TelemetryCategory.TELEMETRY, MapsKt.mapOf(TuplesKt.to("telemetry.samplerate.exceptions", Double.valueOf(exceptionsSampleRate)), TuplesKt.to("telemetry.samplerate.logs", Double.valueOf(logsSampleRate)), TuplesKt.to("telemetry.samplerate.metrics", Double.valueOf(metricsSampleRate))), 0L, null, EventTypes.SAMPLE_RATE.getValue(), false, 88, null));
    }

    public final void reportBreadcrumb(@NotNull TelemetryBreadcrumb breadcrumb) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        this.eventLogs.add(breadcrumb);
        if (this.eventsAreProcessing) {
            return;
        }
        this.eventsAreProcessing = true;
        debounceMfxLog$mobilefuse_sdk_telemetry_release();
    }

    public final void debounceMfxLog$mobilefuse_sdk_telemetry_release() {
        if (!getShouldTransmitToServer()) {
            this.eventsAreProcessing = false;
            return;
        }
        try {
            this.debouncer.debounce(new Function0() { // from class: com.mobilefuse.sdk.telemetry.loggers.LogsHandler$debounceMfxLog$1
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
                    LogsHandler.this.reportEvents();
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void reportSessionStarted(@NotNull Map<String, String> modules, @NotNull Map<String, String> variables) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(variables, "variables");
        this.telemetryEventsMfxImpl.createInitialLog(modules, TelemetryHelpersKt.sanitizeVersionNames(variables));
    }

    public final void removeLogs$mobilefuse_sdk_telemetry_release() {
        try {
            CollectionsKt.removeAll((List) this.eventLogs, new Function1() { // from class: com.mobilefuse.sdk.telemetry.loggers.LogsHandler$removeLogs$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return Boolean.valueOf(invoke((TelemetryBreadcrumb) obj));
                }

                public final boolean invoke(@NotNull TelemetryBreadcrumb it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return LogsHandler.this.getTelemetryEventsMfxImpl().getCurrentTimeMillis() - it.getTimestamp() >= ((long) LogsHandler.this.getTIME_TO_DELETE_LOGS());
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @NotNull
    public final String getSessionId() {
        if (getShouldTransmitToServer()) {
            String uuid = this.telemetryEventsMfxImpl.getUuid().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "telemetryEventsMfxImpl.getSessionId().toString()");
            return uuid;
        }
        return "";
    }

    public final void enableAndSendEventsImmediately() {
        setShouldTransmitToServer(true);
        this.eventsAreProcessing = true;
        reportEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportEvents() {
        List<TelemetryBreadcrumb> list = this.eventLogs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((TelemetryBreadcrumb) obj).getWasReported()) {
                arrayList.add(obj);
            }
        }
        List<? extends TelemetryBreadcrumb> list2 = CollectionsKt.toList(arrayList);
        if (list2.isEmpty()) {
            return;
        }
        this.telemetryEventsMfxImpl.reportEvents(list2);
        this.eventsAreProcessing = false;
    }
}
