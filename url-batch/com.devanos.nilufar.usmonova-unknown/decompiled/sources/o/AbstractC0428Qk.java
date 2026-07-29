package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: o.Qk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0428Qk extends AbstractC0454Rk implements InterfaceC0658Zg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(AbstractC0428Qk.class, Object.class, "_queue$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91o = AtomicReferenceFieldUpdater.newUpdater(AbstractC0428Qk.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(AbstractC0428Qk.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // o.AbstractC0267Ke
    public final void L(InterfaceC0189He interfaceC0189He, Runnable runnable) {
        V(runnable);
    }

    @Override // o.AbstractC0454Rk
    public final long S() {
        Runnable runnable;
        AbstractRunnableC0376Ok abstractRunnableC0376Ok;
        C0457Rn c0457Rn = AbstractC0946e20.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (!T()) {
            W();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof C0693aB)) {
                    if (obj != c0457Rn) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                C0693aB c0693aB = (C0693aB) obj;
                Object d = c0693aB.d();
                if (d != C0693aB.g) {
                    runnable = (Runnable) d;
                    break;
                }
                C0693aB c = c0693aB.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            D6 d6 = this.l;
            if (((d6 == null || d6.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C0693aB) {
                        long j = C0693aB.f.get((C0693aB) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c0457Rn) {
                        return Long.MAX_VALUE;
                    }
                }
                C0402Pk c0402Pk = (C0402Pk) f91o.get(this);
                if (c0402Pk != null) {
                    synchronized (c0402Pk) {
                        AbstractRunnableC0376Ok[] abstractRunnableC0376OkArr = c0402Pk.a;
                        abstractRunnableC0376Ok = abstractRunnableC0376OkArr != null ? abstractRunnableC0376OkArr[0] : null;
                    }
                    if (abstractRunnableC0376Ok != null) {
                        long nanoTime = abstractRunnableC0376Ok.h - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void V(Runnable runnable) {
        W();
        if (!X(runnable)) {
            RunnableC2105vg.q.V(runnable);
            return;
        }
        Thread Q = Q();
        if (Thread.currentThread() != Q) {
            LockSupport.unpark(Q);
        }
    }

    public final void W() {
        AbstractRunnableC0376Ok abstractRunnableC0376Ok;
        C0402Pk c0402Pk = (C0402Pk) f91o.get(this);
        if (c0402Pk == null || GV.b.get(c0402Pk) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (c0402Pk) {
                try {
                    AbstractRunnableC0376Ok[] abstractRunnableC0376OkArr = c0402Pk.a;
                    AbstractRunnableC0376Ok abstractRunnableC0376Ok2 = abstractRunnableC0376OkArr != null ? abstractRunnableC0376OkArr[0] : null;
                    if (abstractRunnableC0376Ok2 != null) {
                        abstractRunnableC0376Ok = ((nanoTime - abstractRunnableC0376Ok2.h) > 0L ? 1 : ((nanoTime - abstractRunnableC0376Ok2.h) == 0L ? 0 : -1)) >= 0 ? X(abstractRunnableC0376Ok2) : false ? c0402Pk.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC0376Ok != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (p.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof C0693aB)) {
                        if (obj != AbstractC0946e20.d) {
                            C0693aB c0693aB = new C0693aB(8, true);
                            c0693aB.a((Runnable) obj);
                            c0693aB.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0693aB)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    C0693aB c0693aB2 = (C0693aB) obj;
                    int a = c0693aB2.a(runnable);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        C0693aB c = c0693aB2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((o.GV.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y() {
        D6 d6 = this.l;
        if (d6 != null ? d6.isEmpty() : true) {
            C0402Pk c0402Pk = (C0402Pk) f91o.get(this);
            if (c0402Pk != null) {
            }
            Object obj = n.get(this);
            if (obj != null) {
                if (obj instanceof C0693aB) {
                    long j = C0693aB.f.get((C0693aB) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == AbstractC0946e20.d) {
                }
            }
            return true;
        }
        return false;
    }

    public final void Z(long j, AbstractRunnableC0376Ok abstractRunnableC0376Ok) {
        int b;
        Thread Q;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91o;
        if (p.get(this) != 0) {
            b = 1;
        } else {
            C0402Pk c0402Pk = (C0402Pk) atomicReferenceFieldUpdater.get(this);
            if (c0402Pk == null) {
                C0402Pk c0402Pk2 = new C0402Pk();
                c0402Pk2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0402Pk2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC0048Bt.k(obj);
                c0402Pk = (C0402Pk) obj;
            }
            b = abstractRunnableC0376Ok.b(j, c0402Pk, this);
        }
        if (b != 0) {
            if (b == 1) {
                U(j, abstractRunnableC0376Ok);
                return;
            } else {
                if (b != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C0402Pk c0402Pk3 = (C0402Pk) atomicReferenceFieldUpdater.get(this);
        if (c0402Pk3 != null) {
            synchronized (c0402Pk3) {
                AbstractRunnableC0376Ok[] abstractRunnableC0376OkArr = c0402Pk3.a;
                r2 = abstractRunnableC0376OkArr != null ? abstractRunnableC0376OkArr[0] : null;
            }
        }
        if (r2 != abstractRunnableC0376Ok || Thread.currentThread() == (Q = Q())) {
            return;
        }
        LockSupport.unpark(Q);
    }

    @Override // o.InterfaceC0658Zg
    public InterfaceC0297Li m(long j, PV pv, InterfaceC0189He interfaceC0189He) {
        return AbstractC2171wg.a.m(j, pv, interfaceC0189He);
    }

    @Override // o.AbstractC0454Rk
    public void shutdown() {
        AbstractRunnableC0376Ok b;
        EV.a.set(null);
        p.set(this, 1);
        C0457Rn c0457Rn = AbstractC0946e20.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C0693aB)) {
                    if (obj != c0457Rn) {
                        C0693aB c0693aB = new C0693aB(8, true);
                        c0693aB.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0693aB)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C0693aB) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0457Rn)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (S() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            C0402Pk c0402Pk = (C0402Pk) f91o.get(this);
            if (c0402Pk == null) {
                return;
            }
            synchronized (c0402Pk) {
                b = GV.b.get(c0402Pk) > 0 ? c0402Pk.b(0) : null;
            }
            if (b == null) {
                return;
            } else {
                U(nanoTime, b);
            }
        }
    }

    @Override // o.InterfaceC0658Zg
    public final void x(long j, C0849ca c0849ca) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            C0324Mk c0324Mk = new C0324Mk(this, j2 + nanoTime, c0849ca);
            Z(nanoTime, c0324Mk);
            c0849ca.u(new Y9(2, c0324Mk));
        }
    }
}
