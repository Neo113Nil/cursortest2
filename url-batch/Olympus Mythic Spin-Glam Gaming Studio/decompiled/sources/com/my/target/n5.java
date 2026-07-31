package com.my.target;

import android.net.TrafficStats;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class n5 extends k5 {
    private n5() {
    }

    public static n5 a() {
        return new n5();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    @Override // com.my.target.k5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected l5 a(String str, String str2, Map map) {
        HttpURLConnection httpURLConnection;
        l5 l5Var = new l5();
        z3 c = jg.c();
        if (c == null) {
            mi.a("HttpVideoRequest: Unable to open disk cache and load/save video " + str);
            l5Var.a = false;
            return l5Var;
        }
        String c2 = c.c(str);
        l5Var.d = c2;
        if (c2 != null) {
            l5Var.b = true;
            return l5Var;
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            mi.a("HttpVideoRequest: Send video request - " + str);
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("connection", "close");
                x3.a(httpURLConnection);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                l5Var.c = responseCode;
                if (responseCode == 200) {
                    File c3 = c.c(httpURLConnection.getInputStream(), str);
                    if (c3 != null) {
                        l5Var.d = c3.getAbsolutePath();
                    } else {
                        l5Var.a = false;
                        l5Var.e = "Video request error - can't save video to disk cache";
                        mi.a("HttpVideoRequest: " + l5Var.e);
                    }
                } else {
                    l5Var.a = false;
                    l5Var.e = "Video request error - response code " + responseCode;
                    mi.a("HttpVideoRequest: " + l5Var.e);
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                l5Var.a = false;
                l5Var.e = th.getMessage();
                mi.a("HttpVideoRequest: Video request error - " + l5Var.e);
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                }
                return l5Var;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return l5Var;
    }
}
