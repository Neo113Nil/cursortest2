package w1;

import E1.AbstractC0001b;
import U.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import q.AbstractC0332e;
import q1.AbstractC0352s;
import u1.p;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {
    public static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4420j = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: k, reason: collision with root package name */
    public static final q f4421k = new q("NOT_IN_STACK", 1);
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f4422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4423b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4424c;
    private volatile long controlState;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final e f4425e;

    /* renamed from: f, reason: collision with root package name */
    public final e f4426f;

    /* renamed from: g, reason: collision with root package name */
    public final p f4427g;
    private volatile long parkedWorkersStack;

    public b(int i2, int i3, long j2, String str) {
        this.f4422a = i2;
        this.f4423b = i3;
        this.f4424c = j2;
        this.d = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(AbstractC0001b.d(i3, i2, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f4425e = new e();
        this.f4426f = new e();
        this.f4427g = new p((i2 + 1) * 2);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f4427g) {
            try {
                if (f4420j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f4422a) {
                    return 0;
                }
                if (i2 >= this.f4423b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f4427g.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i4);
                this.f4427g.c(i4, aVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                aVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i2;
        h hVar;
        if (f4420j.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !i1.f.a(aVar.h, this)) {
                aVar = null;
            }
            synchronized (this.f4427g) {
                i2 = (int) (i.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object b2 = this.f4427g.b(i3);
                    i1.f.b(b2);
                    a aVar2 = (a) b2;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f4414a;
                        e eVar = this.f4426f;
                        mVar.getClass();
                        h hVar2 = (h) m.f4442b.getAndSet(mVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h b3 = mVar.b();
                            if (b3 == null) {
                                break;
                            } else {
                                eVar.a(b3);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f4426f.b();
            this.f4425e.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f4425e.d();
                if (hVar == null && (hVar = (h) this.f4426f.d()) == null) {
                    break;
                }
                try {
                    hVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            h.set(this, 0L);
            i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(runnable, k.f4440g, false);
    }

    public final void f(Runnable runnable, i iVar, boolean z2) {
        h jVar;
        int i2;
        k.f4439f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f4431a = nanoTime;
            jVar.f4432b = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z3 = false;
        boolean z4 = jVar.f4432b.f4433a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long addAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !i1.f.a(aVar.h, this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f4416c) != 5 && (jVar.f4432b.f4433a != 0 || i2 != 2)) {
            aVar.f4419g = true;
            m mVar = aVar.f4414a;
            if (z2) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f4442b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f4432b.f4433a == 1 ? this.f4426f.a(jVar) : this.f4425e.a(jVar))) {
                throw new RejectedExecutionException(this.d + " was terminated");
            }
        }
        if (z2 && aVar != null) {
            z3 = true;
        }
        if (z4) {
            if (z3 || q() || i(addAndGet)) {
                return;
            }
            q();
            return;
        }
        if (z3 || q() || i(atomicLongFieldUpdater.get(this))) {
            return;
        }
        q();
    }

    public final void h(a aVar, int i2, int i3) {
        while (true) {
            long j2 = h.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f4421k) {
                            i4 = -1;
                            break;
                        }
                        if (c2 == null) {
                            i4 = 0;
                            break;
                        }
                        a aVar2 = (a) c2;
                        int b2 = aVar2.b();
                        if (b2 != 0) {
                            i4 = b2;
                            break;
                        }
                        c2 = aVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (h.compareAndSet(this, j2, i4 | j3)) {
                    return;
                }
            }
        }
    }

    public final boolean i(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f4422a;
        if (i2 < i3) {
            int a2 = a();
            if (a2 == 1 && i3 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        q qVar;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f4427g.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c2 = aVar.c();
                while (true) {
                    qVar = f4421k;
                    if (c2 == qVar) {
                        i2 = -1;
                        break;
                    }
                    if (c2 == null) {
                        i2 = 0;
                        break;
                    }
                    a aVar2 = (a) c2;
                    i2 = aVar2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c2 = aVar2.c();
                }
                if (i2 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | i2)) {
                    aVar.g(qVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f4427g;
        int a2 = pVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            a aVar = (a) pVar.b(i7);
            if (aVar != null) {
                m mVar = aVar.f4414a;
                mVar.getClass();
                int i8 = m.f4442b.get(mVar) != null ? (m.f4443c.get(mVar) - m.d.get(mVar)) + 1 : m.f4443c.get(mVar) - m.d.get(mVar);
                int a3 = AbstractC0332e.a(aVar.f4416c);
                if (a3 == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (a3 == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (a3 == 2) {
                    i4++;
                } else if (a3 == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (a3 == 4) {
                    i6++;
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(AbstractC0352s.c(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f4422a;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f4423b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f4425e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f4426f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
