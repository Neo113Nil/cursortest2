package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetryDataModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, d2 = {"isTheSameActionType", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "other", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public final class TelemetryDataModelKt {
    public static final boolean isTheSameActionType(@NotNull TelemetryActionType isTheSameActionType, @NotNull TelemetryActionType other) {
        Intrinsics.checkNotNullParameter(isTheSameActionType, "$this$isTheSameActionType");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(isTheSameActionType.getCategory(), other.getCategory()) && new Regex(StringsKt.replace$default(other.getMessage(), "%s", ".*", false, 4, (Object) null)).containsMatchIn(isTheSameActionType.getMessage()) && new Regex(StringsKt.replace$default(other.getLogExtraMessage(), "%s", ".*", false, 4, (Object) null)).containsMatchIn(isTheSameActionType.getLogExtraMessage());
    }
}
