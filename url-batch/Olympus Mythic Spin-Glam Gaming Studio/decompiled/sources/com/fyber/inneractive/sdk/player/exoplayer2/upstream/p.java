package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import io.bidmachine.util.network.NetworkUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes15.dex */
public final class p implements h {
    public static final Pattern o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference p = new AtomicReference();
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final w e;
    public final w f;
    public final m g;
    public HttpURLConnection h;
    public InputStream i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;

    public p(String str, m mVar, int i, int i2, boolean z, w wVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.d = str;
        this.g = mVar;
        this.f = new w();
        this.b = i;
        this.c = i2;
        this.a = z;
        this.e = wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection b(k kVar) {
        URL url = new URL(kVar.a.toString());
        long j = kVar.c;
        long j2 = kVar.d;
        int i = 0;
        boolean z = (kVar.f & 1) == 1;
        if (!this.a) {
            return a(url, null, j, j2, z, true);
        }
        while (true) {
            int i2 = i + 1;
            if (i > 20) {
                throw new NoRouteToHostException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Too many redirects: ", i2));
            }
            HttpURLConnection a = a(url, null, j, j2, z, false);
            int httpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(a);
            if (httpUrlConnectionGetResponseCode != 300 && httpUrlConnectionGetResponseCode != 301 && httpUrlConnectionGetResponseCode != 302 && httpUrlConnectionGetResponseCode != 303 && httpUrlConnectionGetResponseCode != 307 && httpUrlConnectionGetResponseCode != 308) {
                return a;
            }
            String headerField = a.getHeaderField(NetworkUtils.HEADER_LOCATION);
            DTExchangeNetworkBridge.httpUrlConnectionDisconnect(a);
            if (headerField == null) {
                throw new ProtocolException("Null location redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
            }
            i = i2;
            url = url2;
        }
    }

    public final void c() {
        if (this.m == this.k) {
            return;
        }
        byte[] bArr = (byte[]) p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j = this.m;
            long j2 = this.k;
            if (j == j2) {
                p.set(bArr);
                return;
            }
            int read = this.i.read(bArr, 0, (int) Math.min(j2 - j, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (read == -1) {
                throw new EOFException();
            }
            long j3 = read;
            this.m += j3;
            m mVar = this.g;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.d += j3;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        try {
            if (this.i != null) {
                HttpURLConnection httpURLConnection = this.h;
                long j = this.l;
                if (j != -1) {
                    j -= this.n;
                }
                a(httpURLConnection, j);
                try {
                    this.i.close();
                } catch (IOException e) {
                    throw new u(e);
                }
            }
        } finally {
            this.i = null;
            b();
            if (this.j) {
                this.j = false;
                m mVar = this.g;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        try {
            c();
            return a(bArr, i, i2);
        } catch (IOException e) {
            throw new u(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2 != 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(k kVar) {
        long j;
        long parseLong;
        String headerField;
        this.n = 0L;
        this.m = 0L;
        try {
            HttpURLConnection b = b(kVar);
            this.h = b;
            try {
                int httpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(b);
                if (httpUrlConnectionGetResponseCode < 200 || httpUrlConnectionGetResponseCode > 299) {
                    this.h.getHeaderFields();
                    b();
                    v vVar = new v(httpUrlConnectionGetResponseCode);
                    if (httpUrlConnectionGetResponseCode != 416) {
                        throw vVar;
                    }
                    vVar.initCause(new i());
                    throw vVar;
                }
                this.h.getContentType();
                if (httpUrlConnectionGetResponseCode == 200) {
                    j = kVar.c;
                }
                j = 0;
                this.k = j;
                if ((kVar.f & 1) == 1) {
                    this.l = kVar.d;
                } else {
                    long j2 = kVar.d;
                    if (j2 != -1) {
                        this.l = j2;
                    } else {
                        HttpURLConnection httpURLConnection = this.h;
                        String headerField2 = httpURLConnection.getHeaderField(NetworkUtils.HEADER_CONTENT_LENGTH);
                        if (!TextUtils.isEmpty(headerField2)) {
                            try {
                                parseLong = Long.parseLong(headerField2);
                            } catch (NumberFormatException unused) {
                                Log.e("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField2 + X3.j.e);
                            }
                            headerField = httpURLConnection.getHeaderField("Content-Range");
                            if (!TextUtils.isEmpty(headerField)) {
                                Matcher matcher = o.matcher(headerField);
                                if (matcher.find()) {
                                    try {
                                        long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                        if (parseLong < 0) {
                                            parseLong = parseLong2;
                                        } else if (parseLong != parseLong2) {
                                            Log.w("DefaultHttpDataSource", "Inconsistent headers [" + headerField2 + "] [" + headerField + X3.j.e);
                                            parseLong = Math.max(parseLong, parseLong2);
                                        }
                                    } catch (NumberFormatException unused2) {
                                        Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField + X3.j.e);
                                    }
                                }
                            }
                            this.l = parseLong != -1 ? parseLong - this.k : -1L;
                        }
                        parseLong = -1;
                        headerField = httpURLConnection.getHeaderField("Content-Range");
                        if (!TextUtils.isEmpty(headerField)) {
                        }
                        this.l = parseLong != -1 ? parseLong - this.k : -1L;
                    }
                }
                try {
                    this.i = DTExchangeNetworkBridge.urlConnectionGetInputStream(this.h);
                    this.j = true;
                    m mVar = this.g;
                    if (mVar != null) {
                        synchronized (mVar) {
                            try {
                                if (mVar.b == 0) {
                                    mVar.c = SystemClock.elapsedRealtime();
                                }
                                mVar.b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return this.l;
                } catch (IOException e) {
                    b();
                    throw new u(e);
                }
            } catch (IOException e2) {
                b();
                throw new u("Unable to connect to " + kVar.a.toString(), e2);
            }
        } catch (IOException e3) {
            throw new u("Unable to connect to " + kVar.a.toString(), e3);
        }
    }

    public final HttpURLConnection a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        Map map;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        w wVar = this.e;
        if (wVar != null) {
            synchronized (wVar) {
                try {
                    if (wVar.b == null) {
                        wVar.b = Collections.unmodifiableMap(new HashMap(wVar.a));
                    }
                    map = wVar.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream urlConnectionGetOutputStream = DTExchangeNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                urlConnectionGetOutputStream.write(bArr);
                urlConnectionGetOutputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.l;
        if (j != -1) {
            long j2 = j - this.n;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = this.i.read(bArr, i, i2);
        if (read == -1) {
            if (this.l == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = read;
        this.n += j3;
        m mVar = this.g;
        if (mVar != null) {
            synchronized (mVar) {
                mVar.d += j3;
            }
        }
        return read;
    }

    public static void a(HttpURLConnection httpURLConnection, long j) {
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a;
        if (i == 19 || i == 20) {
            try {
                InputStream urlConnectionGetInputStream = DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                if (j == -1) {
                    if (urlConnectionGetInputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = urlConnectionGetInputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = urlConnectionGetInputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(urlConnectionGetInputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.h = null;
        }
    }
}
