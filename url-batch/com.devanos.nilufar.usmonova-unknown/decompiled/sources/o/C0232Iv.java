package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;

/* renamed from: o.Iv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0232Iv extends AbstractC0533Ul {
    @Override // o.AbstractC0533Ul
    public void a(CH ch, CH ch2) {
        AbstractC0048Bt.n(ch2, "target");
        if (ch.toFile().renameTo(ch2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + ch + " to " + ch2);
    }

    @Override // o.AbstractC0533Ul
    public final void b(CH ch) {
        if (ch.toFile().mkdir()) {
            return;
        }
        C0507Tl e = e(ch);
        if (e == null || !e.b) {
            throw new IOException("failed to create directory: " + ch);
        }
    }

    @Override // o.AbstractC0533Ul
    public final void c(CH ch) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = ch.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + ch);
    }

    @Override // o.AbstractC0533Ul
    public C0507Tl e(CH ch) {
        AbstractC0048Bt.n(ch, "path");
        File file = ch.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new C0507Tl(isFile, isDirectory, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // o.AbstractC0533Ul
    public final C0935dv f(CH ch) {
        return new C0935dv(false, new RandomAccessFile(ch.toFile(), "r"));
    }

    @Override // o.AbstractC0533Ul
    public final C0935dv g(CH ch) {
        AbstractC0048Bt.n(ch, "file");
        return new C0935dv(true, new RandomAccessFile(ch.toFile(), "rw"));
    }

    @Override // o.AbstractC0533Ul
    public final HS h(CH ch) {
        AbstractC0048Bt.n(ch, "file");
        File file = ch.toFile();
        Logger logger = OF.a;
        return new W6(new FileInputStream(file), 1, NV.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
