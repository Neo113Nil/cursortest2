package com.my.target;

import android.net.TrafficStats;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class g5 extends k5 {
    private static final Charset b = StandardCharsets.UTF_8;
    private final t a;

    private g5(t tVar) {
        this.a = tVar;
    }

    public static g5 a(t tVar) {
        return new g5(tVar);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018f  */
    @Override // com.my.target.k5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected l5 a(String str, String str2, Map map) {
        HttpURLConnection httpURLConnection;
        String str3;
        l5 l5Var = new l5();
        HttpURLConnection httpURLConnection2 = null;
        try {
            mi.a("HttpAdRequest: Send ad request - " + str);
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("connection", "close");
                x3.a(httpURLConnection);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (str2 != null) {
                    str3 = "body - " + str2;
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-mtrgdata-v1");
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(str2.getBytes());
                        outputStream.close();
                    } finally {
                    }
                } else {
                    str3 = "url - " + str;
                    httpURLConnection.connect();
                }
                mi.a("HttpAdRequest: Send ad request, " + str3);
                int responseCode = httpURLConnection.getResponseCode();
                l5Var.c = responseCode;
                if (responseCode == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), b));
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        l5Var.d = sb.toString();
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else if (responseCode != 204) {
                    this.a.c(0, 2001, "code=" + httpURLConnection.getResponseCode());
                    l5Var.a = false;
                    l5Var.e = "Ad request error - response code " + responseCode;
                    mi.a("HttpAdRequest: " + l5Var.e);
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                this.a.b(0, 2001, gi.a(th));
                if (th instanceof SocketTimeoutException) {
                    l5Var.c = 408;
                }
                l5Var.a = false;
                l5Var.e = th.getMessage();
                mi.a("HttpAdRequest: Ad request error - " + l5Var.e);
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                }
                return l5Var;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return l5Var;
    }
}
