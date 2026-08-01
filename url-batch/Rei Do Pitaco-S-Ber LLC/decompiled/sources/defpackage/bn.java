package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class bn implements fi {
    public final fv a;
    public final wx b;
    public final o8 c;
    public final n8 d;
    public int e;
    public final u9 f;
    public nm g;

    public bn(fv fvVar, wx wxVar, px pxVar, ox oxVar) {
        pxVar.getClass();
        oxVar.getClass();
        this.a = fvVar;
        this.b = wxVar;
        this.c = pxVar;
        this.d = oxVar;
        this.f = new u9(pxVar);
    }

    @Override // defpackage.fi
    public final void a(po poVar) {
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) poVar.c);
        sb.append(' ');
        xn xnVar = (xn) poVar.b;
        if (xnVar.i || type != Proxy.Type.HTTP) {
            String b = xnVar.b();
            String d = xnVar.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(xnVar);
        }
        sb.append(" HTTP/1.1");
        i((nm) poVar.d, sb.toString());
    }

    @Override // defpackage.fi
    public final p20 b(zz zzVar) {
        if (!vn.a(zzVar)) {
            return h(0L);
        }
        if ("chunked".equalsIgnoreCase(zz.m(zzVar, "Transfer-Encoding"))) {
            xn xnVar = (xn) zzVar.f.b;
            if (this.e == 4) {
                this.e = 5;
                return new ym(this, xnVar);
            }
            l8.m("state: ", this.e);
            return null;
        }
        long h = z60.h(zzVar);
        if (h != -1) {
            return h(h);
        }
        if (this.e != 4) {
            l8.m("state: ", this.e);
            return null;
        }
        this.e = 5;
        this.b.k();
        return new an(this);
    }

    @Override // defpackage.fi
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.fi
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            z60.c(socket);
        }
    }

    @Override // defpackage.fi
    public final void d() {
        this.d.flush();
    }

    @Override // defpackage.fi
    public final long e(zz zzVar) {
        if (!vn.a(zzVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(zz.m(zzVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return z60.h(zzVar);
    }

    @Override // defpackage.fi
    public final yz f(boolean z) {
        u9 u9Var = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            l8.m("state: ", this.e);
            return null;
        }
        try {
            String f = ((o8) u9Var.c).f(u9Var.b);
            u9Var.b -= f.length();
            k4 E = oo.E(f);
            int i2 = E.b;
            yz yzVar = new yz();
            yzVar.b = (bx) E.c;
            yzVar.c = i2;
            yzVar.d = (String) E.d;
            yzVar.f = u9Var.f().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return yzVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return yzVar;
            }
            this.e = 3;
            return yzVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.h.f()), e);
        }
    }

    @Override // defpackage.fi
    public final wx g() {
        return this.b;
    }

    public final zm h(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new zm(this, j);
        }
        l8.m("state: ", this.e);
        return null;
    }

    public final void i(nm nmVar, String str) {
        if (this.e != 0) {
            l8.m("state: ", this.e);
            return;
        }
        n8 n8Var = this.d;
        n8Var.i(str).i("\r\n");
        int size = nmVar.size();
        for (int i = 0; i < size; i++) {
            n8Var.i(nmVar.b(i)).i(": ").i(nmVar.d(i)).i("\r\n");
        }
        n8Var.i("\r\n");
        this.e = 1;
    }
}
