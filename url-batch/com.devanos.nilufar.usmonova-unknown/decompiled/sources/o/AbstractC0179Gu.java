package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.Gu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0179Gu extends XA implements InterfaceC0297Li, InterfaceC2249xs {
    public C0283Ku k;

    @Override // o.InterfaceC0297Li
    public final void a() {
        C0283Ku j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0283Ku.h;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof AbstractC0179Gu) {
                if (obj != this) {
                    return;
                }
                C0794bk c0794bk = EB.n;
                while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, c0794bk)) {
                    if (atomicReferenceFieldUpdater.get(j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC2249xs) || ((InterfaceC2249xs) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = XA.h;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C0902dN) {
                    XA xa = ((C0902dN) obj2).a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                XA xa2 = (XA) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = XA.j;
                C0902dN c0902dN = (C0902dN) atomicReferenceFieldUpdater3.get(xa2);
                if (c0902dN == null) {
                    c0902dN = new C0902dN(xa2);
                    atomicReferenceFieldUpdater3.set(xa2, c0902dN);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c0902dN)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                xa2.f();
                return;
            }
        }
    }

    @Override // o.InterfaceC2249xs
    public final boolean b() {
        return true;
    }

    @Override // o.InterfaceC2249xs
    public final OE d() {
        return null;
    }

    public InterfaceC0075Cu getParent() {
        return j();
    }

    public final C0283Ku j() {
        C0283Ku c0283Ku = this.k;
        if (c0283Ku != null) {
            return c0283Ku;
        }
        AbstractC0048Bt.i0("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // o.XA
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1052fg.B(this) + "[job@" + AbstractC1052fg.B(j()) + ']';
    }
}
