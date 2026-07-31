package com.mobilefuse.sdk.telemetry.devicelogs;

import androidx.annotation.VisibleForTesting;
import com.applovin.sdk.AppLovinEventTypes;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.logging.LogLevel;
import com.mobilefuse.sdk.logging.LogLevelKt;
import com.mobilefuse.sdk.telemetry.BuildConfig;
import com.mobilefuse.sdk.telemetry.loggers.MfxRequestManager;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DeviceLogsMfxImpl.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J.\u0010\"\u001a\u00020\u00062\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0$J\u001d\u0010&\u001a\u0004\u0018\u00010\t2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0001¢\u0006\u0002\b*J\u0006\u0010+\u001a\u00020\u0003J\u0015\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0019H\u0001¢\u0006\u0002\b/J\u0016\u00100\u001a\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u0014\u00101\u001a\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR&\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/devicelogs/DeviceLogsMfxImpl;", "", CommonUrlParts.UUID, "Ljava/util/UUID;", "onSuccess", "Lkotlin/Function0;", "", "(Ljava/util/UUID;Lkotlin/jvm/functions/Function0;)V", "CATEGORY", "", "getCATEGORY", "()Ljava/lang/String;", "TYPE_INIT", "getTYPE_INIT", "TYPE_LOG", "getTYPE_LOG", "appInfoJson", "getAppInfoJson$mobilefuse_sdk_telemetry_release$annotations", "()V", "getAppInfoJson$mobilefuse_sdk_telemetry_release", "setAppInfoJson$mobilefuse_sdk_telemetry_release", "(Ljava/lang/String;)V", "initialLogReported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialTimeOffset", "", "getOnSuccess", "()Lkotlin/jvm/functions/Function0;", "requestManager", "Lcom/mobilefuse/sdk/telemetry/loggers/MfxRequestManager;", "sdkVersion", "getSdkVersion", "getUuid", "()Ljava/util/UUID;", "createInitialLog", "modules", "", "variables", "createJsonLines", "logs", "", "Lcom/mobilefuse/sdk/telemetry/devicelogs/DeviceLogEntry;", "createJsonLines$mobilefuse_sdk_telemetry_release", "getSessionId", "getTimeOffsetSeconds", "", "timestamp", "getTimeOffsetSeconds$mobilefuse_sdk_telemetry_release", "markLogsAsReported", "reportLogs", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final class DeviceLogsMfxImpl {

    @NotNull
    private final String CATEGORY;

    @NotNull
    private final String TYPE_INIT;

    @NotNull
    private final String TYPE_LOG;

    @Nullable
    private String appInfoJson;
    private AtomicBoolean initialLogReported;
    private final long initialTimeOffset;

    @NotNull
    private final Function0 onSuccess;
    private final MfxRequestManager requestManager;

    @NotNull
    private final String sdkVersion;

    @NotNull
    private final UUID uuid;

    @VisibleForTesting
    public static /* synthetic */ void getAppInfoJson$mobilefuse_sdk_telemetry_release$annotations() {
    }

    public DeviceLogsMfxImpl(@NotNull UUID uuid, @NotNull Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.uuid = uuid;
        this.onSuccess = onSuccess;
        this.requestManager = new MfxRequestManager();
        this.initialLogReported = new AtomicBoolean(false);
        this.sdkVersion = (String) StringsKt.split$default((CharSequence) "1.11.0", new String[]{"-"}, false, 0, 6, (Object) null).get(0);
        this.CATEGORY = "DeviceConsoleLog";
        this.TYPE_INIT = "SDK initialized";
        this.TYPE_LOG = "Device console log";
        this.initialTimeOffset = System.currentTimeMillis();
    }

    @NotNull
    public final Function0 getOnSuccess() {
        return this.onSuccess;
    }

    @NotNull
    public final UUID getUuid() {
        return this.uuid;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final String getCATEGORY() {
        return this.CATEGORY;
    }

    @NotNull
    public final String getTYPE_INIT() {
        return this.TYPE_INIT;
    }

    @NotNull
    public final String getTYPE_LOG() {
        return this.TYPE_LOG;
    }

    @Nullable
    /* renamed from: getAppInfoJson$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final String getAppInfoJson() {
        return this.appInfoJson;
    }

    public final void setAppInfoJson$mobilefuse_sdk_telemetry_release(@Nullable String str) {
        this.appInfoJson = str;
    }

    public final void createInitialLog(@NotNull Map<String, String> modules, @NotNull Map<String, String> variables) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Map mapOf = MapsKt.mapOf(TuplesKt.to("sdk.version", this.sdkVersion), TuplesKt.to("device.os", "android"));
        this.appInfoJson = new JSONObject(MapsKt.mapOf(TuplesKt.to(CommonUrlParts.UUID, this.uuid.toString()), TuplesKt.to(AppLovinEventTypes.USER_COMPLETED_LEVEL, LogLevelKt.toLowerCase(LogLevel.INFO)), TuplesKt.to("category", this.CATEGORY), TuplesKt.to("type", this.TYPE_INIT), TuplesKt.to("msg", "SDK " + this.sdkVersion + " initialized for " + variables.get("app.bundle") + " on android"), TuplesKt.to("detail", MapsKt.plus(MapsKt.plus(modules, variables), mapOf)), TuplesKt.to("time_offset", Double.valueOf(getTimeOffsetSeconds$mobilefuse_sdk_telemetry_release(System.currentTimeMillis()))))).toString();
    }

    public final void reportLogs(@NotNull final List<DeviceLogEntry> logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            String createJsonLines$mobilefuse_sdk_telemetry_release = createJsonLines$mobilefuse_sdk_telemetry_release(logs);
            if (createJsonLines$mobilefuse_sdk_telemetry_release == null) {
                return;
            }
            this.requestManager.sendRequest(BuildConfig.TELEMETRY_MFX_LOGGING_SERVICE, createJsonLines$mobilefuse_sdk_telemetry_release, new Function0() { // from class: com.mobilefuse.sdk.telemetry.devicelogs.DeviceLogsMfxImpl$reportLogs$$inlined$handleExceptions$lambda$1
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
                    DeviceLogsMfxImpl.this.markLogsAsReported(logs);
                }
            });
            DebuggingKt.logInfo$default(this, "Session Id - Remote Device Collection: " + this.uuid, null, 2, null);
        } catch (Throwable th) {
            int i = DeviceLogsMfxImpl$reportLogs$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @VisibleForTesting
    @Nullable
    public final String createJsonLines$mobilefuse_sdk_telemetry_release(@NotNull List<DeviceLogEntry> logs) {
        String str;
        Intrinsics.checkNotNullParameter(logs, "logs");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            ArrayList arrayList = new ArrayList();
            if (this.initialLogReported.compareAndSet(false, true) && (str = this.appInfoJson) != null) {
                arrayList.add(str);
            }
            for (DeviceLogEntry deviceLogEntry : logs) {
                Pair pair = TuplesKt.to(CommonUrlParts.UUID, this.uuid);
                Pair pair2 = TuplesKt.to("index", Integer.valueOf(deviceLogEntry.getIndex()));
                String name = deviceLogEntry.getLevel().name();
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList2 = arrayList;
                String jSONObject = new JSONObject(MapsKt.mapOf(pair, pair2, TuplesKt.to(AppLovinEventTypes.USER_COMPLETED_LEVEL, lowerCase), TuplesKt.to("category", this.CATEGORY), TuplesKt.to("type", this.TYPE_LOG), TuplesKt.to("msg", deviceLogEntry.getMessage()), TuplesKt.to("detail", new JSONObject()), TuplesKt.to("time_offset", Double.valueOf(getTimeOffsetSeconds$mobilefuse_sdk_telemetry_release(deviceLogEntry.getTimestamp()))))).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "logEntry.toString()");
                arrayList2.add(jSONObject);
                arrayList = arrayList2;
            }
            return CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
        } catch (Throwable th) {
            if (DeviceLogsMfxImpl$createJsonLines$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] != 1) {
                return null;
            }
            StabilityHelper.logException("[Automatically caught]", th);
            return null;
        }
    }

    @VisibleForTesting
    public final double getTimeOffsetSeconds$mobilefuse_sdk_telemetry_release(long timestamp) {
        return (timestamp - this.initialTimeOffset) / 1000.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markLogsAsReported(final List<DeviceLogEntry> logs) {
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0() { // from class: com.mobilefuse.sdk.telemetry.devicelogs.DeviceLogsMfxImpl$markLogsAsReported$1
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
                Iterator it = logs.iterator();
                while (it.hasNext()) {
                    ((DeviceLogEntry) it.next()).setWasReported(true);
                }
                DeviceLogsMfxImpl.this.getOnSuccess().mo4828invoke();
            }
        }, 1, null);
    }

    @NotNull
    /* renamed from: getSessionId, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }
}
