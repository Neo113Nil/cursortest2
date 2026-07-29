package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class XA {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(XA.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(XA.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(XA.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(XA xa, int i2) {
        while (true) {
            XA f = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            if (f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f = (XA) obj;
                    if (!f.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f);
                }
            }
            if (f instanceof C0954eA) {
                return (((C0954eA) f).k & i2) == 0 && f.e(xa, i2);
            }
            atomicReferenceFieldUpdater.set(xa, f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
            atomicReferenceFieldUpdater2.set(xa, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f, this, xa)) {
                if (atomicReferenceFieldUpdater2.get(f) != this) {
                    break;
                }
            }
            xa.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((o.C0902dN) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final XA f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            XA xa = (XA) atomicReferenceFieldUpdater.get(this);
            XA xa2 = xa;
            while (true) {
                XA xa3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    Object obj = atomicReferenceFieldUpdater2.get(xa2);
                    if (obj == this) {
                        if (xa == xa2) {
                            return xa2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, xa, xa2)) {
                            if (atomicReferenceFieldUpdater.get(this) != xa) {
                                break;
                            }
                        }
                        return xa2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof C0902dN)) {
                        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        xa3 = xa2;
                        xa2 = (XA) obj;
                    } else {
                        if (xa3 != null) {
                            break;
                        }
                        xa2 = (XA) atomicReferenceFieldUpdater.get(xa2);
                    }
                }
                xa2 = xa3;
            }
        }
    }

    public final void g(XA xa) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            XA xa2 = (XA) atomicReferenceFieldUpdater.get(xa);
            if (h.get(this) != xa) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(xa, xa2, this)) {
                if (atomicReferenceFieldUpdater.get(xa) != xa2) {
                    break;
                }
            }
            if (i()) {
                xa.f();
                return;
            }
            return;
        }
    }

    public final XA h() {
        XA xa;
        Object obj = h.get(this);
        C0902dN c0902dN = obj instanceof C0902dN ? (C0902dN) obj : null;
        if (c0902dN != null && (xa = c0902dN.a) != null) {
            return xa;
        }
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (XA) obj;
    }

    public boolean i() {
        return h.get(this) instanceof C0902dN;
    }

    public String toString() {
        return new WA(this, AbstractC1052fg.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC1052fg.B(this);
    }
}
