package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class I8 implements C00 {
    public Object h = L8.p;
    public C0849ca i;
    public final /* synthetic */ J8 j;

    public I8(J8 j8) {
        this.j = j8;
    }

    @Override // o.C00
    public final void a(AbstractC1760qQ abstractC1760qQ, int i) {
        C0849ca c0849ca = this.i;
        if (c0849ca != null) {
            c0849ca.a(abstractC1760qQ, i);
        }
    }

    public final Object b(AbstractC2367ze abstractC2367ze) {
        C0392Pa c0392Pa;
        Boolean bool;
        Object obj = this.h;
        boolean z = true;
        if (obj == L8.p || obj == L8.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = J8.n;
            J8 j8 = this.j;
            C0392Pa c0392Pa2 = (C0392Pa) atomicReferenceFieldUpdater.get(j8);
            while (true) {
                j8.getClass();
                if (j8.t(J8.i.get(j8), true)) {
                    this.h = L8.l;
                    Throwable o2 = j8.o();
                    if (o2 != null) {
                        int i = AbstractC0777bT.a;
                        throw o2;
                    }
                    z = false;
                } else {
                    long andIncrement = J8.j.getAndIncrement(j8);
                    long j = L8.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c0392Pa2.c != j2) {
                        c0392Pa = j8.n(j2, c0392Pa2);
                        if (c0392Pa == null) {
                            continue;
                        }
                    } else {
                        c0392Pa = c0392Pa2;
                    }
                    Object C = j8.C(c0392Pa, i2, andIncrement, null);
                    C0457Rn c0457Rn = L8.m;
                    if (C == c0457Rn) {
                        throw new IllegalStateException("unreachable");
                    }
                    C0457Rn c0457Rn2 = L8.f61o;
                    if (C == c0457Rn2) {
                        if (andIncrement < j8.r()) {
                            c0392Pa.a();
                        }
                        c0392Pa2 = c0392Pa;
                    } else {
                        if (C == L8.n) {
                            J8 j82 = this.j;
                            C0849ca G = AbstractC1807r8.G(AbstractC1473m3.L(abstractC2367ze));
                            try {
                                this.i = G;
                                Object C2 = j82.C(c0392Pa, i2, andIncrement, this);
                                if (C2 == c0457Rn) {
                                    a(c0392Pa, i2);
                                } else {
                                    if (C2 == c0457Rn2) {
                                        if (andIncrement < j82.r()) {
                                            c0392Pa.a();
                                        }
                                        C0392Pa c0392Pa3 = (C0392Pa) J8.n.get(j82);
                                        while (true) {
                                            if (j82.t(J8.i.get(j82), true)) {
                                                C0849ca c0849ca = this.i;
                                                AbstractC0048Bt.k(c0849ca);
                                                this.i = null;
                                                this.h = L8.l;
                                                Throwable o3 = j8.o();
                                                if (o3 == null) {
                                                    c0849ca.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c0849ca.resumeWith(AbstractC1494mO.d(o3));
                                                }
                                            } else {
                                                long andIncrement2 = J8.j.getAndIncrement(j82);
                                                long j3 = L8.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c0392Pa3.c != j4) {
                                                    C0392Pa n = j82.n(j4, c0392Pa3);
                                                    if (n != null) {
                                                        c0392Pa3 = n;
                                                    }
                                                }
                                                Object C3 = j82.C(c0392Pa3, i3, andIncrement2, this);
                                                if (C3 == L8.m) {
                                                    a(c0392Pa3, i3);
                                                    break;
                                                }
                                                if (C3 == L8.f61o) {
                                                    if (andIncrement2 < j82.r()) {
                                                        c0392Pa3.a();
                                                    }
                                                } else {
                                                    if (C3 == L8.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c0392Pa3.a();
                                                    this.h = C3;
                                                    this.i = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        c0392Pa.a();
                                        this.h = C2;
                                        this.i = null;
                                        bool = Boolean.TRUE;
                                    }
                                    G.z(bool, null);
                                }
                                return G.q();
                            } catch (Throwable th) {
                                G.y();
                                throw th;
                            }
                        }
                        c0392Pa.a();
                        this.h = C;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.h;
        C0457Rn c0457Rn = L8.p;
        if (obj == c0457Rn) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.h = c0457Rn;
        if (obj != L8.l) {
            return obj;
        }
        Throwable p = this.j.p();
        int i = AbstractC0777bT.a;
        throw p;
    }
}
