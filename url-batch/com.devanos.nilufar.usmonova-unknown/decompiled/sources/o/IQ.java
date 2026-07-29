package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class IQ {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(IQ.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(IQ.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(IQ.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(IQ.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(IQ.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final C0784ba a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public IQ() {
        KQ kq = new KQ(0L, null, 2);
        this.head$volatile = kq;
        this.tail$volatile = kq;
        this._availablePermits$volatile = 1;
        this.a = new C0784ba(2, this);
    }

    public final void a(C0696aE c0696aE) {
        Object I;
        KQ kq;
        C0849ca c0849ca = c0696aE.h;
        C0762bE c0762bE = c0696aE.i;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                C0782bY c0782bY = C0782bY.a;
                if (andDecrement > 0) {
                    C0762bE.g.set(c0762bE, null);
                    c0849ca.A(c0782bY, c0849ca.j, new C0784ba(0, new C1730q(c0762bE, c0696aE)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                KQ kq2 = (KQ) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                GQ gq = GQ.j;
                long j = andIncrement / JQ.f;
                while (true) {
                    I = PX.I(kq2, j, gq);
                    if (!AbstractC0772bO.s(I)) {
                        AbstractC1760qQ n = AbstractC0772bO.n(I);
                        while (true) {
                            AbstractC1760qQ abstractC1760qQ = (AbstractC1760qQ) atomicReferenceFieldUpdater.get(this);
                            kq = kq2;
                            if (abstractC1760qQ.c >= n.c) {
                                break;
                            }
                            if (!n.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC1760qQ, n)) {
                                if (atomicReferenceFieldUpdater.get(this) != abstractC1760qQ) {
                                    if (n.e()) {
                                        n.d();
                                    }
                                    kq2 = kq;
                                }
                            }
                            if (abstractC1760qQ.e()) {
                                abstractC1760qQ.d();
                            }
                        }
                    } else {
                        break;
                    }
                    kq2 = kq;
                }
                KQ kq3 = (KQ) AbstractC0772bO.n(I);
                AtomicReferenceArray atomicReferenceArray = kq3.e;
                int i = (int) (andIncrement % JQ.f);
                while (!atomicReferenceArray.compareAndSet(i, null, c0696aE)) {
                    if (atomicReferenceArray.get(i) != null) {
                        C0457Rn c0457Rn = JQ.b;
                        C0457Rn c0457Rn2 = JQ.c;
                        while (!atomicReferenceArray.compareAndSet(i, c0457Rn, c0457Rn2)) {
                            if (atomicReferenceArray.get(i) != c0457Rn) {
                                break;
                            }
                        }
                        C0762bE.g.set(c0762bE, null);
                        c0849ca.A(c0782bY, c0849ca.j, new C0784ba(0, new C1730q(c0762bE, c0696aE)));
                        return;
                    }
                }
                c0696aE.a(kq3, i);
                return;
            }
        }
    }

    public final void b() {
        boolean z;
        int i;
        Object I;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            KQ kq = (KQ) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j = andIncrement2 / JQ.f;
            HQ hq = HQ.j;
            while (true) {
                I = PX.I(kq, j, hq);
                if (!AbstractC0772bO.s(I)) {
                    AbstractC1760qQ n = AbstractC0772bO.n(I);
                    while (true) {
                        AbstractC1760qQ abstractC1760qQ = (AbstractC1760qQ) atomicReferenceFieldUpdater.get(this);
                        if (abstractC1760qQ.c >= n.c) {
                            break;
                        }
                        if (!n.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC1760qQ, n)) {
                            if (atomicReferenceFieldUpdater.get(this) != abstractC1760qQ) {
                                if (n.e()) {
                                    n.d();
                                }
                            }
                        }
                        if (abstractC1760qQ.e()) {
                            abstractC1760qQ.d();
                        }
                    }
                } else {
                    break;
                }
            }
            KQ kq2 = (KQ) AbstractC0772bO.n(I);
            AtomicReferenceArray atomicReferenceArray = kq2.e;
            kq2.a();
            boolean z2 = false;
            if (kq2.c <= j) {
                int i2 = (int) (andIncrement2 % JQ.f);
                Object andSet = atomicReferenceArray.getAndSet(i2, JQ.b);
                if (andSet == null) {
                    int i3 = JQ.a;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            C0457Rn c0457Rn = JQ.b;
                            C0457Rn c0457Rn2 = JQ.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i2, c0457Rn, c0457Rn2)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i2) != c0457Rn) {
                                    break;
                                }
                            }
                            z = true ^ z2;
                        } else if (atomicReferenceArray.get(i2) == JQ.c) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (andSet != JQ.e) {
                    if (!(andSet instanceof InterfaceC0718aa)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0718aa interfaceC0718aa = (InterfaceC0718aa) andSet;
                    C0457Rn g = interfaceC0718aa.g(C0782bY.a, this.a);
                    if (g != null) {
                        interfaceC0718aa.h(g);
                    }
                }
            }
            z = false;
        } while (!z);
    }
}
