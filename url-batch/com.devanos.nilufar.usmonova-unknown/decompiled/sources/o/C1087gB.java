package o;

import android.util.Log;
import java.io.Writer;

/* renamed from: o.gB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087gB extends Writer {
    public final StringBuilder i = new StringBuilder(128);
    public final String h = "FragmentManager";

    public final void b() {
        StringBuilder sb = this.i;
        if (sb.length() > 0) {
            Log.d(this.h, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                b();
            } else {
                this.i.append(c);
            }
        }
    }
}
