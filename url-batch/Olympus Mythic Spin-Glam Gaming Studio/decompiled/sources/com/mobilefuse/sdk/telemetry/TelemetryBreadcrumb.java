package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.logging.LogLevel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetryBreadcrumb.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "", "message", "", "category", "data", "", "timestamp", "", "logLevel", "Lcom/mobilefuse/sdk/logging/LogLevel;", "logType", "wasReported", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JLcom/mobilefuse/sdk/logging/LogLevel;Ljava/lang/String;Z)V", "getCategory", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "getLogLevel", "()Lcom/mobilefuse/sdk/logging/LogLevel;", "getLogType", "getMessage", "getTimestamp", "()J", "getWasReported", "()Z", "setWasReported", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final /* data */ class TelemetryBreadcrumb {

    @NotNull
    private final String category;

    @Nullable
    private final Map<String, Object> data;

    @NotNull
    private final LogLevel logLevel;

    @NotNull
    private final String logType;

    @NotNull
    private final String message;
    private final long timestamp;
    private boolean wasReported;

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.data;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getLogType() {
        return this.logType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getWasReported() {
        return this.wasReported;
    }

    @NotNull
    public final TelemetryBreadcrumb copy(@NotNull String message, @NotNull String category, @Nullable Map<String, ? extends Object> data, long timestamp, @NotNull LogLevel logLevel, @NotNull String logType, boolean wasReported) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(logType, "logType");
        return new TelemetryBreadcrumb(message, category, data, timestamp, logLevel, logType, wasReported);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryBreadcrumb)) {
            return false;
        }
        TelemetryBreadcrumb telemetryBreadcrumb = (TelemetryBreadcrumb) other;
        return Intrinsics.areEqual(this.message, telemetryBreadcrumb.message) && Intrinsics.areEqual(this.category, telemetryBreadcrumb.category) && Intrinsics.areEqual(this.data, telemetryBreadcrumb.data) && this.timestamp == telemetryBreadcrumb.timestamp && Intrinsics.areEqual(this.logLevel, telemetryBreadcrumb.logLevel) && Intrinsics.areEqual(this.logType, telemetryBreadcrumb.logType) && this.wasReported == telemetryBreadcrumb.wasReported;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.message;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.category;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, Object> map = this.data;
        int hashCode3 = (((hashCode2 + (map != null ? map.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp)) * 31;
        LogLevel logLevel = this.logLevel;
        int hashCode4 = (hashCode3 + (logLevel != null ? logLevel.hashCode() : 0)) * 31;
        String str3 = this.logType;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.wasReported;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    @NotNull
    public String toString() {
        return "TelemetryBreadcrumb(message=" + this.message + ", category=" + this.category + ", data=" + this.data + ", timestamp=" + this.timestamp + ", logLevel=" + this.logLevel + ", logType=" + this.logType + ", wasReported=" + this.wasReported + ")";
    }

    public TelemetryBreadcrumb(@NotNull String message, @NotNull String category, @Nullable Map<String, ? extends Object> map, long j, @NotNull LogLevel logLevel, @NotNull String logType, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(logType, "logType");
        this.message = message;
        this.category = category;
        this.data = map;
        this.timestamp = j;
        this.logLevel = logLevel;
        this.logType = logType;
        this.wasReported = z;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Map<String, Object> getData() {
        return this.data;
    }

    public /* synthetic */ TelemetryBreadcrumb(String str, String str2, Map map, long j, LogLevel logLevel, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, (i & 8) != 0 ? System.currentTimeMillis() : j, (i & 16) != 0 ? LogLevel.INFO : logLevel, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public final String getLogType() {
        return this.logType;
    }

    public final boolean getWasReported() {
        return this.wasReported;
    }

    public final void setWasReported(boolean z) {
        this.wasReported = z;
    }
}
