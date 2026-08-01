package B1;

import java.io.IOException;
import x1.s;

/* loaded from: classes.dex */
public final class a implements x1.m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f159a = new a();

    @Override // x1.m
    public final s a(C1.g gVar) {
        j jVar = gVar.f253a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f197l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f196k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f195j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar = jVar.f194g;
        i1.f.b(fVar);
        x1.p pVar = jVar.f189a;
        try {
            e eVar = new e(jVar, fVar, fVar.a(gVar.f257f, gVar.f258g, gVar.h, pVar.f4566f, !i1.f.a((String) gVar.f256e.f546b, "GET")).j(pVar, gVar));
            jVar.i = eVar;
            jVar.f199n = eVar;
            synchronized (jVar) {
                jVar.f195j = true;
                jVar.f196k = true;
            }
            if (jVar.f198m) {
                throw new IOException("Canceled");
            }
            return C1.g.a(gVar, 0, eVar, null, 61).b(gVar.f256e);
        } catch (o e2) {
            fVar.c(e2.f221b);
            throw e2;
        } catch (IOException e3) {
            fVar.c(e3);
            throw new o(e3);
        }
    }
}
