package com.my.target;

import android.net.TrafficStats;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class j5 extends k5 {
    public static j5 a() {
        return new j5();
    }

    @Override // com.my.target.k5
    protected l5 a(String str, String str2, Map map) {
        l5 l5Var = new l5();
        if (str2 == null) {
            mi.a("HttpLogRequest: Can't send log request - body is null");
            l5Var.a = false;
            return l5Var;
        }
        mi.a("HttpLogRequest: Send log request");
        HttpURLConnection httpURLConnection = null;
        try {
            TrafficStats.setThreadStatsTag(98543098);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(5000);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("Content-Type", "text/html; charset=utf-8");
                httpURLConnection2.setRequestProperty("connection", "close");
                x3.a(httpURLConnection2);
                httpURLConnection2.connect();
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                bufferedWriter.write(str2);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                httpURLConnection2.getInputStream().close();
                httpURLConnection2.disconnect();
                return l5Var;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    l5Var.a = false;
                    l5Var.e = th.getMessage();
                    mi.a("HttpLogRequest: Log request error - " + l5Var.e);
                    return l5Var;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
