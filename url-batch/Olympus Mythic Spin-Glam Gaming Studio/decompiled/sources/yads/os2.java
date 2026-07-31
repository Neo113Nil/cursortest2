package yads;

import android.net.http.SslCertificate;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class os2 {
    public static final X509Certificate a(SslCertificate sslCertificate, CertificateFactory certificateFactory) {
        byte[] byteArray;
        if (!Intrinsics.areEqual(certificateFactory.getType(), AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509)) {
            certificateFactory.getType();
            boolean z = ob1.a;
            return null;
        }
        Bundle saveState = SslCertificate.saveState(sslCertificate);
        if (saveState == null || (byteArray = saveState.getByteArray("x509-certificate")) == null) {
            return null;
        }
        try {
            Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
            if (generateCertificate instanceof X509Certificate) {
                return (X509Certificate) generateCertificate;
            }
            return null;
        } catch (CertificateException unused) {
            boolean z2 = ob1.a;
            return null;
        }
    }
}
