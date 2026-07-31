package yads;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class kq2 extends BufferedOutputStream {
    public boolean a;

    public kq2(gj gjVar) {
        super(gjVar);
    }

    public final void a(OutputStream outputStream) {
        if (!this.a) {
            throw new IllegalStateException();
        }
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = sb3.a;
        throw th;
    }

    public kq2(FileOutputStream fileOutputStream, int i) {
        super(fileOutputStream, i);
    }
}
