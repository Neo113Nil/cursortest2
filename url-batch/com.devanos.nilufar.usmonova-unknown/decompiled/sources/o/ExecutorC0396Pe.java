package o;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: o.Pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0396Pe implements Executor, Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f84o = AtomicLongFieldUpdater.newUpdater(ExecutorC0396Pe.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(ExecutorC0396Pe.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0396Pe.class, "_isTerminated$volatile");
    public static final C0457Rn r = new C0457Rn("NOT_IN_STACK", 5);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int h;
    public final int i;
    public final long j;
    public final String k;
    public final C0123Eq l;
    public final C0123Eq m;
    public final NN n;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ExecutorC0396Pe(int i, int i2, long j, String str) {
        this.h = i;
        this.i = i2;
        this.j = j;
        this.k = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1888sN.h(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1888sN.g(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC1888sN.h(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.l = new C0123Eq();
        this.m = new C0123Eq();
        this.n = new NN((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void j(ExecutorC0396Pe executorC0396Pe, Runnable runnable, int i) {
        executorC0396Pe.c(runnable, false, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.n) {
            try {
                if (q.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = p;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.h) {
                    return 0;
                }
                if (i >= this.i) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.n.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0344Ne c0344Ne = new C0344Ne(this, i3);
                this.n.c(i3, c0344Ne);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c0344Ne.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, boolean z, boolean z2) {
        KU pu;
        EnumC0370Oe enumC0370Oe;
        UU.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof KU) {
            pu = (KU) runnable;
            pu.h = nanoTime;
            pu.i = z;
        } else {
            pu = new PU(runnable, nanoTime, z);
        }
        boolean z3 = pu.i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = p;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        C0344Ne c0344Ne = currentThread instanceof C0344Ne ? (C0344Ne) currentThread : null;
        if (c0344Ne == null || !AbstractC0048Bt.h(c0344Ne.f74o, this)) {
            c0344Ne = null;
        }
        if (c0344Ne != null && (enumC0370Oe = c0344Ne.j) != EnumC0370Oe.l && (pu.i || enumC0370Oe != EnumC0370Oe.i)) {
            c0344Ne.n = true;
            N10 n10 = c0344Ne.h;
            if (z2) {
                pu = n10.a(pu);
            } else {
                n10.getClass();
                KU ku = (KU) N10.b.getAndSet(n10, pu);
                pu = ku == null ? null : n10.a(ku);
            }
        }
        if (pu != null) {
            if (!(pu.i ? this.m.a(pu) : this.l.a(pu))) {
                throw new RejectedExecutionException(AbstractC1888sN.l(new StringBuilder(), this.k, " was terminated"));
            }
        }
        boolean z4 = z2 && c0344Ne != null;
        if (z3) {
            if (z4 || q() || m(addAndGet)) {
                return;
            }
            q();
            return;
        }
        if (z4 || q() || m(atomicLongFieldUpdater.get(this))) {
            return;
        }
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        KU ku;
        if (q.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            C0344Ne c0344Ne = currentThread instanceof C0344Ne ? (C0344Ne) currentThread : null;
            if (c0344Ne == null || !AbstractC0048Bt.h(c0344Ne.f74o, this)) {
                c0344Ne = null;
            }
            synchronized (this.n) {
                i = (int) (p.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.n.b(i2);
                    AbstractC0048Bt.k(b);
                    C0344Ne c0344Ne2 = (C0344Ne) b;
                    if (c0344Ne2 != c0344Ne) {
                        while (c0344Ne2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c0344Ne2);
                            c0344Ne2.join(10000L);
                        }
                        N10 n10 = c0344Ne2.h;
                        C0123Eq c0123Eq = this.m;
                        n10.getClass();
                        KU ku2 = (KU) N10.b.getAndSet(n10, null);
                        if (ku2 != null) {
                            c0123Eq.a(ku2);
                        }
                        while (true) {
                            KU b2 = n10.b();
                            if (b2 == null) {
                                break;
                            } else {
                                c0123Eq.a(b2);
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
            this.m.b();
            this.l.b();
            while (true) {
                if (c0344Ne != null) {
                    ku = c0344Ne.a(true);
                }
                ku = (KU) this.l.d();
                if (ku == null && (ku = (KU) this.m.d()) == null) {
                    break;
                }
                try {
                    ku.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (c0344Ne != null) {
                c0344Ne.h(EnumC0370Oe.l);
            }
            f84o.set(this, 0L);
            p.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(this, runnable, 6);
    }

    public final void k(C0344Ne c0344Ne, int i, int i2) {
        while (true) {
            long j = f84o.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = c0344Ne.c();
                    while (true) {
                        if (c == r) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        C0344Ne c0344Ne2 = (C0344Ne) c;
                        int b = c0344Ne2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = c0344Ne2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f84o.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean m(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.h;
        if (i < i2) {
            int b = b();
            if (b == 1 && i2 > 1) {
                b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        C0457Rn c0457Rn;
        int i;
        while (true) {
            long j = f84o.get(this);
            C0344Ne c0344Ne = (C0344Ne) this.n.b((int) (2097151 & j));
            if (c0344Ne == null) {
                c0344Ne = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = c0344Ne.c();
                while (true) {
                    c0457Rn = r;
                    if (c == c0457Rn) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    C0344Ne c0344Ne2 = (C0344Ne) c;
                    i = c0344Ne2.b();
                    if (i != 0) {
                        break;
                    }
                    c = c0344Ne2.c();
                }
                if (i >= 0) {
                    if (f84o.compareAndSet(this, j, i | j2)) {
                        c0344Ne.g(c0457Rn);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0344Ne == null) {
                return false;
            }
            if (C0344Ne.p.compareAndSet(c0344Ne, -1, 0)) {
                LockSupport.unpark(c0344Ne);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NN nn = this.n;
        int a = nn.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            C0344Ne c0344Ne = (C0344Ne) nn.b(i6);
            if (c0344Ne != null) {
                N10 n10 = c0344Ne.h;
                n10.getClass();
                int i7 = N10.b.get(n10) != null ? (N10.c.get(n10) - N10.d.get(n10)) + 1 : N10.c.get(n10) - N10.d.get(n10);
                int ordinal = c0344Ne.j.ordinal();
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
                        throw new C0057Cc();
                    }
                    i5++;
                }
            }
        }
        long j = p.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.k);
        sb4.append('@');
        sb4.append(AbstractC1052fg.B(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.h;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.i);
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
        sb4.append(this.l.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.m.c());
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
