package o;

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
public final class G3 extends C0897dI {
    public static final boolean e;
    public final ArrayList c;
    public final C0264Kb d;

    static {
        boolean z = false;
        if (C0140Fh.z() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public G3() {
        C0973eT c0973eT;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c0973eT = new C0973eT(cls);
        } catch (Exception e2) {
            C0897dI.a.getClass();
            C0897dI.i("unable to load android socket classes", 5, e2);
            c0973eT = null;
        }
        ArrayList i0 = P6.i0(new ES[]{c0973eT, new C0606Xg(H3.f), new C0606Xg(C0525Ud.a), new C0606Xg(C2005u8.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = i0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ES) next).b()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
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
        this.d = new C0264Kb(method3, method2, method);
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
    public final GW c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new F3(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        AbstractC0048Bt.n(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
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
    public final Object g() {
        C0264Kb c0264Kb = this.d;
        c0264Kb.getClass();
        Method method = c0264Kb.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = c0264Kb.b;
                AbstractC0048Bt.k(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // o.C0897dI
    public final boolean h(String str) {
        AbstractC0048Bt.n(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // o.C0897dI
    public final void k(Object obj, String str) {
        AbstractC0048Bt.n(str, "message");
        C0264Kb c0264Kb = this.d;
        c0264Kb.getClass();
        if (obj != null) {
            try {
                Method method = c0264Kb.c;
                AbstractC0048Bt.k(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        C0897dI.j(this, str, 4);
    }
}
