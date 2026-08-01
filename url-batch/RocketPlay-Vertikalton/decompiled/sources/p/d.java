package p;

import c1.AbstractC0104b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC0104b {
    public final AtomicReferenceFieldUpdater d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3726e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3727f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3728g;
    public final AtomicReferenceFieldUpdater h;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.d = atomicReferenceFieldUpdater;
        this.f3726e = atomicReferenceFieldUpdater2;
        this.f3727f = atomicReferenceFieldUpdater3;
        this.f3728g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // c1.AbstractC0104b
    public final boolean b(g gVar, C0311c c0311c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0311c c0311c2 = C0311c.f3724b;
        do {
            atomicReferenceFieldUpdater = this.f3728g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0311c, c0311c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0311c);
        return false;
    }

    @Override // c1.AbstractC0104b
    public final boolean c(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // c1.AbstractC0104b
    public final boolean d(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3727f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // c1.AbstractC0104b
    public final void u(f fVar, f fVar2) {
        this.f3726e.lazySet(fVar, fVar2);
    }

    @Override // c1.AbstractC0104b
    public final void v(f fVar, Thread thread) {
        this.d.lazySet(fVar, thread);
    }
}
