package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class a0 extends px0 {
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;

    public a0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.k = atomicReferenceFieldUpdater;
        this.l = atomicReferenceFieldUpdater2;
        this.m = atomicReferenceFieldUpdater3;
        this.n = atomicReferenceFieldUpdater4;
        this.o = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.px0
    public final void O(c0 c0Var, c0 c0Var2) {
        this.l.lazySet(c0Var, c0Var2);
    }

    @Override // defpackage.px0
    public final void P(c0 c0Var, Thread thread) {
        this.k.lazySet(c0Var, thread);
    }

    @Override // defpackage.px0
    public final boolean m(d0 d0Var, z zVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(d0Var, zVar, z.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(d0Var) == zVar);
        return false;
    }

    @Override // defpackage.px0
    public final boolean n(d0 d0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(d0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(d0Var) == obj);
        return false;
    }

    @Override // defpackage.px0
    public final boolean o(d0 d0Var, c0 c0Var, c0 c0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(d0Var, c0Var, c0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(d0Var) == c0Var);
        return false;
    }
}
