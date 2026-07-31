package com.my.target;

import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class i5 extends k5 {
    final l5 a = new l5();

    private i5() {
    }

    public static i5 a() {
        return new i5();
    }

    @Override // com.my.target.k5
    protected l5 a(String str, String str2, Map map) {
        z3 c = jg.c();
        if (c != null) {
            this.a.d = c.b(str);
            l5 l5Var = this.a;
            if (l5Var.d != null) {
                l5Var.b = true;
                return l5Var;
            }
        } else {
            mi.a("HttpImageRequest: Unable to open disk cache and get image - " + str);
        }
        a(c, str);
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(z3 z3Var, String str) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            mi.a("HttpImageRequest: Send image request - " + str);
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
                l5 l5Var = this.a;
                l5Var.c = responseCode;
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (z3Var != null) {
                        a(z3Var, inputStream, str);
                    } else {
                        a(inputStream);
                    }
                } else {
                    l5Var.a = false;
                    l5Var.e = "Image request error - response code " + responseCode;
                    mi.a("HttpImageRequest: " + this.a.e);
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                l5 l5Var2 = this.a;
                l5Var2.a = false;
                l5Var2.e = th.getMessage();
                mi.a("HttpImageRequest: Image request error - " + this.a.e);
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection == null) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (httpURLConnection == null) {
            httpURLConnection.disconnect();
        }
    }

    private void a(z3 z3Var, InputStream inputStream, String str) {
        File b = z3Var.b(inputStream, str);
        if (b != null) {
            this.a.d = BitmapFactory.decodeFile(b.getAbsolutePath());
            return;
        }
        l5 l5Var = this.a;
        l5Var.a = false;
        l5Var.e = "Image request error - can't save image to disk cache";
        mi.a("HttpImageRequest: Load in cache error - " + this.a.e);
    }

    private void a(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        this.a.d = BitmapFactory.decodeStream(bufferedInputStream);
        try {
            bufferedInputStream.close();
        } catch (Throwable th) {
            mi.a("HttpImageRequest: Load in memory error - " + th.getMessage());
        }
    }
}
