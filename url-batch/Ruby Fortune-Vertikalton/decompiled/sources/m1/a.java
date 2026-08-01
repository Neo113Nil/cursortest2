package m1;

import i1.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements i1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3195a = new a();

    @Override // i1.n
    public final u a(n1.f fVar) {
        j jVar = fVar.f3305a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3233l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3232k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3231j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3230g;
        X0.e.b(fVar2);
        i1.p pVar = jVar.f3225a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3309f, fVar.f3310g, fVar.h, pVar.f2479f, !X0.e.a((String) fVar.f3308e.f212b, "GET")).j(pVar, fVar));
            jVar.i = eVar;
            jVar.f3235n = eVar;
            synchronized (jVar) {
                jVar.f3231j = true;
                jVar.f3232k = true;
            }
            if (jVar.f3234m) {
                throw new IOException("Canceled");
            }
            return n1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3308e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3257b);
            throw e3;
        }
    }
}
