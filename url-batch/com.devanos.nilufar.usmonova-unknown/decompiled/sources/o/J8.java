package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class J8 implements InterfaceC2363za {
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(J8.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(J8.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(J8.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(J8.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(J8.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(J8.class, Object.class, "receiveSegment$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f51o = AtomicReferenceFieldUpdater.newUpdater(J8.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(J8.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(J8.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int h;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public J8(int i2) {
        this.h = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.h(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C0392Pa c0392Pa = L8.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = k.get(this);
        C0392Pa c0392Pa2 = new C0392Pa(0L, null, this, 3);
        this.sendSegment$volatile = c0392Pa2;
        this.receiveSegment$volatile = c0392Pa2;
        if (w()) {
            c0392Pa2 = L8.a;
            AbstractC0048Bt.l(c0392Pa2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c0392Pa2;
        this._closeCause$volatile = L8.s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof InterfaceC0718aa)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0718aa interfaceC0718aa = (InterfaceC0718aa) obj;
        C0392Pa c0392Pa = L8.a;
        C0457Rn g = interfaceC0718aa.g(C0782bY.a, null);
        if (g == null) {
            return false;
        }
        interfaceC0718aa.h(g);
        return true;
    }

    public static final C0392Pa b(J8 j8, long j2, C0392Pa c0392Pa) {
        Object I;
        J8 j82;
        C0392Pa c0392Pa2 = L8.a;
        K8 k8 = K8.j;
        loop0: while (true) {
            I = PX.I(c0392Pa, j2, k8);
            if (!AbstractC0772bO.s(I)) {
                AbstractC1760qQ n2 = AbstractC0772bO.n(I);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                    AbstractC1760qQ abstractC1760qQ = (AbstractC1760qQ) atomicReferenceFieldUpdater.get(j8);
                    if (abstractC1760qQ.c >= n2.c) {
                        break loop0;
                    }
                    if (!n2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(j8, abstractC1760qQ, n2)) {
                        if (atomicReferenceFieldUpdater.get(j8) != abstractC1760qQ) {
                            if (n2.e()) {
                                n2.d();
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
        boolean s = AbstractC0772bO.s(I);
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        if (s) {
            j8.u();
            if (c0392Pa.c * L8.b < atomicLongFieldUpdater.get(j8)) {
                c0392Pa.a();
                return null;
            }
        } else {
            C0392Pa c0392Pa3 = (C0392Pa) AbstractC0772bO.n(I);
            long j3 = c0392Pa3.c;
            if (j3 <= j2) {
                return c0392Pa3;
            }
            long j4 = L8.b * j3;
            while (true) {
                long j5 = i.get(j8);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    j82 = j8;
                    break;
                }
                j82 = j8;
                if (i.compareAndSet(j82, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                j8 = j82;
            }
            if (j3 * L8.b < atomicLongFieldUpdater.get(j82)) {
                c0392Pa3.a();
            }
        }
        return null;
    }

    public static final void g(J8 j8, Object obj, C0849ca c0849ca) {
        c0849ca.resumeWith(AbstractC1494mO.d(j8.q()));
    }

    public static final int h(J8 j8, C0392Pa c0392Pa, int i2, Object obj, long j2, Object obj2, boolean z) {
        c0392Pa.m(i2, obj);
        if (z) {
            return j8.D(c0392Pa, i2, obj, j2, obj2, z);
        }
        Object k2 = c0392Pa.k(i2);
        if (k2 == null) {
            if (j8.i(j2)) {
                if (c0392Pa.j(null, i2, L8.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c0392Pa.j(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof C00) {
            c0392Pa.m(i2, null);
            if (j8.A(k2, obj)) {
                c0392Pa.n(i2, L8.i);
                return 0;
            }
            C0457Rn c0457Rn = L8.k;
            if (c0392Pa.f.getAndSet((i2 * 2) + 1, c0457Rn) == c0457Rn) {
                return 5;
            }
            c0392Pa.l(i2, true);
            return 5;
        }
        return j8.D(c0392Pa, i2, obj, j2, obj2, z);
    }

    public static void s(J8 j8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        if ((atomicLongFieldUpdater.addAndGet(j8, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(j8) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof I8)) {
            if (!(obj instanceof InterfaceC0718aa)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0718aa interfaceC0718aa = (InterfaceC0718aa) obj;
            C0392Pa c0392Pa = L8.a;
            C0457Rn g = interfaceC0718aa.g(obj2, null);
            if (g == null) {
                return false;
            }
            interfaceC0718aa.h(g);
            return true;
        }
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        I8 i8 = (I8) obj;
        C0849ca c0849ca = i8.i;
        AbstractC0048Bt.k(c0849ca);
        i8.i = null;
        i8.h = obj2;
        Boolean bool = Boolean.TRUE;
        i8.j.getClass();
        C0392Pa c0392Pa2 = L8.a;
        C0457Rn g2 = c0849ca.g(bool, null);
        if (g2 == null) {
            return false;
        }
        c0849ca.h(g2);
        return true;
    }

    public final Object C(C0392Pa c0392Pa, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = c0392Pa.f;
        Object k2 = c0392Pa.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return L8.n;
                }
                if (c0392Pa.j(k2, i2, obj)) {
                    m();
                    return L8.m;
                }
            }
        } else if (k2 == L8.d && c0392Pa.j(k2, i2, L8.i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            c0392Pa.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = c0392Pa.k(i2);
            if (k3 == null || k3 == L8.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c0392Pa.j(k3, i2, L8.h)) {
                        m();
                        return L8.f61o;
                    }
                } else {
                    if (obj == null) {
                        return L8.n;
                    }
                    if (c0392Pa.j(k3, i2, obj)) {
                        m();
                        return L8.m;
                    }
                }
            } else if (k3 != L8.d) {
                C0457Rn c0457Rn = L8.j;
                if (k3 == c0457Rn) {
                    return L8.f61o;
                }
                if (k3 == L8.h) {
                    return L8.f61o;
                }
                if (k3 == L8.l) {
                    m();
                    return L8.f61o;
                }
                if (k3 != L8.g && c0392Pa.j(k3, i2, L8.f)) {
                    boolean z = k3 instanceof D00;
                    if (z) {
                        k3 = ((D00) k3).a;
                    }
                    if (B(k3)) {
                        c0392Pa.n(i2, L8.i);
                        m();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        c0392Pa.m(i2, null);
                        return obj3;
                    }
                    c0392Pa.n(i2, c0457Rn);
                    c0392Pa.h();
                    if (z) {
                        m();
                    }
                    return L8.f61o;
                }
            } else if (c0392Pa.j(k3, i2, L8.i)) {
                m();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                c0392Pa.m(i2, null);
                return obj4;
            }
        }
    }

    public final int D(C0392Pa c0392Pa, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object k2 = c0392Pa.k(i2);
            if (k2 == null) {
                if (!i(j2) || z) {
                    if (z) {
                        if (c0392Pa.j(null, i2, L8.j)) {
                            c0392Pa.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c0392Pa.j(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (c0392Pa.j(null, i2, L8.d)) {
                    break;
                }
            } else {
                if (k2 != L8.e) {
                    C0457Rn c0457Rn = L8.k;
                    if (k2 == c0457Rn) {
                        c0392Pa.m(i2, null);
                        return 5;
                    }
                    if (k2 == L8.h) {
                        c0392Pa.m(i2, null);
                        return 5;
                    }
                    if (k2 == L8.l) {
                        c0392Pa.m(i2, null);
                        u();
                        return 4;
                    }
                    c0392Pa.m(i2, null);
                    if (k2 instanceof D00) {
                        k2 = ((D00) k2).a;
                    }
                    if (A(k2, obj)) {
                        c0392Pa.n(i2, L8.i);
                        return 0;
                    }
                    if (c0392Pa.f.getAndSet((i2 * 2) + 1, c0457Rn) != c0457Rn) {
                        c0392Pa.l(i2, true);
                    }
                    return 5;
                }
                if (c0392Pa.j(k2, i2, L8.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void E(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        J8 j8 = this;
        if (j8.w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = k;
            if (atomicLongFieldUpdater.get(j8) > j2) {
                break;
            } else {
                j8 = this;
            }
        }
        int i2 = L8.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = l;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(j8);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(j8)) && j3 == atomicLongFieldUpdater.get(j8)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(j8);
                    if (atomicLongFieldUpdater2.compareAndSet(j8, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        j8 = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(j8);
                    long j6 = atomicLongFieldUpdater2.get(j8);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(j8)) {
                        break;
                    }
                    if (z) {
                        j8 = this;
                    } else {
                        j8 = this;
                        atomicLongFieldUpdater2.compareAndSet(j8, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(j8);
                    if (atomicLongFieldUpdater2.compareAndSet(j8, j9, j9 & 4611686018427387903L)) {
                        return;
                    } else {
                        j8 = this;
                    }
                }
            }
        }
    }

    @Override // o.TL
    public final Object a(InterfaceC2235xe interfaceC2235xe) {
        C0392Pa c0392Pa;
        J8 j8 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        C0392Pa c0392Pa2 = (C0392Pa) atomicReferenceFieldUpdater.get(j8);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            if (j8.t(atomicLongFieldUpdater.get(j8), true)) {
                Throwable p2 = p();
                int i2 = AbstractC0777bT.a;
                throw p2;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(j8);
            long j2 = L8.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (c0392Pa2.c != j3) {
                C0392Pa n2 = j8.n(j3, c0392Pa2);
                if (n2 == null) {
                    continue;
                } else {
                    c0392Pa2 = n2;
                }
            }
            Object C = j8.C(c0392Pa2, i3, andIncrement, null);
            C0457Rn c0457Rn = L8.m;
            if (C == c0457Rn) {
                throw new IllegalStateException("unexpected");
            }
            C0457Rn c0457Rn2 = L8.f61o;
            if (C != c0457Rn2) {
                if (C != L8.n) {
                    c0392Pa2.a();
                    return C;
                }
                C0849ca G = AbstractC1807r8.G(AbstractC1473m3.L(interfaceC2235xe));
                J8 j82 = this;
                try {
                    Object C2 = j82.C(c0392Pa2, i3, andIncrement, G);
                    if (C2 == c0457Rn) {
                        G.a(c0392Pa2, i3);
                    } else if (C2 == c0457Rn2) {
                        if (andIncrement < j82.r()) {
                            c0392Pa2.a();
                        }
                        C0392Pa c0392Pa3 = (C0392Pa) atomicReferenceFieldUpdater.get(j82);
                        while (true) {
                            if (j82.t(atomicLongFieldUpdater.get(j82), true)) {
                                G.resumeWith(AbstractC1494mO.d(j82.p()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(j82);
                            long j4 = L8.b;
                            long j5 = andIncrement2 / j4;
                            int i4 = (int) (andIncrement2 % j4);
                            if (c0392Pa3.c != j5) {
                                c0392Pa = j82.n(j5, c0392Pa3);
                                if (c0392Pa == null) {
                                }
                            } else {
                                c0392Pa = c0392Pa3;
                            }
                            Object C3 = j82.C(c0392Pa, i4, andIncrement2, G);
                            if (C3 == L8.m) {
                                G.a(c0392Pa, i4);
                                break;
                            }
                            if (C3 == L8.f61o) {
                                if (andIncrement2 < r()) {
                                    c0392Pa.a();
                                }
                                j82 = this;
                                c0392Pa3 = c0392Pa;
                            } else {
                                if (C3 == L8.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c0392Pa.a();
                                G.z(C3, null);
                            }
                        }
                    } else {
                        c0392Pa2.a();
                        G.z(C2, null);
                    }
                    return G.q();
                } catch (Throwable th) {
                    G.y();
                    throw th;
                }
            }
            if (andIncrement < r()) {
                c0392Pa2.a();
            }
            j8 = this;
        }
    }

    @Override // o.TL
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        g(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // o.LQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Object obj, InterfaceC2235xe interfaceC2235xe) {
        Object q2;
        Object obj2;
        J8 j8;
        C0392Pa c0392Pa;
        int i2;
        J8 j82 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        C0392Pa c0392Pa2 = (C0392Pa) atomicReferenceFieldUpdater.get(j82);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(j82);
            long j2 = andIncrement & 1152921504606846975L;
            boolean t = j82.t(andIncrement, false);
            int i3 = L8.b;
            long j3 = i3;
            long j4 = j2 / j3;
            int i4 = (int) (j2 % j3);
            long j5 = c0392Pa2.c;
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            C0782bY c0782bY = C0782bY.a;
            if (j5 != j4) {
                C0392Pa b = b(j82, j4, c0392Pa2);
                if (b != null) {
                    c0392Pa2 = b;
                } else if (t) {
                    Object y = y(obj, interfaceC2235xe);
                    if (y == enumC0448Re) {
                        return y;
                    }
                }
            }
            int h = h(j82, c0392Pa2, i4, obj, j2, null, t);
            if (h == 0) {
                c0392Pa2.a();
                return c0782bY;
            }
            if (h == 1) {
                break;
            }
            if (h != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
                if (h == 3) {
                    C0849ca G = AbstractC1807r8.G(AbstractC1473m3.L(interfaceC2235xe));
                    Object obj3 = obj;
                    try {
                        int h2 = h(j82, c0392Pa2, i4, obj3, j2, G, false);
                        try {
                            if (h2 != 0) {
                                if (h2 == 1) {
                                    G.resumeWith(c0782bY);
                                } else if (h2 != 2) {
                                    if (h2 != 4) {
                                        String str = "unexpected";
                                        if (h2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c0392Pa2.a();
                                        C0392Pa c0392Pa3 = (C0392Pa) atomicReferenceFieldUpdater.get(j82);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(j82);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean t2 = j82.t(andIncrement2, false);
                                            int i5 = L8.b;
                                            long j7 = i5;
                                            String str2 = str;
                                            long j9 = j6 / j7;
                                            int i6 = (int) (j6 % j7);
                                            if (c0392Pa3.c != j9) {
                                                C0392Pa b2 = b(j82, j9, c0392Pa3);
                                                if (b2 != null) {
                                                    i2 = i5;
                                                    c0392Pa = b2;
                                                } else {
                                                    if (t2) {
                                                        break;
                                                    }
                                                    str = str2;
                                                }
                                            } else {
                                                c0392Pa = c0392Pa3;
                                                i2 = i5;
                                            }
                                            int h3 = h(j82, c0392Pa, i6, obj3, j6, G, t2);
                                            Object obj4 = obj3;
                                            j8 = j82;
                                            C0392Pa c0392Pa4 = c0392Pa;
                                            obj2 = obj4;
                                            if (h3 == 0) {
                                                c0392Pa4.a();
                                                break;
                                            }
                                            if (h3 == 1) {
                                                break;
                                            }
                                            if (h3 != 2) {
                                                if (h3 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (h3 != 4) {
                                                    if (h3 == 5) {
                                                        c0392Pa4.a();
                                                    }
                                                    c0392Pa3 = c0392Pa4;
                                                    j82 = j8;
                                                    str = str2;
                                                    obj3 = obj2;
                                                } else if (j6 < atomicLongFieldUpdater2.get(j8)) {
                                                    c0392Pa4.a();
                                                }
                                            } else if (t2) {
                                                c0392Pa4.h();
                                            } else {
                                                G.a(c0392Pa4, i6 + i2);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        j8 = j82;
                                        if (j2 < atomicLongFieldUpdater2.get(j8)) {
                                            c0392Pa2.a();
                                        }
                                    }
                                    g(j8, obj2, G);
                                } else {
                                    G.a(c0392Pa2, i4 + i3);
                                }
                                q2 = G.q();
                                if (q2 != enumC0448Re) {
                                    q2 = c0782bY;
                                }
                                if (q2 != enumC0448Re) {
                                    return q2;
                                }
                            } else {
                                c0392Pa2.a();
                            }
                            G.resumeWith(c0782bY);
                            q2 = G.q();
                            if (q2 != enumC0448Re) {
                            }
                            if (q2 != enumC0448Re) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            G.y();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (h == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(j82)) {
                        c0392Pa2.a();
                    }
                    Object y2 = y(obj, interfaceC2235xe);
                    if (y2 == enumC0448Re) {
                        return y2;
                    }
                } else if (h == 5) {
                    c0392Pa2.a();
                }
            } else if (t) {
                c0392Pa2.h();
                Object y3 = y(obj, interfaceC2235xe);
                if (y3 == enumC0448Re) {
                    return y3;
                }
            }
        }
    }

    @Override // o.TL
    public final Object e() {
        C0392Pa c0392Pa;
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (t(j3, true)) {
            return new C0314Ma(o());
        }
        long j4 = j3 & 1152921504606846975L;
        C0340Na c0340Na = C0366Oa.b;
        if (j2 >= j4) {
            return c0340Na;
        }
        Object obj = L8.k;
        C0392Pa c0392Pa2 = (C0392Pa) n.get(this);
        while (!t(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = L8.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (c0392Pa2.c != j6) {
                C0392Pa n2 = n(j6, c0392Pa2);
                if (n2 == null) {
                    continue;
                } else {
                    c0392Pa = n2;
                }
            } else {
                c0392Pa = c0392Pa2;
            }
            Object C = C(c0392Pa, i2, andIncrement, obj);
            C0392Pa c0392Pa3 = c0392Pa;
            if (C == L8.m) {
                C00 c00 = obj instanceof C00 ? (C00) obj : null;
                if (c00 != null) {
                    c00.a(c0392Pa3, i2);
                }
                E(andIncrement);
                c0392Pa3.h();
                return c0340Na;
            }
            if (C != L8.f61o) {
                if (C == L8.n) {
                    throw new IllegalStateException("unexpected");
                }
                c0392Pa3.a();
                return C;
            }
            if (andIncrement < r()) {
                c0392Pa3.a();
            }
            c0392Pa2 = c0392Pa3;
        }
        return new C0314Ma(o());
    }

    @Override // o.LQ
    public Object f(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = t(atomicLongFieldUpdater.get(this), false) ? false : !i(r1 & 1152921504606846975L);
        C0340Na c0340Na = C0366Oa.b;
        if (z2) {
            return c0340Na;
        }
        InterfaceC0531Uj interfaceC0531Uj = L8.j;
        C0392Pa c0392Pa = (C0392Pa) m.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean t = t(andIncrement, z);
            int i2 = L8.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (c0392Pa.c != j5) {
                C0392Pa b = b(this, j5, c0392Pa);
                if (b != null) {
                    c0392Pa = b;
                } else {
                    if (t) {
                        return new C0314Ma(q());
                    }
                    z = false;
                    j2 = 1152921504606846975L;
                }
            }
            int h = h(this, c0392Pa, i3, obj, j3, interfaceC0531Uj, t);
            C0782bY c0782bY = C0782bY.a;
            if (h == 0) {
                c0392Pa.a();
                return c0782bY;
            }
            if (h == 1) {
                return c0782bY;
            }
            if (h == 2) {
                if (t) {
                    c0392Pa.h();
                    return new C0314Ma(q());
                }
                C00 c00 = interfaceC0531Uj instanceof C00 ? (C00) interfaceC0531Uj : null;
                if (c00 != null) {
                    c00.a(c0392Pa, i3 + i2);
                }
                c0392Pa.h();
                return c0340Na;
            }
            if (h == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (h == 4) {
                if (j3 < j.get(this)) {
                    c0392Pa.a();
                }
                return new C0314Ma(q());
            }
            if (h == 5) {
                c0392Pa.a();
            }
            z = false;
            j2 = 1152921504606846975L;
        }
    }

    public final boolean i(long j2) {
        return j2 < k.get(this) || j2 < j.get(this) + ((long) this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(Throwable th, boolean z) {
        J8 j8;
        C0457Rn c0457Rn;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (z) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) == 0) {
                    C0392Pa c0392Pa = L8.a;
                    j8 = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(j8, j6, (j6 & 1152921504606846975L) + (1 << 60)));
            c0457Rn = L8.s;
            while (true) {
                atomicReferenceFieldUpdater = p;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, c0457Rn, th)) {
                    z2 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != c0457Rn) {
                    z2 = false;
                    break;
                }
            }
            if (z) {
                do {
                    j2 = atomicLongFieldUpdater.get(this);
                    int i2 = (int) (j2 >> 60);
                    if (i2 == 0) {
                        j3 = j2 & 1152921504606846975L;
                        j4 = 2;
                    } else {
                        if (i2 != 1) {
                            break;
                        }
                        j3 = j2 & 1152921504606846975L;
                        j4 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(j8, j2, (j4 << 60) + j3));
            } else {
                do {
                    j5 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(j8, j5, (3 << 60) + (j5 & 1152921504606846975L)));
            }
            u();
            if (z2) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = q;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    C0457Rn c0457Rn2 = obj == null ? L8.q : L8.r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0457Rn2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    AbstractC1305jX.i(1, obj);
                    ((InterfaceC2114vp) obj).invoke(o());
                    return z2;
                }
            }
            return z2;
        }
        j8 = this;
        c0457Rn = L8.s;
        while (true) {
            atomicReferenceFieldUpdater = p;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c0457Rn, th)) {
            }
        }
        if (z) {
        }
        u();
        if (z2) {
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (o.C0392Pa) ((o.AbstractC0084Dd) o.AbstractC0084Dd.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0392Pa k(long j2) {
        Object obj;
        long j3;
        Object obj2 = f51o.get(this);
        C0392Pa c0392Pa = (C0392Pa) m.get(this);
        if (c0392Pa.c > ((C0392Pa) obj2).c) {
            obj2 = c0392Pa;
        }
        C0392Pa c0392Pa2 = (C0392Pa) n.get(this);
        if (c0392Pa2.c > ((C0392Pa) obj2).c) {
            obj2 = c0392Pa2;
        }
        AbstractC0084Dd abstractC0084Dd = (AbstractC0084Dd) obj2;
        loop0: while (true) {
            abstractC0084Dd.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0084Dd.a;
            Object obj3 = atomicReferenceFieldUpdater.get(abstractC0084Dd);
            C0457Rn c0457Rn = PX.h;
            obj = null;
            if (obj3 == c0457Rn) {
                break;
            }
            AbstractC0084Dd abstractC0084Dd2 = (AbstractC0084Dd) obj3;
            if (abstractC0084Dd2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0084Dd, null, c0457Rn)) {
                    if (atomicReferenceFieldUpdater.get(abstractC0084Dd) != null) {
                        break;
                    }
                }
                break loop0;
            }
            abstractC0084Dd = abstractC0084Dd2;
        }
        C0392Pa c0392Pa3 = (C0392Pa) abstractC0084Dd;
        if (v()) {
            C0392Pa c0392Pa4 = c0392Pa3;
            loop2: do {
                int i2 = L8.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (c0392Pa4.c * L8.b) + i2;
                    if (j3 < j.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = c0392Pa4.k(i2);
                        if (k2 != null && k2 != L8.e) {
                            if (k2 == L8.d) {
                                break loop2;
                            }
                        } else {
                            if (c0392Pa4.j(k2, i2, L8.l)) {
                                c0392Pa4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (c0392Pa4 != null);
            j3 = -1;
            if (j3 != -1) {
                l(j3);
            }
        }
        loop5: for (C0392Pa c0392Pa5 = c0392Pa3; c0392Pa5 != null; c0392Pa5 = (C0392Pa) ((AbstractC0084Dd) AbstractC0084Dd.b.get(c0392Pa5))) {
            for (int i3 = L8.b - 1; -1 < i3; i3--) {
                if ((c0392Pa5.c * L8.b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = c0392Pa5.k(i3);
                    if (k3 != null && k3 != L8.e) {
                        if (!(k3 instanceof D00)) {
                            if (!(k3 instanceof C00)) {
                                break;
                            }
                            if (c0392Pa5.j(k3, i3, L8.l)) {
                                obj = AbstractC0048Bt.P(obj, k3);
                                c0392Pa5.l(i3, true);
                                break;
                            }
                        } else {
                            if (c0392Pa5.j(k3, i3, L8.l)) {
                                obj = AbstractC0048Bt.P(obj, ((D00) k3).a);
                                c0392Pa5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (c0392Pa5.j(k3, i3, L8.l)) {
                            c0392Pa5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                z((C00) obj, true);
                return c0392Pa3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((C00) arrayList.get(size), true);
            }
        }
        return c0392Pa3;
    }

    public final void l(long j2) {
        C0392Pa c0392Pa = (C0392Pa) n.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.h + j3, k.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = L8.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (c0392Pa.c != j5) {
                    C0392Pa n2 = n(j5, c0392Pa);
                    if (n2 != null) {
                        c0392Pa = n2;
                    }
                }
                C0392Pa c0392Pa2 = c0392Pa;
                if (C(c0392Pa2, i2, j3, null) != L8.f61o) {
                    c0392Pa2.a();
                } else if (j3 < r()) {
                    c0392Pa2.a();
                }
                c0392Pa = c0392Pa2;
            }
        }
    }

    public final void m() {
        Object I;
        if (w()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51o;
        C0392Pa c0392Pa = (C0392Pa) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = k.getAndIncrement(this);
            long j2 = andIncrement / L8.b;
            if (r() <= andIncrement) {
                if (c0392Pa.c < j2 && c0392Pa.b() != null) {
                    x(j2, c0392Pa);
                }
                s(this);
                return;
            }
            if (c0392Pa.c != j2) {
                K8 k8 = K8.j;
                while (true) {
                    I = PX.I(c0392Pa, j2, k8);
                    if (!AbstractC0772bO.s(I)) {
                        AbstractC1760qQ n2 = AbstractC0772bO.n(I);
                        while (true) {
                            AbstractC1760qQ abstractC1760qQ = (AbstractC1760qQ) atomicReferenceFieldUpdater.get(this);
                            if (abstractC1760qQ.c >= n2.c) {
                                break;
                            }
                            if (!n2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC1760qQ, n2)) {
                                if (atomicReferenceFieldUpdater.get(this) != abstractC1760qQ) {
                                    if (n2.e()) {
                                        n2.d();
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
                C0392Pa c0392Pa2 = null;
                if (AbstractC0772bO.s(I)) {
                    u();
                    x(j2, c0392Pa);
                    s(this);
                } else {
                    C0392Pa c0392Pa3 = (C0392Pa) AbstractC0772bO.n(I);
                    long j3 = c0392Pa3.c;
                    if (j3 > j2) {
                        long j4 = j3 * L8.b;
                        if (k.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = l;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            s(this);
                        }
                    } else {
                        c0392Pa2 = c0392Pa3;
                    }
                }
                if (c0392Pa2 == null) {
                    continue;
                } else {
                    c0392Pa = c0392Pa2;
                }
            }
            int i2 = (int) (andIncrement % L8.b);
            Object k2 = c0392Pa.k(i2);
            boolean z = k2 instanceof C00;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !c0392Pa.j(k2, i2, L8.g)) {
                while (true) {
                    Object k3 = c0392Pa.k(i2);
                    if (!(k3 instanceof C00)) {
                        if (k3 != L8.j) {
                            if (k3 != null) {
                                if (k3 == L8.d || k3 == L8.h || k3 == L8.i || k3 == L8.k || k3 == L8.l) {
                                    break loop0;
                                }
                                if (k3 != L8.f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (c0392Pa.j(k3, i2, L8.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (c0392Pa.j(k3, i2, new D00((C00) k3))) {
                            break loop0;
                        }
                    } else if (c0392Pa.j(k3, i2, L8.g)) {
                        if (B(k3)) {
                            c0392Pa.n(i2, L8.d);
                            break;
                        } else {
                            c0392Pa.n(i2, L8.j);
                            c0392Pa.h();
                        }
                    }
                }
            } else if (B(k2)) {
                c0392Pa.n(i2, L8.d);
                break;
            } else {
                c0392Pa.n(i2, L8.j);
                c0392Pa.h();
                s(this);
            }
        }
        s(this);
    }

    public final C0392Pa n(long j2, C0392Pa c0392Pa) {
        Object I;
        long j3;
        C0392Pa c0392Pa2 = L8.a;
        K8 k8 = K8.j;
        loop0: while (true) {
            I = PX.I(c0392Pa, j2, k8);
            if (!AbstractC0772bO.s(I)) {
                AbstractC1760qQ n2 = AbstractC0772bO.n(I);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                    AbstractC1760qQ abstractC1760qQ = (AbstractC1760qQ) atomicReferenceFieldUpdater.get(this);
                    if (abstractC1760qQ.c >= n2.c) {
                        break loop0;
                    }
                    if (!n2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC1760qQ, n2)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC1760qQ) {
                            if (n2.e()) {
                                n2.d();
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
        if (AbstractC0772bO.s(I)) {
            u();
            if (c0392Pa.c * L8.b < r()) {
                c0392Pa.a();
                return null;
            }
        } else {
            C0392Pa c0392Pa3 = (C0392Pa) AbstractC0772bO.n(I);
            long j4 = c0392Pa3.c;
            if (!w() && j2 <= k.get(this) / L8.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f51o;
                    AbstractC1760qQ abstractC1760qQ2 = (AbstractC1760qQ) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC1760qQ2.c >= j4 || !c0392Pa3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC1760qQ2, c0392Pa3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != abstractC1760qQ2) {
                            if (c0392Pa3.e()) {
                                c0392Pa3.d();
                            }
                        }
                    }
                    if (abstractC1760qQ2.e()) {
                        abstractC1760qQ2.d();
                    }
                }
            }
            if (j4 <= j2) {
                return c0392Pa3;
            }
            long j5 = j4 * L8.b;
            do {
                j3 = j.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!j.compareAndSet(this, j3, j5));
            if (j4 * L8.b < r()) {
                c0392Pa3.a();
            }
        }
        return null;
    }

    public final Throwable o() {
        return (Throwable) p.get(this);
    }

    public final Throwable p() {
        Throwable o2 = o();
        return o2 == null ? new C0367Ob("Channel was closed") : o2;
    }

    public final Throwable q() {
        Throwable o2 = o();
        return o2 == null ? new C0393Pb("Channel was closed") : o2;
    }

    public final long r() {
        return i.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (o.C0392Pa) ((o.AbstractC0084Dd) o.AbstractC0084Dd.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            if (i2 == 2) {
                k(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                        C0392Pa c0392Pa = (C0392Pa) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (r() <= j3) {
                            break;
                        }
                        long j4 = L8.b;
                        long j5 = j3 / j4;
                        if (c0392Pa.c != j5 && (c0392Pa = n(j5, c0392Pa)) == null) {
                            if (((C0392Pa) atomicReferenceFieldUpdater.get(this)).c < j5) {
                                break;
                            }
                        } else {
                            c0392Pa.a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object k2 = c0392Pa.k(i3);
                                if (k2 == null || k2 == L8.e) {
                                    if (c0392Pa.j(k2, i3, L8.h)) {
                                        m();
                                        break;
                                    }
                                } else {
                                    if (k2 == L8.d) {
                                        break;
                                    }
                                    if (k2 != L8.j) {
                                        if (k2 != L8.l) {
                                            if (k2 != L8.i) {
                                                if (k2 != L8.h) {
                                                    if (k2 == L8.g) {
                                                        break;
                                                    }
                                                    if (k2 != L8.f && j3 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            j.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(AbstractC2188wx.g(i2, "unexpected close status: ").toString());
                }
                C0392Pa k3 = k(1152921504606846975L & j2);
                Object obj = null;
                loop0: do {
                    int i4 = L8.b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (k3.c * L8.b) + i4;
                        while (true) {
                            Object k4 = k3.k(i4);
                            if (k4 == L8.i) {
                                break loop0;
                            }
                            if (k4 == L8.d) {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (k3.j(k4, i4, L8.l)) {
                                    k3.m(i4, null);
                                    k3.h();
                                    break;
                                }
                            } else if (k4 != L8.e && k4 != null) {
                                if (!(k4 instanceof C00) && !(k4 instanceof D00)) {
                                    C0457Rn c0457Rn = L8.g;
                                    if (k4 == c0457Rn || k4 == L8.f) {
                                        break loop0;
                                    }
                                    if (k4 != c0457Rn) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    C00 c00 = k4 instanceof D00 ? ((D00) k4).a : (C00) k4;
                                    if (k3.j(k4, i4, L8.l)) {
                                        obj = AbstractC0048Bt.P(obj, c00);
                                        k3.m(i4, null);
                                        k3.h();
                                        break;
                                    }
                                }
                            } else if (k3.j(k4, i4, L8.l)) {
                                k3.h();
                                break;
                            }
                        }
                        i4--;
                    }
                } while (k3 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            z((C00) arrayList.get(size), false);
                        }
                    } else {
                        z((C00) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        r16 = r7;
        r3 = (o.C0392Pa) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (i.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.h + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z2 = true;
        List K = AbstractC0868ct.K(n.get(this), m.get(this), f51o.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : K) {
            if (((C0392Pa) obj) != L8.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((C0392Pa) next).c;
            do {
                Object next2 = it.next();
                long j3 = ((C0392Pa) next2).c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        C0392Pa c0392Pa = (C0392Pa) next;
        long j4 = j.get(this);
        long r = r();
        loop2: while (true) {
            int i4 = L8.b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (c0392Pa.c * L8.b) + i5;
                if (j5 >= r && j5 >= j4) {
                    break loop2;
                }
                Object k2 = c0392Pa.k(i5);
                boolean z3 = z2;
                Object obj2 = c0392Pa.f.get(i5 * 2);
                if (k2 instanceof InterfaceC0718aa) {
                    str = (j5 >= j4 || j5 < r) ? (j5 >= r || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof D00) {
                    str = "EB(" + k2 + ')';
                } else if (AbstractC0048Bt.h(k2, L8.f) || AbstractC0048Bt.h(k2, L8.g)) {
                    str = "resuming_sender";
                } else {
                    if (k2 != null && !k2.equals(L8.e) && !k2.equals(L8.i) && !k2.equals(L8.h) && !k2.equals(L8.k) && !k2.equals(L8.j) && !k2.equals(L8.l)) {
                        str = k2.toString();
                    }
                    i5++;
                    z2 = z3;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i5++;
                z2 = z3;
            }
            z2 = z;
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(UT.F(sb)) == ',') {
            AbstractC0048Bt.m(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        return t(i.get(this), false);
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j2 = k.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(long j2, C0392Pa c0392Pa) {
        C0392Pa c0392Pa2;
        C0392Pa c0392Pa3;
        while (c0392Pa.c < j2 && (c0392Pa3 = (C0392Pa) c0392Pa.b()) != null) {
            c0392Pa = c0392Pa3;
        }
        while (true) {
            if (!c0392Pa.c() || (c0392Pa2 = (C0392Pa) c0392Pa.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51o;
                    AbstractC1760qQ abstractC1760qQ = (AbstractC1760qQ) atomicReferenceFieldUpdater.get(this);
                    if (abstractC1760qQ.c >= c0392Pa.c) {
                        return;
                    }
                    if (!c0392Pa.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC1760qQ, c0392Pa)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC1760qQ) {
                            if (c0392Pa.e()) {
                                c0392Pa.d();
                            }
                        }
                    }
                    if (abstractC1760qQ.e()) {
                        abstractC1760qQ.d();
                        return;
                    }
                    return;
                }
            }
            c0392Pa = c0392Pa2;
        }
    }

    public final Object y(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(interfaceC2235xe));
        c0849ca.r();
        c0849ca.resumeWith(AbstractC1494mO.d(q()));
        Object q2 = c0849ca.q();
        return q2 == EnumC0448Re.h ? q2 : C0782bY.a;
    }

    public final void z(C00 c00, boolean z) {
        if (c00 instanceof InterfaceC0718aa) {
            ((InterfaceC2235xe) c00).resumeWith(AbstractC1494mO.d(z ? p() : q()));
            return;
        }
        if (!(c00 instanceof I8)) {
            throw new IllegalStateException(("Unexpected waiter: " + c00).toString());
        }
        I8 i8 = (I8) c00;
        C0849ca c0849ca = i8.i;
        AbstractC0048Bt.k(c0849ca);
        i8.i = null;
        i8.h = L8.l;
        Throwable o2 = i8.j.o();
        if (o2 == null) {
            c0849ca.resumeWith(Boolean.FALSE);
        } else {
            c0849ca.resumeWith(AbstractC1494mO.d(o2));
        }
    }
}
