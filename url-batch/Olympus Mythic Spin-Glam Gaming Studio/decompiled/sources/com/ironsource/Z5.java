package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
class Z5 implements Callable<C4586c5> {
    private static final String d = "FileWorkerThread";
    private static final String e = "X-Android-Protocols";
    private static final String f = "http/1.1,h2";
    private final C4568b5 a;
    private final String b;
    private long c;

    Z5(C4568b5 c4568b5, String str, long j) {
        this.a = c4568b5;
        this.b = str;
        this.c = j;
    }

    int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4586c5 call() {
        if (this.c == 0) {
            this.c = 1L;
        }
        C4586c5 c4586c5 = null;
        for (int i = 0; i < this.c; i++) {
            c4586c5 = a(this.a.e(), i, this.a.a(), this.a.c(), this.a.f());
            int b = c4586c5.b();
            if (b != 1008 && b != 1009) {
                break;
            }
        }
        if (c4586c5 != null && c4586c5.a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            String str = File.separator;
            sb.append(str);
            sb.append(this.a.b().getName());
            String sb2 = sb.toString();
            String str2 = this.a.d() + str + Z3.E + this.a.b().getName();
            try {
                if (a(c4586c5.a(), str2) == 0) {
                    c4586c5.a(1006);
                } else if (!a(str2, sb2)) {
                    c4586c5.a(1014);
                }
            } catch (FileNotFoundException e2) {
                C4782n4.d().a(e2);
                c4586c5.a(1018);
            } catch (Error e3) {
                C4782n4.d().a(e3);
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.i(d, e3.getMessage());
                }
                c4586c5.a(1019);
            } catch (Exception e4) {
                C4782n4.d().a(e4);
                if (!TextUtils.isEmpty(e4.getMessage())) {
                    Logger.i(d, e4.getMessage());
                }
                c4586c5.a(1009);
            }
        }
        return c4586c5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[Catch: all -> 0x00a0, TRY_ENTER, TryCatch #0 {all -> 0x00a0, blocks: (B:20:0x009c, B:21:0x00a2, B:44:0x00dc, B:46:0x00e1), top: B:8:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    C4586c5 a(String str, int i, int i2, int i3, boolean z) {
        HttpURLConnection httpURLConnection;
        C4586c5 c4586c5 = new C4586c5();
        if (TextUtils.isEmpty(str)) {
            c4586c5.a(str);
            c4586c5.a(1007);
            return c4586c5;
        }
        InputStream inputStream = null;
        int i4 = 0;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                try {
                    URL url = new URL(str);
                    url.toURI();
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                } catch (Throwable th2) {
                    C4782n4.d().a(th2);
                    IronLog.INTERNAL.error(th2.toString());
                }
            } catch (Throwable th3) {
                C4782n4.d().a(th3);
                IronLog.INTERNAL.error(th3.toString());
                c4586c5.a(str);
                c4586c5.a(i);
                return c4586c5;
            }
            try {
                httpURLConnection.setRequestMethod(C4701ic.a);
                if (z) {
                    try {
                        httpURLConnection.setRequestProperty(e, f);
                    } catch (IllegalStateException e2) {
                        C4782n4.d().a(e2);
                    }
                }
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i3);
                httpURLConnection.connect();
                i4 = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            } catch (FileNotFoundException e3) {
                e = e3;
                C4782n4.d().a(e);
                i = 1018;
                if (0 != 0) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                c4586c5.a(str);
                c4586c5.a(i);
                return c4586c5;
            } catch (Error e4) {
                e = e4;
                C4782n4.d().a(e);
                i4 = 1019;
                if (!TextUtils.isEmpty(e.getMessage())) {
                    Logger.i(d, e.getMessage());
                }
                if (0 != 0) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                c4586c5.a(str);
                c4586c5.a(i4);
                return c4586c5;
            } catch (MalformedURLException e5) {
                e = e5;
                C4782n4.d().a(e);
                i = 1004;
                if (0 != 0) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                c4586c5.a(str);
                c4586c5.a(i);
                return c4586c5;
            } catch (SocketTimeoutException e6) {
                e = e6;
                C4782n4.d().a(e);
                i = 1008;
                if (0 != 0) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                c4586c5.a(str);
                c4586c5.a(i);
                return c4586c5;
            } catch (URISyntaxException e7) {
                e = e7;
                C4782n4.d().a(e);
                i = 1010;
                if (0 != 0) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                c4586c5.a(str);
                c4586c5.a(i);
                return c4586c5;
            } catch (Exception e8) {
                e = e8;
                C4782n4.d().a(e);
                if (!TextUtils.isEmpty(e.getMessage())) {
                    Logger.i(d, e.getMessage());
                }
                i = 1009;
                if (0 != 0) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                c4586c5.a(str);
                c4586c5.a(i);
                return c4586c5;
            }
        } catch (FileNotFoundException e9) {
            e = e9;
            httpURLConnection = null;
        } catch (Error e10) {
            e = e10;
            httpURLConnection = null;
        } catch (MalformedURLException e11) {
            e = e11;
            httpURLConnection = null;
        } catch (SocketTimeoutException e12) {
            e = e12;
            httpURLConnection = null;
        } catch (URISyntaxException e13) {
            e = e13;
            httpURLConnection = null;
        } catch (Exception e14) {
            e = e14;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Throwable th5) {
                    C4782n4.d().a(th5);
                    IronLog.INTERNAL.error(th5.toString());
                    c4586c5.a(str);
                    c4586c5.a(0);
                    throw th;
                }
            }
            if (0 != 0) {
                IronSourceNetworkBridge.httpUrlConnectionDisconnect(null);
            }
            c4586c5.a(str);
            c4586c5.a(0);
            throw th;
        }
        if (i4 >= 200 && i4 < 400) {
            inputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            c4586c5.a(a(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            c4586c5.a(str);
            c4586c5.a(i4);
            return c4586c5;
        }
        Logger.i(d, " RESPONSE CODE: " + i4 + " URL: " + str + " ATTEMPT: " + i);
        i4 = 1011;
        if (inputStream != null) {
        }
        IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
        c4586c5.a(str);
        c4586c5.a(i4);
        return c4586c5;
    }
}
