package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.Bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037Bi extends C1102gQ {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(C0037Bi.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // o.C1102gQ, o.C0283Ku
    public final void i(Object obj) {
        l(obj);
    }

    @Override // o.C1102gQ, o.C0283Ku
    public final void l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = l;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0022At.I(PX.H0(obj), AbstractC1473m3.L(this.k));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
