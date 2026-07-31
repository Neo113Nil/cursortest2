package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.LogListener;
import io.bidmachine.iab.utils.Logger;

/* loaded from: classes5.dex */
public class VastLog {
    private static final Logger a = new Logger("VastLog");

    public static void addLogListener(@Nullable LogListener logListener) {
        a.addLogListener(logListener);
    }

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

    public static boolean removeLogListener(@Nullable LogListener logListener) {
        return a.removeLogListener(logListener);
    }

    public static void setLoggingLevel(@Nullable Logger.LogLevel logLevel) {
        a.setLoggingLevel(logLevel);
    }

    public static void e(@NonNull String str, @NonNull Throwable th) {
        a.e(str, th);
    }
}
