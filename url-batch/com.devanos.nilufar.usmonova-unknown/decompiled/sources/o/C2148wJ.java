package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.wJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2148wJ extends AbstractC1993u implements InterfaceC2214xJ, InterfaceC2363za {
    public final J8 k;

    public C2148wJ(InterfaceC0189He interfaceC0189He, J8 j8) {
        super(interfaceC0189He, true);
        this.k = j8;
    }

    @Override // o.TL
    public final Object a(InterfaceC2235xe interfaceC2235xe) {
        return this.k.a(interfaceC2235xe);
    }

    @Override // o.AbstractC1993u
    public final void a0(Throwable th, boolean z) {
        if (this.k.j(th, false) || z) {
            return;
        }
        AbstractC1807r8.J(th, this.j);
    }

    @Override // o.AbstractC1993u
    public final void b0(Object obj) {
        this.k.j(null, false);
    }

    @Override // o.C0283Ku, o.InterfaceC0075Cu
    public final void c(CancellationException cancellationException) {
        Object obj = C0283Ku.h.get(this);
        if (obj instanceof C0031Bc) {
            return;
        }
        if ((obj instanceof C0257Ju) && ((C0257Ju) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0101Du(r(), null, this);
        }
        o(cancellationException);
    }

    @Override // o.LQ
    public final Object d(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return this.k.d(obj, interfaceC2235xe);
    }

    public final void d0(C1466m c1466m) {
        J8 j8 = this.k;
        j8.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = J8.q;
        while (!atomicReferenceFieldUpdater.compareAndSet(j8, null, c1466m)) {
            if (atomicReferenceFieldUpdater.get(j8) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(j8);
                    C0457Rn c0457Rn = L8.q;
                    if (obj != c0457Rn) {
                        if (obj == L8.r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    C0457Rn c0457Rn2 = L8.r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(j8, c0457Rn, c0457Rn2)) {
                        if (atomicReferenceFieldUpdater.get(j8) != c0457Rn) {
                            break;
                        }
                    }
                    c1466m.invoke(j8.o());
                    return;
                }
            }
        }
    }

    @Override // o.TL
    public final Object e() {
        return this.k.e();
    }

    @Override // o.LQ
    public final Object f(Object obj) {
        return this.k.f(obj);
    }

    @Override // o.C0283Ku
    public final void o(CancellationException cancellationException) {
        this.k.j(cancellationException, true);
        n(cancellationException);
    }
}
