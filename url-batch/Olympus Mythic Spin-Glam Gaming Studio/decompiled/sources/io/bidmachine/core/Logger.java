package io.bidmachine.core;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.util.log.LoggerSettings;
import io.bidmachine.utils.lazy.LazyValue;
import io.bidmachine.utils.log.DefaultLoggerInstance;
import io.bidmachine.utils.log.EmptyLoggerInstance;
import io.bidmachine.utils.log.LoggerInstance;

/* loaded from: classes15.dex */
public class Logger {
    private static boolean isLoggingEnabled;

    @NonNull
    private static volatile LoggerInstance enabledInstance = new DefaultLoggerInstance("BidMachineLog");

    @NonNull
    private static volatile LoggerInstance disabledInstance = new EmptyLoggerInstance();

    @NonNull
    @VisibleForTesting
    static volatile LoggerInstance instance = disabledInstance;

    public static void d(@NonNull Object obj, @NonNull String str) {
        instance.d(obj, str);
    }

    public static void e(@NonNull Object obj, @NonNull String str) {
        instance.e(obj, str);
    }

    public static boolean isLoggingEnabled() {
        return isLoggingEnabled;
    }

    public static void setDisabledInstance(@NonNull LoggerInstance loggerInstance) {
        disabledInstance = loggerInstance;
        setLoggingEnabled(isLoggingEnabled);
    }

    public static void setEnabledInstance(@NonNull LoggerInstance loggerInstance) {
        enabledInstance = loggerInstance;
        setLoggingEnabled(isLoggingEnabled);
    }

    public static void setLoggingEnabled(boolean z) {
        isLoggingEnabled = z;
        instance = z ? enabledInstance : disabledInstance;
        LoggerSettings.setEnable(z);
    }

    public static void w(@NonNull Object obj, @NonNull String str) {
        instance.w(obj, str);
    }

    public static void d(@NonNull String str) {
        instance.d(str);
    }

    public static void e(@NonNull Object obj, @NonNull Throwable th) {
        instance.e(obj, th);
    }

    public static void w(@NonNull String str) {
        instance.w(str);
    }

    public static void d(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        instance.d(obj, lazyValue);
    }

    public static void e(@NonNull String str) {
        instance.e(str);
    }

    public static void w(@NonNull Throwable th) {
        instance.w(th);
    }

    public static void d(@NonNull LazyValue<String> lazyValue) {
        instance.d(lazyValue);
    }

    public static void e(@NonNull Throwable th) {
        instance.e(th);
    }

    public static void w(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        instance.w(obj, lazyValue);
    }

    public static void e(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        instance.e(obj, lazyValue);
    }

    public static void w(@NonNull Object obj, @NonNull Throwable th) {
        instance.w(obj, th);
    }

    public static void e(@NonNull LazyValue<String> lazyValue) {
        instance.e(lazyValue);
    }

    public static void w(@NonNull LazyValue<String> lazyValue) {
        instance.w(lazyValue);
    }
}
