package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class o2 extends jw {
    public static final boolean e;
    public final ArrayList c;
    public final ra d;

    static {
        boolean z = false;
        if (iw.g() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public o2() {
        c30 c30Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c30Var = new c30(cls);
        } catch (Exception e2) {
            jw.a.getClass();
            jw.i("unable to load android socket classes", 5, e2);
            c30Var = null;
        }
        int i = 0;
        ArrayList r0 = o6.r0(new k20[]{c30Var, new ue(p2.f), new ue(cc.a), new ue(j8.a)});
        ArrayList arrayList = new ArrayList();
        int size = r0.size();
        while (i < size) {
            Object obj = r0.get(i);
            i++;
            if (((k20) obj).c()) {
                arrayList.add(obj);
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
        this.d = new ra(method3, method2, method);
    }

    @Override // defpackage.jw
    public final oo b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        k2 k2Var = x509TrustManagerExtensions != null ? new k2(x509TrustManager, x509TrustManagerExtensions) : null;
        return k2Var != null ? k2Var : new p7(c(x509TrustManager));
    }

    @Override // defpackage.jw
    public final j60 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new n2(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.jw
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((k20) obj).b(sSLSocket)) {
                break;
            }
        }
        k20 k20Var = (k20) obj;
        if (k20Var != null) {
            k20Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.jw
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.jw
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((k20) obj).b(sSLSocket)) {
                break;
            }
        }
        k20 k20Var = (k20) obj;
        if (k20Var != null) {
            return k20Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.jw
    public final Object g() {
        ra raVar = this.d;
        raVar.getClass();
        Method method = raVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = raVar.b;
                method2.getClass();
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.jw
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.jw
    public final void j(Object obj, String str) {
        ra raVar = this.d;
        raVar.getClass();
        if (obj != null) {
            try {
                Method method = raVar.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        jw.i(str, 5, null);
    }
}
