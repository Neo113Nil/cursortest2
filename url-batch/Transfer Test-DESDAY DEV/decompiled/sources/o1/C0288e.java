package o1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288e extends AbstractC0307y implements X0.d, Z0.d {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3309f = AtomicIntegerFieldUpdater.newUpdater(C0288e.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3310g = AtomicReferenceFieldUpdater.newUpdater(C0288e.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0288e.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final X0.d d;

    /* renamed from: e, reason: collision with root package name */
    public final X0.i f3311e;

    public C0288e(X0.d dVar) {
        super(1);
        this.d = dVar;
        this.f3311e = dVar.h();
        this._decisionAndIndex = 536870911;
        this._state = C0285b.f3305a;
    }

    public static void q(C0287d c0287d, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0287d + ", already has " + obj).toString());
    }

    public static void s(C0288e c0288e, Object obj, int i) {
        Object obj2;
        c0288e.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3310g;
            Object obj3 = atomicReferenceFieldUpdater.get(c0288e);
            if (!(obj3 instanceof Z)) {
                if (obj3 instanceof C0289f) {
                    C0289f c0289f = (C0289f) obj3;
                    c0289f.getClass();
                    if (C0289f.f3313c.compareAndSet(c0289f, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Z z2 = (Z) obj3;
            if (!(obj instanceof C0294k) && AbstractC0302t.h(i) && (z2 instanceof C0287d)) {
                obj2 = new C0293j(obj, z2 instanceof C0287d ? (C0287d) z2 : null, (f1.l) null, (CancellationException) null, 16);
            } else {
                obj2 = obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c0288e, obj3, obj2)) {
                if (atomicReferenceFieldUpdater.get(c0288e) != obj3) {
                    break;
                }
            }
            if (!c0288e.p()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                A a2 = (A) atomicReferenceFieldUpdater2.get(c0288e);
                if (a2 != null) {
                    a2.e();
                    atomicReferenceFieldUpdater2.set(c0288e, Y.f3303a);
                }
            }
            c0288e.l(i);
            return;
        }
    }

    @Override // o1.AbstractC0307y
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3310g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Z) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0294k) {
                return;
            }
            if (!(obj2 instanceof C0293j)) {
                C0293j c0293j = new C0293j(obj2, (C0287d) null, (f1.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0293j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0293j c0293j2 = (C0293j) obj2;
            if (c0293j2.f3322e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0293j a2 = C0293j.a(c0293j2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            C0287d c0287d = c0293j2.f3320b;
            if (c0287d != null) {
                j(c0287d, cancellationException);
            }
            f1.l lVar = c0293j2.f3321c;
            if (lVar != null) {
                try {
                    lVar.g(cancellationException);
                    return;
                } catch (Throwable th) {
                    AbstractC0302t.f(this.f3311e, new U0.c("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // X0.d
    public final void b(Object obj) {
        Throwable a2 = U0.f.a(obj);
        if (a2 != null) {
            obj = new C0294k(a2, false);
        }
        s(this, obj, this.f3344c);
    }

    @Override // o1.AbstractC0307y
    public final X0.d c() {
        return this.d;
    }

    @Override // o1.AbstractC0307y
    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    @Override // Z0.d
    public final Z0.d e() {
        X0.d dVar = this.d;
        if (dVar instanceof Z0.d) {
            return (Z0.d) dVar;
        }
        return null;
    }

    @Override // o1.AbstractC0307y
    public final Object f(Object obj) {
        return obj instanceof C0293j ? ((C0293j) obj).f3319a : obj;
    }

    @Override // X0.d
    public final X0.i h() {
        return this.f3311e;
    }

    @Override // o1.AbstractC0307y
    public final Object i() {
        return f3310g.get(this);
    }

    public final void j(C0287d c0287d, Throwable th) {
        try {
            c0287d.a(th);
        } catch (Throwable th2) {
            AbstractC0302t.f(this.f3311e, new U0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3310g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Z) {
                C0289f c0289f = new C0289f(this, th, obj instanceof C0287d);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0289f)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((Z) obj) instanceof C0287d) {
                    j((C0287d) obj, th);
                }
                if (!p()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    A a2 = (A) atomicReferenceFieldUpdater2.get(this);
                    if (a2 != null) {
                        a2.e();
                        atomicReferenceFieldUpdater2.set(this, Y.f3303a);
                    }
                }
                l(this.f3344c);
                return;
            }
            return;
        }
    }

    public final void l(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f3309f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i == 4;
                X0.d dVar = this.d;
                if (z2 || !(dVar instanceof s1.f) || AbstractC0302t.h(i) != AbstractC0302t.h(this.f3344c)) {
                    AbstractC0302t.k(this, dVar, z2);
                    return;
                }
                AbstractC0299p abstractC0299p = ((s1.f) dVar).d;
                X0.i iVar = ((s1.f) dVar).f3695e.f1176b;
                g1.f.b(iVar);
                if (abstractC0299p.A()) {
                    abstractC0299p.z(iVar, this);
                    return;
                }
                G a2 = e0.a();
                if (a2.f3283c >= 4294967296L) {
                    V0.c cVar = a2.f3284e;
                    if (cVar == null) {
                        cVar = new V0.c();
                        a2.f3284e = cVar;
                    }
                    cVar.addLast(this);
                    return;
                }
                a2.D(true);
                try {
                    AbstractC0302t.k(this, dVar, true);
                    do {
                    } while (a2.E());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final Object m() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean p2 = p();
        do {
            atomicIntegerFieldUpdater = f3309f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (p2) {
                    r();
                }
                Object obj = f3310g.get(this);
                if (obj instanceof C0294k) {
                    throw ((C0294k) obj).f3324a;
                }
                if (AbstractC0302t.h(this.f3344c)) {
                    O o2 = (O) this.f3311e.j(C0300q.f3334b);
                    if (o2 != null && !o2.a()) {
                        CancellationException s2 = ((W) o2).s();
                        a(obj, s2);
                        throw s2;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((A) h.get(this)) == null) {
            n();
        }
        if (p2) {
            r();
        }
        return Y0.a.f1162a;
    }

    public final A n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        O o2 = (O) this.f3311e.j(C0300q.f3334b);
        if (o2 == null) {
            return null;
        }
        A g2 = AbstractC0302t.g(o2, true, new C0290g(this), 2);
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, g2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return g2;
    }

    public final void o(f1.l lVar) {
        C0287d c0287d = lVar instanceof C0287d ? (C0287d) lVar : new C0287d(2, lVar);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3310g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0285b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0287d)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof C0287d) {
                q(c0287d, obj);
                throw null;
            }
            if (obj instanceof C0294k) {
                C0294k c0294k = (C0294k) obj;
                c0294k.getClass();
                if (!C0294k.f3323b.compareAndSet(c0294k, 0, 1)) {
                    q(c0287d, obj);
                    throw null;
                }
                if (obj instanceof C0289f) {
                    if (!(obj instanceof C0294k)) {
                        c0294k = null;
                    }
                    j(c0287d, c0294k != null ? c0294k.f3324a : null);
                    return;
                }
                return;
            }
            if (!(obj instanceof C0293j)) {
                C0293j c0293j = new C0293j(obj, c0287d, (f1.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0293j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0293j c0293j2 = (C0293j) obj;
            if (c0293j2.f3320b != null) {
                q(c0287d, obj);
                throw null;
            }
            Throwable th = c0293j2.f3322e;
            if (th != null) {
                j(c0287d, th);
                return;
            }
            C0293j a2 = C0293j.a(c0293j2, c0287d, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean p() {
        if (this.f3344c == 2) {
            X0.d dVar = this.d;
            g1.f.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (s1.f.h.get((s1.f) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final void r() {
        X0.d dVar = this.d;
        Throwable th = null;
        s1.f fVar = dVar instanceof s1.f ? (s1.f) dVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f.h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                U.q qVar = s1.a.f3689c;
                if (obj == qVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, qVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != qVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
            A a2 = (A) atomicReferenceFieldUpdater2.get(this);
            if (a2 != null) {
                a2.e();
                atomicReferenceFieldUpdater2.set(this, Y.f3303a);
            }
            k(th);
        }
    }

    public final void t(AbstractC0299p abstractC0299p) {
        U0.i iVar = U0.i.f870a;
        X0.d dVar = this.d;
        s1.f fVar = dVar instanceof s1.f ? (s1.f) dVar : null;
        s(this, iVar, (fVar != null ? fVar.d : null) == abstractC0299p ? 4 : this.f3344c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0302t.l(this.d));
        sb.append("){");
        Object obj = f3310g.get(this);
        sb.append(obj instanceof Z ? "Active" : obj instanceof C0289f ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0302t.e(this));
        return sb.toString();
    }
}
