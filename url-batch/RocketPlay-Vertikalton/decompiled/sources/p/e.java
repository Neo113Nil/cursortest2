package p;

import c1.AbstractC0104b;

/* loaded from: classes.dex */
public final class e extends AbstractC0104b {
    @Override // c1.AbstractC0104b
    public final boolean b(g gVar, C0311c c0311c) {
        C0311c c0311c2 = C0311c.f3724b;
        synchronized (gVar) {
            try {
                if (gVar.f3736b != c0311c) {
                    return false;
                }
                gVar.f3736b = c0311c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c1.AbstractC0104b
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3735a != obj) {
                    return false;
                }
                gVar.f3735a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c1.AbstractC0104b
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3737c != fVar) {
                    return false;
                }
                gVar.f3737c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c1.AbstractC0104b
    public final void u(f fVar, f fVar2) {
        fVar.f3731b = fVar2;
    }

    @Override // c1.AbstractC0104b
    public final void v(f fVar, Thread thread) {
        fVar.f3730a = thread;
    }
}
