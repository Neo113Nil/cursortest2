package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class SN extends AbstractC0533Ul {
    public static final CH e;
    public final ClassLoader b;
    public final AbstractC0533Ul c;
    public final BU d;

    static {
        String str = CH.i;
        e = C0218Ih.r("/", false);
    }

    public SN(ClassLoader classLoader) {
        C0232Iv c0232Iv = AbstractC0533Ul.a;
        AbstractC0048Bt.n(c0232Iv, "systemFileSystem");
        this.b = classLoader;
        this.c = c0232Iv;
        this.d = EB.D(new LE(6, this));
    }

    @Override // o.AbstractC0533Ul
    public final void a(CH ch, CH ch2) {
        AbstractC0048Bt.n(ch2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // o.AbstractC0533Ul
    public final void b(CH ch) {
        throw new IOException(this + " is read-only");
    }

    @Override // o.AbstractC0533Ul
    public final void c(CH ch) {
        throw new IOException(this + " is read-only");
    }

    @Override // o.AbstractC0533Ul
    public final C0507Tl e(CH ch) {
        AbstractC0048Bt.n(ch, "path");
        if (!C0140Fh.q(ch)) {
            return null;
        }
        CH ch2 = e;
        ch2.getClass();
        String o2 = AbstractC0809c.b(ch2, ch, true).d(ch2).h.o();
        for (C1619oH c1619oH : (List) this.d.getValue()) {
            C0507Tl e2 = ((AbstractC0533Ul) c1619oH.h).e(((CH) c1619oH.i).e(o2));
            if (e2 != null) {
                return e2;
            }
        }
        return null;
    }

    @Override // o.AbstractC0533Ul
    public final C0935dv f(CH ch) {
        if (!C0140Fh.q(ch)) {
            throw new FileNotFoundException("file not found: " + ch);
        }
        CH ch2 = e;
        ch2.getClass();
        String o2 = AbstractC0809c.b(ch2, ch, true).d(ch2).h.o();
        for (C1619oH c1619oH : (List) this.d.getValue()) {
            try {
                return ((AbstractC0533Ul) c1619oH.h).f(((CH) c1619oH.i).e(o2));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + ch);
    }

    @Override // o.AbstractC0533Ul
    public final C0935dv g(CH ch) {
        AbstractC0048Bt.n(ch, "file");
        throw new IOException("resources are not writable");
    }

    @Override // o.AbstractC0533Ul
    public final HS h(CH ch) {
        AbstractC0048Bt.n(ch, "file");
        if (!C0140Fh.q(ch)) {
            throw new FileNotFoundException("file not found: " + ch);
        }
        CH ch2 = e;
        ch2.getClass();
        InputStream resourceAsStream = this.b.getResourceAsStream(AbstractC0809c.b(ch2, ch, false).d(ch2).h.o());
        if (resourceAsStream != null) {
            Logger logger = OF.a;
            return new W6(resourceAsStream, 1, new NV());
        }
        throw new FileNotFoundException("file not found: " + ch);
    }
}
