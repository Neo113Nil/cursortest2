package yads;

import androidx.annotation.DoNotInline;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class qe {
    @DoNotInline
    @NotNull
    public static final zw2 a(@NotNull z20 z20Var) throws CertificateException {
        return new av2(z20Var);
    }

    @DoNotInline
    public static final void b(@NotNull X509TrustManager x509TrustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    public static final void a(@NotNull X509TrustManager x509TrustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    public static final void b(@NotNull X509TrustManager x509TrustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    public static final void a(@NotNull X509TrustManager x509TrustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }
}
