package o;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;

/* loaded from: classes.dex */
public final class D extends FilterInputStream {
    public int h;

    public D(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.h = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.h);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.h <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.h--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(Math.min(j, this.h));
        if (skip >= 0) {
            this.h = (int) (this.h - skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.h;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.h -= read;
        }
        return read;
    }
}
