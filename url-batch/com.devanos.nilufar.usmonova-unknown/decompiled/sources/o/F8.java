package o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class F8 extends InputStream {
    public final /* synthetic */ int h;
    public final /* synthetic */ N8 i;

    public /* synthetic */ F8(N8 n8, int i) {
        this.h = i;
        this.i = n8;
    }

    @Override // java.io.InputStream
    public final int available() {
        long min;
        switch (this.h) {
            case 0:
                min = Math.min(((G8) this.i).i, Integer.MAX_VALUE);
                break;
            default:
                JL jl = (JL) this.i;
                if (!jl.j) {
                    min = Math.min(jl.i.i, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.h) {
            case 0:
                break;
            default:
                ((JL) this.i).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.h) {
            case 0:
                G8 g8 = (G8) this.i;
                if (g8.i > 0) {
                    return g8.readByte() & 255;
                }
                return -1;
            default:
                JL jl = (JL) this.i;
                G8 g82 = jl.i;
                if (jl.j) {
                    throw new IOException("closed");
                }
                if (g82.i == 0 && jl.h.read(g82, 8192L) == -1) {
                    return -1;
                }
                return g82.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                return ((G8) this.i) + ".inputStream()";
            default:
                return ((JL) this.i) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(bArr, "sink");
                return ((G8) this.i).read(bArr, i, i2);
            default:
                AbstractC0048Bt.n(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                JL jl = (JL) this.i;
                G8 g8 = jl.i;
                if (!jl.j) {
                    EB.f(bArr.length, i, i2);
                    if (g8.i == 0 && jl.h.read(g8, 8192L) == -1) {
                        return -1;
                    }
                    return g8.read(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }

    private final void b() {
    }
}
