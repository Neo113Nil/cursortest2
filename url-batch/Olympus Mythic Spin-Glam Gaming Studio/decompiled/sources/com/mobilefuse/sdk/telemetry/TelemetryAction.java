package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.logging.LogLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetryDataModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JA\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "", "sender", "", "type", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "extras", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "logLevel", "Lcom/mobilefuse/sdk/logging/LogLevel;", "timestamp", "", "(Ljava/lang/String;Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;Ljava/util/List;Lcom/mobilefuse/sdk/logging/LogLevel;J)V", "getExtras", "()Ljava/util/List;", "getLogLevel", "()Lcom/mobilefuse/sdk/logging/LogLevel;", "getSender", "()Ljava/lang/String;", "getTimestamp", "()J", "setTimestamp", "(J)V", "getType", "()Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public final /* data */ class TelemetryAction {

    @NotNull
    private final List<TelemetryActionParam> extras;

    @NotNull
    private final LogLevel logLevel;

    @NotNull
    private final String sender;
    private long timestamp;

    @NotNull
    private final TelemetryActionType type;

    public static /* synthetic */ TelemetryAction copy$default(TelemetryAction telemetryAction, String str, TelemetryActionType telemetryActionType, List list, LogLevel logLevel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = telemetryAction.sender;
        }
        if ((i & 2) != 0) {
            telemetryActionType = telemetryAction.type;
        }
        TelemetryActionType telemetryActionType2 = telemetryActionType;
        if ((i & 4) != 0) {
            list = telemetryAction.extras;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            logLevel = telemetryAction.logLevel;
        }
        LogLevel logLevel2 = logLevel;
        if ((i & 16) != 0) {
            j = telemetryAction.timestamp;
        }
        return telemetryAction.copy(str, telemetryActionType2, list2, logLevel2, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSender() {
        return this.sender;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TelemetryActionType getType() {
        return this.type;
    }

    @NotNull
    public final List<TelemetryActionParam> component3() {
        return this.extras;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final TelemetryAction copy(@NotNull String sender, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras, @NotNull LogLevel logLevel, long timestamp) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return new TelemetryAction(sender, type, extras, logLevel, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryAction)) {
            return false;
        }
        TelemetryAction telemetryAction = (TelemetryAction) other;
        return Intrinsics.areEqual(this.sender, telemetryAction.sender) && Intrinsics.areEqual(this.type, telemetryAction.type) && Intrinsics.areEqual(this.extras, telemetryAction.extras) && Intrinsics.areEqual(this.logLevel, telemetryAction.logLevel) && this.timestamp == telemetryAction.timestamp;
    }

    public int hashCode() {
        String str = this.sender;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        TelemetryActionType telemetryActionType = this.type;
        int hashCode2 = (hashCode + (telemetryActionType != null ? telemetryActionType.hashCode() : 0)) * 31;
        List<TelemetryActionParam> list = this.extras;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        LogLevel logLevel = this.logLevel;
        return ((hashCode3 + (logLevel != null ? logLevel.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "TelemetryAction(sender=" + this.sender + ", type=" + this.type + ", extras=" + this.extras + ", logLevel=" + this.logLevel + ", timestamp=" + this.timestamp + ")";
    }

    public TelemetryAction(@NotNull String sender, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras, @NotNull LogLevel logLevel, long j) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.sender = sender;
        this.type = type;
        this.extras = extras;
        this.logLevel = logLevel;
        this.timestamp = j;
    }

    @NotNull
    public final String getSender() {
        return this.sender;
    }

    @NotNull
    public final TelemetryActionType getType() {
        return this.type;
    }

    public /* synthetic */ TelemetryAction(String str, TelemetryActionType telemetryActionType, List list, LogLevel logLevel, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, telemetryActionType, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? LogLevel.INFO : logLevel, (i & 16) != 0 ? System.currentTimeMillis() : j);
    }

    @NotNull
    public final List<TelemetryActionParam> getExtras() {
        return this.extras;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }
}
