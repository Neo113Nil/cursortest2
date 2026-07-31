package yads;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public abstract class q93 {
    public static final Lazy a = LazyKt.lazy(p93.b);

    public static final X509TrustManager a(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) CollectionsKt.firstOrNull((List) arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static final boolean a() {
        return true;
    }
}
