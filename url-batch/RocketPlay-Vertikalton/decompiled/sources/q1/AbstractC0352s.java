package q1;

import a1.AbstractC0067d;
import a1.EnumC0064a;
import b1.AbstractC0094c;
import b1.InterfaceC0095d;
import c1.AbstractC0104b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC0332e;

/* renamed from: q1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0352s {

    /* renamed from: a, reason: collision with root package name */
    public static final U.q f3914a = new U.q("CLOSED_EMPTY", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final U.q f3915b = new U.q("COMPLETING_ALREADY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final U.q f3916c = new U.q("COMPLETING_WAITING_CHILDREN", 1);
    public static final U.q d = new U.q("COMPLETING_RETRY", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final U.q f3917e = new U.q("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final U.q f3918f = new U.q("SEALED", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final A f3919g = new A(false);
    public static final A h = new A(true);

    public static final void a(Z0.i iVar, CancellationException cancellationException) {
        M m2 = (M) iVar.f(C0350p.f3913b);
        if (m2 != null) {
            ((U) m2).g(cancellationException);
        }
    }

    public static final Z0.i b(Z0.i iVar, Z0.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0346l c0346l = C0346l.d;
        boolean booleanValue = ((Boolean) iVar.q(bool, c0346l)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.q(bool, c0346l)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.h(iVar2);
        }
        Z0.j jVar = Z0.j.f1558a;
        Z0.i iVar3 = (Z0.i) iVar.q(jVar, new C0346l(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.q(jVar, C0346l.f3906c);
        }
        return iVar3.h((Z0.i) obj);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void d(Z0.i iVar, Throwable th) {
        try {
            r1.b bVar = (r1.b) iVar.f(C0350p.f3912a);
            if (bVar != null) {
                bVar.D(iVar, th);
            } else {
                u1.a.a(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                F1.d.k(runtimeException, th);
                th = runtimeException;
            }
            u1.a.a(iVar, th);
        }
    }

    public static InterfaceC0359z e(M m2, boolean z2, P p2, int i) {
        P p3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if ((i & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i & 2) != 0;
        U u2 = (U) m2;
        u2.getClass();
        if (z2) {
            p3 = p2 instanceof O ? (O) p2 : null;
            if (p3 == null) {
                p3 = new L(p2);
            }
        } else {
            p3 = p2;
        }
        p3.d = u2;
        while (true) {
            Object u3 = u2.u();
            if (u3 instanceof A) {
                A a2 = (A) u3;
                if (a2.f3860a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = U.f3882a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u2, u3, p3)) {
                        if (atomicReferenceFieldUpdater2.get(u2) != u3) {
                            break;
                        }
                    }
                    return p3;
                }
                V v2 = new V();
                Object h2 = a2.f3860a ? v2 : new H(v2);
                do {
                    atomicReferenceFieldUpdater = U.f3882a;
                    if (atomicReferenceFieldUpdater.compareAndSet(u2, a2, h2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(u2) == a2);
            } else {
                if (!(u3 instanceof I)) {
                    if (z3) {
                        C0344j c0344j = u3 instanceof C0344j ? (C0344j) u3 : null;
                        p2.g(c0344j != null ? c0344j.f3903a : null);
                    }
                    return W.f3884a;
                }
                V b2 = ((I) u3).b();
                if (b2 == null) {
                    i1.f.c(u3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    u2.E((P) u3);
                } else {
                    InterfaceC0359z interfaceC0359z = W.f3884a;
                    if (z2 && (u3 instanceof S)) {
                        synchronized (u3) {
                            try {
                                th = ((S) u3).d();
                                if (th != null) {
                                    if ((p2 instanceof C0342h) && !((S) u3).f()) {
                                    }
                                }
                                if (u2.c((I) u3, b2, p3)) {
                                    if (th == null) {
                                        return p3;
                                    }
                                    interfaceC0359z = p3;
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
                            p2.g(th);
                        }
                        return interfaceC0359z;
                    }
                    if (u2.c((I) u3, b2, p3)) {
                        return p3;
                    }
                }
            }
        }
    }

    public static final boolean f(int i) {
        return i == 1 || i == 2;
    }

    public static Z g(InterfaceC0351q interfaceC0351q, AbstractC0349o abstractC0349o, h1.p pVar, int i) {
        Z0.i iVar = abstractC0349o;
        if ((i & 1) != 0) {
            iVar = Z0.j.f1558a;
        }
        Z0.i b2 = b(interfaceC0351q.b(), iVar, true);
        w1.d dVar = AbstractC0358y.f3924a;
        if (b2 != dVar && b2.f(Z0.e.f1557a) == null) {
            b2 = b2.h(dVar);
        }
        Z z2 = new Z(b2, true);
        int a2 = AbstractC0332e.a(1);
        if (a2 == 0) {
            AbstractC0104b.z(pVar, z2, z2);
        } else if (a2 != 1) {
            if (a2 == 2) {
                AbstractC0067d.m(AbstractC0067d.e(z2, z2, pVar)).resumeWith(V0.i.f1250a);
            } else {
                if (a2 != 3) {
                    throw new V0.c();
                }
                try {
                    Z0.i iVar2 = z2.f3885c;
                    Object g2 = u1.a.g(iVar2, null);
                    try {
                        i1.l.a(pVar);
                        Object d2 = pVar.d(z2, z2);
                        if (d2 != EnumC0064a.f1630a) {
                            z2.resumeWith(d2);
                        }
                    } finally {
                        u1.a.b(iVar2, g2);
                    }
                } catch (Throwable th) {
                    z2.resumeWith(F1.l.t(th));
                }
            }
        }
        return z2;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0344j ? F1.l.t(((C0344j) obj).f3903a) : obj;
    }

    public static final void i(C0338d c0338d, Z0.d dVar, boolean z2) {
        Object obj = C0338d.f3890g.get(c0338d);
        Throwable c2 = c0338d.c(obj);
        Object t2 = c2 != null ? F1.l.t(c2) : c0338d.d(obj);
        if (!z2) {
            dVar.resumeWith(t2);
            return;
        }
        i1.f.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        u1.f fVar = (u1.f) dVar;
        AbstractC0094c abstractC0094c = fVar.f4182e;
        Z0.i context = abstractC0094c.getContext();
        Object g2 = u1.a.g(context, fVar.f4184g);
        e0 k2 = g2 != u1.a.f4177e ? k(abstractC0094c, context, g2) : null;
        try {
            abstractC0094c.resumeWith(t2);
        } finally {
            if (k2 == null || k2.H()) {
                u1.a.b(context, g2);
            }
        }
    }

    public static final String j(Z0.d dVar) {
        Object t2;
        if (dVar instanceof u1.f) {
            return dVar.toString();
        }
        try {
            t2 = dVar + '@' + c(dVar);
        } catch (Throwable th) {
            t2 = F1.l.t(th);
        }
        if (V0.f.a(t2) != null) {
            t2 = dVar.getClass().getName() + '@' + c(dVar);
        }
        return (String) t2;
    }

    public static final e0 k(Z0.d dVar, Z0.i iVar, Object obj) {
        e0 e0Var = null;
        if (!(dVar instanceof InterfaceC0095d)) {
            return null;
        }
        if (iVar.f(f0.f3896a) != null) {
            InterfaceC0095d interfaceC0095d = (InterfaceC0095d) dVar;
            while (true) {
                if ((interfaceC0095d instanceof C0356w) || (interfaceC0095d = interfaceC0095d.getCallerFrame()) == null) {
                    break;
                }
                if (interfaceC0095d instanceof e0) {
                    e0Var = (e0) interfaceC0095d;
                    break;
                }
            }
            if (e0Var != null) {
                e0Var.I(iVar, obj);
            }
        }
        return e0Var;
    }
}
