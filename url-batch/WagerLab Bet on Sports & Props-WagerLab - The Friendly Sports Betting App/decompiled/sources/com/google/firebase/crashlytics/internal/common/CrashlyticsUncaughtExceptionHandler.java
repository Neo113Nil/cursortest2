package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final CrashListener crashListener;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private final CrashlyticsNativeComponent nativeComponent;
    private final SettingsProvider settingsProvider;

    interface CrashListener {
        void onUncaughtException(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.crashListener = crashListener;
        this.settingsProvider = settingsProvider;
        this.defaultHandler = uncaughtExceptionHandler;
        this.nativeComponent = crashlyticsNativeComponent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing, but no default exception handler.");
        java.lang.System.exit(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r7.defaultHandler == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r7.defaultHandler != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
        r7.defaultHandler.uncaughtException(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r7.isHandlingException.set(false);
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uncaughtException(Thread thread, Throwable th) {
        this.isHandlingException.set(true);
        try {
            try {
                if (shouldRecordUncaughtException(thread, th)) {
                    this.crashListener.onUncaughtException(this.settingsProvider, thread, th);
                } else {
                    Logger.getLogger().d("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                Logger.getLogger().e("An error occurred in the uncaught exception handler", e);
            }
        } catch (Throwable th2) {
            if (this.defaultHandler != null) {
                Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
                this.defaultHandler.uncaughtException(thread, th);
            } else {
                Logger.getLogger().d("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.isHandlingException.set(false);
            throw th2;
        }
    }

    boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    private boolean shouldRecordUncaughtException(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.nativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        }
        Logger.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }
}
