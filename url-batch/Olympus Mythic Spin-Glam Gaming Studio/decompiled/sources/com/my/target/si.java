package com.my.target;

import android.net.TrafficStats;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.C4701ic;
import io.bidmachine.util.network.NetworkUtils;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class si {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class a {
        public final int a;
        public final String b;
        public final int c;
        public final String d;

        public a(int i, String str, int i2, String str2) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
        }

        public boolean a() {
            int i = this.a;
            return i == 0 || i == 1;
        }
    }

    private si() {
    }

    public static si a() {
        return new si();
    }

    public a b(String str, int i, hc hcVar) {
        int i2 = 0;
        a aVar = new a(0, str, -10, null);
        while (str != null && i2 <= i) {
            mi.a("tryResolveUrl: " + str);
            aVar = b(str, hcVar);
            str = (aVar.a != 1 || ti.d(aVar.b)) ? null : aVar.b;
            i2++;
        }
        return (!aVar.a() || i2 <= 1) ? aVar : new a(1, aVar.b, aVar.c, null);
    }

    public a a(String str, int i, hc hcVar) {
        a aVar = new a(0, str, -10, null);
        int i2 = 0;
        while (str != null && i2 <= i) {
            mi.a("tryResolveUrl: " + str);
            aVar = a(str, hcVar);
            if (aVar.a()) {
                str = (aVar.a != 1 || ti.d(aVar.b)) ? null : aVar.b;
            } else {
                mi.a("tryResolveUrl error: result=" + aVar.a + ", code=" + aVar.c + ", error=" + aVar.d);
                a aVar2 = new a(0, str, aVar.c, aVar.d);
                str = null;
                aVar = aVar2;
            }
            i2++;
        }
        return (!aVar.a() || i2 <= 1) ? aVar : new a(1, aVar.b, aVar.c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private a b(String str, hc hcVar) {
        HttpURLConnection httpURLConnection;
        a aVar;
        a a2;
        try {
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setRequestMethod(C4701ic.a);
                httpURLConnection.addRequestProperty("User-Agent", System.getProperty("http.agent"));
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("connection", "close");
                x3.a(httpURLConnection);
                if (hcVar != null) {
                    hcVar.b(httpURLConnection);
                }
                httpURLConnection.connect();
                aVar = null;
            } catch (SocketTimeoutException e) {
                e = e;
                aVar = new a(4, null, -2, e.getMessage());
                if (aVar == null) {
                }
                if (httpURLConnection != null) {
                }
                return aVar;
            } catch (Throwable th) {
                th = th;
                aVar = new a(2, null, -2, th.getMessage());
                if (aVar == null) {
                }
                if (httpURLConnection != null) {
                }
                return aVar;
            }
        } catch (SocketTimeoutException e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        if (aVar == null) {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable unused) {
                }
                if (responseCode == 200 || responseCode == 204) {
                    if (hcVar != null) {
                        hcVar.a(httpURLConnection);
                    }
                    aVar = new a(0, str, responseCode, null);
                } else {
                    if (responseCode != 302 && responseCode != 301 && responseCode != 303) {
                        a2 = new a(2, null, responseCode, "Unsupported response code");
                    } else {
                        a2 = a(str, httpURLConnection, responseCode);
                    }
                    aVar = a2;
                }
            } catch (SocketTimeoutException e3) {
                return new a(4, null, -2, e3.getMessage());
            } catch (Throwable th3) {
                return new a(2, null, -2, th3.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private a a(String str, hc hcVar) {
        HttpURLConnection httpURLConnection;
        a aVar;
        a a2;
        try {
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setRequestMethod(C4701ic.a);
                httpURLConnection.addRequestProperty("User-Agent", System.getProperty("http.agent"));
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("connection", "close");
                x3.a(httpURLConnection);
                if (hcVar != null) {
                    hcVar.b(httpURLConnection);
                }
                httpURLConnection.connect();
                aVar = null;
            } catch (SocketTimeoutException e) {
                e = e;
                aVar = new a(4, null, -2, e.getMessage());
                if (aVar == null) {
                }
                if (httpURLConnection != null) {
                }
                return aVar;
            } catch (Throwable th) {
                th = th;
                aVar = new a(2, null, -2, th.getMessage());
                if (aVar == null) {
                }
                if (httpURLConnection != null) {
                }
                return aVar;
            }
        } catch (SocketTimeoutException e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        if (aVar == null) {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable unused) {
                }
                if (responseCode == 200 || responseCode == 204 || responseCode == 404 || responseCode == 403) {
                    if (hcVar != null) {
                        hcVar.a(httpURLConnection);
                    }
                    aVar = new a(0, str, responseCode, null);
                } else {
                    if (responseCode != 302 && responseCode != 301 && responseCode != 303) {
                        a2 = new a(2, null, responseCode, "Unsupported response code");
                    } else {
                        a2 = a(str, httpURLConnection, responseCode);
                    }
                    aVar = a2;
                }
            } catch (SocketTimeoutException e3) {
                return new a(4, null, -2, e3.getMessage());
            } catch (Throwable th3) {
                return new a(2, null, -2, th3.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return aVar;
    }

    private a a(String str, HttpURLConnection httpURLConnection, int i) {
        try {
            String uri = httpURLConnection.getURL().toURI().resolve(new URI(httpURLConnection.getHeaderField(NetworkUtils.HEADER_LOCATION))).toString();
            if (TextUtils.isEmpty(uri)) {
                return new a(2, null, i, "empty redirection");
            }
            boolean z = Build.VERSION.SDK_INT < 28 || ti.c(uri);
            boolean d = ti.d(uri);
            if (!d && !z) {
                return new a(2, null, i, "im=" + d + ", ar=" + z + ", rt=" + uri);
            }
            return new a(1, uri, i, null);
        } catch (Throwable unused) {
            return new a(0, str, i, null);
        }
    }
}
