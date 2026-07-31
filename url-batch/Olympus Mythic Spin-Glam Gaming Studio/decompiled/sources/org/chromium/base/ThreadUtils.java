package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import internal.org.chromium.build.BuildConfig;
import internal.org.jni_zero.CalledByNative;
import org.chromium.base.task.PostTask;

/* loaded from: classes13.dex */
public class ThreadUtils {
    private static Thread sInstrumentationThreadForTesting;
    private static final Object sLock = new Object();
    private static boolean sThreadAssertsDisabledForTesting;
    private static volatile Handler sUiThreadHandler;
    private static Throwable sUiThreadInitializer;
    private static volatile boolean sWillOverride;

    public static void assertOnUiThread() {
    }

    public static class ThreadChecker {
        private Thread mThread;

        public ThreadChecker() {
            resetThreadId();
        }

        public void resetThreadId() {
            if (BuildConfig.ENABLE_ASSERTS) {
                this.mThread = Thread.currentThread();
            }
        }

        public void assertOnValidThread() {
            assertOnValidThreadHelper(false);
        }

        private void assertOnValidThreadHelper(boolean z) {
            Thread currentThread;
            if (!BuildConfig.ENABLE_ASSERTS || ThreadUtils.sThreadAssertsDisabledForTesting || (currentThread = Thread.currentThread()) == this.mThread) {
                return;
            }
            if (z && currentThread == ThreadUtils.sInstrumentationThreadForTesting) {
                return;
            }
            ThreadUtils.getUiThreadLooper().getThread();
        }
    }

    public static void setUiThread(Looper looper) {
        synchronized (sLock) {
            try {
                if (sUiThreadHandler == null) {
                    if (BuildConfig.ENABLE_ASSERTS) {
                        sUiThreadInitializer = new Throwable("This is who set sUiThreadHandler.");
                    }
                    sUiThreadHandler = new Handler(looper);
                    TraceEvent.onUiThreadReady();
                } else if (sUiThreadHandler.getLooper() != looper) {
                    RuntimeException runtimeException = new RuntimeException("UI thread looper is already set to " + String.valueOf(sUiThreadHandler.getLooper()) + " (Main thread looper is " + String.valueOf(Looper.getMainLooper()) + "), cannot set to new looper " + String.valueOf(looper));
                    if (BuildConfig.ENABLE_ASSERTS) {
                        runtimeException.initCause(sUiThreadInitializer);
                        throw runtimeException;
                    }
                    throw runtimeException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Handler getUiThreadHandler() {
        if (sUiThreadHandler != null) {
            return sUiThreadHandler;
        }
        if (sWillOverride) {
            throw new RuntimeException("Did not yet override the UI thread");
        }
        setUiThread(Looper.getMainLooper());
        return sUiThreadHandler;
    }

    public static void runOnUiThread(Runnable runnable) {
        PostTask.runOrPostTask(7, runnable);
    }

    public static boolean runningOnUiThread() {
        return getUiThreadHandler().getLooper() == Looper.myLooper();
    }

    public static Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }
}
