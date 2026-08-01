package p;

import i1.s;

/* loaded from: classes.dex */
public final class e extends s {
    @Override // i1.s
    public final boolean c(g gVar, c cVar) {
        c cVar2 = c.f3388b;
        synchronized (gVar) {
            try {
                if (gVar.f3400b != cVar) {
                    return false;
                }
                gVar.f3400b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.s
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3399a != obj) {
                    return false;
                }
                gVar.f3399a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.s
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3401c != fVar) {
                    return false;
                }
                gVar.f3401c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.s
    public final void p(f fVar, f fVar2) {
        fVar.f3395b = fVar2;
    }

    @Override // i1.s
    public final void q(f fVar, Thread thread) {
        fVar.f3394a = thread;
    }
}
