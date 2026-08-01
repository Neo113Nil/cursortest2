package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ni {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ni.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ni.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ni(kp0 kp0Var) {
        this._prev$volatile = kp0Var;
    }

    public final void a() {
        b.set(this, null);
    }

    public final ni b() {
        Object obj = a.get(this);
        if (obj == mz.i) {
            return null;
        }
        return (ni) obj;
    }

    public abstract boolean c();

    public final void d() {
        ni b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            ni niVar = (ni) atomicReferenceFieldUpdater.get(this);
            while (niVar != null && niVar.c()) {
                niVar = (ni) atomicReferenceFieldUpdater.get(niVar);
            }
            ni b3 = b();
            b3.getClass();
            while (b3.c() && (b2 = b3.b()) != null) {
                b3 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b3);
                ni niVar2 = ((ni) obj) == null ? null : niVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b3, obj, niVar2)) {
                    if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        break;
                    }
                }
            }
            if (niVar != null) {
                a.set(niVar, b3);
            }
            if (!b3.c() || b3.b() == null) {
                if (niVar == null || !niVar.c()) {
                    return;
                }
            }
        }
    }
}
