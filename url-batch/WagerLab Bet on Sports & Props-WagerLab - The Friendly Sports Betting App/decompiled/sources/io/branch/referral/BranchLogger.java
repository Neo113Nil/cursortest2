package io.branch.referral;

import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import expo.modules.notifications.service.NotificationsService;
import io.branch.interfaces.IBranchLoggingCallbacks;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BranchLogger.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020\rH\u0002J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lio/branch/referral/BranchLogger;", "", "()V", "TAG", "", "loggerCallback", "Lio/branch/interfaces/IBranchLoggingCallbacks;", "getLoggerCallback$annotations", "getLoggerCallback", "()Lio/branch/interfaces/IBranchLoggingCallbacks;", "setLoggerCallback", "(Lio/branch/interfaces/IBranchLoggingCallbacks;)V", "loggingEnabled", "", "getLoggingEnabled$annotations", "getLoggingEnabled", "()Z", "setLoggingEnabled", "(Z)V", "loggingLevel", "Lio/branch/referral/BranchLogger$BranchLogLevel;", "getLoggingLevel$annotations", "getLoggingLevel", "()Lio/branch/referral/BranchLogger$BranchLogLevel;", "setLoggingLevel", "(Lio/branch/referral/BranchLogger$BranchLogLevel;)V", "d", "", "message", "e", "i", "logAlways", "shouldLog", FirebaseAnalytics.Param.LEVEL, "stackTraceToString", NotificationsService.EXCEPTION_KEY, "Ljava/lang/Exception;", "useCustomLogger", "v", "w", "BranchLogLevel", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BranchLogger {
    private static final String TAG = "BranchSDK";
    private static IBranchLoggingCallbacks loggerCallback;
    private static boolean loggingEnabled;
    public static final BranchLogger INSTANCE = new BranchLogger();
    private static BranchLogLevel loggingLevel = BranchLogLevel.DEBUG;

    @JvmStatic
    public static /* synthetic */ void getLoggerCallback$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getLoggingEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getLoggingLevel$annotations() {
    }

    private BranchLogger() {
    }

    /* compiled from: BranchLogger.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/branch/referral/BranchLogger$BranchLogLevel;", "", FirebaseAnalytics.Param.LEVEL, "", "(Ljava/lang/String;II)V", "getLevel", "()I", "ERROR", "WARN", "INFO", "DEBUG", "VERBOSE", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum BranchLogLevel {
        ERROR(1),
        WARN(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        BranchLogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    public static final BranchLogLevel getLoggingLevel() {
        return loggingLevel;
    }

    public static final void setLoggingLevel(BranchLogLevel branchLogLevel) {
        Intrinsics.checkNotNullParameter(branchLogLevel, "<set-?>");
        loggingLevel = branchLogLevel;
    }

    public static final boolean getLoggingEnabled() {
        return loggingEnabled;
    }

    public static final void setLoggingEnabled(boolean z) {
        loggingEnabled = z;
    }

    public static final IBranchLoggingCallbacks getLoggerCallback() {
        return loggerCallback;
    }

    public static final void setLoggerCallback(IBranchLoggingCallbacks iBranchLoggingCallbacks) {
        loggerCallback = iBranchLoggingCallbacks;
    }

    private final boolean shouldLog(BranchLogLevel level) {
        return level.getLevel() <= loggingLevel.getLevel();
    }

    @JvmStatic
    public static final void e(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BranchLogger branchLogger = INSTANCE;
        if (loggingEnabled && branchLogger.shouldLog(BranchLogLevel.ERROR) && message.length() > 0) {
            if (branchLogger.useCustomLogger()) {
                IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
                if (iBranchLoggingCallbacks != null) {
                    iBranchLoggingCallbacks.onBranchLog(message, "ERROR");
                    return;
                }
                return;
            }
            Log.e(TAG, message);
        }
    }

    @JvmStatic
    public static final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BranchLogger branchLogger = INSTANCE;
        if (loggingEnabled && branchLogger.shouldLog(BranchLogLevel.WARN) && message.length() > 0) {
            if (branchLogger.useCustomLogger()) {
                IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
                if (iBranchLoggingCallbacks != null) {
                    iBranchLoggingCallbacks.onBranchLog(message, "WARN");
                    return;
                }
                return;
            }
            Log.w(TAG, message);
        }
    }

    @JvmStatic
    public static final void i(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BranchLogger branchLogger = INSTANCE;
        if (loggingEnabled && branchLogger.shouldLog(BranchLogLevel.INFO) && message.length() > 0) {
            if (branchLogger.useCustomLogger()) {
                IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
                if (iBranchLoggingCallbacks != null) {
                    iBranchLoggingCallbacks.onBranchLog(message, "INFO");
                    return;
                }
                return;
            }
            Log.i(TAG, message);
        }
    }

    @JvmStatic
    public static final void d(String message) {
        BranchLogger branchLogger = INSTANCE;
        if (!loggingEnabled || !branchLogger.shouldLog(BranchLogLevel.DEBUG) || message == null || message.length() <= 0) {
            return;
        }
        if (branchLogger.useCustomLogger()) {
            IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
            if (iBranchLoggingCallbacks != null) {
                iBranchLoggingCallbacks.onBranchLog(message, "DEBUG");
                return;
            }
            return;
        }
        Log.d(TAG, message);
    }

    @JvmStatic
    public static final void v(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BranchLogger branchLogger = INSTANCE;
        if (loggingEnabled && branchLogger.shouldLog(BranchLogLevel.VERBOSE) && message.length() > 0) {
            if (branchLogger.useCustomLogger()) {
                IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
                if (iBranchLoggingCallbacks != null) {
                    iBranchLoggingCallbacks.onBranchLog(message, "VERBOSE");
                    return;
                }
                return;
            }
            Log.v(TAG, message);
        }
    }

    @JvmStatic
    public static final void logAlways(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.length() > 0) {
            if (INSTANCE.useCustomLogger()) {
                IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
                if (iBranchLoggingCallbacks != null) {
                    iBranchLoggingCallbacks.onBranchLog(message, "INFO");
                    return;
                }
                return;
            }
            Log.i(TAG, message);
        }
    }

    private final boolean useCustomLogger() {
        return loggerCallback != null;
    }

    @JvmStatic
    public static final String stackTraceToString(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
