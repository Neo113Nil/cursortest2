package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STATUS_CODE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: TelemetryBaseTypes.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryBaseParamType;", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;", "value", "", "printInLogs", "", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getPrintInLogs", "()Z", "getValue", "()Ljava/lang/String;", "EXCEPTION_DETAILS", "STATUS_CODE", "REASON", "URL", "BODY", "HEADERS", "REQUEST_METHOD", "REQUEST_ACTION_INSTANCE", "DATA_VALID", "AD_CLICKTHROUGH", "AD_EXPIRY", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class TelemetryBaseParamType implements TelemetryParamType {
    private static final /* synthetic */ TelemetryBaseParamType[] $VALUES;
    public static final TelemetryBaseParamType AD_CLICKTHROUGH;
    public static final TelemetryBaseParamType AD_EXPIRY;
    public static final TelemetryBaseParamType BODY;
    public static final TelemetryBaseParamType DATA_VALID;
    public static final TelemetryBaseParamType EXCEPTION_DETAILS;
    public static final TelemetryBaseParamType HEADERS;
    public static final TelemetryBaseParamType REASON;
    public static final TelemetryBaseParamType REQUEST_ACTION_INSTANCE;
    public static final TelemetryBaseParamType REQUEST_METHOD;
    public static final TelemetryBaseParamType STATUS_CODE;
    public static final TelemetryBaseParamType URL;
    private final boolean printInLogs;

    @NotNull
    private final String value;

    public static TelemetryBaseParamType valueOf(String str) {
        return (TelemetryBaseParamType) Enum.valueOf(TelemetryBaseParamType.class, str);
    }

    public static TelemetryBaseParamType[] values() {
        return (TelemetryBaseParamType[]) $VALUES.clone();
    }

    private TelemetryBaseParamType(String str, int i, String str2, boolean z) {
        this.value = str2;
        this.printInLogs = z;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    @NotNull
    public String getValue() {
        return this.value;
    }

    /* synthetic */ TelemetryBaseParamType(String str, int i, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? true : z);
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    public boolean getPrintInLogs() {
        return this.printInLogs;
    }

    static {
        TelemetryBaseParamType telemetryBaseParamType = new TelemetryBaseParamType("EXCEPTION_DETAILS", 0, "exceptionDetails", false, 2, null);
        EXCEPTION_DETAILS = telemetryBaseParamType;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        TelemetryBaseParamType telemetryBaseParamType2 = new TelemetryBaseParamType("STATUS_CODE", 1, "bid.response.httpcode", z, i, defaultConstructorMarker);
        STATUS_CODE = telemetryBaseParamType2;
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z2 = false;
        TelemetryBaseParamType telemetryBaseParamType3 = new TelemetryBaseParamType("REASON", 2, "bid.ineligible.reason", z2, i2, defaultConstructorMarker2);
        REASON = telemetryBaseParamType3;
        TelemetryBaseParamType telemetryBaseParamType4 = new TelemetryBaseParamType("URL", 3, "bid.request.url", z, i, defaultConstructorMarker);
        URL = telemetryBaseParamType4;
        TelemetryBaseParamType telemetryBaseParamType5 = new TelemetryBaseParamType("BODY", 4, "body", z2, i2, defaultConstructorMarker2);
        BODY = telemetryBaseParamType5;
        TelemetryBaseParamType telemetryBaseParamType6 = new TelemetryBaseParamType("HEADERS", 5, "headers", z, i, defaultConstructorMarker);
        HEADERS = telemetryBaseParamType6;
        TelemetryBaseParamType telemetryBaseParamType7 = new TelemetryBaseParamType("REQUEST_METHOD", 6, "bid.request.httpmethod", z2, i2, defaultConstructorMarker2);
        REQUEST_METHOD = telemetryBaseParamType7;
        TelemetryBaseParamType telemetryBaseParamType8 = new TelemetryBaseParamType("REQUEST_ACTION_INSTANCE", 7, "requestActionInstance", false);
        REQUEST_ACTION_INSTANCE = telemetryBaseParamType8;
        TelemetryBaseParamType telemetryBaseParamType9 = new TelemetryBaseParamType("DATA_VALID", 8, "dataValid", false, 2, null);
        DATA_VALID = telemetryBaseParamType9;
        TelemetryBaseParamType telemetryBaseParamType10 = new TelemetryBaseParamType("AD_CLICKTHROUGH", 9, "ad.clickurl", false, 2, null);
        AD_CLICKTHROUGH = telemetryBaseParamType10;
        TelemetryBaseParamType telemetryBaseParamType11 = new TelemetryBaseParamType("AD_EXPIRY", 10, "ad.expiry", false, 2, null);
        AD_EXPIRY = telemetryBaseParamType11;
        $VALUES = new TelemetryBaseParamType[]{telemetryBaseParamType, telemetryBaseParamType2, telemetryBaseParamType3, telemetryBaseParamType4, telemetryBaseParamType5, telemetryBaseParamType6, telemetryBaseParamType7, telemetryBaseParamType8, telemetryBaseParamType9, telemetryBaseParamType10, telemetryBaseParamType11};
    }
}
