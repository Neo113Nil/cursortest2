package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class hc extends tm implements fc, dk, u01 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(hc.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(hc.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(hc.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final kj g;
    public final rj h;

    public hc(int i2, kj kjVar) {
        super(i2);
        this.g = kjVar;
        this.h = kjVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = m1.a;
    }

    public static Object C(la0 la0Var, Object obj, int i2, ru ruVar) {
        if (obj instanceof jf) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (ruVar != null || (la0Var instanceof dc)) {
            return new gf(obj, la0Var instanceof dc ? (dc) la0Var : null, ruVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void w(la0 la0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + la0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i2, ru ruVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof la0) {
                Object C = C((la0) obj2, obj, i2, ruVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!u()) {
                    m();
                }
                n(i2);
                return;
            }
            if (obj2 instanceof ic) {
                ic icVar = (ic) obj2;
                if (ic.c.compareAndSet(icVar, 0, 1)) {
                    if (ruVar != null) {
                        k(ruVar, icVar.a, obj);
                        return;
                    }
                    return;
                }
            }
            g8.d(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void B(uj ujVar) {
        kj kjVar = this.g;
        rm rmVar = kjVar instanceof rm ? (rm) kjVar : null;
        A(ky0.a, (rmVar != null ? rmVar.g : null) == ujVar ? 4 : this.f, null);
    }

    @Override // defpackage.u01
    public final void a(kp0 kp0Var, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = i;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                g8.s("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        t(kp0Var);
    }

    @Override // defpackage.tm
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof la0) {
                g8.s("Not completed");
                return;
            }
            if (obj instanceof jf) {
                return;
            }
            if (!(obj instanceof gf)) {
                cancellationException2 = cancellationException;
                gf gfVar = new gf(obj, (dc) null, (ru) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gfVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            gf gfVar2 = (gf) obj;
            if (gfVar2.e != null) {
                g8.s("Must be called at most once");
                return;
            }
            gf a = gf.a(gfVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            dc dcVar = gfVar2.b;
            if (dcVar != null) {
                i(dcVar, cancellationException);
            }
            ru ruVar = gfVar2.c;
            if (ruVar != null) {
                k(ruVar, cancellationException, gfVar2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.tm
    public final kj c() {
        return this.g;
    }

    @Override // defpackage.fc
    public final op d(Object obj, ru ruVar) {
        op opVar = px0.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof la0)) {
                return null;
            }
            Object C = C((la0) obj2, obj, this.f, ruVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!u()) {
                m();
            }
            return opVar;
        }
    }

    @Override // defpackage.tm
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // defpackage.tm
    public final Object f(Object obj) {
        return obj instanceof gf ? ((gf) obj).a : obj;
    }

    @Override // defpackage.dk
    public final dk getCallerFrame() {
        kj kjVar = this.g;
        if (kjVar instanceof dk) {
            return (dk) kjVar;
        }
        return null;
    }

    @Override // defpackage.kj
    public final rj getContext() {
        return this.h;
    }

    @Override // defpackage.tm
    public final Object h() {
        return j.get(this);
    }

    public final void i(dc dcVar, Throwable th) {
        try {
            switch (dcVar.a) {
                case 0:
                    ((mu) dcVar.b).c(th);
                    break;
                default:
                    ((bn) dcVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            d31.A(this.h, new kf("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.fc
    public final boolean j(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof la0)) {
                return false;
            }
            ic icVar = new ic(this, th, (obj instanceof dc) || (obj instanceof kp0));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, icVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            la0 la0Var = (la0) obj;
            if (la0Var instanceof dc) {
                i((dc) obj, th);
            } else if (la0Var instanceof kp0) {
                l((kp0) obj, th);
            }
            if (!u()) {
                m();
            }
            n(this.f);
            return true;
        }
    }

    public final void k(ru ruVar, Throwable th, Object obj) {
        rj rjVar = this.h;
        try {
            ruVar.b(th, obj, rjVar);
        } catch (Throwable th2) {
            d31.A(rjVar, new kf("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(kp0 kp0Var, Throwable th) {
        rj rjVar = this.h;
        int i2 = i.get(this) & 536870911;
        if (i2 == 536870911) {
            g8.s("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            kp0Var.g(i2, rjVar);
        } catch (Throwable th2) {
            d31.A(rjVar, new kf("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        bn bnVar = (bn) atomicReferenceFieldUpdater.get(this);
        if (bnVar == null) {
            return;
        }
        bnVar.a();
        atomicReferenceFieldUpdater.set(this, ja0.d);
    }

    public final void n(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = i;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    g8.s("Already resumed");
                    return;
                }
                boolean z = i2 == 4;
                kj kjVar = this.g;
                if (!z && (kjVar instanceof rm)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.f;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        rm rmVar = (rm) kjVar;
                        uj ujVar = rmVar.g;
                        rj context = rmVar.h.getContext();
                        if (ujVar.f(context)) {
                            ujVar.d(context, this);
                            return;
                        }
                        pq a = hw0.a();
                        if (a.f >= 4294967296L) {
                            a.p(this);
                            return;
                        }
                        a.r(true);
                        try {
                            px0.R(this, kjVar, true);
                            do {
                            } while (a.w());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                px0.R(this, kjVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable o(g00 g00Var) {
        return g00Var.n();
    }

    public final Object p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        zz zzVar;
        boolean u = u();
        do {
            atomicIntegerFieldUpdater = i;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    g8.s("Already suspended");
                    return null;
                }
                if (u) {
                    y();
                }
                Object obj = j.get(this);
                if (obj instanceof jf) {
                    throw ((jf) obj).a;
                }
                int i4 = this.f;
                if ((i4 != 1 && i4 != 2) || (zzVar = (zz) this.h.k(b2.C)) == null || zzVar.b()) {
                    return f(obj);
                }
                CancellationException n = zzVar.n();
                b(n);
                throw n;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((bn) k.get(this)) == null) {
            r();
        }
        if (u) {
            y();
        }
        return ck.d;
    }

    public final void q() {
        bn r = r();
        if (r == null || (j.get(this) instanceof la0)) {
            return;
        }
        r.a();
        k.set(this, ja0.d);
    }

    public final bn r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        zz zzVar = (zz) this.h.k(b2.C);
        if (zzVar == null) {
            return null;
        }
        bn A = nk.A(zzVar, true, new hd(this, 0));
        do {
            atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, A)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return A;
    }

    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        Throwable a = vk0.a(obj);
        if (a != null) {
            obj = new jf(a, false);
        }
        A(obj, this.f, null);
    }

    public final void s(mu muVar) {
        t(new dc(0, muVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        w(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(la0 la0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof m1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, la0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof dc) || (obj instanceof kp0)) {
                break;
            }
            if (obj instanceof jf) {
                jf jfVar = (jf) obj;
                if (!jf.b.compareAndSet(jfVar, 0, 1)) {
                    w(la0Var, obj);
                    throw null;
                }
                if (obj instanceof ic) {
                    Throwable th = jfVar.a;
                    if (la0Var instanceof dc) {
                        i((dc) la0Var, th);
                        return;
                    } else {
                        l((kp0) la0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof gf)) {
                if (la0Var instanceof kp0) {
                    return;
                }
                gf gfVar = new gf(obj, (dc) la0Var, (ru) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gfVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            gf gfVar2 = (gf) obj;
            if (gfVar2.b != null) {
                w(la0Var, obj);
                throw null;
            }
            if (la0Var instanceof kp0) {
                return;
            }
            dc dcVar = (dc) la0Var;
            Throwable th2 = gfVar2.e;
            if (th2 != null) {
                i(dcVar, th2);
                return;
            }
            gf a = gf.a(gfVar2, dcVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(nk.M(this.g));
        sb.append("){");
        Object obj = j.get(this);
        sb.append(obj instanceof la0 ? "Active" : obj instanceof ic ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(nk.u(this));
        return sb.toString();
    }

    public final boolean u() {
        if (this.f == 2) {
            return rm.k.get((rm) this.g) != null;
        }
        return false;
    }

    @Override // defpackage.fc
    public final void v(Object obj) {
        n(this.f);
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        kj kjVar = this.g;
        Throwable th = null;
        rm rmVar = kjVar instanceof rm ? (rm) kjVar : null;
        if (rmVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rm.k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(rmVar);
                op opVar = d31.c;
                if (obj == opVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(rmVar, opVar, this)) {
                        if (atomicReferenceFieldUpdater.get(rmVar) != opVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        g8.d(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(rmVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(rmVar) != obj) {
                            g8.r("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m();
            j(th);
        }
    }

    public final void z(Object obj, ru ruVar) {
        A(obj, this.f, ruVar);
    }
}
