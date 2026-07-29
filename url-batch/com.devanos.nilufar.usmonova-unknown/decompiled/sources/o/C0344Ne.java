package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: o.Ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344Ne extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(C0344Ne.class, "workerCtl$volatile");
    public final N10 h;
    public final C1360kM i;
    private volatile int indexInArray;
    public EnumC0370Oe j;
    public long k;
    public long l;
    public int m;
    public boolean n;
    private volatile Object nextParkedWorker;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ExecutorC0396Pe f74o;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C0344Ne(ExecutorC0396Pe executorC0396Pe, int i) {
        this.f74o = executorC0396Pe;
        setDaemon(true);
        setContextClassLoader(ExecutorC0396Pe.class.getClassLoader());
        this.h = new N10();
        this.i = new C1360kM();
        this.j = EnumC0370Oe.k;
        this.nextParkedWorker = ExecutorC0396Pe.r;
        int nanoTime = (int) System.nanoTime();
        this.m = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final KU a(boolean z) {
        KU e;
        KU e2;
        long j;
        EnumC0370Oe enumC0370Oe = this.j;
        ExecutorC0396Pe executorC0396Pe = this.f74o;
        KU ku = null;
        N10 n10 = this.h;
        EnumC0370Oe enumC0370Oe2 = EnumC0370Oe.h;
        if (enumC0370Oe != enumC0370Oe2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0396Pe.p;
            do {
                j = atomicLongFieldUpdater.get(executorC0396Pe);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    n10.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N10.b;
                        KU ku2 = (KU) atomicReferenceFieldUpdater.get(n10);
                        if (ku2 != null && ku2.i) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(n10, ku2, null)) {
                                if (atomicReferenceFieldUpdater.get(n10) != ku2) {
                                    break;
                                }
                            }
                            ku = ku2;
                            break loop1;
                        }
                    }
                    int i = N10.d.get(n10);
                    int i2 = N10.c.get(n10);
                    while (true) {
                        if (i == i2 || N10.e.get(n10) == 0) {
                            break;
                        }
                        i2--;
                        KU c = n10.c(i2, true);
                        if (c != null) {
                            ku = c;
                            break;
                        }
                    }
                    if (ku != null) {
                        return ku;
                    }
                    KU ku3 = (KU) executorC0396Pe.m.d();
                    return ku3 == null ? i(1) : ku3;
                }
            } while (!ExecutorC0396Pe.p.compareAndSet(executorC0396Pe, j, j - 4398046511104L));
            this.j = enumC0370Oe2;
        }
        if (z) {
            boolean z2 = d(executorC0396Pe.h * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            n10.getClass();
            KU ku4 = (KU) N10.b.getAndSet(n10, null);
            if (ku4 == null) {
                ku4 = n10.b();
            }
            if (ku4 != null) {
                return ku4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            KU e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.m;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.m = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final KU e() {
        int d = d(2);
        ExecutorC0396Pe executorC0396Pe = this.f74o;
        if (d == 0) {
            KU ku = (KU) executorC0396Pe.l.d();
            return ku != null ? ku : (KU) executorC0396Pe.m.d();
        }
        KU ku2 = (KU) executorC0396Pe.m.d();
        return ku2 != null ? ku2 : (KU) executorC0396Pe.l.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f74o.k);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(EnumC0370Oe enumC0370Oe) {
        EnumC0370Oe enumC0370Oe2 = this.j;
        boolean z = enumC0370Oe2 == EnumC0370Oe.h;
        if (z) {
            ExecutorC0396Pe.p.addAndGet(this.f74o, 4398046511104L);
        }
        if (enumC0370Oe2 != enumC0370Oe) {
            this.j = enumC0370Oe;
        }
        return z;
    }

    public final KU i(int i) {
        long j;
        KU ku;
        long j2;
        long j3;
        KU ku2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0396Pe.p;
        ExecutorC0396Pe executorC0396Pe = this.f74o;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC0396Pe) & 2097151);
        KU ku3 = null;
        if (i2 < 2) {
            return null;
        }
        int d = d(i2);
        int i3 = 0;
        long j4 = Long.MAX_VALUE;
        while (i3 < i2) {
            d++;
            if (d > i2) {
                d = 1;
            }
            C0344Ne c0344Ne = (C0344Ne) executorC0396Pe.n.b(d);
            if (c0344Ne != null && c0344Ne != this) {
                N10 n10 = c0344Ne.h;
                if (i == 3) {
                    ku = n10.b();
                    j = 0;
                } else {
                    n10.getClass();
                    int i4 = N10.d.get(n10);
                    int i5 = N10.c.get(n10);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || N10.e.get(n10) != 0) {
                            int i6 = i4 + 1;
                            ku = n10.c(i4, z);
                            if (ku != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                    ku = ku3;
                }
                C1360kM c1360kM = this.i;
                if (ku != null) {
                    c1360kM.h = ku;
                    ku2 = ku3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N10.b;
                        KU ku4 = (KU) atomicReferenceFieldUpdater.get(n10);
                        if (ku4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((ku4.i ? 1 : 2) & i) == 0) {
                            break;
                        }
                        UU.f.getClass();
                        N10 n102 = n10;
                        long nanoTime = System.nanoTime() - ku4.h;
                        long j5 = UU.b;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            ku2 = null;
                            break;
                        }
                        do {
                            ku2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(n102, ku4, null)) {
                                c1360kM.h = ku4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(n102) == ku4);
                        n10 = n102;
                        ku3 = null;
                    }
                    j3 = -2;
                    ku2 = ku3;
                }
                if (j3 == j2) {
                    KU ku5 = (KU) c1360kM.h;
                    c1360kM.h = ku2;
                    return ku5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i3++;
            ku3 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.l = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (ExecutorC0396Pe.q.get(this.f74o) == 0) {
                EnumC0370Oe enumC0370Oe = this.j;
                EnumC0370Oe enumC0370Oe2 = EnumC0370Oe.l;
                if (enumC0370Oe == enumC0370Oe2) {
                    break loop0;
                }
                KU a = a(this.n);
                if (a != null) {
                    this.l = 0L;
                    ExecutorC0396Pe executorC0396Pe = this.f74o;
                    this.k = 0L;
                    if (this.j == EnumC0370Oe.j) {
                        this.j = EnumC0370Oe.i;
                    }
                    if (a.i) {
                        if (h(EnumC0370Oe.i) && !executorC0396Pe.q() && !executorC0396Pe.m(ExecutorC0396Pe.p.get(executorC0396Pe))) {
                            executorC0396Pe.q();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        ExecutorC0396Pe.p.addAndGet(executorC0396Pe, -2097152L);
                        if (this.j != enumC0370Oe2) {
                            this.j = EnumC0370Oe.k;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.n = false;
                    if (this.l == 0) {
                        Object obj = this.nextParkedWorker;
                        C0457Rn c0457Rn = ExecutorC0396Pe.r;
                        if (obj != c0457Rn) {
                            p.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC0396Pe.r) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ExecutorC0396Pe executorC0396Pe2 = this.f74o;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC0396Pe.q;
                                    if (atomicIntegerFieldUpdater2.get(executorC0396Pe2) != 0) {
                                        break;
                                    }
                                    EnumC0370Oe enumC0370Oe3 = this.j;
                                    EnumC0370Oe enumC0370Oe4 = EnumC0370Oe.l;
                                    if (enumC0370Oe3 == enumC0370Oe4) {
                                        break;
                                    }
                                    h(EnumC0370Oe.j);
                                    Thread.interrupted();
                                    if (this.k == 0) {
                                        j = 2097151;
                                        this.k = System.nanoTime() + this.f74o.j;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f74o.j);
                                    if (System.nanoTime() - this.k >= 0) {
                                        this.k = 0L;
                                        ExecutorC0396Pe executorC0396Pe3 = this.f74o;
                                        synchronized (executorC0396Pe3.n) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(executorC0396Pe3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0396Pe.p;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC0396Pe3) & j)) > executorC0396Pe3.h) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            executorC0396Pe3.k(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0396Pe3) & j);
                                                            if (andDecrement != i) {
                                                                Object b = executorC0396Pe3.n.b(andDecrement);
                                                                AbstractC0048Bt.k(b);
                                                                C0344Ne c0344Ne = (C0344Ne) b;
                                                                executorC0396Pe3.n.c(i, c0344Ne);
                                                                c0344Ne.f(i);
                                                                executorC0396Pe3.k(c0344Ne, andDecrement, i);
                                                            }
                                                            executorC0396Pe3.n.c(andDecrement, null);
                                                            this.j = enumC0370Oe4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ExecutorC0396Pe executorC0396Pe4 = this.f74o;
                            if (this.nextParkedWorker == c0457Rn) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0396Pe.f84o;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(executorC0396Pe4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = executorC0396Pe4.n.b((int) (j2 & 2097151));
                                    ExecutorC0396Pe executorC0396Pe5 = executorC0396Pe4;
                                    if (ExecutorC0396Pe.f84o.compareAndSet(executorC0396Pe5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        executorC0396Pe4 = executorC0396Pe5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(EnumC0370Oe.j);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.l);
                        this.l = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(EnumC0370Oe.l);
    }
}
