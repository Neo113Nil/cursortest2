package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0849ca extends AbstractC0063Ci implements InterfaceC0718aa, InterfaceC0474Se, C00 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(C0849ca.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(C0849ca.class, Object.class, "_state$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f151o = AtomicReferenceFieldUpdater.newUpdater(C0849ca.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final InterfaceC2235xe k;
    public final InterfaceC0189He l;

    public C0849ca(int i, InterfaceC2235xe interfaceC2235xe) {
        super(i);
        this.k = interfaceC2235xe;
        this.l = interfaceC2235xe.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1.a;
    }

    public static Object C(SE se, Object obj, int i, InterfaceC2378zp interfaceC2378zp) {
        if (obj instanceof C0031Bc) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC2378zp != null || (se instanceof Y9)) {
            return new C2365zc(obj, se instanceof Y9 ? (Y9) se : null, interfaceC2378zp, (Throwable) null, 16);
        }
        return obj;
    }

    public static void w(SE se, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + se + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, InterfaceC2378zp interfaceC2378zp) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof SE) {
                Object C = C((SE) obj2, obj, i, interfaceC2378zp);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    n();
                }
                o(i);
                return;
            }
            if (obj2 instanceof C0915da) {
                C0915da c0915da = (C0915da) obj2;
                c0915da.getClass();
                if (C0915da.c.compareAndSet(c0915da, 0, 1)) {
                    if (interfaceC2378zp != null) {
                        k(interfaceC2378zp, c0915da.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC0267Ke abstractC0267Ke) {
        InterfaceC2235xe interfaceC2235xe = this.k;
        C0011Ai c0011Ai = interfaceC2235xe instanceof C0011Ai ? (C0011Ai) interfaceC2235xe : null;
        A(C0782bY.a, (c0011Ai != null ? c0011Ai.k : null) == abstractC0267Ke ? 4 : this.j, null);
    }

    @Override // o.C00
    public final void a(AbstractC1760qQ abstractC1760qQ, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = m;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        u(abstractC1760qQ);
    }

    @Override // o.AbstractC0063Ci
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof SE) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0031Bc) {
                return;
            }
            if (!(obj instanceof C2365zc)) {
                cancellationException2 = cancellationException;
                C2365zc c2365zc = new C2365zc(obj, (Y9) null, (InterfaceC2378zp) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2365zc)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C2365zc c2365zc2 = (C2365zc) obj;
            if (c2365zc2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C2365zc a = C2365zc.a(c2365zc2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            Y9 y9 = c2365zc2.b;
            if (y9 != null) {
                j(y9, cancellationException);
            }
            InterfaceC2378zp interfaceC2378zp = c2365zc2.c;
            if (interfaceC2378zp != null) {
                k(interfaceC2378zp, cancellationException, c2365zc2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // o.AbstractC0063Ci
    public final InterfaceC2235xe c() {
        return this.k;
    }

    @Override // o.AbstractC0063Ci
    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    @Override // o.AbstractC0063Ci
    public final Object e(Object obj) {
        return obj instanceof C2365zc ? ((C2365zc) obj).a : obj;
    }

    @Override // o.InterfaceC0718aa
    public final C0457Rn g(Object obj, InterfaceC2378zp interfaceC2378zp) {
        C0457Rn c0457Rn = AbstractC0022At.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof SE)) {
                return null;
            }
            Object C = C((SE) obj2, obj, this.j, interfaceC2378zp);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                n();
            }
            return c0457Rn;
        }
    }

    @Override // o.InterfaceC0474Se
    public final InterfaceC0474Se getCallerFrame() {
        InterfaceC2235xe interfaceC2235xe = this.k;
        if (interfaceC2235xe instanceof InterfaceC0474Se) {
            return (InterfaceC0474Se) interfaceC2235xe;
        }
        return null;
    }

    @Override // o.InterfaceC2235xe
    public final InterfaceC0189He getContext() {
        return this.l;
    }

    @Override // o.InterfaceC0718aa
    public final void h(Object obj) {
        o(this.j);
    }

    @Override // o.AbstractC0063Ci
    public final Object i() {
        return n.get(this);
    }

    public final void j(Y9 y9, Throwable th) {
        try {
            switch (y9.a) {
                case 0:
                    ((ScheduledFuture) y9.b).cancel(false);
                    break;
                case 1:
                    ((InterfaceC2114vp) y9.b).invoke(th);
                    break;
                default:
                    ((InterfaceC0297Li) y9.b).a();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC1807r8.J(new C0057Cc("Exception in invokeOnCancellation handler for " + this, th2), this.l);
        }
    }

    public final void k(InterfaceC2378zp interfaceC2378zp, Throwable th, Object obj) {
        InterfaceC0189He interfaceC0189He = this.l;
        try {
            interfaceC2378zp.e(th, obj, interfaceC0189He);
        } catch (Throwable th2) {
            AbstractC1807r8.J(new C0057Cc("Exception in resume onCancellation handler for " + this, th2), interfaceC0189He);
        }
    }

    public final void l(AbstractC1760qQ abstractC1760qQ, Throwable th) {
        InterfaceC0189He interfaceC0189He = this.l;
        int i = m.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC1760qQ.g(i, interfaceC0189He);
        } catch (Throwable th2) {
            AbstractC1807r8.J(new C0057Cc("Exception in invokeOnCancellation handler for " + this, th2), interfaceC0189He);
        }
    }

    public final boolean m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof SE)) {
                return false;
            }
            C0915da c0915da = new C0915da(this, th, (obj instanceof Y9) || (obj instanceof AbstractC1760qQ));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0915da)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            SE se = (SE) obj;
            if (se instanceof Y9) {
                j((Y9) obj, th);
            } else if (se instanceof AbstractC1760qQ) {
                l((AbstractC1760qQ) obj, th);
            }
            if (!v()) {
                n();
            }
            o(this.j);
            return true;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151o;
        InterfaceC0297Li interfaceC0297Li = (InterfaceC0297Li) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0297Li == null) {
            return;
        }
        interfaceC0297Li.a();
        atomicReferenceFieldUpdater.set(this, PE.h);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = m;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                InterfaceC2235xe interfaceC2235xe = this.k;
                if (!z && (interfaceC2235xe instanceof C0011Ai)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.j;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C0011Ai c0011Ai = (C0011Ai) interfaceC2235xe;
                        AbstractC0267Ke abstractC0267Ke = c0011Ai.k;
                        InterfaceC0189He context = c0011Ai.l.getContext();
                        if (abstractC0267Ke.M(context)) {
                            abstractC0267Ke.L(context, this);
                            return;
                        }
                        AbstractC0454Rk a = EV.a();
                        if (a.j >= 4294967296L) {
                            a.P(this);
                            return;
                        }
                        a.R(true);
                        try {
                            AbstractC1305jX.E(this, interfaceC2235xe, true);
                            do {
                            } while (a.T());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC1305jX.E(this, interfaceC2235xe, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable p(C0283Ku c0283Ku) {
        return c0283Ku.t();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC0075Cu interfaceC0075Cu;
        boolean v = v();
        do {
            atomicIntegerFieldUpdater = m;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (v) {
                    y();
                }
                Object obj = n.get(this);
                if (obj instanceof C0031Bc) {
                    throw ((C0031Bc) obj).a;
                }
                int i3 = this.j;
                if ((i3 != 1 && i3 != 2) || (interfaceC0075Cu = (InterfaceC0075Cu) this.l.k(C0460Rq.K)) == null || interfaceC0075Cu.b()) {
                    return e(obj);
                }
                CancellationException t = interfaceC0075Cu.t();
                b(t);
                throw t;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC0297Li) f151o.get(this)) == null) {
            s();
        }
        if (v) {
            y();
        }
        return EnumC0448Re.h;
    }

    public final void r() {
        InterfaceC0297Li s = s();
        if (s == null || (n.get(this) instanceof SE)) {
            return;
        }
        s.a();
        f151o.set(this, PE.h);
    }

    @Override // o.InterfaceC2235xe
    public final void resumeWith(Object obj) {
        Throwable a = C1428lO.a(obj);
        if (a != null) {
            obj = new C0031Bc(a, false);
        }
        A(obj, this.j, null);
    }

    public final InterfaceC0297Li s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) this.l.k(C0460Rq.K);
        if (interfaceC0075Cu == null) {
            return null;
        }
        InterfaceC0297Li b0 = PX.b0(interfaceC0075Cu, true, new C0626Ya(this, 0));
        do {
            atomicReferenceFieldUpdater = f151o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, b0)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return b0;
    }

    public final void t(InterfaceC2114vp interfaceC2114vp) {
        u(new Y9(1, interfaceC2114vp));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(AbstractC1052fg.U(this.k));
        sb.append("){");
        Object obj = n.get(this);
        sb.append(obj instanceof SE ? "Active" : obj instanceof C0915da ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC1052fg.B(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00aa, code lost:
    
        w(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(SE se) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, se)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof Y9) || (obj instanceof AbstractC1760qQ)) {
                break;
            }
            if (obj instanceof C0031Bc) {
                C0031Bc c0031Bc = (C0031Bc) obj;
                c0031Bc.getClass();
                if (!C0031Bc.b.compareAndSet(c0031Bc, 0, 1)) {
                    w(se, obj);
                    throw null;
                }
                if (obj instanceof C0915da) {
                    if (obj == null) {
                        c0031Bc = null;
                    }
                    Throwable th = c0031Bc != null ? c0031Bc.a : null;
                    if (se instanceof Y9) {
                        j((Y9) se, th);
                        return;
                    } else {
                        l((AbstractC1760qQ) se, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C2365zc)) {
                if (se instanceof AbstractC1760qQ) {
                    return;
                }
                C2365zc c2365zc = new C2365zc(obj, (Y9) se, (InterfaceC2378zp) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2365zc)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C2365zc c2365zc2 = (C2365zc) obj;
            if (c2365zc2.b != null) {
                w(se, obj);
                throw null;
            }
            if (se instanceof AbstractC1760qQ) {
                return;
            }
            Y9 y9 = (Y9) se;
            Throwable th2 = c2365zc2.e;
            if (th2 != null) {
                j(y9, th2);
                return;
            }
            C2365zc a = C2365zc.a(c2365zc2, y9, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean v() {
        if (this.j != 2) {
            return false;
        }
        InterfaceC2235xe interfaceC2235xe = this.k;
        AbstractC0048Bt.l(interfaceC2235xe, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C0011Ai.f12o.get((C0011Ai) interfaceC2235xe) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        InterfaceC2235xe interfaceC2235xe = this.k;
        Throwable th = null;
        C0011Ai c0011Ai = interfaceC2235xe instanceof C0011Ai ? (C0011Ai) interfaceC2235xe : null;
        if (c0011Ai != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0011Ai.f12o;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c0011Ai);
                C0457Rn c0457Rn = AbstractC0022At.c;
                if (obj == c0457Rn) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0011Ai, c0457Rn, this)) {
                        if (atomicReferenceFieldUpdater.get(c0011Ai) != c0457Rn) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0011Ai, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c0011Ai) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            m(th);
        }
    }

    public final void z(Object obj, InterfaceC2378zp interfaceC2378zp) {
        A(obj, this.j, interfaceC2378zp);
    }
}
