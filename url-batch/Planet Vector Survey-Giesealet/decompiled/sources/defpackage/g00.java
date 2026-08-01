package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class g00 implements zz {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(g00.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(g00.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public g00(boolean z) {
        this._state$volatile = z ? nk.m : nk.l;
    }

    public static jd R(w30 w30Var) {
        while (w30Var.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w30.e;
            w30 f = w30Var.f();
            if (f == null) {
                Object obj = atomicReferenceFieldUpdater.get(w30Var);
                while (true) {
                    w30Var = (w30) obj;
                    if (!w30Var.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(w30Var);
                }
            } else {
                w30Var = f;
            }
        }
        while (true) {
            w30Var = w30Var.h();
            if (!w30Var.i()) {
                if (w30Var instanceof jd) {
                    return (jd) w30Var;
                }
                if (w30Var instanceof ga0) {
                    return null;
                }
            }
        }
    }

    public static String Y(Object obj) {
        if (!(obj instanceof f00)) {
            return obj instanceof nx ? ((nx) obj).b() ? "Active" : "New" : obj instanceof jf ? "Cancelled" : "Completed";
        }
        f00 f00Var = (f00) obj;
        return f00Var.e() ? "Cancelling" : f00.e.get(f00Var) != 0 ? "Completing" : "Active";
    }

    public final boolean A(Throwable th) {
        if (O()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        id idVar = (id) e.get(this);
        return (idVar == null || idVar == ja0.d) ? z : idVar.c(th) || z;
    }

    public String B() {
        return "Job was cancelled";
    }

    public boolean C(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return y(th) && H();
    }

    public final void D(nx nxVar, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        id idVar = (id) atomicReferenceFieldUpdater.get(this);
        if (idVar != null) {
            idVar.a();
            atomicReferenceFieldUpdater.set(this, ja0.d);
        }
        kf kfVar = null;
        jf jfVar = obj instanceof jf ? (jf) obj : null;
        Throwable th = jfVar != null ? jfVar.a : null;
        if (nxVar instanceof c00) {
            try {
                ((c00) nxVar).l(th);
                return;
            } catch (Throwable th2) {
                L(new kf("Exception in completion handler " + nxVar + " for " + this, th2));
                return;
            }
        }
        ga0 d2 = nxVar.d();
        if (d2 != null) {
            d2.e(new k30(1), 1);
            Object obj2 = w30.d.get(d2);
            obj2.getClass();
            for (w30 w30Var = (w30) obj2; !w30Var.equals(d2); w30Var = w30Var.h()) {
                if (w30Var instanceof c00) {
                    try {
                        ((c00) w30Var).l(th);
                    } catch (Throwable th3) {
                        if (kfVar != null) {
                            mz.r(kfVar, th3);
                        } else {
                            kfVar = new kf("Exception in completion handler " + w30Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (kfVar != null) {
                L(kfVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable E(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        g00 g00Var = (g00) obj;
        Object obj2 = d.get(g00Var);
        if (obj2 instanceof f00) {
            cancellationException = ((f00) obj2).c();
        } else if (obj2 instanceof jf) {
            cancellationException = ((jf) obj2).a;
        } else {
            if (obj2 instanceof nx) {
                g8.d(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new a00("Parent job is ".concat(Y(obj2)), cancellationException, g00Var) : cancellationException2;
    }

    public final Object F(f00 f00Var, Object obj) {
        Throwable G;
        jf jfVar = obj instanceof jf ? (jf) obj : null;
        Throwable th = jfVar != null ? jfVar.a : null;
        synchronized (f00Var) {
            f00Var.e();
            ArrayList f = f00Var.f(th);
            G = G(f00Var, f);
            if (G != null && f.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                int size = f.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = f.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != G && th2 != G && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        mz.r(G, th2);
                    }
                }
            }
        }
        if (G != null && G != th) {
            obj = new jf(G, false);
        }
        if (G != null && (A(G) || K(G))) {
            obj.getClass();
            jf.b.compareAndSet((jf) obj, 0, 1);
        }
        T(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object oxVar = obj instanceof nx ? new ox((nx) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, f00Var, oxVar) && atomicReferenceFieldUpdater.get(this) == f00Var) {
        }
        D(f00Var, obj);
        return obj;
    }

    public final Throwable G(f00 f00Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (f00Var.e()) {
                return new a00(B(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof ow0) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof ow0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return this instanceof ff;
    }

    public final ga0 J(nx nxVar) {
        ga0 d2 = nxVar.d();
        if (d2 != null) {
            return d2;
        }
        if (nxVar instanceof rp) {
            return new ga0();
        }
        if (nxVar instanceof c00) {
            W((c00) nxVar);
            return null;
        }
        g8.d(nxVar, "State should have list: ");
        return null;
    }

    public boolean K(Throwable th) {
        return false;
    }

    public final void M(zz zzVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        ja0 ja0Var = ja0.d;
        if (zzVar == null) {
            atomicReferenceFieldUpdater.set(this, ja0Var);
            return;
        }
        zzVar.start();
        id h = zzVar.h(this);
        atomicReferenceFieldUpdater.set(this, h);
        if (d.get(this) instanceof nx) {
            return;
        }
        h.a();
        atomicReferenceFieldUpdater.set(this, ja0Var);
    }

    public final bn N(boolean z, c00 c00Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ja0 ja0Var;
        boolean z2;
        boolean e2;
        c00Var.g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof rp;
            ja0Var = ja0.d;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof nx)) {
                    z2 = false;
                    break;
                }
                nx nxVar = (nx) obj;
                ga0 d2 = nxVar.d();
                if (d2 == null) {
                    W((c00) obj);
                } else {
                    if (c00Var.k()) {
                        f00 f00Var = nxVar instanceof f00 ? (f00) nxVar : null;
                        Throwable c = f00Var != null ? f00Var.c() : null;
                        if (c == null) {
                            e2 = d2.e(c00Var, 5);
                        } else if (z) {
                            c00Var.l(c);
                            return ja0Var;
                        }
                    } else {
                        e2 = d2.e(c00Var, 1);
                    }
                    if (e2) {
                        break;
                    }
                }
            } else {
                rp rpVar = (rp) obj;
                if (rpVar.d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c00Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                V(rpVar);
            }
        }
        if (z2) {
            return c00Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            jf jfVar = obj2 instanceof jf ? (jf) obj2 : null;
            c00Var.l(jfVar != null ? jfVar.a : null);
        }
        return ja0Var;
    }

    public boolean O() {
        return this instanceof s9;
    }

    public final boolean P(Object obj) {
        Object Z;
        do {
            Z = Z(d.get(this), obj);
            if (Z == nk.g) {
                return false;
            }
            if (Z == nk.h) {
                return true;
            }
        } while (Z == nk.i);
        w(Z);
        return true;
    }

    public final Object Q(Object obj) {
        Object Z;
        do {
            Z = Z(d.get(this), obj);
            if (Z == nk.g) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                jf jfVar = obj instanceof jf ? (jf) obj : null;
                throw new IllegalStateException(str, jfVar != null ? jfVar.a : null);
            }
        } while (Z == nk.i);
        return Z;
    }

    public final void S(ga0 ga0Var, Throwable th) {
        ga0Var.e(new k30(4), 4);
        Object obj = w30.d.get(ga0Var);
        obj.getClass();
        kf kfVar = null;
        for (w30 w30Var = (w30) obj; !w30Var.equals(ga0Var); w30Var = w30Var.h()) {
            if ((w30Var instanceof c00) && ((c00) w30Var).k()) {
                try {
                    ((c00) w30Var).l(th);
                } catch (Throwable th2) {
                    if (kfVar != null) {
                        mz.r(kfVar, th2);
                    } else {
                        kfVar = new kf("Exception in completion handler " + w30Var + " for " + this, th2);
                    }
                }
            }
        }
        if (kfVar != null) {
            L(kfVar);
        }
        A(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [mx] */
    public final void V(rp rpVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ga0 ga0Var = new ga0();
        if (!rpVar.d) {
            ga0Var = new mx(ga0Var);
        }
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, rpVar, ga0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == rpVar);
    }

    public final void W(c00 c00Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ga0 ga0Var = new ga0();
        c00Var.getClass();
        w30.e.set(ga0Var, c00Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w30.d;
        atomicReferenceFieldUpdater2.set(ga0Var, c00Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(c00Var) == c00Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(c00Var, c00Var, ga0Var)) {
                    if (atomicReferenceFieldUpdater2.get(c00Var) != c00Var) {
                        break;
                    }
                }
                ga0Var.g(c00Var);
                break loop0;
            }
            break;
        }
        w30 h = c00Var.h();
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c00Var, h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c00Var);
    }

    public final int X(Object obj) {
        boolean z = obj instanceof rp;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (z) {
            if (((rp) obj).d) {
                return 0;
            }
            rp rpVar = nk.m;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rpVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            U();
            return 1;
        }
        if (!(obj instanceof mx)) {
            return 0;
        }
        ga0 ga0Var = ((mx) obj).d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ga0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        U();
        return 1;
    }

    public final Object Z(Object obj, Object obj2) {
        if (!(obj instanceof nx)) {
            return nk.g;
        }
        if (((obj instanceof rp) || (obj instanceof c00)) && !(obj instanceof jd) && !(obj2 instanceof jf)) {
            nx nxVar = (nx) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object oxVar = obj2 instanceof nx ? new ox((nx) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nxVar, oxVar)) {
                if (atomicReferenceFieldUpdater.get(this) != nxVar) {
                    return nk.i;
                }
            }
            T(obj2);
            D(nxVar, obj2);
            return obj2;
        }
        nx nxVar2 = (nx) obj;
        ga0 J = J(nxVar2);
        if (J == null) {
            return nk.i;
        }
        f00 f00Var = nxVar2 instanceof f00 ? (f00) nxVar2 : null;
        if (f00Var == null) {
            f00Var = new f00(J, null);
        }
        synchronized (f00Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f00.e;
            if (atomicIntegerFieldUpdater.get(f00Var) != 0) {
                return nk.g;
            }
            atomicIntegerFieldUpdater.set(f00Var, 1);
            if (f00Var != nxVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, nxVar2, f00Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != nxVar2) {
                        return nk.i;
                    }
                }
            }
            boolean e2 = f00Var.e();
            jf jfVar = obj2 instanceof jf ? (jf) obj2 : null;
            if (jfVar != null) {
                f00Var.a(jfVar.a);
            }
            Throwable c = e2 ? null : f00Var.c();
            if (c != null) {
                S(J, c);
            }
            jd R = R(J);
            if (R != null && a0(f00Var, R, obj2)) {
                return nk.h;
            }
            J.e(new k30(2), 2);
            jd R2 = R(J);
            return (R2 == null || !a0(f00Var, R2, obj2)) ? F(f00Var, obj2) : nk.h;
        }
    }

    @Override // defpackage.zz
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new a00(B(), null, this);
        }
        z(cancellationException);
    }

    public final boolean a0(f00 f00Var, jd jdVar, Object obj) {
        while (nk.A(jdVar.h, false, new e00(this, f00Var, jdVar, obj)) == ja0.d) {
            jdVar = R(jdVar);
            if (jdVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.zz
    public boolean b() {
        Object obj = d.get(this);
        return (obj instanceof nx) && ((nx) obj).b();
    }

    @Override // defpackage.zz
    public final bn g(boolean z, boolean z2, ss ssVar) {
        return N(z2, z ? new wz(ssVar) : new xz(0, ssVar));
    }

    @Override // defpackage.pj
    public final qj getKey() {
        return b2.C;
    }

    @Override // defpackage.zz
    public final id h(g00 g00Var) {
        jd jdVar = new jd(g00Var);
        jdVar.g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof rp) {
                rp rpVar = (rp) obj;
                if (rpVar.d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jdVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                V(rpVar);
            } else {
                boolean z = obj instanceof nx;
                ja0 ja0Var = ja0.d;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    jf jfVar = obj2 instanceof jf ? (jf) obj2 : null;
                    jdVar.l(jfVar != null ? jfVar.a : null);
                    return ja0Var;
                }
                ga0 d2 = ((nx) obj).d();
                if (d2 == null) {
                    W((c00) obj);
                } else if (!d2.e(jdVar, 7)) {
                    boolean e2 = d2.e(jdVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof f00) {
                        r4 = ((f00) obj3).c();
                    } else {
                        jf jfVar2 = obj3 instanceof jf ? (jf) obj3 : null;
                        if (jfVar2 != null) {
                            r4 = jfVar2.a;
                        }
                    }
                    jdVar.l(r4);
                    if (e2) {
                        break loop0;
                    }
                    return ja0Var;
                }
            }
        }
        return jdVar;
    }

    @Override // defpackage.rj
    public final rj i(rj rjVar) {
        return nz.Q(this, rjVar);
    }

    @Override // defpackage.rj
    public final pj k(qj qjVar) {
        return nz.A(this, qjVar);
    }

    @Override // defpackage.zz
    public final CancellationException n() {
        CancellationException cancellationException;
        Object obj = d.get(this);
        if (obj instanceof f00) {
            Throwable c = ((f00) obj).c();
            if (c == null) {
                g8.d(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
            return cancellationException == null ? new a00(concat, c, this) : cancellationException;
        }
        if (obj instanceof nx) {
            g8.d(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof jf)) {
            return new a00(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((jf) obj).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new a00(B(), th, this) : cancellationException;
    }

    @Override // defpackage.rj
    public final Object o(qu quVar, Object obj) {
        return quVar.invoke(obj, this);
    }

    @Override // defpackage.zz
    public final bn q(mu muVar) {
        return N(true, new xz(0, muVar));
    }

    @Override // defpackage.rj
    public final rj s(qj qjVar) {
        return nz.L(this, qjVar);
    }

    @Override // defpackage.zz
    public final boolean start() {
        int X;
        do {
            X = X(d.get(this));
            if (X == 0) {
                return false;
            }
        } while (X != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + Y(d.get(this)) + '}');
        sb.append('@');
        sb.append(nk.u(this));
        return sb.toString();
    }

    @Override // defpackage.zz
    public final Object u(lj ljVar) {
        Object obj;
        ky0 ky0Var;
        do {
            obj = d.get(this);
            boolean z = obj instanceof nx;
            ky0Var = ky0.a;
            if (!z) {
                nk.n(ljVar.getContext());
                return ky0Var;
            }
        } while (X(obj) < 0);
        int i = 1;
        hc hcVar = new hc(1, d31.B(ljVar));
        hcVar.q();
        hcVar.t(new dc(i, nk.A(this, true, new hd(hcVar, i))));
        Object p = hcVar.p();
        ck ckVar = ck.d;
        if (p != ckVar) {
            p = ky0Var;
        }
        return p == ckVar ? p : ky0Var;
    }

    public void x(Object obj) {
        w(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == defpackage.nk.h) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(Object obj) {
        op opVar;
        Object obj2 = nk.g;
        if (I()) {
            do {
                Object obj3 = d.get(this);
                if (obj3 instanceof nx) {
                    if (obj3 instanceof f00) {
                        if (f00.e.get((f00) obj3) != 0) {
                        }
                    }
                    obj2 = Z(obj3, new jf(E(obj), false));
                }
                obj2 = nk.g;
                break;
            } while (obj2 == nk.i);
        }
        if (obj2 == nk.g) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof f00)) {
                    if (!(obj4 instanceof nx)) {
                        opVar = nk.j;
                        break;
                    }
                    if (th == null) {
                        th = E(obj);
                    }
                    nx nxVar = (nx) obj4;
                    if (nxVar.b()) {
                        ga0 J = J(nxVar);
                        if (J != null) {
                            f00 f00Var = new f00(J, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, nxVar, f00Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != nxVar) {
                                    break;
                                }
                            }
                            S(J, th);
                            opVar = nk.g;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object Z = Z(obj4, new jf(th, false));
                        if (Z == nk.g) {
                            g8.d(obj4, "Cannot happen in ");
                            return false;
                        }
                        if (Z != nk.i) {
                            obj2 = Z;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (f00.g.get((f00) obj4) == nk.k) {
                            opVar = nk.j;
                        } else {
                            boolean e2 = ((f00) obj4).e();
                            if (th == null) {
                                th = E(obj);
                            }
                            ((f00) obj4).a(th);
                            Throwable c = e2 ? null : ((f00) obj4).c();
                            if (c != null) {
                                S(((f00) obj4).d, c);
                            }
                            opVar = nk.g;
                        }
                    }
                }
            }
            obj2 = opVar;
        }
        if (obj2 != nk.g && obj2 != nk.h) {
            if (obj2 == nk.j) {
                return false;
            }
            w(obj2);
            return true;
        }
        return true;
    }

    public void z(CancellationException cancellationException) {
        y(cancellationException);
    }

    public void U() {
    }

    public void L(kf kfVar) {
        throw kfVar;
    }

    public void T(Object obj) {
    }

    public void w(Object obj) {
    }
}
