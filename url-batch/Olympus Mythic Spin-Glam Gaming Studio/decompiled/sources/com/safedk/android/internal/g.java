package com.safedk.android.internal;

import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class g extends OutputStream implements c {
    private static final String a = "SafeDKOutputStream";
    private String b;
    private OutputStream c;
    private String d;
    private ByteArrayOutputStream e = new ByteArrayOutputStream();
    private c f = this;

    public g(String str, String str2, OutputStream outputStream) {
        this.b = str;
        this.d = str2;
        this.c = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.c.write(i);
        if (i >= 0) {
            try {
                this.e.write(i);
            } catch (Throwable th) {
                try {
                    Logger.e(a, th.getMessage());
                } catch (Throwable th2) {
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b) throws IOException {
        this.c.write(b);
        a(b, 0, b.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b, int off, int len) throws IOException {
        this.c.write(b, off, len);
        a(b, off, len);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        byte[] bArr;
        this.c.close();
        if (!CreativeInfoManager.a(this.b, AdNetworkConfiguration.SHOULD_ADD_BYTE_ARRAY_AS_PARAM_ON_AD_FETCHED, false)) {
            bArr = null;
        } else {
            bArr = this.e.toByteArray();
        }
        String byteArrayOutputStream = this.e.toString();
        Logger.d(a, "closing output stream");
        this.f.a(this.b, this.d, byteArrayOutputStream, bArr);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.c.flush();
    }

    private void a(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            try {
                this.e.write(bArr, i, i2);
            } catch (Throwable th) {
                try {
                    Logger.e(a, th.getMessage());
                } catch (Throwable th2) {
                }
            }
        }
    }

    public void a(c cVar) {
        this.f = cVar;
    }

    @Override // com.safedk.android.internal.c
    public void a(String str, String str2, String str3, byte[] bArr) {
        Logger.d(a, "onStreamClose ", this, " sdkPackageName: ", str);
        CreativeInfoManager.a(str, str2, str3, bArr);
    }
}
