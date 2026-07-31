package com.inmobi.media;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.inmobi.media.fk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4004fk implements Closeable {
    public final FileInputStream a;
    public final Charset b;
    public byte[] c;
    public int d;
    public int e;

    public C4004fk(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(Al.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.a = fileInputStream;
        this.b = charset;
        this.c = new byte[8192];
    }

    public final String a() {
        int i;
        synchronized (this.a) {
            try {
                byte[] bArr = this.c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.d >= this.e) {
                    int read = this.a.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.d = 0;
                    this.e = read;
                }
                for (int i2 = this.d; i2 != this.e; i2++) {
                    byte[] bArr2 = this.c;
                    if (bArr2[i2] == 10) {
                        int i3 = this.d;
                        if (i2 != i3) {
                            i = i2 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i3, i - i3, this.b.name());
                                this.d = i2 + 1;
                                return str;
                            }
                        }
                        i = i2;
                        String str2 = new String(bArr2, i3, i - i3, this.b.name());
                        this.d = i2 + 1;
                        return str2;
                    }
                }
                C3977ek c3977ek = new C3977ek(this, (this.e - this.d) + 80);
                while (true) {
                    byte[] bArr3 = this.c;
                    int i4 = this.d;
                    c3977ek.write(bArr3, i4, this.e - i4);
                    this.e = -1;
                    FileInputStream fileInputStream = this.a;
                    byte[] bArr4 = this.c;
                    int read2 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.d = 0;
                    this.e = read2;
                    for (int i5 = 0; i5 != this.e; i5++) {
                        byte[] bArr5 = this.c;
                        if (bArr5[i5] == 10) {
                            int i6 = this.d;
                            if (i5 != i6) {
                                c3977ek.write(bArr5, i6, i5 - i6);
                            }
                            this.d = i5 + 1;
                            return c3977ek.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.c != null) {
                    this.c = null;
                    this.a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
