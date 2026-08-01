package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class u70 extends dq0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(u70.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = px0.e;

    public final Object c(lj ljVar) {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = dq0.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                ky0 ky0Var = ky0.a;
                if (i2 <= 0) {
                    hc E = mz.E(d31.B(ljVar));
                    try {
                        a(new t70(this, E));
                        Object p = E.p();
                        ck ckVar = ck.d;
                        if (p != ckVar) {
                            p = ky0Var;
                        }
                        return p == ckVar ? p : ky0Var;
                    } catch (Throwable th) {
                        E.y();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    g.set(this, null);
                    return ky0Var;
                }
            }
        }
    }

    public final void d(Object obj) {
        while (Math.max(dq0.f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            op opVar = px0.e;
            if (obj2 != opVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, opVar)) {
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
        g8.s("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(nk.u(this));
        sb.append("[isLocked=");
        sb.append(Math.max(dq0.f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
