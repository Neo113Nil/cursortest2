package yads;

import android.util.Log;
import com.yandex.mobile.ads.R$raw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;

/* loaded from: classes4.dex */
public final class bx2 {
    public final z20 a;
    public KeyStore c;
    public X509TrustManager d;
    public final Lazy b = LazyKt.lazy(ax2.b);
    public final Object e = new Object();

    public bx2(z20 z20Var) {
        this.a = z20Var;
    }

    public final void a(X509Certificate[] x509CertificateArr, String str) {
        Unit unit;
        try {
            ((X509TrustManager) this.b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            synchronized (this.e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.d;
                    if (x509TrustManager != null) {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b() {
        if (!Thread.holdsLock(this.e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    public final void a() {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        b();
        b();
        if (this.c == null) {
            Lazy lazy = q93.a;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("SdkTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                zt2 zt2Var = (zt2) this.a;
                zt2Var.getClass();
                try {
                    InputStream openRawResource = zt2Var.b.getResources().openRawResource(R$raw.monetization_ads_sdkinternalca);
                    try {
                        byte[] readBytes = ByteStreamsKt.readBytes(openRawResource);
                        CloseableKt.closeFinally(openRawResource, null);
                        try {
                            openRawResource = zt2Var.a.getResources().openRawResource(R$raw.monetization_ads_bundled_cert);
                            try {
                                byte[] readBytes2 = ByteStreamsKt.readBytes(openRawResource);
                                CloseableKt.closeFinally(openRawResource, null);
                                byte[][] bArr = (byte[][]) ArraysKt.plus((Object[]) new byte[][]{readBytes2}, (Object[]) new byte[][]{readBytes});
                                ArrayList arrayList = new ArrayList();
                                for (byte[] bArr2 : bArr) {
                                    Lazy lazy2 = q93.a;
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        CertificateFactory certificateFactory = (CertificateFactory) q93.a.getValue();
                                        x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                                    } catch (CertificateException unused3) {
                                        x509Certificate = null;
                                    }
                                    if (x509Certificate != null) {
                                        arrayList.add(x509Certificate);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a(keyStore, (X509Certificate) it.next());
                                }
                                keyStore2 = keyStore;
                            } finally {
                            }
                        } catch (IOException e) {
                            throw new IllegalStateException("Failed to create cert", e);
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Failed to create cert", e2);
                }
            }
            this.c = keyStore2;
        }
        b();
        if (this.d == null) {
            b();
            if (this.c != null) {
                b();
                this.d = q93.a(this.c);
            }
        }
    }

    public static void a(KeyStore keyStore, X509Certificate x509Certificate) {
        try {
            keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), x509Certificate);
        } catch (KeyStoreException e) {
            Log.w("SdkTrustManager", "Failed to store certificate", e);
        }
    }
}
