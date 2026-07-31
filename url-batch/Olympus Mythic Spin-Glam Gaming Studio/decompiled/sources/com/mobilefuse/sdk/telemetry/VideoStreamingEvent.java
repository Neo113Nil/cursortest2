package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetryDataModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\n\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/VideoStreamingEvent;", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "message", "", "logExtraMessage", "enabledBreadcrumbSending", "", "includeInLogsPrinting", "includeImplicitParamsInLogs", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "category", "getCategory", "()Ljava/lang/String;", "getEnabledBreadcrumbSending", "()Z", "getIncludeImplicitParamsInLogs", "getIncludeInLogsPrinting", "getLogExtraMessage", "getMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final /* data */ class VideoStreamingEvent implements TelemetryActionType {

    @NotNull
    private final String category;
    private final boolean enabledBreadcrumbSending;
    private final boolean includeImplicitParamsInLogs;
    private final boolean includeInLogsPrinting;

    @NotNull
    private final String logExtraMessage;

    @NotNull
    private final String message;

    public static /* synthetic */ VideoStreamingEvent copy$default(VideoStreamingEvent videoStreamingEvent, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoStreamingEvent.getMessage();
        }
        if ((i & 2) != 0) {
            str2 = videoStreamingEvent.getLogExtraMessage();
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = videoStreamingEvent.getEnabledBreadcrumbSending();
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = videoStreamingEvent.getIncludeInLogsPrinting();
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = videoStreamingEvent.getIncludeImplicitParamsInLogs();
        }
        return videoStreamingEvent.copy(str, str3, z4, z5, z3);
    }

    @NotNull
    public final String component1() {
        return getMessage();
    }

    @NotNull
    public final String component2() {
        return getLogExtraMessage();
    }

    public final boolean component3() {
        return getEnabledBreadcrumbSending();
    }

    public final boolean component4() {
        return getIncludeInLogsPrinting();
    }

    public final boolean component5() {
        return getIncludeImplicitParamsInLogs();
    }

    @NotNull
    public final VideoStreamingEvent copy(@NotNull String message, @NotNull String logExtraMessage, boolean enabledBreadcrumbSending, boolean includeInLogsPrinting, boolean includeImplicitParamsInLogs) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logExtraMessage, "logExtraMessage");
        return new VideoStreamingEvent(message, logExtraMessage, enabledBreadcrumbSending, includeInLogsPrinting, includeImplicitParamsInLogs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoStreamingEvent)) {
            return false;
        }
        VideoStreamingEvent videoStreamingEvent = (VideoStreamingEvent) other;
        return Intrinsics.areEqual(getMessage(), videoStreamingEvent.getMessage()) && Intrinsics.areEqual(getLogExtraMessage(), videoStreamingEvent.getLogExtraMessage()) && getEnabledBreadcrumbSending() == videoStreamingEvent.getEnabledBreadcrumbSending() && getIncludeInLogsPrinting() == videoStreamingEvent.getIncludeInLogsPrinting() && getIncludeImplicitParamsInLogs() == videoStreamingEvent.getIncludeImplicitParamsInLogs();
    }

    public int hashCode() {
        String message = getMessage();
        int hashCode = (message != null ? message.hashCode() : 0) * 31;
        String logExtraMessage = getLogExtraMessage();
        int hashCode2 = (hashCode + (logExtraMessage != null ? logExtraMessage.hashCode() : 0)) * 31;
        boolean enabledBreadcrumbSending = getEnabledBreadcrumbSending();
        int i = enabledBreadcrumbSending;
        if (enabledBreadcrumbSending) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean includeInLogsPrinting = getIncludeInLogsPrinting();
        int i3 = includeInLogsPrinting;
        if (includeInLogsPrinting) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean includeImplicitParamsInLogs = getIncludeImplicitParamsInLogs();
        return i4 + (includeImplicitParamsInLogs ? 1 : includeImplicitParamsInLogs);
    }

    @NotNull
    public String toString() {
        return "VideoStreamingEvent(message=" + getMessage() + ", logExtraMessage=" + getLogExtraMessage() + ", enabledBreadcrumbSending=" + getEnabledBreadcrumbSending() + ", includeInLogsPrinting=" + getIncludeInLogsPrinting() + ", includeImplicitParamsInLogs=" + getIncludeImplicitParamsInLogs() + ")";
    }

    public VideoStreamingEvent(@NotNull String message, @NotNull String logExtraMessage, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logExtraMessage, "logExtraMessage");
        this.message = message;
        this.logExtraMessage = logExtraMessage;
        this.enabledBreadcrumbSending = z;
        this.includeInLogsPrinting = z2;
        this.includeImplicitParamsInLogs = z3;
        this.category = TelemetryCategory.VIDEO_STREAMING;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getLogExtraMessage() {
        return this.logExtraMessage;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getEnabledBreadcrumbSending() {
        return this.enabledBreadcrumbSending;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getIncludeInLogsPrinting() {
        return this.includeInLogsPrinting;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getIncludeImplicitParamsInLogs() {
        return this.includeImplicitParamsInLogs;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getCategory() {
        return this.category;
    }
}
