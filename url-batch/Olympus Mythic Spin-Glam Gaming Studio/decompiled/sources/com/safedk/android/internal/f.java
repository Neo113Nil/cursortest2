package com.safedk.android.internal;

import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import io.bidmachine.util.network.NetworkUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class f extends InputStream {
    private static final String a = "SafeDKInputStream";
    private final boolean b;
    private final String c;
    private final String d;
    private final InputStream e;
    private Map<String, List<String>> j;
    private HttpURLConnection l;
    private boolean g = false;
    private boolean h = false;
    private int i = 0;
    private ByteArrayOutputStream k = new ByteArrayOutputStream();
    private final long f = System.currentTimeMillis();

    public f(String str, String str2, InputStream inputStream, Map<String, List<String>> map, boolean z) {
        this.c = str;
        this.d = str2;
        this.e = inputStream;
        this.j = map;
        this.b = z;
    }

    public void a(HttpURLConnection httpURLConnection) {
        this.l = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.e;
        if (inputStream == null) {
            return 0;
        }
        int read = inputStream.read();
        if (read >= 0) {
            try {
                this.k.write(read);
            } catch (Throwable th) {
                try {
                    Logger.e(a, th.getMessage());
                } catch (Throwable th2) {
                }
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] b) throws IOException {
        InputStream inputStream = this.e;
        if (inputStream == null) {
            return 0;
        }
        int read = inputStream.read(b);
        a(b, 0, read);
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            int read = inputStream.read(b, off, len);
            a(b, off, read);
            return read;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public long skip(long n) throws IOException {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            return inputStream.skip(n);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.e != null) {
            this.e.reset();
        }
    }

    private int a(ByteArrayOutputStream byteArrayOutputStream) {
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.size();
        }
        return 0;
    }

    private void b() {
        int read;
        do {
            try {
                read = this.e.read();
                if (read > 0) {
                    this.k.write(read);
                }
            } catch (Exception e) {
                Logger.d(a, "read all before close - exception= ", e.getMessage());
                return;
            }
        } while (read > 0);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.e != null) {
                b();
                int a2 = a(this.k);
                int c = c(this.j);
                if (c != a2 && !this.h) {
                    if (c > -1) {
                        Logger.d(a, "Attempt to close the stream, ", this, ", before reading all of it has been made! amount read: ", Integer.valueOf(a2), ", content size: ", Integer.valueOf(c), " sdk: ", this.c);
                    }
                }
                Logger.d(a, "closing the stream, ", this, ", with amount read: ", Integer.valueOf(a2));
                this.e.close();
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    public void a() {
        if (!this.g) {
            a("cd");
        }
    }

    private void a(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            try {
                if (this.k != null) {
                    this.k.write(bArr, i, i2);
                }
            } catch (Throwable th) {
                try {
                    Logger.e(a, th.getMessage(), th);
                    return;
                } catch (Throwable th2) {
                    return;
                }
            }
        }
        if (b(this.j) && i2 == -1) {
            a("sr-lc");
        }
        if (this.b && this.k != null) {
            int c = c(this.j);
            int size = this.k.size();
            if (c > -1) {
                if (c == size) {
                    a("sr-cs");
                }
            } else if (a(this.j) && i2 < this.i) {
                a("sr-rb");
            }
            this.i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #1 {all -> 0x00c2, blocks: (B:3:0x0004, B:5:0x000c, B:7:0x0010, B:11:0x0019, B:14:0x001e, B:16:0x002b, B:18:0x003c, B:20:0x0044, B:22:0x0050, B:26:0x005e, B:30:0x0068, B:33:0x00b3, B:35:0x00bc, B:38:0x0074, B:40:0x0097, B:41:0x00b1, B:42:0x00a7, B:44:0x0055), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:3:0x0004, B:5:0x000c, B:7:0x0010, B:11:0x0019, B:14:0x001e, B:16:0x002b, B:18:0x003c, B:20:0x0044, B:22:0x0050, B:26:0x005e, B:30:0x0068, B:33:0x00b3, B:35:0x00bc, B:38:0x0074, B:40:0x0097, B:41:0x00b1, B:42:0x00a7, B:44:0x0055), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:3:0x0004, B:5:0x000c, B:7:0x0010, B:11:0x0019, B:14:0x001e, B:16:0x002b, B:18:0x003c, B:20:0x0044, B:22:0x0050, B:26:0x005e, B:30:0x0068, B:33:0x00b3, B:35:0x00bc, B:38:0x0074, B:40:0x0097, B:41:0x00b1, B:42:0x00a7, B:44:0x0055), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str) {
        boolean z;
        boolean z2;
        String byteArrayOutputStream;
        boolean z3;
        try {
            if ((!b(this.j) && this.k != null && this.k.size() == 0) || this.g) {
                return;
            }
            this.g = true;
            com.safedk.android.analytics.brandsafety.creatives.b k = CreativeInfoManager.k(this.c);
            if (k == null) {
                z = false;
                z2 = false;
            } else {
                z2 = k.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT);
                z = k.b(AdNetworkConfiguration.SHOULD_ADD_BYTE_ARRAY_AS_PARAM_ON_AD_FETCHED);
            }
            if (z2 && a(this.j)) {
                String a2 = com.safedk.android.utils.c.a(this.k.toByteArray());
                if (a2 == null) {
                    this.g = false;
                    return;
                }
                byteArrayOutputStream = a2;
            } else {
                byteArrayOutputStream = this.k.toString();
            }
            if (byteArrayOutputStream != null && byteArrayOutputStream.length() != 0) {
                z3 = false;
                if (this.c.equals(com.safedk.android.utils.h.p) || !z3) {
                    String str2 = this.f + ";" + str + ";" + (System.currentTimeMillis() - this.f);
                    if (!z) {
                        CreativeInfoManager.a(this.c, this.d, byteArrayOutputStream, this.k.toByteArray(), this.j, str2);
                    } else {
                        CreativeInfoManager.a(this.c, this.d, byteArrayOutputStream, null, this.j, str2);
                    }
                    this.h = true;
                }
                this.k = null;
                this.j = null;
                if (this.l == null) {
                    NetworkBridge.disposeOfConnectionToStreamMapping(this.l);
                    return;
                }
                return;
            }
            z3 = true;
            if (this.c.equals(com.safedk.android.utils.h.p)) {
            }
            String str22 = this.f + ";" + str + ";" + (System.currentTimeMillis() - this.f);
            if (!z) {
            }
            this.h = true;
            this.k = null;
            this.j = null;
            if (this.l == null) {
            }
        } catch (Throwable th) {
            try {
                Logger.e(a, th.getMessage());
            } catch (Throwable th2) {
            }
        }
    }

    private static boolean a(Map<String, List<String>> map) {
        List<String> list;
        return (map == null || (list = map.get("Content-Encoding")) == null || !list.contains("gzip")) ? false : true;
    }

    private static boolean b(Map<String, List<String>> map) {
        List<String> list;
        return (map == null || (list = map.get("Transfer-Encoding")) == null || !list.contains("chunked")) ? false : true;
    }

    private static int c(Map<String, List<String>> map) {
        List<String> list;
        if (map != null && (list = map.get(NetworkUtils.HEADER_CONTENT_LENGTH)) != null) {
            return Integer.parseInt(list.get(0));
        }
        return -1;
    }
}
