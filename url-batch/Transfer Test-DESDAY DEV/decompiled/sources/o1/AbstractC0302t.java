package o1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC0321e;

/* renamed from: o1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0302t {

    /* renamed from: a, reason: collision with root package name */
    public static final U.q f3335a = new U.q("REMOVED_TASK", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final U.q f3336b = new U.q("CLOSED_EMPTY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final U.q f3337c = new U.q("COMPLETING_ALREADY", 1);
    public static final U.q d = new U.q("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final U.q f3338e = new U.q("COMPLETING_RETRY", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final U.q f3339f = new U.q("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final U.q f3340g = new U.q("SEALED", 1);
    public static final B h = new B(false);
    public static final B i = new B(true);

    public static final void a(X0.i iVar, CancellationException cancellationException) {
        O o2 = (O) iVar.j(C0300q.f3334b);
        if (o2 != null) {
            W w2 = (W) o2;
            if (cancellationException == null) {
                cancellationException = new P(w2.l(), null, w2);
            }
            w2.i(cancellationException);
        }
    }

    public static final Object c(Z0.h hVar) {
        U0.i iVar = U0.i.f870a;
        C0288e c0288e = new C0288e(T.e.D(hVar));
        A n2 = c0288e.n();
        if (n2 != null && !(C0288e.f3310g.get(c0288e) instanceof Z)) {
            n2.e();
            C0288e.h.set(c0288e, Y.f3303a);
        }
        X0.g j2 = c0288e.f3311e.j(X0.e.f935a);
        InterfaceC0305w interfaceC0305w = j2 instanceof InterfaceC0305w ? (InterfaceC0305w) j2 : null;
        if (interfaceC0305w == null) {
            interfaceC0305w = AbstractC0304v.f3342a;
        }
        interfaceC0305w.v(c0288e);
        Object m2 = c0288e.m();
        return m2 == Y0.a.f1162a ? m2 : iVar;
    }

    public static final X0.i d(X0.i iVar, X0.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0296m c0296m = C0296m.d;
        boolean booleanValue = ((Boolean) iVar.t(bool, c0296m)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.t(bool, c0296m)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.m(iVar2);
        }
        X0.j jVar = X0.j.f936a;
        X0.i iVar3 = (X0.i) iVar.t(jVar, new C0296m(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.t(jVar, C0296m.f3327c);
        }
        return iVar3.m((X0.i) obj);
    }

    public static final String e(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void f(X0.i iVar, Throwable th) {
        try {
            p1.b bVar = (p1.b) iVar.j(C0300q.f3333a);
            if (bVar != null) {
                bVar.z(iVar, th);
            } else {
                s1.a.a(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                T.e.g(runtimeException, th);
                th = runtimeException;
            }
            s1.a.a(iVar, th);
        }
    }

    public static A g(O o2, boolean z2, S s2, int i2) {
        S s3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 2) != 0;
        W w2 = (W) o2;
        w2.getClass();
        if (z2) {
            s3 = s2 instanceof Q ? (Q) s2 : null;
            if (s3 == null) {
                s3 = new N(s2);
            }
        } else {
            s3 = s2;
        }
        s3.d = w2;
        while (true) {
            Object w3 = w2.w();
            if (w3 instanceof B) {
                B b2 = (B) w3;
                if (b2.f3276a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = W.f3301a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(w2, w3, s3)) {
                        if (atomicReferenceFieldUpdater2.get(w2) != w3) {
                            break;
                        }
                    }
                    return s3;
                }
                X x2 = new X();
                L k2 = b2.f3276a ? x2 : new K(x2);
                do {
                    atomicReferenceFieldUpdater = W.f3301a;
                    if (atomicReferenceFieldUpdater.compareAndSet(w2, b2, k2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(w2) == b2);
            } else {
                if (!(w3 instanceof L)) {
                    if (z3) {
                        C0294k c0294k = w3 instanceof C0294k ? (C0294k) w3 : null;
                        s2.g(c0294k != null ? c0294k.f3324a : null);
                    }
                    return Y.f3303a;
                }
                X b3 = ((L) w3).b();
                if (b3 == null) {
                    g1.f.c(w3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    w2.G((S) w3);
                } else {
                    A a2 = Y.f3303a;
                    if (z2 && (w3 instanceof U)) {
                        synchronized (w3) {
                            try {
                                th = ((U) w3).d();
                                if (th != null) {
                                    if ((s2 instanceof C0292i) && !((U) w3).f()) {
                                    }
                                }
                                if (w2.d((L) w3, b3, s3)) {
                                    if (th == null) {
                                        return s3;
                                    }
                                    a2 = s3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z3) {
                            s2.g(th);
                        }
                        return a2;
                    }
                    if (w2.d((L) w3, b3, s3)) {
                        return s3;
                    }
                }
            }
        }
    }

    public static final boolean h(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static b0 i(r rVar, AbstractC0299p abstractC0299p, f1.p pVar) {
        X0.i d2 = d(rVar.c(), abstractC0299p, true);
        u1.d dVar = AbstractC0308z.f3345a;
        if (d2 != dVar && d2.j(X0.e.f935a) == null) {
            d2 = d2.m(dVar);
        }
        b0 b0Var = new b0(d2, true);
        int a2 = AbstractC0321e.a(1);
        if (a2 == 0) {
            h0.f.p(pVar, b0Var, b0Var);
        } else if (a2 != 1) {
            if (a2 == 2) {
                T.e.D(T.e.r(b0Var, b0Var, pVar)).b(U0.i.f870a);
            } else {
                if (a2 != 3) {
                    throw new U0.c();
                }
                try {
                    X0.i iVar = b0Var.f3304c;
                    Object g2 = s1.a.g(iVar, null);
                    try {
                        g1.l.a(pVar);
                        Object d3 = pVar.d(b0Var, b0Var);
                        if (d3 != Y0.a.f1162a) {
                            b0Var.b(d3);
                        }
                    } finally {
                        s1.a.b(iVar, g2);
                    }
                } catch (Throwable th) {
                    b0Var.b(T.e.s(th));
                }
            }
        }
        return b0Var;
    }

    public static final Object j(Object obj) {
        return obj instanceof C0294k ? T.e.s(((C0294k) obj).f3324a) : obj;
    }

    public static final void k(C0288e c0288e, X0.d dVar, boolean z2) {
        Object obj = C0288e.f3310g.get(c0288e);
        Throwable d2 = c0288e.d(obj);
        Object s2 = d2 != null ? T.e.s(d2) : c0288e.f(obj);
        if (!z2) {
            dVar.b(s2);
            return;
        }
        g1.f.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        s1.f fVar = (s1.f) dVar;
        Z0.c cVar = fVar.f3695e;
        X0.i iVar = cVar.f1176b;
        g1.f.b(iVar);
        Object g2 = s1.a.g(iVar, fVar.f3697g);
        g0 m2 = g2 != s1.a.f3690e ? m(cVar, iVar, g2) : null;
        try {
            cVar.b(s2);
        } finally {
            if (m2 == null || m2.J()) {
                s1.a.b(iVar, g2);
            }
        }
    }

    public static final String l(X0.d dVar) {
        Object s2;
        if (dVar instanceof s1.f) {
            return dVar.toString();
        }
        try {
            s2 = dVar + '@' + e(dVar);
        } catch (Throwable th) {
            s2 = T.e.s(th);
        }
        if (U0.f.a(s2) != null) {
            s2 = dVar.getClass().getName() + '@' + e(dVar);
        }
        return (String) s2;
    }

    public static final g0 m(X0.d dVar, X0.i iVar, Object obj) {
        g0 g0Var = null;
        if (!(dVar instanceof Z0.d)) {
            return null;
        }
        if (iVar.j(h0.f3317a) != null) {
            Z0.d dVar2 = (Z0.d) dVar;
            while (true) {
                if ((dVar2 instanceof C0306x) || (dVar2 = dVar2.e()) == null) {
                    break;
                }
                if (dVar2 instanceof g0) {
                    g0Var = (g0) dVar2;
                    break;
                }
            }
            if (g0Var != null) {
                g0Var.K(iVar, obj);
            }
        }
        return g0Var;
    }

    public static final Object n(AbstractC0299p abstractC0299p, f1.p pVar, X0.d dVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        L l2;
        X0.i h2 = dVar.h();
        X0.i m2 = !((Boolean) abstractC0299p.t(Boolean.FALSE, C0296m.d)).booleanValue() ? h2.m(abstractC0299p) : d(h2, abstractC0299p, false);
        O o2 = (O) m2.j(C0300q.f3334b);
        if (o2 != null && !o2.a()) {
            throw ((W) o2).s();
        }
        if (m2 == h2) {
            s1.q qVar = new s1.q(dVar, m2);
            return h0.f.q(qVar, qVar, pVar);
        }
        X0.e eVar = X0.e.f935a;
        if (g1.f.a(m2.j(eVar), h2.j(eVar))) {
            g0 g0Var = new g0(dVar, m2);
            X0.i iVar = g0Var.f3304c;
            Object g2 = s1.a.g(iVar, null);
            try {
                return h0.f.q(g0Var, g0Var, pVar);
            } finally {
                s1.a.b(iVar, g2);
            }
        }
        C0306x c0306x = new C0306x(dVar, m2);
        h0.f.p(pVar, c0306x, c0306x);
        do {
            atomicIntegerFieldUpdater = C0306x.f3343e;
            int i2 = atomicIntegerFieldUpdater.get(c0306x);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object w2 = c0306x.w();
                M m3 = w2 instanceof M ? (M) w2 : null;
                if (m3 != null && (l2 = m3.f3288a) != null) {
                    w2 = l2;
                }
                if (w2 instanceof C0294k) {
                    throw ((C0294k) w2).f3324a;
                }
                return w2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0306x, 0, 1));
        return Y0.a.f1162a;
    }
}
