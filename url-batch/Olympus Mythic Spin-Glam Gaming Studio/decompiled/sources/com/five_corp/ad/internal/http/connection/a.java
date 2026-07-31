package com.five_corp.ad.internal.http.connection;

import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import com.safedk.android.internal.partials.LINENetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.zip.GZIPInputStream;

/* loaded from: classes4.dex */
public final class a {
    public HttpURLConnection a;
    public InputStream b = null;

    public a(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    public final com.five_corp.ad.internal.util.c a() {
        try {
            this.a.connect();
            return new com.five_corp.ad.internal.util.c(true, null);
        } catch (SocketTimeoutException e) {
            return new com.five_corp.ad.internal.util.c(false, new l(m.Y1, null, e));
        } catch (IOException e2) {
            return new com.five_corp.ad.internal.util.c(false, new l(m.X1, null, e2));
        } catch (Throwable th) {
            return new com.five_corp.ad.internal.util.c(false, new l(m.f2, null, th));
        }
    }

    public final void b() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
            this.b = null;
        }
        try {
            InputStream errorStream = this.a.getErrorStream();
            if (errorStream != null) {
                errorStream.close();
            }
        } catch (Throwable unused2) {
        }
        this.a = null;
    }

    public final com.five_corp.ad.internal.util.b c() {
        try {
            return new com.five_corp.ad.internal.util.b(true, null, Integer.valueOf(LINENetworkBridge.httpUrlConnectionGetResponseCode(this.a)));
        } catch (Throwable th) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.Z1, null, th), null);
        }
    }

    public final com.five_corp.ad.internal.util.b a(byte[] bArr) {
        if (this.b == null) {
            try {
                this.b = a(this.a);
            } catch (SocketTimeoutException e) {
                return new com.five_corp.ad.internal.util.b(false, new l(m.c2, null, e), null);
            } catch (IOException e2) {
                return new com.five_corp.ad.internal.util.b(false, new l(m.a2, null, e2), null);
            } catch (Throwable th) {
                return new com.five_corp.ad.internal.util.b(false, new l(m.b2, null, th), null);
            }
        }
        try {
            return new com.five_corp.ad.internal.util.b(true, null, Integer.valueOf(this.b.read(bArr)));
        } catch (IOException e3) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.d2, null, e3), null);
        } catch (Throwable th2) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.e2, null, th2), null);
        }
    }

    public static InputStream a(HttpURLConnection httpURLConnection) {
        String contentEncoding = httpURLConnection.getContentEncoding();
        return (contentEncoding == null || !contentEncoding.contains("gzip")) ? LINENetworkBridge.urlConnectionGetInputStream(httpURLConnection) : new GZIPInputStream(LINENetworkBridge.urlConnectionGetInputStream(httpURLConnection));
    }
}
