package q1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class C extends D implements InterfaceC0355v {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3861f = AtomicReferenceFieldUpdater.newUpdater(C.class, Object.class, "_queue");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3862g = AtomicReferenceFieldUpdater.newUpdater(C.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(C.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // q1.AbstractC0349o
    public final void D(Z0.i iVar, Runnable runnable) {
        K(runnable);
    }

    @Override // q1.D
    public void J() {
        c0.f3888a.set(null);
        h.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3861f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            U.q qVar = AbstractC0352s.f3914a;
            if (obj != null) {
                if (!(obj instanceof u1.l)) {
                    if (obj != qVar) {
                        u1.l lVar = new u1.l(8, true);
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
                ((u1.l) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, qVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (M() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void K(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3861f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (h.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof u1.l)) {
                    if (obj != AbstractC0352s.f3914a) {
                        u1.l lVar = new u1.l(8, true);
                        lVar.a((Runnable) obj);
                        lVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                u1.l lVar2 = (u1.l) obj;
                int a2 = lVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    u1.l c2 = lVar2.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (a2 == 2) {
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
        }
        RunnableC0353t.i.K(runnable);
    }

    public final boolean L() {
        W0.h hVar = this.f3864e;
        if (!(hVar != null ? hVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f3861f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof u1.l) {
            long j2 = u1.l.f4196f.get((u1.l) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0352s.f3914a) {
            return true;
        }
        return false;
    }

    public final long M() {
        Runnable runnable;
        if (I()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3861f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof u1.l)) {
                if (obj != AbstractC0352s.f3914a) {
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
            u1.l lVar = (u1.l) obj;
            Object d = lVar.d();
            if (d != u1.l.f4197g) {
                runnable = (Runnable) d;
                break;
            }
            u1.l c2 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        W0.h hVar = this.f3864e;
        if (((hVar == null || hVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f3861f.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof u1.l)) {
                if (obj2 != AbstractC0352s.f3914a) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = u1.l.f4196f.get((u1.l) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }
}
