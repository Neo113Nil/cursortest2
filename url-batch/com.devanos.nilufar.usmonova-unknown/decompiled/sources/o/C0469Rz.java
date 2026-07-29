package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.Rz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469Rz extends AbstractC0267Ke implements InterfaceC0658Zg {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f103o = AtomicIntegerFieldUpdater.newUpdater(C0469Rz.class, "runningWorkers$volatile");
    public final /* synthetic */ InterfaceC0658Zg j;
    public final AbstractC0267Ke k;
    public final int l;
    public final YA m;
    public final Object n;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C0469Rz(AbstractC0267Ke abstractC0267Ke, int i) {
        InterfaceC0658Zg interfaceC0658Zg = abstractC0267Ke instanceof InterfaceC0658Zg ? (InterfaceC0658Zg) abstractC0267Ke : null;
        this.j = interfaceC0658Zg == null ? AbstractC2171wg.a : interfaceC0658Zg;
        this.k = abstractC0267Ke;
        this.l = i;
        this.m = new YA();
        this.n = new Object();
    }

    @Override // o.AbstractC0267Ke
    public final void L(InterfaceC0189He interfaceC0189He, Runnable runnable) {
        boolean z;
        Runnable O;
        this.m.a(runnable);
        if (f103o.get(this) < this.l) {
            synchronized (this.n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f103o;
                if (atomicIntegerFieldUpdater.get(this) >= this.l) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (O = O()) == null) {
                return;
            }
            this.k.L(this, new RunnableC1996u1(this, 6, O));
        }
    }

    public final Runnable O() {
        while (true) {
            Runnable runnable = (Runnable) this.m.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f103o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.m.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // o.InterfaceC0658Zg
    public final InterfaceC0297Li m(long j, PV pv, InterfaceC0189He interfaceC0189He) {
        return this.j.m(j, pv, interfaceC0189He);
    }

    @Override // o.AbstractC0267Ke
    public final String toString() {
        return this.k + ".limitedParallelism(" + this.l + ')';
    }

    @Override // o.InterfaceC0658Zg
    public final void x(long j, C0849ca c0849ca) {
        this.j.x(j, c0849ca);
    }
}
