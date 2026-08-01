package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class c00 extends w30 implements bn, nx {
    public g00 g;

    @Override // defpackage.bn
    public final void a() {
        g00 j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g00.d;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof c00) {
                if (obj != this) {
                    return;
                }
                rp rpVar = nk.m;
                while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, rpVar)) {
                    if (atomicReferenceFieldUpdater.get(j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof nx) || ((nx) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w30.d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof hk0) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                w30 w30Var = (w30) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = w30.f;
                hk0 hk0Var = (hk0) atomicReferenceFieldUpdater3.get(w30Var);
                if (hk0Var == null) {
                    hk0Var = new hk0(w30Var);
                    atomicReferenceFieldUpdater3.set(w30Var, hk0Var);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, hk0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                w30Var.f();
                return;
            }
        }
    }

    @Override // defpackage.nx
    public final boolean b() {
        return true;
    }

    @Override // defpackage.nx
    public final ga0 d() {
        return null;
    }

    public zz getParent() {
        return j();
    }

    public final g00 j() {
        g00 g00Var = this.g;
        if (g00Var != null) {
            return g00Var;
        }
        nz.f0("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.w30
    public final String toString() {
        return getClass().getSimpleName() + '@' + nk.u(this) + "[job@" + nk.u(j()) + ']';
    }
}
