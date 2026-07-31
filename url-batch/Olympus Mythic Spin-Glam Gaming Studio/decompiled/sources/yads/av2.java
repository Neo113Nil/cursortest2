package yads;

import android.util.Log;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;

/* loaded from: classes15.dex */
public final class av2 extends X509ExtendedTrustManager implements zw2 {
    public final bx2 a;

    public av2(z20 z20Var) {
        this.a = new bx2(z20Var);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        bx2 bx2Var = this.a;
        bx2Var.getClass();
        if (q93.a()) {
            qe.a((X509TrustManager) bx2Var.b.getValue(), x509CertificateArr, str, socket);
        } else {
            ((X509TrustManager) bx2Var.b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.a.b.getValue()).getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        Unit unit;
        bx2 bx2Var = this.a;
        bx2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) bx2Var.b.getValue();
            if (q93.a()) {
                qe.b(x509TrustManager, x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            synchronized (bx2Var.e) {
                try {
                    bx2Var.a();
                    bx2Var.b();
                    X509TrustManager x509TrustManager2 = bx2Var.d;
                    if (x509TrustManager2 != null) {
                        if (q93.a()) {
                            qe.b(x509TrustManager2, x509CertificateArr, str, socket);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
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

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        bx2 bx2Var = this.a;
        bx2Var.getClass();
        if (q93.a()) {
            qe.a((X509TrustManager) bx2Var.b.getValue(), x509CertificateArr, str, sSLEngine);
        } else {
            ((X509TrustManager) bx2Var.b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        ((X509TrustManager) this.a.b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        Unit unit;
        bx2 bx2Var = this.a;
        bx2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) bx2Var.b.getValue();
            if (q93.a()) {
                qe.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            synchronized (bx2Var.e) {
                try {
                    bx2Var.a();
                    bx2Var.b();
                    X509TrustManager x509TrustManager2 = bx2Var.d;
                    if (x509TrustManager2 != null) {
                        if (q93.a()) {
                            qe.b(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
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
}
