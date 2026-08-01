package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yj extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(yj.class, "workerCtl$volatile");
    public final v21 d;
    public final gj0 e;
    public zj f;
    public long g;
    public long h;
    public int i;
    private volatile int indexInArray;
    public boolean j;
    public final /* synthetic */ ak k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public yj(ak akVar, int i) {
        this.k = akVar;
        setDaemon(true);
        setContextClassLoader(ak.class.getClassLoader());
        this.d = new v21();
        this.e = new gj0();
        this.f = zj.g;
        this.nextParkedWorker = ak.n;
        int nanoTime = (int) System.nanoTime();
        this.i = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final av0 a(boolean z) {
        av0 e;
        av0 e2;
        long j;
        zj zjVar = this.f;
        ak akVar = this.k;
        av0 av0Var = null;
        v21 v21Var = this.d;
        zj zjVar2 = zj.d;
        if (zjVar != zjVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ak.l;
            do {
                j = atomicLongFieldUpdater.get(akVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    v21Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v21.b;
                        av0 av0Var2 = (av0) atomicReferenceFieldUpdater.get(v21Var);
                        if (av0Var2 != null && av0Var2.e) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(v21Var, av0Var2, null)) {
                                if (atomicReferenceFieldUpdater.get(v21Var) != av0Var2) {
                                    break;
                                }
                            }
                            av0Var = av0Var2;
                            break loop1;
                        }
                    }
                    int i = v21.d.get(v21Var);
                    int i2 = v21.c.get(v21Var);
                    while (true) {
                        if (i == i2 || v21.e.get(v21Var) == 0) {
                            break;
                        }
                        i2--;
                        av0 c = v21Var.c(i2, true);
                        if (c != null) {
                            av0Var = c;
                            break;
                        }
                    }
                    if (av0Var != null) {
                        return av0Var;
                    }
                    av0 av0Var3 = (av0) akVar.i.d();
                    return av0Var3 == null ? i(1) : av0Var3;
                }
            } while (!ak.l.compareAndSet(akVar, j, j - 4398046511104L));
            this.f = zjVar2;
        }
        if (z) {
            boolean z2 = d(akVar.d * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            v21Var.getClass();
            av0 av0Var4 = (av0) v21.b.getAndSet(v21Var, null);
            if (av0Var4 == null) {
                av0Var4 = v21Var.b();
            }
            if (av0Var4 != null) {
                return av0Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            av0 e3 = e();
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
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final av0 e() {
        int d = d(2);
        ak akVar = this.k;
        gv gvVar = akVar.i;
        gv gvVar2 = akVar.h;
        if (d == 0) {
            av0 av0Var = (av0) gvVar2.d();
            return av0Var != null ? av0Var : (av0) gvVar.d();
        }
        av0 av0Var2 = (av0) gvVar.d();
        return av0Var2 != null ? av0Var2 : (av0) gvVar2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k.g);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(zj zjVar) {
        zj zjVar2 = this.f;
        boolean z = zjVar2 == zj.d;
        if (z) {
            ak.l.addAndGet(this.k, 4398046511104L);
        }
        if (zjVar2 != zjVar) {
            this.f = zjVar;
        }
        return z;
    }

    public final av0 i(int i) {
        long j;
        av0 av0Var;
        long j2;
        long j3;
        av0 av0Var2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ak.l;
        ak akVar = this.k;
        int i2 = (int) (atomicLongFieldUpdater.get(akVar) & 2097151);
        av0 av0Var3 = null;
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
            yj yjVar = (yj) akVar.j.b(d);
            if (yjVar != null && yjVar != this) {
                v21 v21Var = yjVar.d;
                if (i == 3) {
                    av0Var = v21Var.b();
                    j = 0;
                } else {
                    v21Var.getClass();
                    int i4 = v21.d.get(v21Var);
                    int i5 = v21.c.get(v21Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || v21.e.get(v21Var) != 0) {
                            int i6 = i4 + 1;
                            av0Var = v21Var.c(i4, z);
                            if (av0Var != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                    av0Var = av0Var3;
                }
                gj0 gj0Var = this.e;
                if (av0Var != null) {
                    gj0Var.d = av0Var;
                    av0Var2 = av0Var3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v21.b;
                        av0 av0Var4 = (av0) atomicReferenceFieldUpdater.get(v21Var);
                        if (av0Var4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((av0Var4.e ? 1 : 2) & i) == 0) {
                            break;
                        }
                        cv0.f.getClass();
                        v21 v21Var2 = v21Var;
                        long nanoTime = System.nanoTime() - av0Var4.d;
                        long j5 = cv0.b;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            av0Var2 = null;
                            break;
                        }
                        do {
                            av0Var2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(v21Var2, av0Var4, null)) {
                                gj0Var.d = av0Var4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(v21Var2) == av0Var4);
                        v21Var = v21Var2;
                        av0Var3 = null;
                    }
                    j3 = -2;
                    av0Var2 = av0Var3;
                }
                if (j3 == j2) {
                    av0 av0Var5 = (av0) gj0Var.d;
                    gj0Var.d = av0Var2;
                    return av0Var5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i3++;
            av0Var3 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.h = j4;
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
            while (ak.m.get(this.k) == 0) {
                zj zjVar = this.f;
                zj zjVar2 = zj.h;
                if (zjVar == zjVar2) {
                    break loop0;
                }
                av0 a = a(this.j);
                if (a != null) {
                    this.h = 0L;
                    ak akVar = this.k;
                    this.g = 0L;
                    if (this.f == zj.f) {
                        this.f = zj.e;
                    }
                    if (a.e) {
                        if (h(zj.e) && !akVar.f() && !akVar.e(ak.l.get(akVar))) {
                            akVar.f();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        ak.l.addAndGet(akVar, -2097152L);
                        if (this.f != zjVar2) {
                            this.f = zj.g;
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
                    this.j = false;
                    if (this.h == 0) {
                        Object obj = this.nextParkedWorker;
                        op opVar = ak.n;
                        if (obj != opVar) {
                            l.set(this, -1);
                            while (this.nextParkedWorker != ak.n) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ak akVar2 = this.k;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ak.m;
                                    if (atomicIntegerFieldUpdater2.get(akVar2) != 0) {
                                        break;
                                    }
                                    zj zjVar3 = this.f;
                                    zj zjVar4 = zj.h;
                                    if (zjVar3 == zjVar4) {
                                        break;
                                    }
                                    h(zj.f);
                                    Thread.interrupted();
                                    if (this.g == 0) {
                                        j = 2097151;
                                        this.g = System.nanoTime() + this.k.f;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.k.f);
                                    if (System.nanoTime() - this.g >= 0) {
                                        this.g = 0L;
                                        ak akVar3 = this.k;
                                        synchronized (akVar3.j) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(akVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ak.l;
                                                    if (((int) (atomicLongFieldUpdater.get(akVar3) & j)) > akVar3.d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            akVar3.d(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(akVar3) & j);
                                                            if (andDecrement != i) {
                                                                Object b = akVar3.j.b(andDecrement);
                                                                b.getClass();
                                                                yj yjVar = (yj) b;
                                                                akVar3.j.c(i, yjVar);
                                                                yjVar.f(i);
                                                                akVar3.d(yjVar, andDecrement, i);
                                                            }
                                                            akVar3.j.c(andDecrement, null);
                                                            this.f = zjVar4;
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
                            ak akVar4 = this.k;
                            if (this.nextParkedWorker == opVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ak.k;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(akVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = akVar4.j.b((int) (j2 & 2097151));
                                    ak akVar5 = akVar4;
                                    if (ak.k.compareAndSet(akVar5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        akVar4 = akVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(zj.f);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.h);
                        this.h = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(zj.h);
    }
}
