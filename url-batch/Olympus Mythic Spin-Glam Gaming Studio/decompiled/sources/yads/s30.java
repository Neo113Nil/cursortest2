package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class s30 extends InputStream {
    public final q30 a;
    public final v30 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public s30(q30 q30Var, v30 v30Var) {
        this.a = q30Var;
        this.b = v30Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.c[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.e) {
            if (!this.d) {
                this.a.a(this.b);
                this.d = true;
            }
            int c = this.a.c(bArr, i, i2);
            if (c == -1) {
                return -1;
            }
            return c;
        }
        throw new IllegalStateException();
    }
}
