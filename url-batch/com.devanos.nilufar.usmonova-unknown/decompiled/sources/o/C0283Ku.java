package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.Ku, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0283Ku implements InterfaceC0075Cu, InterfaceC2344zH {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0283Ku.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(C0283Ku.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C0283Ku(boolean z) {
        this._state$volatile = z ? EB.n : EB.m;
    }

    public static C0719ab Q(XA xa) {
        while (xa.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = XA.i;
            XA f = xa.f();
            if (f == null) {
                Object obj = atomicReferenceFieldUpdater.get(xa);
                while (true) {
                    xa = (XA) obj;
                    if (!xa.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(xa);
                }
            } else {
                xa = f;
            }
        }
        while (true) {
            xa = xa.h();
            if (!xa.i()) {
                if (xa instanceof C0719ab) {
                    return (C0719ab) xa;
                }
                if (xa instanceof OE) {
                    return null;
                }
            }
        }
    }

    public static String X(Object obj) {
        if (!(obj instanceof C0257Ju)) {
            return obj instanceof InterfaceC2249xs ? ((InterfaceC2249xs) obj).b() ? "Active" : "New" : obj instanceof C0031Bc ? "Cancelled" : "Completed";
        }
        C0257Ju c0257Ju = (C0257Ju) obj;
        return c0257Ju.e() ? "Cancelling" : C0257Ju.i.get(c0257Ju) != 0 ? "Completing" : "Active";
    }

    public boolean A() {
        return this instanceof C2299yc;
    }

    @Override // o.InterfaceC0075Cu
    public final InterfaceC0297Li B(InterfaceC2114vp interfaceC2114vp) {
        return L(true, new C0374Oi(1, interfaceC2114vp));
    }

    @Override // o.InterfaceC0075Cu
    public final InterfaceC0297Li C(boolean z, boolean z2, M2 m2) {
        return L(z2, z ? new C0282Kt(m2) : new C0374Oi(1, m2));
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He D(InterfaceC0189He interfaceC0189He) {
        return PX.E0(this, interfaceC0189He);
    }

    public final OE E(InterfaceC2249xs interfaceC2249xs) {
        OE d = interfaceC2249xs.d();
        if (d != null) {
            return d;
        }
        if (interfaceC2249xs instanceof C0794bk) {
            return new OE();
        }
        if (interfaceC2249xs instanceof AbstractC0179Gu) {
            V((AbstractC0179Gu) interfaceC2249xs);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC2249xs).toString());
    }

    public boolean G(Throwable th) {
        return false;
    }

    @Override // o.InterfaceC0189He
    public final Object I(Object obj, InterfaceC2312yp interfaceC2312yp) {
        return interfaceC2312yp.invoke(obj, this);
    }

    public final void J(InterfaceC0075Cu interfaceC0075Cu) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        PE pe = PE.h;
        if (interfaceC0075Cu == null) {
            atomicReferenceFieldUpdater.set(this, pe);
            return;
        }
        interfaceC0075Cu.start();
        InterfaceC0652Za K = interfaceC0075Cu.K(this);
        atomicReferenceFieldUpdater.set(this, K);
        if (h.get(this) instanceof InterfaceC2249xs) {
            return;
        }
        K.a();
        atomicReferenceFieldUpdater.set(this, pe);
    }

    @Override // o.InterfaceC0075Cu
    public final InterfaceC0652Za K(C0283Ku c0283Ku) {
        C0719ab c0719ab = new C0719ab(c0283Ku);
        c0719ab.k = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0794bk) {
                C0794bk c0794bk = (C0794bk) obj;
                if (c0794bk.h) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0719ab)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                U(c0794bk);
            } else {
                boolean z = obj instanceof InterfaceC2249xs;
                PE pe = PE.h;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0031Bc c0031Bc = obj2 instanceof C0031Bc ? (C0031Bc) obj2 : null;
                    c0719ab.l(c0031Bc != null ? c0031Bc.a : null);
                    return pe;
                }
                OE d = ((InterfaceC2249xs) obj).d();
                if (d == null) {
                    AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    V((AbstractC0179Gu) obj);
                } else if (!d.e(c0719ab, 7)) {
                    boolean e = d.e(c0719ab, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C0257Ju) {
                        r4 = ((C0257Ju) obj3).c();
                    } else {
                        C0031Bc c0031Bc2 = obj3 instanceof C0031Bc ? (C0031Bc) obj3 : null;
                        if (c0031Bc2 != null) {
                            r4 = c0031Bc2.a;
                        }
                    }
                    c0719ab.l(r4);
                    if (e) {
                        break loop0;
                    }
                    return pe;
                }
            }
        }
        return c0719ab;
    }

    public final InterfaceC0297Li L(boolean z, AbstractC0179Gu abstractC0179Gu) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        PE pe;
        boolean z2;
        boolean e;
        abstractC0179Gu.k = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C0794bk;
            pe = PE.h;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC2249xs)) {
                    z2 = false;
                    break;
                }
                InterfaceC2249xs interfaceC2249xs = (InterfaceC2249xs) obj;
                OE d = interfaceC2249xs.d();
                if (d == null) {
                    AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    V((AbstractC0179Gu) obj);
                } else {
                    if (abstractC0179Gu.k()) {
                        C0257Ju c0257Ju = interfaceC2249xs instanceof C0257Ju ? (C0257Ju) interfaceC2249xs : null;
                        Throwable c = c0257Ju != null ? c0257Ju.c() : null;
                        if (c == null) {
                            e = d.e(abstractC0179Gu, 5);
                        } else if (z) {
                            abstractC0179Gu.l(c);
                            return pe;
                        }
                    } else {
                        e = d.e(abstractC0179Gu, 1);
                    }
                    if (e) {
                        break;
                    }
                }
            } else {
                C0794bk c0794bk = (C0794bk) obj;
                if (c0794bk.h) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC0179Gu)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                U(c0794bk);
            }
        }
        if (z2) {
            return abstractC0179Gu;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0031Bc c0031Bc = obj2 instanceof C0031Bc ? (C0031Bc) obj2 : null;
            abstractC0179Gu.l(c0031Bc != null ? c0031Bc.a : null);
        }
        return pe;
    }

    public boolean M() {
        return this instanceof C1610o8;
    }

    public final boolean N(Object obj) {
        Object Y;
        do {
            Y = Y(h.get(this), obj);
            if (Y == EB.h) {
                return false;
            }
            if (Y == EB.i) {
                return true;
            }
        } while (Y == EB.j);
        i(Y);
        return true;
    }

    public final Object O(Object obj) {
        Object Y;
        do {
            Y = Y(h.get(this), obj);
            if (Y == EB.h) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0031Bc c0031Bc = obj instanceof C0031Bc ? (C0031Bc) obj : null;
                throw new IllegalStateException(str, c0031Bc != null ? c0031Bc.a : null);
            }
        } while (Y == EB.j);
        return Y;
    }

    public String P() {
        return getClass().getSimpleName();
    }

    public final void R(OE oe, Throwable th) {
        oe.e(new C0954eA(4), 4);
        Object obj = XA.h.get(oe);
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C0057Cc c0057Cc = null;
        for (XA xa = (XA) obj; !xa.equals(oe); xa = xa.h()) {
            if ((xa instanceof AbstractC0179Gu) && ((AbstractC0179Gu) xa).k()) {
                try {
                    ((AbstractC0179Gu) xa).l(th);
                } catch (Throwable th2) {
                    if (c0057Cc != null) {
                        AbstractC0946e20.e(c0057Cc, th2);
                    } else {
                        c0057Cc = new C0057Cc("Exception in completion handler " + xa + " for " + this, th2);
                    }
                }
            }
        }
        if (c0057Cc != null) {
            H(c0057Cc);
        }
        p(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [o.vs] */
    public final void U(C0794bk c0794bk) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        OE oe = new OE();
        if (!c0794bk.h) {
            oe = new C2117vs(oe);
        }
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0794bk, oe)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c0794bk);
    }

    public final void V(AbstractC0179Gu abstractC0179Gu) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        OE oe = new OE();
        abstractC0179Gu.getClass();
        XA.i.set(oe, abstractC0179Gu);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = XA.h;
        atomicReferenceFieldUpdater2.set(oe, abstractC0179Gu);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC0179Gu) == abstractC0179Gu) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0179Gu, abstractC0179Gu, oe)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC0179Gu) != abstractC0179Gu) {
                        break;
                    }
                }
                oe.g(abstractC0179Gu);
                break loop0;
            }
            break;
        }
        XA h2 = abstractC0179Gu.h();
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0179Gu, h2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0179Gu);
    }

    public final int W(Object obj) {
        boolean z = obj instanceof C0794bk;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (z) {
            if (((C0794bk) obj).h) {
                return 0;
            }
            C0794bk c0794bk = EB.n;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0794bk)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            T();
            return 1;
        }
        if (!(obj instanceof C2117vs)) {
            return 0;
        }
        OE oe = ((C2117vs) obj).h;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oe)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        T();
        return 1;
    }

    public final Object Y(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC2249xs)) {
            return EB.h;
        }
        if (((obj instanceof C0794bk) || (obj instanceof AbstractC0179Gu)) && !(obj instanceof C0719ab) && !(obj2 instanceof C0031Bc)) {
            InterfaceC2249xs interfaceC2249xs = (InterfaceC2249xs) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object c2315ys = obj2 instanceof InterfaceC2249xs ? new C2315ys((InterfaceC2249xs) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2249xs, c2315ys)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC2249xs) {
                    return EB.j;
                }
            }
            S(obj2);
            u(interfaceC2249xs, obj2);
            return obj2;
        }
        InterfaceC2249xs interfaceC2249xs2 = (InterfaceC2249xs) obj;
        OE E = E(interfaceC2249xs2);
        if (E == null) {
            return EB.j;
        }
        C0257Ju c0257Ju = interfaceC2249xs2 instanceof C0257Ju ? (C0257Ju) interfaceC2249xs2 : null;
        if (c0257Ju == null) {
            c0257Ju = new C0257Ju(E, null);
        }
        synchronized (c0257Ju) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0257Ju.i;
            if (atomicIntegerFieldUpdater.get(c0257Ju) != 0) {
                return EB.h;
            }
            atomicIntegerFieldUpdater.set(c0257Ju, 1);
            if (c0257Ju != interfaceC2249xs2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC2249xs2, c0257Ju)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC2249xs2) {
                        return EB.j;
                    }
                }
            }
            boolean e = c0257Ju.e();
            C0031Bc c0031Bc = obj2 instanceof C0031Bc ? (C0031Bc) obj2 : null;
            if (c0031Bc != null) {
                c0257Ju.a(c0031Bc.a);
            }
            Throwable c = e ? null : c0257Ju.c();
            if (c != null) {
                R(E, c);
            }
            C0719ab Q = Q(E);
            if (Q != null && Z(c0257Ju, Q, obj2)) {
                return EB.i;
            }
            E.e(new C0954eA(2), 2);
            C0719ab Q2 = Q(E);
            return (Q2 == null || !Z(c0257Ju, Q2, obj2)) ? x(c0257Ju, obj2) : EB.i;
        }
    }

    public final boolean Z(C0257Ju c0257Ju, C0719ab c0719ab, Object obj) {
        while (PX.b0(c0719ab.l, false, new C0231Iu(this, c0257Ju, c0719ab, obj)) == PE.h) {
            c0719ab = Q(c0719ab);
            if (c0719ab == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC0075Cu
    public boolean b() {
        Object obj = h.get(this);
        return (obj instanceof InterfaceC2249xs) && ((InterfaceC2249xs) obj).b();
    }

    @Override // o.InterfaceC0075Cu
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0101Du(r(), null, this);
        }
        o(cancellationException);
    }

    @Override // o.InterfaceC0137Fe
    public final InterfaceC0163Ge getKey() {
        return C0460Rq.K;
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He j(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.z0(this, interfaceC0163Ge);
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0137Fe k(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.J(this, interfaceC0163Ge);
    }

    public void l(Object obj) {
        i(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == o.EB.i) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(Object obj) {
        C0457Rn c0457Rn;
        Object obj2 = EB.h;
        if (A()) {
            do {
                Object obj3 = h.get(this);
                if (obj3 instanceof InterfaceC2249xs) {
                    if (obj3 instanceof C0257Ju) {
                        C0257Ju c0257Ju = (C0257Ju) obj3;
                        c0257Ju.getClass();
                        if (C0257Ju.i.get(c0257Ju) != 0) {
                        }
                    }
                    obj2 = Y(obj3, new C0031Bc(w(obj), false));
                }
                obj2 = EB.h;
                break;
            } while (obj2 == EB.j);
        }
        if (obj2 == EB.h) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof C0257Ju)) {
                    if (!(obj4 instanceof InterfaceC2249xs)) {
                        c0457Rn = EB.k;
                        break;
                    }
                    if (th == null) {
                        th = w(obj);
                    }
                    InterfaceC2249xs interfaceC2249xs = (InterfaceC2249xs) obj4;
                    if (interfaceC2249xs.b()) {
                        OE E = E(interfaceC2249xs);
                        if (E != null) {
                            C0257Ju c0257Ju2 = new C0257Ju(E, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2249xs, c0257Ju2)) {
                                if (atomicReferenceFieldUpdater.get(this) != interfaceC2249xs) {
                                    break;
                                }
                            }
                            R(E, th);
                            c0457Rn = EB.h;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object Y = Y(obj4, new C0031Bc(th, false));
                        if (Y == EB.h) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (Y != EB.j) {
                            obj2 = Y;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        C0257Ju c0257Ju3 = (C0257Ju) obj4;
                        c0257Ju3.getClass();
                        if (C0257Ju.k.get(c0257Ju3) == EB.l) {
                            c0457Rn = EB.k;
                        } else {
                            boolean e = ((C0257Ju) obj4).e();
                            if (th == null) {
                                th = w(obj);
                            }
                            ((C0257Ju) obj4).a(th);
                            Throwable c = e ? null : ((C0257Ju) obj4).c();
                            if (c != null) {
                                R(((C0257Ju) obj4).h, c);
                            }
                            c0457Rn = EB.h;
                        }
                    }
                }
            }
            obj2 = c0457Rn;
        }
        if (obj2 != EB.h && obj2 != EB.i) {
            if (obj2 == EB.k) {
                return false;
            }
            i(obj2);
            return true;
        }
        return true;
    }

    public void o(CancellationException cancellationException) {
        n(cancellationException);
    }

    public final boolean p(Throwable th) {
        if (M()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0652Za interfaceC0652Za = (InterfaceC0652Za) i.get(this);
        return (interfaceC0652Za == null || interfaceC0652Za == PE.h) ? z : interfaceC0652Za.c(th) || z;
    }

    @Override // o.InterfaceC0075Cu
    public final Object q(C0211Ia c0211Ia) {
        Object obj;
        C0782bY c0782bY;
        do {
            obj = h.get(this);
            boolean z = obj instanceof InterfaceC2249xs;
            c0782bY = C0782bY.a;
            if (!z) {
                PX.F(c0211Ia.getContext());
                return c0782bY;
            }
        } while (W(obj) < 0);
        C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(c0211Ia));
        c0849ca.r();
        c0849ca.u(new Y9(2, PX.b0(this, true, new C0626Ya(c0849ca, 1))));
        Object q = c0849ca.q();
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (q != enumC0448Re) {
            q = c0782bY;
        }
        return q == enumC0448Re ? q : c0782bY;
    }

    public String r() {
        return "Job was cancelled";
    }

    public boolean s(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return n(th) && z();
    }

    @Override // o.InterfaceC0075Cu
    public final boolean start() {
        int W;
        do {
            W = W(h.get(this));
            if (W == 0) {
                return false;
            }
        } while (W != 1);
        return true;
    }

    @Override // o.InterfaceC0075Cu
    public final CancellationException t() {
        CancellationException cancellationException;
        Object obj = h.get(this);
        if (!(obj instanceof C0257Ju)) {
            if (obj instanceof InterfaceC2249xs) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0031Bc)) {
                return new C0101Du(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0031Bc) obj).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C0101Du(r(), th, this) : cancellationException;
        }
        Throwable c = ((C0257Ju) obj).c();
        if (c == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = r();
        }
        return new C0101Du(concat, c, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(P() + '{' + X(h.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC1052fg.B(this));
        return sb.toString();
    }

    public final void u(InterfaceC2249xs interfaceC2249xs, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        InterfaceC0652Za interfaceC0652Za = (InterfaceC0652Za) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0652Za != null) {
            interfaceC0652Za.a();
            atomicReferenceFieldUpdater.set(this, PE.h);
        }
        C0057Cc c0057Cc = null;
        C0031Bc c0031Bc = obj instanceof C0031Bc ? (C0031Bc) obj : null;
        Throwable th = c0031Bc != null ? c0031Bc.a : null;
        if (interfaceC2249xs instanceof AbstractC0179Gu) {
            try {
                ((AbstractC0179Gu) interfaceC2249xs).l(th);
                return;
            } catch (Throwable th2) {
                H(new C0057Cc("Exception in completion handler " + interfaceC2249xs + " for " + this, th2));
                return;
            }
        }
        OE d = interfaceC2249xs.d();
        if (d != null) {
            d.e(new C0954eA(1), 1);
            Object obj2 = XA.h.get(d);
            AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (XA xa = (XA) obj2; !xa.equals(d); xa = xa.h()) {
                if (xa instanceof AbstractC0179Gu) {
                    try {
                        ((AbstractC0179Gu) xa).l(th);
                    } catch (Throwable th3) {
                        if (c0057Cc != null) {
                            AbstractC0946e20.e(c0057Cc, th3);
                        } else {
                            c0057Cc = new C0057Cc("Exception in completion handler " + xa + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0057Cc != null) {
                H(c0057Cc);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable w(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C0283Ku c0283Ku = (C0283Ku) ((InterfaceC2344zH) obj);
        Object obj2 = h.get(c0283Ku);
        if (obj2 instanceof C0257Ju) {
            cancellationException = ((C0257Ju) obj2).c();
        } else if (obj2 instanceof C0031Bc) {
            cancellationException = ((C0031Bc) obj2).a;
        } else {
            if (obj2 instanceof InterfaceC2249xs) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new C0101Du("Parent job is ".concat(X(obj2)), cancellationException, c0283Ku) : cancellationException2;
    }

    public final Object x(C0257Ju c0257Ju, Object obj) {
        Throwable y;
        C0031Bc c0031Bc = obj instanceof C0031Bc ? (C0031Bc) obj : null;
        Throwable th = c0031Bc != null ? c0031Bc.a : null;
        synchronized (c0257Ju) {
            c0257Ju.e();
            ArrayList<Throwable> f = c0257Ju.f(th);
            y = y(c0257Ju, f);
            if (y != null && f.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                for (Throwable th2 : f) {
                    if (th2 != y && th2 != y && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        AbstractC0946e20.e(y, th2);
                    }
                }
            }
        }
        if (y != null && y != th) {
            obj = new C0031Bc(y, false);
        }
        if (y != null && (p(y) || G(y))) {
            AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0031Bc.b.compareAndSet((C0031Bc) obj, 0, 1);
        }
        S(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        Object c2315ys = obj instanceof InterfaceC2249xs ? new C2315ys((InterfaceC2249xs) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0257Ju, c2315ys) && atomicReferenceFieldUpdater.get(this) == c0257Ju) {
        }
        u(c0257Ju, obj);
        return obj;
    }

    public final Throwable y(C0257Ju c0257Ju, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (c0257Ju.e()) {
                return new C0101Du(r(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof OV) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof OV)) {
                    obj2 = next;
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

    public boolean z() {
        return true;
    }

    public void T() {
    }

    public void H(C0057Cc c0057Cc) {
        throw c0057Cc;
    }

    public void S(Object obj) {
    }

    public void i(Object obj) {
    }
}
