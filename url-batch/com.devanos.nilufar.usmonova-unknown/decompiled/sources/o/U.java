package o;

/* loaded from: classes.dex */
public final class U extends M {
    @Override // o.M
    public final boolean a(W w, Q q, Q q2) {
        synchronized (w) {
            try {
                if (w.listeners != q) {
                    return false;
                }
                w.listeners = q2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.M
    public final boolean b(W w, Object obj, Object obj2) {
        synchronized (w) {
            try {
                if (w.value != obj) {
                    return false;
                }
                w.value = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.M
    public final boolean c(W w, V v, V v2) {
        synchronized (w) {
            try {
                if (w.waiters != v) {
                    return false;
                }
                w.waiters = v2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.M
    public final void d(V v, V v2) {
        v.b = v2;
    }

    @Override // o.M
    public final void e(V v, Thread thread) {
        v.a = thread;
    }
}
