package yads;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public final class xu2 extends yd0 {
    public final SSLSocketFactory p;

    public xu2(String str, y01 y01Var, SSLSocketFactory sSLSocketFactory) {
        super(str, 8000, 8000, y01Var);
        this.p = sSLSocketFactory;
    }

    @Override // yads.yd0
    public final HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.p;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
