package o;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: o.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1603o2 extends C0897dI {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = C0140Fh.z() && Build.VERSION.SDK_INT >= 29;
    }

    public C1603o2() {
        ArrayList i0 = P6.i0(new ES[]{(!C0140Fh.z() || Build.VERSION.SDK_INT < 29) ? null : new C1669p2(), new C0606Xg(H3.f), new C0606Xg(C0525Ud.a), new C0606Xg(C2005u8.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = i0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ES) next).b()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
    }

    @Override // o.C0897dI
    public final AbstractC1305jX b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        A2 a2 = x509TrustManagerExtensions != null ? new A2(x509TrustManager, x509TrustManagerExtensions) : null;
        return a2 != null ? a2 : new C0690a8(c(x509TrustManager));
    }

    @Override // o.C0897dI
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        AbstractC0048Bt.n(list, "protocols");
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ES) obj).c(sSLSocket)) {
                    break;
                }
            }
        }
        ES es = (ES) obj;
        if (es != null) {
            es.d(sSLSocket, str, list);
        }
    }

    @Override // o.C0897dI
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ES) obj).c(sSLSocket)) {
                break;
            }
        }
        ES es = (ES) obj;
        if (es != null) {
            return es.a(sSLSocket);
        }
        return null;
    }

    @Override // o.C0897dI
    public final boolean h(String str) {
        AbstractC0048Bt.n(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
