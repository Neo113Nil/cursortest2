package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u {
    public static /* synthetic */ t a(String str, MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        return a(str, errorType, cVar, map);
    }

    @NotNull
    public static final t a(@NotNull String adUnitId, @NotNull MolocoAdError.ErrorType errorType, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, @NotNull Map<String, String> details) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        Intrinsics.checkNotNullParameter(details, "details");
        return new t(new MolocoAdError("Moloco", adUnitId, errorType, null, 8, null), subErrorType, details);
    }
}
