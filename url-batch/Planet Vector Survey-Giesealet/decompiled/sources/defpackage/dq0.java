package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class dq0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(dq0.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(dq0.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(dq0.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(dq0.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(dq0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final gc a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public dq0() {
        fq0 fq0Var = new fq0(0L, null, 2);
        this.head$volatile = fq0Var;
        this.tail$volatile = fq0Var;
        this._availablePermits$volatile = 1;
        this.a = new gc(4, this);
    }

    public final void a(t70 t70Var) {
        Object D;
        fq0 fq0Var;
        hc hcVar = t70Var.d;
        u70 u70Var = t70Var.e;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                int i = 0;
                ky0 ky0Var = ky0.a;
                if (andDecrement > 0) {
                    u70.g.set(u70Var, null);
                    hcVar.A(ky0Var, hcVar.f, new gc(i, new h(u70Var, t70Var)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                fq0 fq0Var2 = (fq0) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                bq0 bq0Var = bq0.l;
                long j = andIncrement / eq0.f;
                while (true) {
                    D = mz.D(fq0Var2, j, bq0Var);
                    if (!ud0.n(D)) {
                        kp0 l = ud0.l(D);
                        while (true) {
                            kp0 kp0Var = (kp0) atomicReferenceFieldUpdater.get(this);
                            fq0Var = fq0Var2;
                            if (kp0Var.c >= l.c) {
                                break;
                            }
                            if (!l.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, kp0Var, l)) {
                                if (atomicReferenceFieldUpdater.get(this) != kp0Var) {
                                    if (l.e()) {
                                        l.d();
                                    }
                                    fq0Var2 = fq0Var;
                                }
                            }
                            if (kp0Var.e()) {
                                kp0Var.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fq0Var2 = fq0Var;
                }
                fq0 fq0Var3 = (fq0) ud0.l(D);
                AtomicReferenceArray atomicReferenceArray = fq0Var3.e;
                int i2 = (int) (andIncrement % eq0.f);
                while (!atomicReferenceArray.compareAndSet(i2, null, t70Var)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        op opVar = eq0.b;
                        op opVar2 = eq0.c;
                        while (!atomicReferenceArray.compareAndSet(i2, opVar, opVar2)) {
                            if (atomicReferenceArray.get(i2) != opVar) {
                                break;
                            }
                        }
                        u70.g.set(u70Var, null);
                        hcVar.A(ky0Var, hcVar.f, new gc(0, new h(u70Var, t70Var)));
                        return;
                    }
                }
                t70Var.a(fq0Var3, i2);
                return;
            }
        }
    }

    public final void b() {
        boolean z;
        int i;
        Object D;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            fq0 fq0Var = (fq0) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j = andIncrement2 / eq0.f;
            cq0 cq0Var = cq0.l;
            while (true) {
                D = mz.D(fq0Var, j, cq0Var);
                if (!ud0.n(D)) {
                    kp0 l = ud0.l(D);
                    while (true) {
                        kp0 kp0Var = (kp0) atomicReferenceFieldUpdater.get(this);
                        if (kp0Var.c >= l.c) {
                            break;
                        }
                        if (!l.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, kp0Var, l)) {
                            if (atomicReferenceFieldUpdater.get(this) != kp0Var) {
                                if (l.e()) {
                                    l.d();
                                }
                            }
                        }
                        if (kp0Var.e()) {
                            kp0Var.d();
                        }
                    }
                } else {
                    break;
                }
            }
            fq0 fq0Var2 = (fq0) ud0.l(D);
            AtomicReferenceArray atomicReferenceArray = fq0Var2.e;
            fq0Var2.a();
            boolean z2 = false;
            if (fq0Var2.c <= j) {
                int i2 = (int) (andIncrement2 % eq0.f);
                Object andSet = atomicReferenceArray.getAndSet(i2, eq0.b);
                if (andSet == null) {
                    int i3 = eq0.a;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            op opVar = eq0.b;
                            op opVar2 = eq0.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i2, opVar, opVar2)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i2) != opVar) {
                                    break;
                                }
                            }
                            z = true ^ z2;
                        } else if (atomicReferenceArray.get(i2) == eq0.c) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (andSet != eq0.e) {
                    if (!(andSet instanceof fc)) {
                        g8.d(andSet, "unexpected: ");
                        return;
                    }
                    fc fcVar = (fc) andSet;
                    op d2 = fcVar.d(ky0.a, this.a);
                    if (d2 != null) {
                        fcVar.v(d2);
                    }
                }
            }
            z = false;
        } while (!z);
    }
}
