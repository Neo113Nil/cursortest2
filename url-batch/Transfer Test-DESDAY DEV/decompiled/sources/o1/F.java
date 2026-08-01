package o1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class F extends G implements InterfaceC0305w {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3281f = AtomicReferenceFieldUpdater.newUpdater(F.class, Object.class, "_queue");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3282g = AtomicReferenceFieldUpdater.newUpdater(F.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(F.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // o1.G
    public void G() {
        D b2;
        e0.f3312a.set(null);
        h.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3281f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            U.q qVar = AbstractC0302t.f3336b;
            if (obj != null) {
                if (!(obj instanceof s1.l)) {
                    if (obj != qVar) {
                        s1.l lVar = new s1.l(8, true);
                        lVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((s1.l) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, qVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (K() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            E e2 = (E) f3282g.get(this);
            if (e2 == null) {
                return;
            }
            synchronized (e2) {
                b2 = s1.t.f3720b.get(e2) > 0 ? e2.b(0) : null;
            }
            if (b2 == null) {
                return;
            } else {
                F(nanoTime, b2);
            }
        }
    }

    public void H(Runnable runnable) {
        if (!I(runnable)) {
            RunnableC0303u.i.H(runnable);
            return;
        }
        Thread C2 = C();
        if (Thread.currentThread() != C2) {
            LockSupport.unpark(C2);
        }
    }

    public final boolean I(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3281f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (h.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof s1.l)) {
                if (obj == AbstractC0302t.f3336b) {
                    return false;
                }
                s1.l lVar = new s1.l(8, true);
                lVar.a((Runnable) obj);
                lVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            s1.l lVar2 = (s1.l) obj;
            int a2 = lVar2.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                s1.l c2 = lVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final boolean J() {
        V0.c cVar = this.f3284e;
        if (!(cVar != null ? cVar.isEmpty() : true)) {
            return false;
        }
        E e2 = (E) f3282g.get(this);
        if (e2 != null && s1.t.f3720b.get(e2) != 0) {
            return false;
        }
        Object obj = f3281f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof s1.l) {
            long j2 = s1.l.f3709f.get((s1.l) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0302t.f3336b) {
            return true;
        }
        return false;
    }

    public final long K() {
        Runnable runnable;
        D d;
        D b2;
        if (E()) {
            return 0L;
        }
        E e2 = (E) f3282g.get(this);
        if (e2 != null && s1.t.f3720b.get(e2) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (e2) {
                    try {
                        D[] dArr = e2.f3721a;
                        D d2 = dArr != null ? dArr[0] : null;
                        if (d2 == null) {
                            b2 = null;
                        } else {
                            b2 = ((nanoTime - d2.f3278a) > 0L ? 1 : ((nanoTime - d2.f3278a) == 0L ? 0 : -1)) >= 0 ? I(d2) : false ? e2.b(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (b2 != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3281f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (!(obj instanceof s1.l)) {
                if (obj != AbstractC0302t.f3336b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop1;
                }
                break;
            }
            s1.l lVar = (s1.l) obj;
            Object d3 = lVar.d();
            if (d3 != s1.l.f3710g) {
                runnable = (Runnable) d3;
                break;
            }
            s1.l c2 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        V0.c cVar = this.f3284e;
        if (((cVar == null || cVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f3281f.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof s1.l)) {
                if (obj2 != AbstractC0302t.f3336b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = s1.l.f3709f.get((s1.l) obj2);
            if (!(((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30)))) {
                return 0L;
            }
        }
        E e3 = (E) f3282g.get(this);
        if (e3 != null) {
            synchronized (e3) {
                D[] dArr2 = e3.f3721a;
                d = dArr2 != null ? dArr2[0] : null;
            }
            if (d != null) {
                long nanoTime2 = d.f3278a - System.nanoTime();
                if (nanoTime2 < 0) {
                    return 0L;
                }
                return nanoTime2;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void L(long j2, D d) {
        int a2;
        Thread C2;
        boolean z2 = h.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3282g;
        if (z2) {
            a2 = 1;
        } else {
            E e2 = (E) atomicReferenceFieldUpdater.get(this);
            if (e2 == null) {
                E e3 = new E();
                e3.f3280c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, e3) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                g1.f.b(obj);
                e2 = (E) obj;
            }
            a2 = d.a(j2, e2, this);
        }
        if (a2 != 0) {
            if (a2 == 1) {
                F(j2, d);
                return;
            } else {
                if (a2 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        E e4 = (E) atomicReferenceFieldUpdater.get(this);
        if (e4 != null) {
            synchronized (e4) {
                D[] dArr = e4.f3721a;
                r4 = dArr != null ? dArr[0] : null;
            }
        }
        if (r4 != d || Thread.currentThread() == (C2 = C())) {
            return;
        }
        LockSupport.unpark(C2);
    }

    @Override // o1.InterfaceC0305w
    public final void v(C0288e c0288e) {
        long nanoTime = System.nanoTime();
        C c2 = new C(this, 1500000000 + nanoTime, c0288e);
        L(nanoTime, c2);
        c0288e.o(new C0287d(1, c2));
    }

    @Override // o1.AbstractC0299p
    public final void z(X0.i iVar, Runnable runnable) {
        H(runnable);
    }
}
