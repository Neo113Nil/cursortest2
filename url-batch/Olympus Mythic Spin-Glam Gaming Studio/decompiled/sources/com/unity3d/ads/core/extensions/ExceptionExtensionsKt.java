package com.unity3d.ads.core.extensions;

import com.unity3d.services.SDKErrorHandler;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExceptionExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"retrieveUnityCrashValue", "", "", "getShortenedStackTrace", "maxLines", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExceptionExtensionsKt {
    @NotNull
    public static final String retrieveUnityCrashValue(@NotNull Throwable th) {
        StackTraceElement stackTraceElement;
        String className;
        Intrinsics.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            stackTraceElement = null;
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i];
            if ((stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null) ? false : StringsKt.contains$default((CharSequence) className, (CharSequence) SDKErrorHandler.UNITY_PACKAGE, false, 2, (Object) null)) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i++;
        }
        if (stackTraceElement == null) {
            return "unknown";
        }
        String fileName = stackTraceElement.getFileName();
        if (fileName == null) {
            fileName = "unknown";
        }
        String str = fileName + '_' + stackTraceElement.getLineNumber();
        return str != null ? str : "unknown";
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        return getShortenedStackTrace(th, i);
    }

    @NotNull
    public static final String getShortenedStackTrace(@NotNull Throwable th, int i) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    String stringWriter2 = stringWriter.toString();
                    Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
                    String joinToString$default = SequencesKt.joinToString$default(SequencesKt.take(StringsKt.lineSequence(StringsKt.trim(stringWriter2).toString()), i), "\n", null, null, 0, null, null, 62, null);
                    CloseableKt.closeFinally(printWriter, null);
                    CloseableKt.closeFinally(stringWriter, null);
                    return joinToString$default;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return "";
        }
    }
}
