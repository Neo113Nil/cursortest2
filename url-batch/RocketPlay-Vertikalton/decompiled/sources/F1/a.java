package F1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends n {
    public static final boolean d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f404c;

    static {
        d = M0.e.l() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList v02 = W0.i.v0(new G1.n[]{(!M0.e.l() || Build.VERSION.SDK_INT < 29) ? null : new G1.a(), new G1.m(G1.f.f526f), new G1.m(G1.k.f535a), new G1.m(G1.h.f531a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = v02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((G1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f404c = arrayList;
    }

    @Override // F1.n
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        G1.b bVar = x509TrustManagerExtensions != null ? new G1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new J1.a(c(x509TrustManager));
    }

    @Override // F1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        i1.f.e(list, "protocols");
        Iterator it = this.f404c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((G1.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        G1.n nVar = (G1.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // F1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f404c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((G1.n) obj).a(sSLSocket)) {
                break;
            }
        }
        G1.n nVar = (G1.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // F1.n
    public final boolean h(String str) {
        i1.f.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
