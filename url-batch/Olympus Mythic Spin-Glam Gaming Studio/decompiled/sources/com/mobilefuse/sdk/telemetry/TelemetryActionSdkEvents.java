package com.mobilefuse.sdk.telemetry;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetrySdkTypes.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0003J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0013¨\u0006)"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryActionSdkEvents;", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "category", "", "message", "logExtraMessage", "enabledBreadcrumbSending", "", "includeInLogsPrinting", "includeImplicitParamsInLogs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getCategory", "()Ljava/lang/String;", "getEnabledBreadcrumbSending", "()Z", "getIncludeImplicitParamsInLogs", "getIncludeInLogsPrinting", "getLogExtraMessage", "setLogExtraMessage", "(Ljava/lang/String;)V", "getMessage", "setMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "updateExtraMessageField", "updatedValue", "updateMessagesValues", "newMessage", "newExtraMessage", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final /* data */ class TelemetryActionSdkEvents implements TelemetryActionType {

    @NotNull
    public static final TelemetryActionSdkEvents ADVERTISING_ID_OBTAINED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_BIDDING_LOAD_REQUESTED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_CREATED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_DESTROYED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_RENDERER_CREATED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_SET_MUTED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_SET_TEST_MODE;

    @NotNull
    public static final TelemetryActionSdkEvents AD_LIFECYCLE_ERROR;

    @NotNull
    public static final TelemetryActionSdkEvents AD_LIFECYCLE_EVENT;

    @NotNull
    public static final TelemetryActionSdkEvents AD_LOAD_REQUESTED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_MUTED_CALLBACK;

    @NotNull
    public static final TelemetryActionSdkEvents AD_SHOW_REQUESTED;

    @NotNull
    public static final TelemetryActionSdkEvents BID_TOKEN_GENERATED;

    @NotNull
    public static final TelemetryActionSdkEvents SDK_SET_PRIVACY_PREFERENCES;

    @NotNull
    public static final TelemetryActionSdkEvents SDK_SET_SPOOF_MODE_GLOBALLY;

    @NotNull
    public static final TelemetryActionSdkEvents SDK_SET_TEST_MODE_GLOBALLY;

    @NotNull
    private final String category;
    private final boolean enabledBreadcrumbSending;
    private final boolean includeImplicitParamsInLogs;
    private final boolean includeInLogsPrinting;

    @NotNull
    private String logExtraMessage;

    @NotNull
    private String message;

    public TelemetryActionSdkEvents(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this(str, str2, str3, false, false, false, 56, null);
    }

    public TelemetryActionSdkEvents(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        this(str, str2, str3, z, false, false, 48, null);
    }

    public TelemetryActionSdkEvents(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) {
        this(str, str2, str3, z, z2, false, 32, null);
    }

    public static /* synthetic */ TelemetryActionSdkEvents copy$default(TelemetryActionSdkEvents telemetryActionSdkEvents, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = telemetryActionSdkEvents.getCategory();
        }
        if ((i & 2) != 0) {
            str2 = telemetryActionSdkEvents.getMessage();
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = telemetryActionSdkEvents.getLogExtraMessage();
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = telemetryActionSdkEvents.getEnabledBreadcrumbSending();
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = telemetryActionSdkEvents.getIncludeInLogsPrinting();
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = telemetryActionSdkEvents.getIncludeImplicitParamsInLogs();
        }
        return telemetryActionSdkEvents.copy(str, str4, str5, z4, z5, z3);
    }

    @NotNull
    public final String component1() {
        return getCategory();
    }

    @NotNull
    public final String component2() {
        return getMessage();
    }

    @NotNull
    public final String component3() {
        return getLogExtraMessage();
    }

    public final boolean component4() {
        return getEnabledBreadcrumbSending();
    }

    public final boolean component5() {
        return getIncludeInLogsPrinting();
    }

    public final boolean component6() {
        return getIncludeImplicitParamsInLogs();
    }

    @NotNull
    public final TelemetryActionSdkEvents copy(@NotNull String category, @NotNull String message, @NotNull String logExtraMessage, boolean enabledBreadcrumbSending, boolean includeInLogsPrinting, boolean includeImplicitParamsInLogs) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logExtraMessage, "logExtraMessage");
        return new TelemetryActionSdkEvents(category, message, logExtraMessage, enabledBreadcrumbSending, includeInLogsPrinting, includeImplicitParamsInLogs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryActionSdkEvents)) {
            return false;
        }
        TelemetryActionSdkEvents telemetryActionSdkEvents = (TelemetryActionSdkEvents) other;
        return Intrinsics.areEqual(getCategory(), telemetryActionSdkEvents.getCategory()) && Intrinsics.areEqual(getMessage(), telemetryActionSdkEvents.getMessage()) && Intrinsics.areEqual(getLogExtraMessage(), telemetryActionSdkEvents.getLogExtraMessage()) && getEnabledBreadcrumbSending() == telemetryActionSdkEvents.getEnabledBreadcrumbSending() && getIncludeInLogsPrinting() == telemetryActionSdkEvents.getIncludeInLogsPrinting() && getIncludeImplicitParamsInLogs() == telemetryActionSdkEvents.getIncludeImplicitParamsInLogs();
    }

    public int hashCode() {
        String category = getCategory();
        int hashCode = (category != null ? category.hashCode() : 0) * 31;
        String message = getMessage();
        int hashCode2 = (hashCode + (message != null ? message.hashCode() : 0)) * 31;
        String logExtraMessage = getLogExtraMessage();
        int hashCode3 = (hashCode2 + (logExtraMessage != null ? logExtraMessage.hashCode() : 0)) * 31;
        boolean enabledBreadcrumbSending = getEnabledBreadcrumbSending();
        int i = enabledBreadcrumbSending;
        if (enabledBreadcrumbSending) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
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
        return "TelemetryActionSdkEvents(category=" + getCategory() + ", message=" + getMessage() + ", logExtraMessage=" + getLogExtraMessage() + ", enabledBreadcrumbSending=" + getEnabledBreadcrumbSending() + ", includeInLogsPrinting=" + getIncludeInLogsPrinting() + ", includeImplicitParamsInLogs=" + getIncludeImplicitParamsInLogs() + ")";
    }

    public TelemetryActionSdkEvents(@NotNull String category, @NotNull String message, @NotNull String logExtraMessage, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logExtraMessage, "logExtraMessage");
        this.category = category;
        this.message = message;
        this.logExtraMessage = logExtraMessage;
        this.enabledBreadcrumbSending = z;
        this.includeInLogsPrinting = z2;
        this.includeImplicitParamsInLogs = z3;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getCategory() {
        return this.category;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getLogExtraMessage() {
        return this.logExtraMessage;
    }

    public void setLogExtraMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logExtraMessage = str;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getEnabledBreadcrumbSending() {
        return this.enabledBreadcrumbSending;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getIncludeInLogsPrinting() {
        return this.includeInLogsPrinting;
    }

    public /* synthetic */ TelemetryActionSdkEvents(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getIncludeImplicitParamsInLogs() {
        return this.includeImplicitParamsInLogs;
    }

    static {
        boolean z = false;
        boolean z2 = false;
        AD_INSTANCE_CREATED = new TelemetryActionSdkEvents("ad", "Ad instance created", "created for placement %s", z, z2, false, 56, null);
        boolean z3 = false;
        boolean z4 = false;
        ADVERTISING_ID_OBTAINED = new TelemetryActionSdkEvents("sdk", "Advertising ID obtained", "Got advertising ID %s", z3, z4, false, 56, null);
        int i = 56;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z5 = false;
        SDK_SET_PRIVACY_PREFERENCES = new TelemetryActionSdkEvents("sdk", "Privacy Preferences set", "Privacy preferences were updated for: %s", z5, z, z2, i, defaultConstructorMarker);
        int i2 = 56;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z6 = false;
        SDK_SET_TEST_MODE_GLOBALLY = new TelemetryActionSdkEvents("sdk", "Test mode set", "Test Mode was turned %s globally", z6, z3, z4, i2, defaultConstructorMarker2);
        SDK_SET_SPOOF_MODE_GLOBALLY = new TelemetryActionSdkEvents("sdk", "Spoof mode set", "Spoof Mode was turned %s globally", z5, z, z2, i, defaultConstructorMarker);
        AD_INSTANCE_DESTROYED = new TelemetryActionSdkEvents("ad", "Ad instance destroyed", "destroyed", z6, z3, z4, i2, defaultConstructorMarker2);
        AD_INSTANCE_RENDERER_CREATED = new TelemetryActionSdkEvents("ad", "Ad instance renderer created", "created %s renderer", z5, z, z2, i, defaultConstructorMarker);
        AD_LOAD_REQUESTED = new TelemetryActionSdkEvents("ad", "Ad instance loadAd called", "loadAd() was called for placement %s", z6, z3, z4, i2, defaultConstructorMarker2);
        AD_BIDDING_LOAD_REQUESTED = new TelemetryActionSdkEvents("ad", "Ad instance loadAdFromBiddingToken called", "loadAdFromBiddingToken() was called", z5, z, z2, i, defaultConstructorMarker);
        AD_SHOW_REQUESTED = new TelemetryActionSdkEvents("ad", "Ad instance showAd() called", "showAd() called", z6, z3, z4, i2, defaultConstructorMarker2);
        AD_INSTANCE_SET_MUTED = new TelemetryActionSdkEvents("ad", "Ad instance setMuted", "setMuted(%s) called", z5, z, z2, i, defaultConstructorMarker);
        AD_MUTED_CALLBACK = new TelemetryActionSdkEvents("ad", "Ad instance adMutedChanged callback", "- muted changed callback", z6, z3, z4, i2, defaultConstructorMarker2);
        AD_INSTANCE_SET_TEST_MODE = new TelemetryActionSdkEvents("ad", "Ad instance setTestMode", "setTestMode(%s) called", z5, z, z2, i, defaultConstructorMarker);
        AD_LIFECYCLE_EVENT = new TelemetryActionSdkEvents("ad", "Ad instance %s callback", "- %s callback", z6, z3, z4, i2, defaultConstructorMarker2);
        AD_LIFECYCLE_ERROR = new TelemetryActionSdkEvents("ad", "Ad instance adError callback", "- error with message: %s", z5, z, z2, i, defaultConstructorMarker);
        BID_TOKEN_GENERATED = new TelemetryActionSdkEvents("bid", "Bidding token generated", "Bidding token generated", z6, z3, z4, i2, defaultConstructorMarker2);
    }

    @NotNull
    public final TelemetryActionSdkEvents updateExtraMessageField(@NotNull String updatedValue) {
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        String format = String.format(getLogExtraMessage(), Arrays.copyOf(new Object[]{updatedValue}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return copy$default(this, null, null, format, false, false, false, 59, null);
    }

    @NotNull
    public final TelemetryActionSdkEvents updateMessagesValues(@NotNull String newMessage, @NotNull String newExtraMessage) {
        Intrinsics.checkNotNullParameter(newMessage, "newMessage");
        Intrinsics.checkNotNullParameter(newExtraMessage, "newExtraMessage");
        String format = String.format(getMessage(), Arrays.copyOf(new Object[]{newMessage}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        String format2 = String.format(getLogExtraMessage(), Arrays.copyOf(new Object[]{newExtraMessage}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(this, *args)");
        return copy$default(this, null, format, format2, false, false, false, 57, null);
    }
}
