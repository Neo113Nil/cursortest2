package com.my.tracker.obfuscated;

import android.net.TrafficStats;
import com.my.tracker.obfuscated.s0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class r0 extends s0 {
    final s0.a a;
    final boolean b;

    r0(s0.a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #3 {all -> 0x00c4, blocks: (B:6:0x002f, B:18:0x009d, B:23:0x00ad, B:39:0x0106, B:45:0x0111, B:46:0x0114, B:49:0x00c7, B:55:0x011d, B:56:0x0120), top: B:5:0x002f }] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.FilterOutputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.FilterOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.my.tracker.obfuscated.s0$a] */
    @Override // com.my.tracker.obfuscated.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s0.b a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        GZIPOutputStream gZIPOutputStream;
        Throwable th2;
        s0.b d = s0.b.d();
        BufferedReader bufferedReader = null;
        try {
            x2.a("HttpPostRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Connection", "close");
            httpURLConnection.setRequestProperty("Content-Type", this.a.a());
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoOutput(true);
            try {
                gZIPOutputStream = this.b;
                try {
                    if (gZIPOutputStream != 0) {
                        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                        x2.a("HttpPostRequest: populating post request body using gzip");
                        gZIPOutputStream = gZIPOutputStream2;
                    } else {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        x2.a("HttpPostRequest: populating post request body without using gzip");
                        gZIPOutputStream = bufferedOutputStream;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (gZIPOutputStream != 0) {
                        gZIPOutputStream.close();
                    }
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            try {
                this.a.a(gZIPOutputStream);
                if (this.b) {
                    gZIPOutputStream.finish();
                }
                gZIPOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200 && responseCode != 204) {
                    x2.a("HttpPostRequest error: response code " + responseCode);
                    d.a = false;
                    if (responseCode == 200) {
                        try {
                            x2.a("HttpPostRequest: processing server response");
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            try {
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
                                    x2.a("HttpPostRequest: response data is empty");
                                }
                                bufferedReader2.close();
                            } catch (Throwable th6) {
                                th = th6;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                    httpURLConnection.disconnect();
                    return d;
                }
                x2.a("HttpPostRequest: response successfully received");
                d.a = true;
                if (responseCode == 200) {
                }
                httpURLConnection.disconnect();
                return d;
            } catch (Throwable th8) {
                th = th8;
                bufferedReader = gZIPOutputStream;
                gZIPOutputStream = bufferedReader;
                th2 = th;
                if (gZIPOutputStream != 0) {
                }
                throw th2;
            }
        } catch (Throwable th9) {
            th = th9;
            try {
                x2.a("HttpPostRequest error: error while sending data", th);
                d.a = false;
                d.c = "HttpPostRequest error: error while sending data";
                return d;
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }
}
