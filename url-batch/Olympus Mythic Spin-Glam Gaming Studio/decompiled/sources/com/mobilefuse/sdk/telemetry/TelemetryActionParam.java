package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetryDataModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "", "type", "Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;", "value", "includeToBreadcrumb", "", "(Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;Ljava/lang/Object;Z)V", "getIncludeToBreadcrumb", "()Z", "setIncludeToBreadcrumb", "(Z)V", "getType", "()Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes5.dex */
public final /* data */ class TelemetryActionParam {
    private boolean includeToBreadcrumb;

    @NotNull
    private final TelemetryParamType type;

    @NotNull
    private final Object value;

    public static /* synthetic */ TelemetryActionParam copy$default(TelemetryActionParam telemetryActionParam, TelemetryParamType telemetryParamType, Object obj, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            telemetryParamType = telemetryActionParam.type;
        }
        if ((i & 2) != 0) {
            obj = telemetryActionParam.value;
        }
        if ((i & 4) != 0) {
            z = telemetryActionParam.includeToBreadcrumb;
        }
        return telemetryActionParam.copy(telemetryParamType, obj, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TelemetryParamType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeToBreadcrumb() {
        return this.includeToBreadcrumb;
    }

    @NotNull
    public final TelemetryActionParam copy(@NotNull TelemetryParamType type, @NotNull Object value, boolean includeToBreadcrumb) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new TelemetryActionParam(type, value, includeToBreadcrumb);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryActionParam)) {
            return false;
        }
        TelemetryActionParam telemetryActionParam = (TelemetryActionParam) other;
        return Intrinsics.areEqual(this.type, telemetryActionParam.type) && Intrinsics.areEqual(this.value, telemetryActionParam.value) && this.includeToBreadcrumb == telemetryActionParam.includeToBreadcrumb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        TelemetryParamType telemetryParamType = this.type;
        int hashCode = (telemetryParamType != null ? telemetryParamType.hashCode() : 0) * 31;
        Object obj = this.value;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        boolean z = this.includeToBreadcrumb;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    @NotNull
    public String toString() {
        return "TelemetryActionParam(type=" + this.type + ", value=" + this.value + ", includeToBreadcrumb=" + this.includeToBreadcrumb + ")";
    }

    public TelemetryActionParam(@NotNull TelemetryParamType type, @NotNull Object value, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.type = type;
        this.value = value;
        this.includeToBreadcrumb = z;
    }

    @NotNull
    public final TelemetryParamType getType() {
        return this.type;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    public /* synthetic */ TelemetryActionParam(TelemetryParamType telemetryParamType, Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(telemetryParamType, obj, (i & 4) != 0 ? true : z);
    }

    public final boolean getIncludeToBreadcrumb() {
        return this.includeToBreadcrumb;
    }

    public final void setIncludeToBreadcrumb(boolean z) {
        this.includeToBreadcrumb = z;
    }
}
