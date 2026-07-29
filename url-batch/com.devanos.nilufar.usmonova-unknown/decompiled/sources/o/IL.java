package o;

import com.google.firebase.messaging.Constants;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class IL implements M8 {
    public final YR h;
    public final G8 i;
    public boolean j;

    public IL(YR yr) {
        AbstractC0048Bt.n(yr, "sink");
        this.h = yr;
        this.i = new G8();
    }

    @Override // o.M8
    public final M8 A(long j) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.i.O(j);
        b();
        return this;
    }

    @Override // o.M8
    public final long E(HS hs) {
        long j = 0;
        while (true) {
            long read = ((W6) hs).read(this.i, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            b();
        }
    }

    @Override // o.M8
    public final G8 a() {
        return this.i;
    }

    public final M8 b() {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        G8 g8 = this.i;
        long j = g8.j();
        if (j > 0) {
            this.h.write(g8, j);
        }
        return this;
    }

    @Override // o.YR, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        YR yr = this.h;
        if (this.j) {
            return;
        }
        try {
            G8 g8 = this.i;
            long j = g8.i;
            if (j > 0) {
                yr.write(g8, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            yr.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.j = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // o.M8
    public final M8 e(String str, int i, int i2) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.i.T(str, i, i2);
        b();
        return this;
    }

    @Override // o.M8, o.YR, java.io.Flushable
    public final void flush() {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        G8 g8 = this.i;
        long j = g8.i;
        YR yr = this.h;
        if (j > 0) {
            yr.write(g8, j);
        }
        yr.flush();
    }

    @Override // o.M8
    public final M8 g(long j) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.i.P(j);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.j;
    }

    @Override // o.M8
    public final M8 r(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "byteString");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.i.M(c1347k9);
        b();
        return this;
    }

    @Override // o.YR
    public final NV timeout() {
        return this.h.timeout();
    }

    public final String toString() {
        return "buffer(" + this.h + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC0048Bt.n(byteBuffer, Constants.ScionAnalytics.PARAM_SOURCE);
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        int write = this.i.write(byteBuffer);
        b();
        return write;
    }

    @Override // o.M8
    public final M8 writeByte(int i) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.i.N(i);
        b();
        return this;
    }

    @Override // o.M8
    public final M8 writeInt(int i) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.i.Q(i);
        b();
        return this;
    }

    @Override // o.M8
    public final M8 writeShort(int i) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.i.R(i);
        b();
        return this;
    }

    @Override // o.M8
    public final M8 z(String str) {
        AbstractC0048Bt.n(str, "string");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.i.S(str);
        b();
        return this;
    }

    @Override // o.YR
    public final void write(G8 g8, long j) {
        AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
        if (!this.j) {
            this.i.write(g8, j);
            b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.M8
    public final M8 write(byte[] bArr) {
        AbstractC0048Bt.n(bArr, Constants.ScionAnalytics.PARAM_SOURCE);
        if (!this.j) {
            this.i.m5write(bArr, 0, bArr.length);
            b();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.M8
    public final M8 write(byte[] bArr, int i, int i2) {
        AbstractC0048Bt.n(bArr, Constants.ScionAnalytics.PARAM_SOURCE);
        if (!this.j) {
            this.i.m5write(bArr, i, i2);
            b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
