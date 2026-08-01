package o1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class N extends Q {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3289f = AtomicIntegerFieldUpdater.newUpdater(N.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final S f3290e;

    public N(S s2) {
        this.f3290e = s2;
    }

    @Override // f1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return U0.i.f870a;
    }

    @Override // o1.S
    public final void o(Throwable th) {
        if (f3289f.compareAndSet(this, 0, 1)) {
            this.f3290e.g(th);
        }
    }
}
