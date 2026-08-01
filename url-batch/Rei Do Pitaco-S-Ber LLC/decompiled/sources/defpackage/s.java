package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class s extends g8 {
    @Override // defpackage.g8
    public final void a0(t tVar, t tVar2) {
        tVar.b = tVar2;
    }

    @Override // defpackage.g8
    public final void b0(t tVar, Thread thread) {
        tVar.a = thread;
    }

    @Override // defpackage.g8
    public final boolean j(u uVar, q qVar) {
        q qVar2 = q.b;
        synchronized (uVar) {
            try {
                if (uVar.g != qVar) {
                    return false;
                }
                uVar.g = qVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g8
    public final boolean k(u uVar, Object obj, Object obj2) {
        synchronized (uVar) {
            try {
                if (uVar.f != obj) {
                    return false;
                }
                uVar.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g8
    public final boolean l(u uVar, t tVar, t tVar2) {
        synchronized (uVar) {
            try {
                if (uVar.h != tVar) {
                    return false;
                }
                uVar.h = tVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
