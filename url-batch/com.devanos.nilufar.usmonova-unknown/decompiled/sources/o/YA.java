package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class YA {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(YA.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C0693aB(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C0693aB c0693aB = (C0693aB) atomicReferenceFieldUpdater.get(this);
            int a2 = c0693aB.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                C0693aB c = c0693aB.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0693aB, c) && atomicReferenceFieldUpdater.get(this) == c0693aB) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C0693aB c0693aB = (C0693aB) atomicReferenceFieldUpdater.get(this);
            if (c0693aB.b()) {
                return;
            }
            C0693aB c = c0693aB.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0693aB, c) && atomicReferenceFieldUpdater.get(this) == c0693aB) {
            }
        }
    }

    public final int c() {
        C0693aB c0693aB = (C0693aB) a.get(this);
        c0693aB.getClass();
        long j = C0693aB.f.get(c0693aB);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C0693aB c0693aB = (C0693aB) atomicReferenceFieldUpdater.get(this);
            Object d = c0693aB.d();
            if (d != C0693aB.g) {
                return d;
            }
            C0693aB c = c0693aB.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0693aB, c) && atomicReferenceFieldUpdater.get(this) == c0693aB) {
            }
        }
    }
}
