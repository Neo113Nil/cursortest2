package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ak implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(ak.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(ak.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(ak.class, "_isTerminated$volatile");
    public static final op n = new op("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final gv h;
    public final gv i;
    public final ok0 j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ak(int i, int i2, long j, String str) {
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = str;
        if (i < 1) {
            g8.g("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(y6.v("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        if (i2 > 2097150) {
            g8.g("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.h = new gv();
        this.i = new gv();
        this.j = new ok0((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(ak akVar, Runnable runnable, int i) {
        akVar.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.j) {
            try {
                if (m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = l;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.d) {
                    return 0;
                }
                if (i >= this.e) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.j.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                yj yjVar = new yj(this, i3);
                this.j.c(i3, yjVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                yjVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        av0 bv0Var;
        zj zjVar;
        cv0.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof av0) {
            bv0Var = (av0) runnable;
            bv0Var.d = nanoTime;
            bv0Var.e = z;
        } else {
            bv0Var = new bv0(runnable, nanoTime, z);
        }
        boolean z3 = bv0Var.e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        yj yjVar = currentThread instanceof yj ? (yj) currentThread : null;
        if (yjVar == null || yjVar.k != this) {
            yjVar = null;
        }
        if (yjVar != null && (zjVar = yjVar.f) != zj.h && (bv0Var.e || zjVar != zj.e)) {
            yjVar.j = true;
            v21 v21Var = yjVar.d;
            if (z2) {
                bv0Var = v21Var.a(bv0Var);
            } else {
                v21Var.getClass();
                av0 av0Var = (av0) v21.b.getAndSet(v21Var, bv0Var);
                bv0Var = av0Var == null ? null : v21Var.a(av0Var);
            }
        }
        if (bv0Var != null) {
            if (!(bv0Var.e ? this.i.a(bv0Var) : this.h.a(bv0Var))) {
                throw new RejectedExecutionException(this.g + " was terminated");
            }
        }
        boolean z4 = z2 && yjVar != null;
        if (z3) {
            if (z4 || f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z4 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        av0 av0Var;
        if (m.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            yj yjVar = currentThread instanceof yj ? (yj) currentThread : null;
            if (yjVar == null || yjVar.k != this) {
                yjVar = null;
            }
            synchronized (this.j) {
                i = (int) (l.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.j.b(i2);
                    b.getClass();
                    yj yjVar2 = (yj) b;
                    if (yjVar2 != yjVar) {
                        while (yjVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(yjVar2);
                            yjVar2.join(10000L);
                        }
                        v21 v21Var = yjVar2.d;
                        gv gvVar = this.i;
                        v21Var.getClass();
                        av0 av0Var2 = (av0) v21.b.getAndSet(v21Var, null);
                        if (av0Var2 != null) {
                            gvVar.a(av0Var2);
                        }
                        while (true) {
                            av0 b2 = v21Var.b();
                            if (b2 == null) {
                                break;
                            } else {
                                gvVar.a(b2);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.i.b();
            this.h.b();
            while (true) {
                if (yjVar != null) {
                    av0Var = yjVar.a(true);
                }
                av0Var = (av0) this.h.d();
                if (av0Var == null && (av0Var = (av0) this.i.d()) == null) {
                    break;
                }
                try {
                    av0Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (yjVar != null) {
                yjVar.h(zj.h);
            }
            k.set(this, 0L);
            l.set(this, 0L);
        }
    }

    public final void d(yj yjVar, int i, int i2) {
        while (true) {
            long j = k.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = yjVar.c();
                    while (true) {
                        if (c == n) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        yj yjVar2 = (yj) c;
                        int b = yjVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = yjVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ak akVar = this;
                if (k.compareAndSet(akVar, j, i3 | j2)) {
                    return;
                } else {
                    this = akVar;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.d;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        ak akVar;
        op opVar;
        int i;
        while (true) {
            long j = k.get(this);
            yj yjVar = (yj) this.j.b((int) (2097151 & j));
            if (yjVar == null) {
                yjVar = null;
                akVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = yjVar.c();
                while (true) {
                    opVar = n;
                    if (c == opVar) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    yj yjVar2 = (yj) c;
                    i = yjVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = yjVar2.c();
                    j = j;
                }
                if (i >= 0) {
                    ak akVar2 = this;
                    boolean compareAndSet = k.compareAndSet(akVar2, j, i | j2);
                    akVar = akVar2;
                    if (compareAndSet) {
                        yjVar.g(opVar);
                    }
                    this = akVar;
                } else {
                    continue;
                }
            }
            if (yjVar == null) {
                return false;
            }
            if (yj.l.compareAndSet(yjVar, -1, 0)) {
                LockSupport.unpark(yjVar);
                return true;
            }
            this = akVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ok0 ok0Var = this.j;
        int a = ok0Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            yj yjVar = (yj) ok0Var.b(i6);
            if (yjVar != null) {
                v21 v21Var = yjVar.d;
                v21Var.getClass();
                int i7 = v21.b.get(v21Var) != null ? (v21.c.get(v21Var) - v21.d.get(v21Var)) + 1 : v21.c.get(v21Var) - v21.d.get(v21Var);
                int ordinal = yjVar.f.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        g8.c();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.g);
        sb4.append('@');
        sb4.append(nk.u(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.d;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
