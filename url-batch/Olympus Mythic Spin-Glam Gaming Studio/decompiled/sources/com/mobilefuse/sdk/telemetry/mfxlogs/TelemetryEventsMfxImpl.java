package com.mobilefuse.sdk.telemetry.mfxlogs;

import androidx.annotation.VisibleForTesting;
import com.applovin.sdk.AppLovinEventTypes;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.logging.LogLevel;
import com.mobilefuse.sdk.logging.LogLevelKt;
import com.mobilefuse.sdk.telemetry.BuildConfig;
import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService;
import com.mobilefuse.sdk.telemetry.devicelogs.DeviceLogIndex;
import com.mobilefuse.sdk.telemetry.loggers.MfxRequestManager;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: TelemetryEventsMfxImpl.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J.\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001dJ\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020!0\u001dH\u0016J\u0018\u0010\"\u001a\u0004\u0018\u00010\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0017J\u0006\u0010$\u001a\u00020\u0011J\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0011J\u0016\u0010)\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0002J\u0016\u0010+\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016R&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/mfxlogs/TelemetryEventsMfxImpl;", "Lcom/mobilefuse/sdk/telemetry/TelemetryEventsMfxService;", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", CommonUrlParts.UUID, "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "appInfoJson", "Lorg/json/JSONObject;", "getAppInfoJson$mobilefuse_sdk_telemetry_release$annotations", "()V", "getAppInfoJson$mobilefuse_sdk_telemetry_release", "()Lorg/json/JSONObject;", "setAppInfoJson$mobilefuse_sdk_telemetry_release", "(Lorg/json/JSONObject;)V", "initialLogReported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialTimeOffset", "", "requestManager", "Lcom/mobilefuse/sdk/telemetry/loggers/MfxRequestManager;", "sdkVersion", "", "getSdkVersion", "()Ljava/lang/String;", "getUuid", "()Ljava/util/UUID;", "createInitialLog", "", "modules", "", "variables", "createJson", "data", "", "createJsonLines", "", "getCurrentTimeMillis", "getSessionId", "getTimeOffset", "", "currentTime", "markEventsAsReported", "breadcrumbs", "reportEvents", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class TelemetryEventsMfxImpl implements TelemetryEventsMfxService<TelemetryBreadcrumb> {

    @Nullable
    private JSONObject appInfoJson;
    private AtomicBoolean initialLogReported;
    private final long initialTimeOffset;
    private final MfxRequestManager requestManager;

    @NotNull
    private final String sdkVersion;

    @NotNull
    private final UUID uuid;

    @VisibleForTesting
    public static /* synthetic */ void getAppInfoJson$mobilefuse_sdk_telemetry_release$annotations() {
    }

    public TelemetryEventsMfxImpl(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.requestManager = new MfxRequestManager();
        this.initialLogReported = new AtomicBoolean(false);
        this.initialTimeOffset = getCurrentTimeMillis();
        this.sdkVersion = (String) StringsKt.split$default((CharSequence) "1.11.0", new String[]{"-"}, false, 0, 6, (Object) null).get(0);
    }

    @NotNull
    public final UUID getUuid() {
        return this.uuid;
    }

    @Nullable
    /* renamed from: getAppInfoJson$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final JSONObject getAppInfoJson() {
        return this.appInfoJson;
    }

    public final void setAppInfoJson$mobilefuse_sdk_telemetry_release(@Nullable JSONObject jSONObject) {
        this.appInfoJson = jSONObject;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final void createInitialLog(@NotNull Map<String, String> modules, @NotNull Map<String, String> variables) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Map mapOf = MapsKt.mapOf(TuplesKt.to("sdk.version", this.sdkVersion), TuplesKt.to("device.os", "android"));
        this.appInfoJson = createJson(MapsKt.mapOf(TuplesKt.to("index", 0), TuplesKt.to(CommonUrlParts.UUID, this.uuid.toString()), TuplesKt.to(AppLovinEventTypes.USER_COMPLETED_LEVEL, LogLevelKt.toLowerCase(LogLevel.INFO)), TuplesKt.to("category", TelemetryCategory.TELEMETRY), TuplesKt.to("type", EventTypes.SDK_INIT.getValue()), TuplesKt.to("msg", "SDK " + this.sdkVersion + " initialized for " + variables.get("app.bundle") + " on android"), TuplesKt.to("detail", MapsKt.plus(MapsKt.plus(modules, variables), mapOf)), TuplesKt.to("time_offset", Float.valueOf(getTimeOffset(getCurrentTimeMillis())))));
    }

    public final long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public final float getTimeOffset(long currentTime) {
        return (currentTime - this.initialTimeOffset) / 1000.0f;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService
    public void reportEvents(@NotNull final List<? extends TelemetryBreadcrumb> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String createJsonLines = createJsonLines(data);
        if (createJsonLines == null) {
            return;
        }
        this.requestManager.sendRequest(BuildConfig.TELEMETRY_MFX_LOGGING_SERVICE, createJsonLines, new Function0() { // from class: com.mobilefuse.sdk.telemetry.mfxlogs.TelemetryEventsMfxImpl$reportEvents$1
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
                TelemetryEventsMfxImpl.this.markEventsAsReported(data);
            }
        });
        DebuggingKt.logDebug$default(this, "Telemetry session id: " + this.uuid, null, 2, null);
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService
    @VisibleForTesting
    @Nullable
    public String createJsonLines(@NotNull List<? extends TelemetryBreadcrumb> data) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.initialLogReported.compareAndSet(false, true) && (jSONObject = this.appInfoJson) != null) {
                arrayList.add(jSONObject);
            }
            for (Object obj : data) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TelemetryBreadcrumb telemetryBreadcrumb = (TelemetryBreadcrumb) obj;
                Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(CommonUrlParts.UUID, this.uuid.toString()), TuplesKt.to(AppLovinEventTypes.USER_COMPLETED_LEVEL, LogLevelKt.toLowerCase(telemetryBreadcrumb.getLogLevel())), TuplesKt.to("category", telemetryBreadcrumb.getCategory()), TuplesKt.to("msg", telemetryBreadcrumb.getMessage()), TuplesKt.to("time_offset", Float.valueOf(getTimeOffset(telemetryBreadcrumb.getTimestamp()))), TuplesKt.to("type", telemetryBreadcrumb.getLogType()));
                Map<String, Object> data2 = telemetryBreadcrumb.getData();
                if (data2 != null) {
                    mutableMapOf.put("detail", data2);
                }
                JSONObject createJson = createJson(mutableMapOf);
                if (createJson != null) {
                    arrayList.add(createJson);
                }
                i = i2;
            }
            return CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, new Function1() { // from class: com.mobilefuse.sdk.telemetry.mfxlogs.TelemetryEventsMfxImpl$createJsonLines$3
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull JSONObject it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    String jSONObject2 = it.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "it.toString()");
                    return jSONObject2;
                }
            }, 30, null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService
    @Nullable
    public JSONObject createJson(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            JSONObject jSONObject = new JSONObject(data);
            jSONObject.put("index", DeviceLogIndex.INSTANCE.increment());
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markEventsAsReported(final List<TelemetryBreadcrumb> breadcrumbs) {
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0() { // from class: com.mobilefuse.sdk.telemetry.mfxlogs.TelemetryEventsMfxImpl$markEventsAsReported$1
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
                Iterator it = breadcrumbs.iterator();
                while (it.hasNext()) {
                    ((TelemetryBreadcrumb) it.next()).setWasReported(true);
                }
            }
        }, 1, null);
    }

    @NotNull
    /* renamed from: getSessionId, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }
}
