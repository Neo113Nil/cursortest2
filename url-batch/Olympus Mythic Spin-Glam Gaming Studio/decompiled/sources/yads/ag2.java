package yads;

import java.io.ByteArrayOutputStream;

/* loaded from: classes9.dex */
public final class ag2 extends ByteArrayOutputStream {
    public final uq a;

    public ag2(uq uqVar, int i) {
        this.a = uqVar;
        ((ByteArrayOutputStream) this).buf = uqVar.a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        int i2 = ((ByteArrayOutputStream) this).count + 1;
        if (i2 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a = this.a.a(i2 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a, 0, ((ByteArrayOutputStream) this).count);
            this.a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a;
        }
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        int i3 = ((ByteArrayOutputStream) this).count + i2;
        if (i3 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a = this.a.a(i3 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a, 0, ((ByteArrayOutputStream) this).count);
            this.a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a;
        }
        super.write(bArr, i, i2);
    }
}
