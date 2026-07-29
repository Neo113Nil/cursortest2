package o;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;

/* renamed from: o.mG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1486mG extends C0897dI {
    public static final boolean d;
    public final Provider c = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, EB.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        d = z;
    }

    @Override // o.C0897dI
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0048Bt.n(list, "protocols");
    }

    @Override // o.C0897dI
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // o.C0897dI
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.c);
        AbstractC0048Bt.m(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // o.C0897dI
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.c);
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
}
