package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t20 extends uj implements ml {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(t20.class, "runningWorkers$volatile");
    public final /* synthetic */ ml f;
    public final uj g;
    public final int h;
    public final x30 i;
    public final Object j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public t20(uj ujVar, int i) {
        ml mlVar = ujVar instanceof ml ? (ml) ujVar : null;
        this.f = mlVar == null ? vk.a : mlVar;
        this.g = ujVar;
        this.h = i;
        this.i = new x30();
        this.j = new Object();
    }

    @Override // defpackage.ml
    public final void c(long j, hc hcVar) {
        this.f.c(j, hcVar);
    }

    @Override // defpackage.uj
    public final void d(rj rjVar, Runnable runnable) {
        boolean z;
        Runnable l;
        this.i.a(runnable);
        if (k.get(this) < this.h) {
            synchronized (this.j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                if (atomicIntegerFieldUpdater.get(this) >= this.h) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (l = l()) == null) {
                return;
            }
            this.g.d(this, new bw(this, l));
        }
    }

    public final Runnable l() {
        while (true) {
            Runnable runnable = (Runnable) this.i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.uj
    public final String toString() {
        return this.g + ".limitedParallelism(" + this.h + ')';
    }
}
