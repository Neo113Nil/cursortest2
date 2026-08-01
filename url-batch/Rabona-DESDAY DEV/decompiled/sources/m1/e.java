package m1;

import i1.t;
import i1.u;
import i1.v;
import java.io.IOException;
import p1.B;
import p1.C0285a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f3216a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3217b;

    /* renamed from: c, reason: collision with root package name */
    public final n1.d f3218c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3219e;

    public e(j jVar, f fVar, n1.d dVar) {
        X0.d.e(jVar, "call");
        X0.d.e(fVar, "finder");
        this.f3216a = jVar;
        this.f3217b = fVar;
        this.f3218c = dVar;
        this.f3219e = dVar.g();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f3216a;
        if (z3) {
            if (iOException != null) {
                X0.d.e(jVar, "call");
            } else {
                X0.d.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                X0.d.e(jVar, "call");
            } else {
                X0.d.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final v b(u uVar) {
        n1.d dVar = this.f3218c;
        try {
            u.e(uVar, "Content-Type");
            long h = dVar.h(uVar);
            return new v(h, new v1.p(new d(this, dVar.f(uVar), h)), 1);
        } catch (IOException e2) {
            X0.d.e(this.f3216a, "call");
            d(e2);
            throw e2;
        }
    }

    public final t c(boolean z2) {
        try {
            t e2 = this.f3218c.e(z2);
            if (e2 != null) {
                e2.f2524m = this;
            }
            return e2;
        } catch (IOException e3) {
            X0.d.e(this.f3216a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f3217b.c(iOException);
        m g2 = this.f3218c.g();
        j jVar = this.f3216a;
        synchronized (g2) {
            try {
                X0.d.e(jVar, "call");
                if (!(iOException instanceof B)) {
                    if (!(g2.f3250g != null) || (iOException instanceof C0285a)) {
                        g2.f3251j = true;
                        if (g2.f3254m == 0) {
                            m.d(jVar.f3231a, g2.f3246b, iOException);
                            g2.f3253l++;
                        }
                    }
                } else if (((B) iOException).f3404a == 8) {
                    int i = g2.f3255n + 1;
                    g2.f3255n = i;
                    if (i > 1) {
                        g2.f3251j = true;
                        g2.f3253l++;
                    }
                } else if (((B) iOException).f3404a != 9 || !jVar.f3240m) {
                    g2.f3251j = true;
                    g2.f3253l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
