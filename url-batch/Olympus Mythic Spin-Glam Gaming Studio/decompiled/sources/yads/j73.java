package yads;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class j73 {
    public static l83 a(i73 i73Var) {
        String message;
        l83 l83Var;
        String message2;
        Throwable cause = i73Var.getCause();
        if (cause == null || (message = cause.getMessage()) == null) {
            message = i73Var.getMessage();
        }
        if (cause instanceof SocketTimeoutException) {
            m83 m83Var = m83.d;
            if (message == null) {
                message = "Read timeout";
            }
            l83Var = new l83(m83Var, "socket_timeout", message, null);
        } else if ((cause instanceof ConnectException) && (message2 = cause.getMessage()) != null && StringsKt.contains((CharSequence) message2, (CharSequence) "timeout", true)) {
            m83 m83Var2 = m83.d;
            if (message == null) {
                message = "Connection timeout";
            }
            l83Var = new l83(m83Var2, "connect_timeout", message, null);
        } else {
            m83 m83Var3 = m83.d;
            if (message == null) {
                message = "Request timeout";
            }
            l83Var = new l83(m83Var3, "timeout", message, null);
        }
        return l83Var;
    }
}
