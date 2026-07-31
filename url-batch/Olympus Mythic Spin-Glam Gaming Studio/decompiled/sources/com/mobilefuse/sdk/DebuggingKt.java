package com.mobilefuse.sdk;

import com.applovin.sdk.AppLovinEventTypes;
import com.mobilefuse.sdk.logging.DeviceLogBridge;
import com.mobilefuse.sdk.logging.LogLevel;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Debugging.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001aT\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a \u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u001a,\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a \u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u001a \u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0011"}, d2 = {CreativeInfo.f, "", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Lcom/mobilefuse/sdk/logging/LogLevel;", "msg", "", "tag", "throwable", "", "logFunction", "Lkotlin/Function3;", "", "logDebug", "logError", "logInfo", "logWarn", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class DebuggingKt {
    public static final void logDebug(@NotNull Object obj, @NotNull String str) {
        logDebug$default(obj, str, null, 2, null);
    }

    public static final void logError(@NotNull Object obj, @NotNull String str) {
        logError$default(obj, str, null, null, 6, null);
    }

    public static final void logError(@NotNull Object obj, @NotNull String str, @Nullable String str2) {
        logError$default(obj, str, str2, null, 4, null);
    }

    public static final void logInfo(@NotNull Object obj, @NotNull String str) {
        logInfo$default(obj, str, null, 2, null);
    }

    public static final void logWarn(@NotNull Object obj, @NotNull String str) {
        logWarn$default(obj, str, null, 2, null);
    }

    static /* synthetic */ void log$default(Object obj, LogLevel logLevel, String str, String str2, Throwable th, Function3 function3, int i, Object obj2) {
        if ((i & 8) != 0) {
            th = null;
        }
        log(obj, logLevel, str, str2, th, function3);
    }

    private static final void log(Object obj, LogLevel logLevel, String str, String str2, Throwable th, Function3 function3) {
        if (str2 == null) {
            str2 = Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
        }
        if (str2 == null) {
            str2 = "MFSDK";
        }
        function3.invoke(str2, str, th);
        DeviceLogBridge.INSTANCE.captureLog(logLevel, str, str2);
    }

    public static /* synthetic */ void logDebug$default(Object obj, String str, String str2, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        logDebug(obj, str, str2);
    }

    public static final void logDebug(@NotNull Object logDebug, @NotNull String msg, @Nullable String str) {
        Intrinsics.checkNotNullParameter(logDebug, "$this$logDebug");
        Intrinsics.checkNotNullParameter(msg, "msg");
        log$default(logDebug, LogLevel.DEBUG, msg, str, null, DebuggingKt$logDebug$1.INSTANCE, 8, null);
    }

    public static /* synthetic */ void logInfo$default(Object obj, String str, String str2, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        logInfo(obj, str, str2);
    }

    public static final void logInfo(@NotNull Object logInfo, @NotNull String msg, @Nullable String str) {
        Intrinsics.checkNotNullParameter(logInfo, "$this$logInfo");
        Intrinsics.checkNotNullParameter(msg, "msg");
        log$default(logInfo, LogLevel.INFO, msg, str, null, DebuggingKt$logInfo$1.INSTANCE, 8, null);
    }

    public static /* synthetic */ void logWarn$default(Object obj, String str, String str2, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        logWarn(obj, str, str2);
    }

    public static final void logWarn(@NotNull Object logWarn, @NotNull String msg, @Nullable String str) {
        Intrinsics.checkNotNullParameter(logWarn, "$this$logWarn");
        Intrinsics.checkNotNullParameter(msg, "msg");
        log$default(logWarn, LogLevel.WARN, msg, str, null, DebuggingKt$logWarn$1.INSTANCE, 8, null);
    }

    public static /* synthetic */ void logError$default(Object obj, String str, String str2, Throwable th, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        logError(obj, str, str2, th);
    }

    public static final void logError(@NotNull Object logError, @NotNull String msg, @Nullable String str, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(logError, "$this$logError");
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(logError, LogLevel.ERROR, msg, str, th, DebuggingKt$logError$1.INSTANCE);
    }
}
