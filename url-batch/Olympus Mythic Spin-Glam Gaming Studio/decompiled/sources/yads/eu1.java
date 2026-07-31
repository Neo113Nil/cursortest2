package yads;

import com.ironsource.C4701ic;
import com.safedk.android.internal.partials.YandexNetworkBridge;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes9.dex */
public final class eu1 extends sn {
    public final gm2 a;
    public final v82 b;
    public final f11 c;
    public final j11 d;

    public eu1(SSLSocketFactory sSLSocketFactory) {
        gm2 gm2Var = new gm2();
        v82 v82Var = new v82();
        f11 f11Var = new f11();
        this.a = gm2Var;
        this.b = v82Var;
        this.c = f11Var;
        this.d = new j11(sSLSocketFactory);
    }

    public final e11 a(ro2 ro2Var, Map map) {
        e11 e11Var;
        SSLSocketFactory sSLSocketFactory;
        u82 a = this.b.a(ro2Var);
        if (a != null) {
            this.a.getClass();
            ArrayList arrayList = new ArrayList();
            Map map2 = a.c;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList.add(new sz0((String) entry.getKey(), (String) entry.getValue()));
                }
            }
            return new e11(a.a, arrayList, a.b);
        }
        j11 j11Var = this.d;
        j11Var.getClass();
        String g = ro2Var.g();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(ro2Var.d());
        URL url = new URL(g);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = ro2Var.o.a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = j11Var.a) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            int i2 = ro2Var.c;
            if (i2 == 0) {
                httpURLConnection.setRequestMethod(C4701ic.a);
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("Unknown method type.");
                }
                httpURLConnection.setRequestMethod("POST");
                byte[] b = ro2Var.b();
                if (b != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(YandexNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                    dataOutputStream.write(b);
                    dataOutputStream.close();
                }
            }
            int httpUrlConnectionGetResponseCode = YandexNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (httpUrlConnectionGetResponseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (ro2Var.c == 4 || ((100 <= httpUrlConnectionGetResponseCode && httpUrlConnectionGetResponseCode < 200) || httpUrlConnectionGetResponseCode == 204 || httpUrlConnectionGetResponseCode == 304)) {
                e11Var = new e11(httpUrlConnectionGetResponseCode, j11.a(httpURLConnection.getHeaderFields()), -1, null);
                YandexNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } else {
                try {
                    e11Var = new e11(httpUrlConnectionGetResponseCode, j11.a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new i11(httpURLConnection));
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        YandexNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    }
                    throw th;
                }
            }
            return e11Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
