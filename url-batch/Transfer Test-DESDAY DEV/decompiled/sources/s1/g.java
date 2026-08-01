package s1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o1.AbstractC0299p;
import o1.AbstractC0304v;
import o1.C0288e;
import o1.InterfaceC0305w;

/* loaded from: classes.dex */
public final class g extends AbstractC0299p implements InterfaceC0305w {
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final u1.l f3698c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0305w f3699e;

    /* renamed from: f, reason: collision with root package name */
    public final j f3700f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3701g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public g(u1.l lVar, int i) {
        this.f3698c = lVar;
        this.d = i;
        InterfaceC0305w interfaceC0305w = lVar instanceof InterfaceC0305w ? (InterfaceC0305w) lVar : null;
        this.f3699e = interfaceC0305w == null ? AbstractC0304v.f3342a : interfaceC0305w;
        this.f3700f = new j();
        this.f3701g = new Object();
    }

    public final Runnable B() {
        while (true) {
            Runnable runnable = (Runnable) this.f3700f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3701g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f3700f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // o1.InterfaceC0305w
    public final void v(C0288e c0288e) {
        this.f3699e.v(c0288e);
    }

    @Override // o1.AbstractC0299p
    public final void z(X0.i iVar, Runnable runnable) {
        this.f3700f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.f3701g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable B2 = B();
                if (B2 == null) {
                    return;
                }
                this.f3698c.z(this, new H.a(this, B2));
            }
        }
    }
}
