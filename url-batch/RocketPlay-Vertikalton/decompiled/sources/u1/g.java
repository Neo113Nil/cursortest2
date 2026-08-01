package u1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q1.AbstractC0349o;
import q1.AbstractC0354u;
import q1.InterfaceC0355v;

/* loaded from: classes.dex */
public final class g extends AbstractC0349o implements InterfaceC0355v {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4185g = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final w1.l f4186c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4187e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4188f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public g(w1.l lVar, int i) {
        this.f4186c = lVar;
        this.d = i;
        if ((lVar instanceof InterfaceC0355v ? (InterfaceC0355v) lVar : null) == null) {
            int i2 = AbstractC0354u.f3921a;
        }
        this.f4187e = new j();
        this.f4188f = new Object();
    }

    @Override // q1.AbstractC0349o
    public final void D(Z0.i iVar, Runnable runnable) {
        this.f4187e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4185g;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.f4188f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable F = F();
                if (F == null) {
                    return;
                }
                this.f4186c.D(this, new H.a(this, F));
            }
        }
    }

    public final Runnable F() {
        while (true) {
            Runnable runnable = (Runnable) this.f4187e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4188f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4185g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f4187e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
