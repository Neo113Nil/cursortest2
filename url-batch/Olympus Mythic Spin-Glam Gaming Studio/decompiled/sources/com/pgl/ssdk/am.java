package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C4701ic;
import com.ironsource.O6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class am {
    public static String a;
    private Context c;
    private int d;
    private int e;
    private byte[] f;
    private HttpURLConnection b = null;
    private int g = -1;
    private byte[] h = null;
    private int i = 10000;
    private int j = 0;
    private int k = 2;
    private boolean l = true;
    private Runnable m = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.j == 0) {
                an.c();
            }
            if (am.this.c() || am.this.j >= am.this.k) {
                return;
            }
            am.b(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.c = context;
    }

    private void a(int i) {
        this.b.setRequestMethod(i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? C4701ic.a : "TRACE" : "HEAD" : "DELETE" : com.safedk.android.a.g.f : "POST");
    }

    public static synchronized void a(String str) {
        synchronized (am.class) {
            if (!TextUtils.isEmpty(str) && !str.equals(a)) {
                a = str;
            }
        }
    }

    private byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    static /* synthetic */ int b(am amVar) {
        int i = amVar.j;
        amVar.j = i + 1;
        return i;
    }

    private void b() {
        Object obj;
        if (this.b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(a)) {
                jSONObject.put("ipv6", a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.c())) {
                jSONObject.put(O6.X0, com.pgl.ssdk.ces.b.c());
            }
            jSONObject.put("region", an.a());
            Pair<Integer, String> a2 = aq.a(jSONObject.toString());
            if (a2 == null || (obj = a2.first) == null || a2.second == null) {
                return;
            }
            this.b.addRequestProperty("cypher", String.valueOf(obj));
            this.b.addRequestProperty("transfer-param", (String) a2.second);
        } catch (Exception unused) {
        }
    }

    private void b(int i) {
        HttpURLConnection httpURLConnection;
        StringBuilder sb;
        String str;
        String str2 = i != 1 ? i != 2 ? "" : MimeTypes.APPLICATION_OCTET_STREAM : "application/json; charset=utf-8";
        if (!str2.isEmpty()) {
            this.b.addRequestProperty("Content-Type", str2);
        }
        String b = an.b();
        if (b != null) {
            this.b.addRequestProperty("x-pangle-target-idc", b);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                httpURLConnection = this.b;
                sb = new StringBuilder();
                sb.append(Locale.getDefault().toString());
                sb.append(StringUtils.COMMA);
                sb.append(language);
                str = ";q=0.9";
            } else {
                httpURLConnection = this.b;
                sb = new StringBuilder();
                sb.append(Locale.getDefault().toString());
                sb.append(StringUtils.COMMA);
                sb.append(language);
                str = ";q=0.9,en-US;q=0.6,en;q=0.4";
            }
            sb.append(str);
            httpURLConnection.addRequestProperty("Accept-Language", sb.toString());
        } catch (Throwable unused) {
        }
    }

    private void b(int i, int i2, byte[] bArr) {
        this.d = i;
        this.e = i2;
        this.f = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
    
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        if (r0 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c() {
        InputStream inputStream;
        try {
            String a2 = an.a(this.c);
            if (TextUtils.isEmpty(a2)) {
                an.b(this.c);
                HttpURLConnection httpURLConnection = this.b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    this.b = null;
                }
                return false;
            }
            String str = a2 + a();
            if (!str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u) && !str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v)) {
                str = com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u.concat(str);
            }
            URL url = new URL(str);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) (this.l ? url.openConnection(Proxy.NO_PROXY) : url.openConnection());
            this.b = httpURLConnection2;
            httpURLConnection2.setConnectTimeout(this.i);
            this.b.setReadTimeout(this.i);
            a(this.d);
            b(this.e);
            byte[] bArr = this.f;
            if (bArr != null && bArr.length > 0) {
                this.b.setDoOutput(true);
                OutputStream outputStream = this.b.getOutputStream();
                outputStream.write(this.f);
                outputStream.flush();
                outputStream.close();
            }
            this.b.connect();
            this.g = this.b.getResponseCode();
            inputStream = this.b.getInputStream();
            try {
                byte[] a3 = a(inputStream);
                this.h = a3;
                int i = this.g;
                if (i == 200) {
                    a(i, a3);
                    HttpURLConnection httpURLConnection3 = this.b;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                        this.b = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return true;
                }
                HttpURLConnection httpURLConnection4 = this.b;
                if (httpURLConnection4 != null) {
                    httpURLConnection4.disconnect();
                    this.b = null;
                }
            } catch (Throwable unused2) {
                HttpURLConnection httpURLConnection5 = this.b;
                if (httpURLConnection5 != null) {
                    httpURLConnection5.disconnect();
                    this.b = null;
                }
            }
        } catch (Throwable unused3) {
            inputStream = null;
        }
        an.b(this.c);
        return false;
    }

    abstract String a();

    public void a(int i, int i2, byte[] bArr) {
        b(i, i2, bArr);
        ar.a(this.m);
    }

    abstract void a(int i, byte[] bArr);
}
