package o;

import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* renamed from: o.Sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473Sd extends C0897dI {
    public static final boolean d;
    public final Provider c;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC0421Qd.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC0421Qd.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        d = z;
    }

    public C0473Sd() {
        Provider newProvider = Conscrypt.newProvider();
        AbstractC0048Bt.m(newProvider, "newProvider()");
        this.c = newProvider;
    }

    @Override // o.C0897dI
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0048Bt.n(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((EnumC1359kL) obj) != EnumC1359kL.i) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC1359kL) it.next()).h);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // o.C0897dI
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // o.C0897dI
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.c);
        AbstractC0048Bt.m(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // o.C0897dI
    public final SSLSocketFactory m(X509TrustManager x509TrustManager) {
        SSLContext l = l();
        l.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = l.getSocketFactory();
        AbstractC0048Bt.m(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // o.C0897dI
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC0048Bt.k(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC0048Bt.l(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C0447Rd.a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        AbstractC0048Bt.m(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
