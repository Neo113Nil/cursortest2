package o;

import java.io.IOException;

/* renamed from: o.Wk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584Wk {
    public boolean a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public C0584Wk(NL nl, C0636Yk c0636Yk, InterfaceC0610Xk interfaceC0610Xk) {
        AbstractC0048Bt.n(c0636Yk, "finder");
        this.c = nl;
        this.d = c0636Yk;
        this.e = interfaceC0610Xk;
        this.f = interfaceC0610Xk.h();
    }

    public IOException a(boolean z, boolean z2, IOException iOException) {
        NL nl = (NL) this.c;
        if (iOException != null) {
            d(iOException);
        }
        return nl.f(this, z2, z, iOException);
    }

    public C0532Uk b(FN fn, boolean z) {
        this.a = z;
        JN jn = fn.d;
        AbstractC0048Bt.k(jn);
        long contentLength = jn.contentLength();
        return new C0532Uk(this, ((InterfaceC0610Xk) this.e).c(fn, contentLength), contentLength);
    }

    public C0903dO c(boolean z) {
        try {
            C0903dO g = ((InterfaceC0610Xk) this.e).g(z);
            if (g == null) {
                return g;
            }
            g.m = this;
            return g;
        } catch (IOException e) {
            d(e);
            throw e;
        }
    }

    public void d(IOException iOException) {
        this.b = true;
        ((C0636Yk) this.d).c(iOException);
        PL h = ((InterfaceC0610Xk) this.e).h();
        NL nl = (NL) this.c;
        synchronized (h) {
            try {
                if (!(iOException instanceof QT)) {
                    if (!(h.g != null) || (iOException instanceof C0188Hd)) {
                        h.j = true;
                        if (h.m == 0) {
                            PL.d(nl.h, h.b, iOException);
                            h.l++;
                        }
                    }
                } else if (((QT) iOException).h == 8) {
                    int i = h.n + 1;
                    h.n = i;
                    if (i > 1) {
                        h.j = true;
                        h.l++;
                    }
                } else if (((QT) iOException).h != 9 || !nl.u) {
                    h.j = true;
                    h.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0584Wk(AbstractActivityC0560Vm abstractActivityC0560Vm) {
        this.a = true;
        this.b = false;
        this.c = abstractActivityC0560Vm;
    }
}
