package io.github.mytargetsdk;

import android.content.Context;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public final class CertManager {
    private final List rawCertResIds;

    public CertManager() {
        ArrayList arrayList = new ArrayList();
        this.rawCertResIds = arrayList;
        arrayList.add(Integer.valueOf(R$raw.russian_trusted_root_ca));
        arrayList.add(Integer.valueOf(R$raw.russian_trusted_sub_ca));
    }

    public final CertData createCertData(Context context) {
        String str;
        if (context == null) {
            Log.e("CertManager", "Error make certData – context is null");
            return null;
        }
        CertificateFactory createCertificateFactory = createCertificateFactory();
        if (createCertificateFactory == null) {
            Log.e("CertManager", "Error make certData – certificateFactory is null");
            return null;
        }
        KeyStore createKeyStore = createKeyStore();
        if (createKeyStore == null) {
            Log.e("CertManager", "Error make certData – keyStore is null");
            return null;
        }
        CertLoader certLoader = new CertLoader(context, createCertificateFactory);
        Iterator it = this.rawCertResIds.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            Certificate rawCert = certLoader.getRawCert(intValue);
            if (rawCert != null) {
                try {
                    if (intValue == R$raw.russian_trusted_root_ca) {
                        str = "root_ca";
                    } else if (intValue == R$raw.russian_trusted_sub_ca) {
                        str = "sub_ca";
                    } else {
                        str = "resid_" + intValue;
                    }
                    createKeyStore.setCertificateEntry("russian_trusted_" + str, rawCert);
                } catch (KeyStoreException e) {
                    Log.e("CertManager", "", e);
                }
            }
        }
        Iterator it2 = certLoader.getSystemCerts().iterator();
        while (it2.hasNext()) {
            X509Certificate x509Certificate = (X509Certificate) it2.next();
            try {
                createKeyStore.setCertificateEntry(x509Certificate.getIssuerDN().getName(), x509Certificate);
            } catch (KeyStoreException e2) {
                Log.e("CertManager", "", e2);
            }
        }
        TrustManagerFactory createTrustManagerFactory = createTrustManagerFactory(createKeyStore);
        if (createTrustManagerFactory == null) {
            Log.e("CertManager", "Error make certData – trustManagerFactory is null");
            return null;
        }
        X509TrustManager findX509TrustManager = findX509TrustManager(createTrustManagerFactory);
        if (findX509TrustManager == null) {
            Log.e("CertManager", "Error make certData – x509TrustManager is null");
            return null;
        }
        SSLContext createSslContext = createSslContext(createTrustManagerFactory);
        if (createSslContext == null) {
            Log.e("CertManager", "Error make certData – sslContext is null");
            return null;
        }
        return new CertData(findX509TrustManager, createSslContext, createTrustManagerFactory);
    }

    private final CertificateFactory createCertificateFactory() {
        try {
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException e) {
            Log.e("CertManager", "", e);
            return null;
        }
    }

    private final KeyStore createKeyStore() {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            return keyStore;
        } catch (Throwable th) {
            Log.e("CertManager", "", th);
            return null;
        }
    }

    private final TrustManagerFactory createTrustManagerFactory(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            return trustManagerFactory;
        } catch (Throwable th) {
            Log.e("CertManager", "", th);
            return null;
        }
    }

    private final X509TrustManager findX509TrustManager(TrustManagerFactory trustManagerFactory) {
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    private final SSLContext createSslContext(TrustManagerFactory trustManagerFactory) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
            return sSLContext;
        } catch (Throwable th) {
            Log.e("CertManager", "", th);
            return null;
        }
    }
}
