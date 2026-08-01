package q1;

import b1.InterfaceC0095d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: q1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338d extends AbstractC0357x implements Z0.d, InterfaceC0095d {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3889f = AtomicIntegerFieldUpdater.newUpdater(C0338d.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3890g = AtomicReferenceFieldUpdater.newUpdater(C0338d.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0338d.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final Z0.d d;

    /* renamed from: e, reason: collision with root package name */
    public final Z0.i f3891e;

    public C0338d(Z0.d dVar) {
        super(1);
        this.d = dVar;
        this.f3891e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0336b.f3887a;
    }

    public static void l(K k2, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + k2 + ", already has " + obj).toString());
    }

    @Override // q1.AbstractC0357x
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3890g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof X) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0344j) {
                return;
            }
            if (!(obj2 instanceof C0343i)) {
                C0343i c0343i = new C0343i(obj2, (K) null, (h1.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0343i)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0343i c0343i2 = (C0343i) obj2;
            if (c0343i2.f3901e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0343i a2 = C0343i.a(c0343i2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            K k2 = c0343i2.f3899b;
            if (k2 != null) {
                g(k2, cancellationException);
            }
            h1.l lVar = c0343i2.f3900c;
            if (lVar != null) {
                try {
                    lVar.g(cancellationException);
                    return;
                } catch (Throwable th) {
                    AbstractC0352s.d(this.f3891e, new V0.c("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // q1.AbstractC0357x
    public final Z0.d b() {
        return this.d;
    }

    @Override // q1.AbstractC0357x
    public final Throwable c(Object obj) {
        Throwable c2 = super.c(obj);
        if (c2 != null) {
            return c2;
        }
        return null;
    }

    @Override // q1.AbstractC0357x
    public final Object d(Object obj) {
        return obj instanceof C0343i ? ((C0343i) obj).f3898a : obj;
    }

    @Override // q1.AbstractC0357x
    public final Object f() {
        return f3890g.get(this);
    }

    public final void g(K k2, Throwable th) {
        try {
            k2.a(th);
        } catch (Throwable th2) {
            AbstractC0352s.d(this.f3891e, new V0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // b1.InterfaceC0095d
    public final InterfaceC0095d getCallerFrame() {
        Z0.d dVar = this.d;
        if (dVar instanceof InterfaceC0095d) {
            return (InterfaceC0095d) dVar;
        }
        return null;
    }

    @Override // Z0.d
    public final Z0.i getContext() {
        return this.f3891e;
    }

    public final void h(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3890g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof X) {
                C0339e c0339e = new C0339e(this, th, obj instanceof K);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0339e)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((X) obj) instanceof K) {
                    g((K) obj, th);
                }
                if (!k()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    InterfaceC0359z interfaceC0359z = (InterfaceC0359z) atomicReferenceFieldUpdater2.get(this);
                    if (interfaceC0359z != null) {
                        interfaceC0359z.e();
                        atomicReferenceFieldUpdater2.set(this, W.f3884a);
                    }
                }
                i(this.f3923c);
                return;
            }
            return;
        }
    }

    public final void i(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f3889f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i == 4;
                Z0.d dVar = this.d;
                if (z2 || !(dVar instanceof u1.f) || AbstractC0352s.f(i) != AbstractC0352s.f(this.f3923c)) {
                    AbstractC0352s.i(this, dVar, z2);
                    return;
                }
                AbstractC0349o abstractC0349o = ((u1.f) dVar).d;
                Z0.i context = ((u1.f) dVar).f4182e.getContext();
                if (abstractC0349o.E()) {
                    abstractC0349o.D(context, this);
                    return;
                }
                D a2 = c0.a();
                if (a2.f3863c >= 4294967296L) {
                    W0.h hVar = a2.f3864e;
                    if (hVar == null) {
                        hVar = new W0.h();
                        a2.f3864e = hVar;
                    }
                    hVar.addLast(this);
                    return;
                }
                a2.H(true);
                try {
                    AbstractC0352s.i(this, dVar, true);
                    do {
                    } while (a2.I());
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

    public final InterfaceC0359z j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        M m2 = (M) this.f3891e.f(C0350p.f3913b);
        if (m2 == null) {
            return null;
        }
        InterfaceC0359z e2 = AbstractC0352s.e(m2, true, new C0340f(this), 2);
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final boolean k() {
        if (this.f3923c == 2) {
            Z0.d dVar = this.d;
            i1.f.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (u1.f.h.get((u1.f) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final void m() {
        Z0.d dVar = this.d;
        Throwable th = null;
        u1.f fVar = dVar instanceof u1.f ? (u1.f) dVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.f.h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                U.q qVar = u1.a.f4176c;
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
            InterfaceC0359z interfaceC0359z = (InterfaceC0359z) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC0359z != null) {
                interfaceC0359z.e();
                atomicReferenceFieldUpdater2.set(this, W.f3884a);
            }
            h(th);
        }
    }

    @Override // Z0.d
    public final void resumeWith(Object obj) {
        Object obj2;
        Throwable a2 = V0.f.a(obj);
        if (a2 != null) {
            obj = new C0344j(a2, false);
        }
        int i = this.f3923c;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3890g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof X)) {
                if (obj3 instanceof C0339e) {
                    C0339e c0339e = (C0339e) obj3;
                    c0339e.getClass();
                    if (C0339e.f3893c.compareAndSet(c0339e, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            X x2 = (X) obj3;
            if (!(obj instanceof C0344j) && AbstractC0352s.f(i) && (x2 instanceof K)) {
                obj2 = new C0343i(obj, x2 instanceof K ? (K) x2 : null, (h1.l) null, (CancellationException) null, 16);
            } else {
                obj2 = obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    break;
                }
            }
            if (!k()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                InterfaceC0359z interfaceC0359z = (InterfaceC0359z) atomicReferenceFieldUpdater2.get(this);
                if (interfaceC0359z != null) {
                    interfaceC0359z.e();
                    atomicReferenceFieldUpdater2.set(this, W.f3884a);
                }
            }
            i(i);
            return;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0352s.j(this.d));
        sb.append("){");
        Object obj = f3890g.get(this);
        sb.append(obj instanceof X ? "Active" : obj instanceof C0339e ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0352s.c(this));
        return sb.toString();
    }
}
