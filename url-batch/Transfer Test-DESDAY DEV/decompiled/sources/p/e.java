package p;

/* loaded from: classes.dex */
public final class e extends h0.f {
    @Override // h0.f
    public final boolean a(g gVar, C0311c c0311c) {
        C0311c c0311c2 = C0311c.f3350b;
        synchronized (gVar) {
            try {
                if (gVar.f3362b != c0311c) {
                    return false;
                }
                gVar.f3362b = c0311c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.f
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3361a != obj) {
                    return false;
                }
                gVar.f3361a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.f
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3363c != fVar) {
                    return false;
                }
                gVar.f3363c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.f
    public final void i(f fVar, f fVar2) {
        fVar.f3357b = fVar2;
    }

    @Override // h0.f
    public final void j(f fVar, Thread thread) {
        fVar.f3356a = thread;
    }
}
