package com.moloco.sdk.internal.utils;

import android.content.Context;
import android.os.StatFs;
import androidx.compose.runtime.internal.StabilityInferred;
import com.adjust.sdk.Constants;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.safedk.android.analytics.events.RedirectEvent;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class f {

    @NotNull
    public static final f a = new f();
    public static final int b = 50;
    public static final int c = 75;
    public static final int d = 33;
    public static final int e = 66;
    public static final int f = 0;

    @Nullable
    public final e a(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            String parent = file.getParent();
            if (parent == null) {
                parent = file.getAbsolutePath();
            }
            StatFs statFs = new StatFs(parent);
            return new e(statFs.getAvailableBytes(), statFs.getTotalBytes());
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public final String b(int i) {
        return i < 50 ? "low" : i < 75 ? Constants.MEDIUM : Constants.HIGH;
    }

    @Nullable
    public final String a(@NotNull File file, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(context, "context");
        File externalCacheDir = context.getExternalCacheDir();
        String absolutePath = file.getAbsolutePath();
        if (externalCacheDir != null) {
            Intrinsics.checkNotNull(absolutePath);
            String absolutePath2 = externalCacheDir.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
            if (StringsKt.startsWith$default(absolutePath, absolutePath2, false, 2, (Object) null)) {
                return "external";
            }
        }
        Intrinsics.checkNotNull(absolutePath);
        String absolutePath3 = context.getCacheDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath3, "getAbsolutePath(...)");
        if (StringsKt.startsWith$default(absolutePath, absolutePath3, false, 2, (Object) null)) {
            return RedirectEvent.i;
        }
        return null;
    }

    @NotNull
    public final String a(int i) {
        if (i <= 33) {
            return "0-33";
        }
        if (i <= 66) {
            return "34-66";
        }
        if (i < 100) {
            return "67-99";
        }
        return StatisticData.ERROR_CODE_NOT_FOUND;
    }
}
