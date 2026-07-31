package yads;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes15.dex */
public final class jo3 {
    public final Lazy a = LazyKt.lazy(io3.b);

    public final boolean a(Context context, SslError sslError) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        if (a == null || !a.x) {
            return false;
        }
        X509Certificate x509Certificate = Build.VERSION.SDK_INT >= 29 ? sslError.getCertificate().getX509Certificate() : os2.a(sslError.getCertificate(), (CertificateFactory) this.a.getValue());
        if (x509Certificate == null) {
            return false;
        }
        int i = y20.$r8$clinit;
        try {
            zd1.a(new zt2(context)).checkServerTrusted(new X509Certificate[]{x509Certificate}, "RSA");
            return true;
        } catch (Exception unused) {
            boolean z = ob1.a;
            return false;
        }
    }
}
