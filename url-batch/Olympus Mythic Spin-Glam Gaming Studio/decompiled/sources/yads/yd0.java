package yads;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4701ic;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.YandexNetworkBridge;
import io.bidmachine.util.network.NetworkUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* loaded from: classes4.dex */
public class yd0 extends jn {
    public final int e;
    public final int f;
    public final String g;
    public final y01 h;
    public final y01 i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public int m;
    public long n;
    public long o;

    public yd0(String str, int i, int i2, y01 y01Var) {
        super(true);
        this.g = str;
        this.e = i;
        this.f = i2;
        this.h = y01Var;
        this.i = new y01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r7 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015a A[Catch: IOException -> 0x0164, TRY_LEAVE, TryCatch #4 {IOException -> 0x0164, blocks: (B:22:0x0152, B:24:0x015a), top: B:21:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c6  */
    @Override // yads.q30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(v30 v30Var) {
        long j;
        long j2;
        boolean z;
        long j3;
        HttpURLConnection httpURLConnection;
        long parseLong;
        long j4;
        long j5;
        long parseLong2;
        this.o = 0L;
        this.n = 0L;
        h();
        try {
            HttpURLConnection a = a(new URL(v30Var.a.toString()), v30Var.c, v30Var.d, v30Var.f, v30Var.g, (v30Var.i & 1) == 1, true, v30Var.e);
            this.j = a;
            this.m = YandexNetworkBridge.httpUrlConnectionGetResponseCode(a);
            a.getResponseMessage();
            int i = this.m;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = a.getHeaderFields();
                if (this.m == 416) {
                    String headerField = a.getHeaderField("Content-Range");
                    Pattern pattern = h11.a;
                    if (!TextUtils.isEmpty(headerField)) {
                        Matcher matcher = h11.b.matcher(headerField);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            j = Long.parseLong(group);
                            if (v30Var.f == j) {
                                this.l = true;
                                b(v30Var);
                                long j6 = v30Var.g;
                                if (j6 != -1) {
                                    return j6;
                                }
                                return 0L;
                            }
                        }
                    }
                    j = -1;
                    if (v30Var.f == j) {
                    }
                }
                InputStream errorStream = a.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i2 = sb3.a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = errorStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i3 = sb3.a;
                    }
                } catch (IOException unused) {
                    int i4 = sb3.a;
                }
                i();
                throw new x01(this.m, this.m == 416 ? new r30(2008) : null, headerFields);
            }
            a.getContentType();
            if (this.m == 200) {
                j2 = v30Var.f;
            }
            j2 = 0;
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(a.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                z = equalsIgnoreCase;
                j3 = j2;
                httpURLConnection = a;
                this.n = v30Var.g;
            } else {
                long j7 = v30Var.g;
                if (j7 != -1) {
                    this.n = j7;
                    z = equalsIgnoreCase;
                    j3 = j2;
                    httpURLConnection = a;
                } else {
                    String headerField2 = a.getHeaderField(NetworkUtils.HEADER_CONTENT_LENGTH);
                    String headerField3 = a.getHeaderField("Content-Range");
                    Pattern pattern2 = h11.a;
                    if (!TextUtils.isEmpty(headerField2)) {
                        try {
                            parseLong = Long.parseLong(headerField2);
                        } catch (NumberFormatException unused2) {
                            gh1.b("HttpUtil", "Unexpected Content-Length [" + headerField2 + X3.j.e);
                        }
                        if (!TextUtils.isEmpty(headerField3)) {
                            Matcher matcher2 = h11.a.matcher(headerField3);
                            if (matcher2.matches()) {
                                try {
                                    String group2 = matcher2.group(2);
                                    group2.getClass();
                                    long parseLong3 = Long.parseLong(group2);
                                    String group3 = matcher2.group(1);
                                    group3.getClass();
                                    z = equalsIgnoreCase;
                                    parseLong2 = (parseLong3 - Long.parseLong(group3)) + 1;
                                    j3 = j2;
                                    httpURLConnection = a;
                                    j4 = parseLong;
                                } catch (NumberFormatException unused3) {
                                    z = equalsIgnoreCase;
                                    j3 = j2;
                                    j4 = parseLong;
                                    httpURLConnection = a;
                                }
                                if (j4 < 0) {
                                    j5 = parseLong2;
                                } else {
                                    if (j4 != parseLong2) {
                                        try {
                                            gh1.d("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + X3.j.e);
                                            j5 = Math.max(j4, parseLong2);
                                        } catch (NumberFormatException unused4) {
                                            gh1.b("HttpUtil", "Unexpected Content-Range [" + headerField3 + X3.j.e);
                                            j5 = j4;
                                            this.n = j5 == -1 ? j5 - j3 : -1L;
                                            this.k = YandexNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                                            if (z) {
                                            }
                                            this.l = true;
                                            b(v30Var);
                                            try {
                                                a(j3);
                                                return this.n;
                                            } catch (IOException e) {
                                                i();
                                                if (e instanceof v01) {
                                                    throw ((v01) e);
                                                }
                                                throw new v01(2000, 1, e);
                                            }
                                        }
                                    }
                                    j5 = j4;
                                }
                                this.n = j5 == -1 ? j5 - j3 : -1L;
                            }
                        }
                        z = equalsIgnoreCase;
                        j3 = j2;
                        j4 = parseLong;
                        httpURLConnection = a;
                        j5 = j4;
                        this.n = j5 == -1 ? j5 - j3 : -1L;
                    }
                    parseLong = -1;
                    if (!TextUtils.isEmpty(headerField3)) {
                    }
                    z = equalsIgnoreCase;
                    j3 = j2;
                    j4 = parseLong;
                    httpURLConnection = a;
                    j5 = j4;
                    this.n = j5 == -1 ? j5 - j3 : -1L;
                }
            }
            try {
                this.k = YandexNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                if (z) {
                    this.k = new GZIPInputStream(this.k);
                }
                this.l = true;
                b(v30Var);
                a(j3);
                return this.n;
            } catch (IOException e2) {
                i();
                throw new v01(2000, 1, e2);
            }
        } catch (IOException e3) {
            i();
            throw v01.a(e3, 1);
        }
    }

    @Override // yads.q30
    public final Map b() {
        HttpURLConnection httpURLConnection = this.j;
        return httpURLConnection == null ? zm2.h : new xd0(httpURLConnection.getHeaderFields());
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.n;
            if (j != -1) {
                long j2 = j - this.o;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.k;
            int i3 = sb3.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.o += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            int i4 = sb3.a;
            throw v01.a(e, 2);
        }
    }

    @Override // yads.q30
    public final void close() {
        try {
            InputStream inputStream = this.k;
            if (inputStream != null) {
                long j = this.n;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.o;
                }
                a(this.j, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = sb3.a;
                    throw new v01(2000, 3, e);
                }
            }
        } finally {
            this.k = null;
            i();
            if (this.l) {
                this.l = false;
                g();
            }
        }
    }

    @Override // yads.q30
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void i() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                YandexNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e) {
                gh1.b("DefaultHttpDataSource", gh1.a("Unexpected error while disconnecting", e));
            }
            this.j = null;
        }
    }

    public final HttpURLConnection a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        Map map2;
        HttpURLConnection a = a(url);
        a.setConnectTimeout(this.e);
        a.setReadTimeout(this.f);
        HashMap hashMap = new HashMap();
        y01 y01Var = this.h;
        if (y01Var != null) {
            synchronized (y01Var) {
                try {
                    if (y01Var.b == null) {
                        y01Var.b = Collections.unmodifiableMap(new HashMap(y01Var.a));
                    }
                    map2 = y01Var.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashMap.putAll(map2);
        }
        hashMap.putAll(this.i.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = h11.a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j);
            sb2.append("-");
            if (j2 != -1) {
                sb2.append((j + j2) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            a.setRequestProperty(Command.HTTP_HEADER_RANGE, sb);
        }
        String str2 = this.g;
        if (str2 != null) {
            a.setRequestProperty("User-Agent", str2);
        }
        a.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        a.setInstanceFollowRedirects(z2);
        a.setDoOutput(bArr != null);
        int i2 = v30.$r8$clinit;
        if (i == 1) {
            str = C4701ic.a;
        } else if (i == 2) {
            str = "POST";
        } else if (i == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        a.setRequestMethod(str);
        if (bArr != null) {
            a.setFixedLengthStreamingMode(bArr.length);
            a.connect();
            OutputStream urlConnectionGetOutputStream = YandexNetworkBridge.urlConnectionGetOutputStream(a);
            urlConnectionGetOutputStream.write(bArr);
            urlConnectionGetOutputStream.close();
        } else {
            a.connect();
        }
        return a;
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final void a(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.k;
            int i = sb3.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new v01(2000, 1, new InterruptedIOException());
            }
            if (read != -1) {
                j -= read;
                c(read);
            } else {
                throw new v01();
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = sb3.a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream urlConnectionGetInputStream = YandexNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            if (j == -1) {
                if (urlConnectionGetInputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = urlConnectionGetInputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = urlConnectionGetInputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(urlConnectionGetInputStream, null);
            }
        } catch (Exception unused) {
        }
    }
}
