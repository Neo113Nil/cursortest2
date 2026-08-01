package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends h0.f {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3352g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3353j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3354k;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3352g = atomicReferenceFieldUpdater;
        this.h = atomicReferenceFieldUpdater2;
        this.i = atomicReferenceFieldUpdater3;
        this.f3353j = atomicReferenceFieldUpdater4;
        this.f3354k = atomicReferenceFieldUpdater5;
    }

    @Override // h0.f
    public final boolean a(g gVar, C0311c c0311c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0311c c0311c2 = C0311c.f3350b;
        do {
            atomicReferenceFieldUpdater = this.f3353j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0311c, c0311c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0311c);
        return false;
    }

    @Override // h0.f
    public final boolean b(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3354k;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // h0.f
    public final boolean c(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // h0.f
    public final void i(f fVar, f fVar2) {
        this.h.lazySet(fVar, fVar2);
    }

    @Override // h0.f
    public final void j(f fVar, Thread thread) {
        this.f3352g.lazySet(fVar, thread);
    }
}
