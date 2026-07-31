package com.mobilefuse.sdk.telemetry.loggers;

import androidx.annotation.VisibleForTesting;
import com.applovin.sdk.AppLovinEventTypes;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.logging.DeviceLogListener;
import com.mobilefuse.sdk.logging.LogLevel;
import com.mobilefuse.sdk.telemetry.devicelogs.DeviceLogEntry;
import com.mobilefuse.sdk.telemetry.devicelogs.DeviceLogIndex;
import com.mobilefuse.sdk.telemetry.devicelogs.DeviceLogsMfxImpl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceLogsHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J+\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020.2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010GJ,\u0010H\u001a\u00020C2\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020L2\b\b\u0002\u0010N\u001a\u00020.H\u0002J\b\u0010O\u001a\u00020CH\u0002J\b\u0010P\u001a\u00020CH\u0002J\b\u0010Q\u001a\u00020CH\u0002J\r\u0010R\u001a\u00020CH\u0000¢\u0006\u0002\bSJ%\u0010T\u001a\u00020C2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010UJ\u0006\u0010V\u001a\u00020LJ\"\u0010W\u001a\u00020C2\u0006\u0010I\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\b\u0010X\u001a\u00020CH\u0002J\b\u0010Y\u001a\u00020CH\u0002J.\u0010Z\u001a\u00020C2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020L0\\2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020L0\\J\b\u0010^\u001a\u00020CH\u0002J\b\u0010_\u001a\u00020CH\u0002J\b\u0010`\u001a\u00020CH\u0002J\b\u0010a\u001a\u00020CH\u0002J\u0006\u0010b\u001a\u00020CR\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0014\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R$\u00100\u001a\u00020.8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b1\u0010\u0014\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R&\u00108\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b9\u0010\u0014\u001a\u0004\b:\u0010\"\"\u0004\b;\u0010$R&\u0010<\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b=\u0010\u0014\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R\u0012\u0010@\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010AR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/loggers/DeviceLogsHandler;", "Lcom/mobilefuse/sdk/logging/DeviceLogListener;", CommonUrlParts.UUID, "Ljava/util/UUID;", "timeProvider", "Lkotlin/Function0;", "", "(Ljava/util/UUID;Lkotlin/jvm/functions/Function0;)V", "EMERGENCY_QUOTA_VALUE", "", "MAX_CAPACITY", "TIME_SESSION", "TIME_TO_CHECK_LOGS", "getTIME_TO_CHECK_LOGS", "()I", "TIME_TO_DELETE_LOGS", "TIME_TO_LOCK_SESSION", "TIME_TO_SEND_LOGS", "consoleLogCountLimit", "getConsoleLogCountLimit$mobilefuse_sdk_telemetry_release$annotations", "()V", "getConsoleLogCountLimit$mobilefuse_sdk_telemetry_release", "setConsoleLogCountLimit$mobilefuse_sdk_telemetry_release", "(I)V", "consoleLogTimeLimit", "getConsoleLogTimeLimit$mobilefuse_sdk_telemetry_release$annotations", "getConsoleLogTimeLimit$mobilefuse_sdk_telemetry_release", "()J", "setConsoleLogTimeLimit$mobilefuse_sdk_telemetry_release", "(J)V", "deleteScheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "getDeleteScheduler$mobilefuse_sdk_telemetry_release$annotations", "getDeleteScheduler$mobilefuse_sdk_telemetry_release", "()Ljava/util/concurrent/ScheduledExecutorService;", "setDeleteScheduler$mobilefuse_sdk_telemetry_release", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "deviceLogs", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/mobilefuse/sdk/telemetry/devicelogs/DeviceLogEntry;", "getDeviceLogs$mobilefuse_sdk_telemetry_release$annotations", "getDeviceLogs$mobilefuse_sdk_telemetry_release", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "deviceLogsMfxImpl", "Lcom/mobilefuse/sdk/telemetry/devicelogs/DeviceLogsMfxImpl;", "hasPendingFlush", "", "isAppInBackground", "isRemoteLoggingEnabled", "isRemoteLoggingEnabled$mobilefuse_sdk_telemetry_release$annotations", "isRemoteLoggingEnabled$mobilefuse_sdk_telemetry_release", "()Z", "setRemoteLoggingEnabled$mobilefuse_sdk_telemetry_release", "(Z)V", "lastStateChangeTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "scheduler", "getScheduler$mobilefuse_sdk_telemetry_release$annotations", "getScheduler$mobilefuse_sdk_telemetry_release", "setScheduler$mobilefuse_sdk_telemetry_release", "sessionScheduler", "getSessionScheduler$mobilefuse_sdk_telemetry_release$annotations", "getSessionScheduler$mobilefuse_sdk_telemetry_release", "setSessionScheduler$mobilefuse_sdk_telemetry_release", "sessionStartTime", "Ljava/lang/Long;", "activateRemoteLogging", "", "sendConsoleLogs", "timeLimit", "countLimit", "(ZLjava/lang/Integer;Ljava/lang/Integer;)V", "addDeviceLog", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Lcom/mobilefuse/sdk/logging/LogLevel;", "tag", "", "message", "skipCount", "checkCountLimit", "checkTimeLimitExpiry", "deactivateAndFlush", "deactivateLogging", "deactivateLogging$mobilefuse_sdk_telemetry_release", "enableRemoteLogging", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSessionId", "onLogCaptured", "removeLogs", "removeLogsAfterSend", "reportSessionStarted", "modules", "", "variables", "sendDeviceLogs", "sessionEnd", "startExecutors", "startLogsSending", "transmitDeviceLogs", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final class DeviceLogsHandler implements DeviceLogListener {
    private final int EMERGENCY_QUOTA_VALUE;
    private final int MAX_CAPACITY;
    private final long TIME_SESSION;
    private final int TIME_TO_CHECK_LOGS;
    private long TIME_TO_DELETE_LOGS;
    private final long TIME_TO_LOCK_SESSION;
    private final long TIME_TO_SEND_LOGS;
    private int consoleLogCountLimit;
    private long consoleLogTimeLimit;

    @Nullable
    private ScheduledExecutorService deleteScheduler;

    @NotNull
    private final ConcurrentLinkedQueue<DeviceLogEntry> deviceLogs;
    private DeviceLogsMfxImpl deviceLogsMfxImpl;
    private boolean hasPendingFlush;
    private boolean isAppInBackground;
    private boolean isRemoteLoggingEnabled;
    private AtomicLong lastStateChangeTimestamp;

    @Nullable
    private ScheduledExecutorService scheduler;

    @Nullable
    private ScheduledExecutorService sessionScheduler;
    private Long sessionStartTime;
    private final Function0 timeProvider;

    @VisibleForTesting
    public static /* synthetic */ void getConsoleLogCountLimit$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getConsoleLogTimeLimit$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDeleteScheduler$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDeviceLogs$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getScheduler$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSessionScheduler$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isRemoteLoggingEnabled$mobilefuse_sdk_telemetry_release$annotations() {
    }

    public DeviceLogsHandler(@NotNull UUID uuid, @NotNull Function0 timeProvider) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.timeProvider = timeProvider;
        this.deviceLogs = new ConcurrentLinkedQueue<>();
        this.deviceLogsMfxImpl = new DeviceLogsMfxImpl(uuid, new DeviceLogsHandler$deviceLogsMfxImpl$1(this));
        this.TIME_TO_SEND_LOGS = 30000L;
        this.TIME_TO_LOCK_SESSION = 30000L;
        this.TIME_TO_DELETE_LOGS = 1800000L;
        this.MAX_CAPACITY = 1000;
        this.TIME_SESSION = 1000L;
        this.TIME_TO_CHECK_LOGS = 30;
        this.consoleLogTimeLimit = 3600000L;
        this.consoleLogCountLimit = 10000;
        this.EMERGENCY_QUOTA_VALUE = 500;
        this.lastStateChangeTimestamp = new AtomicLong(0L);
    }

    public /* synthetic */ DeviceLogsHandler(UUID uuid, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? new Function0() { // from class: com.mobilefuse.sdk.telemetry.loggers.DeviceLogsHandler.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                return Long.valueOf(invoke());
            }

            public final long invoke() {
                return System.currentTimeMillis();
            }
        } : function0);
    }

    @NotNull
    public final ConcurrentLinkedQueue<DeviceLogEntry> getDeviceLogs$mobilefuse_sdk_telemetry_release() {
        return this.deviceLogs;
    }

    public final int getTIME_TO_CHECK_LOGS() {
        return this.TIME_TO_CHECK_LOGS;
    }

    /* renamed from: getConsoleLogTimeLimit$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final long getConsoleLogTimeLimit() {
        return this.consoleLogTimeLimit;
    }

    public final void setConsoleLogTimeLimit$mobilefuse_sdk_telemetry_release(long j) {
        this.consoleLogTimeLimit = j;
    }

    /* renamed from: getConsoleLogCountLimit$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final int getConsoleLogCountLimit() {
        return this.consoleLogCountLimit;
    }

    public final void setConsoleLogCountLimit$mobilefuse_sdk_telemetry_release(int i) {
        this.consoleLogCountLimit = i;
    }

    /* renamed from: isRemoteLoggingEnabled$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final boolean getIsRemoteLoggingEnabled() {
        return this.isRemoteLoggingEnabled;
    }

    public final void setRemoteLoggingEnabled$mobilefuse_sdk_telemetry_release(boolean z) {
        this.isRemoteLoggingEnabled = z;
    }

    @Nullable
    /* renamed from: getScheduler$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final ScheduledExecutorService getScheduler() {
        return this.scheduler;
    }

    public final void setScheduler$mobilefuse_sdk_telemetry_release(@Nullable ScheduledExecutorService scheduledExecutorService) {
        this.scheduler = scheduledExecutorService;
    }

    @Nullable
    /* renamed from: getDeleteScheduler$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final ScheduledExecutorService getDeleteScheduler() {
        return this.deleteScheduler;
    }

    public final void setDeleteScheduler$mobilefuse_sdk_telemetry_release(@Nullable ScheduledExecutorService scheduledExecutorService) {
        this.deleteScheduler = scheduledExecutorService;
    }

    @Nullable
    /* renamed from: getSessionScheduler$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final ScheduledExecutorService getSessionScheduler() {
        return this.sessionScheduler;
    }

    public final void setSessionScheduler$mobilefuse_sdk_telemetry_release(@Nullable ScheduledExecutorService scheduledExecutorService) {
        this.sessionScheduler = scheduledExecutorService;
    }

    private final void startLogsSending() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            this.sessionStartTime = (Long) this.timeProvider.mo4828invoke();
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.scheduler = newSingleThreadScheduledExecutor;
            if (newSingleThreadScheduledExecutor != null) {
                Runnable runnable = new Runnable() { // from class: com.mobilefuse.sdk.telemetry.loggers.DeviceLogsHandler$startLogsSending$$inlined$handleExceptions$lambda$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeviceLogsHandler.this.transmitDeviceLogs();
                    }
                };
                long j = this.TIME_TO_SEND_LOGS;
                newSingleThreadScheduledExecutor.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
            }
            startExecutors();
        } catch (Throwable th) {
            int i = DeviceLogsHandler$startLogsSending$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void startExecutors() {
        SchedulersKt.safelyRunOnBgThread$default(null, new DeviceLogsHandler$startExecutors$1(this), 1, null);
    }

    static /* synthetic */ void addDeviceLog$default(DeviceLogsHandler deviceLogsHandler, LogLevel logLevel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        deviceLogsHandler.addDeviceLog(logLevel, str, str2, z);
    }

    private final void addDeviceLog(LogLevel level, String tag, String message, boolean skipCount) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            if (this.deviceLogs.size() >= this.MAX_CAPACITY) {
                this.deviceLogs.poll();
            }
            this.deviceLogs.add(new DeviceLogEntry(level, tag, message, ((Number) this.timeProvider.mo4828invoke()).longValue(), false, DeviceLogIndex.INSTANCE.increment(), 16, null));
            if (!skipCount && this.isRemoteLoggingEnabled) {
                checkCountLimit();
            }
        } catch (Throwable th) {
            int i = DeviceLogsHandler$addDeviceLog$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void reportSessionStarted(@NotNull Map<String, String> modules, @NotNull Map<String, String> variables) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(variables, "variables");
        this.deviceLogsMfxImpl.createInitialLog(modules, variables);
    }

    public static /* synthetic */ void activateRemoteLogging$default(DeviceLogsHandler deviceLogsHandler, boolean z, Integer num, Integer num2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        deviceLogsHandler.activateRemoteLogging(z, num, num2);
    }

    public final void activateRemoteLogging(boolean sendConsoleLogs, @Nullable Integer timeLimit, @Nullable Integer countLimit) {
        long longValue = ((Number) this.timeProvider.mo4828invoke()).longValue();
        long j = this.lastStateChangeTimestamp.get();
        boolean z = this.isRemoteLoggingEnabled;
        if (!z || longValue - j >= this.TIME_TO_LOCK_SESSION) {
            if (sendConsoleLogs && !z) {
                enableRemoteLogging(timeLimit, countLimit);
                this.lastStateChangeTimestamp.set(longValue);
            } else if (!sendConsoleLogs && z) {
                deactivateAndFlush();
                this.lastStateChangeTimestamp.set(longValue);
            } else {
                if (sendConsoleLogs || z) {
                    return;
                }
                deactivateLogging$mobilefuse_sdk_telemetry_release();
            }
        }
    }

    static /* synthetic */ void enableRemoteLogging$default(DeviceLogsHandler deviceLogsHandler, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        deviceLogsHandler.enableRemoteLogging(num, num2);
    }

    private final void enableRemoteLogging(Integer timeLimit, Integer countLimit) {
        if (timeLimit != null) {
            this.consoleLogTimeLimit = timeLimit.intValue() * 1000;
        }
        if (countLimit != null) {
            this.consoleLogCountLimit = countLimit.intValue();
        }
        this.isRemoteLoggingEnabled = true;
        startLogsSending();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkTimeLimitExpiry() {
        Long l;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            if (!this.isRemoteLoggingEnabled || (l = this.sessionStartTime) == null) {
                return;
            }
            if (((Number) this.timeProvider.mo4828invoke()).longValue() - l.longValue() > this.consoleLogTimeLimit) {
                deactivateAndFlush();
            }
        } catch (Throwable th) {
            int i = DeviceLogsHandler$checkTimeLimitExpiry$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void checkCountLimit() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            if (!this.isRemoteLoggingEnabled || this.deviceLogs.size() <= this.consoleLogCountLimit) {
                return;
            }
            deactivateAndFlush();
        } catch (Throwable th) {
            int i = DeviceLogsHandler$checkCountLimit$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void deactivateAndFlush() {
        this.isRemoteLoggingEnabled = false;
        sendDeviceLogs();
        sessionEnd();
    }

    public final void transmitDeviceLogs() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            if (this.isRemoteLoggingEnabled) {
                if (this.isAppInBackground) {
                    this.hasPendingFlush = true;
                    return;
                }
                try {
                    sendDeviceLogs();
                } catch (Throwable th) {
                    int i = DeviceLogsHandler$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        } catch (Throwable th2) {
            int i2 = DeviceLogsHandler$transmitDeviceLogs$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i2 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeLogs() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            this.deviceLogs.clear();
        } catch (Throwable th) {
            int i = DeviceLogsHandler$removeLogs$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeLogsAfterSend() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            CollectionsKt.removeAll(this.deviceLogs, new Function1() { // from class: com.mobilefuse.sdk.telemetry.loggers.DeviceLogsHandler$removeLogsAfterSend$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return Boolean.valueOf(invoke((DeviceLogEntry) obj));
                }

                public final boolean invoke(DeviceLogEntry deviceLogEntry) {
                    return deviceLogEntry.getWasReported();
                }
            });
        } catch (Throwable th) {
            int i = DeviceLogsHandler$removeLogsAfterSend$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final String getSessionId() {
        if (this.isRemoteLoggingEnabled) {
            String uuid = this.deviceLogsMfxImpl.getUuid().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "deviceLogsMfxImpl.getSessionId().toString()");
            return uuid;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void sendDeviceLogs() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            if (this.deviceLogs.isEmpty()) {
                return;
            }
            String uuid = this.deviceLogsMfxImpl.getUuid().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "deviceLogsMfxImpl.getSessionId().toString()");
            if (!StringsKt.isBlank(uuid) && this.sessionStartTime != null) {
                ConcurrentLinkedQueue<DeviceLogEntry> concurrentLinkedQueue = this.deviceLogs;
                List arrayList = new ArrayList();
                for (Object obj : concurrentLinkedQueue) {
                    if (!((DeviceLogEntry) obj).getWasReported()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() > this.EMERGENCY_QUOTA_VALUE) {
                    long longValue = ((Number) this.timeProvider.mo4828invoke()).longValue() - this.TIME_TO_SEND_LOGS;
                    int i = 0;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((DeviceLogEntry) it.next()).getTimestamp() >= longValue && (i = i + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    if (i > this.EMERGENCY_QUOTA_VALUE) {
                        addDeviceLog(LogLevel.ERROR, "DeviceLogsHandler", "Remote Device Logging quota exceeded (" + this.EMERGENCY_QUOTA_VALUE + " logs per " + this.TIME_TO_CHECK_LOGS + " seconds). Ending session.", true);
                        deactivateLogging$mobilefuse_sdk_telemetry_release();
                        arrayList = CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.mobilefuse.sdk.telemetry.loggers.DeviceLogsHandler$$special$$inlined$sortedByDescending$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt.compareValues(Long.valueOf(((DeviceLogEntry) t2).getTimestamp()), Long.valueOf(((DeviceLogEntry) t).getTimestamp()));
                            }
                        }), this.EMERGENCY_QUOTA_VALUE);
                    }
                }
                this.deviceLogsMfxImpl.reportLogs(arrayList);
            }
        } catch (Throwable th) {
            int i2 = DeviceLogsHandler$sendDeviceLogs$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i2 == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // com.mobilefuse.sdk.logging.DeviceLogListener
    public void onLogCaptured(@NotNull LogLevel level, @NotNull String message, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        addDeviceLog$default(this, level, tag, message, false, 8, null);
    }

    public final void deactivateLogging$mobilefuse_sdk_telemetry_release() {
        this.isRemoteLoggingEnabled = false;
        sessionEnd();
    }

    private final void sessionEnd() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            this.sessionStartTime = null;
            ScheduledExecutorService scheduledExecutorService = this.scheduler;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            ScheduledExecutorService scheduledExecutorService2 = this.sessionScheduler;
            if (scheduledExecutorService2 != null) {
                scheduledExecutorService2.shutdown();
            }
            ScheduledExecutorService scheduledExecutorService3 = this.deleteScheduler;
            if (scheduledExecutorService3 != null) {
                scheduledExecutorService3.shutdown();
            }
            this.scheduler = null;
            this.sessionScheduler = null;
            this.deleteScheduler = null;
        } catch (Throwable th) {
            int i = DeviceLogsHandler$sessionEnd$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
