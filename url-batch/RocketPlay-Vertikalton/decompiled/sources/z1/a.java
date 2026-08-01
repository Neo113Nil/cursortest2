package z1;

import x1.r;
import x1.s;

/* loaded from: classes.dex */
public final class a {
    public static final s a(s sVar) {
        if ((sVar != null ? sVar.f4605g : null) == null) {
            return sVar;
        }
        r f2 = sVar.f();
        f2.f4595g = null;
        return f2.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
