package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class tq extends pq implements ml {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(tq.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(tq.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(tq.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public abstract Thread A();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((defpackage.jw0.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B() {
        h8 h8Var = this.h;
        if (h8Var != null ? h8Var.isEmpty() : true) {
            sq sqVar = (sq) k.get(this);
            if (sqVar != null) {
            }
            Object obj = j.get(this);
            if (obj != null) {
                if (obj instanceof z30) {
                    long j2 = z30.f.get((z30) obj);
                    return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
                }
                if (obj == a50.g) {
                }
            }
            return true;
        }
        return false;
    }

    public void C(long j2, rq rqVar) {
        uk.m.D(j2, rqVar);
    }

    public final void D(long j2, rq rqVar) {
        int d;
        Thread A;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        if (l.get(this) != 0) {
            d = 1;
        } else {
            sq sqVar = (sq) atomicReferenceFieldUpdater.get(this);
            if (sqVar == null) {
                sq sqVar2 = new sq();
                sqVar2.c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, sqVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                sqVar = (sq) obj;
            }
            d = rqVar.d(j2, sqVar, this);
        }
        if (d != 0) {
            if (d == 1) {
                C(j2, rqVar);
                return;
            } else {
                if (d == 2) {
                    return;
                }
                g8.s("unexpected result");
                return;
            }
        }
        sq sqVar3 = (sq) atomicReferenceFieldUpdater.get(this);
        if (sqVar3 != null) {
            synchronized (sqVar3) {
                rq[] rqVarArr = sqVar3.a;
                r2 = rqVarArr != null ? rqVarArr[0] : null;
            }
        }
        if (r2 != rqVar || Thread.currentThread() == (A = A())) {
            return;
        }
        LockSupport.unpark(A);
    }

    @Override // defpackage.ml
    public final void c(long j2, hc hcVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            qq qqVar = new qq(this, j3 + nanoTime, hcVar);
            D(nanoTime, qqVar);
            hcVar.t(new dc(1, qqVar));
        }
    }

    @Override // defpackage.uj
    public final void d(rj rjVar, Runnable runnable) {
        x(runnable);
    }

    @Override // defpackage.pq
    public void shutdown() {
        rq c;
        hw0.a.set(null);
        l.set(this, 1);
        op opVar = a50.g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof z30)) {
                    if (obj != opVar) {
                        z30 z30Var = new z30(8, true);
                        z30Var.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z30Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((z30) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, opVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (v() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            sq sqVar = (sq) k.get(this);
            if (sqVar == null) {
                return;
            }
            synchronized (sqVar) {
                c = jw0.b.get(sqVar) > 0 ? sqVar.c(0) : null;
            }
            if (c == null) {
                return;
            } else {
                C(nanoTime, c);
            }
        }
    }

    @Override // defpackage.pq
    public final long v() {
        Runnable runnable;
        rq rqVar;
        op opVar = a50.g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        if (!w()) {
            y();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof z30)) {
                    if (obj != opVar) {
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
                z30 z30Var = (z30) obj;
                Object d = z30Var.d();
                if (d != z30.g) {
                    runnable = (Runnable) d;
                    break;
                }
                z30 c = z30Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            h8 h8Var = this.h;
            if (((h8Var == null || h8Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof z30) {
                        long j2 = z30.f.get((z30) obj2);
                        if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == opVar) {
                        return Long.MAX_VALUE;
                    }
                }
                sq sqVar = (sq) k.get(this);
                if (sqVar != null) {
                    synchronized (sqVar) {
                        rq[] rqVarArr = sqVar.a;
                        rqVar = rqVarArr != null ? rqVarArr[0] : null;
                    }
                    if (rqVar != null) {
                        long nanoTime = rqVar.d - System.nanoTime();
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

    public void x(Runnable runnable) {
        y();
        if (!z(runnable)) {
            uk.m.x(runnable);
            return;
        }
        Thread A = A();
        if (Thread.currentThread() != A) {
            LockSupport.unpark(A);
        }
    }

    public final void y() {
        rq rqVar;
        sq sqVar = (sq) k.get(this);
        if (sqVar == null || jw0.b.get(sqVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (sqVar) {
                try {
                    rq[] rqVarArr = sqVar.a;
                    rq rqVar2 = rqVarArr != null ? rqVarArr[0] : null;
                    if (rqVar2 != null) {
                        rqVar = ((nanoTime - rqVar2.d) > 0L ? 1 : ((nanoTime - rqVar2.d) == 0L ? 0 : -1)) >= 0 ? z(rqVar2) : false ? sqVar.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (rqVar != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (l.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof z30)) {
                        if (obj != a50.g) {
                            z30 z30Var = new z30(8, true);
                            z30Var.a((Runnable) obj);
                            z30Var.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z30Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    z30 z30Var2 = (z30) obj;
                    int a = z30Var2.a(runnable);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        z30 c = z30Var2.c();
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
}
