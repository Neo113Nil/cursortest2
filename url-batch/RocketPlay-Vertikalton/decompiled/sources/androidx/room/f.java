package androidx.room;

import a1.AbstractC0067d;
import a1.EnumC0064a;
import android.os.CancellationSignal;
import c1.AbstractC0104b;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q1.AbstractC0349o;
import q1.AbstractC0352s;
import q1.C0336b;
import q1.C0338d;
import q1.C0339e;
import q1.C0343i;
import q1.C0344j;
import q1.C0346l;
import q1.C0350p;
import q1.C0356w;
import q1.F;
import q1.G;
import q1.I;
import q1.InterfaceC0359z;
import q1.J;
import q1.K;
import q1.M;
import q1.U;
import q1.W;
import q1.X;
import q1.e0;

/* loaded from: classes.dex */
public abstract class f {
    public static final Object a(t tVar, CancellationSignal cancellationSignal, Callable callable, Z0.d dVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        if (tVar.isOpenInternal() && tVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.getContext().f(z.f2097a) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = tVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = new F(tVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        AbstractC0349o abstractC0349o = (AbstractC0349o) obj;
        C0338d c0338d = new C0338d(AbstractC0067d.m(dVar));
        InterfaceC0359z j2 = c0338d.j();
        if (j2 != null && !(C0338d.f3890g.get(c0338d) instanceof X)) {
            j2.e();
            C0338d.h.set(c0338d, W.f3884a);
        }
        K k2 = new K(new d(cancellationSignal, AbstractC0352s.g(G.f3866a, abstractC0349o, new e(callable, c0338d, null), 2)));
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0338d.f3890g;
            Object obj2 = atomicReferenceFieldUpdater.get(c0338d);
            if (obj2 instanceof C0336b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c0338d, obj2, k2)) {
                    if (atomicReferenceFieldUpdater.get(c0338d) != obj2) {
                        break;
                    }
                }
                break loop0;
            }
            if (!(obj2 instanceof K)) {
                if (!(obj2 instanceof C0344j)) {
                    if (!(obj2 instanceof C0343i)) {
                        C0343i c0343i = new C0343i(obj2, k2, (h1.l) null, (CancellationException) null, 28);
                        while (!atomicReferenceFieldUpdater.compareAndSet(c0338d, obj2, c0343i)) {
                            if (atomicReferenceFieldUpdater.get(c0338d) != obj2) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    C0343i c0343i2 = (C0343i) obj2;
                    if (c0343i2.f3899b != null) {
                        C0338d.l(k2, obj2);
                        throw null;
                    }
                    Throwable th = c0343i2.f3901e;
                    if (th == null) {
                        C0343i a2 = C0343i.a(c0343i2, k2, null, 29);
                        while (!atomicReferenceFieldUpdater.compareAndSet(c0338d, obj2, a2)) {
                            if (atomicReferenceFieldUpdater.get(c0338d) != obj2) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    c0338d.g(k2, th);
                    break;
                }
                C0344j c0344j = (C0344j) obj2;
                c0344j.getClass();
                if (!C0344j.f3902b.compareAndSet(c0344j, 0, 1)) {
                    C0338d.l(k2, obj2);
                    throw null;
                }
                if (obj2 instanceof C0339e) {
                    if (!(obj2 instanceof C0344j)) {
                        c0344j = null;
                    }
                    c0338d.g(k2, c0344j != null ? c0344j.f3903a : null);
                }
            } else {
                C0338d.l(k2, obj2);
                throw null;
            }
        }
        boolean k3 = c0338d.k();
        do {
            atomicIntegerFieldUpdater = C0338d.f3889f;
            i = atomicIntegerFieldUpdater.get(c0338d);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (k3) {
                    c0338d.m();
                }
                Object obj3 = C0338d.f3890g.get(c0338d);
                if (obj3 instanceof C0344j) {
                    throw ((C0344j) obj3).f3903a;
                }
                if (AbstractC0352s.f(c0338d.f3923c)) {
                    M m2 = (M) c0338d.f3891e.f(C0350p.f3913b);
                    if (m2 != null && !m2.a()) {
                        CancellationException r2 = ((U) m2).r();
                        c0338d.a(obj3, r2);
                        throw r2;
                    }
                }
                return c0338d.d(obj3);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0338d, i, 536870912 + (536870911 & i)));
        if (((InterfaceC0359z) C0338d.h.get(c0338d)) == null) {
            c0338d.j();
        }
        if (k3) {
            c0338d.m();
        }
        return EnumC0064a.f1630a;
    }

    public static final Object b(t tVar, Callable callable, Z0.d dVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        I i;
        if (tVar.isOpenInternal() && tVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.getContext().f(z.f2097a) != null) {
            throw new ClassCastException();
        }
        Map<String, Object> backingFieldMap = tVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = new F(tVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        AbstractC0349o abstractC0349o = (AbstractC0349o) obj;
        c cVar = new c(callable, null);
        Z0.i context = dVar.getContext();
        Z0.i h = !((Boolean) abstractC0349o.q(Boolean.FALSE, C0346l.d)).booleanValue() ? context.h(abstractC0349o) : AbstractC0352s.b(context, abstractC0349o, false);
        M m2 = (M) h.f(C0350p.f3913b);
        if (m2 != null && !m2.a()) {
            throw ((U) m2).r();
        }
        if (h == context) {
            u1.q qVar = new u1.q(dVar, h);
            return AbstractC0067d.t(qVar, qVar, cVar);
        }
        Z0.e eVar = Z0.e.f1557a;
        if (i1.f.a(h.f(eVar), context.f(eVar))) {
            e0 e0Var = new e0(dVar, h);
            Z0.i iVar = e0Var.f3885c;
            Object g2 = u1.a.g(iVar, null);
            try {
                return AbstractC0067d.t(e0Var, e0Var, cVar);
            } finally {
                u1.a.b(iVar, g2);
            }
        }
        C0356w c0356w = new C0356w(dVar, h);
        AbstractC0104b.z(cVar, c0356w, c0356w);
        do {
            atomicIntegerFieldUpdater = C0356w.f3922e;
            int i2 = atomicIntegerFieldUpdater.get(c0356w);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object u2 = c0356w.u();
                J j2 = u2 instanceof J ? (J) u2 : null;
                if (j2 != null && (i = j2.f3868a) != null) {
                    u2 = i;
                }
                if (u2 instanceof C0344j) {
                    throw ((C0344j) u2).f3903a;
                }
                return u2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0356w, 0, 1));
        return EnumC0064a.f1630a;
    }

    public static String c(String str, String str2) {
        i1.f.e(str, "tableName");
        i1.f.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
