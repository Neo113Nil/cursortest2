package B1;

import E1.C0000a;
import E1.E;
import java.io.IOException;
import x1.r;
import x1.s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f174a;

    /* renamed from: b, reason: collision with root package name */
    public final f f175b;

    /* renamed from: c, reason: collision with root package name */
    public final C1.e f176c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m f177e;

    public e(j jVar, f fVar, C1.e eVar) {
        i1.f.e(jVar, "call");
        i1.f.e(fVar, "finder");
        this.f174a = jVar;
        this.f175b = fVar;
        this.f176c = eVar;
        this.f177e = eVar.g();
    }

    public final IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        j jVar = this.f174a;
        if (z3) {
            if (iOException != null) {
                i1.f.e(jVar, "call");
            } else {
                i1.f.e(jVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                i1.f.e(jVar, "call");
            } else {
                i1.f.e(jVar, "call");
            }
        }
        return jVar.g(this, z3, z2, iOException);
    }

    public final C1.h b(s sVar) {
        C1.e eVar = this.f176c;
        try {
            String a2 = s.a("Content-Type", sVar);
            long d = eVar.d(sVar);
            return new C1.h(a2, d, new K1.p(new d(this, eVar.h(sVar), d)), 0);
        } catch (IOException e2) {
            i1.f.e(this.f174a, "call");
            d(e2);
            throw e2;
        }
    }

    public final r c(boolean z2) {
        try {
            r f2 = this.f176c.f(z2);
            if (f2 != null) {
                f2.f4599m = this;
            }
            return f2;
        } catch (IOException e2) {
            i1.f.e(this.f174a, "call");
            d(e2);
            throw e2;
        }
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.f175b.c(iOException);
        m g2 = this.f176c.g();
        j jVar = this.f174a;
        synchronized (g2) {
            try {
                i1.f.e(jVar, "call");
                if (!(iOException instanceof E)) {
                    if (!(g2.f208g != null) || (iOException instanceof C0000a)) {
                        g2.f209j = true;
                        if (g2.f212m == 0) {
                            m.d(jVar.f189a, g2.f204b, iOException);
                            g2.f211l++;
                        }
                    }
                } else if (((E) iOException).f290a == 8) {
                    int i = g2.f213n + 1;
                    g2.f213n = i;
                    if (i > 1) {
                        g2.f209j = true;
                        g2.f211l++;
                    }
                } else if (((E) iOException).f290a != 9 || !jVar.f198m) {
                    g2.f209j = true;
                    g2.f211l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
