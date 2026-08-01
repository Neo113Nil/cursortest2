package m1;

import i1.q;
import i1.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements i1.o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3204a = new a();

    @Override // i1.o
    public final u a(n1.f fVar) {
        j jVar = fVar.f3293a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3242l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3241k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3240j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3239g;
        X0.d.b(fVar2);
        q qVar = jVar.f3234a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3297f, fVar.f3298g, fVar.h, qVar.f2492f, !X0.d.a((String) fVar.f3296e.f205b, "GET")).j(qVar, fVar));
            jVar.i = eVar;
            jVar.f3244n = eVar;
            synchronized (jVar) {
                jVar.f3240j = true;
                jVar.f3241k = true;
            }
            if (jVar.f3243m) {
                throw new IOException("Canceled");
            }
            return n1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3296e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3266b);
            throw e3;
        }
    }
}
