package o;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: o.dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926dl extends MediaDataSource {
    public long h;
    public final /* synthetic */ C1254il i;

    public C0926dl(C1254il c1254il) {
        this.i = c1254il;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.h;
            C1254il c1254il = this.i;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + c1254il.h.available()) {
                    return -1;
                }
                c1254il.c(j);
                this.h = j;
            }
            if (i2 > c1254il.h.available()) {
                i2 = c1254il.h.available();
            }
            int read = c1254il.read(bArr, i, i2);
            if (read >= 0) {
                this.h += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.h = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
