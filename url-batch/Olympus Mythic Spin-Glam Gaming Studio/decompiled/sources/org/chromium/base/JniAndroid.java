package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes11.dex */
public final class JniAndroid {
    static boolean sSimulateOomInSanitizedStacktraceForTesting;

    @CalledByNative
    private static String sanitizedStacktraceForUnhandledException(Throwable th) {
        try {
            if (sSimulateOomInSanitizedStacktraceForTesting) {
                return null;
            }
            try {
                return PiiElider.sanitizeStacktrace(Log.getStackTraceString(th));
            } catch (Throwable th2) {
                return "Error while getting stack trace: " + Log.getStackTraceString(th2);
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static class UncaughtExceptionException extends RuntimeException {
        public UncaughtExceptionException(String str, Throwable th) {
            super("Native stack trace:" + System.lineSeparator() + str, th);
        }
    }

    @CalledByNative
    private static Throwable handleException(Throwable th, String str) {
        try {
            Log.e("JniAndroid", "Handling uncaught Java exception", th);
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new UncaughtExceptionException(str, th));
            Log.e("JniAndroid", "Global uncaught exception handler did not terminate the process.");
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th2) {
            Log.e("JniAndroid", "Exception in uncaught exception handler.", th2);
            return th2;
        }
    }
}
