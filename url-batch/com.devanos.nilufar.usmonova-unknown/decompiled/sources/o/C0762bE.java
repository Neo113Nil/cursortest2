package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.bE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762bE extends IQ implements ZD {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(C0762bE.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = AbstractC1807r8.d;

    public final Object c(AbstractC2367ze abstractC2367ze) {
        boolean d = d();
        C0782bY c0782bY = C0782bY.a;
        if (!d) {
            C0849ca G = AbstractC1807r8.G(AbstractC1473m3.L(abstractC2367ze));
            try {
                a(new C0696aE(this, G));
                Object q = G.q();
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                if (q != enumC0448Re) {
                    q = c0782bY;
                }
                if (q == enumC0448Re) {
                    return q;
                }
            } catch (Throwable th) {
                G.y();
                throw th;
            }
        }
        return c0782bY;
    }

    public final boolean d() {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = IQ.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    g.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        if (c != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(IQ.f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0457Rn c0457Rn = AbstractC1807r8.d;
            if (obj2 != c0457Rn) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0457Rn)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC1052fg.B(this));
        sb.append("[isLocked=");
        sb.append(Math.max(IQ.f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
