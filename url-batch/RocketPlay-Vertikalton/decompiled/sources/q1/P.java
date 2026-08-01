package q1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class P extends u1.i implements InterfaceC0359z, I, h1.l {
    public U d;

    @Override // q1.I
    public final boolean a() {
        return true;
    }

    @Override // q1.I
    public final V b() {
        return null;
    }

    @Override // q1.InterfaceC0359z
    public final void e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        U n2 = n();
        while (true) {
            Object u2 = n2.u();
            if (u2 instanceof P) {
                if (u2 != this) {
                    return;
                }
                A a2 = AbstractC0352s.h;
                do {
                    atomicReferenceFieldUpdater2 = U.f3882a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, u2, a2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == u2);
            } else {
                if (!(u2 instanceof I) || ((I) u2).b() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof u1.o) {
                        u1.i iVar = ((u1.o) k2).f4202a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    i1.f.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    u1.i iVar2 = (u1.i) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = u1.i.f4192c;
                    u1.o oVar = (u1.o) atomicReferenceFieldUpdater3.get(iVar2);
                    if (oVar == null) {
                        oVar = new u1.o(iVar2);
                        atomicReferenceFieldUpdater3.lazySet(iVar2, oVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = u1.i.f4190a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k2, oVar)) {
                            iVar2.i();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k2);
                }
            }
        }
    }

    public final U n() {
        U u2 = this.d;
        if (u2 != null) {
            return u2;
        }
        i1.f.h("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // u1.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0352s.c(this) + "[job@" + AbstractC0352s.c(n()) + ']';
    }
}
