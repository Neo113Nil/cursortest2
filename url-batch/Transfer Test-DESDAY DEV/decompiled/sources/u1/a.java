package u1;

import U.q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final m f3807a;

    /* renamed from: b, reason: collision with root package name */
    public final g1.i f3808b;

    /* renamed from: c, reason: collision with root package name */
    public int f3809c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f3810e;

    /* renamed from: f, reason: collision with root package name */
    public int f3811f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3812g;
    public final /* synthetic */ b h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.h = bVar;
        setDaemon(true);
        this.f3807a = new m();
        this.f3808b = new g1.i();
        this.f3809c = 4;
        this.nextParkedWorker = b.f3814k;
        i1.e.f2620a.getClass();
        this.f3811f = i1.e.f2621b.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h e2;
        h e3;
        b bVar;
        long j2;
        int i2 = this.f3809c;
        h hVar = null;
        m mVar = this.f3807a;
        b bVar2 = this.h;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.i;
            do {
                bVar = this.h;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3835b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f3825b.f3826a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.d.get(mVar);
                    int i4 = m.f3836c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f3837e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        h c2 = mVar.c(i4, true);
                        if (c2 != null) {
                            hVar = c2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f3819f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.i.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f3809c = 1;
        }
        if (z2) {
            boolean z3 = d(bVar2.f3815a * 2) == 0;
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            mVar.getClass();
            h hVar4 = (h) m.f3835b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z3 && (e2 = e()) != null) {
                return e2;
            }
        } else {
            h e4 = e();
            if (e4 != null) {
                return e4;
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

    public final int d(int i2) {
        int i3 = this.f3811f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f3811f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d = d(2);
        b bVar = this.h;
        if (d == 0) {
            h hVar = (h) bVar.f3818e.d();
            return hVar != null ? hVar : (h) bVar.f3819f.d();
        }
        h hVar2 = (h) bVar.f3819f.d();
        return hVar2 != null ? hVar2 : (h) bVar.f3818e.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f3809c;
        boolean z2 = i3 == 1;
        if (z2) {
            b.i.addAndGet(this.h, 4398046511104L);
        }
        if (i3 != i2) {
            this.f3809c = i2;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h i(int i2) {
        int i3;
        h hVar;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.i;
        b bVar = this.h;
        int i4 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i4 < 2) {
            return null;
        }
        int d = d(i4);
        int i5 = 0;
        long j3 = Long.MAX_VALUE;
        while (i5 < i4) {
            int i6 = d + 1;
            if (i6 > i4) {
                i6 = 1;
            }
            a aVar = (a) bVar.f3820g.b(i6);
            if (aVar == null || aVar == this) {
                i3 = i6;
            } else {
                m mVar = aVar.f3807a;
                if (i2 == 3) {
                    hVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i7 = m.d.get(mVar);
                    int i8 = m.f3836c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (i7 != i8 && (!z2 || m.f3837e.get(mVar) != 0)) {
                        int i9 = i7 + 1;
                        hVar = mVar.c(i7, z2);
                        if (hVar != null) {
                            break;
                        }
                        i7 = i9;
                    }
                    hVar = hVar2;
                }
                g1.i iVar = this.f3808b;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3835b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f3825b.f3826a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        k.f3832f.getClass();
                        i3 = i6;
                        long nanoTime = System.nanoTime() - hVar3.f3824a;
                        long j4 = k.f3829b;
                        if (nanoTime < j4) {
                            j2 = j4 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                iVar.f2583a = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i6 = i3;
                        hVar2 = null;
                    }
                } else {
                    iVar.f2583a = hVar;
                    i3 = i6;
                }
                j2 = -1;
                if (j2 == -1) {
                    h hVar4 = (h) iVar.f2583a;
                    iVar.f2583a = hVar2;
                    return hVar4;
                }
                if (j2 > 0) {
                    j3 = Math.min(j3, j2);
                }
            }
            i5++;
            d = i3;
            hVar2 = null;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = 0;
        }
        this.f3810e = j3;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        int i2;
        loop0: while (true) {
            boolean z2 = false;
            while (true) {
                b bVar = this.h;
                bVar.getClass();
                int i3 = 5;
                if (b.f3813j.get(bVar) == 0 && this.f3809c != 5) {
                    h a2 = a(this.f3812g);
                    int i4 = 3;
                    if (a2 != null) {
                        this.f3810e = 0L;
                        int i5 = a2.f3825b.f3826a;
                        this.d = 0L;
                        if (this.f3809c == 3) {
                            this.f3809c = 2;
                        }
                        b bVar2 = this.h;
                        if (i5 != 0 && h(2) && !bVar2.t() && !bVar2.n(b.i.get(bVar2))) {
                            bVar2.t();
                        }
                        bVar2.getClass();
                        try {
                            a2.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i5 != 0) {
                            b.i.addAndGet(bVar2, -2097152L);
                            if (this.f3809c != 5) {
                                this.f3809c = 4;
                            }
                        }
                    } else {
                        this.f3812g = false;
                        if (this.f3810e == 0) {
                            Object obj = this.nextParkedWorker;
                            q qVar = b.f3814k;
                            if (obj != qVar) {
                                i.set(this, -1);
                                while (this.nextParkedWorker != b.f3814k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.h;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f3813j;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f3809c != i3) {
                                            h(i4);
                                            Thread.interrupted();
                                            if (this.d == 0) {
                                                this.d = System.nanoTime() + this.h.f3817c;
                                            }
                                            LockSupport.parkNanos(this.h.f3817c);
                                            if (System.nanoTime() - this.d >= 0) {
                                                this.d = 0L;
                                                b bVar4 = this.h;
                                                synchronized (bVar4.f3820g) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.i;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f3815a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i6 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.m(this, i6, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i6) {
                                                                        Object b2 = bVar4.f3820g.b(andDecrement);
                                                                        g1.f.b(b2);
                                                                        a aVar = (a) b2;
                                                                        bVar4.f3820g.c(i6, aVar);
                                                                        aVar.f(i6);
                                                                        bVar4.m(aVar, andDecrement, i6);
                                                                    }
                                                                    bVar4.f3820g.c(andDecrement, null);
                                                                    this.f3809c = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            i3 = 5;
                                            i4 = 3;
                                        }
                                    }
                                }
                            } else {
                                b bVar5 = this.h;
                                bVar5.getClass();
                                if (this.nextParkedWorker == qVar) {
                                    do {
                                        atomicLongFieldUpdater = b.h;
                                        j2 = atomicLongFieldUpdater.get(bVar5);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f3820g.b((int) (j2 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j2, ((j2 + 2097152) & (-2097152)) | i2));
                                }
                            }
                        } else {
                            if (z2) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f3810e);
                                this.f3810e = 0L;
                                break;
                            }
                            z2 = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
