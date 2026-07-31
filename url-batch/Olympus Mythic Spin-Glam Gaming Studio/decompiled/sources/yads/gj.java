package yads;

import com.safedk.android.internal.partials.YandexFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class gj extends OutputStream {
    public final FileOutputStream a;
    public boolean b = false;

    public gj(File file) {
        this.a = YandexFilesBridge.fileOutputStreamCtor(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.flush();
        try {
            this.a.getFD().sync();
        } catch (IOException e) {
            gh1.d("AtomicFile", gh1.a("Failed to sync file descriptor:", e));
        }
        this.a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
