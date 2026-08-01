package q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class U implements M, Y {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3882a = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3883b = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public U(boolean z2) {
        this._state = z2 ? AbstractC0352s.h : AbstractC0352s.f3919g;
    }

    public static C0342h A(u1.i iVar) {
        while (iVar.m()) {
            u1.i i = iVar.i();
            if (i == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.i.f4191b;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (u1.i) obj;
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
                if (iVar instanceof C0342h) {
                    return (C0342h) iVar;
                }
                if (iVar instanceof V) {
                    return null;
                }
            }
        }
    }

    public static String F(Object obj) {
        if (!(obj instanceof S)) {
            return obj instanceof I ? ((I) obj).a() ? "Active" : "New" : obj instanceof C0344j ? "Cancelled" : "Completed";
        }
        S s2 = (S) obj;
        return s2.e() ? "Cancelling" : s2.f() ? "Completing" : "Active";
    }

    public final void B(V v2, Throwable th) {
        Object k2 = v2.k();
        i1.f.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        V0.c cVar = null;
        for (u1.i iVar = (u1.i) k2; !iVar.equals(v2); iVar = iVar.l()) {
            if (iVar instanceof O) {
                P p2 = (P) iVar;
                try {
                    p2.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        F1.d.k(cVar, th2);
                    } else {
                        cVar = new V0.c("Exception in completion handler " + p2 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            w(cVar);
        }
        k(th);
    }

    public void C(Object obj) {
    }

    public void D() {
    }

    public final void E(P p2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        V v2 = new V();
        p2.getClass();
        u1.i.f4191b.lazySet(v2, p2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u1.i.f4190a;
        atomicReferenceFieldUpdater2.lazySet(v2, p2);
        loop0: while (true) {
            if (p2.k() == p2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(p2, p2, v2)) {
                    if (atomicReferenceFieldUpdater2.get(p2) != p2) {
                        break;
                    }
                }
                v2.j(p2);
                break loop0;
            }
            break;
        }
        u1.i l2 = p2.l();
        do {
            atomicReferenceFieldUpdater = f3882a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == p2);
    }

    public final Object G(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof I)) {
            return AbstractC0352s.f3915b;
        }
        if (((obj instanceof A) || (obj instanceof P)) && !(obj instanceof C0342h) && !(obj2 instanceof C0344j)) {
            I i = (I) obj;
            Object j2 = obj2 instanceof I ? new J((I) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f3882a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, i, j2)) {
                    C(obj2);
                    n(i, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == i);
            return AbstractC0352s.d;
        }
        I i2 = (I) obj;
        V t2 = t(i2);
        if (t2 == null) {
            return AbstractC0352s.d;
        }
        C0342h c0342h = null;
        S s2 = i2 instanceof S ? (S) i2 : null;
        if (s2 == null) {
            s2 = new S(t2, null);
        }
        synchronized (s2) {
            if (s2.f()) {
                return AbstractC0352s.f3915b;
            }
            S.f3876b.set(s2, 1);
            if (s2 != i2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3882a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, i2, s2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != i2) {
                        return AbstractC0352s.d;
                    }
                }
            }
            boolean e2 = s2.e();
            C0344j c0344j = obj2 instanceof C0344j ? (C0344j) obj2 : null;
            if (c0344j != null) {
                s2.c(c0344j.f3903a);
            }
            Throwable d = s2.d();
            if (e2) {
                d = null;
            }
            if (d != null) {
                B(t2, d);
            }
            C0342h c0342h2 = i2 instanceof C0342h ? (C0342h) i2 : null;
            if (c0342h2 == null) {
                V b2 = i2.b();
                if (b2 != null) {
                    c0342h = A(b2);
                }
            } else {
                c0342h = c0342h2;
            }
            if (c0342h != null) {
                while (AbstractC0352s.e(c0342h.f3897e, false, new Q(this, s2, c0342h, obj2), 1) == W.f3884a) {
                    c0342h = A(c0342h);
                    if (c0342h == null) {
                    }
                }
                return AbstractC0352s.f3916c;
            }
            return p(s2, obj2);
        }
    }

    @Override // q1.M
    public boolean a() {
        Object u2 = u();
        return (u2 instanceof I) && ((I) u2).a();
    }

    public final boolean c(I i, V v2, P p2) {
        char c2;
        T t2 = new T(p2, this, i);
        do {
            u1.i i2 = v2.i();
            if (i2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.i.f4191b;
                Object obj = atomicReferenceFieldUpdater.get(v2);
                while (true) {
                    i2 = (u1.i) obj;
                    if (!i2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i2);
                }
            }
            u1.i.f4191b.lazySet(p2, i2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u1.i.f4190a;
            atomicReferenceFieldUpdater2.lazySet(p2, v2);
            t2.f3880c = v2;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(i2, v2, t2)) {
                    c2 = t2.a(i2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(i2) != v2) {
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

    public void d(Object obj) {
    }

    public void e(Object obj) {
        d(obj);
    }

    @Override // Z0.i
    public final Z0.g f(Z0.h hVar) {
        return F1.d.A(this, hVar);
    }

    public final void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new N(l(), null, this);
        }
        j(cancellationException);
    }

    @Override // Z0.g
    public final Z0.h getKey() {
        return C0350p.f3913b;
    }

    @Override // Z0.i
    public final Z0.i h(Z0.i iVar) {
        return F1.d.Y(this, iVar);
    }

    @Override // Z0.i
    public final Z0.i i(Z0.h hVar) {
        return F1.d.S(this, hVar);
    }

    public final boolean j(Object obj) {
        U.q qVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0352s.f3915b;
        if (this instanceof a0) {
            do {
                Object u2 = u();
                if (!(u2 instanceof I) || ((u2 instanceof S) && ((S) u2).f())) {
                    obj2 = AbstractC0352s.f3915b;
                    break;
                }
                obj2 = G(u2, new C0344j(o(obj), false));
            } while (obj2 == AbstractC0352s.d);
            if (obj2 == AbstractC0352s.f3916c) {
                return true;
            }
        }
        if (obj2 == AbstractC0352s.f3915b) {
            Throwable th = null;
            loop1: while (true) {
                Object u3 = u();
                if (!(u3 instanceof S)) {
                    if (!(u3 instanceof I)) {
                        qVar = AbstractC0352s.f3917e;
                        break;
                    }
                    if (th == null) {
                        th = o(obj);
                    }
                    I i = (I) u3;
                    if (i.a()) {
                        V t2 = t(i);
                        if (t2 == null) {
                            continue;
                        } else {
                            S s2 = new S(t2, th);
                            do {
                                atomicReferenceFieldUpdater = f3882a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, i, s2)) {
                                    B(t2, th);
                                    qVar = AbstractC0352s.f3915b;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == i);
                        }
                    } else {
                        Object G2 = G(u3, new C0344j(th, false));
                        if (G2 == AbstractC0352s.f3915b) {
                            throw new IllegalStateException(("Cannot happen in " + u3).toString());
                        }
                        if (G2 != AbstractC0352s.d) {
                            obj2 = G2;
                            break;
                        }
                    }
                } else {
                    synchronized (u3) {
                        try {
                            S s3 = (S) u3;
                            s3.getClass();
                            if (S.d.get(s3) == AbstractC0352s.f3918f) {
                                qVar = AbstractC0352s.f3917e;
                            } else {
                                boolean e2 = ((S) u3).e();
                                if (th == null) {
                                    th = o(obj);
                                }
                                ((S) u3).c(th);
                                Throwable d = e2 ? null : ((S) u3).d();
                                if (d != null) {
                                    B(((S) u3).f3878a, d);
                                }
                                qVar = AbstractC0352s.f3915b;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = qVar;
        }
        if (obj2 == AbstractC0352s.f3915b || obj2 == AbstractC0352s.f3916c) {
            return true;
        }
        if (obj2 == AbstractC0352s.f3917e) {
            return false;
        }
        d(obj2);
        return true;
    }

    public final boolean k(Throwable th) {
        if (y()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0341g interfaceC0341g = (InterfaceC0341g) f3883b.get(this);
        return (interfaceC0341g == null || interfaceC0341g == W.f3884a) ? z2 : interfaceC0341g.h(th) || z2;
    }

    public String l() {
        return "Job was cancelled";
    }

    public boolean m(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return j(th) && s();
    }

    public final void n(I i, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3883b;
        InterfaceC0341g interfaceC0341g = (InterfaceC0341g) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0341g != null) {
            interfaceC0341g.e();
            atomicReferenceFieldUpdater.set(this, W.f3884a);
        }
        V0.c cVar = null;
        C0344j c0344j = obj instanceof C0344j ? (C0344j) obj : null;
        Throwable th = c0344j != null ? c0344j.f3903a : null;
        if (i instanceof P) {
            try {
                ((P) i).o(th);
                return;
            } catch (Throwable th2) {
                w(new V0.c("Exception in completion handler " + i + " for " + this, th2));
                return;
            }
        }
        V b2 = i.b();
        if (b2 != null) {
            Object k2 = b2.k();
            i1.f.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (u1.i iVar = (u1.i) k2; !iVar.equals(b2); iVar = iVar.l()) {
                if (iVar instanceof P) {
                    P p2 = (P) iVar;
                    try {
                        p2.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            F1.d.k(cVar, th3);
                        } else {
                            cVar = new V0.c("Exception in completion handler " + p2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                w(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable o(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        U u2 = (U) ((Y) obj);
        Object u3 = u2.u();
        if (u3 instanceof S) {
            cancellationException = ((S) u3).d();
        } else if (u3 instanceof C0344j) {
            cancellationException = ((C0344j) u3).f3903a;
        } else {
            if (u3 instanceof I) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + u3).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new N("Parent job is ".concat(F(u3)), cancellationException, u2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object p(S s2, Object obj) {
        Throwable th = null;
        C0344j c0344j = obj instanceof C0344j ? (C0344j) obj : null;
        Throwable th2 = c0344j != null ? c0344j.f3903a : null;
        synchronized (s2) {
            s2.e();
            ArrayList<Throwable> g2 = s2.g(th2);
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
            } else if (s2.e()) {
                th = new N(l(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        F1.d.k(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0344j(th, false);
        }
        if (th != null && (k(th) || v(th))) {
            i1.f.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0344j.f3902b.compareAndSet((C0344j) obj, 0, 1);
        }
        C(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3882a;
        Object j2 = obj instanceof I ? new J((I) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, s2, j2) && atomicReferenceFieldUpdater.get(this) == s2) {
        }
        n(s2, obj);
        return obj;
    }

    @Override // Z0.i
    public final Object q(Object obj, h1.p pVar) {
        return pVar.d(obj, this);
    }

    public final CancellationException r() {
        CancellationException cancellationException;
        Object u2 = u();
        if (!(u2 instanceof S)) {
            if (u2 instanceof I) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(u2 instanceof C0344j)) {
                return new N(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0344j) u2).f3903a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new N(l(), th, this) : cancellationException;
        }
        Throwable d = ((S) u2).d();
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
        return new N(concat, d, this);
    }

    public boolean s() {
        return true;
    }

    public final V t(I i) {
        V b2 = i.b();
        if (b2 != null) {
            return b2;
        }
        if (i instanceof A) {
            return new V();
        }
        if (i instanceof P) {
            E((P) i);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + i).toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + F(u()) + '}');
        sb.append('@');
        sb.append(AbstractC0352s.c(this));
        return sb.toString();
    }

    public final Object u() {
        while (true) {
            Object obj = f3882a.get(this);
            if (!(obj instanceof u1.n)) {
                return obj;
            }
            ((u1.n) obj).a(this);
        }
    }

    public boolean v(Throwable th) {
        return false;
    }

    public void w(V0.c cVar) {
        throw cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EDGE_INSN: B:31:0x0055->B:25:0x0055 BREAK  A[LOOP:0: B:7:0x000c->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(M m2) {
        boolean z2;
        W w2 = W.f3884a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3883b;
        if (m2 == null) {
            atomicReferenceFieldUpdater.set(this, w2);
            return;
        }
        U u2 = (U) m2;
        do {
            Object u3 = u2.u();
            boolean z3 = u3 instanceof A;
            z2 = false;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3882a;
            if (z3) {
                if (!((A) u3).f3860a) {
                    A a2 = AbstractC0352s.h;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u2, u3, a2)) {
                        if (atomicReferenceFieldUpdater2.get(u2) != u3) {
                            z2 = -1;
                            break;
                        }
                    }
                    u2.getClass();
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            } else {
                if (u3 instanceof H) {
                    V v2 = ((H) u3).f3867a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u2, u3, v2)) {
                        if (atomicReferenceFieldUpdater2.get(u2) != u3) {
                            z2 = -1;
                            break;
                        }
                    }
                    u2.getClass();
                    z2 = true;
                }
                if (z2) {
                }
            }
        } while (!z2);
        InterfaceC0341g interfaceC0341g = (InterfaceC0341g) AbstractC0352s.e(u2, true, new C0342h(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0341g);
        if (u() instanceof I) {
            return;
        }
        interfaceC0341g.e();
        atomicReferenceFieldUpdater.set(this, w2);
    }

    public boolean y() {
        return false;
    }

    public final Object z(Object obj) {
        Object G2;
        do {
            G2 = G(u(), obj);
            if (G2 == AbstractC0352s.f3915b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0344j c0344j = obj instanceof C0344j ? (C0344j) obj : null;
                throw new IllegalStateException(str, c0344j != null ? c0344j.f3903a : null);
            }
        } while (G2 == AbstractC0352s.d);
        return G2;
    }
}
