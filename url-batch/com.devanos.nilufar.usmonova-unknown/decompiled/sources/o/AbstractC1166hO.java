package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* renamed from: o.hO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1166hO implements Closeable {
    public static final C1100gO Companion = new C1100gO();
    private Reader reader;

    public static final AbstractC1166hO create(String str, NB nb) {
        Companion.getClass();
        return C1100gO.a(str, nb);
    }

    public final InputStream byteStream() {
        return source().J();
    }

    public final C1347k9 byteString() {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(AbstractC1888sN.i("Cannot buffer entire body for content length: ", contentLength));
        }
        N8 source = source();
        try {
            C1347k9 h = source.h();
            source.close();
            int b = h.b();
            if (contentLength == -1 || contentLength == b) {
                return h;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + b + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(AbstractC1888sN.i("Cannot buffer entire body for content length: ", contentLength));
        }
        N8 source = source();
        try {
            byte[] p = source.p();
            source.close();
            int length = p.length;
            if (contentLength == -1 || contentLength == length) {
                return p;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Charset charset;
        Reader reader = this.reader;
        if (reader == null) {
            N8 source = source();
            NB contentType = contentType();
            if (contentType == null || (charset = contentType.a(AbstractC0470Sa.a)) == null) {
                charset = AbstractC0470Sa.a;
            }
            reader = new C1034fO(source, charset);
            this.reader = reader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HY.c(source());
    }

    public abstract long contentLength();

    public abstract NB contentType();

    public abstract N8 source();

    public final String string() {
        Charset charset;
        N8 source = source();
        try {
            NB contentType = contentType();
            if (contentType == null || (charset = contentType.a(AbstractC0470Sa.a)) == null) {
                charset = AbstractC0470Sa.a;
            }
            String H = source.H(HY.q(source, charset));
            source.close();
            return H;
        } finally {
        }
    }

    public static final AbstractC1166hO create(N8 n8, NB nb, long j) {
        Companion.getClass();
        return C1100gO.b(n8, nb, j);
    }

    @InterfaceC1315jh
    public static final AbstractC1166hO create(NB nb, long j, N8 n8) {
        Companion.getClass();
        AbstractC0048Bt.n(n8, "content");
        return C1100gO.b(n8, nb, j);
    }

    @InterfaceC1315jh
    public static final AbstractC1166hO create(NB nb, String str) {
        Companion.getClass();
        AbstractC0048Bt.n(str, "content");
        return C1100gO.a(str, nb);
    }

    @InterfaceC1315jh
    public static final AbstractC1166hO create(NB nb, C1347k9 c1347k9) {
        Companion.getClass();
        AbstractC0048Bt.n(c1347k9, "content");
        G8 g8 = new G8();
        g8.M(c1347k9);
        return C1100gO.b(g8, nb, c1347k9.b());
    }

    @InterfaceC1315jh
    public static final AbstractC1166hO create(NB nb, byte[] bArr) {
        Companion.getClass();
        AbstractC0048Bt.n(bArr, "content");
        return C1100gO.c(bArr, nb);
    }

    public static final AbstractC1166hO create(byte[] bArr, NB nb) {
        Companion.getClass();
        return C1100gO.c(bArr, nb);
    }

    public static final AbstractC1166hO create(C1347k9 c1347k9, NB nb) {
        Companion.getClass();
        AbstractC0048Bt.n(c1347k9, "<this>");
        G8 g8 = new G8();
        g8.M(c1347k9);
        return C1100gO.b(g8, nb, c1347k9.b());
    }
}
