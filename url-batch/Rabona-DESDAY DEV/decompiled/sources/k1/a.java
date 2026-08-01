package k1;

import i1.t;
import i1.u;

/* loaded from: classes.dex */
public final class a {
    public static final u a(u uVar) {
        if ((uVar != null ? uVar.f2530g : null) == null) {
            return uVar;
        }
        t f2 = uVar.f();
        f2.f2520g = null;
        return f2.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
