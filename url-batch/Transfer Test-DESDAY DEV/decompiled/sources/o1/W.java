package o1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class W implements O, a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3301a = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3302b = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public W(boolean z2) {
        this._state = z2 ? AbstractC0302t.i : AbstractC0302t.h;
    }

    public static C0292i C(s1.i iVar) {
        while (iVar.m()) {
            s1.i i = iVar.i();
            if (i == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.i.f3704b;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (s1.i) obj;
                    if (!iVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = i;
            }
        }
        while (true) {
            iVar = iVar.l();
            if (!iVar.m()) {
                if (iVar instanceof C0292i) {
                    return (C0292i) iVar;
                }
                if (iVar instanceof X) {
                    return null;
                }
            }
        }
    }

    public static String H(Object obj) {
        if (!(obj instanceof U)) {
            return obj instanceof L ? ((L) obj).a() ? "Active" : "New" : obj instanceof C0294k ? "Cancelled" : "Completed";
        }
        U u2 = (U) obj;
        return u2.e() ? "Cancelling" : u2.f() ? "Completing" : "Active";
    }

    public boolean A() {
        return false;
    }

    public final Object B(Object obj) {
        Object I2;
        do {
            I2 = I(w(), obj);
            if (I2 == AbstractC0302t.f3337c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0294k c0294k = obj instanceof C0294k ? (C0294k) obj : null;
                throw new IllegalStateException(str, c0294k != null ? c0294k.f3324a : null);
            }
        } while (I2 == AbstractC0302t.f3338e);
        return I2;
    }

    public final void D(X x2, Throwable th) {
        Object k2 = x2.k();
        g1.f.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        U0.c cVar = null;
        for (s1.i iVar = (s1.i) k2; !iVar.equals(x2); iVar = iVar.l()) {
            if (iVar instanceof Q) {
                S s2 = (S) iVar;
                try {
                    s2.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        T.e.g(cVar, th2);
                    } else {
                        cVar = new U0.c("Exception in completion handler " + s2 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            y(cVar);
        }
        k(th);
    }

    public void E(Object obj) {
    }

    public void F() {
    }

    public final void G(S s2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x2 = new X();
        s2.getClass();
        s1.i.f3704b.lazySet(x2, s2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s1.i.f3703a;
        atomicReferenceFieldUpdater2.lazySet(x2, s2);
        loop0: while (true) {
            if (s2.k() == s2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(s2, s2, x2)) {
                    if (atomicReferenceFieldUpdater2.get(s2) != s2) {
                        break;
                    }
                }
                x2.j(s2);
                break loop0;
            }
            break;
        }
        s1.i l2 = s2.l();
        do {
            atomicReferenceFieldUpdater = f3301a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, s2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == s2);
    }

    public final Object I(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof L)) {
            return AbstractC0302t.f3337c;
        }
        if (((obj instanceof B) || (obj instanceof S)) && !(obj instanceof C0292i) && !(obj2 instanceof C0294k)) {
            L l2 = (L) obj;
            Object m2 = obj2 instanceof L ? new M((L) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f3301a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, m2)) {
                    E(obj2);
                    p(l2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == l2);
            return AbstractC0302t.f3338e;
        }
        L l3 = (L) obj;
        X v2 = v(l3);
        if (v2 == null) {
            return AbstractC0302t.f3338e;
        }
        C0292i c0292i = null;
        U u2 = l3 instanceof U ? (U) l3 : null;
        if (u2 == null) {
            u2 = new U(v2, null);
        }
        synchronized (u2) {
            if (u2.f()) {
                return AbstractC0302t.f3337c;
            }
            U.f3295b.set(u2, 1);
            if (u2 != l3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3301a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l3, u2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l3) {
                        return AbstractC0302t.f3338e;
                    }
                }
            }
            boolean e2 = u2.e();
            C0294k c0294k = obj2 instanceof C0294k ? (C0294k) obj2 : null;
            if (c0294k != null) {
                u2.c(c0294k.f3324a);
            }
            Throwable d = u2.d();
            if (e2) {
                d = null;
            }
            if (d != null) {
                D(v2, d);
            }
            C0292i c0292i2 = l3 instanceof C0292i ? (C0292i) l3 : null;
            if (c0292i2 == null) {
                X b2 = l3.b();
                if (b2 != null) {
                    c0292i = C(b2);
                }
            } else {
                c0292i = c0292i2;
            }
            if (c0292i != null) {
                while (AbstractC0302t.g(c0292i.f3318e, false, new T(this, u2, c0292i, obj2), 1) == Y.f3303a) {
                    c0292i = C(c0292i);
                    if (c0292i == null) {
                    }
                }
                return AbstractC0302t.d;
            }
            return r(u2, obj2);
        }
    }

    @Override // o1.O
    public boolean a() {
        Object w2 = w();
        return (w2 instanceof L) && ((L) w2).a();
    }

    public final boolean d(L l2, X x2, S s2) {
        char c2;
        V v2 = new V(s2, this, l2);
        do {
            s1.i i = x2.i();
            if (i == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.i.f3704b;
                Object obj = atomicReferenceFieldUpdater.get(x2);
                while (true) {
                    i = (s1.i) obj;
                    if (!i.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i);
                }
            }
            s1.i.f3704b.lazySet(s2, i);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s1.i.f3703a;
            atomicReferenceFieldUpdater2.lazySet(s2, x2);
            v2.f3299c = x2;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(i, x2, v2)) {
                    c2 = v2.a(i) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(i) != x2) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void f(Object obj) {
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override // X0.g
    public final X0.h getKey() {
        return C0300q.f3334b;
    }

    public final boolean i(Object obj) {
        U.q qVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0302t.f3337c;
        if (this instanceof c0) {
            do {
                Object w2 = w();
                if (!(w2 instanceof L) || ((w2 instanceof U) && ((U) w2).f())) {
                    obj2 = AbstractC0302t.f3337c;
                    break;
                }
                obj2 = I(w2, new C0294k(q(obj), false));
            } while (obj2 == AbstractC0302t.f3338e);
            if (obj2 == AbstractC0302t.d) {
                return true;
            }
        }
        if (obj2 == AbstractC0302t.f3337c) {
            Throwable th = null;
            loop1: while (true) {
                Object w3 = w();
                if (!(w3 instanceof U)) {
                    if (!(w3 instanceof L)) {
                        qVar = AbstractC0302t.f3339f;
                        break;
                    }
                    if (th == null) {
                        th = q(obj);
                    }
                    L l2 = (L) w3;
                    if (l2.a()) {
                        X v2 = v(l2);
                        if (v2 == null) {
                            continue;
                        } else {
                            U u2 = new U(v2, th);
                            do {
                                atomicReferenceFieldUpdater = f3301a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, u2)) {
                                    D(v2, th);
                                    qVar = AbstractC0302t.f3337c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == l2);
                        }
                    } else {
                        Object I2 = I(w3, new C0294k(th, false));
                        if (I2 == AbstractC0302t.f3337c) {
                            throw new IllegalStateException(("Cannot happen in " + w3).toString());
                        }
                        if (I2 != AbstractC0302t.f3338e) {
                            obj2 = I2;
                            break;
                        }
                    }
                } else {
                    synchronized (w3) {
                        try {
                            U u3 = (U) w3;
                            u3.getClass();
                            if (U.d.get(u3) == AbstractC0302t.f3340g) {
                                qVar = AbstractC0302t.f3339f;
                            } else {
                                boolean e2 = ((U) w3).e();
                                if (th == null) {
                                    th = q(obj);
                                }
                                ((U) w3).c(th);
                                Throwable d = e2 ? null : ((U) w3).d();
                                if (d != null) {
                                    D(((U) w3).f3297a, d);
                                }
                                qVar = AbstractC0302t.f3337c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = qVar;
        }
        if (obj2 == AbstractC0302t.f3337c || obj2 == AbstractC0302t.d) {
            return true;
        }
        if (obj2 == AbstractC0302t.f3339f) {
            return false;
        }
        f(obj2);
        return true;
    }

    @Override // X0.i
    public final X0.g j(X0.h hVar) {
        return T.e.u(this, hVar);
    }

    public final boolean k(Throwable th) {
        if (A()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0291h interfaceC0291h = (InterfaceC0291h) f3302b.get(this);
        return (interfaceC0291h == null || interfaceC0291h == Y.f3303a) ? z2 : interfaceC0291h.h(th) || z2;
    }

    public String l() {
        return "Job was cancelled";
    }

    @Override // X0.i
    public final X0.i m(X0.i iVar) {
        g1.f.e(iVar, "context");
        return T.e.P(this, iVar);
    }

    @Override // X0.i
    public final X0.i n(X0.h hVar) {
        return T.e.F(this, hVar);
    }

    public boolean o(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return i(th) && u();
    }

    public final void p(L l2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3302b;
        InterfaceC0291h interfaceC0291h = (InterfaceC0291h) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0291h != null) {
            interfaceC0291h.e();
            atomicReferenceFieldUpdater.set(this, Y.f3303a);
        }
        U0.c cVar = null;
        C0294k c0294k = obj instanceof C0294k ? (C0294k) obj : null;
        Throwable th = c0294k != null ? c0294k.f3324a : null;
        if (l2 instanceof S) {
            try {
                ((S) l2).o(th);
                return;
            } catch (Throwable th2) {
                y(new U0.c("Exception in completion handler " + l2 + " for " + this, th2));
                return;
            }
        }
        X b2 = l2.b();
        if (b2 != null) {
            Object k2 = b2.k();
            g1.f.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (s1.i iVar = (s1.i) k2; !iVar.equals(b2); iVar = iVar.l()) {
                if (iVar instanceof S) {
                    S s2 = (S) iVar;
                    try {
                        s2.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            T.e.g(cVar, th3);
                        } else {
                            cVar = new U0.c("Exception in completion handler " + s2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                y(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable q(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        W w2 = (W) ((a0) obj);
        Object w3 = w2.w();
        if (w3 instanceof U) {
            cancellationException = ((U) w3).d();
        } else if (w3 instanceof C0294k) {
            cancellationException = ((C0294k) w3).f3324a;
        } else {
            if (w3 instanceof L) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + w3).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new P("Parent job is ".concat(H(w3)), cancellationException, w2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object r(U u2, Object obj) {
        Throwable th = null;
        C0294k c0294k = obj instanceof C0294k ? (C0294k) obj : null;
        Throwable th2 = c0294k != null ? c0294k.f3324a : null;
        synchronized (u2) {
            u2.e();
            ArrayList<Throwable> g2 = u2.g(th2);
            if (!g2.isEmpty()) {
                Iterator it = g2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g2.get(0);
                }
            } else if (u2.e()) {
                th = new P(l(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        T.e.g(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0294k(th, false);
        }
        if (th != null && (k(th) || x(th))) {
            g1.f.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0294k.f3323b.compareAndSet((C0294k) obj, 0, 1);
        }
        E(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3301a;
        Object m2 = obj instanceof L ? new M((L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, u2, m2) && atomicReferenceFieldUpdater.get(this) == u2) {
        }
        p(u2, obj);
        return obj;
    }

    public final CancellationException s() {
        CancellationException cancellationException;
        Object w2 = w();
        if (!(w2 instanceof U)) {
            if (w2 instanceof L) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(w2 instanceof C0294k)) {
                return new P(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0294k) w2).f3324a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new P(l(), th, this) : cancellationException;
        }
        Throwable d = ((U) w2).d();
        if (d == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d instanceof CancellationException ? (CancellationException) d : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = l();
        }
        return new P(concat, d, this);
    }

    @Override // X0.i
    public final Object t(Object obj, f1.p pVar) {
        return pVar.d(obj, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + H(w()) + '}');
        sb.append('@');
        sb.append(AbstractC0302t.e(this));
        return sb.toString();
    }

    public boolean u() {
        return true;
    }

    public final X v(L l2) {
        X b2 = l2.b();
        if (b2 != null) {
            return b2;
        }
        if (l2 instanceof B) {
            return new X();
        }
        if (l2 instanceof S) {
            G((S) l2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l2).toString());
    }

    public final Object w() {
        while (true) {
            Object obj = f3301a.get(this);
            if (!(obj instanceof s1.n)) {
                return obj;
            }
            ((s1.n) obj).a(this);
        }
    }

    public boolean x(Throwable th) {
        return false;
    }

    public void y(U0.c cVar) {
        throw cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EDGE_INSN: B:31:0x0055->B:25:0x0055 BREAK  A[LOOP:0: B:7:0x000c->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(O o2) {
        boolean z2;
        Y y2 = Y.f3303a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3302b;
        if (o2 == null) {
            atomicReferenceFieldUpdater.set(this, y2);
            return;
        }
        W w2 = (W) o2;
        do {
            Object w3 = w2.w();
            boolean z3 = w3 instanceof B;
            z2 = false;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3301a;
            if (z3) {
                if (!((B) w3).f3276a) {
                    B b2 = AbstractC0302t.i;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(w2, w3, b2)) {
                        if (atomicReferenceFieldUpdater2.get(w2) != w3) {
                            z2 = -1;
                            break;
                        }
                    }
                    w2.getClass();
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            } else {
                if (w3 instanceof K) {
                    X x2 = ((K) w3).f3287a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(w2, w3, x2)) {
                        if (atomicReferenceFieldUpdater2.get(w2) != w3) {
                            z2 = -1;
                            break;
                        }
                    }
                    w2.getClass();
                    z2 = true;
                }
                if (z2) {
                }
            }
        } while (!z2);
        InterfaceC0291h interfaceC0291h = (InterfaceC0291h) AbstractC0302t.g(w2, true, new C0292i(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0291h);
        if (w() instanceof L) {
            return;
        }
        interfaceC0291h.e();
        atomicReferenceFieldUpdater.set(this, y2);
    }
}
