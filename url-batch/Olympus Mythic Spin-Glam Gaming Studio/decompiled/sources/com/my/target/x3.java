package com.my.target;

import android.content.Context;
import io.github.mytargetsdk.CertData;
import io.github.mytargetsdk.CertManager;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class x3 {
    private static CertData a;
    private static boolean b;

    public static void a(Context context) {
        if (b) {
            return;
        }
        CertData createCertData = new CertManager().createCertData(context);
        a = createCertData;
        if (createCertData == null) {
            mi.b("DigitalGovCertsUtils: can't init digital gov certs – certData is null");
        }
        b = true;
    }

    public static CertData a() {
        return a;
    }

    public static void a(HttpURLConnection httpURLConnection) {
        CertData certData = a;
        if (certData != null && (httpURLConnection instanceof HttpsURLConnection)) {
            try {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(certData.sslContext.getSocketFactory());
            } catch (Throwable th) {
                mi.a("DigitalGovCertsUtils: can't setSSLSocketFactory to httpsURLConnection" + th.getMessage());
            }
        }
    }
}
