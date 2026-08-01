package o1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306x extends s1.q {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3343e = AtomicIntegerFieldUpdater.newUpdater(C0306x.class, "_decision");
    private volatile int _decision;

    @Override // s1.q, o1.W
    public final void f(Object obj) {
        g(obj);
    }

    @Override // s1.q, o1.W
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3343e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                s1.a.c(T.e.D(this.d), AbstractC0302t.j(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
