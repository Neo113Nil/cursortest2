package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class S extends M {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public S(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // o.M
    public final boolean a(W w, Q q, Q q2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(w, q, q2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w) == q);
        return false;
    }

    @Override // o.M
    public final boolean b(W w, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(w, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w) == obj);
        return false;
    }

    @Override // o.M
    public final boolean c(W w, V v, V v2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(w, v, v2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w) == v);
        return false;
    }

    @Override // o.M
    public final void d(V v, V v2) {
        this.b.lazySet(v, v2);
    }

    @Override // o.M
    public final void e(V v, Thread thread) {
        this.a.lazySet(v, thread);
    }
}
