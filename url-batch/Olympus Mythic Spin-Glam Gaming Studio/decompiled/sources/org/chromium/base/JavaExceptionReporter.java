package org.chromium.base;

import android.os.DeadSystemException;
import internal.org.jni_zero.CalledByNative;
import java.lang.Thread;
import org.chromium.base.JniAndroid;

/* loaded from: classes15.dex */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final Thread.UncaughtExceptionHandler mParent;

    interface Natives {
        void reportJavaException(boolean z, Throwable th);
    }

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.mParent = uncaughtExceptionHandler;
        this.mCrashAfterReport = z;
    }

    public static boolean shouldReportThrowable(Throwable th) {
        return !(th instanceof DeadSystemException);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.mHandlingException && shouldReportThrowable(th)) {
            this.mHandlingException = true;
            JavaExceptionReporterJni.get().reportJavaException(this.mCrashAfterReport, th instanceof JniAndroid.UncaughtExceptionException ? th.getCause() : th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mParent;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @CalledByNative
    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }
}
