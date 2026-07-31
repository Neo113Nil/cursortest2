package com.five_corp.ad.internal.http.connection;

import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.LINENetworkBridge;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public final class b extends c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final com.five_corp.ad.internal.util.b a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2) {
        OutputStream outputStream;
        try {
            HttpURLConnection a = a(str);
            if (a == null) {
                return new com.five_corp.ad.internal.util.b(false, new l(m.m2, null, null), null);
            }
            a.setUseCaches(false);
            a.setConnectTimeout(i);
            a.setReadTimeout(i2);
            a.setRequestMethod(str2);
            if (str4 != 0) {
                a.setRequestProperty(Command.HTTP_HEADER_RANGE, str4);
            }
            if (str5 != null) {
                a.setRequestProperty("Accept-Encoding", str5);
            }
            if (str6 != null) {
                a.setRequestProperty("Content-Type", str6);
            }
            if (str3 != null) {
                try {
                    a.setDoOutput(true);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    outputStream = LINENetworkBridge.urlConnectionGetOutputStream(a);
                    try {
                        outputStream.write(str3.getBytes(StandardCharsets.UTF_8));
                        outputStream.close();
                    } catch (IOException e) {
                        e = e;
                        com.five_corp.ad.internal.util.b bVar = new com.five_corp.ad.internal.util.b(false, new l(m.i2, "URL connection output stream io exception", e), null);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        return bVar;
                    }
                } catch (IOException e2) {
                    e = e2;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    str4 = 0;
                    if (str4 != 0) {
                        str4.close();
                    }
                    throw th;
                }
            }
            if (str7 != null) {
                a.setRequestProperty("User-Agent", str7);
            }
            return new com.five_corp.ad.internal.util.b(true, null, new a(a));
        } catch (IllegalArgumentException e3) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.h2, "illegal timeout parameter", e3), null);
        } catch (IllegalStateException e4) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.g2, "illegal state exception on create url connection", e4), null);
        } catch (NullPointerException e5) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.l2, "null pointer exception on create url connection", e5), null);
        } catch (SecurityException e6) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.k2, "security exception on create url connection", e6), null);
        } catch (MalformedURLException e7) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.V1, "malformed URL: " + str, e7), null);
        } catch (ProtocolException e8) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.j2, "protocol exception on create url connection", e8), null);
        } catch (Exception e9) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.W1, "fail to open url connection", e9), null);
        }
    }

    public static HttpURLConnection a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }
}
