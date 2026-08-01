package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class w30 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(w30.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(w30.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(w30.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(w30 w30Var, int i) {
        while (true) {
            w30 f2 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (f2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f2 = (w30) obj;
                    if (!f2.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f2);
                }
            }
            if (f2 instanceof k30) {
                return (((k30) f2).g & i) == 0 && f2.e(w30Var, i);
            }
            atomicReferenceFieldUpdater.set(w30Var, f2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
            atomicReferenceFieldUpdater2.set(w30Var, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f2, this, w30Var)) {
                if (atomicReferenceFieldUpdater2.get(f2) != this) {
                    break;
                }
            }
            w30Var.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((defpackage.hk0) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w30 f() {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            w30 w30Var = (w30) atomicReferenceFieldUpdater.get(this);
            w30 w30Var2 = w30Var;
            while (true) {
                w30 w30Var3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
                    Object obj = atomicReferenceFieldUpdater2.get(w30Var2);
                    if (obj == this) {
                        if (w30Var != w30Var2) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, w30Var, w30Var2)) {
                                if (atomicReferenceFieldUpdater.get(this) != w30Var) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof hk0)) {
                        obj.getClass();
                        w30Var3 = w30Var2;
                        w30Var2 = (w30) obj;
                    } else {
                        if (w30Var3 != null) {
                            break;
                        }
                        w30Var2 = (w30) atomicReferenceFieldUpdater.get(w30Var2);
                    }
                }
                w30Var2 = w30Var3;
            }
        }
    }

    public final void g(w30 w30Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            w30 w30Var2 = (w30) atomicReferenceFieldUpdater.get(w30Var);
            if (d.get(this) != w30Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(w30Var, w30Var2, this)) {
                if (atomicReferenceFieldUpdater.get(w30Var) != w30Var2) {
                    break;
                }
            }
            if (i()) {
                w30Var.f();
                return;
            }
            return;
        }
    }

    public final w30 h() {
        Object obj = d.get(this);
        hk0 hk0Var = obj instanceof hk0 ? (hk0) obj : null;
        if (hk0Var != null) {
            return hk0Var.a;
        }
        obj.getClass();
        return (w30) obj;
    }

    public boolean i() {
        return d.get(this) instanceof hk0;
    }

    public String toString() {
        return new v30(this, nk.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + nk.u(this);
    }
}
