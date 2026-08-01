package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class r extends g8 {
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;

    public r(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.k = atomicReferenceFieldUpdater;
        this.l = atomicReferenceFieldUpdater2;
        this.m = atomicReferenceFieldUpdater3;
        this.n = atomicReferenceFieldUpdater4;
        this.o = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.g8
    public final void a0(t tVar, t tVar2) {
        this.l.lazySet(tVar, tVar2);
    }

    @Override // defpackage.g8
    public final void b0(t tVar, Thread thread) {
        this.k.lazySet(tVar, thread);
    }

    @Override // defpackage.g8
    public final boolean j(u uVar, q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(uVar, qVar, q.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(uVar) == qVar);
        return false;
    }

    @Override // defpackage.g8
    public final boolean k(u uVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(uVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(uVar) == obj);
        return false;
    }

    @Override // defpackage.g8
    public final boolean l(u uVar, t tVar, t tVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(uVar, tVar, tVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(uVar) == tVar);
        return false;
    }
}
