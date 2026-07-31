package io.bidmachine.utils;

import io.bidmachine.iab.IabError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toBMError", "Lio/bidmachine/utils/BMError;", "Lio/bidmachine/iab/IabError;", "bidmachine-android-sdk_ba_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class IabUtilsKt {
    @NotNull
    public static final BMError toBMError(@NotNull IabError iabError) {
        BMError bMError;
        Intrinsics.checkNotNullParameter(iabError, "<this>");
        int code = iabError.getCode();
        if (code != 1) {
            if (code != 3) {
                if (code == 5) {
                    bMError = BMError.PlaceholderTimeout;
                    Intrinsics.checkNotNullExpressionValue(bMError, "{\n            BMError.PlaceholderTimeout\n        }");
                } else if (code == 6) {
                    bMError = BMError.Expired;
                    Intrinsics.checkNotNullExpressionValue(bMError, "{\n            BMError.Expired\n        }");
                } else if (code != 7) {
                    bMError = BMError.InternalUnknownError;
                    Intrinsics.checkNotNullExpressionValue(bMError, "{\n            BMError.In…nalUnknownError\n        }");
                }
            }
            bMError = BMError.NoFill;
            Intrinsics.checkNotNullExpressionValue(bMError, "{\n            BMError.NoFill\n        }");
        } else {
            bMError = BMError.NoConnection;
            Intrinsics.checkNotNullExpressionValue(bMError, "{\n            BMError.NoConnection\n        }");
        }
        return new BMError(bMError, code, iabError.getMessage());
    }
}
