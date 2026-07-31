package yads;

import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class r33 {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l83 a(SSLException sSLException) {
        String str;
        String str2;
        String message = sSLException.getMessage();
        if (message != null) {
            str = message.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        }
        str = "";
        String str3 = ((sSLException instanceof SSLHandshakeException) || StringsKt.contains$default((CharSequence) str, (CharSequence) "handshake", false, 2, (Object) null)) ? "ssl_handshake" : StringsKt.contains$default((CharSequence) str, (CharSequence) "certificate", false, 2, (Object) null) ? "ssl_certificate" : StringsKt.contains$default((CharSequence) str, (CharSequence) "protocol", false, 2, (Object) null) ? "ssl_protocol" : "ssl_error";
        int hashCode = str3.hashCode();
        if (hashCode == -1027298332) {
            if (str3.equals("ssl_certificate")) {
                str2 = "SSL certificate error";
            }
            str2 = "SSL error";
        } else if (hashCode != 362550660) {
            if (hashCode == 821366635 && str3.equals("ssl_protocol")) {
                str2 = "SSL protocol error";
            }
            str2 = "SSL error";
        } else {
            if (str3.equals("ssl_handshake")) {
                str2 = "SSL handshake error";
            }
            str2 = "SSL error";
        }
        m83 m83Var = m83.g;
        if (message == null) {
            message = str2;
        }
        return new l83(m83Var, str3, message, null);
    }
}
