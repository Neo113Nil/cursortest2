package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: assets/audience_network.dex */
public final class PF extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC0440Gu A02;
    public final Uri A03;
    public final C0888Ym A04;
    public final InterfaceC0439Gt A05;
    public final String A06;

    public PF(C0888Ym c0888Ym, Uri uri, InterfaceC0439Gt interfaceC0439Gt) throws IOException {
        this.A04 = c0888Ym;
        this.A05 = interfaceC0439Gt;
        this.A03 = uri;
        this.A06 = R0.A08(c0888Ym, uri);
        A00(0);
    }

    private void A00(int i) throws IOException {
        InterfaceC0440Gu interfaceC0440Gu = this.A02;
        if (interfaceC0440Gu != null) {
            interfaceC0440Gu.close();
        }
        this.A02 = this.A05.A4X();
        this.A01 = (int) this.A02.ADl(new C0444Gy(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.A02.read(bArr, i, i2);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.A01;
        int i = this.A00;
        long skipped = j2 - i;
        if (skipped <= 0) {
            return 0L;
        }
        if (j > skipped) {
            j = skipped;
        }
        int i2 = (int) (i + j);
        this.A00 = i2;
        A00(i2);
        return j;
    }
}
