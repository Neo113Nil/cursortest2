package org.chromium.base;

import internal.org.chromium.build.BuildConfig;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class Log {
    private static String formatLog(String str, Throwable th, Object[] objArr) {
        return objArr != null ? ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr) : str;
    }

    public static String normalizeTag(String str) {
        return "cn_" + str;
    }

    public static boolean isLoggable(String str, int i) {
        return BuildConfig.ENABLE_DEBUG_LOGS || android.util.Log.isLoggable(str, i);
    }

    public static void v(String str, String str2, Object... objArr) {
        if (isLoggable(str, 2)) {
            Throwable throwableToLog = getThrowableToLog(objArr);
            String formatLog = formatLog(str2, throwableToLog, objArr);
            String normalizeTag = normalizeTag(str);
            if (throwableToLog != null) {
                android.util.Log.v(normalizeTag, formatLog, throwableToLog);
            } else {
                android.util.Log.v(normalizeTag, formatLog);
            }
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (isLoggable(str, 3)) {
            Throwable throwableToLog = getThrowableToLog(objArr);
            String formatLog = formatLog(str2, throwableToLog, objArr);
            String normalizeTag = normalizeTag(str);
            if (throwableToLog != null) {
                android.util.Log.d(normalizeTag, formatLog, throwableToLog);
            } else {
                android.util.Log.d(normalizeTag, formatLog);
            }
        }
    }

    public static void i(String str, String str2) {
        android.util.Log.i(normalizeTag(str), str2);
    }

    public static void i(String str, String str2, Throwable th) {
        android.util.Log.i(normalizeTag(str), str2, th);
    }

    public static void i(String str, String str2, Object obj, Object obj2) {
        android.util.Log.i(normalizeTag(str), String.format(Locale.US, str2, obj, obj2));
    }

    public static void w(String str, String str2) {
        android.util.Log.w(normalizeTag(str), str2);
    }

    public static void w(String str, String str2, Throwable th) {
        android.util.Log.w(normalizeTag(str), str2, th);
    }

    public static void w(String str, String str2, Object obj) {
        android.util.Log.w(normalizeTag(str), String.format(Locale.US, str2, obj));
    }

    public static void w(String str, String str2, Object obj, Object obj2) {
        android.util.Log.w(normalizeTag(str), String.format(Locale.US, str2, obj, obj2));
    }

    public static void w(String str, String str2, Object obj, Object obj2, Object obj3) {
        android.util.Log.w(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3));
    }

    public static void e(String str, String str2) {
        android.util.Log.e(normalizeTag(str), str2);
    }

    public static void e(String str, String str2, Throwable th) {
        android.util.Log.e(normalizeTag(str), str2, th);
    }

    public static void e(String str, String str2, Object obj) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj));
    }

    public static void e(String str, String str2, Object obj, Throwable th) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj), th);
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }
}
