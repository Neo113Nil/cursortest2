package expo.modules.devlauncher.logs;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherRemoteLogManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toRemoteLogString", "", "", "expo-dev-launcher_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherRemoteLogManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toRemoteLogString$lambda$0(StackTraceElement stackTraceElement) {
        String stackTraceElement2 = stackTraceElement.toString();
        Intrinsics.checkNotNullExpressionValue(stackTraceElement2, "toString(...)");
        return stackTraceElement2;
    }

    public static final String toRemoteLogString(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        String str = th + "\n  " + ArraysKt.joinToString$default(stackTrace, "\n  ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: expo.modules.devlauncher.logs.DevLauncherRemoteLogManagerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence remoteLogString$lambda$0;
                remoteLogString$lambda$0 = DevLauncherRemoteLogManagerKt.toRemoteLogString$lambda$0((StackTraceElement) obj);
                return remoteLogString$lambda$0;
            }
        }, 30, (Object) null);
        Throwable cause = th.getCause();
        if (cause == null) {
            return str;
        }
        return str + "\nCaused by " + toRemoteLogString(cause);
    }
}
