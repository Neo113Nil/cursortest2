package com.fyber.inneractive.sdk.util;

import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

/* loaded from: classes6.dex */
public abstract class s {
    public static String b(HttpURLConnection httpURLConnection) {
        int httpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        if ((httpUrlConnectionGetResponseCode <= 300 || httpUrlConnectionGetResponseCode >= 304) && httpUrlConnectionGetResponseCode != 307 && httpUrlConnectionGetResponseCode != 308) {
            return null;
        }
        IAlog.a("getRedirectUrl: received redirect code %s", Integer.toString(httpUrlConnectionGetResponseCode));
        String headerField = httpURLConnection.getHeaderField(com.fyber.inneractive.sdk.network.n.LOCATION.a());
        if (!TextUtils.isEmpty(headerField)) {
            IAlog.a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        throw new Exception("Server returned HTTP " + Integer.toString(httpUrlConnectionGetResponseCode) + " with empty location header!");
    }

    public static boolean a() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static String a(String str, int i, int i2) {
        String stringBuffer;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            FilterInputStream a = a(httpURLConnection);
            String b = b(httpURLConnection);
            if (!TextUtils.isEmpty(b)) {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                return a(b, i2, i);
            }
            int httpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (httpUrlConnectionGetResponseCode != 200) {
                IAlog.a("isResponseValid: found invalid response status: %s", Integer.toString(httpUrlConnectionGetResponseCode));
                stringBuffer = null;
            } else {
                stringBuffer = v.b((InputStream) a).toString();
            }
            DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            return stringBuffer;
        } catch (Exception e) {
            IAlog.a("getBodyFromUrl failed with exception", e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            IAlog.a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    public static FilterInputStream a(HttpURLConnection httpURLConnection) {
        FilterInputStream bufferedInputStream;
        try {
            InputStream urlConnectionGetInputStream = DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            if (TextUtils.equals("gzip", httpURLConnection.getContentEncoding())) {
                bufferedInputStream = new GZIPInputStream(urlConnectionGetInputStream);
            } else {
                bufferedInputStream = new BufferedInputStream(urlConnectionGetInputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }
}
