package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class x30 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(x30.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new z30(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            z30 z30Var = (z30) atomicReferenceFieldUpdater.get(this);
            int a2 = z30Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                z30 c = z30Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, z30Var, c) && atomicReferenceFieldUpdater.get(this) == z30Var) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            z30 z30Var = (z30) atomicReferenceFieldUpdater.get(this);
            if (z30Var.b()) {
                return;
            }
            z30 c = z30Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, z30Var, c) && atomicReferenceFieldUpdater.get(this) == z30Var) {
            }
        }
    }

    public final int c() {
        z30 z30Var = (z30) a.get(this);
        z30Var.getClass();
        long j = z30.f.get(z30Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            z30 z30Var = (z30) atomicReferenceFieldUpdater.get(this);
            Object d = z30Var.d();
            if (d != z30.g) {
                return d;
            }
            z30 c = z30Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, z30Var, c) && atomicReferenceFieldUpdater.get(this) == z30Var) {
            }
        }
    }
}
