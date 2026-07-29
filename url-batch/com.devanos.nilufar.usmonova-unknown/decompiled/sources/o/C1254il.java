package o;

import java.io.InputStream;

/* renamed from: o.il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254il extends C0991el {
    public C1254il(byte[] bArr) {
        super(bArr);
        this.h.mark(Integer.MAX_VALUE);
    }

    public final void c(long j) {
        int i = this.i;
        if (i > j) {
            this.i = 0;
            this.h.reset();
        } else {
            j -= i;
        }
        b((int) j);
    }

    public C1254il(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.h.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
