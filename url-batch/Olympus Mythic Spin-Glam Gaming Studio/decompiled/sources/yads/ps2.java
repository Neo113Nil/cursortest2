package yads;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class ps2 {
    public final vw2 a;

    public ps2() {
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
        this.a = vw2Var2;
    }

    public final SSLSocketFactory a(Context context) {
        bu2 a = this.a.a(context);
        int i = y20.$r8$clinit;
        zt2 zt2Var = new zt2(context);
        if (a != null && a.x) {
            zw2 a2 = zd1.a(zt2Var);
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new X509TrustManager[]{a2}, null);
                return sSLContext.getSocketFactory();
            } catch (KeyManagementException e) {
                throw new IllegalStateException("Failed to initialize SSLContext", e);
            } catch (NoSuchAlgorithmException e2) {
                throw new IllegalStateException("No system TLS", e2);
            }
        }
        if (!pa.a(21)) {
            return null;
        }
        int i2 = lg2.$r8$clinit;
        try {
            SSLContext sSLContext2 = SSLContext.getInstance("TLSv1.2");
            try {
                sSLContext2.init(null, null, null);
            } catch (KeyManagementException unused) {
                boolean z = ob1.a;
            }
            return new lg2(sSLContext2.getSocketFactory());
        } catch (NoSuchAlgorithmException unused2) {
            boolean z2 = ob1.a;
            return null;
        }
    }
}
