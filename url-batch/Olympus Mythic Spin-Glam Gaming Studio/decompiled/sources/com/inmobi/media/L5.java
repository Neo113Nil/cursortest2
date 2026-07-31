package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes12.dex */
public final class L5 {
    public final M5 a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ P5 d;

    public L5(P5 p5, M5 m5) {
        this.d = p5;
        this.a = m5;
        this.b = m5.c ? null : new boolean[p5.h];
    }

    public final OutputStream a(int i) {
        FileOutputStream fileOutputStreamCtor;
        K5 k5;
        synchronized (this.d) {
            try {
                M5 m5 = this.a;
                if (m5.d != this) {
                    throw new IllegalStateException();
                }
                if (!m5.c) {
                    this.b[i] = true;
                }
                File b = m5.b(i);
                try {
                    fileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(b);
                } catch (FileNotFoundException unused) {
                    this.d.b.mkdirs();
                    try {
                        fileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(b);
                    } catch (FileNotFoundException unused2) {
                        return P5.q;
                    }
                }
                k5 = new K5(this, fileOutputStreamCtor);
            } catch (Throwable th) {
                throw th;
            }
        }
        return k5;
    }
}
