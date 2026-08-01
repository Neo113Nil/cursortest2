package q1;

import a1.AbstractC0067d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: q1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356w extends u1.q {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3922e = AtomicIntegerFieldUpdater.newUpdater(C0356w.class, "_decision");
    private volatile int _decision;

    @Override // u1.q, q1.U
    public final void d(Object obj) {
        e(obj);
    }

    @Override // u1.q, q1.U
    public final void e(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3922e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                u1.a.c(AbstractC0067d.m(this.d), AbstractC0352s.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
