package p;

import i1.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends k {

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3365f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3366g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3367j;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3365f = atomicReferenceFieldUpdater;
        this.f3366g = atomicReferenceFieldUpdater2;
        this.h = atomicReferenceFieldUpdater3;
        this.i = atomicReferenceFieldUpdater4;
        this.f3367j = atomicReferenceFieldUpdater5;
    }

    @Override // i1.k
    public final boolean c(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f3363b;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // i1.k
    public final boolean d(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3367j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // i1.k
    public final boolean e(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // i1.k
    public final void s(f fVar, f fVar2) {
        this.f3366g.lazySet(fVar, fVar2);
    }

    @Override // i1.k
    public final void t(f fVar, Thread thread) {
        this.f3365f.lazySet(fVar, thread);
    }
}
