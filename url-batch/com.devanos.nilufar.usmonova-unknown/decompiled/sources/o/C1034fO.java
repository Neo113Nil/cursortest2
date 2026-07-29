package o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* renamed from: o.fO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034fO extends Reader {
    public final N8 h;
    public final Charset i;
    public boolean j;
    public InputStreamReader k;

    public C1034fO(N8 n8, Charset charset) {
        AbstractC0048Bt.n(n8, Constants.ScionAnalytics.PARAM_SOURCE);
        AbstractC0048Bt.n(charset, "charset");
        this.h = n8;
        this.i = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0782bY c0782bY;
        this.j = true;
        InputStreamReader inputStreamReader = this.k;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            c0782bY = C0782bY.a;
        } else {
            c0782bY = null;
        }
        if (c0782bY == null) {
            this.h.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        AbstractC0048Bt.n(cArr, "cbuf");
        if (this.j) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.k;
        if (inputStreamReader == null) {
            N8 n8 = this.h;
            inputStreamReader = new InputStreamReader(n8.J(), HY.q(n8, this.i));
            this.k = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
