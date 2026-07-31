package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EID_REQUEST_SENT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: TelemetrySdkTypes.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B?\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetrySdkActionType;", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "category", "", "message", "logExtraMessage", "enabledBreadcrumbSending", "", "includeInLogsPrinting", "includeImplicitParamsInLogs", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getCategory", "()Ljava/lang/String;", "getEnabledBreadcrumbSending", "()Z", "getIncludeImplicitParamsInLogs", "getIncludeInLogsPrinting", "getLogExtraMessage", "getMessage", "setMessage", "(Ljava/lang/String;)V", "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE", "EID_REQUEST_SENT", "EID_RESPONSE_RECEIVED", "BID_REQUEST_SENT", "BID_RESPONSE_RECEIVED", "BID_TOKEN_DECODED", "WINING_BID_SELECTED", "BID_INELIGIBLE_RESPONSE", "AD_LIFECYCLE_EVENT", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes5.dex */
public final class TelemetrySdkActionType implements TelemetryActionType {
    private static final /* synthetic */ TelemetrySdkActionType[] $VALUES;
    public static final TelemetrySdkActionType AD_LIFECYCLE_EVENT;
    public static final TelemetrySdkActionType BID_INELIGIBLE_RESPONSE;
    public static final TelemetrySdkActionType BID_REQUEST_SENT;
    public static final TelemetrySdkActionType BID_RESPONSE_RECEIVED;
    public static final TelemetrySdkActionType BID_TOKEN_DECODED;
    public static final TelemetrySdkActionType EID_REQUEST_SENT;
    public static final TelemetrySdkActionType EID_RESPONSE_RECEIVED;
    public static final TelemetrySdkActionType GOOGLE_PLAY_SERVICES_NOT_AVAILABLE;
    public static final TelemetrySdkActionType WINING_BID_SELECTED;

    @NotNull
    private final String category;
    private final boolean enabledBreadcrumbSending;
    private final boolean includeImplicitParamsInLogs;
    private final boolean includeInLogsPrinting;

    @NotNull
    private final String logExtraMessage;

    @NotNull
    private String message;

    public static TelemetrySdkActionType valueOf(String str) {
        return (TelemetrySdkActionType) Enum.valueOf(TelemetrySdkActionType.class, str);
    }

    public static TelemetrySdkActionType[] values() {
        return (TelemetrySdkActionType[]) $VALUES.clone();
    }

    private TelemetrySdkActionType(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.category = str2;
        this.message = str3;
        this.logExtraMessage = str4;
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

    /* synthetic */ TelemetrySdkActionType(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 4) != 0 ? "" : str4, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? true : z3);
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

    static {
        TelemetrySdkActionType telemetrySdkActionType = new TelemetrySdkActionType("GOOGLE_PLAY_SERVICES_NOT_AVAILABLE", 0, "sdk", "Play services failed", "Google Play Services is not available, so advertising ID will be zeroes", false, false, false, 56, null);
        GOOGLE_PLAY_SERVICES_NOT_AVAILABLE = telemetrySdkActionType;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        TelemetrySdkActionType telemetrySdkActionType2 = new TelemetrySdkActionType("EID_REQUEST_SENT", 1, TelemetryCategory.EID, "EID request sent", str, z, z2, z3, 52, defaultConstructorMarker);
        EID_REQUEST_SENT = telemetrySdkActionType2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str2 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        TelemetrySdkActionType telemetrySdkActionType3 = new TelemetrySdkActionType("EID_RESPONSE_RECEIVED", 2, TelemetryCategory.EID, "EID response received", str2, z4, z5, z6, 52, defaultConstructorMarker2);
        EID_RESPONSE_RECEIVED = telemetrySdkActionType3;
        TelemetrySdkActionType telemetrySdkActionType4 = new TelemetrySdkActionType("BID_REQUEST_SENT", 3, "bid", "Bid Request sent", str, z, z2, z3, 60, defaultConstructorMarker);
        BID_REQUEST_SENT = telemetrySdkActionType4;
        int i = 60;
        TelemetrySdkActionType telemetrySdkActionType5 = new TelemetrySdkActionType("BID_RESPONSE_RECEIVED", 4, "bid", "Bid Response received", str2, z4, z5, z6, i, defaultConstructorMarker2);
        BID_RESPONSE_RECEIVED = telemetrySdkActionType5;
        TelemetrySdkActionType telemetrySdkActionType6 = new TelemetrySdkActionType("BID_TOKEN_DECODED", 5, "bid", "Bidding token decoded", "Bidding token decoded", z, z2, z3, 56, defaultConstructorMarker);
        BID_TOKEN_DECODED = telemetrySdkActionType6;
        TelemetrySdkActionType telemetrySdkActionType7 = new TelemetrySdkActionType("WINING_BID_SELECTED", 6, "bid", "Selected winning Bid", str2, z4, z5, z6, i, defaultConstructorMarker2);
        WINING_BID_SELECTED = telemetrySdkActionType7;
        TelemetrySdkActionType telemetrySdkActionType8 = new TelemetrySdkActionType("BID_INELIGIBLE_RESPONSE", 7, "bid", "Bid response ineligible", null, z, z2, z3, 60, defaultConstructorMarker);
        BID_INELIGIBLE_RESPONSE = telemetrySdkActionType8;
        TelemetrySdkActionType telemetrySdkActionType9 = new TelemetrySdkActionType("AD_LIFECYCLE_EVENT", 8, "ad", "Ad instance lifecycle event callbacks", str2, z4, z5, z6, i, defaultConstructorMarker2);
        AD_LIFECYCLE_EVENT = telemetrySdkActionType9;
        $VALUES = new TelemetrySdkActionType[]{telemetrySdkActionType, telemetrySdkActionType2, telemetrySdkActionType3, telemetrySdkActionType4, telemetrySdkActionType5, telemetrySdkActionType6, telemetrySdkActionType7, telemetrySdkActionType8, telemetrySdkActionType9};
    }
}
