package q1;

import K.C0011l;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import i1.r;
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
    public static final boolean f3562e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3563c;
    public final C0011l d;

    static {
        boolean z2 = false;
        if (J0.e.n() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f3562e = z2;
    }

    public c() {
        r1.n nVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            nVar = new r1.n(cls);
        } catch (Exception e2) {
            n.f3579a.getClass();
            n.i("unable to load android socket classes", 5, e2);
            nVar = null;
        }
        ArrayList f02 = Q0.g.f0(new r1.m[]{nVar, new r1.l(r1.f.f3588f), new r1.l(r1.j.f3594a), new r1.l(r1.h.f3593a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((r1.m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3563c = arrayList;
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
        this.d = new C0011l(method3, method2, method);
    }

    @Override // q1.n
    public final r b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        r1.b bVar = x509TrustManagerExtensions != null ? new r1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new u1.a(c(x509TrustManager));
    }

    @Override // q1.n
    public final u1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // q1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        X0.d.e(list, "protocols");
        Iterator it = this.f3563c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r1.m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        r1.m mVar = (r1.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // q1.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        X0.d.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // q1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3563c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r1.m) obj).a(sSLSocket)) {
                break;
            }
        }
        r1.m mVar = (r1.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // q1.n
    public final Object g() {
        C0011l c0011l = this.d;
        c0011l.getClass();
        Method method = (Method) c0011l.f413b;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = (Method) c0011l.f414c;
            X0.d.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // q1.n
    public final boolean h(String str) {
        X0.d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // q1.n
    public final void j(Object obj, String str) {
        X0.d.e(str, "message");
        C0011l c0011l = this.d;
        c0011l.getClass();
        if (obj != null) {
            try {
                Method method = (Method) c0011l.d;
                X0.d.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
