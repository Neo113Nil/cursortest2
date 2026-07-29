package o;

import android.media.MediaDataSource;

/* loaded from: classes.dex */
public final class MB extends MediaDataSource {
    public final /* synthetic */ byte[] h;

    public MB(byte[] bArr) {
        this.h = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.h.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.h;
        if (j >= bArr2.length) {
            return -1;
        }
        if (i2 + j > bArr2.length) {
            i2 = (int) (bArr2.length - j);
        }
        System.arraycopy(bArr2, (int) j, bArr, i, i2);
        return i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
