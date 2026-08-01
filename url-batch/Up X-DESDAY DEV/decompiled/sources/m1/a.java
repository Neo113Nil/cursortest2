package m1;

import i1.t;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements i1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3179a = new a();

    @Override // i1.n
    public final t a(n1.f fVar) {
        j jVar = fVar.f3289a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3217l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3216k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3215j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3214g;
        X0.e.b(fVar2);
        i1.o oVar = jVar.f3209a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3293f, fVar.f3294g, fVar.h, oVar.f2464f, !X0.e.a((String) fVar.f3292e.f212b, "GET")).j(oVar, fVar));
            jVar.i = eVar;
            jVar.f3219n = eVar;
            synchronized (jVar) {
                jVar.f3215j = true;
                jVar.f3216k = true;
            }
            if (jVar.f3218m) {
                throw new IOException("Canceled");
            }
            return n1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3292e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3241b);
            throw e3;
        }
    }
}
