package sg.bigo.ads.cw;

import io.bidmachine.util.network.NetworkUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes12.dex */
public final class g {
    HttpURLConnection a;
    InputStream b;
    String c;

    public g(String str) {
        this.c = str;
    }

    public final int a(byte[] bArr) {
        StringBuilder sb;
        String str;
        InputStream inputStream = this.b;
        if (inputStream == null) {
            sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error reading data from " + this.c + ": connection is absent!");
            return 0;
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            e = e;
            sb = new StringBuilder("Reading source ");
            sb.append(this.c);
            str = " is interrupted, error message is : ";
            sb.append(str);
            sb.append(e.toString());
            sg.bigo.ads.bn.a.a(0, "ProxyCache", sb.toString());
            return 0;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder("Error reading data from ");
            sb.append(this.c);
            str = ", error message is : ";
            sb.append(str);
            sb.append(e.toString());
            sg.bigo.ads.bn.a.a(0, "ProxyCache", sb.toString());
            return 0;
        }
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e) {
                sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error closing connection correctly, the error message is : " + e.toString());
            } catch (IllegalArgumentException e2) {
                e = e2;
                sg.bigo.ads.bn.a.a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            } catch (NullPointerException e3) {
                e = e3;
                sg.bigo.ads.bn.a.a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: IOException -> 0x0036, TryCatch #0 {IOException -> 0x0036, blocks: (B:6:0x0014, B:15:0x002a, B:18:0x003c), top: B:5:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #0 {IOException -> 0x0036, blocks: (B:6:0x0014, B:15:0x002a, B:18:0x003c), top: B:5:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:2:0x0007->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final HttpURLConnection b() {
        boolean z;
        String str = this.c;
        HttpURLConnection httpURLConnection = null;
        int i = 0;
        while (true) {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                if (httpURLConnection2 == null) {
                    return httpURLConnection2;
                }
                try {
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode != 301 && responseCode != 302 && responseCode != 303) {
                        z = false;
                        if (z) {
                            str = httpURLConnection2.getHeaderField(NetworkUtils.HEADER_LOCATION);
                            i++;
                            httpURLConnection2.disconnect();
                        }
                        if (i > 5) {
                            sg.bigo.ads.bn.a.a(0, "ProxyCache", "Too many redirects: ".concat(String.valueOf(i)));
                        }
                        if (z) {
                            return httpURLConnection2;
                        }
                        httpURLConnection = httpURLConnection2;
                    }
                    z = true;
                    if (z) {
                    }
                    if (i > 5) {
                    }
                    if (z) {
                    }
                } catch (IOException e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                    sg.bigo.ads.bn.a.a(0, "ProxyCache", "PingHttpUrlSource#openConnection, error message is : " + e.toString());
                    return httpURLConnection;
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
    }
}
