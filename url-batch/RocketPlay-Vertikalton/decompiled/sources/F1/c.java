package F1;

import G1.o;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f407e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f408c;
    public final G1.i d;

    static {
        boolean z2 = false;
        if (M0.e.l() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f407e = z2;
    }

    public c() {
        o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e2) {
            n.f424a.getClass();
            n.i("unable to load android socket classes", 5, e2);
            oVar = null;
        }
        ArrayList v02 = W0.i.v0(new G1.n[]{oVar, new G1.m(G1.f.f526f), new G1.m(G1.k.f535a), new G1.m(G1.h.f531a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = v02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((G1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f408c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new G1.i(method3, method2, method);
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
    public final J1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // F1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        i1.f.e(list, "protocols");
        Iterator it = this.f408c.iterator();
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        i1.f.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // F1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f408c.iterator();
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
    public final Object g() {
        G1.i iVar = this.d;
        iVar.getClass();
        Method method = iVar.f532a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = iVar.f533b;
            i1.f.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // F1.n
    public final boolean h(String str) {
        i1.f.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // F1.n
    public final void j(Object obj, String str) {
        i1.f.e(str, "message");
        G1.i iVar = this.d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f534c;
                i1.f.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
