package q1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class L extends O {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3870f = AtomicIntegerFieldUpdater.newUpdater(L.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final P f3871e;

    public L(P p2) {
        this.f3871e = p2;
    }

    @Override // h1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return V0.i.f1250a;
    }

    @Override // q1.P
    public final void o(Throwable th) {
        if (f3870f.compareAndSet(this, 0, 1)) {
            this.f3871e.g(th);
        }
    }
}
