package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class K {
    public static final long a() {
        return System.currentTimeMillis();
    }

    @NotNull
    public static final SimpleDateFormat a(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}
