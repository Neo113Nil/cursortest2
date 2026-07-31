package io.bidmachine.iab.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.Logger;

/* loaded from: classes6.dex */
public class CommonLog {
    private static final Logger a = new Logger("CommonLog");

    public static boolean canSendDLog() {
        return a.canSendDLog();
    }

    public static boolean canSendELog() {
        return a.canSendELog();
    }

    public static boolean canSendWLog() {
        return a.canSendWLog();
    }

    public static void d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        a.d(str, str2, objArr);
    }

    public static void e(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        a.e(str, str2, objArr);
    }

    public static void setLoggingLevel(@Nullable Logger.LogLevel logLevel) {
        a.setLoggingLevel(logLevel);
    }

    public static void e(@NonNull String str, @NonNull Throwable th) {
        a.e(str, th);
    }
}
