package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public final class p extends BufferedOutputStream {
    public boolean a;

    public p(b bVar) {
        super(bVar);
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
        int i = z.a;
        throw th;
    }

    public p(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
