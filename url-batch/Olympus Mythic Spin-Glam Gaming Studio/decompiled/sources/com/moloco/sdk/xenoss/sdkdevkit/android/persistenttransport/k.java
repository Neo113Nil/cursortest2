package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.annotation.VisibleForTesting;
import androidx.work.Data;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class k {
    @VisibleForTesting
    @Nullable
    public static final Data a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Pair[] pairArr = {TuplesKt.to("url", str)};
            Data.Builder builder = new Data.Builder();
            Pair pair = pairArr[0];
            builder.put((String) pair.getFirst(), pair.getSecond());
            Data build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "dataBuilder.build()");
            return build;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, j.d, e.getMessage() + ". Url: " + str, null, false, 12, null);
            return null;
        }
    }
}
