package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class i2 extends jw {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = iw.g() && Build.VERSION.SDK_INT >= 29;
    }

    public i2() {
        int i = 0;
        ArrayList r0 = o6.r0(new k20[]{(!iw.g() || Build.VERSION.SDK_INT < 29) ? null : new j2(), new ue(p2.f), new ue(cc.a), new ue(j8.a)});
        ArrayList arrayList = new ArrayList();
        int size = r0.size();
        while (i < size) {
            Object obj = r0.get(i);
            i++;
            if (((k20) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.jw
    public final oo b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        k2 k2Var = x509TrustManagerExtensions != null ? new k2(x509TrustManager, x509TrustManagerExtensions) : null;
        return k2Var != null ? k2Var : new p7(c(x509TrustManager));
    }

    @Override // defpackage.jw
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((k20) obj).b(sSLSocket)) {
                break;
            }
        }
        k20 k20Var = (k20) obj;
        if (k20Var != null) {
            k20Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.jw
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((k20) obj).b(sSLSocket)) {
                break;
            }
        }
        k20 k20Var = (k20) obj;
        if (k20Var != null) {
            return k20Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.jw
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
