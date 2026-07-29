package o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class HL extends OutputStream {
    public final /* synthetic */ IL h;

    public HL(IL il) {
        this.h = il;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        IL il = this.h;
        if (il.j) {
            return;
        }
        il.flush();
    }

    public final String toString() {
        return this.h + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        IL il = this.h;
        if (il.j) {
            throw new IOException("closed");
        }
        il.i.N((byte) i);
        il.b();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        AbstractC0048Bt.n(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IL il = this.h;
        if (!il.j) {
            il.i.m5write(bArr, i, i2);
            il.b();
            return;
        }
        throw new IOException("closed");
    }
}
