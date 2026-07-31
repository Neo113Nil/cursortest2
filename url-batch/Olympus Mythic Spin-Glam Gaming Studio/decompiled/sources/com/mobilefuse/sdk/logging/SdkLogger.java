package com.mobilefuse.sdk.logging;

import com.mobilefuse.sdk.DebuggingKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SdkLogger.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007R,\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/logging/SdkLogger;", "", "()V", "value", "", "verboseLogging", "getVerboseLogging$annotations", "getVerboseLogging", "()Z", "setVerboseLogging", "(Z)V", "verboseLoggingFromMfx", "getVerboseLoggingFromMfx$annotations", "getVerboseLoggingFromMfx", "setVerboseLoggingFromMfx", "logVerbose", "", "msg", "", "tag", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes5.dex */
public final class SdkLogger {

    @NotNull
    public static final SdkLogger INSTANCE = new SdkLogger();
    private static boolean verboseLogging;
    private static boolean verboseLoggingFromMfx;

    public static /* synthetic */ void getVerboseLogging$annotations() {
    }

    public static /* synthetic */ void getVerboseLoggingFromMfx$annotations() {
    }

    public static final void logVerbose(@NotNull String str) {
        logVerbose$default(str, null, 2, null);
    }

    private SdkLogger() {
    }

    public static final boolean getVerboseLogging() {
        return verboseLogging;
    }

    public static final void setVerboseLogging(boolean z) {
        verboseLogging = z;
        DebuggingKt.logInfo$default(INSTANCE, "MobileFuse SDK: verboseLogging flag changed to " + z, null, 2, null);
    }

    public static final boolean getVerboseLoggingFromMfx() {
        return verboseLoggingFromMfx;
    }

    public static final void setVerboseLoggingFromMfx(boolean z) {
        verboseLoggingFromMfx = z;
    }

    public static /* synthetic */ void logVerbose$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        logVerbose(str, str2);
    }

    public static final void logVerbose(@NotNull String msg, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (getVerboseLogging() || verboseLoggingFromMfx) {
            DebuggingKt.logInfo(INSTANCE, msg, tag);
        }
    }
}
