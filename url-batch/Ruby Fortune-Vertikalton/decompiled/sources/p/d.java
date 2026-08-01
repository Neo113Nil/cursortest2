package p;

import i1.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends s {

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3384f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3385g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3386j;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3384f = atomicReferenceFieldUpdater;
        this.f3385g = atomicReferenceFieldUpdater2;
        this.h = atomicReferenceFieldUpdater3;
        this.i = atomicReferenceFieldUpdater4;
        this.f3386j = atomicReferenceFieldUpdater5;
    }

    @Override // i1.s
    public final boolean c(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f3382b;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // i1.s
    public final boolean d(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3386j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // i1.s
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

    @Override // i1.s
    public final void p(f fVar, f fVar2) {
        this.f3385g.lazySet(fVar, fVar2);
    }

    @Override // i1.s
    public final void q(f fVar, Thread thread) {
        this.f3384f.lazySet(fVar, thread);
    }
}
