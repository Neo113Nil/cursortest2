package o1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class S extends s1.i implements A, L, f1.l {
    public W d;

    @Override // o1.L
    public final boolean a() {
        return true;
    }

    @Override // o1.L
    public final X b() {
        return null;
    }

    @Override // o1.A
    public final void e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        W n2 = n();
        while (true) {
            Object w2 = n2.w();
            if (w2 instanceof S) {
                if (w2 != this) {
                    return;
                }
                B b2 = AbstractC0302t.i;
                do {
                    atomicReferenceFieldUpdater2 = W.f3301a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, w2, b2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == w2);
            } else {
                if (!(w2 instanceof L) || ((L) w2).b() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof s1.o) {
                        s1.i iVar = ((s1.o) k2).f3715a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    g1.f.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    s1.i iVar2 = (s1.i) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = s1.i.f3705c;
                    s1.o oVar = (s1.o) atomicReferenceFieldUpdater3.get(iVar2);
                    if (oVar == null) {
                        oVar = new s1.o(iVar2);
                        atomicReferenceFieldUpdater3.lazySet(iVar2, oVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = s1.i.f3703a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k2, oVar)) {
                            iVar2.i();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k2);
                }
            }
        }
    }

    public final W n() {
        W w2 = this.d;
        if (w2 != null) {
            return w2;
        }
        g1.f.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // s1.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0302t.e(this) + "[job@" + AbstractC0302t.e(n()) + ']';
    }
}
