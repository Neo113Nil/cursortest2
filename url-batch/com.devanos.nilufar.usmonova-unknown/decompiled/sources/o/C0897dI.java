package o;

import android.util.Log;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: o.dI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0897dI {
    public static volatile C0897dI a;
    public static final Logger b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (java.lang.Integer.parseInt(r1) >= 9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    static {
        C0897dI c0049Bu;
        if (C0140Fh.z()) {
            for (Map.Entry entry : B3.b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (B3.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(C3.a);
                }
            }
            c0049Bu = C1603o2.d ? new C1603o2() : null;
            if (c0049Bu == null) {
                r2 = G3.e ? new G3() : null;
                AbstractC0048Bt.k(r2);
                c0049Bu = r2;
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                c0049Bu = C0473Sd.d ? new C0473Sd() : null;
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                c0049Bu = C1873s8.d ? new C1873s8() : null;
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                c0049Bu = C1486mG.d ? new C1486mG() : null;
            }
            c0049Bu = C0049Bu.c ? new C0049Bu() : null;
            if (c0049Bu == null) {
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    AbstractC0048Bt.m(property, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
        }
        a = c0049Bu;
        b = Logger.getLogger(EF.class.getName());
        if (r2 == null) {
            c0049Bu = new C0897dI();
            a = c0049Bu;
            b = Logger.getLogger(EF.class.getName());
        }
        c0049Bu = r2;
        a = c0049Bu;
        b = Logger.getLogger(EF.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            Method method = cls.getMethod("put", SSLSocket.class, cls2);
            Method method2 = cls.getMethod("get", SSLSocket.class);
            Method method3 = cls.getMethod("remove", SSLSocket.class);
            AbstractC0048Bt.m(method, "putMethod");
            AbstractC0048Bt.m(method2, "getMethod");
            AbstractC0048Bt.m(method3, "removeMethod");
            AbstractC0048Bt.m(cls3, "clientProviderClass");
            AbstractC0048Bt.m(cls4, "serverProviderClass");
            r2 = new C0023Au(method, method2, method3, cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (r2 == null) {
        }
        c0049Bu = r2;
        a = c0049Bu;
        b = Logger.getLogger(EF.class.getName());
    }

    public static void i(String str, int i, Throwable th) {
        AbstractC0048Bt.n(str, "message");
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(C0897dI c0897dI, String str, int i) {
        int i2 = (i & 2) != 0 ? 4 : 5;
        c0897dI.getClass();
        i(str, i2, null);
    }

    public AbstractC1305jX b(X509TrustManager x509TrustManager) {
        return new C0690a8(c(x509TrustManager));
    }

    public GW c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC0048Bt.m(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C0887d8((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0048Bt.n(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        AbstractC0048Bt.n(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        AbstractC0048Bt.n(str, "hostname");
        return true;
    }

    public void k(Object obj, String str) {
        AbstractC0048Bt.n(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC0048Bt.m(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l = l();
            l.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = l.getSocketFactory();
            AbstractC0048Bt.m(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC0048Bt.k(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC0048Bt.l(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        AbstractC0048Bt.m(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
