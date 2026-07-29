package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;

/* renamed from: o.c20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815c20 extends AbstractC0533Ul {
    public static final CH e;
    public final CH b;
    public final AbstractC0533Ul c;
    public final LinkedHashMap d;

    static {
        String str = CH.i;
        e = C0218Ih.r("/", false);
    }

    public C0815c20(CH ch, AbstractC0533Ul abstractC0533Ul, LinkedHashMap linkedHashMap) {
        this.b = ch;
        this.c = abstractC0533Ul;
        this.d = linkedHashMap;
    }

    @Override // o.AbstractC0533Ul
    public final void a(CH ch, CH ch2) {
        AbstractC0048Bt.n(ch2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.AbstractC0533Ul
    public final void b(CH ch) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.AbstractC0533Ul
    public final void c(CH ch) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.AbstractC0533Ul
    public final C0507Tl e(CH ch) {
        C0507Tl c0507Tl;
        Throwable th;
        AbstractC0048Bt.n(ch, "path");
        CH ch2 = e;
        ch2.getClass();
        C0750b20 c0750b20 = (C0750b20) this.d.get(AbstractC0809c.b(ch2, ch, true));
        Throwable th2 = null;
        if (c0750b20 == null) {
            return null;
        }
        long j = c0750b20.g;
        boolean z = c0750b20.b;
        C0507Tl c0507Tl2 = new C0507Tl(!z, z, z ? null : Long.valueOf(c0750b20.d), null, c0750b20.f, null);
        if (j == -1) {
            return c0507Tl2;
        }
        C0935dv f = this.c.f(this.b);
        try {
            JL h = AbstractC0946e20.h(f.c(j));
            try {
                c0507Tl = AbstractC0773bP.f(h, c0507Tl2);
                AbstractC0048Bt.k(c0507Tl);
                try {
                    h.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    h.close();
                } catch (Throwable th5) {
                    AbstractC0946e20.e(th4, th5);
                }
                th = th4;
                c0507Tl = null;
            }
        } catch (Throwable th6) {
            if (f != null) {
                try {
                    f.close();
                } catch (Throwable th7) {
                    AbstractC0946e20.e(th6, th7);
                }
            }
            c0507Tl = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        AbstractC0048Bt.k(c0507Tl);
        try {
            f.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 != null) {
            throw th2;
        }
        AbstractC0048Bt.k(c0507Tl);
        return c0507Tl;
    }

    @Override // o.AbstractC0533Ul
    public final C0935dv f(CH ch) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // o.AbstractC0533Ul
    public final C0935dv g(CH ch) {
        AbstractC0048Bt.n(ch, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // o.AbstractC0533Ul
    public final HS h(CH ch) {
        Throwable th;
        JL jl;
        AbstractC0048Bt.n(ch, "file");
        CH ch2 = e;
        ch2.getClass();
        C0750b20 c0750b20 = (C0750b20) this.d.get(AbstractC0809c.b(ch2, ch, true));
        if (c0750b20 == null) {
            throw new FileNotFoundException("no such file: " + ch);
        }
        long j = c0750b20.d;
        C0935dv f = this.c.f(this.b);
        try {
            jl = AbstractC0946e20.h(f.c(c0750b20.g));
            try {
                f.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (f != null) {
                try {
                    f.close();
                } catch (Throwable th4) {
                    AbstractC0946e20.e(th3, th4);
                }
            }
            th = th3;
            jl = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC0048Bt.k(jl);
        AbstractC0773bP.f(jl, null);
        if (c0750b20.e == 0) {
            return new C1320jm(jl, j, true);
        }
        return new C1320jm(new C0203Hs(AbstractC0946e20.h(new C1320jm(jl, c0750b20.c, true)), new Inflater(true)), j, false);
    }
}
