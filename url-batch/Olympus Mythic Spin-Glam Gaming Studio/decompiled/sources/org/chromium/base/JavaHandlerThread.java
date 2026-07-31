package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import internal.org.jni_zero.CalledByNative;
import java.lang.Thread;

/* loaded from: classes15.dex */
public class JavaHandlerThread {
    private final HandlerThread mThread;
    private Throwable mUnhandledException;

    interface Natives {
        void initializeThread(long j, long j2);

        void onLooperStopped(long j);
    }

    public JavaHandlerThread(String str, int i) {
        this.mThread = new HandlerThread(str, i);
    }

    @CalledByNative
    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    public void maybeStart() {
        if (hasStarted()) {
            return;
        }
        this.mThread.start();
    }

    @CalledByNative
    private void startAndInitialize(final long j, final long j2) {
        maybeStart();
        new Handler(this.mThread.getLooper()).post(new Runnable(this) { // from class: org.chromium.base.JavaHandlerThread.1
            final /* synthetic */ JavaHandlerThread this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                JavaHandlerThreadJni.get().initializeThread(j, j2);
            }
        });
    }

    @CalledByNative
    private void quitThreadSafely(final long j) {
        new Handler(this.mThread.getLooper()).post(new Runnable(this) { // from class: org.chromium.base.JavaHandlerThread.2
            final /* synthetic */ JavaHandlerThread this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mThread.quit();
                JavaHandlerThreadJni.get().onLooperStopped(j);
            }
        });
        this.mThread.getLooper().quitSafely();
    }

    @CalledByNative
    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.mThread.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    private boolean hasStarted() {
        return this.mThread.getState() != Thread.State.NEW;
    }

    @CalledByNative
    private boolean isAlive() {
        return this.mThread.isAlive();
    }

    @CalledByNative
    private void listenForUncaughtExceptionsForTesting() {
        this.mThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: org.chromium.base.JavaHandlerThread.3
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                JavaHandlerThread.this.mUnhandledException = th;
            }
        });
    }

    @CalledByNative
    private Throwable getUncaughtExceptionIfAny() {
        return this.mUnhandledException;
    }
}
