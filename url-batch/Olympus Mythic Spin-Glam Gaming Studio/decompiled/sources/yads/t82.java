package yads;

import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class t82 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r7 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l83 a(p92 p92Var) {
        String message;
        String str;
        Throwable cause = p92Var.getCause();
        if (cause == null || (message = cause.getMessage()) == null) {
            message = p92Var.getMessage();
        }
        if (cause instanceof UnknownHostException) {
            m83 m83Var = m83.c;
            if (message == null) {
                message = "Failed to resolve server address";
            }
            return new l83(m83Var, "unknown_host", message, null);
        }
        if (!(cause instanceof ConnectException)) {
            m83 m83Var2 = m83.c;
            if (message == null) {
                message = "No connection to server";
            }
            return new l83(m83Var2, "no_connection", message, null);
        }
        String message2 = cause.getMessage();
        if (message2 != null) {
            str = message2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        }
        str = "";
        String str2 = StringsKt.contains$default((CharSequence) str, (CharSequence) "connection refused", false, 2, (Object) null) ? "connection_refused" : StringsKt.contains$default((CharSequence) str, (CharSequence) "network unreachable", false, 2, (Object) null) ? "network_unreachable" : "connect_failed";
        String str3 = Intrinsics.areEqual(str2, "connection_refused") ? "Connection refused" : Intrinsics.areEqual(str2, "network_unreachable") ? "Network unreachable" : "Failed to connect to server";
        m83 m83Var3 = m83.c;
        if (message == null) {
            message = str3;
        }
        return new l83(m83Var3, str2, message, null);
    }

    public static l83 a(IOException iOException) {
        String str;
        String message = iOException.getMessage();
        if (message != null) {
            String lowerCase = message.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "connection reset", false, 2, (Object) null)) {
                    str = "connection_reset";
                } else if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "connection abort", false, 2, (Object) null)) {
                    str = "connection_aborted";
                } else if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "broken pipe", false, 2, (Object) null)) {
                    str = "broken_pipe";
                } else if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "connection closed", false, 2, (Object) null)) {
                    str = "connection_closed";
                } else if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "unexpected end of stream", false, 2, (Object) null)) {
                    str = "unexpected_eof";
                } else if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "socket closed", false, 2, (Object) null)) {
                    str = "socket_closed";
                }
                return new l83(m83.c, str, message, null);
            }
        }
        return null;
    }
}
