package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ei {
    public final tx a;
    public final gi b;
    public final fi c;
    public boolean d;
    public final wx e;

    public ei(tx txVar, gi giVar, fi fiVar) {
        giVar.getClass();
        this.a = txVar;
        this.b = giVar;
        this.c = fiVar;
        this.e = fiVar.g();
    }

    public final yz a(boolean z) {
        try {
            yz f = this.c.f(z);
            if (f == null) {
                return f;
            }
            f.m = this;
            return f;
        } catch (IOException e) {
            b(e);
            throw e;
        }
    }

    public final void b(IOException iOException) {
        this.d = true;
        this.b.b(iOException);
        wx g = this.c.g();
        tx txVar = this.a;
        synchronized (g) {
            try {
                if (!(iOException instanceof l30)) {
                    if (!(g.g != null) || (iOException instanceof ub)) {
                        g.j = true;
                        if (g.m == 0) {
                            wx.d(txVar.f, g.b, iOException);
                            g.l++;
                        }
                    }
                } else if (((l30) iOException).f == 8) {
                    int i = g.n + 1;
                    g.n = i;
                    if (i > 1) {
                        g.j = true;
                        g.l++;
                    }
                } else if (((l30) iOException).f != 9 || !txVar.r) {
                    g.j = true;
                    g.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
