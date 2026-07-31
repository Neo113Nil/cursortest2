package com.my.tracker.obfuscated;

import android.net.TrafficStats;
import com.ironsource.C4701ic;
import com.my.tracker.obfuscated.s0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public final class q0 extends s0 {
    q0() {
    }

    @Override // com.my.tracker.obfuscated.s0
    public s0.b a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        s0.b d = s0.b.d();
        BufferedReader bufferedReader = null;
        try {
            x2.a("HttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.setReadTimeout(3000);
            httpURLConnection.setRequestMethod(C4701ic.a);
            int responseCode = httpURLConnection.getResponseCode();
            x2.a("HttpGetRequest: response received with response code: " + responseCode);
            d.a = responseCode == 200;
            try {
                x2.a("HttpGetRequest: processing server response");
                BufferedReader bufferedReader2 = d.a ? new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                if (sb.length() > 0) {
                    d.b = sb.toString();
                } else {
                    x2.a("HttpGetRequest: response data is empty");
                }
                bufferedReader2.close();
                httpURLConnection.disconnect();
                return d;
            } catch (Throwable th3) {
                if (0 != 0) {
                    bufferedReader.close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                x2.a("HttpGetRequest: error", th);
                d.a = false;
                d.c = "HttpGetRequest: error while sending data";
                return d;
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }
}
