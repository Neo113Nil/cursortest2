package com.moloco.sdk.internal.error.crash.filters;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes6.dex */
public final class b implements a {
    public static final int b = 0;

    @NotNull
    public final String a = "MolocoSDKExceptionFilter";

    @Override // com.moloco.sdk.internal.error.crash.filters.a
    public boolean a(@NotNull Throwable crash) {
        Intrinsics.checkNotNullParameter(crash, "crash");
        StackTraceElement[] stackTrace = crash.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.contains$default((CharSequence) className, (CharSequence) BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.a, "SDK detected in stacktrace", null, false, 12, null);
                return true;
            }
        }
        Throwable cause = crash.getCause();
        if (cause == null) {
            return false;
        }
        StackTraceElement[] stackTrace2 = cause.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement2 : stackTrace2) {
            String className2 = stackTraceElement2.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (StringsKt.contains$default((CharSequence) className2, (CharSequence) BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.a, "SDK detected in stacktrace", null, false, 12, null);
                return true;
            }
        }
        return false;
    }
}
