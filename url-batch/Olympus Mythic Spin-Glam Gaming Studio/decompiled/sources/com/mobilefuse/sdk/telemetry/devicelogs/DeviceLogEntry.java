package com.mobilefuse.sdk.telemetry.devicelogs;

import com.applovin.sdk.AppLovinEventTypes;
import com.mobilefuse.sdk.logging.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceLogEntry.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JG\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lcom/mobilefuse/sdk/telemetry/devicelogs/DeviceLogEntry;", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Lcom/mobilefuse/sdk/logging/LogLevel;", "tag", "", "message", "timestamp", "", "wasReported", "", "index", "", "(Lcom/mobilefuse/sdk/logging/LogLevel;Ljava/lang/String;Ljava/lang/String;JZI)V", "getIndex", "()I", "setIndex", "(I)V", "getLevel", "()Lcom/mobilefuse/sdk/logging/LogLevel;", "getMessage", "()Ljava/lang/String;", "getTag", "getTimestamp", "()J", "getWasReported", "()Z", "setWasReported", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final /* data */ class DeviceLogEntry {
    private int index;

    @NotNull
    private final LogLevel level;

    @NotNull
    private final String message;

    @Nullable
    private final String tag;
    private final long timestamp;
    private boolean wasReported;

    public static /* synthetic */ DeviceLogEntry copy$default(DeviceLogEntry deviceLogEntry, LogLevel logLevel, String str, String str2, long j, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            logLevel = deviceLogEntry.level;
        }
        if ((i2 & 2) != 0) {
            str = deviceLogEntry.tag;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = deviceLogEntry.message;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            j = deviceLogEntry.timestamp;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            z = deviceLogEntry.wasReported;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            i = deviceLogEntry.index;
        }
        return deviceLogEntry.copy(logLevel, str3, str4, j2, z2, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LogLevel getLevel() {
        return this.level;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getWasReported() {
        return this.wasReported;
    }

    /* renamed from: component6, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final DeviceLogEntry copy(@NotNull LogLevel level, @Nullable String tag, @NotNull String message, long timestamp, boolean wasReported, int index) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        return new DeviceLogEntry(level, tag, message, timestamp, wasReported, index);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceLogEntry)) {
            return false;
        }
        DeviceLogEntry deviceLogEntry = (DeviceLogEntry) other;
        return Intrinsics.areEqual(this.level, deviceLogEntry.level) && Intrinsics.areEqual(this.tag, deviceLogEntry.tag) && Intrinsics.areEqual(this.message, deviceLogEntry.message) && this.timestamp == deviceLogEntry.timestamp && this.wasReported == deviceLogEntry.wasReported && this.index == deviceLogEntry.index;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        LogLevel logLevel = this.level;
        int hashCode = (logLevel != null ? logLevel.hashCode() : 0) * 31;
        String str = this.tag;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.message;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp)) * 31;
        boolean z = this.wasReported;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode3 + i) * 31) + Integer.hashCode(this.index);
    }

    @NotNull
    public String toString() {
        return "DeviceLogEntry(level=" + this.level + ", tag=" + this.tag + ", message=" + this.message + ", timestamp=" + this.timestamp + ", wasReported=" + this.wasReported + ", index=" + this.index + ")";
    }

    public DeviceLogEntry(@NotNull LogLevel level, @Nullable String str, @NotNull String message, long j, boolean z, int i) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        this.level = level;
        this.tag = str;
        this.message = message;
        this.timestamp = j;
        this.wasReported = z;
        this.index = i;
    }

    @NotNull
    public final LogLevel getLevel() {
        return this.level;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public /* synthetic */ DeviceLogEntry(LogLevel logLevel, String str, String str2, long j, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(logLevel, str, str2, j, (i2 & 16) != 0 ? false : z, i);
    }

    public final boolean getWasReported() {
        return this.wasReported;
    }

    public final void setWasReported(boolean z) {
        this.wasReported = z;
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
