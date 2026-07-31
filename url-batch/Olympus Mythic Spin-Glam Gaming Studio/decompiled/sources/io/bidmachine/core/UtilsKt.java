package io.bidmachine.core;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0002\u0010\u0003\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"convertToBooleanOrNull", "", "", "(Ljava/lang/Integer;)Ljava/lang/Boolean;", "convertToInt", "convertToIntOrNull", "(Ljava/lang/Boolean;)Ljava/lang/Integer;", "bidmachine-android-sdk_ba_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class UtilsKt {
    @Nullable
    public static final Boolean convertToBooleanOrNull(@Nullable Integer num) {
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int convertToInt(boolean z) {
        return z ? 1 : 0;
    }

    @Nullable
    public static final Integer convertToIntOrNull(@Nullable Boolean bool) {
        if (bool != null) {
            return Integer.valueOf(convertToInt(bool.booleanValue()));
        }
        return null;
    }
}
